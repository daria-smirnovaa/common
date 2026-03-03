package java.event;

import jakarta.validation.constraints.NotNull;
import lombok.Builder;

import java.util.UUID;

@Builder
public record PaymentEvent(
        @NotNull(message = "ID cant be null")
        UUID id,

        @NotNull(message = "Order ID cant be null")
        Long orderId,

        @NotNull(message = "Status cant be null")
        String status
) {
}