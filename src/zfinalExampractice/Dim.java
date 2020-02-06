package zfinalExampractice;

public enum Dim {

    LENGTH(2.0),WIDTH9(3.0);

    double val;
     Dim(double x) {
        val = x;
    }

    public double val() {
         return val;
    }

    public static void main(String [] args) {
         System.out.println(Dim.WIDTH9.val());
    }
}
