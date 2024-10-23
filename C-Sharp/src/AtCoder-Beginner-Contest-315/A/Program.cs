using System;

var str = Console.ReadLine()!;

str = str.Replace("a", "");
str = str.Replace("i", "");
str = str.Replace("u", "");
str = str.Replace("e", "");
str = str.Replace("o", "");

Console.WriteLine(str);
