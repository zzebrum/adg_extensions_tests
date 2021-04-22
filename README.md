1. Place unpacked folder with Chrome extension build to the project's root
2. Pack extension `/Applications/Google\ Chrome.app/Contents/MacOS/Google\ Chrome --pack-extension="chrome/" --pack-extension-key=chrome.pem `
3. It should create `chrome.crx` in current directory


Run test `gradle test`

Build Allure report `allure serve build/allure-results`


TBD
```bash
build extension
run test
```