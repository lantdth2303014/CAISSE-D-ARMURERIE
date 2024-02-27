/*
Viết một ứng dụng console cho phép người dùng tạo danh sách các công việc cần làm. 
Mỗi công việc sẽ có một trạng thái (đã hoàn thành hoặc chưa hoàn thành). 
Khi trạng thái của một công việc được thay đổi, ứng dụng sẽ thông báo cho người dùng.

Yêu cầu:

Sử dụng delegate và event để theo dõi sự thay đổi trạng thái của công việc. 
Cung cấp các chức năng sau:
    +) Thêm công việc mới vào danh sách.
    +) Hiển thị danh sách các công việc cùng trạng thái của chúng.
    +) Đánh dấu một công việc là đã hoàn thành hoặc chưa hoàn thành.
    +) Khi trạng thái của một công việc thay đổi, hiển thị thông báo về thay đổi đó.
*/

// Program starts
using System;
using System.Collections.Generic;

namespace TaskManager
{
    // Delegate reference
    public delegate void TaskStatusChangedEventHandler(object sender, TaskStatusChangedEventArgs e);

    // Task class
    public class Task
    {
        public string Name { get; set; }
        public bool IsCompleted { get; set; }

        public Task(string name)
        {
            Name = name;
            IsCompleted = false;      // Default = incomplete
        }

        // ToggleStatus method
        public void ToggleStatus()
        {
            IsCompleted = !IsCompleted;
        }
    }

    // TaskStatusChanged class 
    public class TaskStatusChangedEventArgs : EventArgs
    // EventArgs = .NET Framework built-in class, doesn't contain any data.
    // EventArgs = placeholder class for creating custom event argument classes that carry additional information about an event.
    {
        public Task Task { get; }
        public TaskStatusChangedEventArgs(Task task)
        {
            Task = task;
        }
    }

    // TaskManager class
    public class TaskManager
    {
        public event TaskStatusChangedEventHandler TaskStatusChanged;

        private List<Task> tasks;

        public TaskManager()
        {
            tasks = new List<Task>();
        }

        // AddTask method
        public void AddTask(string name)
        {
            Task newTask = new Task(name);
            tasks.Add(newTask);
        }

        // DisplayTasksByStatus method
        public void DisplayTasksByStatus(bool isCompleted)
        {
            string status = isCompleted ? "completed" : "incomplete";       // '?' = conditional operator
            Console.WriteLine($"Tasks {status}:");
            foreach (var task in tasks)
            {
                if (task.IsCompleted == isCompleted)
                {
                    Console.WriteLine($"- {task.Name}");
                }
            }
        }

        // ToggleTaskStatus method
        public void ToggleTaskStatus(string name)
        {
            Task task = tasks.Find(t => t.Name == name);
            if (task != null)
            {
                task.ToggleStatus();
                OnTaskStatusChanged(new TaskStatusChangedEventArgs(task));
            }
        }

        // OnTaskStatusChanged method
        protected virtual void OnTaskStatusChanged(TaskStatusChangedEventArgs e)
        {
            TaskStatusChanged?.Invoke(this, e);
        }
    }

    // Main class
    class Program
    {
        static void Main(string[] args)
        {
            TaskManager taskManager = new TaskManager();

            // Subscribe to the task status changed event
            taskManager.TaskStatusChanged += TaskManager_TaskStatusChanged;

            // Add some tasks to the list
            taskManager.AddTask("Write an article");
            taskManager.AddTask("Do homework");
            taskManager.AddTask("Read a book");

            // Display the list of incomplete tasks
            taskManager.DisplayTasksByStatus(false);

            // Toggle the status of a task to completed
            taskManager.ToggleTaskStatus("Write an article");

            // Display the list after changing the status of a task
            taskManager.DisplayTasksByStatus(false);
            taskManager.DisplayTasksByStatus(true);
        }

        // Handle the task status changed event
        private static void TaskManager_TaskStatusChanged(object sender, TaskStatusChangedEventArgs e)
        {
            string status = e.Task.IsCompleted ? "completed" : "incomplete";
            Console.WriteLine($"The status of the task '{e.Task.Name}' has been changed to {status}");
        }
    }
}
