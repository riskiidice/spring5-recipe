package example.springframework.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Setter
@Getter
@Entity
public class Category {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String description;
	
	@ManyToMany(mappedBy="categories")
	private Set<Recipe> recipes;

}
