<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>  
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<head>
<%
 String path = request.getContextPath();
 String basePath = request.getScheme() + "://"
 + request.getServerName() + ":" + request.getServerPort()
 + path + "/";
%>
<base href="<%=basePath%>">

<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<link type="text/css" rel="stylesheet" href="css/style.css" />
        
    <script type="text/javascript" src="js/jquery-1.8.2.min.js"></script>
    <script type="text/javascript" src="js/menu.js"></script>    
        
	<script type="text/javascript" src="js/select.js"></script>
        
    
<title>个人信息</title>
</head>
<body>  
 <div id="gototop"><a href="#top">回到<br>顶部</a></div>
 <div class="soubg">
	<div class="sou">
    	<!--Begin 所在收货地区 Begin-->
    	
        <!--End 所在收货地区 End-->
        <span class="fr">
        	<span class="fl">您好，${guser.guserid} |&nbsp;<a href="#">我的订单</a>&nbsp;|</span>
        	<span class="ss">
            	<div class="ss_list">
                	<a href="#">用户中心</a>
                    <div class="ss_list_bg">
                    	<div class="s_city_t"></div>
                        <div class="ss_list_c">
                        	<ul>
                            	<li><a href="pages/guser/guser_lookinfo.jsp">个人信息</a></li>
                                <li><a href="#">我的收藏</a></li>
                            </ul>
                        </div>
                    </div>     
                </div>
                <div class="ss_list">
                	<a href="#">服务</a>
                    <div class="ss_list_bg">
                    	<div class="s_city_t"></div>
                        <div class="ss_list_c">
                        	<ul>
                            	<li><a href="#">买家服务</a></li>
                                <li><a href="#">卖家服务</a></li>
                                <li><a href="#">中间商服务</a></li>
                            </ul>
                        </div>
                    </div>    
                </div>
                <div class="ss_list">
                	<a href="#">网站导航</a>
                    <div class="ss_list_bg">
                    	<div class="s_city_t"></div>
                        <div class="ss_list_c">
                        	<ul>
                            	<li><a href="#">网址</a></li>
                                <li><a href="#">网站导航</a></li>
                            </ul>
                        </div>
                    </div>    
                </div>
            </span>
            <span class="fl">|&nbsp;关注我们：</span>
            <span class="s_sh"><a href="#" class="sh2">微信</a></span>
            
        </span>
    </div>
</div>
<div class="top">
    <div class="logo"><a href="Index.html"><img src="images/logo133.png" /></a></div>
    <div class="search">
      <form>
          <input type="text" value="" class="s_ipt" />
            <input type="submit" value="搜索" class="s_btn" />
        </form>                      
      
    </div>
    <div class="i_car">
      <div class="car_t">发布闲置 [ <span>3</span> ]</div>
        <div class="car_bg">
            <ul class="cars">
              <li>
                  <div class="img"><a href="#"><img src="images/zhengzhuang.jpg" width="58" height="58" /></a></div>
                    <div class="name"><a href="#">正装一件</a></div>
                    <div class="price"><font color="#ff4e00">￥150</font> X1</div>
                </li>
                <li>
                  <div class="img"><a href="#"><img src="images/shuzhuo.jpg" width="58" height="58" /></a></div>
                    <div class="name"><a href="#">办公桌一张</a></div>
                    <div class="price"><font color="#ff4e00">￥100</font> X1</div>
                </li>
                <li>
                  <div class="img"><a href="#"><img src="images/yinshuiji.jpg" width="58" height="58" /></a></div>
                    <div class="name"><a href="#">饮水机一个</a></div>
                    <div class="price"><font color="#ff4e00">￥120</font> X1</div>
                </li>
            </ul>
           
            </div>
        </div>
    </div>
