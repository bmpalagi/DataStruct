
public class StackDemo
{
   public static void main(String[] args)
   {
       LinkedListStack s = new LinkedListStack();
       
       s.push("Sup");
       s.push("Hey");
       s.push("Hello");
       
       while (!s.isEmpty())
       {
           System.out.println(s.pop());
        }
    }

}
