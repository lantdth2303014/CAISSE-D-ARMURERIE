using System;

namespace GeometryExample
{
    // Main class
    class Program
    {
        static void Main(string[] args)
        {
            Cylinder cylinder = new Cylinder();

            cylinder.Process();

            cylinder.DisplayResult();

            Console.ReadKey();
        }
    }

    // Cylinder class
    class Cylinder
    {
        public double Radius { get; set; }
        public double Height { get; set; }
        public double BaseArea { get; private set; }
        public double LateralArea { get; private set; }
        public double TotalArea { get; private set; }
        public double Volume { get; private set; }

        public void Process()
        {
            // Input radius and height
            Console.WriteLine("Enter the radius of the cylinder:");
            Radius = Convert.ToDouble(Console.ReadLine());

            Console.WriteLine("Enter the height of the cylinder:");
            Height = Convert.ToDouble(Console.ReadLine());

            // Calculate properties
            BaseArea = Radius * Radius * Math.PI;
            LateralArea = 2 * Math.PI * Radius * Height;
            TotalArea = 2 * Math.PI * Radius * (Height + Radius);
            Volume = Math.PI * Radius * Radius * Height;
        }

        // Method to display result
        public void DisplayResult()
        {
            Console.WriteLine("\nResults:");
            Console.WriteLine("Base Area: " + BaseArea.ToString("F2"));
            Console.WriteLine("Lateral Area: " + LateralArea.ToString("F2"));
            Console.WriteLine("Total Area: " + TotalArea.ToString("F2"));
            Console.WriteLine("Volume: " + Volume.ToString("F2"));
        }
    }
}
