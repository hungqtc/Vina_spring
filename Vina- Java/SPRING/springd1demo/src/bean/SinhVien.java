package bean;

public class SinhVien {
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public SinhVien(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public SinhVien() {
		super();
	}
}
