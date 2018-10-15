//Brad Palagi

/**
   Add a method firstToLast to this implementation of a queue.
   The method moves the element at the head of the queue to
   the tail of the queue. The element that was second in line
   will now be at the head.
*/
public class LinkedListQueue
{
   
    class Node
   {
      public Object data;
      public Node next;
   }
   private Node head;
   private Node tail;

   /**
      Constructs an empty queue.
   */
   public LinkedListQueue()
   {
      head = null;
      tail = null;
   }

   /**
      Moves the head of the queue to the tail.
   */
   public void firstToLast()
   {
       tail.next = head;
       tail = head;
       head = head.next;
       tail.next = null;
       
   }

   /**
      Checks whether this queue is empty.
      @return true if this queue is empty
   */
   public boolean empty()
   {
      return head == null;
   }

   /**
      Adds an element to the tail of this queue.
      @param newElement the element to add
   */
   public void add(Object newElement)
   {
       if (tail == null) //head must also be null
       {
           Node newNode = new Node();
           newNode.data = newElement; //set to passed in data
           newNode.next = null;
           head = newNode; //only do this because the linkedlist was previously empty
           tail = newNode; 
           
        }
       else
       {
           Node newNode = new Node();
           newNode.data = newElement; //set to passed in data
           newNode.next = null;
           
           tail.next = newNode; //current tail points to what will be the new tail
           tail = newNode;
        }

   }

   /**
      Removes an element from the head of this queue.
      @return the removed element
   */
   public Object remove()
   {
       if (head == null)
        {return null;}
       Object returnOb = head.data;
       head = head.next;//moves head towards tail
       
       if (head == null) //queue is empty
       {
           tail = null;
        }
       
       return returnOb;
   }
}
