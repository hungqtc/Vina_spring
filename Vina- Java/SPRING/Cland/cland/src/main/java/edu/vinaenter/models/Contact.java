package edu.vinaenter.models;


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
public class Contact {
	
	private int id;
	private String name;
	private String email;
	private String subject;
	private String content;
}
