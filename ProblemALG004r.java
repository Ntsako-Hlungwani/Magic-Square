import java.util.Scanner;

public class ProblemALG004r {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter square size (must be odd): ");
        int n = sc.nextInt();
        System.out.print("Enter number of rotations: ");
        int rotation = sc.nextInt();

        if (n % 2 == 0) {
            throw new RuntimeException("n must be odd");
        }

        int[][] square = generateMagicSquare(n);

        if (rotation == 0) {
            printMagicSquare(square);
        } else {
            int[][] rotatedSquare = rotateMagicSquare(square, rotation);
            printMagicSquare(rotatedSquare);
        }
    }

    public static int[][] generateMagicSquare(int n) {
        int[][] square = new int[n][n];
        int num = 1;
        int row = 0;
        int col = n / 2;

        while (num <= n * n) {
            square[row][col] = num;
            num++;

            int newRow = (row - 1 + n) % n;
            int newCol = (col + 1) % n;

            if (square[newRow][newCol] == 0) {
                row = newRow;
                col = newCol;
            } else {
                row = (row + 1) % n;
            }
        }

        return square;
    }

    public static int[][] rotateMagicSquare(int[][] square, int rotations) {
        int n = square.length;
        int[][] rotatedSquare = new int[n][n];

        for (int r = 0; r < rotations; r++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    rotatedSquare[j][n - 1 - i] = square[i][j];
                }
            }

            square = (int[][]) rotatedSquare.clone();
        }

        return rotatedSquare;
    }

    public static void printMagicSquare(int[][] square) {
        int n = square.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%2d ", square[i][j]);
            }
            System.out.println();
        }
    }

    
}



