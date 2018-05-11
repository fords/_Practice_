def unique_chars_in_string(string):

    seen = dict()
    for char in string:
        if char in seen:
            return False
        seen[char] = True
        
    return True
