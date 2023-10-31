import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;

public class ExtendedTodoListApp extends Frame {
    private List todoList;
    private TextField taskInput;
    private Button addButton;
    private Button deleteButton;
    private Button completeButton;
    private ArrayList<Task> tasks = new ArrayList<>();
    private String filename = "todolist.txt";

    public ExtendedTodoListApp() {
        setTitle("To-Do List App");
        setSize(400, 300);
        setLayout(new BorderLayout());

        taskInput = new TextField();
        addButton = new Button("Add Task");
        deleteButton = new Button("Delete Task");
        completeButton = new Button("Complete Task");
        todoList = new List();

        Panel inputPanel = new Panel();
        inputPanel.setLayout(new BorderLayout());
        inputPanel.add(taskInput, BorderLayout.CENTER);
        inputPanel.add(addButton, BorderLayout.EAST);
        inputPanel.add(deleteButton, BorderLayout.WEST);
        inputPanel.add(completeButton, BorderLayout.SOUTH);

        add(inputPanel, BorderLayout.NORTH);
        add(todoList, BorderLayout.CENTER);

        loadTasksFromFile();

        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addTask();
            }
        });

        deleteButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                deleteTask();
            }
        });

        completeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                completeTask();
            }
        });

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                saveTasksToFile();
                System.exit(0);
            }
        });
    }

    private void addTask() {
        String taskDescription = taskInput.getText().trim();
        if (!taskDescription.isEmpty()) {
            Task task = new Task(taskDescription);
            tasks.add(task);
            todoList.add(task.getDescription());
            taskInput.setText("");
        }
    }

    private void deleteTask() {
        int selectedIndex = todoList.getSelectedIndex();
        if (selectedIndex >= 0) {
            tasks.remove(selectedIndex);
            todoList.remove(selectedIndex);
        }
    }

    private void completeTask() {
        int selectedIndex = todoList.getSelectedIndex();
        if (selectedIndex >= 0) {
            Task task = tasks.get(selectedIndex);
            task.setCompleted(true);
            todoList.replaceItem("✓ " + task.getDescription(), selectedIndex);
        }
    }

    private void loadTasksFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                Task task = new Task(line);
                tasks.add(task);
                if (task.isCompleted()) {
                    todoList.add("✓ " + task.getDescription());
                } else {
                    todoList.add(task.getDescription());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void saveTasksToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (Task task : tasks) {
                writer.write(task.getDescription());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ExtendedTodoListApp app = new ExtendedTodoListApp();
        app.setVisible(true);
    }

    private class Task {
        private String description;
        private boolean completed;

        public Task(String description) {
            this.description = description;
            this.completed = false;
        }

        public String getDescription() {
            return description;
        }

        public boolean isCompleted() {
            return completed;
        }

        public void setCompleted(boolean completed) {
            this.completed = completed;
        }
    }
}
