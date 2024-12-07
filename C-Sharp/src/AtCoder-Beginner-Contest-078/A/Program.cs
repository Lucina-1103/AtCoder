using System;

string[] s = Console.ReadLine().Split();

var str1 = strAry[0];
var str2 = strAry[1];

var result = string.Compare(str1, str2);

switch (result)
{
    case -1:
        Console.WriteLine("<");
        break;
    case 0:
        Console.WriteLine("=");
        break;
    case 1:
        Console.WriteLine(">");
        break;
}
