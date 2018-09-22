package com.example.moham.city.Model;

public class ItemOffer {
    private String Title;
    private String FirstPrice;
    private String SecondPrice;

    public ItemOffer(String title, String firstPrice, String secondPrice) {
        Title = title;
        FirstPrice = firstPrice;
        SecondPrice = secondPrice;
    }

    public String getTitle() {
        return Title;
    }

    public String getFirstPrice() {
        return FirstPrice;
    }

    public String getSecondPrice() {
        return SecondPrice;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setFirstPrice(String firstPrice) {
        FirstPrice = firstPrice;
    }

    public void setSecondPrice(String secondPrice) {
        SecondPrice = secondPrice;
    }
}
