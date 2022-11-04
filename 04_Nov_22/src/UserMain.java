import java.util.Scanner;

public class UserMain {
	public static void main(String[] args) {
		UserData userDataObj=new UserData();
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++) {
		System.out.println("Enter the User Id");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the User Name");
		String name=sc.nextLine();
		
		User userObj=new User(id,name);
		userDataObj.addUser(userObj);
		
		}
		User userArr[]=userDataObj.getAllUsers();
		for(User u:userArr) {
			System.out.println(u.getUserId()+ " "+u.getUserName());
		}
		
	}

}
