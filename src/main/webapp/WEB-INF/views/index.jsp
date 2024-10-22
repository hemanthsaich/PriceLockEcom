<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Product List</title>
    <link rel="stylesheet" href="/css/bootstrap.min.css"> <!-- Link to your bootstrap.min.css -->
</head>
<body>
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <div class="container-fluid">
            <a class="navbar-brand" href="/">Shop</a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav ms-auto">
                    <li class="nav-item">
                        <a class="nav-link active" aria-current="page" href="/">Home</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="/locked-prices">Locked Prices</a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>

    <div class="container mt-5">
        <h1 class="mb-4">Product List</h1>
        <div class="row">
            <c:forEach var="product" items="${products}">
                <div class="col-md-4 mb-4">
                    <div class="card">
                        <div class="card-body">
                            <h5 class="card-title">${product.name}</h5>
                            <p class="card-text"><strong>Price:</strong> ₹${product.price}</p>
                            <p class="card-text"><strong>Offer Price:</strong> ₹${product.offerPrice}</p>
                            <a href="/product/details/${product.id}" class="btn btn-primary">View Details</a>
                            <a href="/product/lock/${product.id}" class="btn btn-warning">Lock Price</a>
                        </div>
                    </div>
                </div>
            </c:forEach>
        </div>
    </div>

    <footer class="bg-light text-center text-lg-start mt-5">
        <div class="text-center p-3">
            &copy; 2024 Shop - All Rights Reserved
        </div>
    </footer>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
