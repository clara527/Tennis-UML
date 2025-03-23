public abstract class Person {
    public String fullName;
    protected int yearsOld;
    private String country;

    public Person(String fullName, int yearsOld) {
        this.fullName = fullName;
        this.yearsOld = yearsOld;
        this.country = "Country not known";
    }

    public Person() {
        this("Name is not known", 0);
    }

    public abstract void showDetails();

    protected String getCountry() {
        return country;
    }
}
