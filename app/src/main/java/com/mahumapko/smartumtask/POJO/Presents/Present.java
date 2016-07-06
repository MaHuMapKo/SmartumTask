
package com.mahumapko.smartumtask.POJO.Presents;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Present {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("score")
    @Expose
    private Integer score;
    @SerializedName("imagePath")
    @Expose
    private String imagePath;
    @SerializedName("presentCount")
    @Expose
    private Integer presentCount;
    @SerializedName("soldOut")
    @Expose
    private Boolean soldOut;
    @SerializedName("soldPresentCount")
    @Expose
    private Integer soldPresentCount;
    @SerializedName("sortNumber")
    @Expose
    private Integer sortNumber;
    @SerializedName("cardIds")
    @Expose
    private List<Integer> cardIds = new ArrayList<Integer>();
    @SerializedName("active")
    @Expose
    private Boolean active;

    /**
     * No args constructor for use in serialization
     *
     */
    public Present() {
    }

    /**
     *
     * @param id
     * @param cardIds
     * @param imagePath
     * @param soldOut
     * @param description
     * @param name
     * @param score
     * @param active
     * @param sortNumber
     * @param presentCount
     * @param soldPresentCount
     */
    public Present(Integer id, String name, String description, Integer score, String imagePath, Integer presentCount, Boolean soldOut, Integer soldPresentCount, Integer sortNumber, List<Integer> cardIds, Boolean active) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.score = score;
        this.imagePath = imagePath;
        this.presentCount = presentCount;
        this.soldOut = soldOut;
        this.soldPresentCount = soldPresentCount;
        this.sortNumber = sortNumber;
        this.cardIds = cardIds;
        this.active = active;
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

    public Present withId(Integer id) {
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

    public Present withName(String name) {
        this.name = name;
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

    public Present withDescription(String description) {
        this.description = description;
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

    public Present withScore(Integer score) {
        this.score = score;
        return this;
    }

    /**
     *
     * @return
     *     The imagePath
     */
    public String getImagePath() {
        return imagePath;
    }

    /**
     *
     * @param imagePath
     *     The imagePath
     */
    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public Present withImagePath(String imagePath) {
        this.imagePath = imagePath;
        return this;
    }

    /**
     *
     * @return
     *     The presentCount
     */
    public Integer getPresentCount() {
        return presentCount;
    }

    /**
     *
     * @param presentCount
     *     The presentCount
     */
    public void setPresentCount(Integer presentCount) {
        this.presentCount = presentCount;
    }

    public Present withPresentCount(Integer presentCount) {
        this.presentCount = presentCount;
        return this;
    }

    /**
     *
     * @return
     *     The soldOut
     */
    public Boolean getSoldOut() {
        return soldOut;
    }

    /**
     *
     * @param soldOut
     *     The soldOut
     */
    public void setSoldOut(Boolean soldOut) {
        this.soldOut = soldOut;
    }

    public Present withSoldOut(Boolean soldOut) {
        this.soldOut = soldOut;
        return this;
    }

    /**
     *
     * @return
     *     The soldPresentCount
     */
    public Integer getSoldPresentCount() {
        return soldPresentCount;
    }

    /**
     *
     * @param soldPresentCount
     *     The soldPresentCount
     */
    public void setSoldPresentCount(Integer soldPresentCount) {
        this.soldPresentCount = soldPresentCount;
    }

    public Present withSoldPresentCount(Integer soldPresentCount) {
        this.soldPresentCount = soldPresentCount;
        return this;
    }

    /**
     *
     * @return
     *     The sortNumber
     */
    public Integer getSortNumber() {
        return sortNumber;
    }

    /**
     *
     * @param sortNumber
     *     The sortNumber
     */
    public void setSortNumber(Integer sortNumber) {
        this.sortNumber = sortNumber;
    }

    public Present withSortNumber(Integer sortNumber) {
        this.sortNumber = sortNumber;
        return this;
    }

    /**
     *
     * @return
     *     The cardIds
     */
    public List<Integer> getCardIds() {
        return cardIds;
    }

    /**
     *
     * @param cardIds
     *     The cardIds
     */
    public void setCardIds(List<Integer> cardIds) {
        this.cardIds = cardIds;
    }

    public Present withCardIds(List<Integer> cardIds) {
        this.cardIds = cardIds;
        return this;
    }

    /**
     *
     * @return
     *     The active
     */
    public Boolean getActive() {
        return active;
    }

    /**
     *
     * @param active
     *     The active
     */
    public void setActive(Boolean active) {
        this.active = active;
    }

    public Present withActive(Boolean active) {
        this.active = active;
        return this;
    }

}
