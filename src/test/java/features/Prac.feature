Feature: Search and place the order for products

  Scenario: Search experience for product search in both and offers page

    Given User is on the GreenCart landing page
    When User search with shortname 'TOM' and expected actual name of the product
    Then user searched for the same short name in offers page to check if products exists
