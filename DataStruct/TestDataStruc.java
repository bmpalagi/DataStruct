
public class TestDataStruc
{
    public static void main(String[] args)
    { 
        LinkedList x = new LinkedList();
        
        x.addFirst("One");
        x.addFirst("Two");
        x.addFirst("Three");
        /*
        ListIterator iter = x.listIterator();
        while(iter.hasNext())
        {System.out.println(iter.next());}
        
        x.reverse();
        
        
        ListIterator iter2 = x.listIterator();
        while(iter2.hasNext())
        {System.out.println(iter2.next());}
        */
        System.out.println(x.size());
        
        
    }
    
    /**
     * for 16.2 the order changes it so the node points to itself and can never go to the next element
     * 
     * you change the references in the node so you can never access first again
     * 
     * String hi = "Tom";
     * lister.addFirst(hi);
     * lister.addFirst("Bob")
     * lister.removeFirst();
     * tester.equals(list.getFirst())
     */
    
    /**
     * for 16.3, when the iterator is at the end of the linked list it
     * would return true, since position isn't null, but it
     * doesn't have anything after it, so while it should be
     * false it returns true
     * 
     * LinkedList test = new LinkedList();
     * test.addFirst("HI");
     * ListIterator iter = test.listIterator();
     * iter.hasNext();
     * since the current position is null hasNext returns false but there is another element
     */
    
}
