
public class UserData {
	private User userArray[]=new User[3];
	
	public void addUser(User obj) {
		// 
		for(int i=0;i<userArray.length;i++) {
			if(userArray[i]==null) {
				userArray[i]=obj;
				break;
			}
			
		}
	}
	
	public User[] getAllUsers() {
		
		return userArray;
	}
	
}
