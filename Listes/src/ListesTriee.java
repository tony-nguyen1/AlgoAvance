class ListeTriee {
    /**
     *
     * Cette liste triee est considéré comme triée EN PERMANANCE
     *
     */

    private int val;
    private ListeTriee suiv;


    public ListeTriee() { this.suiv = null; }

    public ListeTriee(int val, ListeTriee suiv) {
        this.val = val;
        this.suiv = suiv;
    }

    public boolean estVide() { return suiv == null; }

    public void concat(ListeTriee l)
    {
        if (this.suiv.estVide())
            this.suiv = l;
        else
            this.suiv.concat(l);
    }

    public ListeTriee copie() {
        ListeTriee l = new ListeTriee();
        if (this.estVide())
            return l;
        else
        {
            l = new ListeTriee(this.val, new ListeTriee());
            l.concat(this.suiv.copie());
            return l;
        }
    }

    public ListeTriee fusion(ListeTriee l)
    {
        if (this.estVide() && l.estVide())
        { return null; }
        else if (this.estVide()) { return l.copie(); }
        else if (l.estVide()) { return this.copie(); }
        else
        {

        }
        return null;
    }
}
