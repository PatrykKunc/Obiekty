import jdk.dynalink.beans.StaticClass;

import java.util.Scanner;

public class Main {
    public static  void main(String[] args)
    {
        Muzyka muzyka_1=new Muzyka();
        Muzyka muzyka_2=new Muzyka("Rock");
        Muzyka muzyka_3=new Muzyka(140,"Trap",true);

        muzyka_1.speak();
        muzyka_2.speak();
        muzyka_3.speak();


    }
}