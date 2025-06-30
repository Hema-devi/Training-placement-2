s = input("Enter sentence: ").lower()
alphabet = set('abcdefghijklmnopqrstuvwxyz')
print("Pangram" if alphabet <= set(s) else "Not Pangram")
