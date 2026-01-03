// here create a Manager class that inherits from Employee class
// Manager is a subclass of Employee

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
