
public class Job {
	
	private String role;
	private long salary;
	private int id;
	private String name;
	
	public Job(String aName, String aRole, long aSalary, int aID)
	{
		role=aRole;
		salary=aSalary;
		id=aID;
		name=aName;
		
	}
	
	public String getRole() {
	    return role;
	}
	
	public void setRole(String role) {
	    this.role = role;
	}
	
	public long getSalary() {
	    return salary;
	}
	
	public void setSalary(long salary) {
	    this.salary = salary;
	}
	
	public int getId() {
	    return id;
	}
	
	public void setId(int id) {
	    this.id = id;
	}
	
	public String toString()
	{
		
		return "Job\n"+ name+":\n"+role+",\nSalary: $"+salary+", ID: "+id+", ";
		
	}
	
}
