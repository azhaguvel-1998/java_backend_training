package com.ani.unit.testing.demo.repository;


import com.ani.unit.testing.demo.domain.App;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;


import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
@SpringBootTest
public class AppRepositoryTest {
    @Autowired
private AppRepository repository;

    @Test
    public void testAppBetweenDates() {
        List<App> apps = repository.findByPubBetween(
                Date.valueOf(LocalDate.of(2021, 1, 1)),
                Date.valueOf(LocalDate.of(2022, 1, 1))
        );
        Assertions.assertTrue(apps.size() > 0);
    }

}
