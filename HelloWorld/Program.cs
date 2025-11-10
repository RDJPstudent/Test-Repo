// See https://aka.ms/new-console-template for more information
Console.Write("Enter your name: ");
string name = Console.ReadLine();

if (string.IsNullOrWhiteSpace(name))
{
    Console.WriteLine("You Didn't type a name!");
}
else if (name.ToLower() == "steve")
{
    Console.WriteLine("Hey Steve! Great to see you again!");
}
else
{
    Console.WriteLine($"Welcome, {name}!");
}
