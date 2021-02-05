package Models;

public class Donnateur {

	private int dona_id;
	private String dona_email;
	private String dona_fname;
	private String dona_lname;
	private String dona_password;
	private String dona_telephone;
	
	public Donnateur(String dona_email, String dona_fname, String dona_lname, String dona_password,
			String dona_telephone) {
		super();
		this.dona_email = dona_email;
		this.dona_fname = dona_fname;
		this.dona_lname = dona_lname;
		this.dona_password = dona_password;
		this.dona_telephone = dona_telephone;
	}
	public int getDona_id() {
		return dona_id;
	}
	public void setDona_id(int dona_id) {
		this.dona_id = dona_id;
	}
	public String getDona_fname() {
		return dona_fname;
	}
	public void setDona_fname(String dona_fname) {
		this.dona_fname = dona_fname;
	}
	public String getDona_lname() {
		return dona_lname;
	}
	public void setDona_lname(String dona_lname) {
		this.dona_lname = dona_lname;
	}
	public String getDona_password() {
		return dona_password;
	}
	public void setDona_password(String dona_password) {
		this.dona_password = dona_password;
	}
	public String getDona_telephone() {
		return dona_telephone;
	}
	public void setDona_telephone(String dona_telephone) {
		this.dona_telephone = dona_telephone;
	}
	public String getDona_email() {
		return dona_email;
	}
	public void setDona_email(String dona_email) {
		this.dona_email = dona_email;
	}
	public Donnateur() {
		super();
		
	}

	
}
