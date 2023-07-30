public class Main {
    public static void main(String[] args) {
        int n = 123;
        int suma  = sumDigits(n);
        System.out.printf("The digit sum of %d: %d", n, suma);
    }

    public static int sumDigits(int n){
        if (n<0){
            return -1;
        }
        int sum = 0;
        while (n>0){
            sum += n%10;
            n=n/10;
        }
        return sum;
    }
}