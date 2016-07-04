
package com.mahumapko.smartumtask.POJO.ClientCard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
    "name",
    "photoPath",
    "status",
    "partnerId",
    "description",
    "subcategories",
    "shops",
    "discount",
    "staticDiscount",
    "presentExists",
    "discountThresholds",
    "discountDescription",
    "discountType",
    "type"
})
public class CardDto {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("photoPath")
    private String photoPath;
    @JsonProperty("status")
    private String status;
    @JsonProperty("partnerId")
    private Integer partnerId;
    @JsonProperty("description")
    private String description;
    @JsonProperty("subcategories")
    private List<Object> subcategories = new ArrayList<Object>();
    @JsonProperty("shops")
    private List<Shop> shops = new ArrayList<Shop>();
    @JsonProperty("discount")
    private Double discount;
    @JsonProperty("staticDiscount")
    private Double staticDiscount;
    @JsonProperty("presentExists")
    private Boolean presentExists;
    @JsonProperty("discountThresholds")
    private List<DiscountThreshold> discountThresholds = new ArrayList<DiscountThreshold>();
    @JsonProperty("discountDescription")
    private String discountDescription;
    @JsonProperty("discountType")
    private String discountType;
    @JsonProperty("type")
    private String type;
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
     *     The photoPath
     */
    @JsonProperty("photoPath")
    public String getPhotoPath() {
        return photoPath;
    }

    /**
     * 
     * @param photoPath
     *     The photoPath
     */
    @JsonProperty("photoPath")
    public void setPhotoPath(String photoPath) {
        this.photoPath = photoPath;
    }

    /**
     * 
     * @return
     *     The status
     */
    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    /**
     * 
     * @param status
     *     The status
     */
    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 
     * @return
     *     The partnerId
     */
    @JsonProperty("partnerId")
    public Integer getPartnerId() {
        return partnerId;
    }

    /**
     * 
     * @param partnerId
     *     The partnerId
     */
    @JsonProperty("partnerId")
    public void setPartnerId(Integer partnerId) {
        this.partnerId = partnerId;
    }

    /**
     * 
     * @return
     *     The description
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * 
     * @param description
     *     The description
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 
     * @return
     *     The subcategories
     */
    @JsonProperty("subcategories")
    public List<Object> getSubcategories() {
        return subcategories;
    }

    /**
     * 
     * @param subcategories
     *     The subcategories
     */
    @JsonProperty("subcategories")
    public void setSubcategories(List<Object> subcategories) {
        this.subcategories = subcategories;
    }

    /**
     * 
     * @return
     *     The shops
     */
    @JsonProperty("shops")
    public List<Shop> getShops() {
        return shops;
    }

    /**
     * 
     * @param shops
     *     The shops
     */
    @JsonProperty("shops")
    public void setShops(List<Shop> shops) {
        this.shops = shops;
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

    /**
     * 
     * @return
     *     The staticDiscount
     */
    @JsonProperty("staticDiscount")
    public Double getStaticDiscount() {
        return staticDiscount;
    }

    /**
     * 
     * @param staticDiscount
     *     The staticDiscount
     */
    @JsonProperty("staticDiscount")
    public void setStaticDiscount(Double staticDiscount) {
        this.staticDiscount = staticDiscount;
    }

    /**
     * 
     * @return
     *     The presentExists
     */
    @JsonProperty("presentExists")
    public Boolean getPresentExists() {
        return presentExists;
    }

    /**
     * 
     * @param presentExists
     *     The presentExists
     */
    @JsonProperty("presentExists")
    public void setPresentExists(Boolean presentExists) {
        this.presentExists = presentExists;
    }

    /**
     * 
     * @return
     *     The discountThresholds
     */
    @JsonProperty("discountThresholds")
    public List<DiscountThreshold> getDiscountThresholds() {
        return discountThresholds;
    }

    /**
     * 
     * @param discountThresholds
     *     The discountThresholds
     */
    @JsonProperty("discountThresholds")
    public void setDiscountThresholds(List<DiscountThreshold> discountThresholds) {
        this.discountThresholds = discountThresholds;
    }

    /**
     * 
     * @return
     *     The discountDescription
     */
    @JsonProperty("discountDescription")
    public String getDiscountDescription() {
        return discountDescription;
    }

    /**
     * 
     * @param discountDescription
     *     The discountDescription
     */
    @JsonProperty("discountDescription")
    public void setDiscountDescription(String discountDescription) {
        this.discountDescription = discountDescription;
    }

    /**
     * 
     * @return
     *     The discountType
     */
    @JsonProperty("discountType")
    public String getDiscountType() {
        return discountType;
    }

    /**
     * 
     * @param discountType
     *     The discountType
     */
    @JsonProperty("discountType")
    public void setDiscountType(String discountType) {
        this.discountType = discountType;
    }

    /**
     * 
     * @return
     *     The type
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
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
