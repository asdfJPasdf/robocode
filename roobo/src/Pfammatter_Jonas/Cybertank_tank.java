package Pfammatter_Jonas;

public class Cybertank_tank {
	private Cybertank robot;

	public Cybertank_tank(Cybertank robot) {
		this.robot = robot;
	}
	
	public void onHitWall() {
		
		robot.turnRight(90);
		
	}

	// We still aren't moving - just turning in a circle
	// This makes us a lovely target for the other tanks!
	protected void move() {
		robot.setAhead(80);
		
		onHitWall();
		
		
	}
}
