public class HarmonicAvgWithArrays {

    public static void main(String[] args) {

        int[] arr = {1,5,3,7,4,7,4};
        double harmonicSum = 0;

        for (int j : arr) {
            harmonicSum += harmonic(j);
        }
        System.out.println(harmonicSum / arr.length);
    }

    static double harmonic(int n){
        double sum = 0.0;
        for(int i = 0; i<n; i++){
            sum += (double) 1 /i;
        }
        return sum;
    }
}
