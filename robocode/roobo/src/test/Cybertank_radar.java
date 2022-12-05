package test;

public class Cybertank_radar {
	
	 private Cybertank robot;
	 public Cybertank_radar(Cybertank robot) {
	 this.robot = robot;
	 }
	 // Simplistic: turn the radar as fast as we can
	 public void look() {
	 robot.setTurnRadarRight(20);
	 }

}
