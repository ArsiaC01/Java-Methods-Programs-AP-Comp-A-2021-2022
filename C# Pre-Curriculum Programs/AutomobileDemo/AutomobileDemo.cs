using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AutomobileDemo
{
    internal class AutomobileDemo
    {
        public static void Main()
        {
            const int length = 8;
            Automobile[] autoArray = new Automobile[8]; 
            for(int i = 0; i < length; i++)
            {
                
                Console.WriteLine($"Input data for automobile {i}");
                Console.Write("Make: ");
                int make = Convert.ToInt32(Console.ReadLine());
                Console.Write("Year: ");
                int year = Convert.ToInt32(Console.ReadLine());
                Console.Write("Price: ");
                double price = Convert.ToDouble(Console.ReadLine());

                autoArray[i] = new Automobile(i, make, year, price);
            }

            foreach (Automobile auto in autoArray)
            {
                Console.WriteLine(auto.ToString());
                Console.WriteLine();
            }
        }
    }
}
