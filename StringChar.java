package gr.aueb.cf.revision;

/**
 * Γράψτε μία μέθοδο που δοσμένου ενός string s,
 * ενός χαρακτήρα ch και ενός αριθμού n βρίσκει το πλήθος
 * των φορών που εμφανίζεται ο χαρακτήρας ch,
 * στους πρώτους n χαρακτήρες του string s
 */
public class StringChar {

    public static void main(String[] args) {
      String s ="Alabama";
      char ch ='a';
      int n = 4;
      System.out.println(timesAppearing(s,ch,n));


    }

    public static int timesAppearing(String s, char ch, int n){
        int count = 0;
        if (n>s.length()) return 0;

        for (int i = 0; i < n ; i++){
            if (s.charAt(i) == ch){
                count++;
            }
        }
        return count;
    }
}
