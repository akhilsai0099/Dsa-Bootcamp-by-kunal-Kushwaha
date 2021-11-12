public class Patterns {
    public static void main(String[] args) {
        triangle1(0,0, 4 );
    }

    static void triangle(int r, int c){
        if (r == 0) return;

        if (c < r) {
            System.out.print("* ");
            triangle(r, c+1);
        }
        else{
            System.out.println();
            triangle(r-1 , 0);
        }
    }

    static void triangle1(int r, int c, int n){
        if (r == n) return;

        if (c < r+1) {
            System.out.print("* ");
            triangle1(r, c+1,n);
        }
        else{
            System.out.println();
            triangle1(r+1 , 0,n);
        }
    }
}
