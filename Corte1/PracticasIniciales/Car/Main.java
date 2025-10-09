package carross;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
               
        //set values with set methods   ******car1
        car1.setCompany_Name("Renault");
        car1.setModel_Name("Duster");
        car1.setYear(2025);
        car1.setMillage(15500.9);
        //car2 set vallues
        car2.setCompany_Name("Chevrolet");
        car2.setModel_Name("Cruze");
        car2.setYear(2023);
        car2.setMillage(12000.6);
        //car3 set values
        car3.setCompany_Name("BWM");
        car3.setModel_Name("X4");
        car3.setYear(2023);
        car3.setMillage(20000);
        //print values //car1
        System.out.println("Car #1\n");
        System.out.println("Company: " + car1.getCompany_Name());
        System.out.println("Model: " + car1.getModel_Name());
        System.out.println("Year: " + car1.getYear());
        System.out.println("Millage: " + car1.getMillage());
        //print values //car2
        System.out.println("Car #2\n");
        System.out.println("Company: " + car2.getCompany_Name());
        System.out.println("Model: " + car2.getModel_Name());
        System.out.println("Year: " + car2.getYear());
        System.out.println("Millage: " + car2.getMillage());
        //print values //car3
        System.out.println("Car #3\n");
        System.out.println("Company: " + car3.getCompany_Name());
        System.out.println("Model: " + car3.getModel_Name());
        System.out.println("Year: " + car3.getYear());
        System.out.println("Millage: " + car3.getMillage());
        
    }
    
}
