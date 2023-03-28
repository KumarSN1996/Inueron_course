package StoredProcedure;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CrudOperation {

	public static void main(String[] args) throws SQLException {
		Scanner sc = null;
		Connection connection = null;
		Statement statement = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultset = null;
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/KumarSwamyN", "root", "root");

		System.out.println("Data base connection is established");

		System.out.println("==welocme to CRUD application==");
		System.out.println();
		System.out.println("Choose from the menu");
		System.out.println("Select from the options");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("1.create 2.insert 3.read 4.update 5.delete");
		sc = new Scanner(System.in);
		int option = sc.nextInt();
		try {
			switch (option) {
			case 1:
				String query1 = "create table arpitha(name varchar(15), age int(15))";
				if (connection != null) {
					statement = connection.createStatement();
					if (statement != null) {
						int i = statement.executeUpdate(query1);

						if (i == 1) {
							System.out.println("A new table is created");
						} else {
							System.out.println("Table is not created");
						}
					}
				}

				break;
			case 2:
				String query2 = "insert into arpitha values(?,?);";
				if (connection != null) {
					preparedStatement = connection.prepareStatement(query2);
					if (preparedStatement != null) {
						while (true) {

							System.out.println("Enter name and age to the table");
							String name = sc.next();
							int age = sc.nextInt();
							preparedStatement.setString(1, name);
							preparedStatement.setInt(2, age);
							int insertion = preparedStatement.executeUpdate();
							if (insertion == 1) {
								System.out.println("Insertion successfull");
							} else {
								System.out.println("Unbale to perform inserion opearion");
							}
							System.out.println("if you want to insert again, press yes/no");
							String ys = sc.next();
							if (ys.equalsIgnoreCase("no")) {
								break;
							}

						}
					}
				}
				break;
			case 3:
				String query3 = "select * from arpitha";
				if (connection != null) {
					statement = connection.createStatement();
					if (statement != null) {
						resultset = statement.executeQuery(query3);
						if (resultset != null) {
							while (resultset.next()) {
								String name = resultset.getString(1);
								int age = resultset.getInt(2);
								System.out.println(age + "\t" + name);

							}
						}
					}
				}
				break;
			case 4:
				String query = "update arpitha set name = ? where age = ?; ";
				System.out.println("Enter which name to be updated::");
				System.out.println("Enter the age ::");
				if (connection != null) {
					preparedStatement = connection.prepareStatement(query);
					String name = sc.next();
					int age = sc.nextInt();
					if (preparedStatement != null) {
						preparedStatement.setString(1, name);
						preparedStatement.setInt(2, age);
						int updatedResult = preparedStatement.executeUpdate();

						if (updatedResult == 1) {
							System.out.println("updation is sussfully done");
						} else {
							System.out.println("updation operation is failed");
						}
					}
				}
				break;
			case 5:
				if (connection != null) {
					String query11 = "delete from arpitha where age = ?";
					preparedStatement = connection.prepareStatement(query11);
					if (preparedStatement != null) {
						System.out.println("Enter which age to be deleted ::");
						int ages = sc.nextInt();
						preparedStatement.setInt(1, ages);
						int update = preparedStatement.executeUpdate();
						if (update == 1) {
							System.out.println("deletion operation is successfull");
						} else {
							System.out.println("unable to perfrom deletion opearion");
						}
					}
				}
				break;
			default:
				System.out.println("No operation was able to perform");
				break;

			}
		} catch (SQLException a) {
			System.out.println("opearion failed due to ::" + a.getMessage());
		} catch (Exception e) {
			// parent exception
			e.printStackTrace();
		} finally {
			if (sc != null) {
				sc.close();
			}
			if (statement != null) {
				statement.close();
			}
			if (preparedStatement != null) {
				preparedStatement.close();
			}

			if (resultset != null) {
				resultset.close();
			}

			if (connection != null) {
				connection.close();
			}
		}

	}
}
