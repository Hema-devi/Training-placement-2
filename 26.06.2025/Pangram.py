import string

s = input("Enter sentence: ").lower()
alphabet = set(string.ascii_lowercase)
print("Pangram" if alphabet.issubset(set(s)) else "Not Pangram")
