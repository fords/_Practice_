"""Given a string, recursively compute a new string 
where identical, adjacent characters 
get separated with a "*".  

Example:
insert_star_between_pairs("cac") ==> "cac"

insert_star_between_pairs("cc") ==> "c*c"
 """
def insert_star_between_pairs(a_string):
    if a_string == None or len(a_string) == 1 or a_string =='' :
        return a_string
    if a_string[0] == a_string[1]:
        return a_string[0]+'*'+insert_star_between_pairs(a_string[1:len(a_string)])
    else:
        return a_string[0:1] + insert_star_between_pairs(a_string[1:len(a_string)])
if __name__ == '__main__':
    print insert_star_between_pairs('bbbb')