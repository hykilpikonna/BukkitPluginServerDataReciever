<%@ page import="java.util.Date" %>
<%@ page import="java.time.LocalDateTime" %>
<%@ page import="java.time.format.DateTimeFormatter" %>
<%@ page import="cc.moecraft.saukiya.web.datareceiver.Main" %>
<%@ page import="cc.moecraft.saukiya.web.datareceiver.DataProperties" %><%--
 * 此JSP由 Hykilpikonna 在 2018/03/30 08:13 创建!
 * Created by Hykilpikonna on 2018/03/30 08:13!
 * Twitter: @Hykilpikonna
 * QQ/Wechat: 871674895
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%
    String pluginName = request.getParameter("A");
    String date = DateTimeFormatter.ofPattern("yy/MM/dd HH:mm").format(LocalDateTime.now());
    String serverName = request.getParameter("B");
    String serverIP = request.getRemoteAddr();
    String serverOnlinePlayers = request.getParameter("C");
    DataProperties.EventType eventType = DataProperties.EventType.valueOf(request.getParameter("D"));
//TODO: 加密传输
    Main.database().addDataProperties(new DataProperties(pluginName, date, serverName, serverIP, serverOnlinePlayers, eventType));
%>
