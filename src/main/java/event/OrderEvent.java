package java.event;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Builder;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Builder
public record OrderEvent(
        @NotNull(message = "ID cant be null")
        Long id,

        @NotNull(message = "User ID cant be null")
        Long userId,

        @Positive
        @NotNull(message = "Amount cant be null")
        BigDecimal paymentAmount,

        LocalDateTime creationDate
) {
}
