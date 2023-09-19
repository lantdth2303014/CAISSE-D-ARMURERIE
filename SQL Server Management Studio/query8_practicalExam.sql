-- create AZBank database
IF EXISTS (SELECT * FROM sys.databases WHERE Name LIKE 'AZBank')
BEGIN
    -- Set the AZBank database to SINGLE_USER mode to disconnect any active connections
    USE master;
    ALTER DATABASE AZBank SET SINGLE_USER WITH ROLLBACK IMMEDIATE;
    -- Drop the AZBank database
    DROP DATABASE AZBank;
END
GO

CREATE DATABASE AZBank
GO

USE AZBank
GO

-- create Customer table
DROP TABLE IF EXISTS Customer
GO

CREATE TABLE Customer(CustomerId INT PRIMARY KEY NOT NULL, Name NVARCHAR(50) NULL, City NVARCHAR(50) NULL, Country NVARCHAR(50) NULL, Phone NVARCHAR(15) NULL, Email NVARCHAR(50) NULL)
GO

INSERT INTO Customer(CustomerId, Name, City, Country, Phone, Email) VALUES (138, NULL, 'Hanoi', NULL, NULL, NULL);
INSERT INTO Customer(CustomerId, Name, City, Country, Phone, Email) VALUES (128, NULL, 'Hanoi', NULL, NULL, NULL);
INSERT INTO Customer(CustomerId, Name, City, Country, Phone, Email) VALUES (118, NULL, 'Hungyen', NULL, NULL, NULL);
GO

-- create CustomerAccount table
DROP TABLE IF EXISTS CustomerAccount
GO

CREATE TABLE CustomerAccount(AccountNumber CHAR(9) PRIMARY KEY NOT NULL, CustomerId INT NOT NULL, Balance MONEY NOT NULL, MinAccount MONEY NULL)
GO

INSERT INTO CustomerAccount(AccountNumber, CustomerId, Balance, MinAccount) VALUES ('202', 138, 12345678, NULL);
INSERT INTO CustomerAccount(AccountNumber, CustomerId, Balance, MinAccount) VALUES ('212', 128, 23456789, NULL);
INSERT INTO CustomerAccount(AccountNumber, CustomerId, Balance, MinAccount) VALUES ('222', 118, 34567890, NULL);
GO

-- create CustomerTransaction table
DROP TABLE IF EXISTS CustomerTransaction
GO

CREATE TABLE CustomerTransaction(TransactionId INT PRIMARY KEY NOT NULL, AccountNumber CHAR(9) NULL, TransactionDate SMALLDATETIME NULL, Amount MONEY NULL, DepositorWithdraw BIT NULL)
GO

INSERT INTO CustomerTransaction(TransactionId, AccountNumber, TransactionDate, Amount, DepositorWithdraw) VALUES (11, '202', NULL, NULL, NULL);
INSERT INTO CustomerTransaction(TransactionId, AccountNumber, TransactionDate, Amount, DepositorWithdraw) VALUES (12, '212', NULL, NULL, NULL);
INSERT INTO CustomerTransaction(TransactionId, AccountNumber, TransactionDate, Amount, DepositorWithdraw) VALUES (13, '222', NULL, NULL, NULL);
GO

-- Query to get customers living in 'Hanoi'
SELECT * FROM Customer WHERE City = 'Hanoi';
GO

-- Query to get account information
SELECT 
    Customer.Name, 
    Customer.Phone, 
    Customer.Email, 
    CustomerAccount.AccountNumber, 
    CustomerAccount.Balance
FROM 
    Customer
INNER JOIN 
    CustomerAccount ON Customer.CustomerId = CustomerAccount.CustomerId;

-- Create CHECK constraint
ALTER TABLE CustomerTransaction
ADD CONSTRAINT CHECK_Amount CHECK (Amount > 0 AND Amount <= 1000000);
GO

-- Create vCustomerTransactions view
CREATE VIEW vCustomerTransactions AS
SELECT 
    Customer.Name, 
    CustomerAccount.AccountNumber, 
    CustomerTransaction.TransactionDate, 
    CustomerTransaction.Amount, 
    CustomerTransaction.DepositorWithdraw
FROM 
    Customer
INNER JOIN 
    CustomerAccount ON Customer.CustomerId = CustomerAccount.CustomerId
INNER JOIN 
    CustomerTransaction ON CustomerAccount.AccountNumber = CustomerTransaction.AccountNumber;