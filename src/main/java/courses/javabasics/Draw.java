package courses.javabasics;

public class Draw {

    public static void main(String[] args) {
//        System.out.println("Param 1:" + args[0] + "\nParam 2:" + args[1]);
//        drawFullShape(args[0], args[1]);
//        drawFullShape(3,4);
        System.out.println("Draw same size shape");
        drawFullShape(3);
        System.out.println("Draw same size  as string");
//        drawFullShape(args[0]);
    }

    public static void drawFullShape(int n, int m) {
        // implement method
        for (int i = 0; i < n; i++) {
            drawFullLine(m);
        }
    }

    public static void drawFullLine(int m) {
        for (int j = 0; j < m; j++) {
            System.out.print("*");
        }
        System.out.println("*");
    }

    public static void drawOutline(int m) {
        for (int j = 0; j < m; j++) {
            if (j == 0) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println("*");
    }

    public static void drawEmptyLine() {
        System.out.println();
    }

    public static void drawFullShape(int n) {
        drawFullShape(n, n);
    }

    public static void drawFullShape(String n, String m) {
        drawFullShape(Integer.parseInt(n), Integer.parseInt(m));
    }

    public static void drawFullShape(String n) {
        drawFullShape(Integer.parseInt(n));
    }

    public static void drawShapeOutline(int n, int m) {
        for (int i = 0; i < n; i++) {
            if (i == 0 || i == n - 1) {
                drawFullLine(m);
            } else {
                drawOutline(m);
            }
        }
    }

    public static void drawShapeCorners(int n, int m) {
        for (int i = 0; i < n; i++) {
            if (i == 0 || i == n - 1) {
                drawOutline(m);
            } else {
                drawEmptyLine();
            }
        }
    }
}