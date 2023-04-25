# OS_HW2_421
## Introduction_the goal
This program aims to generate Fibonacci sequence in multithreaded way.
The Fibonacci sequence is the series of numbers 0, 1, 1, 2, 3, 5, 8, … . Formally, it can be expressed as:fib0=0fib1=1fibn=fibn-1+fibn-2
## Introduction_detail
Firstly, the program prompts the user to enter the number of Fibonacci numbers that they want to generate. This input is stored in the variable num.

Next, the program creates an array fibArray of size num to hold the Fibonacci sequence that will be generated by the program.

After that, the program creates a new instance of the FibonacciThread class and passes num and fibArray as arguments to its constructor. This thread is started by calling the start() method on the FibonacciThread instance.

The FibonacciThread class extends the Thread class and overrides the run() method. The run() method generates the Fibonacci sequence up to the specified num and stores the sequence in the fibArray array. This array is shared between the main thread and the FibonacciThread thread.

Once the FibonacciThread thread completes its execution, the main thread waits for it to join by calling the join() method on the FibonacciThread instance.

After the FibonacciThread thread has completed and the main thread has joined it, the main thread outputs the Fibonacci sequence by iterating through the fibArray array and printing each element separated by a space.

Finally, the main thread prints a new line character to move to the next line in the output.

## Usage
To run this program just first type down the following command on terminal:
'''java
javac.FibonacciThread.java
'''
then type down the following comman on terminal to execute it:
'''java
java.FibonacciThread
'''

## Output
First, when the terminal show "Enter the number of Fibonacci numbers to generate:", user should enter the number of Fibonacci numbers(input) that they want to generate.
Then, the program will print the Fibonacci sequence.

Here is an example
Input:
'''
10
'''
Output:
'''
0 1 1 2 3 5 8 13 21 34 
'''


