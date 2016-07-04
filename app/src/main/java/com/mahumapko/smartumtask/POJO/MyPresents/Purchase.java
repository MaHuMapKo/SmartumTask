
package com.mahumapko.smartumtask.POJO.MyPresents;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.mahumapko.smartumtask.POJO.Presents.Present;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "purchaseId",
    "timestamp",
    "amount",
    "score",
    "earnScore",
    "purchaseType",
    "purchaseStatus",
    "present",
    "amountPayedByScore",
    "amountPayedByMoney",
    "amountOfDiscount",
    "usedDiscount"
})
public class Purchase {

    @JsonProperty("purchaseId")
    private Integer purchaseId;
    @JsonProperty("timestamp")
    private Integer timestamp;
    @JsonProperty("amount")
    private Double amount;
    @JsonProperty("score")
    private Integer score;
    @JsonProperty("earnScore")
    private Integer earnScore;
    @JsonProperty("purchaseType")
    private String purchaseType;
    @JsonProperty("purchaseStatus")
    private String purchaseStatus;
    @JsonProperty("present")
    private Present present;
    @JsonProperty("amountPayedByScore")
    private Object amountPayedByScore;
    @JsonProperty("amountPayedByMoney")
    private Object amountPayedByMoney;
    @JsonProperty("amountOfDiscount")
    private Double amountOfDiscount;
    @JsonProperty("usedDiscount")
    private Object usedDiscount;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The purchaseId
     */
    @JsonProperty("purchaseId")
    public Integer getPurchaseId() {
        return purchaseId;
    }

    /**
     * 
     * @param purchaseId
     *     The purchaseId
     */
    @JsonProperty("purchaseId")
    public void setPurchaseId(Integer purchaseId) {
        this.purchaseId = purchaseId;
    }

    /**
     * 
     * @return
     *     The timestamp
     */
    @JsonProperty("timestamp")
    public Integer getTimestamp() {
        return timestamp;
    }

    /**
     * 
     * @param timestamp
     *     The timestamp
     */
    @JsonProperty("timestamp")
    public void setTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * 
     * @return
     *     The amount
     */
    @JsonProperty("amount")
    public Double getAmount() {
        return amount;
    }

    /**
     * 
     * @param amount
     *     The amount
     */
    @JsonProperty("amount")
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    /**
     * 
     * @return
     *     The score
     */
    @JsonProperty("score")
    public Integer getScore() {
        return score;
    }

    /**
     * 
     * @param score
     *     The score
     */
    @JsonProperty("score")
    public void setScore(Integer score) {
        this.score = score;
    }

    /**
     * 
     * @return
     *     The earnScore
     */
    @JsonProperty("earnScore")
    public Integer getEarnScore() {
        return earnScore;
    }

    /**
     * 
     * @param earnScore
     *     The earnScore
     */
    @JsonProperty("earnScore")
    public void setEarnScore(Integer earnScore) {
        this.earnScore = earnScore;
    }

    /**
     * 
     * @return
     *     The purchaseType
     */
    @JsonProperty("purchaseType")
    public String getPurchaseType() {
        return purchaseType;
    }

    /**
     * 
     * @param purchaseType
     *     The purchaseType
     */
    @JsonProperty("purchaseType")
    public void setPurchaseType(String purchaseType) {
        this.purchaseType = purchaseType;
    }

    /**
     * 
     * @return
     *     The purchaseStatus
     */
    @JsonProperty("purchaseStatus")
    public String getPurchaseStatus() {
        return purchaseStatus;
    }

    /**
     * 
     * @param purchaseStatus
     *     The purchaseStatus
     */
    @JsonProperty("purchaseStatus")
    public void setPurchaseStatus(String purchaseStatus) {
        this.purchaseStatus = purchaseStatus;
    }

    /**
     * 
     * @return
     *     The present
     */
    @JsonProperty("present")
    public Present getPresent() {
        return present;
    }

    /**
     * 
     * @param present
     *     The present
     */
    @JsonProperty("present")
    public void setPresent(Present present) {
        this.present = present;
    }

    /**
     * 
     * @return
     *     The amountPayedByScore
     */
    @JsonProperty("amountPayedByScore")
    public Object getAmountPayedByScore() {
        return amountPayedByScore;
    }

    /**
     * 
     * @param amountPayedByScore
     *     The amountPayedByScore
     */
    @JsonProperty("amountPayedByScore")
    public void setAmountPayedByScore(Object amountPayedByScore) {
        this.amountPayedByScore = amountPayedByScore;
    }

    /**
     * 
     * @return
     *     The amountPayedByMoney
     */
    @JsonProperty("amountPayedByMoney")
    public Object getAmountPayedByMoney() {
        return amountPayedByMoney;
    }

    /**
     * 
     * @param amountPayedByMoney
     *     The amountPayedByMoney
     */
    @JsonProperty("amountPayedByMoney")
    public void setAmountPayedByMoney(Object amountPayedByMoney) {
        this.amountPayedByMoney = amountPayedByMoney;
    }

    /**
     * 
     * @return
     *     The amountOfDiscount
     */
    @JsonProperty("amountOfDiscount")
    public Double getAmountOfDiscount() {
        return amountOfDiscount;
    }

    /**
     * 
     * @param amountOfDiscount
     *     The amountOfDiscount
     */
    @JsonProperty("amountOfDiscount")
    public void setAmountOfDiscount(Double amountOfDiscount) {
        this.amountOfDiscount = amountOfDiscount;
    }

    /**
     * 
     * @return
     *     The usedDiscount
     */
    @JsonProperty("usedDiscount")
    public Object getUsedDiscount() {
        return usedDiscount;
    }

    /**
     * 
     * @param usedDiscount
     *     The usedDiscount
     */
    @JsonProperty("usedDiscount")
    public void setUsedDiscount(Object usedDiscount) {
        this.usedDiscount = usedDiscount;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
