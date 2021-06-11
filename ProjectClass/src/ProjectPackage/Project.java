package ProjectPackage;

public class Project {
	public String name;
	public String description;

	public Project(String name, String description) {
		this.name = name;
		this.description = description;
	}
	
	public Project() {
		
	}
	
	public Project(String name) {
		this.name = name;
	}
	
	public String elevatorpitch() {
		String result =  this.name + ":" +this.description;
		return result;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
