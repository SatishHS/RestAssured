package POJOClass;

public class UserPojo 
{
//	Rule-1: Declare all the required variables globally
	String name;
	String job;
	
	
//	Rule-2: Create a parameterized constructor to initialise
	public UserPojo(String name, String job) {
	this.name = name;
	this.job = job;
	}
	
//	Rule-3: Provide getters and setters to access it
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}
}