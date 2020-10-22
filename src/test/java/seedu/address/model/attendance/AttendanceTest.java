package seedu.address.model.attendance;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class AttendanceTest {
    @Test
    public void fromDateString() {
        // null attendance
        assertThrows(NullPointerException.class, () -> Attendance.fromDateString(null));

        // invalid attendances
        assertThrows(IllegalArgumentException.class, () -> Attendance.fromDateString(""));
        assertThrows(IllegalArgumentException.class, () -> Attendance.fromDateString("hello"));

        // valid attendances
        assertEquals(Attendance.fromDateString("13/01/2020").toString(), "13/01/2020");
    }
}
