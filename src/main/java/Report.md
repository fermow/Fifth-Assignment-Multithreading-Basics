Qes1:
Our output will be like this:
Calling run()  
Running in: main  
Calling start()  
Running in: Thread-2  

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
