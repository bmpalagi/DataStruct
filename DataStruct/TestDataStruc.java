
public class TestDataStruc
{
    public static void main(String[] args)
    { 
        LinkedList x = new LinkedList();
        String word = "Hi";
        String word2;
        x.addFirst(word);
        x.addFirst(new String("Two"));
        x.addFirst("sup");
        
        //Old School
        
        //word2 = x.getFirst(); // getFirst() returns an Object
        
        word2 = (String)x.getFirst(); //must cast the object
        
        System.out.println(word2);
        
    }

}
