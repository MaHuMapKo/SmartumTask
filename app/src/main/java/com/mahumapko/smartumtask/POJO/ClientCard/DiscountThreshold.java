
package com.mahumapko.smartumtask.POJO.ClientCard;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DiscountThreshold {

    @SerializedName("thresholdSpentAmount")
    @Expose
    private Double thresholdSpentAmount;
    @SerializedName("discount")
    @Expose
    private Double discount;

    /**
     * No args constructor for use in serialization
     *
     */
    public DiscountThreshold() {
    }

    /**
     *
     * @param thresholdSpentAmount
     * @param discount
     */
    public DiscountThreshold(Double thresholdSpentAmount, Double discount) {
        this.thresholdSpentAmount = thresholdSpentAmount;
        this.discount = discount;
    }

    /**
     *
     * @return
     *     The thresholdSpentAmount
     */
    public Double getThresholdSpentAmount() {
        return thresholdSpentAmount;
    }

    /**
     *
     * @param thresholdSpentAmount
     *     The thresholdSpentAmount
     */
    public void setThresholdSpentAmount(Double thresholdSpentAmount) {
        this.thresholdSpentAmount = thresholdSpentAmount;
    }

    public DiscountThreshold withThresholdSpentAmount(Double thresholdSpentAmount) {
        this.thresholdSpentAmount = thresholdSpentAmount;
        return this;
    }

    /**
     *
     * @return
     *     The discount
     */
    public Double getDiscount() {
        return discount;
    }

    /**
     *
     * @param discount
     *     The discount
     */
    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public DiscountThreshold withDiscount(Double discount) {
        this.discount = discount;
        return this;
    }

}
