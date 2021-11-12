public class ExcelColumnTitle {
    public static void main(String[] args) {
        int column = 701;
//        System.out.println((char) (64+ 52%26));
//        System.out.println((char)(64+52/26));
        System.out.println(convertToTitle(column));
        System.out.println(((float) column/26));
    }
    static String convertToTitle(int columnNumber) {
        StringBuilder builder = new StringBuilder();
        if (columnNumber <= 26) return  String.valueOf((char) (64+columnNumber));
        while(columnNumber > 26){
            if (((float)columnNumber / 26) > (float) 26) {
                builder.append((char)(64+((columnNumber%26 == 0) ? 26: columnNumber%26)));
                columnNumber /= 26;
            }
            else{
                builder.append((char)(64+((columnNumber%26 == 0) ? 26: columnNumber%26)));
                builder.append((char)(64+columnNumber/27));
                columnNumber /= 26;
            }
        }
        return builder.reverse().toString();
    }

    static String convertTitle(int columnNumber){
        StringBuilder sb = new StringBuilder();

        int n = columnNumber;

        while(n>0){
            int r = n%26;
            if(r==0){
                r+=26;
                n=n-1;
            }
            char c = (char)(r+64);
            sb.append(c);

            n = n/26;
        }
        sb.reverse();
        return sb.toString();
    }

}
