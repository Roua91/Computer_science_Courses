class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

class Linklist:
    def __init__(self):
        self.last = None
        self.size = 0

    def is_empty(self):
        return self.last is None

    def get_size(self):
        return self.size

    def insert_at_first(self, val):
        new_node = Node(val)
        if self.is_empty():
            self.last = new_node
            self.last.next = self.last
        else:
            new_node.next = self.last.next
            self.last.next = new_node
        self.size += 1

    def insert_at_last(self, val):
        new_node = Node(val)
        if self.is_empty():
            self.last = new_node
            self.last.next = self.last
        else:
            new_node.next = self.last.next
            self.last.next = new_node
            self.last = new_node
        self.size += 1

    def display_list(self):
        if self.is_empty():
            print("The list is empty.")
            return
        temp = self.last.next
        while True:
            print(temp.data, end=" -> ")
            temp = temp.next
            if temp == self.last.next:
                break
        print("(back to start)")

if __name__ == "__main__":
    import sys

    list = Linklist()

    while True:
        print("\nMenu:")
        print("1. Insert at the Start")
        print("2. Insert at the End")
        print("3. Display List")
        print("4. Get List Size")
        print("5. Exit")
        choice = int(input("Enter your choice: "))

        if choice == 1:
            value1 = int(input("Enter value to insert at the start: "))
            list.insert_at_first(value1)
        elif choice == 2:
            value2 = int(input("Enter value to insert at the end: "))
            list.insert_at_last(value2)
        elif choice == 3:
            print("Current List: ")
            list.display_list()
        elif choice == 4:
            print("List Size: ", list.get_size())
        elif choice == 5:
            print("Exiting")
            sys.exit()
        else:
            print("Invalid choice. Please enter a number between 1 and 5.")
