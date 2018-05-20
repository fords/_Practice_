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

    def set_right(self,right):
        self.right_child = right 
        
    def set_left(self,left):
        self.left_child = left 
        
    def set_root_val(self, obj):
        self.data = obj

    def get_root_val(self):
        return self.data
    
    def __str__(self):
        return "From str method of Test: left_child is %s, right_child is %s, data is %s" % (self.left_child, self.right_child,self.data)
    
if __name__ == '__main__':
    tree = BinaryTree(1)
    tree.set_left(BinaryTree(4))
    tree.set_right(BinaryTree(3))
    #tree_left = tree.set_left(BinaryTree(2))
    #tree_left.set_left(BinaryTree(4))
    tree2 = BinaryTree(5)
    tree2.set_left(tree)  # 5 -> left 1 (left 4 right 3)
    tree2.preorder()
    print tree
    for i in pre_ordered_list:
        print i 