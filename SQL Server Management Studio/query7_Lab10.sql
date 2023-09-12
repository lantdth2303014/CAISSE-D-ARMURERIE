USE AdventureWorks2022 
GO

-------------------- LAB_10 ---------------------------------------------------------------/
DROP PROCEDURE IF EXISTS Display_Customers
GO

CREATE PROCEDURE Display_Customers 
AS 
SELECT CustomerID, AccountNumber, rowguid, ModifiedDate 
from Sales.Customer 
-- Kết quả: Command(s) completed successfully. 
EXECUTE Display_Customers
-- Kết quả: Hiển thị dữ liệu của bảng Customer
GO



-------------------------------------------------------------------------------------------/
-- Extended stored procedures
EXECUTE xp_fileexist 'c:\myTest.txt'
GO

-- System stored procedures
EXECUTE sys.sp_who
GO

-------------------- Ví dụ 1 ----------------------------------------------------------------/

--Tạo một thủ tục lưu trữ lấy ra toàn bộ nhân viên vào làm theo năm có tham số đầu vào là một năm
DROP PROCEDURE IF EXISTS sp_DisplayEmployeesHireYear
GO

CREATE PROCEDURE sp_DisplayEmployeesHireYear @HireYear int -- a parameter

AS -- begins the body of the stored procedure
SELECT * FROM HumanResources.Employee
WHERE DATEPART(YY, HireDate)=@HireYear
GO
--Để chạy thủ tục này cần phải truyền tham số vào là năm mà nhân viên vào làm
EXECUTE sp_DisplayEmployeesHireYear 2003
GO

-------------------- Ví dụ 2 ----------------------------------------------------------------/

--Tạo thủ tục lưu trữ đếm số người vào làm trong một năm xác định có tham số đầu vào là một năm, tham số đầu ra là số người vào làm trong năm này
DROP PROCEDURE IF EXISTS sp_EmployeesHireYearCount
GO

CREATE PROCEDURE sp_EmployeesHireYearCount @HireYear int, @Count int OUTPUT --an output parameter that will store the count of employees.
AS

SELECT @Count=COUNT(*) FROM HumanResources.Employee
WHERE DATEPART(YY, HireDate)=@HireYear
GO
--Chạy thủ tục lưu trữ cần phải truyền vào 1 tham số đầu vào và một tham số đầu ra.
DECLARE @Number int -- when you execute the stored procedure, you need to provide a variable (@Number in this case) to capture the output value
EXECUTE sp_EmployeesHireYearCount 2003, @Number OUTPUT
PRINT @Number -- is used to print the value of @Number, which now holds the count of employees
GO

-------------------- Ví dụ 3 ----------------------------------------------------------------/

--Tạo thủ tục lưu trữ đếm số người vào làm trong một năm xác định có tham số đầu vào là một năm, hàm trả về số người vào làm năm đó
DROP PROCEDURE IF EXISTS sp_EmployeesHireYearCount2
GO

CREATE PROCEDURE sp_EmployeesHireYearCount2 @HireYear int
AS

DECLARE @Count int
SELECT @Count=COUNT(*) FROM HumanResources.Employee
WHERE DATEPART(YY, HireDate)=@HireYear
RETURN @Count
GO
--Chạy thủ tục lưu trữ cần phải truyền vào 1 tham số đầu và lấy về số người làm trong năm đó.
DECLARE @Number int
EXECUTE @Number = sp_EmployeesHireYearCount2 2003
PRINT @Number
GO
--Tạo bảng tạm #Students
DROP TABLE IF EXISTS #Students
GO

CREATE TABLE #Students
(
RollNo varchar(6) CONSTRAINT PK_Students PRIMARY KEY,
FullName nvarchar(100),


Birthday datetime constraint DF_StudentsBirthday DEFAULT 
DATEADD(yy, -18, GETDATE())
)
GO

-------------------- Ví dụ 4 ----------------------------------------------------------------/

--Tạo thủ tục lưu trữ tạm để chèn dữ liệu vào bảng tạm
DROP PROCEDURE IF EXISTS #spInsertStudents
GO

CREATE PROCEDURE #spInsertStudents
@rollNo varchar(6),
@fullName nvarchar(100),
@birthday datetime
AS 

BEGIN
IF NOT EXISTS (SELECT 1 FROM #Students WHERE RollNo = @rollNo)

BEGIN
IF(@birthday IS NULL)
	SET @birthday=DATEADD(YY, -18, GETDATE())
	INSERT INTO #Students(RollNo, FullName, Birthday)
	VALUES(@rollNo, @fullName, @birthday)
	END
ELSE
    BEGIN
    PRINT 'RollNo ' + @rollNo + ' already exists in the #Students table.'
    END
	END
GO
--Sử dụng thủ tục lưu trữ để chèn dữ liệu vào bảng tạm
EXEC #spInsertStudents 'A12345', 'abc', NULL
EXEC #spInsertStudents 'A54321', 'abc', '12/24/2011'
SELECT * FROM #Students
GO

-------------------- Ví dụ 5 ----------------------------------------------------------------/

--Tạo thủ tục lưu trữ tạm để xóa dữ liệu từ bảng tạm theo RollNo
DROP PROCEDURE IF EXISTS #spDeleteStudents
GO

CREATE PROCEDURE #spDeleteStudents @rollNo varchar(6)
AS 

BEGIN
DELETE FROM #Students WHERE RollNo=@rollNo
END
--Xóa dữ liệu sử dụng thủ tục lưu trữ
EXECUTE #spDeleteStudents 'A12345'
GO

-------------------- Ví dụ 5 ----------------------------------------------------------------/

--Tạo một thủ tục lưu trữ sử dung lệnh RETURN để trả về một số nguyên
CREATE PROCEDURE Cal_Square @num int=0 
AS

BEGIN
RETURN (@num * @num);
END
GO

--Chạy thủ tục lưu trữ
DECLARE @square int;
EXEC @square = Cal_Square 10;
PRINT @square;
GO

--Xem định nghĩa thủ tục lưu trữ bằng hàm OBJECT_DEFINITION
SELECT 
OBJECT_DEFINITION(OBJECT_ID('HumanResources.uspUpdateEmployeePersonalInfo')) AS DEFINITION

--Xem định nghĩa thủ tục lưu trữ bằng
SELECT definition FROM sys.sql_modules
WHERE 
object_id=OBJECT_ID('HumanResources.uspUpdateEmployeePersonalInfo')
GO

--Thủ tục lưu trữ hệ thống xem các thành phần mà thủ tục lưu trữ phụ thuộc
sp_depends 'HumanResources.uspUpdateEmployeePersonalInfo'
GO
