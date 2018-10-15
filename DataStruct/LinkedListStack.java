import java.util.NoSuchElementException;

/**
   An implementation of a stack as a sequence of nodes.
*/
public class LinkedListStack
{
   private Node first;

   /**
      Constructs an empty stack.
   */
   public LinkedListStack()
   {
      first = null;
   }

   /**
      Adds an element to the top of the stack.
      @param element the element to add
   */
   public void push (Object element)
   {
       Node temp = new Node();
       temp.data = element;
       temp.next = first; //don't lose that first reference
       first = temp;
    }

   /**
      Removes the element from the top of the stack.
      @return the removed element
   */
   public Object pop()
   {
       if(isEmpty()){throw new NoSuchElementException();}
       Object returnObj = first.data;
       first = first.next;
       return returnObj; 
    }
   
   public boolean isEmpty()
   {
       return (first == null);
    }
    
   /**
      Checks whether this stack is empty.
      @return true if the stack is empty
   */
   class Node
   {
      public Object data;
      public Node next;
   }
}
