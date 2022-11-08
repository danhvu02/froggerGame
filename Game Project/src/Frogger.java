/*
	1. Create the class skeleton
	2. Identify all class attributes (data members)
	3. getters and setters (accessors, mutators)
	4. default constructor
	5. secondary constructors
	6. print/display function
	7. any other code
	8. run in an application
*/

public class Frogger {
	protected int x, y;
	protected int height, width;
	protected String img;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}

	public Frogger() {
		super();
		this.x = -1;
		this.y = -1;
		this.width = -1;
		this.height = -1;
		this.img = "";
	}
	
	public Frogger(int x, int y, int height, int width, String img) {
		super();
		this.x = x;
		this.y = y;
		this.height = height;
		this.width = width;
		this.img = img;
	}
	
	public void Display () {
		System.out.println("x,y: " + this.x + "," + this.y);
		System.out.println("width,height: " + this.width + "," + height);
		System.out.println("image: " + this.img);
	}
}
