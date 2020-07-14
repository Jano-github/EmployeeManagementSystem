package Sample.EmployeeManagement.Bean;

public class EmployeeException extends Throwable{
	
	public int empExecId;
	
	public String empExecDesc;
	
	

	public EmployeeException(int empExecId, String empExecDesc) {
		super();
		this.empExecId = empExecId;
		this.empExecDesc = empExecDesc;
	}

	public int getEmpExecId() {
		return empExecId;
	}

	public void setEmpExecId(int empExecId) {
		this.empExecId = empExecId;
	}

	public String getEmpExecDesc() {
		return empExecDesc;
	}

	public void setEmpExecDesc(String empExecDesc) {
		this.empExecDesc = empExecDesc;
	}
	
	

}
