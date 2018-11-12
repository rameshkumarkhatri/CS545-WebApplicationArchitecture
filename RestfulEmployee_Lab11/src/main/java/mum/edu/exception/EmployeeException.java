package mum.edu.exception;

public class EmployeeException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4338783004581268883L;
	private String id;
	private String message = "Employee Not Found.";
	
 	public EmployeeException() {}
	
	public EmployeeException(String id, String message) {
		this.id = id;

		if (message != null) this.message = message;
		
	}
	
	public String getFullMessage() {
		return (message + id);
	}
	
	public String getEmployeeId() {
		return id;
	}
	
	@Override
	public String getLocalizedMessage() {
		// TODO Auto-generated method stub
		return super.getLocalizedMessage();
	}


}
