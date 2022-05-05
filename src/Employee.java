public class Employee extends Person {
    private String position;
    private String departmentName;
    private int salary;

    public Employee() {
    }

    public Employee(int id) {
        super(id);
    }

    public Employee(int id, String firstName, String lastName, String email, String position, String departmentName, int salary) {
        super(id, firstName, lastName, email);
        this.position = position;
        this.departmentName = departmentName;
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String PersonInfo() {
        return "Сведения о записи: " + this.getClass().getName()
                + (String.valueOf(super.getId()) != null ? "_ID = " + super.getId() : this.hashCode())
                + (super.lastName != null ? "\n\tФИО: " + super.lastName + " " +  super.firstName: "")
                + (this.departmentName!=null ? "\n\tПодразделение: " + this.departmentName : "")
                + (this.position!=null ? "\n\tДолжность: " + this.position : "")
                + (this.getEmail()!=null ? "\n\temail: " + super.getEmail() : "");
    }

    @Override
    public void sendSMS(String text) {
        System.out.println(this.getClass().getName()+"> Отправка смс сотруднику");
    }

}
