package ExplocitStatic;

import ExplocitStatic.Cups;

public class ExplicitStatic {
    public static void main(String[] args){
        System.out.println("main()");
        Cups.cup1.f(99);//1
    }
    /*static Cups cups1=new Cups();//2
    static Cups cups2=new Cups();//2
    */
}
