public class Main {
  public static void main(String[] args) {
    UserManagement userManagement = new UserManagement("nilam.cahya", "1234");
    System.out.println(userManagement.login());

    Employee employee = new Employee("Nilam", "Cahya", "nilam@gmail.com", "Developer");
    System.out.println(employee);

    User user = new User("Nilam", "Cahya", "nilam@gmail.com", "Developer", "nilam.ya", "12345");
    System.out.println(user);

    Reservation reservation = new Reservation(1, 1, 2, "2024-07-16", "2024-07-17", "2024-07-15");
    System.out.println(reservation);
    reservation.historyTransaction();
  }
}
