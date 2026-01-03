# 📂 Mini Project: Employee → Manager → Director

A simple and clean Java mini project to understand **Inheritance**, **super keyword**, and **Method Overriding**.

---

## 🎯 Project Goal

This project helps you understand:

* Multi-level Inheritance
* super() constructor
* Method Overriding
* Clean OOP structure

---

## 📁 Folder Structure

```
EmployeeManagement/
 ├── Employee.java
 ├── Manager.java
 ├── Director.java
 └── Main.java
```

---

## 🧠 Concepts Used

### 🔹 Inheritance

Manager inherits from Employee
Director inherits from Manager

### 🔹 `super()`

Used to call parent constructors

### 🔹 Method Overriding

Each class has its own version of `work()` method

---

## 💻 Code Summary

### **Employee.java**

```
public class Employee{
    String name;
    int id;

    // parameterized constructor
    Employee(String name, int id){
        this.name = name;
        this.id = id;
    }
    // method to display employee details
    void work(){
        System.out.println(name + " is working");
    }
}
```

### **Manager.java**

```
public class Manager extends Employee{
    // parameterized constructor
    Manager(String name, int id){
        super(name, id); // calling parent class constructor
    }
    // here we override the work method 
    @Override
    void work(){
        System.out.println(name + " is managing the team.");
    }

    void teamMeeting(){
        System.out.println( name + " is organizing a team meeting." );
    }
    
}
```

### **Director.java**

```
public class Director extends Manager{

    //parameterized constructor
    Director(String name, int id){
        super(name, id); // calling parent class constructor

    }

    // overriding the work method
    @Override
    void work(){
        System.out.println(name + " is directing the company.");
    }       
    void strategicPlanning(){
        System.out.println(name + " is planning the company's strategy.");
    }
    
}

```

### **Main.java**

```
public class Main {
    
    public static void main(String args[]){

        // Creating objects of Employee, Manager, and Director classes
        Employee emp = new Employee("Alam", 510);
        Manager mgr = new Manager("Aashiq", 210);
        Director dir = new Director("Avid", 110);

        // Calling work method on each object
        System.out.println("\n--- Employee ---");
        emp.work();

        System.out.println("\n--- Manager ---");
        mgr.work();
        mgr.teamMeeting();

        System.out.println("\n--- Director --");
        dir.work();
        dir.strategicPlanning();

    }
}

```

---

## 📝 Output

```
--- Employee ---
Alam is working

--- Manager ---
Aashiq is managing the team.
Aashiq is organizing a team meeting.

--- Director --
Avid is directing the company.
Avid is planning the company's strategy.
```

---

## ⭐ Why This Project is Useful?

* Clears concept of overriding
* Shows real-life hierarchy representation
* Helpful for interviews
* Perfect for Core Java OOP revision

---

🎯 What You Practiced

✔ OOP basics
✔ Inheritance
✔ Method overriding
✔ super keyword
✔ Clean project structure

```

☑️ Next Steps

Add more roles (Intern → Employee → Manager → Director)

Add bonus, department, ID fields

Add methods like promote(), displayInfo()


