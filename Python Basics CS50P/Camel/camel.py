def convert(n):
    output = ''

    for c in n:
        if c.isupper():
            output += '_' + c.lower()
        else:
            output+=c
    return output.lstrip('_')

name = input("Enter a name: ").strip()
print(convert(name))
