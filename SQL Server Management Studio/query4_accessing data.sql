
USE Northwind
SELECT * FROM dbo.Categories
SELECT * FROM dbo.Products

-- JOIN example
SELECT Products.ProductName, Categories.CategoryName
FROM Products JOIN Categories ON Products.CategoryID = Categories.CategoryID

-- WHERE example
SELECT * FROM dbo.Orders
WHERE OrderID >= 11000;

GO