public class Main {
  public static void main(String[] args) {
    UserManagement userManagement = new UserManagement("nilam.cahya", "1234");
    System.out.println(userManagement.login());

    User user = new User("fikri", "haekal", "fikri@gmail.com", "Developer", "fikri.ya", "12345");
    user.employeeInfo();
  
    // Employee employee = new Employee("Nilam", "Cahya", "nilam1@gmail.com", "HR");
    // employee.employeeInfo();

    Reservation reservation = new Reservation(1, 1, 2, "2024-07-16", "2024-07-17", "2024-07-15");
    System.out.println(reservation);
    reservation.historyTransaction();
    reservation.historyTransaction(2);
  }
}
