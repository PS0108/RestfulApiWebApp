package springbootstarter.processor;

public class WebSeries {

	private int id;
	private String Name;
	private String Desc;
	
	public WebSeries() {

	}
	
	public WebSeries(int id, String name, String desc) {
		super();
		this.id = id;
		Name = name;
		Desc = desc;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDesc() {
		return Desc;
	}
	public void setDesc(String desc) {
		Desc = desc;
	}
	
}
