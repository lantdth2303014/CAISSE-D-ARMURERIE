using System;

// Base class
class Animal
{
    protected double weight;
    protected string name;

    public Animal()
    {
        weight = 0;
        name = "Unknown";
    }

    public Animal(double weight, string name)
    {
        this.weight = weight;
        this.name = name;
    }

    public void SetMe(double weight, string name)
    {
        this.weight = weight;
        this.name = name;
    }

    public virtual void Show()
    {
        Console.WriteLine($"Name: {name}, Weight: {weight} kg");
    }
}

// Lion class
class Lion : Animal
{
    public Lion(double weight, string name) : base(weight, name)
    {
    }

    public override void Show()
    {
        Console.WriteLine($"Lion - Name: {name}, Weight: {weight} kg");
    }
}

// Tiger class
class Tiger : Animal
{
    public Tiger(double weight, string name) : base(weight, name)
    {
    }

    public override void Show()
    {
        Console.WriteLine($"Tiger - Name: {name}, Weight: {weight} kg");
    }
}

// Main class
class Program
{
    static void Main(string[] args)
    {
        Lion lion = new Lion(200, "Simba");
        Tiger tiger = new Tiger(180, "Shere Khan");

        Animal[] animals = new Animal[] { lion, tiger };

        foreach (Animal animal in animals)
        {
            animal.Show();
        }
        Console.ReadKey();
    }
}
