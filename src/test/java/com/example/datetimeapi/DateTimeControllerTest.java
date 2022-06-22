package com.example.datetimeapi;

import com.fasterxml.jackson.datatype.jsr310.deser.LocalTimeDeserializer;
import org.junit.jupiter.api.Test;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;

class DateTimeControllerTest {
    DateTimeController dtc = new DateTimeController();

    @Test
    void time() {
        LocalTime exp = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String expected = exp.format(formatter);

        String result = dtc.time();

        assertEquals(expected, result);



    }
}