package strings;

public class BestFriends {
	private String friend1;
	private String friend2;
	private String friend3;

	public BestFriends() {
		friend1 = "Bob Smith";
		friend2 = "Judy Jones";
		friend3 = "Billy Miller";
	}

	public boolean changeFriend(String friend4, int rank) {
		boolean replaced = true;
		if (friend4.contains(" ") == true) {
			if (rank == 1){ friend1=friend4;} if (rank==2){friend2=friend4;} if (rank==3){friend3=friend4;}
		} else {
			replaced = false;
		}
		return replaced;
	}
	public String getFriend1(){
		return friend1;
	}
	public int getLastLength(){
		int number = friend3.indexOf(' ') + 1;
		String last = friend3.substring(number);
		last = last.toUpperCase();
		return last.length();
	}
	
}
