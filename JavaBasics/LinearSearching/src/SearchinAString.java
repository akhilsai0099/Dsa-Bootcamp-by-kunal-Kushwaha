public class SearchinAString {
    public static void main(String[] args) {
        String name = "Akhil";
        char target = 'A';
        System.out.println(search(name, target));
    }
    static int search(String name, char target){
        if (name.length() ==0){
            return -1;
        }

        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == target){
                return i;
            }
        }
        return -1;
    }
}
