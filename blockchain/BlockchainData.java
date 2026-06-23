import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.beans.GFG2;
public class BlockchainData {
	 private static final String DATABASE_URL = "";
	    private static final String DATABASE_USERNAME = "";
	    private static final String DATABASE_PASSWORD = "";

	    public static void main(String[] args) {
	        // Connect to the database
	    	Connection con = null;
	    	try {
				
				con = DriverManager.getConnection(
						
	       
	            // Assuming you have a blockchain network and smart contracts deployed

	            // Retrieve data from the blockchain
	            String blockchainData = retrieveDataFromBlockchain();

	            // Store the blockchain data in the database
	            storeDataInDatabase(blockchainData, con);

	            System.out.println("Blockchain data stored in the database successfully.");
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

	    private static String retrieveDataFromBlockchain() {
	        // Implement the logic to retrieve data from the blockchain
	        // This could involve interacting with the blockchain network and smart contracts
	        // Return the retrieved data
	        return "Blockchain data";
	    }

	    private static void storeDataInDatabase(String fid, Connection connection) throws SQLException {
	        // Prepare the SQL statement to insert data into the database
	    	/*String hashValue=GFG2.getHash(fid);*/
	        String insertQuery = "insert into uploadfiles values(0)";
	        try (PreparedStatement statement = connection.prepareStatement(insertQuery)) {
	            // Set the data parameter
	        	
	            statement.setString(1, fid);

	            // Execute the SQL statement
	            statement.executeUpdate();
	        }
	    }
	}


