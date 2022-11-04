import java.util.Scanner;

public class UserMain {

	public static void main(String[] args) {
		
		User userArray[]=new User[3];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<userArray.length;i++) {
		System.out.println("Enter the User Id");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the User Name");
		String name=sc.nextLine();
		System.out.println(id +" "+name);
		
		User userObj=new User();
		userObj.setUserId(id);
		userObj.setUserName(name);
		//User userObj=new User(id,name);
		userArray[i]=userObj;// storing user object in user array
		}
		System.out.println(userArray[2]);
		for(User u:userArray)
			System.out.println(u.getUserId()+" "+u.getUserName());
	}

}
