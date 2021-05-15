import java.util.LinkedList;
// MyStack.java - Daniel Suazo - 15 May 2021
// last modified: Daniel Suazo - 15 May 2021
// Implementation of a playing card.  Uses classes Rank and Suit for
// expressing the card value.


public class MyStack<T> implements MyStackInterface<T> {
    protected LinkedList<Object> stack;

    public MyStack() {
        stack = new LinkedList<Object>();
    }

    public void push(Object e) {
        stack.add(e);
    }

    public T pop() {
        if (stack.isEmpty()) {
            throw new Error("Stack is empty");
        }

        T tmp = (T) stack.removeLast();
        return tmp;
    }

    public T top() {
        return (T) stack.getLast();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public String toString() {
        return stack.toString();
    }
}
