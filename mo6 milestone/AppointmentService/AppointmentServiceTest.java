import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

public class AppointmentServiceTest {

    @Test
    public void testAddValidAppointment() {
        AppointmentService service = new AppointmentService();
        Appointment appointment = new Appointment("12345", new Date(), "Test description");
        service.addAppointment(appointment);

        assertEquals("12345", appointment.getAppointmentId());
    }

    @Test
    public void testAddDuplicateAppointmentId() {
        AppointmentService service = new AppointmentService();
        Appointment appointment1 = new Appointment("12345", new Date(), "Test description");
        service.addAppointment(appointment1);

        Appointment appointment2 = new Appointment("12345", new Date(), "Another description");

        assertThrows(IllegalArgumentException.class, () -> {
            service.addAppointment(appointment2); // Should fail due to duplicate ID
        });
    }

    @Test
    public void testDeleteAppointment() {
        AppointmentService service = new AppointmentService();
        Appointment appointment = new Appointment("12345", new Date(), "Test description");
        service.addAppointment(appointment);

        service.deleteAppointment("12345");
        assertThrows(IllegalArgumentException.class, () -> {
            service.deleteAppointment("12345"); // Should throw exception since it was deleted
        });
    }

    @Test
    public void testDeleteNonexistentAppointment() {
        AppointmentService service = new AppointmentService();
        assertThrows(IllegalArgumentException.class, () -> {
            service.deleteAppointment("nonexistent"); // Should throw exception
        });
    }
}
