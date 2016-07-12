package com.mahumapko.smartumtask.Abstract;

import android.content.Context;

import com.mahumapko.smartumtask.POJO.ClientCard.Card;
import com.mahumapko.smartumtask.POJO.MyPresents.Purchase;
import com.mahumapko.smartumtask.POJO.Presents.Present;

import java.util.List;

public interface DataService {

    /*Get card */
    Card getCard(Context context);
    /**List of available presents */
    List<Present> getPresents(Context context);
    /**List of available my present */
    List<Purchase> getMyPresents(Context context);

}
