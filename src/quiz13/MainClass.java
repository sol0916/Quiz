package quiz13;

public class MainClass {

	public static void main(String[] args) {
		
		Shape shapeC = new Circle("원", 5);
		Shape shapeR = new Rect("정사각형", 7);
		
		System.out.println(shapeC.getName()+", 넓이:"+shapeC.getArea());
		System.out.println(shapeR.getName()+", 넓이:"+shapeR.getArea());

	}

}
