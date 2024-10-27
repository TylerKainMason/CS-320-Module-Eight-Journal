import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

public class AppointmentTest {

    @Test
    public void testValidAppointment() {
        Appointment appointment = new Appointment("12345", new Date(), "Test description");
        assertEquals("12345", appointment.getAppointmentId());
        assertNotNull(appointment.getAppointmentDate());
        assertEquals("Test description", appointment.getDescription());
    }

    @Test
    public void testInvalidAppointmentId() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Appointment(null, new Date(), "Test description");
        });
        assertThrows(IllegalArgumentException.class, () -> {
            new Appointment("12345678901", new Date(), "Test description"); // Over 10 characters
        });
    }

    @Test
    public void testInvalidAppointmentDate() {
        Date pastDate = new Date(System.currentTimeMillis() - 100000); // A date in the past
        assertThrows(IllegalArgumentException.class, () -> {
            new Appointment("12345", pastDate, "Test description");
        });
    }

    @Test
    public void testInvalidDescription() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Appointment("12345", new Date(), null);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            new Appointment("12345", new Date(), "This description is definitely way too long to be valid in this system.");
        });
    }
}
