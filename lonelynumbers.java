import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class lonelynumbers {
    public ArrayList<Integer> numbers(ArrayList<Integer> list){
        Collections.sort(list);
        ArrayList<Integer> nums = new ArrayList<>();
        if (list.size() == 1) {
            nums.add(list.get(0));
            return nums;
        }

        for (int i = 0; i < list.size(); i++) {
            if ((i == 0 || list.get(i - 1) + 1 < list.get(i)) &&
                    (i == list.size() - 1 || list.get(i) < list.get(i + 1) - 1)) {
                nums.add(list.get(i));
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(9);

       lonelynumbers ln = new lonelynumbers();
        ArrayList<Integer> result = ln.numbers(list);
        System.out.print(result);
    }
}
