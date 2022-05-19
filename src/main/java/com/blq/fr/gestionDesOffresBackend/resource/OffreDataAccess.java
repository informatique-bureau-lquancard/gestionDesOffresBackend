package com.blq.fr.gestionDesOffresBackend.resource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.blq.fr.gestionDesOffresBackend.model.Offre;

public class OffreDataAccess {
	
	String db = "bd_blq";
	String user = "clement";
	String pwd = "clement";
	String url = "jdbc:mysql://127.0.0.1:3305/" + db;
	
	Connection connection = null;
	
	
	public OffreDataAccess() {
		
		try {
			connection = DriverManager.getConnection(url, user, pwd);
			System.out.println("connected...");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public List<Offre> getAll() {
		
		List<Offre> list = new ArrayList<Offre>();
		PreparedStatement ps = null;
		ResultSet rs;
		
		String sql = "select * from offres_view2";
		
		try {
			
			ps = connection.prepareStatement(sql);
			System.out.println("Succes d'exec de la requete !!");
			
			rs = ps.executeQuery();
			
			while (rs.next()) {
				System.out.println( rs.getString(2) );
				
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return list;
	}


	
}
