package test;

public class PersonInfo {
	private String infoID;
	private String address;
	private String job;
	private Integer income;
	public PersonInfo()
	{
		
	}
	public PersonInfo(String infoID, String address,String job,Integer income)
	{
		this.infoID=infoID;
		this.address=address;
		this.job=job;
		this.income=income;
	}
	public String getInfoID() {
		return infoID;
	}
	public void setInfoID(String infoID) {
		this.infoID = infoID;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public Integer getIncome() {
		return income;
	}
	public void setIncome(Integer income) {
		this.income = income;
	}
	
}
