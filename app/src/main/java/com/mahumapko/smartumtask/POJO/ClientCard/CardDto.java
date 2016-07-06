
package com.mahumapko.smartumtask.POJO.ClientCard;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CardDto {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("photoPath")
    @Expose
    private String photoPath;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("partnerId")
    @Expose
    private Integer partnerId;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("subcategories")
    @Expose
    private List<Object> subcategories = new ArrayList<Object>();
    @SerializedName("shops")
    @Expose
    private List<Shop> shops = new ArrayList<Shop>();
    @SerializedName("discount")
    @Expose
    private Double discount;
    @SerializedName("staticDiscount")
    @Expose
    private Double staticDiscount;
    @SerializedName("presentExists")
    @Expose
    private Boolean presentExists;
    @SerializedName("discountThresholds")
    @Expose
    private List<DiscountThreshold> discountThresholds = new ArrayList<DiscountThreshold>();
    @SerializedName("discountDescription")
    @Expose
    private String discountDescription;
    @SerializedName("discountType")
    @Expose
    private String discountType;
    @SerializedName("type")
    @Expose
    private String type;

    /**
     * No args constructor for use in serialization
     *
     */
    public CardDto() {
    }

    /**
     *
     * @param id
     * @param discountThresholds
     * @param discountType
     * @param shops
     * @param status
     * @param description
     * @param name
     * @param partnerId
     * @param presentExists
     * @param staticDiscount
     * @param discountDescription
     * @param subcategories
     * @param type
     * @param discount
     * @param photoPath
     */
    public CardDto(Integer id, String name, String photoPath, String status, Integer partnerId, String description, List<Object> subcategories, List<Shop> shops, Double discount, Double staticDiscount, Boolean presentExists, List<DiscountThreshold> discountThresholds, String discountDescription, String discountType, String type) {
        this.id = id;
        this.name = name;
        this.photoPath = photoPath;
        this.status = status;
        this.partnerId = partnerId;
        this.description = description;
        this.subcategories = subcategories;
        this.shops = shops;
        this.discount = discount;
        this.staticDiscount = staticDiscount;
        this.presentExists = presentExists;
        this.discountThresholds = discountThresholds;
        this.discountDescription = discountDescription;
        this.discountType = discountType;
        this.type = type;
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

    public CardDto withId(Integer id) {
        this.id = id;
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

    public CardDto withName(String name) {
        this.name = name;
        return this;
    }

    /**
     *
     * @return
     *     The photoPath
     */
    public String getPhotoPath() {
        return photoPath;
    }

    /**
     *
     * @param photoPath
     *     The photoPath
     */
    public void setPhotoPath(String photoPath) {
        this.photoPath = photoPath;
    }

    public CardDto withPhotoPath(String photoPath) {
        this.photoPath = photoPath;
        return this;
    }

    /**
     *
     * @return
     *     The status
     */
    public String getStatus() {
        return status;
    }

    /**
     *
     * @param status
     *     The status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    public CardDto withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     *
     * @return
     *     The partnerId
     */
    public Integer getPartnerId() {
        return partnerId;
    }

    /**
     *
     * @param partnerId
     *     The partnerId
     */
    public void setPartnerId(Integer partnerId) {
        this.partnerId = partnerId;
    }

    public CardDto withPartnerId(Integer partnerId) {
        this.partnerId = partnerId;
        return this;
    }

    /**
     *
     * @return
     *     The description
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description
     *     The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    public CardDto withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     *
     * @return
     *     The subcategories
     */
    public List<Object> getSubcategories() {
        return subcategories;
    }

    /**
     *
     * @param subcategories
     *     The subcategories
     */
    public void setSubcategories(List<Object> subcategories) {
        this.subcategories = subcategories;
    }

    public CardDto withSubcategories(List<Object> subcategories) {
        this.subcategories = subcategories;
        return this;
    }

    /**
     *
     * @return
     *     The shops
     */
    public List<Shop> getShops() {
        return shops;
    }

    /**
     *
     * @param shops
     *     The shops
     */
    public void setShops(List<Shop> shops) {
        this.shops = shops;
    }

    public CardDto withShops(List<Shop> shops) {
        this.shops = shops;
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

    public CardDto withDiscount(Double discount) {
        this.discount = discount;
        return this;
    }

    /**
     *
     * @return
     *     The staticDiscount
     */
    public Double getStaticDiscount() {
        return staticDiscount;
    }

    /**
     *
     * @param staticDiscount
     *     The staticDiscount
     */
    public void setStaticDiscount(Double staticDiscount) {
        this.staticDiscount = staticDiscount;
    }

    public CardDto withStaticDiscount(Double staticDiscount) {
        this.staticDiscount = staticDiscount;
        return this;
    }

    /**
     *
     * @return
     *     The presentExists
     */
    public Boolean getPresentExists() {
        return presentExists;
    }

    /**
     *
     * @param presentExists
     *     The presentExists
     */
    public void setPresentExists(Boolean presentExists) {
        this.presentExists = presentExists;
    }

    public CardDto withPresentExists(Boolean presentExists) {
        this.presentExists = presentExists;
        return this;
    }

    /**
     *
     * @return
     *     The discountThresholds
     */
    public List<DiscountThreshold> getDiscountThresholds() {
        return discountThresholds;
    }

    /**
     *
     * @param discountThresholds
     *     The discountThresholds
     */
    public void setDiscountThresholds(List<DiscountThreshold> discountThresholds) {
        this.discountThresholds = discountThresholds;
    }

    public CardDto withDiscountThresholds(List<DiscountThreshold> discountThresholds) {
        this.discountThresholds = discountThresholds;
        return this;
    }

    /**
     *
     * @return
     *     The discountDescription
     */
    public String getDiscountDescription() {
        return discountDescription;
    }

    /**
     *
     * @param discountDescription
     *     The discountDescription
     */
    public void setDiscountDescription(String discountDescription) {
        this.discountDescription = discountDescription;
    }

    public CardDto withDiscountDescription(String discountDescription) {
        this.discountDescription = discountDescription;
        return this;
    }

    /**
     *
     * @return
     *     The discountType
     */
    public String getDiscountType() {
        return discountType;
    }

    /**
     *
     * @param discountType
     *     The discountType
     */
    public void setDiscountType(String discountType) {
        this.discountType = discountType;
    }

    public CardDto withDiscountType(String discountType) {
        this.discountType = discountType;
        return this;
    }

    /**
     *
     * @return
     *     The type
     */
    public String getType() {
        return type;
    }

    /**
     *
     * @param type
     *     The type
     */
    public void setType(String type) {
        this.type = type;
    }

    public CardDto withType(String type) {
        this.type = type;
        return this;
    }

}
