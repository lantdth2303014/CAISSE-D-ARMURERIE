/*
Delegate = method reference:
    +) A delegate in C# is like a pointer to a method. It holds a reference to a method that matches its signature (parameter types and return type).
    +) You can think of a delegate as a way to refer to a method by its name, without actually calling it.

Passing Methods as Parameters:
    +) Delegates allow you to pass methods as parameters to other methods.
    +) For example, you can have a method that takes a delegate as a parameter
        and when you call that method, you pass in the method you want it to execute. (basically a method can call another method)

Dynamic Invocation:
    +) Delegates enable dynamic method invocation. This means you can decide which method to call at runtime, based on conditions or user input.
    +) You can assign different methods to the same delegate variable and invoke them dynamically. 
    +) Single Delegate can only be a placeholder for 1 method at a time.
    +) Multicast Delegates can reference multiple methods.
*/

// Program starts
using System;

// Delegate reference
public delegate void MyDelegate(int x);

// MyClass class
public class MyClass
{
    // Example method 1:
    public static void Method1(int x)
    {
        Console.WriteLine($"Method1: {x}");
    }

    // Example method 2:
    public static void Method2(int x)
    {
        Console.WriteLine($"Method2: {x * 2}");
    }

    // Define a method that takes a delegate as a parameter
    public static void CallMethodWithDelegate(MyDelegate delegateInstance, int value)
    {
        Console.WriteLine("Inside CallMethodWithDelegate");
        delegateInstance(value);
    }
}

// Main class
class Program
{
    static void Main(string[] args)
    {
        // Declare a delegate variable
        MyDelegate delegateVariable;

        // Assign Method1 to the delegate
        delegateVariable = MyClass.Method1;

        // Invoke the delegate, which calls Method1
        delegateVariable(5); // Output: Method1: 5

        // Assign Method2 to the delegate
        delegateVariable = MyClass.Method2;

        // Call a method that indirectly invokes Method2 through the delegate
        MyClass.CallMethodWithDelegate(delegateVariable, 3);
    }
}
