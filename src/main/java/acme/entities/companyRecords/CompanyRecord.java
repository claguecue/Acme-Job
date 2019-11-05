
package acme.entities.companyRecords;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.URL;

import acme.framework.entities.DomainEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class CompanyRecord extends DomainEntity {

	// Serialization identifier -----------------------------------------------
	private static final long	serialVersionUID	= 1L;

	//Atributes----------------------------------

	@NotBlank
	private String				name;

	@NotBlank
	private String				sector;

	@NotBlank
	private String				ceo;

	@NotBlank
	private String				description;

	@NotBlank
	@URL
	private String				website;

	@Column(unique = true)
	@Pattern(regexp = "^\\+[1-9]{1,3}\\([0-9]{1,4}\\)[0-9]{6,10}$")
	private String				phone;

	@Email
	private String				email;

	@NotNull
	private Boolean				isInc;

	//	@NotNull
	private Integer				starNumber;

	// Derived attributes -----------------------------------------------------

	// Relationships ----------------------------------------------------------
}
