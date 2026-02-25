package Two_Pointers_Problem_Set;

import java.util.ArrayList;
import java.util.Collections;

public class Triplet_Sum_TwoPointers {

    public static void main(String[] args) {

        ArrayList<Integer> triplet_Sum = new ArrayList<>();
        triplet_Sum.add(0);
        triplet_Sum.add(-1);
        triplet_Sum.add(2);
        triplet_Sum.add(-3);
        triplet_Sum.add(1);

        ArrayList<ArrayList<Integer>> result = triplet_sum(triplet_Sum);

        System.out.println(result + "\n Total triplets count :" +result.size());
    }

    public static ArrayList<ArrayList<Integer>> triplet_sum(ArrayList<Integer> triplet_Sum) {

        ArrayList<ArrayList<Integer>> triplets = new ArrayList<>();

        Collections.sort(triplet_Sum);

        for (int i = 0; i < triplet_Sum.size(); i++) {

            if (triplet_Sum.get(i) > 0) {
                break;
            }

            if (i > 0 && triplet_Sum.get(i).equals(triplet_Sum.get(i - 1))) {
                continue;
            }

            ArrayList<ArrayList<Integer>> pairs =
                    pair_sum_sorted_all_pairs(triplet_Sum, i + 1, -triplet_Sum.get(i));

            for (ArrayList<Integer> pair : pairs) {
                ArrayList<Integer> triplet = new ArrayList<>();
                triplet.add(triplet_Sum.get(i));
                triplet.addAll(pair);
                triplets.add(triplet);
            }
        }

        return triplets;
    }

    public static ArrayList<ArrayList<Integer>> pair_sum_sorted_all_pairs(
            ArrayList<Integer> nums, int start, int target) {

        ArrayList<ArrayList<Integer>> pairs = new ArrayList<>();

        int left = start;
        int right = nums.size() - 1;

        while (left < right) {

            int sum = nums.get(left) + nums.get(right);

            if (sum == target) {

                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(nums.get(left));
                pair.add(nums.get(right));
                pairs.add(pair);

                left++;

                while (left < right &&
                        nums.get(left).equals(nums.get(left - 1))) {
                    left++;
                }

            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return pairs;
    }
}