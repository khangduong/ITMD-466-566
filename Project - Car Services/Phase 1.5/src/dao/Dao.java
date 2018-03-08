package dao;

import java.sql.SQLException;
import java.sql.Statement;

import connector.Connector;

public class Dao {
	
	Connector conn = new Connector();
	private Statement statement = null;
	
	public void InsertData() throws Exception {
		
		try{
			
			statement = conn.getConnection().createStatement();
			
			String sql = "LOAD XML LOCAL INFILE 'C:/Users/Khang/workspace/dom_parser/XML/customer.xml' INTO TABLE customer ROWS IDENTIFIED BY '<Customer>';";
			
			statement.executeUpdate(sql);
			System.out.println("Inserted Data into Customer\n");
			
			String sql1 = "LOAD XML LOCAL INFILE 'C:/Users/Khang/workspace/dom_parser/XML/billings.xml' INTO TABLE comments ROWS IDENTIFIED BY '<Billing>';";
			
			statement.executeUpdate(sql1);
			System.out.println("Inserted Data into Billings\n");
			
			String sql2 = "LOAD XML LOCAL INFILE 'C:/Users/Khang/workspace/dom_parser/XML/carinventory.xml' INTO TABLE employee ROWS IDENTIFIED BY '<CarInventory>';";
			
			statement.executeUpdate(sql2);
			System.out.println("Inserted Data into Car Inventory\n");
			
			String sql3 = "LOAD XML LOCAL INFILE 'C:/Users/Khang/workspace/dom_parser/XML/carservices.xml' INTO TABLE expense ROWS IDENTIFIED BY '<CarServices>';";
			
			statement.executeUpdate(sql3);
			System.out.println("Inserted Data into Car Services\n");
			
			String sql4 = "LOAD XML LOCAL INFILE 'C:/Users/Khang/workspace/dom_parser/XML/consumerprovider.xml' INTO TABLE invoice ROWS IDENTIFIED BY '<ConsumerProvider>';";
			
			statement.executeUpdate(sql4);
			System.out.println("Inserted Data into Consumer Provider\n");
			
			String sql5 = "LOAD XML LOCAL INFILE 'C:/Users/Khang/workspace/dom_parser/XML/partinventory.xml' INTO TABLE location ROWS IDENTIFIED BY '<PartInventory>';";
			
			statement.executeUpdate(sql5);
			System.out.println("Inserted Data into Part Inventory\n");
			
			String sql6 = "LOAD XML LOCAL INFILE 'C:/Users/Khang/workspace/dom_parser/XML/partservices.xml' INTO TABLE orders ROWS IDENTIFIED BY '<PartServices>';";
			
			statement.executeUpdate(sql6);
			System.out.println("Inserted Data into Part Services\n");
			
			String sql7 = "LOAD XML LOCAL INFILE 'C:/Users/Khang/workspace/dom_parser/XML/serviceprovider.xml' INTO TABLE payment ROWS IDENTIFIED BY '<ServiceProvider>';";
			
			statement.executeUpdate(sql7);
			System.out.println("Inserted Data into Service Provider\n");
			
			String sql8 = "LOAD XML LOCAL INFILE 'C:/Users/Khang/workspace/dom_parser/XML/services.xml' INTO TABLE pricing ROWS IDENTIFIED BY '<Services>';";
			
			statement.executeUpdate(sql8);
			System.out.println("Inserted Data into Services\n");
			
			String sql9 = "LOAD XML LOCAL INFILE 'C:/Users/Khang/workspace/dom_parser/XML/user.xml' INTO TABLE transaction ROWS IDENTIFIED BY '<User>';";
			
			statement.executeUpdate(sql9);
			System.out.println("Inserted Data into User\n");

			
			statement.close();
		}catch(SQLException e){
			System.out.println(e.getMessage());
		}
	}

}
