
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
                      
    #method for inserting a new node at the end of a Linked List   
    def insertAtEnd(self,data):
        newNode = Node()
        newNode.setData(data)
        if self.head == None:
            self.head = newNode
            
        else:
            current = self.head
            while current.getNext() != None:
                current = current.getNext()
            current.setNext(newNode)
            
    def __str__(self):
        str =''
        current = self.head
        str += current.__str__()
        while current.getNext() != None: 
            current = current.getNext()
            str += current.__str__()
        return str
        #return "From str method of Test: a is %s . " % (self.head)
    
if __name__ == '__main__':
    sl = SinglyLinkedList()
    sl.insertAtEnd(1)
    sl.insertAtEnd(3)
    sl.insertAtEnd(5)
    print sl