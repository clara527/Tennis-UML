public abstract class Tournament {
    public String tourneyName;
    protected int cashPrize;

    public Tournament(String tourneyName, int cashPrize) {
        this.tourneyName = tourneyName;
        this.cashPrize = cashPrize;
    }

    public Tournament() {
        this("Tournament is not known", 0);
    }

    public abstract void kickOff();
}
