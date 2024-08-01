/*using System;

class Welcome
{
    static void Main()
    {
        //Console.WriteLine("Hello\nHi\nBye");
        String name;
        name = "Gayani";
        Console.WriteLine($"My name is {name} " );

    }
}*/

using System;

class Welcome2
{
    static void Main()
    {
        int num1, num2, sum;
        Console.WriteLine("Please enter first number ");

        num1 = int.Parse(Console.ReadLine());

        Console.WriteLine("Please enter second number ");
        num2 = int.Parse(Console.ReadLine());

        sum = num1 + num2;

        Console.WriteLine($"Sum = " + sum);
    }
}