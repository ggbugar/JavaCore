package JavaCore.Chapter4;

/**
 * Java的参数按值传递，没由按引用传递
 */

public class ParamTest {
    public static void main(String[] args) {

    }

    /**
     * can not work
     * @param x
     * @param y
     */
    public static void swap(int x,int y){
        int temp=x;
        x=y;
        y=temp;
    }

    /**
     * can not work too
     * you can't swap two objects
     * you can only swap their values
     * @param x
     * @param y
     */
    public static void swap(Employee x,Employee y){
        Employee temp=x;
        x=y;
        y=temp;
    }

    /**
     * this can swap x and y's salary
     * @param x
     * @param y
     */
    public static void swap(SEmployee x,SEmployee y){
        double tempSalary=x.getSalary();
        x.setSalary(y.getSalary());
        y.setSalary(tempSalary);
    }
}


