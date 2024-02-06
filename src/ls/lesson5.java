package ls;

public class lesson5 {
    public static void main(String[] args) {
        second(20);
        System.out.println("   ");
        first(20);
        System.out.println("   ");
        second(11);
        System.out.println("   ");
        first(11);
        System.out.println("   ");
        third(11);
        System.out.println("   ");
        fourth(10);
    }

    public static void sq(int sq) {
        for (int y = 0; y < sq; y++) {
            for (int x = 0; x < sq; x++) {
                if (y == x || y == sq - 1 - x || y == 0 || y == sq - 1 || x == 0 || x == sq - 1) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
                }
            System.out.println();
        }
    }
    public static void first(int sq) {
        for (int y = 0; y < sq; y++) {
            for (int x = 0; x <= (sq-1)/2; x++) {
                if (x == 0 || x == y || y == sq - 1 - x) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

    }
    public static void second(int sq) {
        for (int y = 0; y < sq; y++) {
            for (int x = 0; x < sq; x++) {
                if (x >= sq / 2 &&(x == sq - 1 || x == y || y == sq - 1 - x)) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                    }
            }
            System.out.println();
        }

    }
    public static void third(int sq) {
        for (int y = 0; y <= (sq-1)/2; y++) {
            for (int x = 0; x < sq; x++) {
                if (y == x || y == sq - 1 - x || y == 0 || y == sq - 1) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

    }
    public static void fourth(int sq) {
        for (int y = sq / 2; y < sq; y++) {
            for (int x = 0; x < sq; x++) {
                if (y == x || y == sq - 1 - x || y == sq - 1) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}