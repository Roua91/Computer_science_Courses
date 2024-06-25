# Data Structure Summary
| Data Structure | Access Time | Search Time | Insertion Time | Deletion Time | Space Complexity | Typical Use Cases | Advantages | Disadvantages |
|----------------|-------------|-------------|----------------|---------------|------------------|-------------------|------------|--------------|
| **Array**      | O(1)        | O(n)        | O(n)           | O(n)          | O(n)             | Static data, Random access | Fast access if index is known | Fixed size, Slow insert/delete |
| **Linked List**| O(n)        | O(n)        | O(1)           | O(1)          | O(n)             | Dynamic data, Easy insert/delete | Dynamic size, Efficient insert/delete | Slow access, More memory usage (pointers) |
| **Stack**      | O(n)        | O(n)        | O(1)           | O(1)          | O(n)             | Function call management, Undo mechanisms | Simple implementation | Limited functionality |
| **Queue**      | O(n)        | O(n)        | O(1)           | O(1)          | O(n)             | Order processing, BFS | Simple implementation | Limited functionality |
| **Hash Table** | O(1)        | O(1)        | O(1)           | O(1)          | O(n)             | Fast lookups, Key-value storage | Fast lookups, Average O(1) operations | Potential for collisions, Requires good hash function |
| **Binary Tree**| O(log n)    | O(log n)    | O(log n)       | O(log n)      | O(n)             | Hierarchical data, Search operations | Balanced operations | Can become unbalanced, Poor worst-case |
| **Binary Search Tree**| O(log n) | O(log n) | O(log n)     | O(log n)      | O(n)             | Sorted data, Dynamic datasets | Efficient search, insert, delete | Can become unbalanced |
| **AVL Tree**   | O(log n)    | O(log n)    | O(log n)       | O(log n)      | O(n)             | Balanced tree operations, Databases | Always balanced, Efficient operations | Complex implementation |
| **Red-Black Tree**| O(log n) | O(log n)    | O(log n)       | O(log n)      | O(n)             | Balanced tree operations, Associative arrays | Balanced operations | Complex implementation |
| **Heap**       | O(n)        | O(n)        | O(log n)       | O(log n)      | O(n)             | Priority queues, Order statistics | Efficient priority operations | No efficient search |
| **Graph**      | O(V+E)      | O(V+E)      | O(V+E)         | O(V+E)        | O(V+E)           | Network connections, Pathfinding | Versatile, Represents complex relationships | Complex algorithms, Memory intensive |
| **Trie**       | O(m)        | O(m)        | O(m)           | O(m)          | O(n)             | Prefix searches, Auto-completion | Fast search, insertion, deletion | Large memory usage |
| **Bloom Filter**| O(1)       | O(1)        | O(1)           | N/A           | O(n)             | Probabilistic set membership | Space-efficient, Fast | False positives, No deletions |
