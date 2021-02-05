 package DAO.Implenetation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import DAO.SingletonConnection;
import DAO.interfaces.IAssociation;
import Models.Association;

public class AssociationImpl implements IAssociation {
@Override
	public Association insertAssociation(Association ass) {
		Connection connection= SingletonConnection.getConnection();
		try{
	        
	    	 PreparedStatement ps= connection.prepareStatement("INSERT INTO ASSOCIATION(ass_name,ass_email,ass_password,ass_telephone,ass_adresse,ass_description, ass_image, ass_rib) values (?,?,?,?,?,?,?,?)");
	         ps.setString(1,ass.getNomAss());
	         ps.setString(2,ass.getEmailAss());
	         ps.setString(3,ass.getPasswordAss());
	         ps.setString(4,ass.getTelephoneAss());
	         ps.setString(5,ass.getAdresseAss());
	         ps.setString(6,ass.getDescriptionAss());
	         ps.setString(7,ass.getImageAss());
	         ps.setString(8,ass.getRibAss());
	        
	         
	         ps.executeUpdate();
	         
	         PreparedStatement ps2=connection.prepareStatement("SELECT MAX(ass_id) AS MAX_ID FROM ASSOCIATION");
	         ResultSet rs=ps2.executeQuery();
	         if(rs.next()) {
	        	 ass.setIdAss(rs.getInt("MAX_ID"));
	         }
	         ps.close();
	         
	     }catch(SQLException e){
	         e.printStackTrace();
	     }
		return ass;
	}

@Override
public boolean Check_login_ass(Association ass) {
	
	boolean flag=false;
	
	Connection connection= SingletonConnection.getConnection();
	
	try{
        
    	 PreparedStatement ps= connection.prepareStatement("SELECT ass_id AS ASSID, ass_name AS ASSNAME FROM ASSOCIATION WHERE ass_email=? AND ass_password=?");
    	 ps.setString(1,ass.getEmailAss());
    	 ps.setString(2,ass.getPasswordAss());
    	 System.out.println(ps);
    	 ResultSet rs=ps.executeQuery();
    	 
    	 //PreparedStatement ps2=connection.prepareStatement("SELECT ass_id FROM ASSOCIATION WHERE ass_email=?");
         //ps2.executeQuery();
    	 
         if(rs.next()) {
    		flag=true; 
    		 ass.setIdAss(rs.getInt("ASSID"));
    		 ass.setNomAss(rs.getString("ASSNAME"));
    		
    		
    		
    	 }
    	 
         ps.close();
         
     }catch(SQLException e){
         e.printStackTrace();
     }
	return flag;
}

}
	
	

