import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    System.out.println("----------------------------------------USER MANAGAMENT---------------------------------------------------");
    UserManagement userManagement = new UserManagement("nilam.cahya", "1234");
    System.out.println(userManagement.login());

    User fikri = new User("fikri", "haekal", "fikri@gmail.com", "Developer", "fikri.ya", "12345");
    User nilam = new User("Nilam", "Cahya", "nilam@gmail.com", "HR", "nilam.ya", "1234");

    List<User> users = new ArrayList<>();
    users.add(nilam);
    users.add(fikri); 

    users.forEach(user -> user.employeeInfo());

    System.out.println("-----------------------------------------RESERVATION------------------------------------------------");
    Reservation reservation0 = new Reservation();
    Reservation reservation1 = new Reservation(1, 1, 2, "2024-07-16", "2024-07-17", "2024-07-15");
    Reservation reservation2 = new Reservation(2, 3, 1, "2024-07-22", "2024-07-22", "2024-07-19");
    Reservation reservation3 = new Reservation(3, 2, 1, "2024-07-23", "2024-07-23", "2024-07-19");
    Reservation reservation4 = new Reservation(3, 1, 1, "2024-07-24", "2024-07-24", "2024-07-19");

    List<Reservation> reservations = new ArrayList<>();
    reservations.add(reservation2);
    reservations.add(reservation1);
    reservations.add(reservation3);
    reservations.add(reservation4);
    
    System.out.println("\n");
    System.out.println("------------Display data reservation with status reserved---------------");
    reservations.stream()
      .filter(reservation -> reservation.getStatusId().equals(1))
      .forEach(reservation -> System.out.println(reservation));

    System.out.println("\n");
    System.out.println("------------Display data with the latest beginreservation--------------");
    reservations.stream()
      .sorted(Comparator.comparing(Reservation::getBeginReservation).reversed())
      .forEach(reservation -> System.out.println(reservation));
    System.out.println("\n");

    reservation0.historyTransaction();
    reservation0.historyTransaction(2);
  }
}
