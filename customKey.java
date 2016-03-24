package test;

public class customKey implements Comparable<customKey>{
	private String name;
	private int score;
	
	public customKey(String name, int score){
		this.name = name;
		this.score = score;
	}
	
	@Override
    public boolean equals(Object obj) {
		final customKey other = (customKey) obj;
	    if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
	        return false;
	    }
	    if (this.score != other.score) {
	        return false;
	    }
	    return true;
    }
 
    @Override
    public int hashCode() {
        int hash = this.score+this.name.hashCode();
        return hash;
    }
    
    @Override
    public int compareTo(customKey otherObj) {    	
    	int scoreDiff = this.score - otherObj.score;
        return (scoreDiff!=0? scoreDiff : (this.name.compareTo(otherObj.name)));
        
    }
    
	public String getName() {
		return name;
	}
	
	public int getScore() {
		return score;
	}
}
