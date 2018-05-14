class Node:
    def __init__(self):
        self.data = None
        self.next = None
     
    def setData(self,data):
        self.data = data
      
    def getData(self):
        return self.data
     
    def setNext(self,next):
        self.next = next
     
    def getNext(self):
        return self.next
    
    def __str__(self):
        return " Data in Node is %s, " % (self.data)

class SinglyLinkedList:
    #constructor
    def __init__(self):
        self.head = None
        
    #method for setting the head of the Linked List
    def setHead(self,head):
        self.head = head
                      
    def reverse(self):
        last =  None   # Temp variable for reverseing through linked list 
        current = self.head
        
        while ( current != None):
            next = current.getNext()
            current.setNext(last)
            last = current
            current = next   # Three variables are needed
            
        self.head = last 