
package MIDTERM;


public class StackArray {
  
    
    private int[] stack;
    private int top;
    private int capacity;
    
    //Constructor
    
    public StackArray(int capacity) {
        this.capacity = capacity;
        this.stack = new int[capacity];
        this.top = -1;
    }
    
    public static void main(String[] args) {
        StackArray stack = new StackArray(5);
        
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        
        System.out.println();
        
        stack.display();
        
        System.out.println();
        
        System.out.println("Top Element: " + stack.peek());
        
        System.out.println();
        
        System.out.println("Removed: " + stack.pop());
        
        System.out.println();
        
        System.out.println("Top Element: " + stack.peek());
        
        System.out.println();
        
        stack.display();
        
    }
}
