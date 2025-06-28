data = {"apple": 5, "banana": 2, "orange": 8}
sorted_dict = dict(sorted(data.items(), key=lambda item: item[1]))
print("Sorted by value:", sorted_dict)
