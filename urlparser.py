import requests
URL="url"
data=requests.get(URL)
content=data.text
print(content)
