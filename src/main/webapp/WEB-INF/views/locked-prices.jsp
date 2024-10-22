<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Locked Prices</title>
    <link rel="stylesheet" href="/css/bootstrap.min.css">
</head>
<body>
    <div class="container mt-5">
        <h1 class="mb-4">Locked Prices</h1>
        <table class="table table-bordered">
            <thead>
                <tr>
                    <th>Product Name</th>
                    <th>Locked Price</th>
                    <th>Lock Percentage</th>
                    <th>Lock Time</th>
                    <th>Unlock Time</th>
                    <th>Actions</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="lock" items="${lockedPrices}">
                    <tr>
                        <td>${lock.product.name}</td>
                        <td>₹${lock.lockedPrice}</td>
                        <td>${lock.lockPercentage}%</td>
                        <td>${lock.lockTime}</td>
                        <td>${lock.unlockTime}</td>
                        <td>
                            <form action="/purchase/${lock.id}" method="post">
                                <button type="submit" class="btn btn-success">Purchase</button>
                            </form>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        <a href="/" class="btn btn-secondary">Back to Products</a>
    </div>
</body>
</html>
