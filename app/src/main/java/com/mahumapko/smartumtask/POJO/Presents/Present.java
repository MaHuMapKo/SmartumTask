
package com.mahumapko.smartumtask.POJO.Presents;

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
    "description",
    "score",
    "imagePath",
    "presentCount",
    "soldOut",
    "soldPresentCount",
    "sortNumber",
    "cardIds",
    "active"
})
public class Present {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("description")
    private String description;
    @JsonProperty("score")
    private Integer score;
    @JsonProperty("imagePath")
    private String imagePath;
    @JsonProperty("presentCount")
    private Integer presentCount;
    @JsonProperty("soldOut")
    private Boolean soldOut;
    @JsonProperty("soldPresentCount")
    private Integer soldPresentCount;
    @JsonProperty("sortNumber")
    private Integer sortNumber;
    @JsonProperty("cardIds")
    private List<Integer> cardIds = new ArrayList<Integer>();
    @JsonProperty("active")
    private Boolean active;
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
     *     The imagePath
     */
    @JsonProperty("imagePath")
    public String getImagePath() {
        return imagePath;
    }

    /**
     * 
     * @param imagePath
     *     The imagePath
     */
    @JsonProperty("imagePath")
    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    /**
     * 
     * @return
     *     The presentCount
     */
    @JsonProperty("presentCount")
    public Integer getPresentCount() {
        return presentCount;
    }

    /**
     * 
     * @param presentCount
     *     The presentCount
     */
    @JsonProperty("presentCount")
    public void setPresentCount(Integer presentCount) {
        this.presentCount = presentCount;
    }

    /**
     * 
     * @return
     *     The soldOut
     */
    @JsonProperty("soldOut")
    public Boolean getSoldOut() {
        return soldOut;
    }

    /**
     * 
     * @param soldOut
     *     The soldOut
     */
    @JsonProperty("soldOut")
    public void setSoldOut(Boolean soldOut) {
        this.soldOut = soldOut;
    }

    /**
     * 
     * @return
     *     The soldPresentCount
     */
    @JsonProperty("soldPresentCount")
    public Integer getSoldPresentCount() {
        return soldPresentCount;
    }

    /**
     * 
     * @param soldPresentCount
     *     The soldPresentCount
     */
    @JsonProperty("soldPresentCount")
    public void setSoldPresentCount(Integer soldPresentCount) {
        this.soldPresentCount = soldPresentCount;
    }

    /**
     * 
     * @return
     *     The sortNumber
     */
    @JsonProperty("sortNumber")
    public Integer getSortNumber() {
        return sortNumber;
    }

    /**
     * 
     * @param sortNumber
     *     The sortNumber
     */
    @JsonProperty("sortNumber")
    public void setSortNumber(Integer sortNumber) {
        this.sortNumber = sortNumber;
    }

    /**
     * 
     * @return
     *     The cardIds
     */
    @JsonProperty("cardIds")
    public List<Integer> getCardIds() {
        return cardIds;
    }

    /**
     * 
     * @param cardIds
     *     The cardIds
     */
    @JsonProperty("cardIds")
    public void setCardIds(List<Integer> cardIds) {
        this.cardIds = cardIds;
    }

    /**
     * 
     * @return
     *     The active
     */
    @JsonProperty("active")
    public Boolean getActive() {
        return active;
    }

    /**
     * 
     * @param active
     *     The active
     */
    @JsonProperty("active")
    public void setActive(Boolean active) {
        this.active = active;
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
