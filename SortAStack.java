
// GeeksForGeeks: https://www.geeksforgeeks.org/sort-a-stack/


import java.util.Stack;

public class SortAStack {
    public Stack<Integer> sort(Stack<Integer> s)
    {
        Stack<Integer> tempStack = new Stack<>();

        while (!s.isEmpty()) {
            int currentElement = s.pop();
            while (!tempStack.isEmpty() && tempStack.peek() > currentElement) {
                s.push(tempStack.pop());
            }
            tempStack.push(currentElement);
        }

        return tempStack;
    }
}
