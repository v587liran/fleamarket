
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>  
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<head>
	<base href="<%=basePath%>">
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	

	<link type="text/css" rel="stylesheet" href="css/style.css" />
    <!--[if IE 6]>
    <script src="js/iepng.js" type="text/javascript"></script>
        <script type="text/javascript">
           EvPNG.fix('div, ul, img, li, input, a'); 
        </script>
    <![endif]-->    
    <script type="text/javascript" src="js/jquery-1.11.1.min_044d0927.js"></script>
	<script type="text/javascript" src="js/jquery.bxslider_e88acd1b.js"></script>
    
    <script type="text/javascript" src="js/jquery-1.8.2.min.js"></script>
    <script type="text/javascript" src="js/menu.js"></script>    
        
	<script type="text/javascript" src="js/select.js"></script>
    
	<script type="text/javascript" src="js/lrscroll.js"></script>
    
    <script type="text/javascript" src="js/iban.js"></script>
    <script type="text/javascript" src="js/fban.js"></script>
    <script type="text/javascript" src="js/f_ban.js"></script>
    <script type="text/javascript" src="js/mban.js"></script>
    <script type="text/javascript" src="js/bban.js"></script>
    <script type="text/javascript" src="js/hban.js"></script>
    <script type="text/javascript" src="js/tban.js"></script>
    
	<script type="text/javascript" src="js/lrscroll_1.js"></script>
    
    
	<title>二手货</title>
</head>
<body>  
<div id="gototop"><a href="#top">回到<br>顶部</a></div>
<!--Begin Header Begin-->
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
    	<form action ="goods_gerenfabulist.action" method="post" namespace="/">
        	<input type="text" value="" name="keyword" class="s_ipt" />
            <input type="submit" value="搜索" class="s_btn" />
        </form>                     
      
    </div>
    <div class="i_car">
    	<a href="pages/goods/goods_add.jsp"><div class="car_t">发布闲置 </div></a>
    </div>
</div>
<!--End Header End--> 
<!--Begin Menu Begin-->
<div class="menu_bg">
	
</div>
	
<!--End Menu End--> 





<div class="i_bg bg_color">
	
	<!--Begin 第一步：查看购物车 Begin -->
    <div class="content mar_20">
    	<table border="0" class="car_tab" style="width:1200px; margin-bottom:50px;" cellspacing="0" cellpadding="0">
           <tr> 
            <td class="car_th" width="800">物品名称</td>
            <td class="car_th" width="300">物品类型</td>
            <td class="car_th" width="300">物品价格</td>
            <td class="car_th" width="300">使用日期</td>
            <td class="car_th" width="300">物品详情</td>
            <td class="car_th" width="300">操作</td>
          </tr>
        <s:if test="allGoods != null && allGoods.size() > 0">
			<s:iterator value="allGoods">
			<tr>
	            <td>
	            	<div class="c_s_img"><img src="upload/${goodsphoto==null?'nophoto.png':goodsphoto }" width="150px" height=""150px""/></div>
	                &nbsp;&nbsp;${goodsname }
	            </td>
	            <td align="center">${goodstype.typename }</td>
	            <td align="center"><font size="5px" color="red">${goodsprice }</font></td>
	            <td align="center">${usedtime }</td>
	            <td align="center">${goodsdetails }</td>
	            <td align="center"><a href="goods_getInfo.action?goods.goodsid=${goodsid }" >购买</a>&nbsp; &nbsp;<a href="#">加入收藏</a></td>
          	</tr>
          </s:iterator>
         </s:if> 
        </table>
        
        <center>
	        <jsp:include page="/split_page_plugin.jsp">
				<jsp:param value="${pageNo}" name="pageNo" />
				<jsp:param value="${pageSize}" name="pageSize" />
				<jsp:param value="${keyword}" name="keyword" />
				<jsp:param value="${column}" name="column" />
				<jsp:param value="${count}" name="count" />
				<jsp:param value="goods_gerenfabulist.action" name="URL" />
				<jsp:param value="goodsid:物品ID|goodsname:物品名称" name="columnData" />
				<jsp:param value="3" name="pageStyle" />
			</jsp:include>
		</center>
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
    <!--End Footer End -->    
</div>

</body>


<!--[if IE 6]>
<script src="//letskillie6.googlecode.com/svn/trunk/2/zh_CN.js"></script>
<![endif]-->
</html>
