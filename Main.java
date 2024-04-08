import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static int numIdenticalPairs(ArrayList<Integer> nums) {
        int ammount = 0;

        for(int i = 0; i < nums.size(); i++) {
            for(int j = 0; j < nums.size(); j++) {
                if(nums.get(i).intValue() == nums.get(j).intValue() && i < j) {
                    ammount++;
                }
            }
        }
        return ammount;
    }

    public static ArrayList<Integer> shuffleArray(ArrayList<Integer> nums, int n) {
        boolean xOrY;

        for(int i = 0; i < nums.size(); i++) {

        }
    }

    public static void main(String[] args) {

        ArrayList<Integer> nums1 = new ArrayList<>();
        ArrayList<Integer> nums2 = new ArrayList<>();
        ArrayList<Integer> nums3 = new ArrayList<>();

        nums1.addAll(Arrays.asList(1,2,3,1,1,3));
        //System.out.println(nums1);
        nums2.addAll(Arrays.asList(1,1,1,1));
        //System.out.println(nums2);
        nums3.addAll(Arrays.asList(1,2,3));
        //System.out.println(nums3);

        System.out.println(numIdenticalPairs(nums1));
        System.out.println(numIdenticalPairs(nums2));
        System.out.println(numIdenticalPairs(nums3));

        //-----------------------------------------------------

        ArrayList<Integer> nums3 = new ArrayList<>();
        nums3.addAll(Arrays.asList(2,5,1,3,4,7));






    }
}