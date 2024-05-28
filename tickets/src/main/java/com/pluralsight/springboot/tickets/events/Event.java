package com.pluralsight.springboot.tickets.events;

import org.springframework.cglib.core.Local;

import java.time.LocalDate;

public record Event(
        int id,
        String name,
        Organizer organizer,
        Venue venue,
        LocalDate startDate,
        LocalDate endDate) {
}
