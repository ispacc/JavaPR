package Day5;

/**
 * BerINs
 * 2019-08-29 19:47
 */
public class ForForTest {
    public static void main(String[] args) {
        for(int j = 1; j <= 4; j++) {
            for(int i = 1; i <= 6; i++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = 1; i <= 4; i++) {
            for(int j = 1; j <= 5 - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}