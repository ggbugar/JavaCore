package JavaCore.Chapter3;

public class Constants2 {
    //使用static final设置类常量，该类的多个方法均可以用该常量
    static final double CM_PER_INCH=2.45;
    public static void main(String[] args) {
        double paperWidth=8.5;
        double paperHeight=11;
        System.out.println("Paper size in centimeters:"
                +paperWidth*CM_PER_INCH+" by "+paperHeight*CM_PER_INCH);
    }
}
