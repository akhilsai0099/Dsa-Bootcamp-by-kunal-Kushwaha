import java.util.ArrayList;

public class JumpGameVII {
    public static void main(String[] args) {
        String s = "01";
        int minJump = 1, maxJump = 1;
        System.out.println(canReach(s, minJump, maxJump));
    }

    static boolean canReach(String s, int minJump, int maxJump) {
        if(s.charAt(s.length()-1) != '0') return false;
        ArrayList<Integer> difference = new ArrayList<>();
        int counter= 1;
        for (int i = 0; i < s.length(); i++) {
            if (i == 0) difference.add(0);
            else if (s.charAt(i) == '0') {
                difference.add(i);
                counter++;
            }
        }
        for (int i = 1; i<difference.size(); i++)
            if (!(difference.get(i) - difference.get(i-1)>= minJump && difference.get(i) - difference.get(i-1)<= maxJump)) return false;

        return true;
    }
}
