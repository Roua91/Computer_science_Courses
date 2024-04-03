import inflect

e = inflect.engine()

name_list = []

while True:
    try:
        name_list.append(input("Name: "))
    except EOFError:
        print()
        break

print("Adieu, adieu, to", e.join(name_list))
