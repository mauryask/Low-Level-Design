package inheritance;

import java.util.Arrays;
import java.util.List;

import static java.lang.System.out;

class Room{
    private String roomName;

    public Room(String roomName) {
        this.roomName = roomName;
    }

    public String getRoomName() {
        return roomName;
    }

}

class House{
    private List<Room> rooms;

    public House(List<Room> rooms) {
        this.rooms = rooms;
    }

    public void showRooms(){
        for(Room room : rooms){
            out.println(room.getRoomName());
        }
    }
}


public class Composition {
  public static  void main(String[] args){
      Room room1 = new Room("Store Room");
      Room room2 = new Room("Drawing Room");
      Room room3 = new Room("Bedroom");
      List<Room> rooms = Arrays.asList(room1, room2, room3);
      //Strong 'Has-A' relationship: Here rooms can't exist independently without House
      House house = new House(rooms);
      house.showRooms();
  }
}
