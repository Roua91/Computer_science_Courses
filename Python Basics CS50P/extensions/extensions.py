filename = input("File name: ").lower().strip().split(".")

application = ["pdf", "zip"]
image = ["gif", "png"]

if filename[-1] == "txt":
    print("text/plain")
elif filename[-1] in application:
    print(f"application/{filename[-1]}")
elif filename[-1] == 'jpg' or filename[-1] == 'jpeg':
    print("image/jpeg")
elif filename[-1] in image:
    print(f"image/{filename[-1]}")
else:
    print("application/octet-stream")
