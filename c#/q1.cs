//WACA that obtains 4 integer values from the user and displays the product
Using System;
namespace practical
{
        class Program
        {
                static void main(String[] args)
                {
                        Console.Writeline("Enter 4 numbers: ");
                        int a = Convert.ToInt32(Console.Readline());
                        int b = Convert.ToInt32(Console.Readline());
                        int c = Convert.ToInt32(Console.Readline());
                        int d = Convert.ToInt32(Console.Readline());
                        //Calculate and display product
                        int  total = a*b*c*d;
                        Console.Writeline("Product is: "+total);
                        Console.Readkey();
                }
        }
}
