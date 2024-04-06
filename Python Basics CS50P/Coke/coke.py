def main():
    valid_coins = [25, 10, 5]
    cost = 50
    paid = 0

    while paid < cost:
        print(f"Amount Due: {cost - paid}")
        money = int(input("Insert Coin: ").strip())
        if money in valid_coins:
            paid += money
        else:
            print("Invalid coin. Please insert a 5, 10, or 25 cent coin.")

    print(f"Change Owned: {paid - cost}")


main()
