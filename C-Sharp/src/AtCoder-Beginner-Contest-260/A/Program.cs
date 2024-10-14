using System;

var str = Console.ReadLine()!.ToCharArray();;

var dictionary = new Dictionary<char, int>();

for (int i = 0; i < str.Length; i++)
{
    if (dictionary.ContainsKey(str[i]))
    {
        dictionary[str[i]]++;
    }
    else
    {
        dictionary.Add(str[i], 1);
    }
}

var onceFlg = false;
foreach (char letter in dictionary.Keys)
{
    if (dictionary[letter] == 1)
    {
        Console.WriteLine(letter);
        onceFlg = true;
        break;
    }
}

if (!onceFlg)
{
    Console.WriteLine(-1);
}
