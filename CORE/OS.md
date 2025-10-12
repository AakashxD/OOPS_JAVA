# important Concepts

- An Operating System is system software that acts as an intermediary between users and computer hardware, managing all hardware and software resources while providing common services for application programs
- # Virtual Machine
A virtual machine (VM) is software that emulates a complete computer system, allowing multiple operating systems to run simultaneously on a single physical machine.

- Hypervisor (Virtual Machine Monitor) sits between hardware and VMs, managing resource allocation

- Each VM has its own virtual CPU, memory, storage, and network interfaces

- VMs are completely isolated from each other
- #  Kernel
The kernel is the core component of an operating system that acts as a bridge between hardware and software applications. It's the first program loaded after bootloader and remains in memory until shutdown, operating in privileged kernel mode.

- Monolithic Kernel: All OS services run in kernel space (faster). Example: Linux, Unix​

- Microkernel: Minimal kernel; most services in user space (more stable). Example: Minix​

- Hybrid Kernel: Mix of both approaches. Example: Windows, macOS
- # Multiprocessing
Running multiple processes simultaneously on multiple CPUs/cores. Each process has independent memory and resources.

Example: A web server handling multiple client requests using separate processes, each isolated from others.

Key Point: Parallelism with separate memory spaces.

- #  Multithreading
Running multiple threads within a single process. Threads share the same memory and resources but execute independently.

Example: A web browser using separate threads for UI rendering, downloading files, and executing JavaScript simultaneously.

Key Point: Lightweight, shared memory, faster context switching than processes.

- # Multiprogramming
Multiple programs loaded in memory simultaneously. CPU switches between them when one waits for I/O to maximize utilization.

Example: While Program A waits for disk I/O, CPU executes Program B, ensuring no idle time.

Key Point: Maximizes CPU utilization by reducing idle time.

- # Multitasking
CPU rapidly switches between multiple tasks, giving each a time slice (quantum), creating the illusion of parallel execution.

Example: Running a music player, text editor, and browser simultaneously on a single-core CPU.

Key Point: Time-sharing to achieve concurrency on limited CPUs.

- # Program vs Process vs Thread
Program: Static executable code stored on disk (blueprint).

Process: Running instance of a program with dedicated memory, PID, and resources.

Thread: Lightweight execution unit within a process sharing its memory space.

Example: Chrome.exe (program) → Running Chrome instance (process) → Each tab running as separate thread.





# CPU Scheduling

-   CPU scheduling is the process of deciding which process gets to use the CPU when multiple are waiting for execution.

# ⚡ Preemptive Scheduling
- The CPU can be taken away from a running process and given to another process.

- The scheduler can interrupt an ongoing process if a higher priority process arrives or its time quantum expires.

- CPU is not given for the entire burst time, only for a small slice or until a condition triggers preemption.

- Examples:

1. Round Robin (RR)

2. Shortest Remaining Time First (SRTF)

3. Preemptive Priority Scheduling

🧩 Advantages:

Better response time for interactive systems.

Prevents CPU monopolization by one process.

Improves fairness among processes.

⚠️ Disadvantages:

More context switching overhead.

Processes’ states need to be saved and restored frequently.

May cause starvation for low-priority processes.

# 🕒 Non-Preemptive Scheduling

- Once a process gets the CPU, it keeps it until it finishes or voluntarily releases it (e.g., I/O request).


- The scheduler cannot interrupt a running process.

- The CPU is allocated for the entire CPU burst of the process.

# Examples:

First-Come, First-Served (FCFS)

Shortest Job First (SJF)

Non-Preemptive Priority Scheduling

🧩 Advantages:

Simple to implement.

No overhead from context switching.

Predictable process execution order.

⚠️ Disadvantages:

Poor response time.

One long process can block all others (Convoy effect).

Not suitable for time-sharing systems.



# Deadlock
- deadloxk is a situation where two or more processes are permanently blocked, each waiting for a resource held by another process in the set, creating a circular dependency where none can proceed.​

Four Necessary Conditions (Coffman Conditions)
All four must occur simultaneously for deadlock:

Mutual Exclusion: Resources can only be used by one process at a time​

Hold and Wait: Process holds at least one resource while waiting for additional resources held by others​

No Preemption: Resources cannot be forcibly taken away; must be released voluntarily​

Circular Wait: Circular chain of processes, each waiting for a resource held by the next process in the chain

# method to prevent deadlock
- Locks/Mutexes: Locks or mutexes (mutual exclusions) provide a simple and 
effective way to achieve mutual exclusion. They allow only one process or 
thread to acquire the lock at a time  ensuring exclusive access to a shared 
resource or critical section. Locks can be implemented using hardware 
instructions or software constructs.