lst = list(map(int, input("Enter numbers: ").split()))
lst = list(set(lst))  
lst.sort(reverse=True)
print("Second largest:", lst[1] if len(lst) >= 2 else "Not enough unique numbers")
