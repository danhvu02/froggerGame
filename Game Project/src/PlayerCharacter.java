//this is the character that player will control via keyboard
public class PlayerCharacter extends Frogger{
	
	public PlayerCharacter() {
		super(0,0,100,200,"char1.jpg");
		}

	public PlayerCharacter(int x, int y, int height, int width, String img) {
		super(x, y, height, width, img);
	}

}
