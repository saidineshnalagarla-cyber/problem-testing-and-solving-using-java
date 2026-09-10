import java.util.*;

public class Task10_MatrixRotation {
    static void rotate(int[][] matrix, int r) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int layers = Math.min(rows, cols) / 2;

        for (int layer = 0; layer < layers; layer++) {
            List<Integer> values = new ArrayList<>();

            for (int i = layer; i < rows - layer; i++)
                values.add(matrix[i][layer]);

            for (int j = layer + 1; j < cols - layer; j++)
                values.add(matrix[rows - layer - 1][j]);

            for (int i = rows - layer - 2; i >= layer; i--)
                values.add(matrix[i][cols - layer - 1]);

            for (int j = cols - layer - 2; j > layer; j--)
                values.add(matrix[layer][j]);

            int shift = r % values.size();
            List<Integer> rotated = new ArrayList<>();

            for (int i = 0; i < values.size(); i++)
                rotated.add(values.get((i + shift) % values.size()));

            int index = 0;

            for (int i = layer; i < rows - layer; i++)
                matrix[i][layer] = rotated.get(index++);

            for (int j = layer + 1; j < cols - layer; j++)
                matrix[rows - layer - 1][j] = rotated.get(index++);

            for (int i = rows - layer - 2; i >= layer; i--)
                matrix[i][cols - layer - 1] = rotated.get(index++);

            for (int j = cols - layer - 2; j > layer; j--)
                matrix[layer][j] = rotated.get(index++);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int r = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = sc.nextInt();

        rotate(matrix, r);

        for (int[] row : matrix) {
            for (int x : row) System.out.print(x + " ");
            System.out.println();
        }
    }
}

/*
INPUT:
4 4 2
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16

OUTPUT:
3 4 8 12
2 11 10 16
1 7 6 15
5 9 13 14
*/