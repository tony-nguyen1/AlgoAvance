public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Liste l1, l2, l3;

        l3 = new Liste(3,new Liste());
        l2 = new Liste(2,l3);
        l1 = new Liste(1, l2);

        l1.afficheListe();
        System.out.println();

        l1.afficheListeInverse();
        System.out.println();

        System.out.println(l1.longueur());
        System.out.println(l2.longueur());

        System.out.println("recherche " + l1.recherche(2));

        System.out.println("croissant " + l1.croissant());

        System.out.print("ajout en tete de 5 !!!  ");
        l1.ajoutTete(5);
        l1.afficheListe();
        System.out.println();

        System.out.print("ajout à la fin de x=9 !!!  ");
        l2.ajoutFin(9);
        l1.afficheListe();
        System.out.println();

    }
}
