
public abstract class Room {

	double roomRate;

	double getRoomRate() {
		return roomRate;
	}
	
	String roomStatus = "Vacant";
	String getRoomStatus() {
		return roomStatus;
	}
	
	
	String type;
	String getType() {
		return type;	
	}
	
	public abstract boolean hasWifi();
	
	public void reserveRoom() {
		if (roomStatus == "Vacant") {
			roomStatus = "Occupied";
		}
		else {
			System.out.println("The room is already occupied!");
		}
				
	}
	
	public void cancelReservation() {
		if (roomStatus == "Occupied") {
			roomStatus = "Vacant";
		}
		else {
			System.out.println("The room is already vacant!");
		}
		
	}
	
}
