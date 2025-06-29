lst = input("Enter list: ").split()
is_all_numbers = all(x.isdigit() for x in lst)
print("All numbers" if is_all_numbers else "Contains non-numeric values")
