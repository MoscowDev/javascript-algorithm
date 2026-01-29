
accounts = {}
next_account_id = 1



def make_deposit(account, amount, transaction_list=None):

    if amount <= 0:
        raise ValueError("Deposit amount must be positive.")
    account['balance'] += amount
    if transaction_list is not None:
        transaction_list.append(("deposit", amount))
    return account['balance']

def make_withdrawal(account, amount, transaction_list=None):   
    if amount <= 0:
        raise ValueError("Withdrawal amount must be positive.")
    if amount > account['balance']:
        raise ValueError("Insufficient funds for withdrawal.")
    
    account['balance'] -= amount
    if transaction_list is not None:
        transaction_list.append(("withdrawal", amount))
    return account['balance']

def get_balance(account):
    return account['balance']

def transfer_funds(from_account, to_account, amount, transaction_list=None): 
    if transaction_list is not None:
        transaction_list.append(("transfer", amount, from_account['id'], to_account['id']))   
    if amount <= 0:
        raise ValueError("Transfer amount must be positive.")
    if amount > from_account['balance']:
        raise ValueError("Insufficient funds for transfer.")
    
    from_account['balance'] -= amount
    to_account['balance'] += amount
    return from_account['balance'], to_account['balance']

def get_transaction_history(transaction_list):
    return transaction_list if transaction_list is not None else []
