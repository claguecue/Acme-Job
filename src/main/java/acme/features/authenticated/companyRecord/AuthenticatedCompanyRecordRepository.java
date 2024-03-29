
package acme.features.authenticated.companyRecord;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import acme.entities.companyRecords.CompanyRecord;
import acme.framework.repositories.AbstractRepository;

@Repository
public interface AuthenticatedCompanyRecordRepository extends AbstractRepository {

	//poner la incial de la clase
	@Query("select c from CompanyRecord c")
	Collection<CompanyRecord> findMany();

	@Query("select c from CompanyRecord c where c.id = ?1")
	CompanyRecord findOneById(int id);

}
