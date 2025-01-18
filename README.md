# Price Locking Application

This project is a **Spring Boot** web application that allows users to manage and purchase products in an e-commerce system with a special feature for **locking product prices**. Users can lock a product’s price at a discount for 10 days and purchase the product within that timeframe. If the user fails to purchase the product within 10 days, the locked price is automatically unlocked, and the product reverts to its normal price.


## Key Features:
- **Product Listing**: Display a list of products with their regular and discounted prices.
- **Price Locking**: Allows users to lock a product’s price at a discount for 10 days.
- **Purchasing**: Users can purchase a product at the locked price if within the valid lock period.
- **Automatic Price Unlocking**: Prices are automatically unlocked after 10 days if not purchased.

## Technologies Used:
- **Spring Boot**: Backend application framework.
- **Hibernate**: ORM for database interactions.
- **MySQL**: Database for storing product, price lock, and purchase information.
- **Maven**: Build tool for managing dependencies and building the project.