</div>
<!--End Header End--> 
<div class="i_bg bg_color">
    <!--Begin 用户中心 Begin -->
  <div class="m_content">
      <div class="m_left">
          <div class="left_n">管理中心</div>
            <div class="left_m">
              <div class="left_m_t t_bg1">订单中心</div>
                <ul>
                  <li><a href="Member_Order.html" class="now">我的订单</a></li>
                    <li><a href="Member_Address.html">收货地址</a></li>
                </ul>
            </div>
            <div class="left_m">
              <div class="left_m_t t_bg2">会员中心</div>
                <ul>
                  <li><a href="Member_User.html">用户信息</a></li>
                    <li><a href="Member_Collect.html">我的收藏</a></li>
                    <li><a href="Member_Links.html">推广链接</a></li>
                </ul>
            </div>
        </div>

		<div class="m_right">
            <div class="mem_t">账号信息</div>
           <!--  <form action="guser_setGuserInfo.action" method="post" namespace="/">
            <table border="0" class="mon_tab" style="width:870px; margin-bottom:20px;" cellspacing="0" cellpadding="0">
              <tr>
                <td width="40%">用户ID：<span style="color:#555555;" > <input type="text" value="${guser.guserid }"name="id"></input></span></td>
                <td width="60%">用户名：<span style="color:#555555;"><input type="text" value="${guser.gusername }"name="name"></input></span></td>
              </tr>
              <tr>
                <td>密&nbsp; &nbsp; 码：<span style="color:#555555;"><input type="text" value="${guser.password }" name="password"></input></span></td>
                <td>电话号码：<span style="color:#555555;"></span><input type="text" value="${guser.phonenumber }"name="phonenumber"></input></td>
              </tr>
              <tr>
                <td>微&nbsp; &nbsp;信：<span style="color:#555555;"><input type="text" value="${guser.wechat } " name="wechat"></input></span></td>
                <td>地&nbsp; &nbsp;址：<span style="color:#555555;"><input type="text" value="${guser.address}" name="address"></input></span></td>
              </tr>
              
              
            </table>
             <input type="submit" value="提交" class="log_btn"/>
            </form> -->
            
           <table border="0" class="mon_tab" style="width:870px; margin-bottom:20px;" cellspacing="0" cellpadding="0">
              <tr>
                <td width="40%">用户ID：<span style="color:#555555;" >${guser.guserid }</span></td>
                <td width="60%">用户名：<span style="color:#555555;">${guser.gusername }</span></td>
              </tr>
              <tr>
                <td>密&nbsp; &nbsp; 码：<span style="color:#555555;">${guser.password }</span></td>
                <td>电话号码：<span style="color:#555555;"></span>${guser.phonenumber }</td>
              </tr>
              <tr>
                <td>微&nbsp; &nbsp;信：<span style="color:#555555;">${guser.wechat }</span></td>
                <td>地&nbsp; &nbsp;址：<span style="color:#555555;">${guser.address}</span></td>
              </tr>
              
              
            </table>
            <center>
               <a href="pages/guser/guser_updateinfo.jsp"><input type="button" value="修改信息" class="log_btn" /></a>
            </center>
            
        </div>
    </div>


  <div class="b_btm_bg b_btm_c">
        <div class="b_btm">
            
        </div>
    </div> 
   <div class="b_nav">
        <dl>                                                                                            
            <dt><a href="#">新手上路</a></dt>
            <dd><a href="#">售后流程</a></dd>
            <dd><a href="#">购物流程</a></dd>
            <dd><a href="#">订购方式</a></dd>
            <dd><a href="#">隐私声明</a></dd>
            <dd><a href="#">推荐分享说明</a></dd>
        </dl>
        <dl>
            <dt><a href="#">配送与支付</a></dt>
            <dd><a href="#">货到付款区域</a></dd>
            <dd><a href="#">配送支付查询</a></dd>
            <dd><a href="#">支付方式说明</a></dd>
        </dl>
        <dl>
            <dt><a href="#">会员中心</a></dt>
            <dd><a href="#">资金管理</a></dd>
            <dd><a href="#">我的收藏</a></dd>
            <dd><a href="#">我的订单</a></dd>
        </dl>
        <dl>
            <dt><a href="#">服务保证</a></dt>
            <dd><a href="#">退换货原则</a></dd>
            <dd><a href="#">售后服务保证</a></dd>
            <dd><a href="#">产品质量保证</a></dd>
        </dl>
        <dl>
            <dt><a href="#">联系我们</a></dt>
            <dd><a href="#">网站故障报告</a></dd>
            <dd><a href="#">购物咨询</a></dd>
            <dd><a href="#">投诉与建议</a></dd>
        </dl>
        
        <div class="b_er">
            <div class="b_er_c"><img src="images/erweima.png" width="118" height="118" /></div>
            <img src="images/ss.png" />
        </div>
    </div>    
      
    </div>
</body>
</html>
