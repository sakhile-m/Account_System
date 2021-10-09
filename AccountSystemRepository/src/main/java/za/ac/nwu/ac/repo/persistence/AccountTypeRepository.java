package za.ac.nwu.ac.repo.persistence;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import za.ac.nwu.ac.domain.persistence.AccountType;

import java.time.LocalDate;

public interface AccountTypeRepository extends JpaRepository<AccountType, Long> {

}
