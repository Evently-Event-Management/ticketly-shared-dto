package dto.projection.discount;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import model.DiscountType;

import java.math.BigDecimal;

/**
 * DTO for flat amount discount parameters.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FlatOffDiscountParamsProjectionDTO implements DiscountParametersProjectionDTO {
    private DiscountType type;
    private BigDecimal amount;
    private String currency;
}
