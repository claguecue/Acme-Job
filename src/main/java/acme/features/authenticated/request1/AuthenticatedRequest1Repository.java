/*
 * AuthenticatedAcmeRequestRepository.java
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

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import acme.entities.requests1.Request1;
import acme.framework.repositories.AbstractRepository;

@Repository
public interface AuthenticatedRequest1Repository extends AbstractRepository {

	@Query("select req from Request1 req where req.id = ?1")
	Request1 findRequest1ById(int id);

	@Query("select req from Request1 req")
	Collection<Request1> findMany();

}
