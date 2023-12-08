package by.javaguru.hibernate.starter;


import by.javaguru.hibernate.starter.entity.Birthday;
import by.javaguru.hibernate.starter.entity.PersonalInfo;
import by.javaguru.hibernate.starter.entity.Role;
import by.javaguru.hibernate.starter.entity.User;
import by.javaguru.hibernate.starter.util.HibernateUtil;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDate;

@Slf4j
public class HibernateRunner {
    // private static final Logger log = LoggerFactory.getLogger(HibernateRunner.class);

    public static void main(String[] args) {
        User user = User.builder()
                .username("i@gmail.com")
                .personalInfo(PersonalInfo.builder()
                        .firstname("Pavel")
                        .lastname("Ivanov")
                        .birthDate(new Birthday(LocalDate.of(2000, 1, 19)))
                        .build())
                .role(Role.ADMIN)
                .build();
        log.info("User object is  transient state: {}", user);

        try (var sessionFactory = HibernateUtil.buildSessionFactory()) {
            try (var session1 = sessionFactory.openSession()) {
                session1.beginTransaction();
                session1.saveOrUpdate(user);
                session1.getTransaction().commit();
            }
        }
//        try (var sessionFactory = configuration.buildSessionFactory();
//             var session = sessionFactory.openSession()) {
//            var person = User.builder()
//                    .username("VAY@mail.ru")
//                    .firstname("Ivan123")
//                    .lastname("TOrov")
//                    .birthDate(LocalDate.of(2222, 05, 29))
//                    .age(33)
//                    .build();
//           session.getTransaction().begin();
//           session.persist(person);
//           session.getTransaction().commit();
//
//        }
    }
}
