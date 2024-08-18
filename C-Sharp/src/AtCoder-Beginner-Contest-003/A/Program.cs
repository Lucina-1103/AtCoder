using System;

namespace AtCoder
{
    class Program
    {
        static void Main(string[] args)
        {
            int task = int.Parse(Console.ReadLine());

            Console.WriteLine( ( task * 10000 + 10000 ) / 2 );
        }
    }
}
