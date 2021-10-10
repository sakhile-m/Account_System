package za.ac.nwu.ac.translator;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import za.ac.nwu.ac.domain.dto.AccountTypeDto;

import java.util.List;

@Component
public interface AccountTypeTranslator {
    List<AccountTypeDto> getAllAccountTypes();
}
