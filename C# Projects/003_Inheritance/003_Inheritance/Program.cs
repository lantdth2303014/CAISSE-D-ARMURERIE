using System;

namespace MyFirstProgram
{
    class Program
    {
        static void Main(string[] args)
        {
            // inheritance = 1 or more child classes recieving fields, methods, etc. from a common parent

            AR XM7 = new AR();
            SMG Vityaz = new SMG();
            DMR M110 = new DMR();

            Console.WriteLine(XM7.chamber);
            Console.WriteLine(XM7.mag);
            XM7.Fire();
            Console.WriteLine();

            Console.WriteLine(Vityaz.chamber);
            Console.WriteLine(Vityaz.mag);
            Vityaz.Fire();
            Console.WriteLine();

            Console.WriteLine(M110.chamber);
            Console.WriteLine(M110.mag);
            M110.Fire();
            Console.WriteLine();

            Console.ReadKey();
        }
    }
    class Firearms
    {
        public int chamber = 0;
        public int mag = 0;

        public virtual void Fire()
        {
            if (chamber == 0)
            {
                Console.WriteLine("There's nothing inside the chamber...");
            }
            else
            {
                Console.WriteLine("A round went off...");
            }
        }
    }

    class AR : Firearms
    {
        // contructor way
        public AR()
        {
            chamber = 1;
            mag = 30;
        }
    }

    class SMG : Firearms
    {
        // initialize variable way
        public int mag = 50;
    }

    class DMR : Firearms
    {
        // contructor way
        public DMR()
        {
            mag = 10;
        }
    }
}