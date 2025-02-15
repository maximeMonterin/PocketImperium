package user;

import java.util.ArrayList;
import java.util.List;

import board.Square;

public class Faction {
	
	private int reserve;
	private List<Square> hexList = new ArrayList<Square>();
	private Color color;
	private int score;
	
	public Faction() {}

	
	
	
	
	/* -_-_-_-_-_-_-_- METHODS -_-_-_-_-_-_-_- */
	
	public void addToReserve(int newShip) {
		this.reserve += newShip;
	}
	
	public void addHexInList(Square hex) {
		this.hexList.add(hex);
	}
	
	public int countPoint() {
		int points = 0;
		return points;
	}
	
	
	/* -_-_-_-_-_-_-_- GETTERS & SETTERS -_-_-_-_-_-_-_- */
	
	public int getReserve() {
		return reserve;
	}

	public void setReserve(int reserve) {
		this.reserve = reserve;
	}

	public List<Square> getHexList() {
		return hexList;
	}

	public void setHexList(List<Square> hexList) {
		this.hexList = hexList;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	
	
	

}
