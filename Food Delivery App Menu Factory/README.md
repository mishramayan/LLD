# Problem Statement: Food Delivery App Menu Factory

You are tasked with designing a menu creation system for a food delivery app that offers a wide variety of cuisines. The app allows restaurants to dynamically create different types of dishes based on their menu categories (e.g., appetizers, main courses, desserts, beverages). Your goal is to implement a system that uses the Factory Design Pattern to create dishes based on the category requested by the user.

---

## Requirements

### Menu Categories

The app should support multiple dish categories:
- **Appetizer**
- **Main Course**
- **Dessert**
- **Beverage**

Each dish belongs to a specific category and has unique attributes, such as:
- **Name**
- **Price**
- **Preparation Time**

### Dynamic Dish Creation

Each restaurant can customize its menu by adding dishes. For example:
- **Appetizers:** Garlic Bread, Caesar Salad
- **Main Course:** Margherita Pizza, Grilled Salmon
- **Dessert:** Chocolate Cake, Ice Cream
- **Beverage:** Coffee, Fresh Juice

The system should create a dish instance dynamically based on the input category and dish type.

---

## Behavior

The system should include a factory class that:
- Accepts a category and dish type as input.
- Returns the appropriate dish object based on the input.
- Handles the creation process internally without exposing the creation logic to the client.

---

## Extensibility

The system must be easy to extend. For example:
- Adding new categories like **Snacks** or **Side Dishes** should not require changes to existing code.
- Adding new dishes within existing categories should be straightforward.

---

## Client Interaction

The client should:
1. Request a dish by specifying its category and type.
2. Receive a dish object with all relevant details.
3. Be able to display the dish details (e.g., name, price, preparation time).

---

## Example Scenario

- The client requests a **Main Course** dish of type **Margherita Pizza**.
- The system uses the factory to create the corresponding dish object.
- The dish object has the following attributes:
  - **Name:** Margherita Pizza
  - **Price:** $12.00
  - **Preparation Time:** 20 minutes
