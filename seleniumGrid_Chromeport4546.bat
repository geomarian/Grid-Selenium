Echo off
Title ChromeDriver Node on 4546

Echo Setting Project Location
set projectLocation=E:\GEO\SeleniumSample\Grid\selenium-server-standalone-3.141.59
pushd %projectLocation%

Echo Setting ChromeDriver path and Creating node on 4546
java -Dwebdriver.chrome.driver=E:\\GEO\\SeleniumSample\\Grid\\chromedriver.exe -jar E:\GEO\SeleniumSample\Grid\selenium-server-standalone-3.141.59.jar -role node -hub http://192.168.1.8:4444/grid/register
pause