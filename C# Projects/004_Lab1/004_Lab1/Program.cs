using System;

// Customer class
class Customer
{
    public string CustomerID { get; set; }
    public string FullName { get; set; }
    public DateTime InvoiceDate { get; set; }

    public Customer(string id, string name, DateTime invoiceDate)
    {
        CustomerID = id;
        FullName = name;
        InvoiceDate = invoiceDate;
    }

    // PrintInfo method
    public virtual void PrintInfo()                                          // "virtual" = override-able
    {
        Console.WriteLine($"Customer ID: {CustomerID}");
        Console.WriteLine($"Full Name: {FullName}");
        Console.WriteLine($"Invoice Date: {InvoiceDate}");
    }
}

// VietnameseCustomer class
class VietnameseCustomer : Customer
{
    public int Consumption { get; set; }
   
    public VietnameseCustomer(string id, string name, DateTime invoiceDate, int consumption)
        : base(id, name, invoiceDate)
    {
        Consumption = consumption;
    }

    // CalculateTotal method
    public double CalculateTotal()
    {
        double total = 0;

        if (Consumption <= 50)
        {
            total = Consumption * 1000;
        }
        else if (Consumption <= 100)
        {
            total = (50 * 1000) + ((Consumption - 50) * 1200);
        }
        else if (Consumption <= 200)
        {
            total = (50 * 1000) + (50 * 1200) + ((Consumption - 100) * 1500);
        }
        else
        {
            total = Consumption * 2000;
        }

        return total;
    }

    //Override PrintInfo method
    public override void PrintInfo()
    {
        base.PrintInfo();
        Console.WriteLine($"Consumption: {Consumption}");
    }
}

// ForeignCustomer class
class ForeignCustomer : Customer
{
    public int Consumption { get; set; }

    public ForeignCustomer(string id, string name, DateTime invoiceDate, int consumption)
        : base(id, name, invoiceDate)
    {
        Consumption = consumption;
    }

    //CalculateTotal method
    public double CalculateTotal()
    {
        return Consumption * 2000;
    }

    //Override PrintInfo method
    public override void PrintInfo()
    {
        base.PrintInfo();
        Console.WriteLine($"Consumption: {Consumption}");
    }
}

// Main class
class Program
{
    static void Main(string[] args)
    {
        // Example usage
        VietnameseCustomer vnCustomer = new VietnameseCustomer("VN001", "Nguyen Van A", new DateTime(2024, 2, 22), 50);
        vnCustomer.PrintInfo();
        Console.WriteLine($"Total for Vietnamese customer: {vnCustomer.CalculateTotal()}");

        Console.WriteLine();

        ForeignCustomer foreignCustomer = new ForeignCustomer("FR001", "John Smith", new DateTime(2024, 2, 22), 50);
        foreignCustomer.PrintInfo();
        Console.WriteLine($"Total for foreign customer: {foreignCustomer.CalculateTotal()}");

        Console.ReadKey();
    }
}