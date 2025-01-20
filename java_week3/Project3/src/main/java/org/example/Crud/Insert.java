package org.example.Crud;


import org.example.FactoryConnector;

import java.sql.*;

public class Insert {

    public static void main(String[] args) {

        Connection connection = null;
        try {
            connection = FactoryConnector.getConnection();

            PreparedStatement preparedStatement = connection
                    .prepareStatement("insert into employee(name, salary) values(?,?)");

            preparedStatement.setString(1, "pooja");
            preparedStatement.setInt(2, 50000);

            int noOfRecordEffected = preparedStatement.executeUpdate();

            System.out.println(noOfRecordEffected);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}