
import java.util.*;

public class ArrayListTest {
    public static void main(String[]args){
        List<Integer> list=new ArrayList<Integer>();
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        for (int i=0;i< list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
