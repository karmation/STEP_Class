package STEP_Class.STEP_Class.UC3;

public class OOPSbannerapp {
    public static void main(String[] args) {
        // Rows loop (7 lines high)
        for (int i = 0; i < 7; i++) {
            // Print 'O'
            System.out.print(getO(i) + "  ");
            // Print 'O'
            System.out.print(getO(i) + "  ");
            // Print 'P'
            System.out.print(getP(i) + "  ");
            // Print 'S'
            System.out.println(getS(i));
        }
    }

    static String getO(int row) {
        // 1 space, 7 stars, 1 space
        if (row == 0 || row == 6) return " ******* "; 
        // 1 star, 7 spaces, 1 star
        return "* *"; 
    }

    static String getP(int row) {
        // 7 stars, 2 spaces
        if (row == 0 || row == 3) return "******* "; 
        // 1 star, 5 spaces, 1 star, 2 spaces
        if (row < 3)              return "* * "; 
        // 1 star, 8 spaces
        return "* "; 
    }

    static String getS(int row) {
        // 1 space, 7 stars, 1 space
        if (row == 0 || row == 3 || row == 6) return " ******* ";
        // 1 star, 8 spaces (left side)
        if (row < 3)                          return "* ";
        // 8 spaces, 1 star (right side)
        return "        *"; 
    }
}