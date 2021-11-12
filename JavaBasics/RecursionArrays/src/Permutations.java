import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {
        int count = 0;
        System.out.println(permutationsArrayList("","abc",count));
        System.out.println(count);
    }
    
    static void permutations(String p, String up){
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {

            String f = p.substring(0,i);
            String l = p.substring(i, p.length());
            permutations(f+ch+l,up.substring(1));
        }
    }

    static List<String> permutationsArrayList(String p, String up,int count){
        if (up.isEmpty()) {
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        List<String> ans = new ArrayList<>();
        for (int i = 0; i <= p.length(); i++) {

            String f = p.substring(0,i);
            String l = p.substring(i, p.length());
            ans.addAll(permutationsArrayList(f+ch+l,up.substring(1),count+1));
        }
        return ans;
    }
}
