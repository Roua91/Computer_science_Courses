### Theoretical Questions

1. **Define a Stack and explain its principle of operation.**
   - Answer: A stack is a linear data structure that follows the Last In First Out (LIFO) principle, where the last element added to the stack is the first one to be removed.

2. **What are the primary operations of a stack? Explain each operation briefly.**
   - Answer: The primary operations of a stack are:
     - **Push**: Adds an item to the top of the stack.
     - **Pop**: Removes the item from the top of the stack.
     - **Peek/Top**: Returns the item at the top of the stack without removing it.
     - **IsEmpty**: Checks if the stack is empty.
     - **IsFull**: Checks if the stack is full (applicable in array-based implementation).

3. **Differentiate between stack implementation using arrays and linked lists.**
   - Answer: 
     - **Array-based stack**: Uses a contiguous block of memory, has fixed size, faster access time but requires resizing.
     - **Linked list-based stack**: Uses nodes with dynamic memory allocation, no need to specify initial size, allows efficient insertions and deletions, but slightly more complex due to pointer management.

4. **Describe the conditions of stack overflow and underflow.**
   - Answer: 
     - **Stack Overflow**: Occurs when trying to push an element onto a full stack.
     - **Stack Underflow**: Occurs when trying to pop an element from an empty stack.

5. **What is the use of a stack pointer in a stack data structure?**
   - Answer: A stack pointer is used to keep track of the top element of the stack, pointing to the most recently added element.

### Practical Questions

6. **Write a function to implement the push operation in a stack using an array.**
   ```java
   public void push(int val) {
       if (isFull()) {
           System.out.println("Stack Overflow");
       } else {
           top++;
           arr[top] = val;
       }
   }
   ```

7. **Write a function to implement the pop operation in a stack using a linked list.**
   ```java
   public int pop() {
       if (isEmpty()) {
           System.out.println("Stack Underflow");
           return -1;
       } else {
           int popValue = top.data;
           top = top.next;
           size--;
           return popValue;
       }
   }
   ```

8. **Explain how a stack can be used to check for balanced parentheses in an expression.**
   - Answer: A stack can be used to check for balanced parentheses by:
     - Pushing each opening parenthesis onto the stack.
     - Popping the stack for each closing parenthesis and checking if it matches the corresponding opening parenthesis.
     - Ensuring the stack is empty at the end of the expression to confirm all parentheses are balanced.

9. **Describe a real-life application of the stack data structure and how it works.**
   - Answer: One real-life application of a stack is the **Undo** functionality in text editors:
     - Each action performed is pushed onto a stack.
     - When the undo command is executed, the most recent action is popped from the stack and reversed.

10. **Given a stack implemented using a linked list, write a function to display all elements in the stack.**
    ```java
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
        } else {
            Node current = top;
            while (current != null) {
                System.out.println(current.data);
                current = current.next;
            }
        }
    }
    ```

### Problem-Solving Questions

11. **How would you implement a stack to support a `min()` function that returns the minimum element in the stack in constant time?**
    - Answer: Implement a supporting stack that keeps track of the minimum values. Every time a new element is pushed, compare it with the current minimum and push the smaller value onto the supporting stack. The `min()` function simply returns the top of the supporting stack.

12. **Explain the concept of a call stack and its importance in function calls and recursion.**
    - Answer: The call stack keeps track of function calls and the order in which they need to be executed. It is crucial for managing function calls, especially in recursion, ensuring that each function returns control to the correct location.

13. **Write an algorithm to sort a stack using only push and pop operations.**
    - Answer: One approach is to use an auxiliary stack:
      1. While the input stack is not empty, pop an element from it and hold it in a variable.
      2. While the auxiliary stack is not empty and the top of the auxiliary stack is greater than the held element, pop from the auxiliary stack and push onto the input stack.
      3. Push the held element onto the auxiliary stack.
      4. Repeat until the input stack is empty, then transfer the elements back to the input stack.

14. **Describe how a stack can be used to evaluate a postfix expression.**
    - Answer: To evaluate a postfix expression:
      1. Traverse the expression from left to right.
      2. When encountering an operand, push it onto the stack.
      3. When encountering an operator, pop the required number of operands from the stack, apply the operator, and push the result back onto the stack.
      4. The final result will be at the top of the stack after processing the entire expression.
