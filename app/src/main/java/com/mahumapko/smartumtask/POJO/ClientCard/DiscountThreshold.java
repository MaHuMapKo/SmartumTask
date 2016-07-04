
package com.mahumapko.smartumtask.POJO.ClientCard;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "thresholdSpentAmount",
    "discount"
})
public class DiscountThreshold {

    @JsonProperty("thresholdSpentAmount")
    private Double thresholdSpentAmount;
    @JsonProperty("discount")
    private Double discount;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The thresholdSpentAmount
     */
    @JsonProperty("thresholdSpentAmount")
    public Double getThresholdSpentAmount() {
        return thresholdSpentAmount;
    }

    /**
     * 
     * @param thresholdSpentAmount
     *     The thresholdSpentAmount
     */
    @JsonProperty("thresholdSpentAmount")
    public void setThresholdSpentAmount(Double thresholdSpentAmount) {
        this.thresholdSpentAmount = thresholdSpentAmount;
    }

    /**
     * 
     * @return
     *     The discount
     */
    @JsonProperty("discount")
    public Double getDiscount() {
        return discount;
    }

    /**
     * 
     * @param discount
     *     The discount
     */
    @JsonProperty("discount")
    public void setDiscount(Double discount) {
        this.discount = discount;
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
