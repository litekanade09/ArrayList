import java.util.ArrayList;
public class Maximum {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(1);
        list.add(7);
        list.add(5);

        int max = Integer.MIN_VALUE;
        for(int  i = 0;i < list.size();i++){
//            if(max < list.get(i)){
//                max = list.get(i);
//            }
            max = Math.max(max,list.get(i));
        }
        System.out.print(max);
    }
}
