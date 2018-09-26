
public interface ListIterator
{
    /**
     * Moves the iterator past the next element
     * @return the traversed element
     */
    Object next();
    
    /**
     * Checks if there is an element after the iterator position
     * @return true if there is an element after the iterator position
     */
    boolean hasNext();
}
