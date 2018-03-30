package cc.moecraft.saukiya.web.datareceiver;

import java.util.Date;

/**
 * 此类由 Hykilpikonna 在 2018/03/29 创建!
 * Created by Hykilpikonna on 2018/03/29!
 * Github: https://github.com/hykilpikonna
 * QQ/Wechat: admin@moecraft.cc
 */
public class DataProperties
{
    private int index;
    private String pluginName;
    private String date;
    private String serverName;
    private String serverIP;
    private String serverOnlinePlayers;
    private EventType eventType;

    protected DataProperties(){}

    public DataProperties(String pluginName, String date, String serverName, String serverIP, String serverOnlinePlayers, EventType eventType)
    {
        this.pluginName = pluginName;
        this.date = date;
        this.serverName = serverName;
        this.serverIP = serverIP;
        this.serverOnlinePlayers = serverOnlinePlayers;
        this.eventType = eventType;
    }

    public String getPluginName() {
        return pluginName;
    }

    public void setPluginName(String pluginName) {
        this.pluginName = pluginName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public String getServerIP() {
        return serverIP;
    }

    public void setServerIP(String serverIP) {
        this.serverIP = serverIP;
    }

    public String getServerOnlinePlayers() {
        return serverOnlinePlayers;
    }

    public void setServerOnlinePlayers(String serverOnlinePlayers) {
        this.serverOnlinePlayers = serverOnlinePlayers;
    }

    public EventType getEventType() {
        return eventType;
    }

    public void setEventType(EventType eventType) {
        this.eventType = eventType;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }


    public enum EventType
    {
        START, STOP, RELOAD
    }
}
