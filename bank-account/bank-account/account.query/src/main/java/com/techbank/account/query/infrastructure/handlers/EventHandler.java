package com.techbank.account.query.infrastructure.handlers;

import events.AccountClosedEvent;
import events.AccountOpenedEvent;
import events.FundsDepositedEvent;
import events.FundsWithdrawnEvent;

public interface EventHandler {
    void on(AccountOpenedEvent event);
    void on(FundsDepositedEvent event);
    void on(FundsWithdrawnEvent event);
    void on(AccountClosedEvent event);
}
