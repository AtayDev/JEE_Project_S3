package DAO.Implenetation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import DAO.SingletonConnection;
import DAO.interfaces.IDonnateur;
import Models.Donnateur;

public class DonnateurImpl implements IDonnateur {

	@Override
	public Donnateur insertDonnateur(Donnateur donnateur) {
		Connection connection= SingletonConnection.getConnection();
		try{
	        
	    	 PreparedStatement ps= connection.prepareStatement("INSERT INTO DONNATEUR(dona_email,dona_fname,dona_lname,dona_password,dona_telephone) values (?,?,?,?,?)");
	    	 ps.setString(1,donnateur.getDona_email());
	    	 ps.setString(2,donnateur.getDona_fname());
	         ps.setString(3,donnateur.getDona_lname());
	         ps.setString(4,donnateur.getDona_password());
	         ps.setString(5,donnateur.getDona_telephone());
	       
	         
	         ps.executeUpdate();
	         
	         PreparedStatement ps2=connection.prepareStatement("SELECT MAX(dona_id) AS MAX_ID FROM DONNATEUR");
	         ResultSet rs=ps2.executeQuery();
	         if(rs.next()) {
	        	donnateur.setDona_id(rs.getInt("MAX_ID"));
	         }
	         ps.close();
	         
	     }catch(SQLException e){
	         e.printStackTrace();
	     }
		return donnateur;
	}

	@Override
	public boolean Check_login_dona(Donnateur donnateur) {
		boolean flag=false;
		
		Connection connection= SingletonConnection.getConnection();
		
		try{
	        
	    	 PreparedStatement ps= connection.prepareStatement("SELECT dona_id AS DONAID, dona_fname AS DONAFNAME FROM DONNATEUR WHERE dona_email=? AND dona_password=?");
	    	 ps.setString(1,donnateur.getDona_email());
	    	 ps.setString(2,donnateur.getDona_password());
	    	 
	    	 System.out.println(ps);
	    	 ResultSet rs=ps.executeQuery();
	    	 
	         if(rs.next()) {
	        	 flag=true; 
	    		 donnateur.setDona_id(rs.getInt("DONAID"));
	    		 donnateur.setDona_fname(rs.getString("DONAFNAME"));	
	    	 }
	    	 
	         ps.close();
	         
	     }catch(SQLException e){
	         e.printStackTrace();
	     }
		return flag;
	}

}
