package com.iliuminate.myfreebabyshop.Common;

import com.iliuminate.myfreebabyshop.Entities.ItemBabyEntity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by cdiaza on 03/10/2017.
 */

public class DataExample {

    public static List<ItemBabyEntity> dataExampleBaby()
    {
        List<ItemBabyEntity> data = new ArrayList<ItemBabyEntity>();

//        Double valor = 0.0;
//        String valorString="";

        for (int i = 1; i < 10; i++) {
//            valor = i*3.7;
//            valorString = valor.toString();
            ItemBabyEntity  item = new ItemBabyEntity();
            item.setItemName(String.format("Name %1$d",i));
            item.setItemDescription(String.format("Descripción: %1$.3f", (i*3.7)));
            item.setItemSerial(String.format("%1$s",(Math.random() * i) + 1));
            item.setQualify(i);
            item.setItemImage("Image");
            item.setDateAdd(new Date());

            data.add(item);
        }

        return  data;
    }

}
