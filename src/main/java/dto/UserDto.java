package dto;

public class UserDto {
	private Long id;
	private String username;
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserDto(Long id, String username, String password) {

		this.id = id;
		this.username = username;
		this.password = password;
	}

}
