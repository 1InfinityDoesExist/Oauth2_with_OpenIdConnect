# Oauth2_with_OpenIdConnect


```sh
End Points : http://localhost:8547/oauth2/authorize?response_type=code&client_id=client&scope=openid&redirect_uri=http://localhost:8547/authorized
http://localhost:8547/certs
curl --location --request POST 'http://localhost:8547/oauth2/token' \
--header 'Authorization: Basic Y2xpZW50OnNlY3JldA==' \
--header 'Content-Type: application/x-www-form-urlencoded' \
--header 'Cookie: JSESSIONID=A75FCA9D4C2D6A9FE9895F5F19009BFF' \
--data-urlencode 'usernam=sinchan' \
--data-urlencode 'password=password' \
--data-urlencode 'grant_type=authorization_code' \
--data-urlencode 'scope=openid' \
--data-urlencode 'code=BW2WmiQKRz8AfR5-A3pCx4ES9NdxpsM9jBDAlI8sxerHJlCbHS-OPjlP55RApel4DWGrT5b9RqE2eOCNqWLgyUrfXE6q5t5fs3zhdX5xYD9wbdUrq40H0BcypkyAREa8' \
--data-urlencode 'redirect_uri=http://localhost:8547/authorized'
```
