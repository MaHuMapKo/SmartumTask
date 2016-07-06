
package com.mahumapko.smartumtask.POJO.Presents;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Presents {

    @SerializedName("presents")
    @Expose
    private List<Present> presents = new ArrayList<Present>();

    /**
     * No args constructor for use in serialization
     *
     */
    public Presents() {
    }

    /**
     *
     * @param presents
     */
    public Presents(List<Present> presents) {
        this.presents = presents;
    }

    /**
     *
     * @return
     *     The presents
     */
    public List<Present> getPresents() {
        return presents;
    }

    /**
     *
     * @param presents
     *     The presents
     */
    public void setPresents(List<Present> presents) {
        this.presents = presents;
    }

    public Presents withPresents(List<Present> presents) {
        this.presents = presents;
        return this;
    }

}
