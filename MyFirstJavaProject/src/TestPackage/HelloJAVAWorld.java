package TestPackage;

public class HelloJAVAWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello the JAVA World");
		
		//call class Room
		float area;
		Room room1 = new Room();		//Creates an object room1
		room1.getdata(14, 10);			//Assaign values to length and breadth
		area = room1.length * room1.breadth;
		System.out.println("Area =" + area);
		//end class Room

	}

}
