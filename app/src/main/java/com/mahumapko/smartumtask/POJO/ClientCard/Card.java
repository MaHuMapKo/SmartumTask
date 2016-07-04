
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
    "id",
    "cardDto",
    "scoreBalance",
    "name",
    "cardCode",
    "alreadyMaxDiscount",
    "untilNextDiscount",
    "nextDiscount",
    "qrCodeToken"
})
public class Card {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("cardDto")
    private CardDto cardDto;
    @JsonProperty("scoreBalance")
    private Integer scoreBalance;
    @JsonProperty("name")
    private String name;
    @JsonProperty("cardCode")
    private String cardCode;
    @JsonProperty("alreadyMaxDiscount")
    private Boolean alreadyMaxDiscount;
    @JsonProperty("untilNextDiscount")
    private Double untilNextDiscount;
    @JsonProperty("nextDiscount")
    private Double nextDiscount;
    @JsonProperty("qrCodeToken")
    private String qrCodeToken;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The id
     */
    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The cardDto
     */
    @JsonProperty("cardDto")
    public CardDto getCardDto() {
        return cardDto;
    }

    /**
     * 
     * @param cardDto
     *     The cardDto
     */
    @JsonProperty("cardDto")
    public void setCardDto(CardDto cardDto) {
        this.cardDto = cardDto;
    }

    /**
     * 
     * @return
     *     The scoreBalance
     */
    @JsonProperty("scoreBalance")
    public Integer getScoreBalance() {
        return scoreBalance;
    }

    /**
     * 
     * @param scoreBalance
     *     The scoreBalance
     */
    @JsonProperty("scoreBalance")
    public void setScoreBalance(Integer scoreBalance) {
        this.scoreBalance = scoreBalance;
    }

    /**
     * 
     * @return
     *     The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The cardCode
     */
    @JsonProperty("cardCode")
    public String getCardCode() {
        return cardCode;
    }

    /**
     * 
     * @param cardCode
     *     The cardCode
     */
    @JsonProperty("cardCode")
    public void setCardCode(String cardCode) {
        this.cardCode = cardCode;
    }

    /**
     * 
     * @return
     *     The alreadyMaxDiscount
     */
    @JsonProperty("alreadyMaxDiscount")
    public Boolean getAlreadyMaxDiscount() {
        return alreadyMaxDiscount;
    }

    /**
     * 
     * @param alreadyMaxDiscount
     *     The alreadyMaxDiscount
     */
    @JsonProperty("alreadyMaxDiscount")
    public void setAlreadyMaxDiscount(Boolean alreadyMaxDiscount) {
        this.alreadyMaxDiscount = alreadyMaxDiscount;
    }

    /**
     * 
     * @return
     *     The untilNextDiscount
     */
    @JsonProperty("untilNextDiscount")
    public Double getUntilNextDiscount() {
        return untilNextDiscount;
    }

    /**
     * 
     * @param untilNextDiscount
     *     The untilNextDiscount
     */
    @JsonProperty("untilNextDiscount")
    public void setUntilNextDiscount(Double untilNextDiscount) {
        this.untilNextDiscount = untilNextDiscount;
    }

    /**
     * 
     * @return
     *     The nextDiscount
     */
    @JsonProperty("nextDiscount")
    public Double getNextDiscount() {
        return nextDiscount;
    }

    /**
     * 
     * @param nextDiscount
     *     The nextDiscount
     */
    @JsonProperty("nextDiscount")
    public void setNextDiscount(Double nextDiscount) {
        this.nextDiscount = nextDiscount;
    }

    /**
     * 
     * @return
     *     The qrCodeToken
     */
    @JsonProperty("qrCodeToken")
    public String getQrCodeToken() {
        return qrCodeToken;
    }

    /**
     * 
     * @param qrCodeToken
     *     The qrCodeToken
     */
    @JsonProperty("qrCodeToken")
    public void setQrCodeToken(String qrCodeToken) {
        this.qrCodeToken = qrCodeToken;
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
