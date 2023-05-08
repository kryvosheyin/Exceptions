import exceptions.WrongAccountException;
import exceptions.WrongCurrencyException;
import exceptions.WrongOperationException;

public class Main {

    public static void main(String[] args) {
        BankApplication bankApplication = new BankApplication();

        try{
            bankApplication.process("accountId000", 50, "USD");
        } catch (WrongAccountException e){
            System.out.println("This account does not exist");
        } catch (WrongCurrencyException e){
            System.out.println("Account is in different currency");
        } catch (WrongOperationException e){
            System.out.println("Account does not have sufficient funds");
        } catch (Exception e){
            System.out.println("There was an error, please try again");
        } finally {
            System.out.println("Thank you for using our services");
        }

        System.out.println();

        try{
            bankApplication.process("accountId003", 250, "HRV");
        } catch (WrongAccountException e){
            System.out.println("This account does not exist");
        } catch (WrongCurrencyException e){
            System.out.println("Account is in different currency");
        } catch (WrongOperationException e){
            System.out.println("Account does not have sufficient funds");
        } catch (Exception e){
            System.out.println("There was an error, please try again");
        } finally {
            System.out.println("Thank you for using our services");
        }

        System.out.println();

        try{
            bankApplication.process("accountId001", 250, "EUR");
        } catch (WrongAccountException e){
            System.out.println("This account does not exist");
        } catch (WrongCurrencyException e){
            System.out.println("Account is in different currency");
        } catch (WrongOperationException e){
            System.out.println("Account does not have sufficient funds");
        } catch (Exception e){
            System.out.println("There was an error, please try again");
        } finally {
            System.out.println("Thank you for using our services");
        }

        System.out.println();

        try{
            bankApplication.process("accountId001", 250, "USD");
        } catch (WrongAccountException e){
            System.out.println("This account does not exist");
        } catch (WrongCurrencyException e){
            System.out.println("Account is in different currency");
        } catch (WrongOperationException e){
            System.out.println("Account does not have sufficient funds");
        } catch (Exception e){
            System.out.println("There was an error, please try again");
        } finally {
            System.out.println("Thank you for using our services");
        }

    }
}
