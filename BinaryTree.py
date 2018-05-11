#global pre_ordered_list
pre_ordered_list = []
class BinaryTree:
    
    def __init__(self, root_data):
        self.data = root_data
        self.left_child = None
        self.right_child = None

    def preorder(self):
        pre_ordered_list.append(self.get_root_val())
        if self.get_left_child():
            self.get_left_child().preorder()
        if self.get_right_child():
            self.get_right_child().preorder()  

    def get_right_child(self):
        return self.right_child

    def get_left_child(self):
        return self.left_child

    def set_root_val(self, obj):
        self.data = obj

    def get_root_val(self):
        return self.data
    
    def __str__(self):
        return "From str method of Test: left_child is %s, right_child is %s, data is %s" % (self.left_child, self.right_child,self.data)
    
if __name__ == '__main__':
    tree = BinaryTree([123,2,3,4]) 
    tree.preorder()
    print tree
    for i in pre_ordered_list:
        print i 