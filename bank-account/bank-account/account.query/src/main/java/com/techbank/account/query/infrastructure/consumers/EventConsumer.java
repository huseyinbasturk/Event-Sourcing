package com.techbank.account.query.infrastructure.consumers;

import events.AccountClosedEvent;
import events.AccountOpenedEvent;
import events.FundsDepositedEvent;
import events.FundsWithdrawnEvent;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.messaging.handler.annotation.Payload;

public interface EventConsumer {
    void consume(@Payload AccountOpenedEvent event, Acknowledgment ack);
    void consume(@Payload FundsDepositedEvent event, Acknowledgment ack);

    void consume(@Payload FundsWithdrawnEvent event, Acknowledgment ack);

    void consume(@Payload AccountClosedEvent event, Acknowledgment ack);

}
