package za.ac.nwu.ac.repo.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
@Configuration
@EnableTransactionManagement
@EnableJpaRepositories("za.ac.nwu.ac.repo.persistence")
@EntityScan("za.ac.nwu.ac.domain.persistence")
@PropertySource(value = "classpath:application-db.properties")

public class RepositoryConfig {

//    private static  final String[] ENTITY_PACKAGES_TO_SCAN = {"za.ac.nwu.ac.domain.persistence"};
//    private static  final String PERSISTENCE_UNIT_NAME = "account.system.persistence";
//
//    @value("${spring.datasource.url}")
//    private String datasourceurl;
//
//    @value("${spring.datasource.username}")
//    private String username;
//
//    @value("${spring.datasource.password}")
//    private String password;
//
//    @bean

}
