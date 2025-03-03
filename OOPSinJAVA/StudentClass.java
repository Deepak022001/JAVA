package OOPSinJAVA;

import java.util.Scanner;

public class StudentClass {
//    creating a new data type
    public static class Student{
        String name;
        int rno;
        double percent;
    }
static void function(Student x){
    System.out.println(x.name);
    return;
}
    public static void main(String[] args) {
        Student x= new Student();
        x.name="Deepak";
        x.rno=7;
        x.percent=74.8;
//        ugly thing will print
        System.out.println(x);

        function(x);
        Scanner sc = new Scanner(System.in);

        System.out.println(x.name);
    }
}
