//Brad Palagi

import java.util.NoSuchElementException;

public class LinkedList
{

    private Node first;
    
    class Node
    {
        // Old School
        // Any object into and out of our LinkedList
        // Cast to type the object as we remove it
        public Object data;
        public Node next;
        
    }
    
    /**
     * Default constructor for objects of class LinkedList
     */
    public LinkedList()
    {
        first = null;
        
    }
    
    /**
     * Adds an element to the front of the LL
     *@param element the element to add
     */
    public void addFirst(Object element)
    {
        Node newNode = new Node();
        newNode.data = element;//points to object
        newNode.next = first;
        first = newNode;
        
    }
    
    /**
     * Returns the first element in the LL
     * @return the first element in the LL
     */
    public Object getFirst()
    {
        if(first == null){throw new NoSuchElementException();}
        return first.data;
        
    }
    
    /**
     * Removes the first element in the LL
     * @return the removed element
     */
    public Object removeFirst()
    {
        if(first == null){throw new NoSuchElementException();}
        Object returnObj = first.data;
        first = first.next;
        return returnObj;
        
    }
    
    public ListIterator listIterator()
    {
        return new LinkedListIterator();
        
    }
    
    class LinkedListIterator implements ListIterator
    {
        private Node position;
        private Node previous; //remove
        private boolean isAfterNext;
        
        public LinkedListIterator()
        {
            position = null;
            previous = null;
            isAfterNext = false;
            
        }
        
        public Object next()
        {
            if (!hasNext()){throw new NoSuchElementException();}
            previous = position; //so i can remove item
            isAfterNext = true;
            
            if(position == null)
            {
                position = first; // just addresses/refereneces to Objects
            }
            else
            {
                position = position.next;
            }
            
            return position.data;
            
        }
        
        /**
        * Checks if there is an element after the iterator position
        * @return true if there is an element after the iterator position
        */
        public boolean hasNext()
        {
            if (position == null)
            {
                return first != null;
            }
            else
            {
                return position.next != null;
            }
        }
        
    }
    
}