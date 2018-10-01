public class Ñircle {

	public int id;
	public double x;
	public double y;
	
	public double r;
	
	public Ñircle() {

	}
	
	public Ñircle(double r) {
		this.r = r;
	}
	
	public Ñircle(int id, double r, double x , double y) {
		this.id = id; 
		this.r = r;
		this.x = x;
		this.y = y;
	}
	
	
	public void setRadius(double r) {
		this.r = r;
	}
	
	public double getRadius() {
		return r;
	}
	
	public double getDiameter() {
		return r * 2;
	}
	
	public double getPerimeter() {
		return r * 2 * Math.PI;
	}
	
	public double getArea() {
		return Math.PI  * Math.pow(r, 2);
	}

}
