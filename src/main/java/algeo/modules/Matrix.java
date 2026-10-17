package algeo.modules;

public class Matrix {
    private double[][] data;
    private int rows;
    private int cols;

    // create Matrix
    public Matrix(int rows, int cols){
        if (rows < 0 || cols < 0){
            throw new IllegalArgumentException("Rows and/or columns must > 0");
        }
        this.rows = rows;
        this.cols = cols;
        this.data = new double[rows][cols];
    }

    public int getRows(int rows){
        return this.rows;
    }

    public int getCols(int cols){
        return this.cols;
    }

    public double getElmt(int rows, int cols){
        return data[rows][cols];
    }

    public void setElmt(int rows, int cols, double vals){
        data[rows][cols] = vals;
    }

    public Matrix addition(Matrix m1, Matrix m2){
        Matrix m = new Matrix(rows, cols);
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j ++){
                m.setElmt(i, j, m1.getElmt(i, j) + m2.getElmt(i, j));
            }
        } return m;
    }

    public Matrix subtraction(Matrix m1, Matrix m2){
        Matrix m = new Matrix(rows, cols);
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j ++){
                m.setElmt(i, j, m1.getElmt(i, j) - m2.getElmt(i, j));
            }
        } return m;
    }

    public Matrix scalarMultiply(Matrix m1, double k){
        Matrix m = new Matrix(rows, cols);
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                m.setElmt(j, i, k * m1.getElmt(i, j));
            }
        } return m;
    }

    public Matrix matrixMultiply(Matrix m1, Matrix m2){
        Matrix m = new Matrix(rows, cols);
        for (int i = 0; i < m1.rows; i++){
            for (int j = 0; j < m2.cols; j++){
                for (int k = 0; k < m2.rows; k++){
                    m.setElmt(i, j, m1.getElmt(i, k) * m2.getElmt(k, j));
                }
            }
        } return m;
    }
}
