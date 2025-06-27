contacts = {
    "John": "9876543210",
    "Alice": "9876501234"
}

name = input("Enter name to search: ")
print("Contact:", contacts.get(name, "Not found"))
