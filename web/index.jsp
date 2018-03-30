<%@ page import="java.util.ArrayList" %>
<%@ page import="cc.moecraft.saukiya.web.datareceiver.DataProperties" %>
<%@ page import="cc.moecraft.saukiya.web.datareceiver.Main" %><%--
 * 此JSP由 Hykilpikonna 在 2018/03/29 08:27 创建!
 * Created by Hykilpikonna on 2018/03/29 08:27!
 * Twitter: @Hykilpikonna
 * QQ/Wechat: 871674895
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
    <head>
        <style>
            table
            {
                font-family: arial, sans-serif;
                border-collapse: collapse;
                width: 100%;
            }

            td, th
            {
                border: 1px solid #dddddd;
                text-align: left;
                padding: 8px;
            }

            tr:nth-child(even)
            {
                background-color: #dddddd;
            }
        </style>
        <title>
            MoeCraft 统计
        </title>
    </head>
    <body>
        <h2>插件登陆次数统计</h2>

        <table>
            <tr>
                <th>Index</th>
                <th>Plugin</th>
                <th>Date</th>
                <th>ServerName</th>
                <th>ServerIP</th>
                <th>Online</th>
                <th>Event</th>
            </tr>
            <%
                ArrayList<DataProperties> dataProperties = Main.database().getDataSet(1); //TODO: 翻页

                for (DataProperties data : dataProperties)
                {
                    %><tr>
                        <th><%=data.getIndex()%></th>
                        <th><%=data.getPluginName()%></th>
                        <th><%=data.getDate()%></th>
                        <th><%=data.getServerName()%></th>
                        <th><%=data.getServerIP()%></th>
                        <th><%=data.getServerOnlinePlayers()%></th>
                        <th><%=data.getEventType().toString()%></th>
                    </tr>
                    <%
                }
            %>
        </table>
    </body>
</html>
