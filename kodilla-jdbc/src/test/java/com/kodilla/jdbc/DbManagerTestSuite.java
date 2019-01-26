package com.kodilla.jdbc;

import org.junit.Assert;
import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbManagerTestSuite {
    @Test
    public void testConnect() throws SQLException {
        //Given
        //When
        DbManager dbManager = DbManager.getInstance();

        //Then
        Assert.assertNotNull(dbManager);
    }

    @Test
    public void testSelectUsers() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();

        //When
        String sqlQuery = "SELECT * FROM USERS";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet resultSet = statement.executeQuery(sqlQuery);

        //Then
        int counter = 0;
        while (resultSet.next()) {
            System.out.println(resultSet.getInt("ID") + ", " +
                    resultSet.getString("FIRSTNAME") + ", " +
                    resultSet.getString("LASTNAME"));
            counter++;
        }
        resultSet.close();
        statement.close();
        Assert.assertEquals(5, counter);
    }

    @Test
    public void testSelectUserAndPosts() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();

        //When
        String sqlQuery = "SELECT U.FIRSTNAME , U.LASTNAME, COUNT(*) AS COUNTER_POSTS FROM USERS U " +
                "JOIN POSTS P ON U.ID = P.USER_ID" +
                " GROUP BY U.FIRSTNAME, U.LASTNAME" +
                " HAVING COUNTER_POSTS >= 2;";

        Statement statement = dbManager.getConnection().createStatement();
        ResultSet resultSet = statement.executeQuery(sqlQuery);

        //Then
        int counterPosts = 0;
        while (resultSet.next()) {
            System.out.println(resultSet.getString("FIRSTNAME") + ", "
                    + resultSet.getString("LASTNAME")
                    + ", " + resultSet.getInt("COUNTER_POSTS"));
            counterPosts++;
        }
        resultSet.close();
        statement.close();

        Assert.assertEquals(1, counterPosts);

    }
}
