
public class Demo {
	// without return type and without parameter
	void display() {
		System.out.println("without return type and without parameter");
		System.out.println("Display Method");
	}
	// without return type and with one parameter
	void displayMessage(String message) {
		System.out.println("without return type and with one parameter");
		System.out.println("The message is "+message);
	}
	// without return type and with two parameter
	void displayTwoMessage(String message1,String message2) {
		System.out.println("without return type and with two parameter");
		System.out.println("The messages are "+message1+ " and "+message2);
	}
	// with return type and without parameter
	boolean getStatus() {
		System.out.println("with return type and without parameter");
		return true;
	}
	// with return type and with parameter
	int  sum(int num1,int num2) {
		System.out.println("with return type and with parameter");
		int result = num1+num2;
		return result;
	}
public static void main(String args[]) {
	Demo demoObj=new Demo();
	demoObj.display();
	demoObj.displayMessage("Hello Everbody");
	boolean statuVal=demoObj.getStatus();
	System.out.println(statuVal);
	int sumVal=demoObj.sum(23,20);
	System.out.println("The sum is "+sumVal);
}
}
