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
