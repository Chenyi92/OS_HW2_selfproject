# OS_HW2_633
## Introduction_the goal
like the Q417

## Introduction_the detail
In this modified program(modified from Q417), we added a lock variable of type threading.Lock() to protect the shared global variable circle_points and total_points. We acquire the lock before updating the shared variables and release the lock after updating them, to ensure that only one thread can access the shared variables at a time. This way, we can avoid race conditions and ensure that the results are correct.

## Usage
Type down the following instruction on terminal to execute:
'''python
python3 Q633.py
'''

## Output
This piece of code is used to estimate pi using the Monte Carlo method and prints the estimated value of pi in the terminal. Since the randomly generated points are different each time the program is executed, the output value may vary. However, it typically comes very close to the true value of pi, which is 3.14.

Here are some examples:
Output:
'''
3.140979
'''
Output:
'''
3.142288
'''
