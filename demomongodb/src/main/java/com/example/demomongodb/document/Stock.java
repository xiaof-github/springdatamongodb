package com.example.demomongodb.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * example
 * {
 * 	"_id" : ObjectId("5c62db7b10b3205e41970b34"),
 * 	"ts_code" : "600318.SH",
 * 	"trade_date" : "20190102",
 * 	"open" : 7.17,
 * 	"high" : 7.37,
 * 	"low" : 7.14,
 * 	"close" : 7.25,
 * 	"pre_close" : 7.12,
 * 	"change" : 0.13,
 * 	"pct_chg" : 1.8258,
 * 	"vol" : 62659,
 * 	"amount" : 45392.424
 * }
 */
//@Document(collection = "test_stock")
@Document
public class Stock {

    private String id;
    private String ts_code;
    private String trade_date;
    private float open;
    private float high;
    private float low;
    private float close;
    private float pre_close;
    private float change;
    private float pct_chg;
    private Long vol;
    private float amount;

    public Stock() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTs_code() {
        return ts_code;
    }

    public void setTs_code(String ts_code) {
        this.ts_code = ts_code;
    }

    public String getTrade_date() {
        return trade_date;
    }

    public void setTrade_date(String trade_date) {
        this.trade_date = trade_date;
    }

    public float getOpen() {
        return open;
    }

    public void setOpen(float open) {
        this.open = open;
    }

    public float getHigh() {
        return high;
    }

    public void setHigh(float high) {
        this.high = high;
    }

    public float getLow() {
        return low;
    }

    public void setLow(float low) {
        this.low = low;
    }

    public float getClose() {
        return close;
    }

    public void setClose(float close) {
        this.close = close;
    }

    public float getPre_close() {
        return pre_close;
    }

    public void setPre_close(float pre_close) {
        this.pre_close = pre_close;
    }

    public float getChange() {
        return change;
    }

    public void setChange(float change) {
        this.change = change;
    }

    public float getPct_chg() {
        return pct_chg;
    }

    public void setPct_chg(float pct_chg) {
        this.pct_chg = pct_chg;
    }

    public Long getVol() {
        return vol;
    }

    public void setVol(Long vol) {
        this.vol = vol;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "id='" + id + '\'' +
                ", ts_code='" + ts_code + '\'' +
                ", trade_date='" + trade_date + '\'' +
                ", open=" + open +
                ", high=" + high +
                ", low=" + low +
                ", close=" + close +
                ", pre_close=" + pre_close +
                ", change=" + change +
                ", pct_chg=" + pct_chg +
                ", vol=" + vol +
                ", amount=" + amount +
                '}';
    }
}
