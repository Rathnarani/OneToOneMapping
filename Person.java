package test;

public class Person {
private String personID;
private String personName;
private PersonInfo personDetail;
public Person()
{
	
}
public Person(String personID,String personName,PersonInfo personDetail){
	this.personID=personID;
	this.personName=personName;
	this.personDetail=personDetail;
}
public String getPersonID() {
	return personID;
}
public void setPersonID(String personID) {
	this.personID = personID;
}
public String getPersonName() {
	return personName;
}
public void setPersonName(String personName) {
	this.personName = personName;
}
public PersonInfo getPersonDetail() {
	return personDetail;
}
public void setPersonDetail(PersonInfo personDetail) {
	this.personDetail = personDetail;
}
}
