// here we are creating a subclass Director that inherits from the Manager class

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
