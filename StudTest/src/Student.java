import java.io.Serializable;

public class Student implements Serializable {

	private Integer rollNo;
	private String name;
	private Boolean isIndian;
	
	public Integer getRollNo() {
		return rollNo;
	}
	public void setRollNo(Integer rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Boolean getIsIndian() {
		return isIndian;
	}
	public void setIsIndian(Boolean isIndian) {
		this.isIndian = isIndian;
	}
	
	public Student(Integer rollNo, String name, Boolean isIndian) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.isIndian = isIndian;
	}
	
	
}
