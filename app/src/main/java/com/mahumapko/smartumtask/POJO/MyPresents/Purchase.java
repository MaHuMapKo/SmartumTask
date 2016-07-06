
package com.mahumapko.smartumtask.POJO.MyPresents;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.mahumapko.smartumtask.POJO.Presents.Present;

public class Purchase {

    @SerializedName("purchaseId")
    @Expose
    private Integer purchaseId;
    @SerializedName("timestamp")
    @Expose
    private Integer timestamp;
    @SerializedName("amount")
    @Expose
    private Double amount;
    @SerializedName("score")
    @Expose
    private Integer score;
    @SerializedName("earnScore")
    @Expose
    private Integer earnScore;
    @SerializedName("purchaseType")
    @Expose
    private String purchaseType;
    @SerializedName("purchaseStatus")
    @Expose
    private String purchaseStatus;
    @SerializedName("present")
    @Expose
    private Present present;
    @SerializedName("amountPayedByScore")
    @Expose
    private Object amountPayedByScore;
    @SerializedName("amountPayedByMoney")
    @Expose
    private Object amountPayedByMoney;
    @SerializedName("amountOfDiscount")
    @Expose
    private Double amountOfDiscount;
    @SerializedName("usedDiscount")
    @Expose
    private Object usedDiscount;

    /**
     * No args constructor for use in serialization
     *
     */
    public Purchase() {
    }

    /**
     *
     * @param amount
     * @param timestamp
     * @param present
     * @param amountPayedByMoney
     * @param earnScore
     * @param purchaseType
     * @param score
     * @param amountOfDiscount
     * @param purchaseId
     * @param usedDiscount
     * @param purchaseStatus
     * @param amountPayedByScore
     */
    public Purchase(Integer purchaseId, Integer timestamp, Double amount, Integer score, Integer earnScore, String purchaseType, String purchaseStatus, Present present, Object amountPayedByScore, Object amountPayedByMoney, Double amountOfDiscount, Object usedDiscount) {
        this.purchaseId = purchaseId;
        this.timestamp = timestamp;
        this.amount = amount;
        this.score = score;
        this.earnScore = earnScore;
        this.purchaseType = purchaseType;
        this.purchaseStatus = purchaseStatus;
        this.present = present;
        this.amountPayedByScore = amountPayedByScore;
        this.amountPayedByMoney = amountPayedByMoney;
        this.amountOfDiscount = amountOfDiscount;
        this.usedDiscount = usedDiscount;
    }

    /**
     *
     * @return
     *     The purchaseId
     */
    public Integer getPurchaseId() {
        return purchaseId;
    }

    /**
     *
     * @param purchaseId
     *     The purchaseId
     */
    public void setPurchaseId(Integer purchaseId) {
        this.purchaseId = purchaseId;
    }

    public Purchase withPurchaseId(Integer purchaseId) {
        this.purchaseId = purchaseId;
        return this;
    }

    /**
     *
     * @return
     *     The timestamp
     */
    public Integer getTimestamp() {
        return timestamp;
    }

    /**
     *
     * @param timestamp
     *     The timestamp
     */
    public void setTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
    }

    public Purchase withTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     *
     * @return
     *     The amount
     */
    public Double getAmount() {
        return amount;
    }

    /**
     *
     * @param amount
     *     The amount
     */
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Purchase withAmount(Double amount) {
        this.amount = amount;
        return this;
    }

    /**
     *
     * @return
     *     The score
     */
    public Integer getScore() {
        return score;
    }

    /**
     *
     * @param score
     *     The score
     */
    public void setScore(Integer score) {
        this.score = score;
    }

    public Purchase withScore(Integer score) {
        this.score = score;
        return this;
    }

    /**
     *
     * @return
     *     The earnScore
     */
    public Integer getEarnScore() {
        return earnScore;
    }

    /**
     *
     * @param earnScore
     *     The earnScore
     */
    public void setEarnScore(Integer earnScore) {
        this.earnScore = earnScore;
    }

    public Purchase withEarnScore(Integer earnScore) {
        this.earnScore = earnScore;
        return this;
    }

    /**
     *
     * @return
     *     The purchaseType
     */
    public String getPurchaseType() {
        return purchaseType;
    }

    /**
     *
     * @param purchaseType
     *     The purchaseType
     */
    public void setPurchaseType(String purchaseType) {
        this.purchaseType = purchaseType;
    }

    public Purchase withPurchaseType(String purchaseType) {
        this.purchaseType = purchaseType;
        return this;
    }

    /**
     *
     * @return
     *     The purchaseStatus
     */
    public String getPurchaseStatus() {
        return purchaseStatus;
    }

    /**
     *
     * @param purchaseStatus
     *     The purchaseStatus
     */
    public void setPurchaseStatus(String purchaseStatus) {
        this.purchaseStatus = purchaseStatus;
    }

    public Purchase withPurchaseStatus(String purchaseStatus) {
        this.purchaseStatus = purchaseStatus;
        return this;
    }

    /**
     *
     * @return
     *     The present
     */
    public Present getPresent() {
        return present;
    }

    /**
     *
     * @param present
     *     The present
     */
    public void setPresent(Present present) {
        this.present = present;
    }

    public Purchase withPresent(Present present) {
        this.present = present;
        return this;
    }

    /**
     *
     * @return
     *     The amountPayedByScore
     */
    public Object getAmountPayedByScore() {
        return amountPayedByScore;
    }

    /**
     *
     * @param amountPayedByScore
     *     The amountPayedByScore
     */
    public void setAmountPayedByScore(Object amountPayedByScore) {
        this.amountPayedByScore = amountPayedByScore;
    }

    public Purchase withAmountPayedByScore(Object amountPayedByScore) {
        this.amountPayedByScore = amountPayedByScore;
        return this;
    }

    /**
     *
     * @return
     *     The amountPayedByMoney
     */
    public Object getAmountPayedByMoney() {
        return amountPayedByMoney;
    }

    /**
     *
     * @param amountPayedByMoney
     *     The amountPayedByMoney
     */
    public void setAmountPayedByMoney(Object amountPayedByMoney) {
        this.amountPayedByMoney = amountPayedByMoney;
    }

    public Purchase withAmountPayedByMoney(Object amountPayedByMoney) {
        this.amountPayedByMoney = amountPayedByMoney;
        return this;
    }

    /**
     *
     * @return
     *     The amountOfDiscount
     */
    public Double getAmountOfDiscount() {
        return amountOfDiscount;
    }

    /**
     *
     * @param amountOfDiscount
     *     The amountOfDiscount
     */
    public void setAmountOfDiscount(Double amountOfDiscount) {
        this.amountOfDiscount = amountOfDiscount;
    }

    public Purchase withAmountOfDiscount(Double amountOfDiscount) {
        this.amountOfDiscount = amountOfDiscount;
        return this;
    }

    /**
     *
     * @return
     *     The usedDiscount
     */
    public Object getUsedDiscount() {
        return usedDiscount;
    }

    /**
     *
     * @param usedDiscount
     *     The usedDiscount
     */
    public void setUsedDiscount(Object usedDiscount) {
        this.usedDiscount = usedDiscount;
    }

    public Purchase withUsedDiscount(Object usedDiscount) {
        this.usedDiscount = usedDiscount;
        return this;
    }

}
