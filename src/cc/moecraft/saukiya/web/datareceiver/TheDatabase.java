package cc.moecraft.saukiya.web.datareceiver;

import cc.moecraft.api.Config;

import java.util.ArrayList;

/**
 * 此类由 Hykilpikonna 在 2018/03/29 创建!
 * Created by Hykilpikonna on 2018/03/29!
 * Github: https://github.com/hykilpikonna
 * QQ/Wechat: admin@moecraft.cc
 */
public class TheDatabase extends Config
{
    private static final int MAX_DISPLAY_ON_ONE_PAGE = 20;

    public TheDatabase()
    {
        super("1", "DataReceiver/Database", "Database", "yml", false, false, false);
    }

    @Override
    public void readConfig()
    {
        System.out.println(getConfigFile().getAbsolutePath());
    }

    @Override
    public void writeConfig()
    {

    }

    @Override
    public void writeDefaultConfig()
    {

    }

    public ArrayList<DataProperties> getDataSet(int page)
    {
        page -= 1;

        ArrayList<DataProperties> data = new ArrayList<>();

        for (int i = getMaxIndex() - (MAX_DISPLAY_ON_ONE_PAGE * page); i > getMaxIndex() - MAX_DISPLAY_ON_ONE_PAGE * (page + 1); i--)
        {
            System.out.println(i);
            if (i < 1) break;
            data.add(getDataProperties("Data", i));
        }

        return data;
    }

    private DataProperties getDataProperties(String path, int index)
    {
        path += "." + index;

        DataProperties dataProperties = new DataProperties();
        dataProperties.setIndex(index);
        dataProperties.setPluginName(getString(path + ".PluginName"));
        dataProperties.setDate(getString(path + ".Date"));
        dataProperties.setServerName(getString(path + ".ServerName"));
        dataProperties.setServerIP(getString(path + ".ServerIP"));
        dataProperties.setServerOnlinePlayers(getString(path + ".ServerOnlinePlayers"));
        dataProperties.setEventType(DataProperties.EventType.valueOf(getString(path + ".EventType")));
        return dataProperties;
    }

    public void addDataProperties(DataProperties properties)
    {
        addDataProperties("Data", properties);
    }

    private void addDataProperties(String path, DataProperties properties)
    {
        setMaxIndex(getMaxIndex() + 1);

        path += "." + getMaxIndex();

        set(path + ".PluginName", properties.getPluginName());
        set(path + ".Date", properties.getDate());
        set(path + ".ServerName", properties.getServerName());
        set(path + ".ServerIP", properties.getServerIP());
        set(path + ".ServerOnlinePlayers", properties.getServerOnlinePlayers());
        set(path + ".EventType", properties.getEventType().name());
        save();
    }

    private int getMaxIndex()
    {
        return getInt("MaxIndex");
    }

    private void setMaxIndex(int index)
    {
        set("MaxIndex", index);
        save();
    }
}
