package Spring2.com;

public class Education {
	private String course;
	private int duration;
	private int marks;

	public Education(String course, int duration, int marks) {
		super();
		this.course = course;
		this.duration = duration;
		this.marks = marks;
	}

	public Education() {
		super();
	}

	@Override
	public String toString() {
		return "Education [course=" + course + ", duration=" + duration + ", marks=" + marks + "]";
	}

}
