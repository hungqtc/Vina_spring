package edu.vinaenter.models;

import java.sql.Timestamp;

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
public class Land {

	private int id;
	private String name;
	private String description;
	private Timestamp dateCreate;
	private Category cat;
	private String picture;
	private double area;
	private String address;
	private int CountViews;
}
