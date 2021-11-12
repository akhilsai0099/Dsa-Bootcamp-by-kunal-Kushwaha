import java.util.ArrayList;
import java.util.List;

public class KidsWithGreatestNumberOfChocolates {
    public static void main(String[] args) {
        int[] candies = {4,2,1,1,2};
        int extraCandies = 1;
        kidsWithCandies(candies,extraCandies);

    }
    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int greatest = Integer.MIN_VALUE;
        for (int candy : candies) {
            greatest = Integer.max(greatest, candy);
        }

        List<Boolean> result = new ArrayList<>();
        for (int candy : candies) {
            result.add((candy + extraCandies) >= greatest);
        }
        return result;
    }
}
