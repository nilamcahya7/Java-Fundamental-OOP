import dataStatic.Data;

public class UserManagement implements UserManagementInterface{
  private String username;
  private String password;

    
  public UserManagement(String username, String password) {
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
  public String login() {
    String username = getUsername();
    String password = getPassword();

    for (int i = 0; i < Data.arrUsername.size(); i++) {
      if (Data.arrUsername.get(i).equals(username) && Data.arrPassword.get(i).equals(password)) {
        return "Login Successful: " + username;
        }
      }
      return "Login Failed!";
  
  }
}