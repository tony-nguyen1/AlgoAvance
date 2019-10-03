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

        System.out.println(l1.toString());

        System.out.println("\nconcat");
        Liste l10, l11;

        l11 = new Liste(11, new Liste());
        l10 = new Liste(10, l11);

        System.out.println("Avant");
        System.out.println(l10.toString());
        l1.concat(l10);
        System.out.println("Après");
        System.out.println(l1);

        Liste L1 = new Liste(1, new Liste());
        Liste L3 = new Liste(3, new Liste());
        Liste L2 = new Liste(2, L3);

        System.out.println("\nExercice 5.2");
        L1.concat(L2);
        System.out.println(L1);
        L2.setVal(50);
        System.out.println(L1);
        L2.getSuiv().setVal(51);
        System.out.println(L1);


        System.out.println("\nExercice 6");
        Liste Lcopie = L1.copie();
        Lcopie.ajoutFin(52);
        Lcopie.ajoutFin(53);
        Lcopie.ajoutFin(54);
        System.out.println(L1);
        System.out.println(Lcopie);

        System.out.println("\nExercice 7 - get()");
        System.out.println(Lcopie.get(5));

        System.out.println("\nExercice 8 - ajoutFin()");
        System.out.println(Lcopie.ajoutFin2(55));
    }
}
