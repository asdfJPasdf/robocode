package Pfammatter_Jonas;
import robocode.ScannedRobotEvent;

import java.awt.Color;

import robocode.AdvancedRobot;

public class Cybertank extends AdvancedRobot {

	private Cybertank_radar radar;
	private Cybertank_cannon cannon;
	private Cybertank_tank tank;
	private int turn;

	public void run() {
		setColors(Color.BLACK, Color.BLACK, Color.BLACK);
		setAdjustRadarForGunTurn(true); // our radar, gun and tank
		setAdjustGunForRobotTurn(true); // are independently controlled
		turn = 0;
		radar = new Cybertank_radar(this);
		cannon = new Cybertank_cannon(this);
		tank = new Cybertank_tank(this);
		while (true) {
			turn++;
			tank.move();
			radar.look();
			cannon.fire();
			execute();
		}
	}

	/**
	 * onScannedRobot: keep scan info on the last robot seen
	 */
	public void onScannedRobot(ScannedRobotEvent e) {
		cannon.enemySeen(turn, e);
	}

	// Our components may need information from us.
	// Here is the current turn
	public int getTurn() {
		return turn;
	}

}
