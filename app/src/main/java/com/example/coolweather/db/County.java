package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by tzq on 2017/12/20.
 */

public class County extends DataSupport{
    private int id;
    private String countyName;
    private String weatherId;
    private int ciytId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCiytId() {
        return ciytId;
    }

    public void setCiytId(int ciytId) {
        this.ciytId = ciytId;
    }
}
