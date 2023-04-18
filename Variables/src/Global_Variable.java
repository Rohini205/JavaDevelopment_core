
public class Global_Variable {
	int x; //declaration of the global variable
	int y=300; //intialization of the variable
	public static void main(String[] args) {
		Global_Variable obj=new Global_Variable();
		int a=obj.y;
		System.out.println("The value of the variable >>"+a);
		
	}

}
