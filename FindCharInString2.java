package gr.aueb.cf.ch10revision;

import static java.lang.Math.ceil;

/**
 * Να γράψετε μία μέθοδο που θα λαμβάνει ως είσοδο ένα string s, το πλήθος των
 * πρώτων γραμμάτων που θέλουμε να ελέγξουμε καθώς και τον χαρακτήρα αναζήτησης ch
 * και επιστρέφει το πλήθος των φορών που εμφανίζεται ο χαρακτήρας ch, στους πρώτους
 * n χαρακτήρες του string s. Αν το n είναι μεγαλύτερο από το length του String,
 * το String θα πρέπει να γίνεται repeat ώστε το τελικό μήκος του String
 * να είναι αμέσως μεγαλύτερο από το μήκος του n.
 */
public class FindCharInString2 {

    public static void main(String[] args) {
        System.out.println(getCount("alalo", 7, 'a'));
    }

    public static int getCount(String s, int n, char ch){
        int count = 0;
        String finalS;

        if (n > s.length()) {
            finalS = s.repeat((int) ceil((double)n/s.length()));
        }else finalS = s;

        for (int i = 0; i < n; i++) {
            if (finalS.charAt(i) == ch) {
                    count++;
            }
        }
        return count;
    }
}
