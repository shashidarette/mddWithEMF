/**
 * Required packages generated from .genmodel and imports for java libraries used
 */
package UoL.GenDev.Assignment1.registrationSystem;

import UoL.GenDev.Assignment1.registrationSystem.RegistrationSystemFactory;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * This class is an example of instantiating the Registration system model.
 * In reference to Q. 2.c it represents a model instance of "two professionals (e.g., dentists), three appointments 
 * for 3 different services, with three different customers. 
 * @author Shashidar Ette - se146
 *
 */
public class RegistrationModelInstance {
	
	public static void main(String[] args) {
		// 1st Professional instance
		Professional prof1 = createProfessional("156", "James", formatDate("22/01/1980"), 
				formatDate("10/02/2004", false), "Senior Dental Surgeon", "M.D, M.B.B.S", "James@doctors.com", "+44-9000050000");
		
		// 2nd Professional instance
		Professional prof2 = createProfessional("210", "Jamie", formatDate("22/01/1986"), 
				formatDate("10/02/2010"), "Dental Consultant", "M.D, M.B.B.S, B.D.S", "Jamie@doctors.com", "+44-9000070000");

		// 3 different services provided by Dental Clinic
		Service service1 = createService("15", "Dental Consultation", 10.0);
		Service service2 = createService("14", "Dental Filling", 35.0);
		Service service3 = createService("13", "Root Canal", 10.0);

		// 3 different customers availing the services
		Customer cust1 = createCustomer("200", "Alexa", formatDate("22/01/1990"), formatDate("10/02/2016"),
				"Alexa@gmail.com", "+44-9300050000");
		Customer cust2 = createCustomer("320", "Bossini", formatDate("22/01/1988"), formatDate("20/12/2016"),
				"Bossini@gmail.com", "+44-9900060000");
		Customer cust3 = createCustomer("370", "Beckham", formatDate("22/07/1989"), formatDate("20/11/2016"),
				"Beck@gmail.com", "+44-9900060000");

		// Booking 1 which is already completed by 1st professional
		ServiceBooking booking1 = createServiceBooking("15", formatDate("10/03/2017 11:00", true),
				formatDate("10/03/2017 11:30", true), true, 10.0, ServiceStatus.COMPLETED, service1.getServiceId());
		booking1.setCustomer(cust1);
		booking1.setAttendedBy(prof1);

		// Booking 2 and Booking 3 are to be attended by 2nd professional
		ServiceBooking booking2 = createServiceBooking("35", formatDate("22/03/2017 11:00", true),
				formatDate("22/03/2017 11:30", true), false, 0.0, ServiceStatus.DUE, service2.getServiceId());
		booking2.setCustomer(cust2);
		booking2.setAttendedBy(prof2);

		ServiceBooking booking3 = createServiceBooking("36", formatDate("22/03/2017 11:45", true),
				formatDate("22/03/2017 12:30", true), true, 10.0, ServiceStatus.DUE, service3.getServiceId());
		booking3.setCustomer(cust3);
		booking3.setAttendedBy(prof2);

		// Additional ServiceBooking aka. Appoint instance using the createServiceBooking utility function.
		ServiceBooking booking4 = createServiceBooking("37", formatDate("22/03/2017 11:30", true),
				formatDate("22/03/2017 12:30", true), true, 10.0, ServiceStatus.DUE, service3.getServiceId());
		booking4.setCustomer(cust1);
		booking4.setAttendedBy(prof1);

		// Output of the Resource Model Instance based on Q2.c snapshot of the system
		StringBuffer systemInstance = new StringBuffer();
		systemInstance.append("== ServiceBookings ==" + "\r\n");
		systemInstance.append(booking1.toString() + "\r\n");
		systemInstance.append(booking2.toString() + "\r\n");
		systemInstance.append(booking3.toString() + "\r\n");
		systemInstance.append(booking4.toString() + "\r\n");
		systemInstance.append("\r\n");
		
		systemInstance.append("== Services ==" + "\r\n");
		systemInstance.append(service1.toString() + "\r\n");
		systemInstance.append(service2.toString() + "\r\n");
		systemInstance.append(service3.toString() + "\r\n");
		systemInstance.append("\r\n");
		
		systemInstance.append("== Customers ==" + "\r\n");
		systemInstance.append(cust1.toString() + "\r\n");
		systemInstance.append(cust2.toString() + "\r\n");		
		systemInstance.append(cust3.toString() + "\r\n");
		systemInstance.append("\r\n");
		
		systemInstance.append("== Professinals ==" + "\r\n");
		systemInstance.append(prof1.toString() + "\r\n");
		systemInstance.append(prof2.toString() + "\r\n");
		System.out.println(systemInstance.toString());
	}
	

