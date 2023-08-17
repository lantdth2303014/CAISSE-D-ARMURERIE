USE AdventureWorks2022 -- use the AdventureWorks2022 database 

SELECT * FROM HumanResources.Employee
GO -- GO command is used to group SQL commands into batches

DECLARE @deptID INT -- declare local variable
SET @deptID=1
SELECT Name,GroupName FROM HumanResources.Department WHERE DepartmentID = @deptID
GO

SELECT @@LANGUAGE -- show data of global variable @@LANGUAGE
SELECT @@VERSION 

GO

SELECT SUM(StandardCost) FROM Production.ProductCostHistory -- cal the sum

SELECT AVG(StandardCost) FROM Production.ProductCostHistory	-- cal the avg

SELECT MAX(StandardCost) FROM Production.ProductCostHistory -- cal the max

SELECT COUNT(*) FROM Production.ProductCostHistory -- count items

SELECT GETDATE() -- get the date

SELECT DATEPART(hh,GETDATE()) -- get a part of the date

SELECT CONVERT(VarChar(50), GETDATE(), 103) -- different format

SELECT DB_ID('AdventureWorks2022') -- get the ID of the database