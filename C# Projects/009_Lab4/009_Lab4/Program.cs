using System;
using System.Collections.Generic;
using System.Linq;

class Student
{
    public int Id { get; set; }
    public string Name { get; set; }
    public string Gender { get; set; }
    public int Age { get; set; }
    public double MathScore { get; set; }
    public double PhysicsScore { get; set; }
    public double ChemistryScore { get; set; }
    public double AverageScore => (MathScore + PhysicsScore + ChemistryScore) / 3;
    public string AcademicPerformance
    {
        get
        {
            if (AverageScore >= 8)
                return "Excellent";
            else if (AverageScore >= 6.5)
                return "Good";
            else if (AverageScore >= 5)
                return "Average";
            else
                return "Weak";
        }
    }
}

class Program
{
    static List<Student> students = new List<Student>();

    static void Main(string[] args)
    {
        bool exit = false;
        while (!exit)
        {
            Console.WriteLine("------ MENU ------");
            Console.WriteLine("1. Add a student");
            Console.WriteLine("2. Update student information by ID");
            Console.WriteLine("3. Delete a student by ID");
            Console.WriteLine("4. Search for a student by name");
            Console.WriteLine("5. Sort students by GPA");
            Console.WriteLine("6. Sort students by name");
            Console.WriteLine("7. Sort students by ID");
            Console.WriteLine("8. Display student list");
            Console.WriteLine("9. Exit");
            Console.WriteLine("------------------");
            Console.Write("Choose an option: ");
            int choice = Convert.ToInt32(Console.ReadLine());

            switch (choice)
            {
                case 1:
                    AddStudent();
                    break;
                case 2:
                    UpdateStudent();
                    break;
                case 3:
                    DeleteStudent();
                    break;
                case 4:
                    SearchByName();
                    break;
                case 5:
                    SortByGPA();
                    break;
                case 6:
                    SortByName();
                    break;
                case 7:
                    SortById();
                    break;
                case 8:
                    DisplayStudents();
                    break;
                case 9:
                    exit = true;
                    break;
                default:
                    Console.WriteLine("Invalid choice. Please choose again.");
                    break;
            }

            Console.WriteLine();
        }
    }

    static void AddStudent()
    {
        Console.WriteLine("Enter information for the new student:");
        Student newStudent = new Student();
        Console.Write("ID: ");
        newStudent.Id = Convert.ToInt32(Console.ReadLine());
        Console.Write("Name: ");
        newStudent.Name = Console.ReadLine();
        Console.Write("Gender: ");
        newStudent.Gender = Console.ReadLine();
        Console.Write("Age: ");
        newStudent.Age = Convert.ToInt32(Console.ReadLine());
        Console.Write("Math Score: ");
        newStudent.MathScore = Convert.ToDouble(Console.ReadLine());
        Console.Write("Physics Score: ");
        newStudent.PhysicsScore = Convert.ToDouble(Console.ReadLine());
        Console.Write("Chemistry Score: ");
        newStudent.ChemistryScore = Convert.ToDouble(Console.ReadLine());

        students.Add(newStudent);
        Console.WriteLine("Student added successfully!");
    }

    static void UpdateStudent()
    {
        Console.Write("Enter the ID of the student to update: ");
        int id = Convert.ToInt32(Console.ReadLine());
        Student student = students.FirstOrDefault(s => s.Id == id);
        if (student != null)
        {
            Console.WriteLine("Enter the updated information:");
            Console.Write("Name: ");
            student.Name = Console.ReadLine();
            Console.Write("Gender: ");
            student.Gender = Console.ReadLine();
            Console.Write("Age: ");
            student.Age = Convert.ToInt32(Console.ReadLine());
            Console.Write("Math Score: ");
            student.MathScore = Convert.ToDouble(Console.ReadLine());
            Console.Write("Physics Score: ");
            student.PhysicsScore = Convert.ToDouble(Console.ReadLine());
            Console.Write("Chemistry Score: ");
            student.ChemistryScore = Convert.ToDouble(Console.ReadLine());

            Console.WriteLine("Student information updated successfully!");
        }
        else
        {
            Console.WriteLine("Student with this ID not found.");
        }
    }

    static void DeleteStudent()
    {
        Console.Write("Enter the ID of the student to delete: ");
        int id = Convert.ToInt32(Console.ReadLine());
        Student student = students.FirstOrDefault(s => s.Id == id);
        if (student != null)
        {
            students.Remove(student);
            Console.WriteLine("Student deleted successfully!");
        }
        else
        {
            Console.WriteLine("Student with this ID not found.");
        }
    }

    static void SearchByName()
    {
        Console.Write("Enter the name of the student to search: ");
        string name = Console.ReadLine();
        List<Student> searchResults = students.Where(s => s.Name.ToLower().Contains(name.ToLower())).ToList();
        if (searchResults.Any())
        {
            Console.WriteLine("Search results:");
            DisplayStudents(searchResults);
        }
        else
        {
            Console.WriteLine("No student found with this name.");
        }
    }

    static void SortByGPA()
    {
        List<Student> sortedList = students.OrderBy(s => s.AverageScore).ToList();
        Console.WriteLine("Student list sorted by GPA:");
        DisplayStudents(sortedList);
    }

    static void SortByName()
    {
        List<Student> sortedList = students.OrderBy(s => s.Name).ToList();
        Console.WriteLine("Student list sorted by name:");
        DisplayStudents(sortedList);
    }

    static void SortById()
    {
        List<Student> sortedList = students.OrderBy(s => s.Id).ToList();
        Console.WriteLine("Student list sorted by ID:");
        DisplayStudents(sortedList);
    }

    static void DisplayStudents(List<Student> studentList = null)
    {
        List<Student> displayList = studentList ?? students;
        foreach (var student in displayList)
        {
            Console.WriteLine($"ID: {student.Id}, Name: {student.Name}, Gender: {student.Gender}, Age: {student.Age}, GPA: {student.AverageScore}, Academic Performance: {student.AcademicPerformance}");
        }
    }
}
