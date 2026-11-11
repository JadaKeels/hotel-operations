package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTest {

    @Test
    public void punchIn_shouldStoreStartTime() {

        Employee employee =
                new Employee(
                        1,
                        "John Doe",
                        "Front Desk",
                        20.00);

        employee.punchIn(800);

        assertEquals(800, employee.getStartTime());
    }

    @Test
    public void punchOut_shouldCalculateHoursWorked() {

        Employee employee =
                new Employee(
                        1,
                        "John Doe",
                        "Front Desk",
                        20.00);

        employee.punchIn(800);
        employee.punchOut(1700);

        assertEquals(900, employee.getHoursWorked());
    }

