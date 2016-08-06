package DTO;

public class EmployeeDTO {
	private int id;
	private String password;
	private String name;

	public EmployeeDTO(int id, String name, String password) {
		setId(id);
		setPassword(password);
		setName(name);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


}
