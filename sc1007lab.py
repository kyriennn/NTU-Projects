class Node:
    def __init__(self, data):
        self.data = data
        self.next = None
class Stack:
    def __init__(self):
        self.top = None
        self.size = 0

    def append(self, data):
        newNode = Node(data)
        if not self.top:
            self.head = newNode
            self.size +=1
            return
        else:
            newNode.next = self.top.next
            self.top = newNode

    
            
        



