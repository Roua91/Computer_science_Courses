x = input("What is the answer to the great Question of life?: ").lower().strip()

if x == "42":
    print("Yes")
elif x == "forty-two":
    print("Yes")
elif x == "forty two":
    print("Yes")
else:
    print("No")
