
package com.mahumapko.smartumtask.POJO.ClientCard;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class City {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("country")
    @Expose
    private Country country;

    /**
     * No args constructor for use in serialization
     *
     */
    public City() {
    }

    /**
     *
     * @param id
     * @param name
     * @param country
     */
    public City(Integer id, String name, Country country) {
        this.id = id;
        this.name = name;
        this.country = country;
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

    public City withId(Integer id) {
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

    public City withName(String name) {
        this.name = name;
        return this;
    }

    /**
     *
     * @return
     *     The country
     */
    public Country getCountry() {
        return country;
    }

    /**
     *
     * @param country
     *     The country
     */
    public void setCountry(Country country) {
        this.country = country;
    }

    public City withCountry(Country country) {
        this.country = country;
        return this;
    }

}
