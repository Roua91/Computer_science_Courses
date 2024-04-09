from pyfiglet import Figlet
import random
import sys

fonts = Figlet().getFonts()

#check if font is provided
if len(sys.argv) == 1:
    font =random.choice(fonts)
elif len(sys.argv) == 3 and sys.argv[1] in ["-f", "--font"] and sys.argv[2] in fonts:
    font = sys.argv[2]
else:
    sys.exit("Invalid arguments.")

#Ask for input and print input
text = input("Input: ")
print("Output:\n", Figlet(font=font).renderText(text))
