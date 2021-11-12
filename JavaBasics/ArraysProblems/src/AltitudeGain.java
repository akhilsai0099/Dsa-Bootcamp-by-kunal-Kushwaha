public class AltitudeGain {
    public static void main(String[] args) {
        int[] gain = {-5,1,5,0,-7};
        System.out.println(largestAltitude(gain));

    }
    static int largestAltitude(int[] gains) {
        int delta = 0;
        int maxGain = 0;

        for (int gain : gains){
            delta += gain;
            maxGain = Integer.max(maxGain, delta);
        }
        return maxGain;
    }
}
