
public class Menu {

	public static void main(String[] args) {
		testGetRoomRate();
		testGetRoomStatus();
		testReserveRoom();
		testCancelReservation();
	
	}
	

	
	public static void testGetRoomRate() {
		SuperDelux room1 = new SuperDelux();
		System.out.println(room1.getRoomRate());
		System.out.println("-----------------------");

	}
	
	public static void testGetRoomStatus() {
		SuperDelux room2 = new SuperDelux();
		System.out.println(room2.getRoomStatus());
		System.out.println("-----------------------");
	}
	
	public static void testReserveRoom() {
		SuperDelux room3 = new SuperDelux();
		room3.reserveRoom();
		System.out.println(room3.getRoomStatus());
		System.out.println("-----------------------");
	}
	
	public static void testCancelReservation() {
		SuperDelux room4 = new SuperDelux();
		room4.reserveRoom();
		System.out.println(room4.getRoomStatus());
		room4.cancelReservation();
		System.out.println(room4.getRoomStatus());
		System.out.println("-----------------------");
		
	}

	
	
}
