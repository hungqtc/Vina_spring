package edu.vinaenter.dto;

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
public class LandDto {

	private int id;
	private String landName;
	private String description;
	private Timestamp dateCreate;
	private int cid;
	private String catName;
	private String picture;
	private double area;
	private String address;
	private int countViews;
}
