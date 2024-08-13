## Task: Online Shopping Cart

You are tasked with implementing an online shopping cart system using Test-Driven Development (TDD) practices. The system should allow users to add, remove, and view products in their cart, calculate the total price, and apply discounts.

### Requirements

1. **Product Class:**

   - Create a `Product` class with attributes: `productId`, `name`, `price`.
   - Implement appropriate constructors and getter methods.

2. **Shopping Cart Class:**

   - Create a `ShoppingCart` class to manage products.
   - The cart should hold a list of products and provide methods to add, remove, and view products.
   - Implement methods to calculate the total price of the items in the cart.

3. **Discount System:**

   - Implement a discount system that applies discounts based on the total price of items in the cart.
   - Define an interface `DiscountStrategy` with a method `applyDiscount(double totalPrice)` that returns the discounted price.

4. **Discount Implementations:**

   - Create two classes implementing the `DiscountStrategy` interface: `PercentageDiscount` and `FixedAmountDiscount`.
   - `PercentageDiscount` applies a percentage discount based on the total price.
   - `FixedAmountDiscount` applies a fixed amount discount if the total price exceeds a certain threshold.

### TDD Approach

1. **Write Test Cases:**
   - Begin by writing test cases for the basic functionality of the `Product` class.
   - Proceed to test cases for the `ShoppingCart` class methods (add, remove, view, calculate total).
   - Write test cases for the `Discount` classes and the application of discounts.

2. **Implement Classes:**
   - Start by implementing the `Product` class and ensure all previously written test cases pass.
   - Move on to the `ShoppingCart` class and follow the same process.
   - Implement the `Discount` classes and their logic according to the test cases.

3. **Refactor and Optimize:**
   - After passing all the tests, refactor your code if needed to improve readability and maintainability.

### Constraints

- All monetary values should be represented as `double` values.
- Handle edge cases such as adding/removing non-existent products, calculating discounts correctly, and handling different discount scenarios.

### Testing

Write comprehensive unit tests for each class and method using a testing framework like JUnit.

### Deliverables

Provide the complete source code along with the test suite.

### Additional Challenge (Optional)

Implement a basic command-line or web-based user interface to interact with the shopping cart system. This can include adding/removing products, viewing the cart, and applying discounts. You can use a simple text-based interface or create a basic web UI using Java libraries like Spring Boot or JavaFX.

This task will challenge your TDD skills and your ability to design and implement a functional system with different components. It will also provide hands-on experience in writing tests first and using them to drive the development process.
