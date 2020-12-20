package com.hung.dto;

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
public class NewsDTO extends AbstractDTO{
	private String name;
	private String catName;
	private String description;
	private String detail;
	private String picture;
	
}
