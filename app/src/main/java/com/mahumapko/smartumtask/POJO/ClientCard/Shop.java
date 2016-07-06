
package com.mahumapko.smartumtask.POJO.ClientCard;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Shop {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("city")
    @Expose
    private City city;
    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("phone")
    @Expose
    private String phone;
    @SerializedName("workSchedule")
    @Expose
    private String workSchedule;
    @SerializedName("longitude")
    @Expose
    private String longitude;
    @SerializedName("latitude")
    @Expose
    private String latitude;

    /**
     * No args constructor for use in serialization
     *
     */
    public Shop() {
    }

    /**
     *
     * @param id
     * @param phone
     * @param workSchedule
     * @param email
     * @param address
     * @param longitude
     * @param latitude
     * @param url
     * @param city
     */
    public Shop(Integer id, City city, String address, String url, String email, String phone, String workSchedule, String longitude, String latitude) {
        this.id = id;
        this.city = city;
        this.address = address;
        this.url = url;
        this.email = email;
        this.phone = phone;
        this.workSchedule = workSchedule;
        this.longitude = longitude;
        this.latitude = latitude;
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

    public Shop withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     *
     * @return
     *     The city
     */
    public City getCity() {
        return city;
    }

    /**
     *
     * @param city
     *     The city
     */
    public void setCity(City city) {
        this.city = city;
    }

    public Shop withCity(City city) {
        this.city = city;
        return this;
    }

    /**
     *
     * @return
     *     The address
     */
    public String getAddress() {
        return address;
    }

    /**
     *
     * @param address
     *     The address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    public Shop withAddress(String address) {
        this.address = address;
        return this;
    }

    /**
     *
     * @return
     *     The url
     */
    public String getUrl() {
        return url;
    }

    /**
     *
     * @param url
     *     The url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    public Shop withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     *
     * @return
     *     The email
     */
    public String getEmail() {
        return email;
    }

    /**
     *
     * @param email
     *     The email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    public Shop withEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     *
     * @return
     *     The phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     *
     * @param phone
     *     The phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Shop withPhone(String phone) {
        this.phone = phone;
        return this;
    }

    /**
     *
     * @return
     *     The workSchedule
     */
    public String getWorkSchedule() {
        return workSchedule;
    }

    /**
     *
     * @param workSchedule
     *     The workSchedule
     */
    public void setWorkSchedule(String workSchedule) {
        this.workSchedule = workSchedule;
    }

    public Shop withWorkSchedule(String workSchedule) {
        this.workSchedule = workSchedule;
        return this;
    }

    /**
     *
     * @return
     *     The longitude
     */
    public String getLongitude() {
        return longitude;
    }

    /**
     *
     * @param longitude
     *     The longitude
     */
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public Shop withLongitude(String longitude) {
        this.longitude = longitude;
        return this;
    }

    /**
     *
     * @return
     *     The latitude
     */
    public String getLatitude() {
        return latitude;
    }

    /**
     *
     * @param latitude
     *     The latitude
     */
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public Shop withLatitude(String latitude) {
        this.latitude = latitude;
        return this;
    }

}
