package JavaCore.Chapter4;

/**
 *constructor test
 *tester: lxb
 */
public class ConstructorTest {
    public static void main(String[] args) {
        CEmployee staff[]=new CEmployee[3];

        staff[0]=new CEmployee();
        staff[1]=new CEmployee("Bob",7500);
        staff[2]=new CEmployee(100);

        for (CEmployee e:staff){
            System.out.println("name:"+e.getName()+",id:"+e.getNextId()+",salary:"+e.getSalary());
        }
    }
}

class CEmployee{
    //default constructor
    CEmployee(){
    }

    CEmployee(String name,double salary){
        this.name=name;
        this.salary=salary;
    }

    CEmployee(double salary){
        this("Robot",salary);
    }

    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void raiseSalary(double byPercent){
        salary=salary*(1+byPercent/100);
    }

    public void setId(int id){
        this.id=id;
    }

    public int getNextId(){
        return id;
    }

    {
        id=nextId;
        nextId++;
    }
    static
    {
        nextId=1;
    }
    private String name;
    private double salary;
    private int id;
    private static int nextId;
}
