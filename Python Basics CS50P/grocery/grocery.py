list = {}

while True:
    try:
        item = input().upper().strip()

        # check if item is in items dic
        if item in list:
            list[item] += 1
        else:
            list[item] = 1

    except EOFError:
        for value, count in sorted(list.items()):
            print(f"{count} {value}")
        break
