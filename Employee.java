// Base class

class Employee{
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