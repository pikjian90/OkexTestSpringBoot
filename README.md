APIs built with SpringBoot:

- /redis/searchtestresult
  User can search test result by test case name
  <code>{
  "data": {
    "TestCases.MarketData.OrderBookTest_verifyNegativeInvalidEndpoint": "pass",
    "TestCases.MarketData.OrderBookTest_verifyPositive": "pass",
    "TestCases.MarketData.OrderBookTest_verifyNegativeMissingInstId": "pass",
    "TestCases.MarketData.OrderBookTest_verifyResponseTime": "pass",
    "TestCases.MarketData.OrderBookTest_verifyNegativeInvalidInstId": "pass",
    "TestCases.MarketData.OrderBookTest_verifyNegativeInvalidMethod": "pass",
    "TestCases.MarketData.OrderBookTest_verifyRateLimit": "fail"
  },
  "code": "200",
  "msg": "Success"
}</code>

- /redis/alltestresult
![image](https://github.com/user-attachments/assets/c8ce935b-2d07-45b1-8000-671123325365)

- /redis/countalltestresult
![image](https://github.com/user-attachments/assets/0302db89-9dd5-4476-8e72-0185718bf9f9)


  
