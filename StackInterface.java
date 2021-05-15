
public interface StackInterface {

    public void Stack();//Creates empty card stack

    public void Push(); //Inserts element into the top of the stack

    public void Pop(); //Removes element from the top of the stack

    public int Size(); //Returns size of the number of elements in the stack

    public Card Peek(); //Returns the top element of the stack but doesn't remove it

    public boolean Empty(); //Return 1 if stack is empty 0 is its not
}