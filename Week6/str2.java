public class str2 {
    public static void main(String[] args) {
        String a = "coding",b="ninjas";
        if(a.contains("ing"))
        {
            a+=b;
        }
        else{
            b+="ing";
        }
        System.out.print(b+a);
    }
}
