public class ActiveState implements AccountState {
    @Override
    public void deposit(Account account, Double depositAmount) {
        account.setBalance(account.getBalance() + depositAmount);
        System.out.println("Deposited " + depositAmount + ". " + account);
    }

    @Override
    public void withdraw(Account account, Double withdrawAmount) {
        if (account.getBalance() >= withdrawAmount) {
            account.setBalance(account.getBalance() - withdrawAmount);
            System.out.println("Withdrew " + withdrawAmount + ". " + account);
        } else {
            System.out.println("Insufficient balance to withdraw " + withdrawAmount);
        }
    }

    @Override
    public void suspend(Account account) {
        account.setState(new SuspendedState());
        System.out.println("Account is suspended!");
    }

    @Override
    public void activate(Account account) {
        System.out.println("Account is already activated!");
    }

    @Override
    public void close(Account account) {
        account.setState(new ClosedState());
        System.out.println("Account is closed!");
    }
}
