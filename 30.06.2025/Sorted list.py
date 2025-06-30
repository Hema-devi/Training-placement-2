lst = list(map(int, input("Enter numbers: ").split()))
print("Sorted" if lst == sorted(lst) else "Not Sorted")
