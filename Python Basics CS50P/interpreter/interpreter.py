Ex = input("Expression: ").strip()
x, y, z = Ex.split(" ")

x = float(x)
z = float(z)

if y == '+':
    print(x + z)
elif y == '-':
    print(x - z)
elif y == '*':
    print(x*z)
elif y == '/':
    if z != 0:
        print(x/z)
    else:
        print("not possible")
else:
    print("enter true values!")
