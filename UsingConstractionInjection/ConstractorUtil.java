package Spring2.com;

public class ConstractorUtil {
	private int id;
	private String name;
	private String dept;
	private Education edu;

	public ConstractorUtil(int id, String name, String dept, Education edu) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.edu = edu;
	}

	@Override
	public String toString() {
		return "ConstractorUtil [id=" + id + ", name=" + name + ", dept=" + dept + "," + edu + "]";
	}

}
