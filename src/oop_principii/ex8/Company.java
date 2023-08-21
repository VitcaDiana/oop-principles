package oop_principii.ex8;
import java.time.LocalDate;
public class Company {
    private String name;
    private int yearFounded;
    private Department[] departments;
    private int numberOfDepartmentsadded;

    public Company(String name, int yearFounded, Department[] departments, int numberOfDepartmentsadded) {
        this.name = name;
        this.yearFounded = yearFounded;
        this.departments = departments;
        this.numberOfDepartmentsadded = numberOfDepartmentsadded;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearFounded() {
        return yearFounded;
    }

    public void setYearFounded(int yearFounded) {
        this.yearFounded = yearFounded;
    }

    public Department[] getDepartments() {
        return departments;
    }

    public void setDepartments(Department[] departments) {
        this.departments = departments;
    }

    public int getNumberOfDepartmentsadded() {
        return numberOfDepartmentsadded;
    }

    public void setNumberOfDepartmentsadded(int numberOfDepartmentsadded) {
        this.numberOfDepartmentsadded = numberOfDepartmentsadded;
    }

    public void printAllEmployeesStreetByDepartment(String departmentName){
        //cautam departamentul in lista de departamente a companiei pe care se apeleaza metoda
        //pe dep gasit aplez metoda de printAllEmployessStreet
        for (int i=0; i< numberOfDepartmentsadded;i++){
            departments[i].printStreetEmployees();
        }
        

    }
    public void printAllDepartments(){
        for (int i=0;i<numberOfDepartmentsadded;i++){
            System.out.println(departments[i].getName());
        }
    }
}
