APIs built with SpringBoot:

- /redis/searchtestresult?name=OrderBookTest
  User can search test result by test case name

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



  
