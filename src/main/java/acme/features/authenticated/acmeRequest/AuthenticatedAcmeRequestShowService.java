/*
 * AdministratorUserAccountShowService.java
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

package acme.features.authenticated.acmeRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.acmeRequests.AcmeRequest;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Authenticated;
import acme.framework.services.AbstractShowService;

@Service
public class AuthenticatedAcmeRequestShowService implements AbstractShowService<Authenticated, AcmeRequest> {

	@Autowired
	private AuthenticatedAcmeRequestRepository repository;


	@Override
	public boolean authorise(final Request<AcmeRequest> request) {
		assert request != null;
		return true;
	}

	@Override
	public void unbind(final Request<AcmeRequest> request, final AcmeRequest entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;
		request.unbind(entity, model, "title", "creationMoment", "deadline", "text", "reward", "ticker");

	}

	@Override
	public AcmeRequest findOne(final Request<AcmeRequest> request) {
		AcmeRequest result;
		int id;
		id = request.getModel().getInteger("id");
		result = this.repository.findAcmeRequesttById(id);
		return result;
	}

}
