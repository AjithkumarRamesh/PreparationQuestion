package peparationQuestions;

public class StreamFull {
	private int id;
	private int age;
	private String name;
	private int total;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public StreamFull(int id, int age, String name, int total) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
		this.total = total;
	}
	@Override
	public String toString() {
		return "StreamFull [id=" + id + ", age=" + age + ", name=" + name + ", total=" + total + "]";
	}
	
}
