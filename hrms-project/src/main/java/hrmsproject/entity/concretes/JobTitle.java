package hrmsproject.entity.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="job_titles")
@AllArgsConstructor
@NoArgsConstructor
public class JobTitle {
	
	
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name="id")
	@Id
	
	private int id;
	
	@Column(name="title")
	private String title;

	
	

}
