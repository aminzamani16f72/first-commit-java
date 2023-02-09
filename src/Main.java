import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Addable addable = (int p1, int p2)->(p1+p2);
        

        Addable ad1=(int a,int b)->(a+b);
        System.out.println(ad1.add(10,20));

        List<String> list=new ArrayList<String>();

        list.add("mayank");
        list.add("irfan");
        list.add("jai");
        list.add("jai");
        list.add("jai");
        list.forEach(
                (n)->System.out.println(n+2)
        );
    }


}
interface Addable{
    int add(int a,int b);
}