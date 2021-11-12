import java.util.Arrays;

public class Strings {
    public static void main(String[] args) {
        String ip= "192.168.1.2";
        StringBuilder sb = new StringBuilder();
        for(char ch : ip.toCharArray()){
            if(ch == '.')
                sb.append("[.]");
            else
                sb.append(ch);
        }



    }
    }
