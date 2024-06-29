package exceptionhandling;

public class Account {

	String accno;
	String accholdername;
	double accbal;
	
	Account(){
		
	}
	Account(String accno, String accholdername, double accbal){
	
	this.accno=accno;
	this.accholdername="accholdername";
	this.accbal=accbal;
		 
		 
	}
	public String getAccno() {
		return accno;
	}
	public void setAccno(String accno) {
		this.accno = accno;
	}
	public String getAccholdername() {
		return accholdername;
	}
	public void setAccholdername(String accholdername) {
		this.accholdername = accholdername;
	}
	public double getAccbal() {
		return accbal;
	}
	public void setAccbal(double d) {
		this.accbal = d;
	}
	
}