	// Utility Functions
	/**
	 * This is a customer create utility function with below details
	 * @param id : customer id
	 * @param name : customer's name
	 * @param dob : customer's date of birth
 	 * @param dor : customer's date of registration
	 * @param email : email point of contact.
	 * @param contact : contact number
	 * @return Customer object
	 */
	private static Customer createCustomer(String id, String name, Date dob, Date dor, String email, String contact) {
		Customer cust = RegistrationSystemFactory.eINSTANCE.createCustomer();
		cust.setCustomerId(id);
		cust.setName(name);
		cust.setDateOfBirth(dob);
		cust.setDateOfRegistration(dor);
		cust.setEmail(email);
		cust.setContactNumber(contact);

		return cust;
	}

	/**
	 * This is a professional object create function with below details
	 * @param id
	 * @param name
	 * @param dob
	 * @param doj
	 * @param desgination
	 * @param qual
	 * @param email
	 * @param contact
	 * @return Professional object
	 */
	private static Professional createProfessional(String id, String name, Date dob, Date doj, String desgination,
			String qual, String email, String contact) {
		Professional prof = RegistrationSystemFactory.eINSTANCE.createProfessional();
		prof.setProfId(id);
		prof.setName(name);
		prof.setDateOfBirth(dob);
		prof.setDateOfJoining(doj);
		prof.setDesignation(desgination);
		prof.setQualification(qual);
		prof.setEmail(email);
		prof.setContactNumber(contact);

		return prof;
	}

	/**
	 * This is a service booking object create utility function with below details
	 * @param id
	 * @param startDateTime
	 * @param endDateTime
	 * @param isDiscounted
	 * @param discount
	 * @param status
	 * @param serviceId
	 * @return ServiceBooking object
	 */
	private static ServiceBooking createServiceBooking(String id, Date startDateTime, Date endDateTime,
			boolean isDiscounted, double discount, ServiceStatus status, String serviceId) {
		ServiceBooking serviceBooking = RegistrationSystemFactory.eINSTANCE.createServiceBooking();
		serviceBooking.setBookingId(id);
		serviceBooking.setStartDateTime(startDateTime);
		serviceBooking.setEndDateTime(endDateTime);
		serviceBooking.setIsDiscounted(isDiscounted);
		serviceBooking.setDiscount(discount);
		serviceBooking.setStatus(status);

		return serviceBooking;
	}

	/**
	 * This is a service object create utility function with below details
	 * @param id
	 * @param name
	 * @param fees
	 * @return Service object
	 */
	private static Service createService(String id, String name, double fees) {
		Service service = RegistrationSystemFactory.eINSTANCE.createService();
		service.setServiceId(id);
		service.setName(name);
		service.setFees(fees);

		return service;
	}

	/**
	 * This utility function is used to convert date time in string format to Date type
	 * @param dateString : string with date and time value
	 * @param timeValueAvailable : true if time value is available
	 * @return Date
	 * reference : 
	 * https://docs.oracle.com/javase/8/docs/api/java/util/Date.html
	 * https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html
	 */
	private static Date formatDate(String dateString, Boolean timeValueAvailable) {
		DateFormat format = new SimpleDateFormat(timeValueAvailable ? "dd/MM/yyyy HH:mm"  : "dd/MM/yyyy");
		Date date;

		try {
			date = format.parse(dateString);
		} catch (ParseException pex) {
			date = new Date();
		}

		return date;
	}
	
	/**
	 * Overloaded formatDate function with timeValueAvailable set as false
	 * @param dateString
	 * @return Date
	 */
	private static Date formatDate(String dateString) {
		return formatDate(dateString, false);
	}
}
