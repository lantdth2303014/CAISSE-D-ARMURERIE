using System;
using System.Collections.Generic;

// Define the structure for storing medicine information
class Medicine
{
    public string Name { get; set; }
    public int Quantity { get; set; }
    public decimal Price { get; set; }
    public string Category { get; set; }
    public Dictionary<string, int> Ingredients { get; set; }

    // Constructor to initialize medicine properties
    public Medicine(string name, int quantity, decimal price, string category, Dictionary<string, int> ingredients)
    {
        Name = name;
        Quantity = quantity;
        Price = price;
        Category = category;
        Ingredients = ingredients;
    }
}

class Program
{
    static List<Medicine> medicineList = new List<Medicine>();

    static void Main(string[] args)
    {
        // Implementation of the application's functionalities
        // Add new medicine
        AddNewMedicine("Paracetamol", 100, 10.5m, "Painkiller", new Dictionary<string, int> { { "Paracetamol", 500 } });

        // Display medicine list by category
        DisplayMedicineByCategory("Painkiller");

        // Display medicine details
        DisplayMedicineDetails("Paracetamol");

        // Search for medicine
        SearchMedicine("Paracetamol");

        // Update medicine information
        UpdateMedicine("Paracetamol", 50, 12.5m, new Dictionary<string, int> { { "Paracetamol", 500 }, { "Inactive Ingredient", 50 } });

        // Delete medicine
        DeleteMedicine("Paracetamol");
    }

    // Function to add a new medicine to the list
    static void AddNewMedicine(string name, int quantity, decimal price, string category, Dictionary<string, int> ingredients)
    {
        Medicine newMedicine = new Medicine(name, quantity, price, category, ingredients);
        medicineList.Add(newMedicine);
    }

    // Function to display medicines by category
    static void DisplayMedicineByCategory(string category)
    {
        Console.WriteLine($"Medicines under category: {category}");
        foreach (var medicine in medicineList)
        {
            if (medicine.Category == category)
            {
                Console.WriteLine($"Name: {medicine.Name}, Quantity: {medicine.Quantity}, Price: {medicine.Price}");
            }
        }
    }

    // Function to display details of a specific medicine
    static void DisplayMedicineDetails(string name)
    {
        foreach (var medicine in medicineList)
        {
            if (medicine.Name == name)
            {
                Console.WriteLine($"Medicine: {medicine.Name}");
                Console.WriteLine($"Quantity: {medicine.Quantity}, Price: {medicine.Price}, Category: {medicine.Category}");
                Console.WriteLine("Ingredients:");
                foreach (var ingredient in medicine.Ingredients)
                {
                    Console.WriteLine($"{ingredient.Key}: {ingredient.Value}mg");
                }
            }
        }
    }

    // Function to search for a medicine by name
    static void SearchMedicine(string name)
    {
        foreach (var medicine in medicineList)
        {
            if (medicine.Name == name)
            {
                Console.WriteLine($"Medicine Found: {medicine.Name}");
                DisplayMedicineDetails(name);
                return;
            }
        }
        Console.WriteLine($"Medicine '{name}' not found.");
    }

    // Function to update medicine information
    static void UpdateMedicine(string name, int newQuantity, decimal newPrice, Dictionary<string, int> newIngredients)
    {
        foreach (var medicine in medicineList)
        {
            if (medicine.Name == name)
            {
                medicine.Quantity = newQuantity;
                medicine.Price = newPrice;
                medicine.Ingredients = newIngredients;
                Console.WriteLine($"Medicine '{name}' updated successfully.");
                return;
            }
        }
        Console.WriteLine($"Medicine '{name}' not found for updating.");
    }

    // Function to delete a medicine from the list
    static void DeleteMedicine(string name)
    {
        for (int i = 0; i < medicineList.Count; i++)
        {
            if (medicineList[i].Name == name)
            {
                medicineList.RemoveAt(i);
                Console.WriteLine($"Medicine '{name}' deleted successfully.");
                return;
            }
        }
        Console.WriteLine($"Medicine '{name}' not found for deletion.");
    }
}
