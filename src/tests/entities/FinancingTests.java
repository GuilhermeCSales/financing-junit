package tests.entities;

import entities.Financing;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FinancingTests {

    @Test
    public void constructorShouldCreateObjectWhenValidData() {
        Financing financing = new Financing(100000.0, 2000.0, 80);

        // Assertions.assertNotNull(financing);
        Assertions.assertEquals(100000.0, financing.getTotalAmount());
        Assertions.assertEquals(2000.0, financing.getIncome());
        Assertions.assertEquals(80, financing.getMonths());
    }

    @Test
    public void constructorShouldThrowIllegalArgumentExceptionWhenInvalidData() {
        Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> new Financing(100000.0, 2000.0, 20)
        );
    }

    @Test
    public void setTotalAmountShouldUpdateValueWhenValidData() {
        Financing financing = new Financing(100000.0, 2000.0, 80);

        financing.setTotalAmount(90000.0);

        Assertions.assertEquals(90000.0, financing.getTotalAmount());
    }

    @Test
    public void setTotalAmountShouldThrowIllegalArgumentWhenInvalidData() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Financing financing = new Financing(100000.0, 2000.0, 80);
            financing.setTotalAmount(110000.0);
        });
    }

    @Test
    public void setIncomeShouldUpdateValueWhenValidData() {
        Financing financing = new Financing(100000.0, 2000.0, 80);

        financing.setIncome(2100.0);

        Assertions.assertEquals(2100.0, financing.getIncome());
    }

    @Test
    public void setIncomeShouldThrowIllegalArgumentExceptionWhenInvalidData() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Financing financing = new Financing(100000.0, 2000.0, 80);
            financing.setIncome(1900.0);
        });
    }

    @Test
    public void setMonthsShouldUpdateMonthsWhenValidData() {
        Financing financing = new Financing(100000.0, 2000.0, 80);

        financing.setMonths(81);

        Assertions.assertEquals(81, financing.getMonths());
    }

    @Test
    public void setMonthsShouldThrowExceptionWhenInvalidData() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Financing financing = new Financing(100000.0, 2000.0, 80);
            financing.setMonths(79);
        });
    }

    @Test
    public void entryShouldReturnEntryValueCorrectly() {
        Financing financing = new Financing(100000.0, 2000.0, 80);

        Assertions.assertEquals(20000.0, financing.entry());
    }

    @Test
    public void quotaShouldReturnValueInstallmentsCorrectly() {
        Financing financing = new Financing(100000.0, 2000.0, 80);

        Assertions.assertEquals(1000, financing.quota());
    }
}
