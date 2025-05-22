package gr.aueb.cf.ch10revision;

/**
 * Έστω ένας πίνακας ακεραίων aages που συμβολίζει ηλικίες (σε έτη),
 * και έστω η ηλικία age (σε έτη) ενός χαρακτήρα.
 * Γράψτε μία μέθοδο που λαμβάνει ως είσοδο τον πίνακα ages και
 * την ηλικία age και επιστρέφει την ηλικιακή διαφορά του χαρακτήρα
 * από τη μέγιστη ηλικία του πίνακα.(πoυ πρέπει να είναι μεγαλυτερο
 * από το δοθέν)
 * Αν δεν υπάρχει ηλικιακή διαφορά επιστρέφει 0.
 */
public class Ages {
    public static void main(String[] args) {
        int[] arr = {27, 56, 44, 32};
        int age = 20;
        System.out.println(ageDifference(arr, age));
    }
    public static int ageDifference(int[] arr, int age) {

        int max = Integer.MIN_VALUE;

        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        if (max == age )return 0;
        else if (max < age)return -1;
        return max - age;
    }
}
