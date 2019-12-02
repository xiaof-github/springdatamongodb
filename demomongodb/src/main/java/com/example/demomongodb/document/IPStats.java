package com.example.demomongodb.document;


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
@Document(collection="ipStats")
public class IPStats {
    private String id;
    private String srcIP;
    private String dstIP;
    private String sessionID;
    private Long logID;
    private String appProto;
    private String transProto;
    private Long startTime;
    private Long endTime;
    private Long sendBytes;
    private Long recvBytes;
    private Long sendPkts;
    private Long recvPkts;

    public IPStats() {
    }

    public IPStats(String id, String srcIP, String dstIP, String sessionID, Long logID, String appProto, String transProto, Long startTime, Long endTime, Long sendBytes, Long recvBytes, Long sendPkts, Long recvPkts) {
        this.id = id;
        this.srcIP = srcIP;
        this.dstIP = dstIP;
        this.sessionID = sessionID;
        this.logID = logID;
        this.appProto = appProto;
        this.transProto = transProto;
        this.startTime = startTime;
        this.endTime = endTime;
        this.sendBytes = sendBytes;
        this.recvBytes = recvBytes;
        this.sendPkts = sendPkts;
        this.recvPkts = recvPkts;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSrcIP() {
        return srcIP;
    }

    public void setSrcIP(String srcIP) {
        this.srcIP = srcIP;
    }

    public String getDstIP() {
        return dstIP;
    }

    public void setDstIP(String dstIP) {
        this.dstIP = dstIP;
    }

    public String getSessionID() {
        return sessionID;
    }

    public void setSessionID(String sessionID) {
        this.sessionID = sessionID;
    }

    public Long getLogID() {
        return logID;
    }

    public void setLogID(Long logID) {
        this.logID = logID;
    }

    public String getAppProto() {
        return appProto;
    }

    public void setAppProto(String appProto) {
        this.appProto = appProto;
    }

    public String getTransProto() {
        return transProto;
    }

    public void setTransProto(String transProto) {
        this.transProto = transProto;
    }

    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public Long getSendBytes() {
        return sendBytes;
    }

    public void setSendBytes(Long sendBytes) {
        this.sendBytes = sendBytes;
    }

    public Long getRecvBytes() {
        return recvBytes;
    }

    public void setRecvBytes(Long recvBytes) {
        this.recvBytes = recvBytes;
    }

    public Long getSendPkts() {
        return sendPkts;
    }

    public void setSendPkts(Long sendPkts) {
        this.sendPkts = sendPkts;
    }

    public Long getRecvPkts() {
        return recvPkts;
    }

    public void setRecvPkts(Long recvPkts) {
        this.recvPkts = recvPkts;
    }

    @Override
    public String toString() {
        return "IPStats{" +
                "id='" + id + '\'' +
                ", srcIP='" + srcIP + '\'' +
                ", dstIP='" + dstIP + '\'' +
                ", sessionID='" + sessionID + '\'' +
                ", logID=" + logID +
                ", appProto='" + appProto + '\'' +
                ", transProto='" + transProto + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", sendBytes=" + sendBytes +
                ", recvBytes=" + recvBytes +
                ", sendPkts=" + sendPkts +
                ", recvPkts=" + recvPkts +
                '}';
    }
}
