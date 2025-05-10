Qes1:
***
Our output will be like this:
Calling run()  
Running in: main  
Calling start()  
Running in: Thread-2
***
This happens because when we call the run() method,
it is as if we are executing the program from a class directly within the main thread.
However, when we call the start() method,
a new thread is created that runs in parallel with the main thread.
That's why in the output,
when run() is called,
we can see that the program is still running in the main thread. 
But when start() is called,
it creates a new thread named Thread-2,
which runs concurrently.
***

Qes2:
***
When we call the setDaemon(true) method,
it means that this thread will terminate when the main thread finishes.

Therefore, there's no guarantee that the message
"Daemon thread running..."
will be printed 20 times completely.

Most likely, fewer than 20 messages will be printed.
So, the output will show that when the main thread ends, the daemon thread also ends.
***

It’s clear that by removing setDaemon(true), the program will behave normally again:
the program will run with two threads (main & the created thread) running in parallel,
and both will continue independently.

The program will terminate only after both threads finish.
***

For example, imagine a company where the main working hours are controlled by the main thread.
During this time, several other threads handle customer service tasks.
These threads can be set as daemon threads, so that when the working hours end (i.e., when the main thread finishes), the customer service threads also stop automatically and don’t continue running in the background.

This way, background tasks are tied to the lifecycle of the main application, and unnecessary operations are avoided once the core program ends.
***






