package by.javaguru.hibernate.starter.converter;

import by.javaguru.hibernate.starter.entity.Birthday;

import jakarta.persistence.AttributeConverter;

import java.sql.Date;
import java.util.Optional;

public class BirthdayConvertor implements AttributeConverter<Birthday, Date> {
    @Override
    public Date convertToDatabaseColumn(Birthday birthday) {
        return Optional.ofNullable(birthday)
                .map(Birthday::birthDate)
                .map(Date::valueOf)
                .orElse(null);
    }

    @Override
    public Birthday convertToEntityAttribute(Date date) {
        return Optional.ofNullable(date)
                .map(Date::toLocalDate)
                .map(Birthday::new)
                .orElse(null);
    }
}