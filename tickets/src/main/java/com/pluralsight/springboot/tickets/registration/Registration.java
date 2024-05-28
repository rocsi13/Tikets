package com.pluralsight.springboot.tickets.registration;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public record Registration(
        Integer id,
        @NotNull(message = "Product id is required") Integer productId,
        String ticketCode,
        @NotBlank(message = "Attendee name is required") String attendeeName) {
}
