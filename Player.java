import java.lang.Math;

public class Player {
	
	private String name;
	private String position;
	private int number;
	private int athleticism;
	private int accuracy;
	private int agility;
	private int points = 0;
	private int rebounds = 0;
	private int steals = 0;
	private int assists = 0;
	private int blocks = 0;
	
	public Player (String plName, String plPosition, int plNum, int plAth, int plAcc, int plAgl) {
		name = plName;
		position = plPosition;
		number = plNum;
		athleticism = plAth;
		accuracy = plAcc;
		agility = plAgl;
	}
	
	public String toString () {
		return "Player Name: " + name + 
				"\nAthleticism: " + athleticism +
				"\nAccuracy: " + accuracy + 
				"\nAgility: " + agility;
	}
	
	public String getName () {
		return name;
	}
	
	public void setName (String newName) {
		name = newName;
	}
	
	public String getPosition () {
		return position;
	}
	
	public void setPosition (String newPosition) {
		position = newPosition;
	}
	
	public int getNum () {
		return number;
	}
	
	public void setNum (int newNum) {
		number = newNum;
	}
	
	public int getAth () {
		return (int) (Math.random() * (athleticism) + 1);
	}
	
	public int getAthAdv () {
		return Math.max((int) (Math.random() * (athleticism) + 1), (int) (Math.random() * (athleticism) + 1));
	}
	
	public void setAth (int newAth) {
		athleticism = newAth;
	}
	
	public int getAcc () {
		return (int) (Math.random() * (accuracy) + 1);
	}
	
	public int getAccAdv () {
		return Math.max((int) (Math.random() * (accuracy) + 1), (int) (Math.random() * (accuracy) + 1));
	}
	
	public void setAcc (int newAcc) {
		accuracy = newAcc;
	}
	
	public int getAgl () {
		return (int) (Math.random() * (agility) + 1);
	}
	
	public int getAglAdv () {
		return Math.max((int) (Math.random() * (agility) + 1), (int) (Math.random() * (agility) + 1));
	}
	
	public void setAgl (int newAgl) {
		agility = newAgl;
	}
	
	public void addPoints (int score) {
		points += score;
	}
	
	public int getPoints () {
		return points;
	}
	
	public void addRebound () {
		rebounds++;
	}
	
	public int getRebounds () {
		return rebounds;
	}
	
	public void addSteal () {
		steals++;
	}
	
	public int getSteals () {
		return steals;
	}
	
	public void addAssist () {
		assists++;
	}
	
	public int getAssists () {
		return assists;
	}
	
	public void addBlock () {
		blocks++;
	}
	
	public int getBlocks () {
		return blocks;
	}
	
	
}
