Feature: search product check bay & lulu

  Scenario Outline: go to url
    Given go to "<url>"
    Then Search text xpath "<searchXpath>" "<productName>"
    Then close the app

    Examples: 
      | productName | url                                                                                                       | searchXpath                                 |
 #    | iphone 11   | https://accstorefront.casvowwxta-aldahraho1-s1-public.model-t.cc.commerce.ondemand.com/?site=foodcrowd-ae | //*[@id='js-site-search-input']             |
      | iphone 11   | https://stghybrisin.lulumea.com/en-in/                                                                    | //*[@id='js-site-search-input auto-search'] |
