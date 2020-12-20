package edu.vinaenter.models;



import org.hibernate.validator.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {
	
	private int id;
	
	@NotEmpty(message = "Username khong duoc rong")
	private String username;
	
	@NotEmpty(message = "Fullname khong duoc rong")
	private String fullname;
	
	@NotEmpty(message = "Password khong duoc rong")
	private String password;

}
