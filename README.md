Apologies for the confusion! Here is the **README.md** file content without the directory structure, as per your request:

```markdown
# Price Locking Application

This is a **Spring Boot** web application for managing products in an e-commerce system, with a special feature for **locking product prices**. Users can lock a product’s price at a discount for 10 days and purchase the product within that timeframe. The application is built using **Spring Boot**, **JSP**, and **Hibernate** for the backend, and **Bootstrap** for styling.

## Features

- Display a list of products with their offer prices.
- Lock a product price for a period of 10 days with a customizable discount.
- Purchase a product at the locked price.
- Automatically unlock the product price if the purchase is not made within 10 days.
- Built with **Spring Boot**, **JSP**, **Hibernate**, and **Bootstrap**.

## Technologies Used

- **Spring Boot**: For backend application logic and embedded Tomcat.
- **JSP**: For rendering the frontend.
- **Hibernate**: ORM for database interaction.
- **MySQL**: Database to store products, price locks, and purchases.
- **Bootstrap**: For responsive design and UI.
- **Maven**: Project management and build tool.

## Setup and Installation

### Prerequisites

- **Java 11+** installed on your system.
- **Maven** installed for building the project.
- **MySQL** installed and running.

### Steps

1. **Clone the repository**:

   ```bash
   git clone https://github.com/yourusername/pricelock-app.git
   cd pricelock-app
   ```

2. **Configure MySQL**:

   Update the `application.properties` file with your MySQL credentials:

   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/pricedb
   spring.datasource.username=your_username
   spring.datasource.password=your_password
   spring.jpa.hibernate.ddl-auto=update
   ```

3. **Build the project**:

   Use Maven to clean, build, and package the project:

   ```bash
   mvn clean package
   ```

4. **Run the application**:

   After packaging the project, you can run the application using the Spring Boot embedded Tomcat server:

   ```bash
   mvn spring-boot:run
   ```

   Alternatively, you can run the `WAR` file:

   ```bash
   java -jar target/pricelock-app-1.0.0.war
   ```

5. **Access the application**:

   Open your browser and navigate to `http://localhost:8080/` to access the home page.

## Usage

### Home Page

- Lists all available products with options to lock the price or view details.

### Lock Price

- Lock a product's price with a discount percentage. The lock is valid for 10 days.

### Purchase

- Purchase a product at the locked price within the lock period.

### View Locked Prices

- View all locked prices and their expiration dates.

## API Endpoints

- **`GET /`**: Displays the home page with the product list.
- **`GET /product/details/{id}`**: Displays the details of a specific product.
- **`POST /product/lock/{id}`**: Lock a product price.
- **`POST /purchase/{priceLockId}`**: Purchase a product at the locked price.
- **`GET /locked-prices`**: Displays all locked products with their prices and expiration dates.

## Screenshots

### Home Page
![Home Page](path-to-your-homepage-screenshot.png)

### Locked Prices
![Locked Prices](path-to-your-locked-prices-screenshot.png)

### Purchase Confirmation
![Purchase Confirmation](path-to-your-purchase-confirmation-screenshot.png)

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Contributing

Pull requests are welcome! For major changes, please open an issue first to discuss what you would like to change.

## Contact

If you have any questions, feel free to reach out at:

- **Email**: your.email@example.com
- **GitHub**: [yourusername](https://github.com/yourusername)
```

### Instructions:
- Replace **`yourusername`** and **`your.email@example.com`** with your actual GitHub username and email.
- Replace **`path-to-your-homepage-screenshot.png`**, **`path-to-your-locked-prices-screenshot.png`**, and **`path-to-your-purchase-confirmation-screenshot.png`** with the actual paths to the screenshots (if you want to include images).
- Include additional details, if any, that are specific to your project.

This is a simplified and clean version of the **README.md** file, suitable for GitHub! Let me know if you need further adjustments.
