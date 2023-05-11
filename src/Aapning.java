class Aapning extends HvitRute {

    public Aapning(int radNummer, int kolonneNummer, Labyrint labyrint) {
        super(radNummer, kolonneNummer, labyrint);
    }

    @Override
    public void finn(Rute fra) {
        if (!gaatGjennom) {
            gaatGjennom = true;
            System.out.println("("+radNummer+", "+kolonneNummer+")");
        }
    }
}
