import java.util.HashMap;

public class AppointmentService {
    private HashMap<String, Appointment> appointments;

    // Constructor
    public AppointmentService() {
        appointments = new HashMap<>();
    }

    // Add appointment
    public void addAppointment(Appointment appointment) {
        if (appointments.containsKey(appointment.getAppointmentId())) {
            throw new IllegalArgumentException("Appointment ID must be unique");
        }
        appointments.put(appointment.getAppointmentId(), appointment);
    }

    // Delete appointment
    public void deleteAppointment(String appointmentId) {
        if (!appointments.containsKey(appointmentId)) {
            throw new IllegalArgumentException("Appointment not found");
        }
        appointments.remove(appointmentId);
    }
}
