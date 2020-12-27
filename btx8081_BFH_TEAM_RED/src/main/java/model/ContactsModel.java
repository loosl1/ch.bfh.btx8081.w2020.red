package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ContactsModel {
	
public static Connection connection = DbConnection.connect();

//Create a set of Contacts that will be delivered to the Contact presenter.
public ArrayList<Contact> getContactsFromDB() {
	
	ArrayList<Contact> contactsList = new ArrayList<>();
	
	try {
		connection = DbConnection.connect();
		Statement contactsInfo = connection.createStatement();
		ResultSet rs = contactsInfo.executeQuery("SELECT * FROM contacts"); 
		
		connection.setAutoCommit(false); // accordingly

		while (rs.next()) {
			Contact contact = new Contact();
			
			contact.setName(rs.getString("Name"));
			contact.setSurname(rs.getString("Surname"));
			contact.setPhoneNum(rs.getString("Phone_Num"));
			contact.setHouseNum(rs.getString("House_Num"));
			contact.setStreet(rs.getString("Street"));
			contact.setCity(rs.getString("City"));
			
					
			//add the contact object to the contacts array
			contactsList.add(contact);

			// print instruction table
			//System.out.println("ID: " + inst_ID);
			//System.out.println("Titel: " + inst_titel);
			//System.out.println("instruction: " + instruction);

			// instruction_text.close();

		}
		connection.commit();
		connection.close();
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return contactsList;
}

	
}
