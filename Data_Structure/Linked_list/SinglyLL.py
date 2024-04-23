class Node:
    def __init__(self, data=0, next_node=None):
        self.data = data
        self.next = next_node

class LinkedList:
    def __init__(self):
        self.start = None
        self.size = 0

    def isEmpty(self):
        return self.start is None

    def getListSize(self):
        return self.size

    def viewList(self):
        if self.isEmpty():
            print("Empty List")
            return
        current = self.start
        while current:
            print(f"{current.data} |___|-->", end="")
            current = current.next
        print("null")

    def insertAtFirst(self, val):
        newNode = Node(val, self.start)
        self.start = newNode
        self.size += 1

    def insertAtLast(self, val):
        newNode = Node(val)
        if self.isEmpty():
            self.start = newNode
        else:
            current = self.start
            while current.next:
                current = current.next
            current.next = newNode
        self.size += 1

    def insertAtPos(self, val, pos):
        if pos < 1 or pos > self.size + 1:
            print("Insertion is not possible")
            return
        if pos == 1:
            self.insertAtFirst(val)
            return
        newNode = Node(val)
        current = self.start
        for _ in range(1, pos-1):
            current = current.next
        newNode.next = current.next
        current.next = newNode
        self.size += 1

    def updateData(self, val, pos):
        if self.isEmpty() or pos < 1 or pos > self.size:
            print("Updation is not possible")
            return
        current = self.start
        for _ in range(1, pos):
            current = current.next
        current.data = val

    def deleteFirst(self):
        if self.isEmpty():
            print("List is empty")
            return
        self.start = self.start.next
        self.size -= 1

    def deleteLast(self):
        if self.isEmpty():
            print("List is empty")
            return
        if self.start.next is None:
            self.start = None
        else:
            current = self.start
            while current.next.next:
                current = current.next
            current.next = None
        self.size -= 1

    def deleteAtPos(self, pos):
        if self.isEmpty() or pos < 1 or pos > self.size:
            print("Deletion not possible")
            return
        if pos == 1:
            self.deleteFirst()
            return
        current = self.start
        for _ in range(1, pos-1):
            current = current.next
        current.next = current.next.next
        self.size -= 1

    def reverseList(self):
        previous = None
        current = self.start
        while current:
            next_node = current.next
            current.next = previous
            previous = current
            current = next_node
        self.start = previous


def main():
    linked_list = LinkedList()
    while True:
        print("\n1. Add item to the list at start")
        print("2. Add item to the list at last")
        print("3. Add item to the list at position")
        print("4. Delete first node")
        print("5. Delete last node")
        print("6. Delete node at position")
        print("7. Update node at position")
        print("8. Reverse link list")
        print("9. View list")
        print("10. Get List size")
        print("11. Exit")

        choice = int(input("\nEnter your choice: "))

        if choice == 1:
            value = int(input("Enter value: "))
            linked_list.insertAtFirst(value)
        elif choice == 2:
            value = int(input("Enter value: "))
            linked_list.insertAtLast(value)
        elif choice == 3:
            value = int(input("Enter value: "))
            position = int(input("Enter position: "))
            linked_list.insertAtPos(value, position)
        elif choice == 4:
            linked_list.deleteFirst()
        elif choice == 5:
            linked_list.deleteLast()
        elif choice == 6:
            position = int(input("Enter position: "))
            linked_list.deleteAtPos(position)
        elif choice == 7:
            value = int(input("Enter value: "))
            position = int(input("Enter position: "))
            linked_list.updateData(value, position)
        elif choice == 8:
            linked_list.reverseList()
        elif choice == 9:
            linked_list.viewList()
        elif choice == 10:
            print(f"List size: {linked_list.getListSize()}")
        elif choice == 11:
            break
        else:
            print("Invalid choice.")

if __name__ == "__main__":
    main()
