using System;


// namespace AtCoder
// {
//     class Program
//     {
//        static void Main(string[] args)
//        {
            var str = Console.ReadLine()!.toCharArray();
            Console.WriteLine(str + "が入力されました");

            var dictionary = new Dictionary<String, int>();
            foreach (String letter in str.Split(""))
            {
                Console.WriteLine(letter + "を処理します");

                if (dictionary.ContainsKey(letter))
                {
                    Console.WriteLine("true");
                }
                else
                {
                    Console.WriteLine("false");
                }
            }
            //{
            //    Console.WriteLine(letter);    
            //    if (dictionary.ContainsKey(letter))
            //    {
            //        Console.WriteLine(true);    
            //    }
            //    else
            //    {
            //        Console.WriteLine(false);    
            //    }  
            //}

//            foreach (var letter in chars)
//            {
//                if (map.ConstainsKey(i))
//                {
//                    map.add(i, map[i].Value + 1);
//                }
//            }

//            var result = -1;
//            var result2 = "";
//            foreach (var j in map)
//            {
//                if (j.Value == 1)
//                {
//                    result = 1;
//                    result2 = j.Key;
//                    break;
//                }
//            }
//        }
//    }
// }
