package by.javaguru.hibernate.starter;

import by.javaguru.hibernate.starter.entity.Birthday;
import by.javaguru.hibernate.starter.entity.User;
import jakarta.persistence.Column;
import jakarta.persistence.Table;
import org.junit.jupiter.api.Test;
import by.javaguru.hibernate.starter.entity.User;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

public class HibernateRunnerTest {

//    @Test
//    public void testHibernateApi() throws SQLException, IllegalAccessException {
//
//        var person = User.builder()
//                .username("VAY@mail.ru")
//                .firstname("Ivan123")
//                .lastname("TOrov")
//                .birthDate(LocalDate.of(2002, 05, 29))
//                .age(33)
//                .build();
//        var sql = """
//                insert into
//                %s
//                (%s)
//                values
//                (%s)
//                """;
//        var tableName =    Optional.ofNullable(person.getClass().getAnnotation(Table.class))
//                .map(table -> table.schema() + "." + table.name())
//                .orElse(person.getClass().getName());
//
//        Field[] fields = person.getClass().getDeclaredFields();
//
//        var columNames = Arrays.stream(fields)
//                .map(field -> Optional.ofNullable(field.getAnnotation(Column.class))
//                        .map(Column::name)
//                        .orElse(field.getName()))
//                .collect(Collectors.joining(", "));
//
//        var columnValues = Arrays.stream(fields)
//                .map(field -> "?")
//                .collect(Collectors.joining(", "));
//
//        Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres",
//                "postgres", "123");
//
//        PreparedStatement preparedStatement = connection.prepareStatement(sql.formatted(tableName,columNames,columnValues));
//
//        for (int i = 0; i < fields.length; i++) {
//            fields[i].setAccessible(true);
//            preparedStatement.setObject(i+1,fields[i].get(person));
//        }
//        System.out.println(preparedStatement);
//        preparedStatement.executeUpdate();
//        preparedStatement.close();
//        connection.close();
//    }

}