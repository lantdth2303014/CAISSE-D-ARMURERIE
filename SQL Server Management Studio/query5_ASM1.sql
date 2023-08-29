DROP TABLE IF EXISTS Orders
GO

CREATE TABLE [Orders](
	orderID int Primary Key,
	customerID int,
	orderDate date,
	status varchar(40)
	)
GO

INSERT INTO Orders(orderID, customerID, orderDate) VALUES (123, 3710, '2009-11-18');
SELECT * FROM [Orders]
GO
----------------------------------------------------------------------------------------

DROP TABLE IF EXISTS Customers
GO

CREATE TABLE [Customers](
	customerID int Primary Key,
	name varchar(40),
	address varchar(40),
	telephone int,
	status varchar(40)
	)
GO

INSERT INTO Customers(customerID, name, address, telephone) VALUES (3710, 'Nguyễn Văn An', '111 Nguyễn Trãi, Thanh Xuân, Hà Nội', 098765432);
SELECT * FROM [Customers]
ORDER BY name
GO
--------------------------------------------------------------------------------------------

DROP TABLE IF EXISTS OrderDetails
GO

CREATE TABLE [OrderDetails](
	orderID int,
	productID int,
	PRIMARY KEY (orderID, productID),
	price int,
	qty int
	)
GO

INSERT INTO OrderDetails(orderID, productID, price, qty) VALUES (123, 1, 1000, 1);
INSERT INTO OrderDetails(orderID, productID, price, qty) VALUES (123, 2, 200, 2);
INSERT INTO OrderDetails(orderID, productID, price, qty) VALUES (123, 3, 100, 1);
SELECT * FROM [OrderDetails]
GO
------------------------------------------------------------------------------------------

DROP TABLE IF EXISTS Product
GO

CREATE TABLE [Product](
	productID int Primary Key,
	name varchar(40),
	description varchar(40),
	unit varchar(40),
	price int,
	qty int,
	status varchar(40)
	)
GO

INSERT INTO Product(productID, name, description, unit, price, qty) VALUES (1, 'Máy Tính T450', 'Máy nhập mới', 'Chiếc',1000, 200);
INSERT INTO Product(productID, name, description, unit, price, qty) VALUES (2, 'Điện Thoại Nokia5670', 'Điện thoại đang hot', 'Chiếc',200, 1000);
INSERT INTO Product(productID, name, description, unit, price, qty) VALUES (3, 'Máy In Samsung 450', 'Máy in đang ế', 'Chiếc',100, 100);
SELECT * FROM [Product]
ORDER BY price DESC
GO

--Liệt kê các sản phẩm mà khách hàng Nguyễn Văn An đã mua.
SELECT P.productID, P.name, P.description, P.unit, P.price, P.qty, P.status
FROM [Product] AS P
JOIN [OrderDetails] AS OD ON P.productID = OD.productID
JOIN [Orders] AS O ON OD.orderID = O.orderID
JOIN [Customers] AS C ON O.customerID = C.customerID
WHERE C.name = 'Nguyễn Văn An'
