lst = input("Enter list: ").split()
unique = [x for x in lst if lst.count(x) == 1]
print("Unique elements:", unique)
