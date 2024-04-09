def convert(text):
    text = text.replace(":(","🙁").replace(":)","🙂")
    return text

def main():
    s= input("Enter a string: ")
    s= convert(s)
    print(s)

main()
