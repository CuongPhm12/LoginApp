package dto;

public class CourseDto {
	private String course_id;
	private String subject_id;
	private String course_code;
	private String title;
	private int number_of_credits;
	public String getCourse_id() {
		return course_id;
	}
	public void setCourse_id(String course_id) {
		this.course_id = course_id;
	}
	public String getSubject_id() {
		return subject_id;
	}
	public void setSubject_id(String subject_id) {
		this.subject_id = subject_id;
	}
	public String getCourse_code() {
		return course_code;
	}
	public void setCourse_code(String course_code) {
		this.course_code = course_code;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getNumber_of_credits() {
		return number_of_credits;
	}
	public void setNumber_of_credits(int number_of_credits) {
		this.number_of_credits = number_of_credits;
	}
	public CourseDto(String course_id, String subject_id, String course_code, String title, int number_of_credits) {
		super();
		this.course_id = course_id;
		this.subject_id = subject_id;
		this.course_code = course_code;
		this.title = title;
		this.number_of_credits = number_of_credits;
	}
	@Override
	public String toString() {
		return "CourseDto [course_id=" + course_id + ", subject_id=" + subject_id + ", course_code=" + course_code
				+ ", title=" + title + ", number_of_credits=" + number_of_credits + "]";
	}
	
	
	
	
}
