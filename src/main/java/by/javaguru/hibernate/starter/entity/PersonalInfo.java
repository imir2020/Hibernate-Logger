package by.javaguru.hibernate.starter.entity;

import by.javaguru.hibernate.starter.converter.BirthdayConvertor;
import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Embeddable
public class PersonalInfo {
    private String firstname;
    private String lastname;
    @Convert(converter = BirthdayConvertor.class)
    @Column(name = "birth_date")
    private Birthday birthDate;
}
