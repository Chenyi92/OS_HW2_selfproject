import threading
import random

total_points = 0
circle_points = 0
lock = threading.Lock()

def generate_points(num_points):
    global circle_points, total_points
    circle_count = 0
    for i in range(num_points):
        x = random.uniform(-1, 1)
        y = random.uniform(-1, 1)
        if x*x + y*y <= 1:
            circle_count += 1
    lock.acquire()
    circle_points += circle_count
    total_points += num_points
    lock.release()

num_threads = 4
num_points_per_thread = 1000000

threads = []
for i in range(num_threads):
    thread = threading.Thread(target=generate_points, args=(num_points_per_thread,))
    threads.append(thread)
    thread.start()

for thread in threads:
    thread.join()

if total_points == 0:
    print("Error: total_points is 0")
else:
    pi_estimate = 4 * circle_points / total_points
    print(pi_estimate)
