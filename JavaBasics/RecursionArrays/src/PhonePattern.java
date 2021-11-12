import java.util.ArrayList;
import java.util.List;

public class PhonePattern {
    public static void main(String[] args) {
        String[] map = {null,null,"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> res = new ArrayList<>();

        pattList("","23",map, res);
        System.out.println(res);
    }

//    static void patt(String p, String up, String[] map){
//        if (up.isEmpty()){
//            System.out.println(p);
//            return;
//        }
//        int digit = up.charAt(0) - '0';
//        String code = map[digit];
//
//        for (int i = 0; i < code.length(); i++) {
//            char ch = code.charAt(i);
//            patt(p+ch,up.substring(1),map);
//        }
//
//
//    }

    static void pattList(String p, String up, String[] map,List<String> res){
        if (up.isEmpty()){
            res.add(p);
            return;
        }
        int digit = up.charAt(0) - '0';
        String code = map[digit];

        for (int i = 0; i < code.length(); i++) {
            char ch = code.charAt(i);
            pattList(p+ch,up.substring(1),map,res);
        }


    }

}
