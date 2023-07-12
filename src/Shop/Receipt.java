package Shop;

import java.math.BigDecimal;
import java.util.List;

public class Receipt {
    private Location location;
    private List<Items> cart;
    private BigDecimal subTotal;
    private BigDecimal tax;
    private BigDecimal total;
}
