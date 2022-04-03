package entities;

public class Financing {

    private Double totalAmount;
    private Double income;
    private Integer months;

    public Financing(Double totalAmount, Double income, Integer months) {
        financingValidation(totalAmount, income, months);
        this.totalAmount = totalAmount;
        this.income = income;
        this.months = months;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        financingValidation(totalAmount, income, months);
        this.totalAmount = totalAmount;
    }

    public Double getIncome() {
        return income;
    }

    public void setIncome(Double income) {
        financingValidation(totalAmount, income, months);
        this.income = income;
    }

    public Integer getMonths() {
        return months;
    }

    public void setMonths(Integer months) {
        financingValidation(totalAmount, income, months);
        this.months = months;
    }

    public Double entry() {
        return totalAmount * 0.2;
    }

    public double quota() {
        return (totalAmount - entry()) / months;
    }

    private void financingValidation(Double totalAmount, Double income, Integer months) {
        if ((totalAmount * 0.8 / months) > (income / 2.0)) {
            throw new IllegalArgumentException("The share cannot be more than half of the income");
        }
    }

}
