package ustbatchno.sonarqubetest;

public class Employeeee {
	private String empname;
	private int empage;
	private int years;
	private double salary;
	public Employeeee(String empname, int empage, int years, double salary) {
		super();
		this.empname = empname;
		this.empage = empage;
		this.years = years;
		this.salary = salary;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public int getEmpage() {
		return empage;
	}
	public void setEmpage(int empage) {
		this.empage = empage;
	}
	public int getYears() {
		return years;
	}
	public void setYears(int years) {
		this.years = years;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employeeee [empname=" + empname + ", empage=" + empage + ", years=" + years + ", salary=" + salary
				+ "]";
	}
	

}
