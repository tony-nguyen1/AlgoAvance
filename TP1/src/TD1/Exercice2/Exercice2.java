package TD1.Exercice2;

public class Exercice2 {

    public static int nbOccAux(int x,int [] t, int i){
        if (i < t.length) {
            if (t[i]==x) return nbOccAux(x,t,i+1)+1;
            else return nbOccAux(x,t,i+1);
        }
        else return 0;
    }

    public static int nbOcc(int x, int []t){
        if (t.length > 0) return nbOccAux(x,t,0);
        else return 0;
    }

    //public static int nbOccAux2(){return 0;}

    public static int estPalindromeAux(char []t, int i){
        if (i < t.length&& t[i]==t[t.length-1-i]) return estPalindromeAux(t, i+1)+1;
        return 0;
    }

    public static boolean estPalindrome(char []t){
        return estPalindromeAux(t,0) == t.length;
    }

    public static int croissantsAux(int []t, int i) {//i=1 pour commencer
        if (i < t.length && t[i] > t[i-1]) return croissantsAux(t,i+1)+1;
        return 0;}

    public static boolean croissants(int []t) {
        return croissantsAux(t,1)==t.length-1;
    }

    public static void main(String[] args) {
        int tab[] = {5,1,2,3,4,5,6,7,8,5};
        int ta[] = {};

        System.out.println(nbOcc(5,tab));
        System.out.println(nbOcc(5,ta));

        String word = "kayak";
        System.out.println("kayak palindrome? " + (estPalindrome(word.toCharArray())));

        System.out.println(estPalindrome("PasUnPalindrome".toCharArray()));

        ////croissants
        int t[] = {1,5,3,4};
        System.out.println("" + t.toString() + " croissants? " + croissants(t));

        int y[] = {1,2,3,4};
        System.out.println("" + y.toString() + " croissants? " + croissants(y));

    }
}
