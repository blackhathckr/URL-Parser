import requests
URL="url for data retrieval"
data=requests.get(URL)
content=data.text
print(content)
