/*
 * AuthenticatedAcmeRequestShowService.java
 *
 * Copyright (c) 2019 Aureliano Piqueras, based on Rafael Corchuelo's DP Starter project.
 *
 * In keeping with the traditional purpose of furthering education and research, it is
 * the policy of the copyright owner to permit non-commercial use and redistribution of
 * this software. It has been tested carefully, but it is not guaranteed for any particular
 * purposes. The copyright owner does not offer any warranties or representations, nor do
 * they accept any liabilities with respect to them.
 */

package acme.features.authenticated.request1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.requests1.Request1;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Authenticated;
import acme.framework.services.AbstractShowService;

@Service
public class AuthenticatedRequest1ShowService implements AbstractShowService<Authenticated, Request1> {

	@Autowired
	private AuthenticatedRequest1Repository repository;


	@Override
	public boolean authorise(final Request<Request1> request) {
		assert request != null;
		return true;
	}

	@Override
	public void unbind(final Request<Request1> request, final Request1 entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;
		request.unbind(entity, model, "title", "creationMoment", "deadline", "text", "reward", "ticker");

	}

	@Override
	public Request1 findOne(final Request<Request1> request) {
		Request1 result;
		int id;
		id = request.getModel().getInteger("id");
		result = this.repository.findRequest1ById(id);
		return result;
	}

}
