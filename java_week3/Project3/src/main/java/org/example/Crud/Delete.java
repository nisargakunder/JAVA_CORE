package org.example.Crud;

import org.example.FactoryConnector;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Delete {

        public static void main(String[] args) {

            Connection connection = null;
            try {
                connection = FactoryConnector.getConnection();

                PreparedStatement preparedStatement = connection
                        .prepareStatement("delete from employee where name= ?");


                preparedStatement.setString(1, "pooja");

                int noOfRecordEffected = preparedStatement.executeUpdate();

                System.out.println(noOfRecordEffected);

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }


        }
    }
