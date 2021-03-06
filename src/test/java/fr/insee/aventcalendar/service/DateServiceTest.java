package fr.insee.aventcalendar.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DateServiceTest {

    @Autowired
    private DateService dateService;

    @Test
    public void shallGetEqualString() {
        Long timestamp = Long.valueOf(0);
        // In january in Paris, it's winter hour so +1h comparing to UTC
        assertEquals("01/01/1970 01:00:00", dateService.formatDate(timestamp));
    }

}