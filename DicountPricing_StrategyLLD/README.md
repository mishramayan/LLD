Problem Statement for Strategy Design Pattern

Context:
An e-commerce platform wants to implement a flexible and scalable pricing engine to calculate discounts on products 
during sales. The platform offers various types of discounts, including:

	1. Percentage discounts (e.g., 10% off).
	2. Flat-rate discounts (e.g., $20 off).
	3. Buy-One-Get-One (BOGO) discounts.
	4. Seasonal or dynamic discounts that can change based on predefined rules.
	5. Each type of discount requires different logic to calculate the final price of a product. Over time, the 
	   platform anticipates introducing more complex discount strategies (e.g., loyalty-based discounts, personalized 
	   discounts using machine learning).

Challenges:
	1. Rigid Codebase: If the discount logic is implemented using conditional statements (if-else or switch-case), 
	   adding new discount types requires modifying existing code, increasing the risk of errors.
	2. Limited Scalability: The tightly coupled design makes it difficult to extend the system without impacting other 
	   parts.
	3. Low Maintainability: Hardcoded logic makes the system harder to test, maintain, and debug as the number of 
	   discount strategies grows.

Problem:
How can the e-commerce platform design a pricing engine that allows for easy integration of new discount strategies 
without modifying existing code, while ensuring the system remains scalable, maintainable, and testable?

Solution:
The Strategy Design Pattern provides a way to encapsulate discount logic into separate "strategy" classes. This pattern 
allows the platform to define a family of discount algorithms, encapsulate each one, and make them interchangeable at 
runtime.