package JavaCore.Chapter4;

import java.util.Date;
import java.util.GregorianCalendar;

public class EmployeeTest {
    public static void main(String[] args) {
        //fill staff with three employees
        Employee[] staff=new Employee[3];

        staff[0]=new Employee("Bob",75000,2020,12,12);
        staff[1]=new Employee("Mary",75000,2020,11,11);
        staff[2]=new Employee("Bolt",750000,1998,1,13);

        //raise everyone's salary
        for (Employee e:staff){
            e.raiseSalary(5);
        }
        //print information about all employees
        for (Employee e:staff){
            System.out.println("name="+e.getName()+",salary="+e.getSalary()+",hirDay="+e.getHireDay());

        }
    }

}


class Employee{

    public static void main(String[] args) {
        Employee e=new Employee("Bob",7500,2022,3,5);
        e.setSalary(10000);
        e.raiseSalary(5);
        System.out.println("name="+e.getName()+",salary="+e.getSalary()+",hirDay="+e.getHireDay());
    }

    public Employee(String n,double s,int year,int month,int day){
        name=n;
        salary=s;
        GregorianCalendar calendar=new GregorianCalendar(year,month-1,day);
        //GGregorianCalendar uses 0 for January
        hireDay=calendar.getTime();
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void raiseSalary(double byPercent){
        this.salary=this.salary*(1+byPercent/100);
    }

    public Date getHireDay() {
        return hireDay;
    }

    private final String name;
    private double salary;
    private final Date hireDay;
}