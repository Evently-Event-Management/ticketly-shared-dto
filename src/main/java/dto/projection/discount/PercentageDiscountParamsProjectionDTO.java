package dto.projection.discount;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import model.DiscountType;

import java.math.BigDecimal;

/**
 * DTO for percentage-based discount parameters.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PercentageDiscountParamsProjectionDTO implements DiscountParametersProjectionDTO {
    private DiscountType type;
    private BigDecimal percentage;
}
