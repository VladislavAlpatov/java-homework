package homework4_1.task4;

public class Matrix {
    private double[][] data;
    private int rows;
    private int cols;

    // Конструктор
    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.data = new double[rows][cols];
    }

    // Метод для инициализации матрицы
    public void setData(int row, int col, double value) {
        data[row][col] = value;
    }

    // Метод для сложения матриц
    public Matrix add(Matrix other) {
        if (this.rows != other.rows || this.cols != other.cols) {
            throw new IllegalArgumentException("Матрицы разных размеров не могут быть сложены");
        }

        Matrix result = new Matrix(rows, cols);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result.data[i][j] = this.data[i][j] + other.data[i][j];
            }
        }
        return result;
    }

    // Метод для умножения матрицы на число
    public Matrix multiply(double scalar) {
        Matrix result = new Matrix(rows, cols);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result.data[i][j] = this.data[i][j] * scalar;
            }
        }
        return result;
    }

    // Метод для вывода матрицы на печать
    public void print() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Matrix matrix1 = new Matrix(2, 2);
        matrix1.setData(0, 0, 1);
        matrix1.setData(0, 1, 2);
        matrix1.setData(1, 0, 3);
        matrix1.setData(1, 1, 4);

        Matrix matrix2 = new Matrix(2, 2);
        matrix2.setData(0, 0, 5);
        matrix2.setData(0, 1, 6);
        matrix2.setData(1, 0, 7);
        matrix2.setData(1, 1, 8);

        Matrix sum = matrix1.add(matrix2);
        Matrix product = matrix1.multiply(2);

        System.out.println("Сумма матриц:");
        sum.print();

        System.out.println("Произведение матрицы на число:");
        product.print();
    }
}
