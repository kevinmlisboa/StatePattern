public interface AccountState {
    void deposit(Account account, Double depositAmount);
    void withdraw(Account account, Double withdrawAmount);
    void suspend(Account account);
    void activate(Account account);
    void close(Account account);
}
