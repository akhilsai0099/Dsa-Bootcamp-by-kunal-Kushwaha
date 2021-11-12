public class AverageSalary {
    public static void main(String[] args) {
        int[] arr ={48000,59000,99000,13000,78000,45000,31000,17000,39000,37000,93000,77000,33000,28000,4000,54000,67000,6000,1000,11000};
        System.out.println(average(arr));
    }

    static double average(int[] salary) {
        int maxSalary = Integer.MIN_VALUE;
        int minSalary = Integer.MAX_VALUE;

        for(int i = 0; i < salary.length; i++){
            maxSalary = Integer.max(maxSalary , salary[i]);
            minSalary = Integer.min(minSalary,salary[i]);
        }
        double sum = 0;
        int totalNumberOfValues = 0;
        for(int i = 0; i < salary.length; i++){
            if(salary[i] != maxSalary && salary[i] != minSalary){
                sum += salary[i];
                totalNumberOfValues++;
            }
        }
        return (sum/totalNumberOfValues);
    }
}
