public class Main {
    public static void main(String[] args) {
        // program that starts at 0 and ends at 30 and goes up by 1
        int zeroToThirty = 0;
        for(; zeroToThirty <= 30; zeroToThirty++)
        {
            System.out.println(zeroToThirty);
        }
        // program that starts at 30 and goes down to 0 by 1
        int thirtyToZero = 30;
        for(; thirtyToZero >=0; thirtyToZero--)
        {
            System.out.println(thirtyToZero);
        }
        // program that starts at 0 and goes to 18 by 3
        int zeroToEightteen = 0;
        for(; zeroToEightteen <= 18; zeroToEightteen = zeroToEightteen + 3)
        {
            System.out.println(zeroToEightteen);
        }
        // program that starts at 10 and goes to 0 by 2
        int tenToZero = 10;
        for(; tenToZero >=0; tenToZero = tenToZero - 2)
        {
            System.out.println(tenToZero);
        }
        // program that makes a staircase
        for(int i = 0; i <= 5; i++)
        {
            for(int j = 0; j < i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        // program that makes upside down staircase
        for(int i = 5; i >= 1; i--)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        // program that makes 5 x 5 rectangle
        final int ROW = 5;
        final int COL = 5;
        for(int row = 0; row <= ROW; row++)
        {
            for(int col = 0; col <= COL; col++)
            {
                System.out.printf("*", row * col);
            }
            System.out.println();
        }










    }
}