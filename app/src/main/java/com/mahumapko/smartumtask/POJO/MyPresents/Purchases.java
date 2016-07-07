package com.mahumapko.smartumtask.POJO.MyPresents;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Purchases {

    @SerializedName("purchases")
    @Expose
    private List<Purchase> purchases = new ArrayList<Purchase>();

    /**
     * No args constructor for use in serialization
     *
     */
    public Purchases() {
    }

    /**
     *
     * @param purchases
     */
    public Purchases(List<Purchase> purchases) {
        this.purchases = purchases;
    }

    /**
     *
     * @return
     * The purchases
     */
    public List<Purchase> getPurchases() {
        return purchases;
    }

    /**
     *
     * @param purchases
     * The purchases
     */
    public void setPurchases(List<Purchase> purchases) {
        this.purchases = purchases;
    }

    public Purchases withPurchases(List<Purchase> purchases) {
        this.purchases = purchases;
        return this;
    }

}