
package com.mahumapko.smartumtask.POJO.ClientCard;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Country {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("cities")
    @Expose
    private Object cities;

    /**
     * No args constructor for use in serialization
     *
     */
    public Country() {
    }

    /**
     *
     * @param id
     * @param cities
     * @param name
     */
    public Country(Integer id, String name, Object cities) {
        this.id = id;
        this.name = name;
        this.cities = cities;
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

    public Country withId(Integer id) {
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

    public Country withName(String name) {
        this.name = name;
        return this;
    }

    /**
     *
     * @return
     *     The cities
     */
    public Object getCities() {
        return cities;
    }

    /**
     *
     * @param cities
     *     The cities
     */
    public void setCities(Object cities) {
        this.cities = cities;
    }

    public Country withCities(Object cities) {
        this.cities = cities;
        return this;
    }

}
