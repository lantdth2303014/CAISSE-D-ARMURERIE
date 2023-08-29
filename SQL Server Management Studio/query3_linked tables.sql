
-- create databases
IF EXISTS (SELECT * FROM sys.databases WHERE Name LIKE 'Example')
BEGIN
    -- Set the 3xample database to SINGLE_USER mode to disconnect any active connections
    USE master;
    ALTER DATABASE Example SET SINGLE_USER WITH ROLLBACK IMMEDIATE;
    -- Drop the Example5 database
    DROP DATABASE Example;
END
GO

CREATE DATABASE Example
GO

USE Example
GO

-- create Category table
DROP TABLE IF EXISTS Category
GO

CREATE TABLE Category(id INT PRIMARY KEY IDENTITY, name NVARCHAR(10)) -- PRIMARY KEY = unique key aka can't be repeated
GO

SELECT * FROM Category
GO

INSERT INTO Category(name) VALUES ('DMR')
SELECT * FROM Category
UPDATE Category SET name = 'BR'
WHERE id = 1370
DELETE FROM Category WHERE id = 1370
GO

-- create SinhVien table
DROP TABLE IF EXISTS SinhVien
GO

CREATE TABLE SinhVien(MaSV int PRIMARY KEY, TenSV nvarchar(250), ClassCode int, CONSTRAINT fk FOREIGN KEY (ClassCode) REFERENCES LopHoc(MaLopHoc))
GO

INSERT INTO SinhVien(MaSV, TenSV, ClassCode) VALUES (1, 'Minh', 1);
INSERT INTO SinhVien(MaSV, TenSV, ClassCode) VALUES (3, 'Hoa', 1);
INSERT INTO SinhVien(MaSV, TenSV, ClassCode) VALUES (14, 'Minh', 1), (16, 'Linh', 1);
SELECT * FROM SinhVien
SELECT * FROM LopHoc
GO