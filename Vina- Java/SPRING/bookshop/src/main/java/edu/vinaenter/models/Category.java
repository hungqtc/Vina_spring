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
	
	@NotEmpty(message = "Tên danh mục không được rỗng")
	private String name;

}
