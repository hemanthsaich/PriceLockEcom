<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Lock Price</title>
    <link rel="stylesheet" href="/css/bootstrap.min.css">
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
                </ul>
            </div>
        </div>
    </nav>

    <div class="container mt-5">
        <h1 class="mb-4">Lock Price for ${product.name}</h1>
        <form action="/product/lock" method="post">
            <input type="hidden" name="productId" value="${product.id}">
            <div class="form-group mb-3">
                <label for="lockPercentage">Lock Percentage</label>
                <input type="number" id="lockPercentage" name="lockPercentage" class="form-control" required>
            </div>
            <button type="submit" class="btn btn-warning">Lock Price</button>
        </form>
        <a href="/" class="btn btn-secondary mt-3">Back to Products</a>
    </div>

    <footer class="bg-light text-center text-lg-start mt-5">
        <div class="text-center p-3">
            &copy; 2024 Shop - All Rights Reserved
        </div>
    </footer>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
