public class Customer extends Person {
    private String companyName;
    private String industry;

    public Customer() {
    }

    public Customer(int id) {
        super(id);
    }
    public Customer(String companyName, String industry) {
        this.companyName = companyName;
        this.industry = industry;
    }

    public Customer(int id, String firstName, String lastName, String email, String companyName, String industry) {
        super(id, firstName, lastName, email);
        this.companyName = companyName;
        this.industry = industry;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    @Override
    public String PersonInfo() {
        return "Сведения о записи: " + this.getClass().getName()
                + (String.valueOf(super.getId()) != null ? "_ID = " + super.getId() : this.hashCode())
                + (super.lastName != null ? "\n\tФИО: " + super.lastName + " " +  super.firstName: "")
                + (this.getCompanyName()!=null ? "\n\tОрганизация: " + this.getCompanyName() : "")
                + (this.getEmail()!=null ? "\n\temail: " + super.getEmail() : "");
    }
}
