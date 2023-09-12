
-- create Lab11 database
IF EXISTS (SELECT * FROM sys.databases WHERE Name LIKE 'Lab11')
BEGIN
    -- Set the Lab11 database to SINGLE_USER mode to disconnect any active connections
    USE master;
    ALTER DATABASE Lab11 SET SINGLE_USER WITH ROLLBACK IMMEDIATE;
    -- Drop the Example5 database
    DROP DATABASE Lab11;
END
GO

CREATE DATABASE Lab11
GO

USE Lab11
GO

-- the view is named "ProductList" and is created using the "SELECT" statement that follows the "AS" keyword
CREATE VIEW ProductList AS
SELECT ProductID, Name FROM AdventureWorks2022.Production.Product
GO

SELECT * FROM ProductList
GO

CREATE VIEW SalesOrderDetail AS
SELECT pr.ProductID, pr.Name, od.UnitPrice, od.OrderQty, od.UnitPrice*od.OrderQty AS [Total Price]
FROM AdventureWorks2022.Sales.SalesOrderDetail od JOIN AdventureWorks2022.Production.Product pr ON od.ProductID=pr.ProductID
GO

SELECT * FROM SalesOrderDetail
GO