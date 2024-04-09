import random

while True:
    try:
        level = int(input("Level: "))

        if level <= 0:
            raise ValueError
        break

    except ValueError:
        pass

r = random.randint(1, level)

while True:
    try:
        guess = int(input("Guess: "))

        if guess < r:
            print("Too small!")
        elif guess > r:
            print("Too large!")
        else:
            print("Just right!")
            break
    except ValueError:
        pass
