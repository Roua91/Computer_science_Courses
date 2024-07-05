#Lists

### Introduction to Lists
- Lists are popular data structures used to store data in sequential order.
- Examples include lists of students, available rooms, cities, and books.
- Common operations on lists include:
  1. Retrieving an element.
  2. Inserting a new element.
  3. Deleting an element.
  4. Finding the number of elements.
  5. Checking if an element exists.
  6. Checking if the list is empty.

### Two Ways to Implement Lists
1. **List Implementation Using an Array**
2. **List Implementation Using Linked Nodes**

### List Implementation Using an Array
#### Storage Mechanism
- Uses a contiguous block of memory to store elements.
- Elements are stored in a fixed-size array that can grow dynamically by creating a new array and copying elements when it gets full.

#### Access Time
- Provides constant-time (O(1)) access to elements by index because it directly calculates the memory address of the element.

#### Insertion and Deletion
- **Insertion at End**: Generally fast, O(1) if the array has space. If the array is full, resizing is needed, which takes O(n) time.
- **Insertion at Middle/Beginning**: Slow, O(n), because elements need to be shifted to make space.
- **Deletion**: Slow, O(n), because elements need to be shifted to fill the gap.

#### Resizing
- Needs to resize by creating a new array and copying elements when it becomes full. This operation is costly.

### When to Choose One Over the Other
#### Use ArrayList When:
- **Fast Access by Index**: If you need to frequently access elements by their index (e.g., get(i)), ArrayList provides O(1) access time.
- **Less Frequent Insertions/Deletions**: If your application involves more reads and fewer insertions/deletions, especially at the end of the list, ArrayList is efficient.
- **Known or Fixed Size**: When the number of elements is known in advance or changes infrequently, the initial allocation can be optimized.

#### Use Linked Nodes When:
- **Frequent Insertions/Deletions**: If your application requires frequent insertions and deletions, especially at the beginning or middle of the list, Linked Nodes provides O(1) insertion/deletion.
- **Unknown or Variable Size**: When the number of elements is not known in advance or changes frequently, Linked Nodes can dynamically adjust without the need for resizing.
- **Memory Efficiency for Sparse Operations**: When operations are more about insertion and deletion rather than access, the overhead of extra pointers in Linked Nodes is justified.

### List Implementation Using Linked Nodes
#### Linked List
- A list of items called nodes.
- The order of the nodes is determined by the address, called the link, stored in each node.
- Every node (except the last node) contains the address of the next node.

#### Components of a Node
- **Data**: Stores the relevant information.
- **Link**: Stores the address of the next node.

#### Linked Lists Details
- Each node is dynamically created to hold an element.
- The element part on the node can be either a value of a primitive type or a reference to an object.

#### Example Linked Node Implementation
```java
class Node {
    int info;
    Node link;
}
```

### Traversing a Linked List
- **Search the list for an item**.
- **Insert an item in the list**.
- **Delete an item from the list**.
- **Traversal Tip**: Use another reference variable called `current` to traverse the linked nodes without losing the reference to the head.

### Insertion in a Linked List
#### Basic Insertion
- **Create a new node** and insert it after a specified node `p`:
```java
newNode = new Node();
newNode.info = 50;
newNode.link = p.link;
p.link = newNode;
```
- Sequence matters for insertion to avoid incorrect link setups.

#### Simplified Insertion Using Two Reference Variables
- Example code to insert `newNode` between `p` and `q`:
```java
newNode.link = q;
p.link = newNode;
```
- The order of statements can vary without affecting the outcome.

### Deletion in a Linked List
- **Remove a node** with specific info (e.g., info 34):
```java
p.link = p.link.link;
```
- After removal, the node's memory is reclaimed by the garbage collector:
```java
System.gc();
```

### Building a List
#### Forward Manner
- Insert a new node at the end of the linked list.
- Useful for maintaining a sequence of events or tasks where the order of execution matters.

#### Backward Manner
- Insert a new node at the beginning of the linked list.
- Useful for stack implementation where the most recent item needs to be accessed first.

### Circular Linked Lists
- A linked list in which the last node points to the first node.
- **Use Case**: Round-robin scheduling or continuous data streams where the end of the list connects back to the beginning.

### Doubly Linked Lists
- Every node has a next pointer (forward pointer) and a back pointer (backward pointer).
- Can be traversed in either direction.
- **Use Case**: Applications like a browser's back and forward navigation history.

### Comparison

| Feature                  | List Using Array                                                                                                   | List Using Linked Nodes                                                                                      |
|--------------------------|--------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------|
| **Storage Mechanism**    | Contiguous block of memory; fixed-size array that can grow dynamically by creating a new array and copying elements | Nodes with data and links to next node; dynamically allocated memory                                          |
| **Access Time**          | Constant-time (O(1)) access to elements by index                                                                   | Linear-time (O(n)) access to elements by traversal                                                            |
| **Insertion at End**     | Generally fast, O(1) if space available; O(n) if resizing is needed                                                 | O(1) insertion if pointer to end is maintained                                                                |
| **Insertion at Middle**  | Slow, O(n), due to element shifting                                                                                | O(1) insertion by adjusting pointers                                                                          |
| **Deletion**             | Slow, O(n), due to element shifting                                                                                | O(1) deletion by adjusting pointers                                                                          |
| **Resizing**             | Costly; requires creating new array and copying elements                                                           | Not needed; dynamic size                                                                                      |
| **Frequent Access**      | Efficient, O(1)                                                                                                    | Less efficient, O(n)                                                                                          |
| **Frequent Insertions/Deletions** | Less efficient, O(n)                                                                                      | Efficient, O(1) for beginning or middle; O(1) or O(n) for end, depending on implementation                    |
| **Memory Usage**         | More efficient (no overhead for pointers); may have wasted space                                                   | Less efficient due to pointer overhead; no wasted space                                                       |
| **Use Cases**            | Known size or minimal changes; frequent access by index                                                            | Unknown or variable size; frequent insertions/deletions; dynamically changing size                           |
| **Advantages**           | Fast access by index; efficient for static or infrequently changing data                                           | Dynamic size; efficient insertions/deletions; good for data with frequent changes                             |
| **Disadvantages**        | Costly resizing; slow insertions/deletions at beginning/middle                                                     | Linear access time; pointer overhead; less memory efficient for large lists with infrequent changes           |

### Insertion Comparison
- **Array**: Inserting an element requires every following element to shift down: O(n).
- **Singly Linked Nodes**: Insertion requires updating at most two nodes regardless of size: O(n).

### Summary
- Lists using nodes are dynamic and suitable for many operations that would cause an entire array to be shifted, such as adding/removing from the middle or front of the list.
- **Feature Comparison**:
  - **List Using Array**: Fixed size or requires resizing, more memory efficient, frequent access by index, known size or minimal changes.
  - **List Using Linked Nodes**: Dynamically sized, less memory efficient due to pointer overhead, frequent insertions/deletions, dynamically changing size.
