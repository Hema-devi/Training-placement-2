lst = input("Enter list elements: ").split()
print("Palindrome List" if lst == lst[::-1] else "Not Palindrome")
