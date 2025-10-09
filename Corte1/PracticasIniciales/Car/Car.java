package carross;

public class Car {
    //atributos
    private String company_name;
    private String model_name;
    private int year;
    private double millage;
    //get and setters
    public String getCompany_Name(){
        return this.company_name;
    }
    
    public String getModel_Name(){
        return this.model_name;
    }
    
    public int getYear(){
        return this.year;
    }
    
    public double getMillage(){
        return this.millage;
    }
    
    public void setCompany_Name(String company_name){
        this.company_name = company_name;
    }
    
    public void setModel_Name(String model_name){
        this.model_name = model_name;
    }
    
    public void setYear(int year){
        this.year = year;
    }
    
    public void setMillage(double millage){
        this.millage = millage;
    }
    
}
