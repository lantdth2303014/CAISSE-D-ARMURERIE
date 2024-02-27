/*
#Tạo một lớp có tên Phone chứa những phương thức trừu tượng sau đây:

abstract void insertContact(String name, String number)
abstract void RemoveContact(String name)
abstract void UpdateContact(String name, String newnumber)
abstract void SearchContact(String name)
abstract void Sort()

#Tạo lớp có tên PhoneBook thừa kế lớp Phone:

Tạo một List tên PhoneList để lưu dữ liệu.
Phương thức InsertContact(String name, String number):
    +) Nếu tên người dùng (name) chưa có sẵn trong PhoneList thì thêm người dùng cùng số điện thoại (number) tương ứng vào
    +) Nếu tên người dùng đã có sẵn thì kiểm tra xem số điện thoại (number) có khác so với số đã có không, nếu chưa thì thêm vào
Phương thức RemoveContact(String name):
    +) Xóa người dùng cùng các số điện thoại của chủ sở hữu có tên (name) tương ứng khỏi PhoneList.
Phương thức UpdateContact(String name, String newNumber):
    +) Thay số điện thoại cũ bằng số điện thoại (newNumber) mới.
Phương thức SearchContact(String name):
    +) Tìm kiếm số điện thoại theo tên người dùng.
Phương thức Sort():
    +) Sắp xếp các phần tử trong PhoneList theo tên người dùng.
*/

// Program starts:
using System;
using System.Collections.Generic;
using System.Linq;

// Phone abstract class
public abstract class Phone
{
    public abstract void InsertContact(string name, string number);
    public abstract void RemoveContact(string name);
    public abstract void UpdateContact(string name, string newNumber);
    public abstract void SearchContact(string name);
    public abstract void Sort();
}

// PhoneBook class
public class PhoneBook : Phone
{
    private List<(string name, string number)> PhoneList = new List<(string, string)>();

    //InsertContact method
    public override void InsertContact(string name, string number)
    {
        // "FirstOrDefault" = retrieve the first element of a sequence based on a condition, or a default value if the sequence is empty/no element satisfies
        // "FirstOrDefault" method handles the iteration through the list internally.

        // using FirstOrDefault built-in LINQ method
        var existingEntry = PhoneList.FirstOrDefault(entry => entry.name == name);
        if (existingEntry.name == null)
        {
            PhoneList.Add((name, number));
        }
        else
        {
            PhoneList.RemoveAll(entry => entry.name == name);
            PhoneList.Add((name, number));
        }
    }

    // RemoveContact method
    public override void RemoveContact(string name)
    {
        PhoneList.RemoveAll(entry => entry.name == name);  // RemoveAll(entry 'by' entry.name 'equal' name);
    }

    // UpdateContact method
    public override void UpdateContact(string name, string newNumber)
    {
        for (int i = 0; i < PhoneList.Count; i++)
        {
            if (PhoneList[i].name == name)
            {
                PhoneList[i] = (name, newNumber);
            }
        }
    }

    //SearchContact method
    public override void SearchContact(string name)
    {
        var result = PhoneList.Where(entry => entry.name == name).Select(entry => entry.number).ToList();
        if (result.Count > 0)
        {
            Console.WriteLine($"Phone numbers for {name}:");
            foreach (var phone in result)
            {
                Console.WriteLine(phone);
            }
        }
        else
        {
            Console.WriteLine($"No phone numbers found for {name}.");
        }
    }

    public override void Sort()
    {
        PhoneList.Sort((x, y) => string.Compare(x.name, y.name));
    }

    public void PrintPhoneList()
    {
        Console.WriteLine("Phone List:");
        foreach (var entry in PhoneList)
        {
            Console.WriteLine($"Name: {entry.name}, Phone: {entry.number}");
        }
    }
}

// Main class
class Program
{
    static void Main(string[] args)
    {
        // Example usage
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.InsertContact("John", "123456789");
        phoneBook.InsertContact("Alice", "987654321");
        phoneBook.InsertContact("John", "999999999");

        phoneBook.SearchContact("John");

        phoneBook.RemoveContact("Alice");

        phoneBook.UpdateContact("John", "111111111");

        phoneBook.Sort();

        phoneBook.PrintPhoneList();
    }
}
