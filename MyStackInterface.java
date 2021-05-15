public interface MyStackInterface<T> {

    /**
     * Push objects into MyStack. PreCondition: Called when programmer wants to add
     * an item to the stack. PostCondition: N/A
     * 
     * @param e - object to push to start of stack.
     */
    public void push(Object e);

    /**
     * Delete the object on top and return it. PreCondition: Called when programmer
     * wants to remove and return top item. PostCondition: N/A
     * 
     * @return Item on top of stack.
     */
    public T pop();

    /**
     * Returns the item on top of the stack. PreCondition: Called when programmer
     * wants to return top item. PostCondition: N/A
     * 
     * @return Item on top of stack.
     */
    public T top();

    /**
     * Returns whether the stack is empty or not. PreCondition: Called when
     * programmer needs to know if the stack is empty. PostCondition: N/A
     * 
     * @return Boolean indicating if empty or not
     */
    public boolean isEmpty();
}
