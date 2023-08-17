-- Snippet 1:
USE AdventureWorks2022

SELECT LoginID FROM HumanResources.Employee WHERE JobTitle = 'Design Engineer'
GO

-- Snippet 2:
CREATE TYPE usertype FROM varchar(20) NOT NULL
GO

-- Snippet 3:
DECLARE @Number int;
SET @Number = 2 + 2 * (4 + (5 - 3))
SELECT @Number
GO

-- Snippet 4:
SELECT SalesOrderID, CustomerID, SalesPersonID, TerritoryID, YEAR(OrderDate)
AS CurrentYear, YEAR(OrderDate) + 1 AS NextYear FROM Sales.SalesOrderHeader
GO

-- Snippet 8:
SELECT SalesPersonID, YEAR(OrderDate) AS OrderYear -- aka OrderYear is just a new alias for YEAR(OrderDate)
FROM Sales.SalesOrderHeader
WHERE CustomerID = 30084
GROUP BY SalesPersonID, YEAR(OrderDate) -- arranges the rows by groups
HAVING COUNT(*) > 1                     -- filters the groups using predicates
ORDER BY SalesPersonID, OrderYear;		-- Sorts the output