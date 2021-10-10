package za.ac.nwu.ac.web.sb.controller;


import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import za.ac.nwu.ac.domain.dto.AccountTypeDto;
import za.ac.nwu.ac.domain.service.GeneralResponse;
import za.ac.nwu.ac.logic.flow.CreateAccountTypeFlow;
import za.ac.nwu.ac.logic.flow.FetchAccountTypeFlow;


import java.util.List;

@RestController
@RequestMapping("account-type")
public class AccountTypeController {

    private final FetchAccountTypeFlow fetchAccountTypeFlow;
    //private final CreateAccountTypeFlow createAccountTypeFlow;

    @Autowired
    public AccountTypeController(FetchAccountTypeFlow fetchAccountTypeFlow){//, CreateAccountTypeFlow createAccountTypeFlow){
        this.fetchAccountTypeFlow = fetchAccountTypeFlow;
        //this.createAccountTypeFlow = createAccountTypeFlow;
    }

    @GetMapping("/all")
    @ApiOperation(value = "Gets all the configured Account types.", notes = "Returns a list of account types")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Account types returned", response = GeneralResponse.class),
            @ApiResponse(code = 400, message = "Bad request", response = GeneralResponse.class),
            @ApiResponse(code = 404, message = "Not found", response = GeneralResponse.class),
            @ApiResponse(code = 500, message = "Internal Server Error", response = GeneralResponse.class)})
    public ResponseEntity<GeneralResponse<List<AccountTypeDto>>> getAll() {
        List <AccountTypeDto> accountTypes = fetchAccountTypeFlow.getAllAccountTypes();
             GeneralResponse<List<AccountTypeDto>> response = new GeneralResponse<>(true, accountTypes);
            return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("/{mnemonic}")
    @ApiOperation(value = "Fetches the AccountType", notes = "Fetches the AccountType")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Goal Found"),
            @ApiResponse(code = 400, message = "Bad request", response = GeneralResponse.class),
            @ApiResponse(code = 404, message = "Resource not found", response = GeneralResponse.class),
            @ApiResponse(code = 500, message = "Internal Server Error", response = GeneralResponse.class)})
    public ResponseEntity<GeneralResponse<List<AccountTypeDto>>> getAccountType(
        @ApiParam(value = "The mnemonic that identifies the AccountType.",
                example ="MILES",
                name = "mnemonic",
                required = true)
        @PathVariable("mnemonic") final String mnemonic) {
        AccountTypeDto accountTypes = fetchAccountTypeFlow.getAccountTypeByMnemonic(mnemonic);

//            GeneralResponse<List<AccountTypeDto>> response = new GeneralResponse<>(true, accountTypes);
        return null;
//            return new ResponseEntity<>(response, HttpStatus.OK);
        }

}
