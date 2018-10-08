
public class TestDataStruc
{
    public static void main(String[] args)
    { 
        LinkedList x = new LinkedList();
        
        x.addFirst("One");
        x.addFirst("Two");
        x.addFirst("Three");
        
        ListIterator iter = x.listIterator();
        while(iter.hasNext())
        {System.out.println(iter.next());}
        
        x.reverse();
        
        
        ListIterator iter2 = x.listIterator();
        while(iter2.hasNext())
        {System.out.println(iter2.next());}
        
        System.out.println(x.size());
        
        
    }

}
