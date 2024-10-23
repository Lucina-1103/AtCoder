using System;

var num = int.Parse(Console.ReadLine()!);

string result = "expert";
if (0  <= num && num < 40) result = (40 - num).ToString();
if (40 <= num && num < 70) result = (70 - num).ToString();
if (70 <= num && num < 90) result = (90 - num).ToString();

Console.WriteLine(result);
