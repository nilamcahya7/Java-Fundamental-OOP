import dataStatic.Room;
public class Reservation implements RerservationInterface {
  private Integer userId;
  private Integer roomId;
  private Integer statusId;
  private String beginReservation;
  private String endReservation;
  private String submitTransaction;

  public Reservation() {
  }
  
  public Reservation(Integer userId, Integer roomId, Integer statusId, String beginReservation, String endReservation,
    String submitTransaction) {
    this.userId = userId;
    this.roomId = roomId;
    this.statusId = statusId;
    this.beginReservation = beginReservation;
    this.endReservation = endReservation;
    this.submitTransaction = submitTransaction;
  }

  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public Integer getRoomId() {
    return roomId;
  }

  public void setRoomId(Integer roomId) {
    this.roomId = roomId;
  }

  public Integer getStatusId() {
    return statusId;
  }

  public void setStatusId(Integer statusId) {
    this.statusId = statusId;
  }

  public String getBeginReservation() {
    return beginReservation;
  }

  public void setBeginReservation(String beginReservation) {
    this.beginReservation = beginReservation;
  }

  public String getEndReservation() {
    return endReservation;
  }

  public void setEndReservation(String endReservation) {
    this.endReservation = endReservation;
  }

  public String getSubmitTransaction() {
    return submitTransaction;
  }

  public void setSubmitTransaction(String submitTransaction) {
    this.submitTransaction = submitTransaction;
  }

  @Override
    public String toString() {
      return String.format("Reservation [userId=%d, roomId=%d, statusId=%d, beginReservation=%s, endReservation=%s, submitTransaction=%s]",
      userId, roomId, statusId, beginReservation, endReservation, submitTransaction);
    }

  @Override
  public void historyTransaction() {
    System.out.println("Nomor | User ID | Room ID | Status | Begin Reservation | End Reservation | Submit Transaction");
    System.out.println("-----------------------------------------------------------------------------------------------");

    for (int i = 0; i < Room.user_id.size(); i++) {
      System.out.format("%d  |    %d   |     %d     |   %d     |     %s     |    %s    |   %s   \n", 
        i + 1, Room.user_id.get(i), Room.room_id.get(i), Room.status_id.get(i), Room.begin_reservation.get(i), Room.end_reservation.get(i), Room.submit_transaction.get(i));
    }
  }

  @Override
  public void historyTransaction(Integer roomId) {
    System.out.println("\n Nomor | Room ID | Status | Begin Reservation | End Reservation ");
    System.out.println("---------------------------------------------------------------------");
    int countReservation = 0;
    for (int i = 0; i < Room.room_id.size(); i++) {
      if (Room.room_id.get(i).equals(roomId)) {
        countReservation++;
        System.out.format("%d     |    %d     |    %d    |     %s     |    %s    \n", 
        i + 1, Room.room_id.get(i), Room.status_id.get(i), Room.begin_reservation.get(i), Room.end_reservation.get(i));
      }
    }
    System.out.println("----------------------------------------------------------------------");
    System.out.println("Total Reservations for Room ID " + roomId + ": " + countReservation);
  }
}