package physio.database.entities;

import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Exercise {

	@Id
	@NotNull
	private String id;

	@Id
	@NotNull
	@OneToMany(mappedBy="id", targetEntity=User.class)
	private String patientId;

	@NotNull
	private String exercisePoolId;

	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String description;
}
