
public class Singer {
	private String name;
	private int id;
	private static int counter=0;
	static Song [] songs= new Song [10];
	

	public int getId() {
		return id;
	}

	public Singer(String name1) {
		name = name1;
		id = counter++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name1) {
		name = name1;
	}

	@Override
	public String toString() {
		return "Singer [name=" + name + ", id=" + id + "]";
	}

}
