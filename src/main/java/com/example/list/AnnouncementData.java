package com.example.list;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class AnnouncementData {
    public List<Announcement> getData() {
        List<Announcement> announcements = new ArrayList<>();

        Connection connection=null;
        Statement statement=null;
        ResultSet resultSet=null;

        try {
            connection=DatabaseConnection.connectDatabase();
            String sql="SELECT * FROM announcementtable";
            statement=connection.createStatement();
            resultSet= statement.executeQuery(sql);

            while(resultSet.next()) {


                String title=resultSet.getString("title");
                String description=resultSet.getString("description");
                String firstDate=resultSet.getString("firstdate");
                String secondDate=resultSet.getString("seconddate");
                int id=resultSet.getInt("id");

                Announcement announcement1=new Announcement(title,description,firstDate,secondDate,id);
                announcements.add(announcement1);

            }
            return announcements;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            close(connection,statement,resultSet);
        }

    }
    public Announcement getId(int id) {
        Announcement a=null;
        Connection connection=null;
        PreparedStatement statement=null;
        ResultSet resultSet=null;
        try {
            connection=DatabaseConnection.connectDatabase();
            String query = "SELECT * FROM announcementtable where id=?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                a = new Announcement( rs.getString("title"),
                        rs.getString("description"), rs.getString("firstdate"),
                        rs.getString("seconddate"),rs.getInt("id"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
        close(connection,statement,resultSet);
    }

        return a;

    }

    private void close(Connection connection, Statement statement, ResultSet resultSet){
        try {
            if(resultSet!=null) {
                resultSet.close();
            }
            if(statement!=null) {
                statement.close();
            }
            if(connection!=null) {
                connection.close();
            }
        }catch (Exception exc) {
            exc.printStackTrace();
        }

    } public void addAnnouncement(Announcement announcement) {

        Connection connection=null;
        PreparedStatement preparedStatement=null;
        ResultSet resultSet=null;

        try {
            connection=DatabaseConnection.connectDatabase();
            String sql="INSERT INTO announcementtable (title,description,firstdate,seconddate) VALUES (?,?,?,?)";
            preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setString(1,announcement.getTitle());
            preparedStatement.setString(2,announcement.getDescription());
            preparedStatement.setString(3,announcement.getFirstdate());
            preparedStatement.setString(4,announcement.getSeconddate());
            preparedStatement.execute();


        } catch (SQLException e) {

            throw new RuntimeException(e);

        } catch (ClassNotFoundException e) {

            throw new RuntimeException(e);
        }
        finally {
            close(connection,preparedStatement,resultSet);
        }


    }
    public void deleteAnnouncement(int id) {

        Connection connection=null;
        PreparedStatement preparedStatement=null;
        ResultSet resultSet=null;

        try {
            connection=DatabaseConnection.connectDatabase();
            String sql="DELETE FROM announcementtable WHERE id=?";
            preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setInt(1,id);
            preparedStatement.execute();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        finally {
            close(connection,preparedStatement,resultSet);
        }


    }
    public void updateAnnouncement(Announcement announcement){
        Connection connection=null;
        PreparedStatement preparedStatement=null;
        ResultSet resultSet=null;
        try {
            connection=DatabaseConnection.connectDatabase();
            String query = "UPDATE announcementtable SET title=?,description=?,firstdate=?,seconddate=? where id=?";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1,announcement.getTitle());
            preparedStatement.setString(2,announcement.getDescription());
            preparedStatement.setString(3,announcement.getFirstdate());
            preparedStatement.setString(4,announcement.getSeconddate());
            preparedStatement.setInt(5,announcement.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        finally {
            close(connection,preparedStatement,resultSet);
        }
    }
}
