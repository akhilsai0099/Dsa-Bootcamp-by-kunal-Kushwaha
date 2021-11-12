public class StepsToReduceToZero {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(8));
    }

    static int numberOfSteps(int num) {
        int counter = 0;
        if (num == 0) return 0;
        if(num %2 == 0){
            num /=2;
            counter++;
        }
        else{
            num-=1;
            counter++;
        }

        counter +=numberOfSteps(num);
        return counter;
    }
}
