package com.spotifree.abstractfactory;

import com.spotifree.abstractfactory.contracts.MarketingSubscription;

import java.time.LocalDate;

public class SevenDaysTrial implements MarketingSubscription {
    @Override
    public LocalDate getEndDate() {
        return LocalDate.now().plusDays(7);
    }
}
