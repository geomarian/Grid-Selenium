Echo off
Title Server HUB on port 4444

Echo Setting Project Location
set projectLocation=E:\GEO\SeleniumSample\Grid\selenium-server-standalone-3.141.59
pushd %projectLocation%

Echo Loading HUB on default port 4444
java -jar selenium-server-standalone-3.141.59.jar -role hub
pause