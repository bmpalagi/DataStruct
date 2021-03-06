//Brad Palagi
//Linked List

import java.util.*;

public class LinkedList
{

    private Node first;
    public int currentSize;
    
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
        currentSize = 0;
    }
    
    /* 16.1
    * Add methods Object get(int n) and void set(int n, Object newElement) to the LinkedList class
    * Use a helper method that starts at first and follows n links
    * private static Node getNode(int n)
    */
    public Object get(int n)
    {
        return getNode(n).data; //use helper method to get the Node at spot n, return its data
    }
    public void set(int n, Object newElement)
    {
        Node newNode = new Node(); //make a new node for the new element
        newNode.next = getNode(n); //set the next of the new node to the element currently at position n
        newNode.data = newElement; //put in the data to the node
        getNode(n-1).next = newNode; //make the previous node point to the new node
    }
    
    private Node getNode(int n) //helper method to get the n node in the linked list
    {
        Node nodeN = first;
        
        for (int i = 1; i<n; i++)
        {
            nodeN = nodeN.next;
        }
        
        return nodeN;        
    }
        
    /*
     * 16.4
     * Add a method boolean contains(Object obj) that checks whether our LinkedList implementation contains
     * a given object. Implement this method by directly traversing the links, not by using an iterator.
     */
    
    public boolean contains(Object obj)
    {
        Node node = first; //start at first
        
        while (node != null) // go through the list
        {
            if (node.data.equals(obj)) //if equal return true
                return true;
            
            node = node.next;
        }
        
        return false;
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
        currentSize++;
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
        currentSize--;
        return returnObj;        
    }
    
    public ListIterator listIterator()
    {
        return new LinkedListIterator();
        
    }
    
    public void reverse()
    {
        /*LinkedList rev = new LinkedList();
        Node current = first;
        
        while(current != null)
        {
            current = current.next;
            rev.addFirst(this.removeFirst());
        }
        first = rev.first;*/
        
        if (first == null){return;}
        
        Node next;
        Node previous = first;
        Node current = first.next;
        first.next = null;
        while(current != null)
        {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        first = previous;
    }
    
    public int size()
    {
        /*int size = 0;
        if (first == null){return size;}
        Node current = first;
        while (current != null)
        {
            current = current.next;
            size++;
        }

        return size;*/
        return currentSize;
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
        
        /**
         * Adds an element before the iterator position then moves past the inserted element
         * @param element to add
         */
        public void add(Object element)
        {
            if (position == null)
            {
                addFirst(element);
                position = first;
            }
            else
            {
                Node newNode = new Node();
                newNode.data = element;
                newNode.next = position.next;
                position.next = newNode;
                position = newNode;
            }
            
            isAfterNext = false;
            currentSize++;
        }
       
        /**
         * Removes the last traversed element. This method may only be called after a call to the next method
         */
        public void remove()
        {
            if (!isAfterNext){throw new IllegalStateException();}
            
            if (position == first)
            {
                removeFirst();
            }
            else
            {
                previous.next = position.next;
                
            }
            position = previous;
            isAfterNext = false;
            currentSize--;
        }
        
        }
    
}