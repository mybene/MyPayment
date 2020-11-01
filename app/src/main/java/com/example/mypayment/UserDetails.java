package com.example.mypayment;

public class UserDetails {
    private String uCity;
    private String uRegion;
    private String uCountryName;
    private String uCountryCode;
    private String uCurrencyCode;

    public UserDetails(String city,String region, String country,String countryCode, String currency){
        this.uCity=city;
        this.uCountryCode=countryCode;
        this.uCountryName=country;
        this.uCurrencyCode=currency;
        this.uRegion=region;

    }

    public String getCity() {
        return uCity;
    }

    public String getRegion() {
        return uRegion;
    }

    public String getCountryName() {
        return uCountryName;
    }

    public String getCountryCode() {
        return uCountryCode;
    }

    public String getCurrencyCode() {
        return uCurrencyCode;
    }
}
