public class SuspendedState implements AccountState {
    @Override
    public void deposit(Account account, Double depositAmount) {
        System.out.println("Cannot deposit in a suspended account. " + account.toString());
    }

    @Override
    public void withdraw(Account account, Double withdrawAmount) {
        System.out.println("Cannot withdraw from a suspended account. " + account.toString());
    }

    @Override
    public void suspend(Account account) {
        System.out.println("Account is already suspended!");
    }

    @Override
    public void activate(Account account) {
        account.setState(new ActiveState());
        System.out.println("Account is activated!");
    }

    @Override
    public void close(Account account) {
        account.setState(new ClosedState());
        System.out.println("Account is closed!");
    }
}
