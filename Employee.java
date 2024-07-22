public class Employee {
  private String firstName;
  private String lastName;
  private String email;
  private String division;

  public Employee(String firstName, String lastName, String email, String division) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.division = division;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getDivision() {
    return division;
  }

  public void setDivision(String division) {
    this.division = division;
  }

  public void employeeInfo(){
    System.out.println("---Employee Info---");
    System.out.println("First Name :" +  getFirstName());
    System.out.println("Last Name : " + getLastName());
    System.out.println("Email : " + getEmail());
    System.out.println("Division : " + getDivision());
  }

  @Override
  public String toString() {
    return "Employee [firstName=" + getFirstName() + ", lastName=" + getLastName() + ", email=" + getEmail() + ", division=" + getDivision() + "]";
  }
}
