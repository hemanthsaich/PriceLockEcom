<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Purchase Confirmation</title>
    <link rel="stylesheet" href="/css/bootstrap.min.css">
</head>
<body>
    <div class="container mt-5">
        <h1 class="mb-4">Purchase Confirmation</h1>
        <p><strong>Product:</strong> ${purchase.product.name}</p>
        <p><strong>Final Price:</strong> ₹${purchase.finalPrice}</p>
        <p><strong>Purchase Date:</strong> ${purchase.purchaseDate}</p>
        <a href="/" class="btn btn-primary">Back to Home</a>
    </div>
</body>
</html>
