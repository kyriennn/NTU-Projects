class Node:
    def __init__(self, data):
        self.data = data
        self.next = None
class Queue:
    def __init__(self):
        self.front = None
        self.rear = None
        self.size = 0

    def isEmpty(self):
        return self.front is None

    def enqueue(self, data):
        newNode = Node(data)
        if self.isEmpty():
            self.front = newNode
        else:
            self.rear.next = newNode
        self.rear = newNode
        self.size += 1
    
    def dequeue(self):
        if self.front is None:
            raise IndexError("Queue is Empty")
        poppedNode = self.front.data
        self.front = self.front.next
        self.size -= 1
        return poppedNode

    def display(self):
        current = self.front
        while current:
            print(current.data, end = "->")
            current = current.next
        print("None")

class Stack:
    def __init__(self):
        self.top = None
        self.size = 0

    def isEmpty(self):
        return self.top is None

    def pop(self):
        if self.isEmpty():
            raise IndexError("Stack is Empty")
        poppedNode = self.top.data
        self.top = self.top.next
        self.size -=1
        return poppedNode

    def push(self, data):
        newNode = Node(data)
        newNode.next = self.top
        self.top = newNode
        self.size += 1
    
    def display(self):
        current = self.top
        while current:
            print(current.data, end = "->")
            current = current.next
        print("None")





    
