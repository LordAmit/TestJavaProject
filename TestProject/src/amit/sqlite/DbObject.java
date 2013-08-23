package amit.sqlite;

public class DbObject {
	String commitid;
	String oneline;
	String previousmethod; 
	String nextmethod;
	public DbObject(String commitid, String oneline,
			String previousmethod, String nextmethod) {
		
		this.commitid = commitid;
		this.oneline = oneline;
		this.previousmethod = previousmethod;
		this.nextmethod = nextmethod;
	}
	

}
