import requests
import sys

try:
    req = requests.get(" https://api.coindesk.com/v1/bpi/currentprice.json")
    data= req.json()
    rate_float = data["bpi"]["USD"]["rate_float"]
except RequestError:
    sys.exit(1)

try:
    bitcoin = float(sys.argv[1])
except IndexError:
    sys.exit("Missing command-line argument")
except ValueError:
    sys.exit("Command-line argument is not a number")
print(f"${bitcoin * rate_float:,.4f}")
