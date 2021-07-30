Echo off
Title geckodriver Node on 4546

Echo Setting Project Location
set projectLocation=E:\GEO\SeleniumSample\Grid\selenium-server-standalone-3.141.59
pushd %projectLocation%

Echo Setting geckodriver path and Creating node on 4546
java -Dwebdriver.chrome.driver=E:\\GEO\\SeleniumSample\\Grid\\geckodriver.exe -jar E:\GEO\SeleniumSample\Grid\selenium-server-standalone-3.141.59.jar -role node -hub http://192.168.1.8:4444/grid/register
pause