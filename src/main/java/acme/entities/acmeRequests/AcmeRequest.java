/*
 * Request.java
 *
 * Copyright (c) 2019 Rafael Corchuelo.
 *
 * In keeping with the traditional purpose of furthering education and research, it is
 * the policy of the copyright owner to permit non-commercial use and redistribution of
 * this software. It has been tested carefully, but it is not guaranteed for any particular
 * purposes. The copyright owner does not offer any warranties or representations, nor do
 * they accept any liabilities with respect to them.
 */
//
// +title: String{NotBlank}
// +creationMoment: Date{Temporal(TIMESTAMP),Past}
// +deadline: Date{Temporal(TIMESTAMP)}
// +text: String{NotBlank}
// +reward: Money{NotNull}
// +ticker: String{Pattern(R[A-Z]{4}-[0-9]{4})}

package acme.entities.acmeRequests;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;

import acme.framework.datatypes.Money;
import acme.framework.entities.DomainEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class AcmeRequest extends DomainEntity {

	// Serialization identifier -----------------------------------------------

	private static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------

	@NotBlank
	private String				title;

	@Temporal(TemporalType.TIMESTAMP)
	@Past
	private Date				creationMoment;

	@Temporal(TemporalType.TIMESTAMP)
	private Date				deadline;

	@NotBlank
	private String				text;

	@NotNull
	private Money				reward;

	@Pattern(regexp = "R[A-Z]{4}-[0-9]{4}")
	private String				ticker;

	// Derived attributes -----------------------------------------------------

	// Relationships ----------------------------------------------------------

}
