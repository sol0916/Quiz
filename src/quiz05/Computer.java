package quiz05;

public class Computer extends Calculator {
	
	double circle(int r) {
		return r * r * Math.PI;
	}
	
	double rect(double l) {
		return l*l;
	}
	
	double rect(double l, double w) {
		return l*w;
	}
	
	double rect(double l, double w, double h) {
		return l*w*h;
	}

}
