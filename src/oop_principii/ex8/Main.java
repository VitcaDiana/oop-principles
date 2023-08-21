package oop_principii.ex8;

public class Main {
    public static void main(String[] args) {
        Adress adress1 = new Adress("Los Angeles","rich street",1);
        Adress adress2 = new Adress("Los Angeles","5 avenue",2);
        Employee employee1 = new Employee("Ana","Pop",10000,adress1);
        Employee employee2 = new Employee("Maria","Popescu",10000,adress2);
        Employee[] firstDepEmpList = {employee2,employee1};
        //System.out.println(employee1.getName());
       // System.out.println(employee1.getAdressStreet());
        Department department = new Department("Dep1",firstDepEmpList,2);
        Department department1 = new Department("Dep2",firstDepEmpList,2);
//        department.printAllEmployees();
//        department.printStreetEmployees();
        Department[] departments = {department,department1};
        Company company = new Company("Company1",2007,departments,2);
        company.printAllEmployeesStreetByDepartment("Dep1");
        System.out.println(employee1.addressAttributes());
        System.out.println(department.numberOfEmployessByDepartment());
        System.out.println(employee1.getAdress());
        department.printAllEmployees();
        System.out.println(department.searchAndPrintEmployeeByName("Maria Popescu"));
        System.out.println(department.printEmployeAdress("Maria Popescu"));
        System.out.println(department.searchAdressByStreet("5 avenue"));
        company.printAllDepartments();
    }
}
