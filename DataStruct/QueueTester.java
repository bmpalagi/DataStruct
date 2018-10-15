
public class QueueTester
{
    public static void main(String[] args)
    {
        LinkedListQueue q = new LinkedListQueue();
        q.add("Tom");
        q.add("Diana");
        q.add("Harry");
        
        q.lastToFirst();
        q.add("Bob the builder");
        
        while (!q.empty())
        {
            System.out.print(q.remove() + " ");
        }
        System.out.println();
        System.out.println("Expected: Harry Tom Diana Bob the builder");
    }
}