package com.sda.bank;

import java.util.ArrayList;
import java.util.List;

public class AccountService {
    public AccountService(List<Account> accounts) {
        this.accounts = accounts;
    }

    private static int counterId = 0;

    public AccountService() {
        this.accounts = new ArrayList<>();
    }

    public int getNumberOfAccounts() {
        return accounts.size();
    }

    private List<Account> accounts;

    public boolean addAccount(Account account) {
        boolean result = false;
        if (account != null) {
            account.setId(counterId++);
            accounts.add(account);
            result = true;
        }
        return result;
    }
}
