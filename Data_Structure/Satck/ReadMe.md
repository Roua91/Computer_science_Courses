# Stack Data Structure
#### Introduction to Stack
- **Definition**: A stack is an ordered list with the restriction that elements are added or deleted from only one end, termed the top of the stack. The other end, which remains inactive, is called the bottom of the stack.
- **Principle**: Stacks operate on a Last In First Out (LIFO) basis. Elements that are added last are the first to be removed.

#### Stack Implementation Using Array
- **Linear Data Structure**: A stack is a linear data structure where elements are stored in a contiguous block of memory. Each element is adjacent to its previous and next element, making traversal straightforward.
- **Operations**:
  - **Push**: Adds an item to the stack. If the stack is full, it results in an overflow condition.
  - **Pop**: Removes an item from the stack. The items are removed in the reverse order of their addition. If the stack is empty, it results in an underflow condition.
  - **Peek/Top**: Returns the top element without removing it.
  - **IsEmpty**: Checks if the stack is empty.
  - **Display**: Shows all elements in the stack.

- **Implementation**:
  - **Array-based**: Uses an array to store stack elements.
  - **Required Components**:
    - **Top Pointer**: Points to the top element of the stack.
    - **Array**: Stores the stack elements.
    - **Size Variable**: Keeps track of the size of the array.

#### Stack Implementation Using Linked Nodes
- **Node**: A basic data structure that contains a value and a pointer to the next node.
- **Singly Linked List**: Each node points to the next node. The head of the list represents the top of the stack.

- **Operations**:
  - **Push**: Adds a new node at the head of the linked list.
    - If the list is empty, the new node becomes the head.
    - If the list is not empty, the new node points to the current head, and then becomes the new head.
  - **Pop**: Removes the head node of the linked list.
    - If the list is empty, return NULL.
    - If there is only one node, remove the head and return NULL.
    - Otherwise, make the second node the new head and free the memory of the removed node.
  - **Peek**: Accesses the value of the top node without removing it.
  - **Display**: Traverses and displays all nodes in the stack.

- **Advantages of Linked List over Arrays**:
  - Dynamic resizing: Linked lists can grow and shrink in size as elements are added or removed.
  - Efficient insertions and deletions: Adding or removing elements is more efficient as it only involves pointer adjustments.
  - Memory utilization: Allocates memory as needed, leading to better utilization when the number of elements is not known in advance.

#### Applications of Stack
- **Undo Function in Text Editors**: Actions are pushed onto a stack. Pressing "undo" pops the most recent action off the stack and reverses it.
- **Browser Back Button**: Visited pages are pushed onto a stack. Pressing the back button pops the current page off the stack and displays the previous page.
- **Call Stack in Programming**: Functions are added to the call stack when called and removed when they complete, returning control to the calling function.

#### Summary
- Stacks are essential data structures used in various applications where LIFO order is required.
- They can be implemented using arrays or linked lists, each with its advantages and specific use cases.
- Understanding stacks and their operations is fundamental for efficient programming and problem-solving in computer science.
