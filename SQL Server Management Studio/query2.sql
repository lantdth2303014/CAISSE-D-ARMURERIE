IF EXISTS (SELECT * FROM sys.databases WHERE Name LIKE 'Example5')
BEGIN
    -- Set the Example5 database to SINGLE_USER mode to disconnect any active connections
    USE master;
    ALTER DATABASE Example5 SET SINGLE_USER WITH ROLLBACK IMMEDIATE;
    -- Drop the Example5 database
    DROP DATABASE Example5;
END
GO

CREATE DATABASE Example5
GO

USE Example5
GO

-- DDL: CREATE, ALTER, DROP
-- DML: INSERT, UPDATE, DELETE
-- CTRL + /
-- DATATYPE IN SQL
-- Tạo bảng Lớp học
DROP TABLE IF EXISTS LopHoc
GO

CREATE TABLE LopHoc(MaLopHoc INT PRIMARY KEY IDENTITY, TenLopHoc VARCHAR(10))
GO

SELECT * FROM LopHoc
GO

INSERT INTO LopHoc(TenLopHoc) VALUES ('T2009M')
SELECT * FROM LopHoc
UPDATE LopHoc SET TenLopHoc = 'T2209M'
WHERE MaLopHoc = 1002
DELETE FROM LopHoc WHERE MaLopHoc = 1002
GO


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