
package com.mahumapko.smartumtask.POJO.ClientCard;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.mahumapko.smartumtask.POJO.ClientCard.CardDto;

public class Card{

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("cardDto")
    @Expose
    private CardDto cardDto;
    @SerializedName("scoreBalance")
    @Expose
    private Integer scoreBalance;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("cardCode")
    @Expose
    private String cardCode;
    @SerializedName("alreadyMaxDiscount")
    @Expose
    private Boolean alreadyMaxDiscount;
    @SerializedName("untilNextDiscount")
    @Expose
    private Double untilNextDiscount;
    @SerializedName("nextDiscount")
    @Expose
    private Double nextDiscount;
    @SerializedName("qrCodeToken")
    @Expose
    private String qrCodeToken;

    /**
     * No args constructor for use in serialization
     *
     */
    public Card() {
    }

    /**
     *
     * @param nextDiscount
     * @param id
     * @param scoreBalance
     * @param untilNextDiscount
     * @param name
     * @param alreadyMaxDiscount
     * @param qrCodeToken
     * @param cardCode
     * @param cardDto
     */
    public Card(Integer id, CardDto cardDto, Integer scoreBalance, String name, String cardCode, Boolean alreadyMaxDiscount, Double untilNextDiscount, Double nextDiscount, String qrCodeToken) {
        this.id = id;
        this.cardDto = cardDto;
        this.scoreBalance = scoreBalance;
        this.name = name;
        this.cardCode = cardCode;
        this.alreadyMaxDiscount = alreadyMaxDiscount;
        this.untilNextDiscount = untilNextDiscount;
        this.nextDiscount = nextDiscount;
        this.qrCodeToken = qrCodeToken;
    }

    /**
     *
     * @return
     *     The id
     */
    public Integer getId() {
        return id;
    }

    /**
     *
     * @param id
     *     The id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    public Card withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     *
     * @return
     *     The cardDto
     */
    public CardDto getCardDto() {
        return cardDto;
    }

    /**
     *
     * @param cardDto
     *     The cardDto
     */
    public void setCardDto(CardDto cardDto) {
        this.cardDto = cardDto;
    }

    public Card withCardDto(CardDto cardDto) {
        this.cardDto = cardDto;
        return this;
    }

    /**
     *
     * @return
     *     The scoreBalance
     */
    public Integer getScoreBalance() {
        return scoreBalance;
    }

    /**
     *
     * @param scoreBalance
     *     The scoreBalance
     */
    public void setScoreBalance(Integer scoreBalance) {
        this.scoreBalance = scoreBalance;
    }

    public Card withScoreBalance(Integer scoreBalance) {
        this.scoreBalance = scoreBalance;
        return this;
    }

    /**
     *
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    public Card withName(String name) {
        this.name = name;
        return this;
    }

    /**
     *
     * @return
     *     The cardCode
     */
    public String getCardCode() {
        return cardCode;
    }

    /**
     *
     * @param cardCode
     *     The cardCode
     */
    public void setCardCode(String cardCode) {
        this.cardCode = cardCode;
    }

    public Card withCardCode(String cardCode) {
        this.cardCode = cardCode;
        return this;
    }

    /**
     *
     * @return
     *     The alreadyMaxDiscount
     */
    public Boolean getAlreadyMaxDiscount() {
        return alreadyMaxDiscount;
    }

    /**
     *
     * @param alreadyMaxDiscount
     *     The alreadyMaxDiscount
     */
    public void setAlreadyMaxDiscount(Boolean alreadyMaxDiscount) {
        this.alreadyMaxDiscount = alreadyMaxDiscount;
    }

    public Card withAlreadyMaxDiscount(Boolean alreadyMaxDiscount) {
        this.alreadyMaxDiscount = alreadyMaxDiscount;
        return this;
    }

    /**
     *
     * @return
     *     The untilNextDiscount
     */
    public Double getUntilNextDiscount() {
        return untilNextDiscount;
    }

    /**
     *
     * @param untilNextDiscount
     *     The untilNextDiscount
     */
    public void setUntilNextDiscount(Double untilNextDiscount) {
        this.untilNextDiscount = untilNextDiscount;
    }

    public Card withUntilNextDiscount(Double untilNextDiscount) {
        this.untilNextDiscount = untilNextDiscount;
        return this;
    }

    /**
     *
     * @return
     *     The nextDiscount
     */
    public Double getNextDiscount() {
        return nextDiscount;
    }

    /**
     *
     * @param nextDiscount
     *     The nextDiscount
     */
    public void setNextDiscount(Double nextDiscount) {
        this.nextDiscount = nextDiscount;
    }

    public Card withNextDiscount(Double nextDiscount) {
        this.nextDiscount = nextDiscount;
        return this;
    }

    /**
     *
     * @return
     *     The qrCodeToken
     */
    public String getQrCodeToken() {
        return qrCodeToken;
    }

    /**
     *
     * @param qrCodeToken
     *     The qrCodeToken
     */
    public void setQrCodeToken(String qrCodeToken) {
        this.qrCodeToken = qrCodeToken;
    }

    public Card withQrCodeToken(String qrCodeToken) {
        this.qrCodeToken = qrCodeToken;
        return this;
    }

}
