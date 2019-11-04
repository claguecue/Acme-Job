/*
 * AuthenticatedAcmeRequestListService.java
 *
 * Copyright (c) 2019 Aureliano Piqueras, based on Rafael Corchuelo's DP Starter project.
 *
 * In keeping with the traditional purpose of furthering education and research, it is
 * the policy of the copyright owner to permit non-commercial use and redistribution of
 * this software. It has been tested carefully, but it is not guaranteed for any particular
 * purposes. The copyright owner does not offer any warranties or representations, nor do
 * they accept any liabilities with respect to them.
 */

package acme.features.authenticated.acmeRequest;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.acmeRequests.AcmeRequest;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Authenticated;
import acme.framework.services.AbstractListService;

@Service
public class AuthenticatedAcmeRequestListService implements AbstractListService<Authenticated, AcmeRequest> {

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
	public Collection<AcmeRequest> findMany(final Request<AcmeRequest> request) {
		assert request != null;
		Collection<AcmeRequest> result;
		result = this.repository.findMany();
		return result;
	}

}