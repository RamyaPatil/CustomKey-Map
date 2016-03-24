package test;

public class Record {
	
	private int slno;
	private String name;
	private int score;
	
	public Record(int no, String name, int score){
		this.slno = no;
		this.name = name;
		this.score = score;
	}
    
	public int getSlno() {
		return slno;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}
}
