a = input("List A: ").split()
b = input("List B: ").split()
common = list(set(a) & set(b))
print("Common elements:", common)
