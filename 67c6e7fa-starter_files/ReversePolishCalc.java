
public class ReversePolishCalc {

    // You'll need a variable here to keep track of the top of the stack
    List<double> stackTop = new ArrayList<double>();

    // The array of the input string split up
    private String[] tokens;


    // The stack
    private String[] stack;

    public double calculate(String input) {

        // 1. Use the String split method to split the string into tokens at the commas
        tokens = string.split(',');


        // 2. Allocate a stack as big as the number of tokens
        stack = tokens.length;

        // 3. write the algorithm
        for(int i = 0; i < tokens.length; ++i) {
            // calls to push() and pop() and do the math here
            while(!stack.empty() && (stack.peek() == '+' || stack.peek() == '-' || stack.peek() == '*' || stack.peek() =='/')) {
                out.append(' ');
                out.append(stack.pop());
            }
            out.append(' ');
            stack.push(tokens[i]);
        }

        // 4. return the result
        return pop();
    }

    private void push(String number) {
        // push on the stack
    }

    private void push(double d) {
        // change the double to a string and then push it on the stack
    }

    private double pop() {
        // remove the string from the top of the stack and convert it to a double and return it
    }
}
