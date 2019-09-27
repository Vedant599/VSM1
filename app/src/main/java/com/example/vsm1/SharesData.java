package com.example.vsm1;

import android.widget.ImageView;

public class SharesData {
    private int  companyPhotoResource,arrowResource;
    private String companyName,priceOfShare;

    public SharesData(int companyPhotoResource, int arrowResource, String companyName, String priceOfShare) {
        this.companyPhotoResource = companyPhotoResource;
        this.arrowResource = arrowResource;
        this.companyName = companyName;
        this.priceOfShare = priceOfShare;
    }

    public int getCompanyPhotoResource() {
        return companyPhotoResource;
    }

    public void setCompanyPhotoResource(int companyPhotoResource) {
        this.companyPhotoResource = companyPhotoResource;
    }

    public int getArrowResource() {
        return arrowResource;
    }

    public void setArrowResource(int arrowResource) {
        this.arrowResource = arrowResource;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getPriceOfShare() {
        return priceOfShare;
    }

    public void setPriceOfShare(String priceOfShare) {
        this.priceOfShare = priceOfShare;
    }
}
