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
  User can check the execution result of each test result
  <code>
  {
    "data": {
      "TestCases.PublicData.InstrumentTest_verifyNegativeInvalidInstId": "pass",
      "TestCases.PublicData.InstrumentTest_verifyRateLimit": "pass",
      "TestCases.MarketData.CandleSticksTest_verifyPositiveBar1mValidation": "pass",
      "TestCases.MarketData.TradesTest_verifyPositiveSingleFieldValidation": "pass",
      "TestCases.MarketData.TickerTest_verifyResponseTime": "pass",
      "TestCases.PublicData.InstrumentTest_verifyNegativeInvalidEndpoint": "pass",
      "TestCases.MarketData.TickerTest_verifyNegativeMissingInstId": "pass",
      "TestCases.MarketData.TradesTest_verifyRateLimit": "pass",
      "TestCases.MarketData.CandleSticksTest_verifyPositiveSingleFieldValidation": "pass",
      "TestCases.MarketData.CandleSticksTest_verifyNegativeInvalidInstId": "pass",
      "TestCases.MarketData.OrderBookTest_verifyNegativeInvalidMethod": "pass",
      "TestCases.MarketData.TickerTest_verifyNegativeInvalidEndpoint": "pass",
      "TestCases.MarketData.TotalVolumeTest_verifyNegativeInvalidEndpoint": "pass",
      "TestCases.MarketData.CandleSticksTest_verifyNegativeInvalidMethod": "pass",
      "TestCases.PublicData.InstrumentTest_verifyResponseTime": "pass",
      "TestCases.MarketData.OrderBookTest_verifyPositive": "pass",
      "TestCases.MarketData.CandleSticksTest_verifyPositiveMultipleFieldValidation": "pass",
      "TestCases.MarketData.CandleSticksTest_verifyNegativeMissingInstId": "pass",
      "TestCases.MarketData.CandleSticksTest_verifyPositiveBar1hValidation": "pass",
      "TestCases.MarketData.TotalVolumeTest_verifyRateLimit": "pass",
      "TestCases.MarketData.TickerTest_verifyPositive": "pass",
      "TestCases.MarketData.TradesTest_verifyResponseTime": "pass",
      "TestCases.PublicData.InstrumentTest_verifyNegativeMissingInstId": "pass",
      "TestCases.MarketData.OrderBookTest_verifyRateLimit": "fail",
      "TestCases.PublicData.InstrumentTest_verifyPositiveInstIdAndInstType": "pass",
      "TestCases.MarketData.TradesTest_verifyPositiveDefaultLimitSize": "pass",
      "TestCases.MarketData.TotalVolumeTest_verifyPositive": "pass",
      "TestCases.MarketData.CandleSticksTest_verifyPositive1LimitSize": "pass",
      "TestCases.MarketData.TickerTest_verifyNegativeInvalidMethod": "pass",
      "TestCases.MarketData.TradesTest_verifyNegativeInvalidEndpoint": "pass",
      "TestCases.MarketData.CandleSticksTest_verifyRateLimit": "pass",
      "TestCases.MarketData.OrderBookTest_verifyNegativeMissingInstId": "pass",
      "TestCases.MarketData.CandleSticksTest_verifyPositiveDefaultLimitSize": "pass",
      "TestCases.MarketData.TradesTest_verifyPositiveMultipleFieldValidation": "pass",
      "TestCases.MarketData.TotalVolumeTest_verifyResponseTime": "pass",
      "TestCases.MarketData.CandleSticksTest_verifyPositiveBeforeValidation": "pass",
      "TestCases.MarketData.CandleSticksTest_verifyPositiveBar5mValidation": "pass",
      "TestCases.MarketData.TradesTest_verifyNegativeInvalidMethod": "pass",
      "TestCases.MarketData.CandleSticksTest_verifyNegativeInvalidEndpoint": "pass",
      "TestCases.MarketData.TradesTest_verifyNegativeInvalidInstId": "pass",
      "TestCases.MarketData.TradesTest_verifyNegativeMissingInstId": "pass",
      "TestCases.MarketData.TickerTest_verifyRateLimit": "pass",
      "TestCases.MarketData.TickerTest_verifyNegativeInvalidInstId": "pass",
      "TestCases.MarketData.CandleSticksTest_verifyPositiveAfterValidation": "pass",
      "TestCases.MarketData.OrderBookTest_verifyNegativeInvalidInstId": "pass",
      "TestCases.MarketData.CandleSticksTest_verifyResponseTime": "pass",
      "TestCases.MarketData.OrderBookTest_verifyNegativeInvalidEndpoint": "pass",
      "TestCases.MarketData.TotalVolumeTest_verifyNegativeInvalidMethod": "pass",
      "TestCases.PublicData.InstrumentTest_verifyNegativeInvalidMethod": "pass",
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



  
