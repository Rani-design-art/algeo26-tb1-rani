import algeo.modules.Matrix;

public class TestMatrix {
    public static void main(String[] args) {
        Matrix a = new Matrix(3,3);
        Matrix b = new Matrix(3, 3);

        // set values for each rows and columns for matrix a
        a.setElmt(0, 0, 1);
        a.setElmt(0, 1, 0);
        a.setElmt(0, 2, 0);

        a.setElmt(1, 0, 0);
        a.setElmt(1, 1, 1);
        a.setElmt(1, 2, 0);

        a.setElmt(2, 0, 0);
        a.setElmt(2, 1, 0);
        a.setElmt(2, 2, 1);

        // set values for each rows and columns for matrix b
        b.setElmt(0, 0, 1);
        b.setElmt(0, 1, 0);
        b.setElmt(0, 2, 0);

        b.setElmt(1, 0, 0);
        b.setElmt(1, 1, 1);
        b.setElmt(1, 2, 0);

        b.setElmt(2, 0, 0);
        b.setElmt(2, 1, 0);
        b.setElmt(2, 2, 1);
        
        // testing addition
        Matrix add = new Matrix(3,3).addition(a, b);
        System.out.print("Addition Testing\n");
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print(add.getElmt(j, i) + " ");
                if (j == 2){
                    System.out.println("\n");
                }
            }
        }

        // testing substraction
        Matrix sub = new Matrix(3, 3).subtraction(a, b);
        System.out.print("Substraction Testing\n");
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print(sub.getElmt(j, i) + " ");
                if (j == 2){
                    System.out.println("\n");
                }
            }
        }

        // testing multiplication by scalar
        Matrix scalar = new Matrix(3, 3).scalarMultiply(a, 5);
        System.out.print("Scalar Multiply Testing\n");
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print(scalar.getElmt(j, i) + " ");
                if (j == 2){
                    System.out.println("\n");
                }
            }
        }
        
    }
}
