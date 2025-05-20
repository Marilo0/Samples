package gr.aueb.cf.revision;

import static java.lang.Math.ceil;

/**
 *Γράψτε μία μέθοδο που δοσμένου ενός string s και ενός ακεραίου n
 * επιστρέφει ένα string που αποτελεί επανάληψη του s , n φορές.
 * Επίσης γράψτε και άλλη μία έκδοση της παραπάνω μεθόδου που να λαμβάνει το string s
 * και ένα ακέραιο n και να επιστρέφει ένα string με τόσες επαναλήψεις ώστε το πλήθος των γραμμάτων
 * του τελικού string να είναι μεγαλύτερο από ένα ακέραιο, έστω n.
 */
public class StringInt {

    public static void main(String[] args) {

        int num = 3;
        String s = "abc";
        System.out.println(method1(s,num));
        System.out.println();
        System.out.println(method2(s,num));
        
    }

//    public static void method1(String s, int num){
//        for(int i = 1; i <= num ; i++){
//            System.out.print(s);
//        }
//    }

//    public static String method1(String s, int num){
//        StringBuilder sb = new StringBuilder();
//        for (int i = 1; i <= num; i++){
//            sb.append(s);
//        }
//        return sb.toString();
//
//    }
//
//    public static String method2(String s, int num ){
//
//        StringBuilder sb = new StringBuilder();
//        while (sb.length() <= num){
//            sb.append(s);
//        }
//        return sb.toString();
//
//    }

    public static String method1(String s, int num ){
        return s.repeat(num);
    }
    public static String method2(String s, int num ){
       return s.repeat((int)ceil((double)num/s.length()));
    }
}
