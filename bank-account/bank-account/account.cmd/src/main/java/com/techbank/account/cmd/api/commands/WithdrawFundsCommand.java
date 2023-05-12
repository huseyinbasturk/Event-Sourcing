package com.techbank.account.cmd.api.commands;

import com.fasterxml.jackson.databind.ser.Serializers;
import com.techbank.cqrs.core.commands.BaseCommand;
import lombok.Data;

@Data
public class WithdrawFundsCommand extends BaseCommand {
    private double amount;
}
