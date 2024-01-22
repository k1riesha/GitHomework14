import java.util.Random;

public class AlgorithmProgram {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(10000 - 11 + 1) + 11;
        System.out.println(num);

        int sum = 0;
        int last;
        int tempNum = num;

        while (tempNum > 0){
           last = tempNum % 10;
           sum += last;
           tempNum /= 10;
        }
        System.out.println(sum);
    }
}
