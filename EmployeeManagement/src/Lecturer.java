
public class Lecturer extends TeachingStaff{
	private Integer numberOfLectures;

	public Lecturer(Integer numberOfLectures) {
		super();
		this.numberOfLectures = numberOfLectures;
	}

	public Lecturer() {
		// TODO Auto-generated constructor stub
	}

	public Integer getNumberOfLectures() {
		return numberOfLectures;
	}

	public void setNumberOfLectures(Integer numberOfLectures) {
		this.numberOfLectures = numberOfLectures;
	}
	public void calculateLecturesDay()
	{
		System.out.println("No of lecturers per day");
	}
	
	@Override
	public void calculateSalary() 
	{
		System.out.println("Lecturer salary");
	}
}
