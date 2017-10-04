package com.iliuminate.myfreebabyshop.Entities;

import java.util.Date;

/**
 * Created by cdiaza on 03/10/2017.
 */

public class ItemBabyEntity {


    private String ItemName;
    private String ItemDescription;
    private String ItemSerial;
    private Date DateAdd;
    private int Qualify;
    private String ItemImage;


    public ItemBabyEntity() {
    }

    /**
     *
     * @param itemName, Nombre del Item
     * @param itemDescription
     * @param itemSerial
     * @param dateAdd
     * @param qualify
     * @param itemImage
     */
    public ItemBabyEntity(String itemName, String itemDescription, String itemSerial, Date dateAdd, int qualify, String itemImage) {
        ItemName = itemName;
        ItemDescription = itemDescription;
        ItemSerial = itemSerial;
        DateAdd = dateAdd;
        Qualify = qualify;
        ItemImage = itemImage;
    }

    //------------------------------------------------------------------
    //---- Getters and Setters --------------

    public String getItemName() {
        return ItemName;
    }

    public void setItemName(String itemName) {
        ItemName = itemName;
    }

    public String getItemDescription() {
        return ItemDescription;
    }

    public void setItemDescription(String itemDescription) {
        ItemDescription = itemDescription;
    }

    public String getItemSerial() {
        return ItemSerial;
    }

    public void setItemSerial(String itemSerial) {
        ItemSerial = itemSerial;
    }

    public Date getDateAdd() {
        return DateAdd;
    }

    public void setDateAdd(Date dateAdd) {
        DateAdd = dateAdd;
    }

    public int getQualify() {
        return Qualify;
    }

    public void setQualify(int qualify) {
        Qualify = qualify;
    }

    public String getItemImage() {
        return ItemImage;
    }

    public void setItemImage(String itemImage) {
        ItemImage = itemImage;
    }
}
