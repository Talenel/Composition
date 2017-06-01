
public class Person {

	private Job job;
	private Education edu;
	private String name;
	
	public Person(String aName, Job aJob, Education aEdu ){
	    job=aJob;
	    job.setSalary(1000L);
	    edu=aEdu;
	    name=aName;
	    
	}
	
	public long getSalary() {
	    return job.getSalary();
	}
	
	public String getEducationList(){
		return edu.toString();
			
	}
	public String getName()
	{
		return name;
	}
	public Education getEducation()
	{
		return edu;
	}
	public Job getJob()
	{
		return job;
	}
	public String getJobInfo()
	{
		return job.toString();
	}
	
	
	public void setName(String aName)
	{
		name=aName;
	}
	public void changeJob(Job j)
	{
		job=j;
	}
	public void setEducation(Education e)
	{
		edu=e;
	}
	
	
	
	
	@Override
	public String toString()
	{
	
		return name+"\n \n"+edu.toString() +job.toString();
	}
}
