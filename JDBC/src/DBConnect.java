import java.sql.*;

public class DBConnect {
    public static final String DB_URL = "jdbc:mysql://localhost/university";
    public static final String DB_USER = "root";
    public static final String DB_PASSWORD = "12345678";
    public static void main(String[] args){

        Connection connect = null;

        try {
            connect = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
            connect.setAutoCommit(false);
            PreparedStatement preparedStatement = connect.prepareStatement("INSERT INTO student(student_name, student_surname, student_class) VALUES (?, ?, ?)");
            preparedStatement.setString(1,"Ecrin");
            preparedStatement.setString(2,"Yazgı");
            preparedStatement.setInt(3,3);
            preparedStatement.executeUpdate();

            if (true){
                throw new SQLException();
            }

            preparedStatement.setString(1,"Ali");
            preparedStatement.setString(2,"Yazgı");
            preparedStatement.setInt(3,1);
            preparedStatement.executeUpdate();

        }catch (SQLException e){
            try {
                if (connect != null) {
                    connect.rollback();
                }
            }
            catch (SQLException ex) {
                System.out.println(e.getMessage());
            }
        }

        /**
        try {
            connect = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
            statement = connect.createStatement();
            String stSQL = "DELETE FROM student WHERE student_id = '1'";
            statement.executeUpdate(stSQL);

            PreparedStatement preparedStatement = connect.prepareStatement("DELETE FROM student WHERE student_id = ?");
            preparedStatement.setInt(1,3);
            preparedStatement.executeUpdate();

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        **/
        /**
        try {
            connect = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
            statement = connect.createStatement();
            String stSQL = "UPDATE student SET student_name = 'Selim' where student_id = '2'";
            statement.executeUpdate(stSQL);

            PreparedStatement preparedStatement = connect.prepareStatement("UPDATE student SET student_name = ? where student_id = ?");
            preparedStatement.setString(1,"Kadir");
            preparedStatement.setInt(2,1);
            preparedStatement.executeUpdate();

            preparedStatement.close();
            statement.close();

        } catch (SQLException e){
            System.out.println(e.getMessage());
        }


         try {
                      connect = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
                      //Statement statement = connect.createStatement();
                     //System.out.println(statement.executeUpdate(sql));
                     PreparedStatement preparedStatement = connect.prepareStatement("INSERT INTO student(student_name, student_surname, student_class) VALUES (?, ?, ?)");
                      preparedStatement.setString(1,"Ebru");
                     preparedStatement.setString(2,"Hancerli");
                      preparedStatement.setInt(3,4);
                      preparedStatement.executeUpdate();

                     preparedStatement.close();

                  }catch (SQLException e){
                      System.out.println(e.getMessage());
                 }
        try {
            connect = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
            System.out.println("Bağlantı sağlandı.");
            Statement st = connect.createStatement();
            ResultSet data = st.executeQuery(sql);
            while (data.next()){
                System.out.print("ID : "+ data.getInt("student_id"));
                System.out.print("\tAD : "+ data.getString("student_name"));
                System.out.print("\tSOYAD : "+ data.getString("student_surname"));
                System.out.print("\tSINIF : "+ data.getInt("student_class"));
                System.out.println();
            }
        }
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }
         **/

    }
}
