Thread Pool Pattern
===================

The thread pool pattern is a design pattern in which a number of threads are created to perform a number of tasks, which are usually organized in a queue. The results from the tasks being executed might also be placed in a queue, or the tasks might return no result. Typically, there are many more tasks than threads. As soon as a thread completes its task, it will request the next task from the queue until all tasks have been completed. The thread can then terminate, or sleep until there are new tasks available.