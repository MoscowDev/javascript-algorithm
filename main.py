from task import*
if __name__ == "__main__":
    account = {'id': 1, 'balance': 0.0}
    print("Welcome to the Banking System")
    #account = create_account()
    amount = float(input("Enter amount to deposit: "))    
    make_deposit(account, amount, transaction_list=None)  
    print("Deposit successful. Current balance:", get_balance(account))

    amount = float(input("Enter amount to withdraw: "))
    make_withdrawal(account, amount, transaction_list=None)
    print("Withdrawal successful. Current balance:", get_balance(account))

    account2 = {'id': 2, 'balance': 0.0}
    amount = float(input("Enter amount to transfer to second account: "))
    transfer_funds(account, account2, amount, transaction_list=None)
    print("Transfer successful.")

    print("First account balance:", get_balance(account))
    print("Second account balance:", get_balance(account2))
    print("Transaction history:", get_transaction_history(transaction_list=None))
    print("Welcome to the Banking System")
       

    #account = create_account()
    amount = float(input("Enter amount to deposit: "))    
    make_deposit(account, amount, transaction_list=None)    
    print("Deposit successful. Current balance:", get_balance(account)) 

