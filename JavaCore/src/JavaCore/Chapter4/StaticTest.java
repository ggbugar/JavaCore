package JavaCore.Chapter4;

public class StaticTest {
    static final int MaxStaffNumber=10;
    public static void main(String[] args) {

        SEmployee[] staff=new SEmployee[MaxStaffNumber];
        for (int i=0;i<MaxStaffNumber;i++){
            staff[i]=new SEmployee("Robot",10000);
        }
        //print information
        for(SEmployee e:staff){
            e.setId();
            System.out.println("name:"+e.getName()+",id:"+e.getId()+",salary:"+e.getSalary());
        }

        int n=SEmployee.getNextId();
        System.out.println("next available id is "+n);
    }

}

class  SEmployee{
    public SEmployee(String n,double s){
        this.name=n;
        this.salary=s;
        id=0;
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

    public int getId() {
        return id;
    }

    public void setId(){
        id=nextId;
        nextId++;
    }

    public static int getNextId(){
        return nextId;
    }

    public static void main(String[] args) {
        SEmployee e=new SEmployee("bob",7500);
        e.setId();
        System.out.println(e.getName()+" "+e.getId()+" "+e.getSalary());
    }

    private final String name;
    private double salary;
    int id;
    private static int nextId=1;
}
