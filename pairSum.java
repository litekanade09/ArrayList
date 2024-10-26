import java.util.ArrayList;
public class pairSum {
    public static boolean pair(ArrayList<Integer>list,int target){
//        int lp = 0;
//        int rp = list.size() - 1;
//        while(lp != rp){
//            //case1
//            if(list.get(lp) + list.get(rp) == target){
//                return true;
//            }
//            if(list.get(lp) + list.get(rp) < target){
//                lp++;
//            }else{
//                rp--;
//            }
//        }
//        return false;

        //2 Pointer Approach : Time Complexity = O(n)
        int bp = -1;
        int n = list.size() ;
        for(int i = 0;i< list.size();i++){
            if(list.get(i) > list.get(i + 1)){
                bp = i;
                break;
            }
        }
        int lp = bp + 1;
        int rp = bp;

        while(lp != rp){
            //caes1
            if(list.get(lp) + list.get(rp) == target){
                return true;
            }
            if(list.get(lp) + list.get(rp) < target){
              lp = (lp + 1) % n;
            }else{
                rp = (n + rp -1) % n;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target = 1;
        System.out.print(pair(list,target));
    }
}
