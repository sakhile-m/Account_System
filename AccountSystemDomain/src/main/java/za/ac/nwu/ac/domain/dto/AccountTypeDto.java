package za.ac.nwu.ac.domain.dto;

import za.ac.nwu.ac.domain.persistence.AccountType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@ApiModel(value = "AccountType",
        description = "DTO that represents the AccountType")

public class AccountTypeDto implements Serializable {

    private String mnemonic;
    private String accountTypeName;
    private LocalDate creationDate;

    public AccountTypeDto() {
    }

    public AccountTypeDto(String mnemonic, String accountTypeName, LocalDate creationDate) {
        this.mnemonic = mnemonic;
        this.accountTypeName = accountTypeName;
        this.creationDate = creationDate;
    }

    public AccountTypeDto(AccountType accountType) {
        this.setAccountTypeName(accountType.getAccountTypeName());
        this.setCreationDate(accountType.getCreationDate());
        this.setMnemonic(accountType.getMnemonic());
    }

    @ApiModelProperty(position = 1,
    value = "AccountType Mnemonic",
    name = "Mnemonic",
    notes = "Uniquely ids the account type",
    dataType = "java.long.String",
    example = "MILES",
    required = true)
    public String getMnemonic() {
        return mnemonic;
    }

    public void setMnemonic(String mnemonic) {
        this.mnemonic = mnemonic;
    }

    @ApiModelProperty(position = 2,
            value = "AccountType Name",
            name = "Name",
            notes = "Account type name",
            dataType = "java.long.String",
            example = "MILES",
            required = true)
    public String getAccountTypeName() {
        return accountTypeName;
    }

    public void setAccountTypeName(String accountTypeName) {
        this.accountTypeName = accountTypeName;
    }

    @ApiModelProperty(position = 2,
            value = "AccountType Creation Date",
            name = "CreationDate",
            notes = "Date of account type creation",
            dataType = "java.long.String",
            example = "2020-03-01",
            required = true)
    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccountTypeDto that = (AccountTypeDto) o;
        return Objects.equals(mnemonic, that.mnemonic) && Objects.equals(accountTypeName, that.accountTypeName) && Objects.equals(creationDate, that.creationDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mnemonic, accountTypeName, creationDate);
    }

    public String getAccountType() {
        return accountTypeName;
    }


}
