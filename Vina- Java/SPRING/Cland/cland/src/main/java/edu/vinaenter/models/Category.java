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
public class Category {
	
	private int id;
	
	@NotEmpty(message = "Ten danh muc khong duoc rong")
	private String name;

}
