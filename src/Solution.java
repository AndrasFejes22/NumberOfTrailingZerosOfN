public class Solution {
    public static void main(String[] args) {


        System.out.println("Number of trailing zeros : "+zeros(6));
        System.out.println("Number of trailing zeros : "+zeros(12));

    }
    public static int zeros(int n) {
        System.out.println("n: " + n);
        int j = 1;
        do {
            j++;
        } while (Math.pow(5, j) <= n);

        System.out.println("j: " + j);
        double sum = 0;

        for (int i = 1; i < j; i++) {

            sum = sum + Math.floor(n / Math.pow(5, i));
        }

        return  ((int) sum);
    }
}
