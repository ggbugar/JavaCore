package JavaCore.Chapter3;

public class StringTest {
    public static void main(String[] args) {
        String e="";//an empty string
        System.out.println(e);
        String greeting="Hello";
        System.out.println(greeting);
        //substring
        String s=greeting.substring(0,3);
        System.out.println(s);
        //join
        String expletive="Expletive";
        String PG13="deleted";
        String message=expletive+PG13;
        System.out.println(message);
        //join with integer
        int age=13;
        String rating=expletive+age;
        System.out.println(rating);
        System.out.println(age+rating);
        //Immutable string 不可变字符串
        //there do not exist any method that can change the string

        //use equals() to compare whether two strings are equal
        System.out.println("Hello".equals(greeting));
        System.out.println("Hello".equalsIgnoreCase("hello"));
        System.out.println(greeting=="Hello");
        System.out.println(greeting.substring(0,3)=="Hel");
        /**
         * difference:
         * equals() compares  whether the contents of two strings are equal
         * "==" checks whether the two strings are the same object in memory
         */
        //code points and code units
        //length() 返回采用UTF-16编码表示的给定字符串所需代码单元数量
        int n=greeting.length();//n=5
        //codePointCount() 返回代码点数量 为实际长度
        int cpCount=greeting.codePointCount(0,greeting.length());
        //charAt(n) 返回位置n的代码单元 n介于0~length()-1
        System.out.println(greeting.charAt(0));
        System.out.println(greeting.charAt(4));
        //to get the No.i code point
        int i=3;
        int index=greeting.offsetByCodePoints(0,i);
        int cp=greeting.codePointAt(index);
        //String API
        //...

        //use StringBuilder to build String which contains of lots of short strings
        StringBuilder builder=new StringBuilder();
        char ch='c';
        String str="str";
        builder.append('c');
        builder.append(ch);
        builder.append("str");
        builder.append(str);
        //toString()
        String completed=builder.toString();
        /**
         * StringBuilder important API
         * StringBuilder();
         * int length();
         * StringBuilder append(char c);
         * StringBuilder appendCodePoint(int cp);
         * void setCharAt(int i,char c);
         * StringBuilder insert(int offset,String str);
         * StringBuilder insert(int offset,char c);
         * StringBuilder delete(int startIndex,int endIndex);
         * String toString();
         */

    }
}
