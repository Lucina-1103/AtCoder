using System;

var num = int.Parse(Console.ReadLine()!);

var maxNum = 0;
for (var i = 0; i < num; i++)
{
    var result = (num - i) * i;
    if (maxNum < result)
    {
        maxNum = result;
    }
}

Console.WriteLine(maxNum);
