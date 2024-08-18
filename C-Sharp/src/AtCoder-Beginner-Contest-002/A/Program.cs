using System;

namespace AtCoder
{
    class Program
    {
        static void Main(string[] args)
        {
            var array = Console.ReadLine().Split(' ');

            int x = int.Parse(array[0]);
            int y = int.Parse(array[1]);

            Console.WriteLine(Math.Max(x, y));
        }
    }
}
