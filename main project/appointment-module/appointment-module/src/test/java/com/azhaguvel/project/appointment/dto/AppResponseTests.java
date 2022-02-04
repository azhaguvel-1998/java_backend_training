package com.azhaguvel.project.appointment.dto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AppResponseTests {
    @DisplayName("Dto : Checking Object Creation")
    @Test
    void testObjectCreation() {
        var abc = new AppResponse<>();
        Assertions.assertNotNull(abc);
    }


}
