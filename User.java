public class User extends Employee{
  String username;
  String password;

  public User(String firstName, String lastName, String email, String division, String username, String password) {
    super(firstName, lastName, email, division);
    this.username = username;
    this.password = password;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  @Override
  public String toString() {
    return "User [username=" + username + ", password=" + password + "]";
  }

  
}
