package za.ac.nwu.ac.repo.persistence;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import za.ac.nwu.ac.domain.persistence.AccountType;

import java.time.LocalDate;
@Repository
public interface AccountTypeRepository extends JpaRepository<AccountType, Long> {

//    @Query(value = "SELECT "+ "ACCOUNT_TX_ID"+ "FROM"+ "DEMO_ACCOUNT_TX"+ "WHERE DEMO_ACCOUNT_TX = ACCOUNT_TX_ID");


}
