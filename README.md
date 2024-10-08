APIs built with SpringBoot:

- /redis/searchtestresult?name=OrderBookTest
<br>User can search test result by test case name</br>
<br>Sample:</br>
  <code>
  {
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
  }
  </code>

- /redis/alltestresult
User can check the execution result of each test result
  <code>
  {
    "data": {
      "TestCases.PublicData.InstrumentTest_verifyNegativeInvalidInstId": "pass",
      "TestCases.PublicData.InstrumentTest_verifyRateLimit": "pass",
      ....
      "TestCases.MarketData.OrderBookTest_verifyResponseTime": "pass",
      "TestCases.MarketData.TradesTest_verifyPositive1LimitSize": "pass"
    },
    "code": "200",
    "msg": "Success"
  }
  </code>

- /redis/countalltestresult
  User can check the number of passed, failed and total number of test result  
  <code>
  {
    "data": {
      "Passed": 50,
      "Failed": 1,
      "Total": 51
    },
    "code": "200",
    "msg": "Success"
  }
  </code>



  
