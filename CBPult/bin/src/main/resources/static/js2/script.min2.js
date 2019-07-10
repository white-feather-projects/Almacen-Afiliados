"use strict";function toggleFullScreen(){$(window).height();document.fullscreenElement||document.mozFullScreenElement||document.webkitFullscreenElement?document.cancelFullScreen?document.cancelFullScreen():document.mozCancelFullScreen?document.mozCancelFullScreen():document.webkitCancelFullScreen&&document.webkitCancelFullScreen():document.documentElement.requestFullscreen?document.documentElement.requestFullscreen():document.documentElement.mozRequestFullScreen?document.documentElement.mozRequestFullScreen():document.documentElement.webkitRequestFullscreen&&document.documentElement.webkitRequestFullscreen(Element.ALLOW_KEYBOARD_INPUT),$(".full-screen").toggleClass("icon-maximize"),$(".full-screen").toggleClass("icon-minimize")}$(document).ready(function(){var e=($(window),$("body")),t=e[0].className;$(".main-menu").attr("id",t),$(".card-header-right .close-card").on("click",function(){var e=$(this);e.parents(".card").animate({opacity:"0","-webkit-transform":"scale3d(.3, .3, .3)",transform:"scale3d(.3, .3, .3)"}),setTimeout(function(){e.parents(".card").remove()},800)}),$(".card-header-right .minimize-card").on("click",function(){var e=$(this),t=$(e.parents(".card"));$(t).children(".card-block").slideToggle();$(this).toggleClass("icon-minus").fadeIn("slow"),$(this).toggleClass("icon-plus").fadeIn("slow")}),$(".card-header-right .full-card").on("click",function(){var e=$(this);$(e.parents(".card")).toggleClass("full-card"),$(this).toggleClass("icon-maximize"),$(this).toggleClass("icon-minimize")}),$("#more-details").on("click",function(){$(".more-details").slideToggle(500)}),$(".mobile-options").on("click",function(){$(".navbar-container .nav-right").slideToggle("slow")})/*,$.mCustomScrollbar.defaults.axis="yx"*/,$("#styleSelector .style-cont").slimScroll({setTop:"10px",height:"calc(100vh - 440px)"})/*,$(".main-menu").mCustomScrollbar({setTop:"10px",setHeight:"calc(100% - 80px)"})*/;var a=$(window).height()-80;$(".main-friend-list").slimScroll({height:a,allowPageScroll:!1,wheelStep:5,color:"#1b8bf9"}),$("#search-friends").on("keyup",function(){var e=$(this).val().toLowerCase();$(".userlist-box .media-body .chat-header").each(function(){var t=$(this).text().toLowerCase();$(this).closest(".userlist-box")[-1!==t.indexOf(e)?"show":"hide"]()})}),$(".displayChatbox").on("click",function(){if("right"==$(".pcoded").attr("vertical-placement"))var e={direction:"left"};else var e={direction:"right"};$(".showChat").toggle("slide",e,500)}),$(".userlist-box").on("click",function(){if("right"==$(".pcoded").attr("vertical-placement"))var e={direction:"left"};else var e={direction:"right"};$(".showChat_inner").toggle("slide",e,500)}),$(".back_chatBox").on("click",function(){if("right"==$(".pcoded").attr("vertical-placement"))var e={direction:"left"};else var e={direction:"right"};$(".showChat_inner").toggle("slide",e,500),$(".showChat").css("display","block")}),$(".search-btn").on("click",function(){$(".main-search").addClass("open"),$(".main-search .form-control").animate({width:"200px"})}),$(".search-close").on("click",function(){$(".main-search .form-control").animate({width:"0"}),setTimeout(function(){$(".main-search").removeClass("open")},300)}),$("#mobile-collapse i").addClass("icon-toggle-right"),$("#mobile-collapse").on("click",function(){$("#mobile-collapse i").toggleClass("icon-toggle-right"),$("#mobile-collapse i").toggleClass("icon-toggle-left")})}),$(document).ready(function(){$(function(){$('[data-toggle="tooltip"]').tooltip()}),$(".theme-loader").fadeOut("slow",function(){$(this).remove()})}),
$("#styleSelector").append(
'<div class="selector-toggle">'+
'    <a href="javascript:void(0)"></a>'+
'</div>'+
'<ul>'+
'    <li>'+
'        <p class="selector-title main-title st-main-title"><b>FinanPlus </b>Customizer</p>'+
'        <span class="text-muted">Live customizer with tons of options</span>'+
'    </li>'+
'            <li>'+
'                <p class="selector-title">Header Brand color</p>'+
'            </li>'+
'            <li class="theme-option">'+
'                <div class="theme-color">'+
'                    <a href="#" class="logo-theme" logo-theme="theme1"><span class="head"></span><span class="cont"></span></a>'+
'                    <a href="#" class="logo-theme" logo-theme="theme2"><span class="head"></span><span class="cont"></span></a>'+
'                    <a href="#" class="logo-theme" logo-theme="theme3"><span class="head"></span><span class="cont"></span></a>'+
'                    <a href="#" class="logo-theme" logo-theme="theme4"><span class="head"></span><span class="cont"></span></a>'+
'                    <a href="#" class="logo-theme" logo-theme="theme5"><span class="head"></span><span class="cont"></span></a>'+
'                </div>'+
'            </li>'+
'            <li><p class="selector-title">Header color</p></li>'+
'            <li class="theme-option">'+
'                <div class="theme-color">'+
'                    <a href="#" class="header-theme" header-theme="theme1"><span class="head"></span><span class="cont"></span></a>'+
'                    <a href="#" class="header-theme" header-theme="theme2"><span class="head"></span><span class="cont"></span></a>'+
'                    <a href="#" class="header-theme" header-theme="theme3"><span class="head"></span><span class="cont"></span></a>'+
'                    <a href="#" class="header-theme" header-theme="theme4"><span class="head"></span><span class="cont"></span></a>'+
'                    <a href="#" class="header-theme" header-theme="theme5"><span class="head"></span><span class="cont"></span></a>'+
'                    <a href="#" class="header-theme" header-theme="theme6"><span class="head"></span><span class="cont"></span></a>'+
'                </div>'+
'            </li>'+
'</ul>'+
'<div class="style-cont m-t-10">'+
'    <div class="tab-content tabs">'+
'       Extra Information '+
'    </div>'+
'</div>'+
'<ul>'+
'    <li>'+
'        <a href="documentation.html" class="btn btn-primary btn-block m-r-15 m-t-5 m-b-10">Online Documentation</a>'+
'    </li>'+
'    <li class="text-center">'+
'        <span class="text-center f-18 m-t-15 m-b-15 d-block">Thank you for sharing !</span>'+
'    </li>'+
'</ul>');


/* Header */
$("#headerNotifications").html('');
/*Notifications*/
$("#headerNotifications").append(
'   <li class="header-notification">'+
'        <div class="dropdown-primary dropdown">'+
'            <div class="dropdown-toggle" data-toggle="dropdown"><i class="feather icon-bell"></i><span class="badge bg-c-pink">3</span></div>'+
'            <ul class="show-notification notification-view dropdown-menu" data-dropdown-in="fadeIn" data-dropdown-out="fadeOut">'+
'                <li><h6>Notifications</h6><label class="label label-danger">New</label></li>'+
'                <li>'+
'                    <div class="media">'+
'                        <img class="d-flex align-self-center img-radius" src="../img/avatar-4.jpg" alt="Generic placeholder image">'+
'                        <div class="media-body">'+
'                            <h5 class="notification-user"></h5>'+
'                            <p class="notification-msg">Lorem ipsum dolor sit amet, consectetuer elit.</p>'+
'                            <span class="notification-time">30 minutes ago</span>'+
'                        </div>'+
'                    </div>'+
'                </li>'+
'                <li>'+
'                    <div class="media">'+
'                        <img class="d-flex align-self-center img-radius" src="../img/avatar-3.jpg" alt="Generic placeholder image">'+
'                        <div class="media-body">'+
'                            <h5 class="notification-user">Joseph William</h5>'+
'                            <p class="notification-msg">Lorem ipsum dolor sit amet, consectetuer elit.</p>'+
'                            <span class="notification-time">30 minutes ago</span>'+
'                        </div>'+
'                    </div>'+
'                </li>'+
'                <li>'+
'                    <div class="media">'+
'                        <img class="d-flex align-self-center img-radius" src="../img/avatar-4.jpg" alt="Generic placeholder image">'+
'                        <div class="media-body">'+
'                            <h5 class="notification-user">Sara Soudein</h5>'+
'                            <p class="notification-msg">Lorem ipsum dolor sit amet, consectetuer elit.</p>'+
'                            <span class="notification-time">30 minutes ago</span>'+
'                        </div>'+
'                    </div>'+
'                </li>'+
'            </ul>'+
'        </div>'+
'    </li>'
);
/*Messages Chat*/
$("#headerNotifications").append(
    '   <li class="header-notification">'+
    '        <div class="dropdown-primary dropdown">'+
    '            <div class="displayChatbox dropdown-toggle" data-toggle="dropdown">'+
    '                <i class="feather icon-message-square"></i>'+
    '                <span class="badge bg-c-green">5</span>'+
    '            </div>'+
    '        </div>'+
    '    </li>'
    );

/*Loading Options Users*/
$("#headerNotifications").append(
'    <li class="user-profile header-notification">'+
'        <div class="dropdown-primary dropdown">'+
'            <div class="dropdown-toggle" data-toggle="dropdown">'+
'                <img src="../img/avatar-4.jpg" class="img-radius" alt="User-Profile-Image">'+
'                <span id="myspan">123</span>'+
'                <i class="feather icon-chevron-down"></i>'+
'            </div>'+
'            <ul class="show-notification profile-notification dropdown-menu" data-dropdown-in="fadeIn" data-dropdown-out="fadeOut">'+
'                <li><a href="#"><i class="feather icon-settings"></i> Settings</a></li>'+
'                <li><a href="#"><i class="feather icon-user"></i> Profile</a></li>'+
'                <li><a href="lockScreen.html"><i class="feather icon-lock"></i> Lock Screen</a></li>'+
'                <li><a href="lockScreen.html"><i class="feather icon-log-out"></i id="logout">Logout</a></li>'+
'            </ul>'+
'        </div>'+
'    </li>'
);

$("#sidebar").html('');
$("#sidebar").append(
'   <div class="had-container">'+
'        <div class="card card_main p-fixed users-main">'+
'            <div class="user-box">'+
'                <div class="chat-inner-header">'+
'                    <div class="back_chatBox">'+
'                        <div class="right-icon-control">'+
'                            <input type="text" class="form-control  search-text" placeholder="Search Friend" id="search-friends">'+
'                            <div class="form-icon"><i class="icofont icofont-search"></i></div>'+
'                        </div>'+
'                    </div>'+
'                </div>'+
'                <div class="slimScrollDiv" style="position: relative; overflow: hidden; width: auto; height: 577px;">'+
'                    <div class="main-friend-list" style="overflow: hidden; width: auto; height: 577px;">'+
'                        <div class="media userlist-box" data-id="1" data-status="online" data-username="Josephin Doe" data-toggle="tooltip" data-placement="left" title="" data-original-title="Josephin Doe">'+
'                            <a class="media-left" href="#!">'+
'                                <img class="media-object img-radius img-radius" src="../img/avatar-3.jpg" alt="Generic placeholder image ">'+
'                                <div class="live-status bg-success"></div>'+
'                            </a>'+
'                            <div class="media-body"><div class="f-13 chat-header">Josephin Doe</div></div>'+
'                        </div>'+
'                        <div class="media userlist-box" data-id="2" data-status="online" data-username="Lary Doe" data-toggle="tooltip" data-placement="left" title="" data-original-title="Lary Doe">'+
'                            <a class="media-left" href="#!">'+
'                                <img class="media-object img-radius" src="../img/avatar-2.jpg" alt="Generic placeholder image">'+
'                                <div class="live-status bg-success"></div>'+
'                            </a>'+
'                            <div class="media-body"><div class="f-13 chat-header">Lary Doe</div></div>'+
'                        </div>'+
'                        <div class="media userlist-box" data-id="3" data-status="online" data-username="Alice" data-toggle="tooltip" data-placement="left" title="" data-original-title="Alice">'+
'                            <a class="media-left" href="#!">'+
'                                <img class="media-object img-radius" src="../img/avatar-4.jpg" alt="Generic placeholder image">'+
'                                <div class="live-status bg-success"></div>'+
'                            </a>'+
'                            <div class="media-body"><div class="f-13 chat-header">Alice</div></div>'+
'                        </div>'+
'                        <div class="media userlist-box" data-id="4" data-status="online" data-username="Alia" data-toggle="tooltip" data-placement="left" title="" data-original-title="Alia">'+
'                            <a class="media-left" href="#!">'+
'                                <img class="media-object img-radius" src="../img/avatar-3.jpg" alt="Generic placeholder image">'+
'                                <div class="live-status bg-success"></div>'+
'                            </a>'+
'                            <div class="media-body"><div class="f-13 chat-header">Alia</div></div>'+
'                        </div>'+
'                        <div class="media userlist-box" data-id="5" data-status="online" data-username="Suzen" data-toggle="tooltip" data-placement="left" title="" data-original-title="Suzen">'+
'                            <a class="media-left" href="#!">'+
'                                <img class="media-object img-radius" src="../img/avatar-2.jpg" alt="Generic placeholder image">'+
'                                <div class="live-status bg-success"></div>'+
'                            </a>'+
'                            <div class="media-body"><div class="f-13 chat-header">Suzen</div></div>'+
'                        </div>'+
'                    </div>'+
'                    <div class="slimScrollBar" style="background: rgb(27, 139, 249); width: 7px; position: absolute; top: 0px; opacity: 0.4; display: block; border-radius: 7px; z-index: 99; right: 1px;"></div>'+
'                    <div class="slimScrollRail" style="width: 7px; height: 100%; position: absolute; top: 0px; display: none; border-radius: 7px; background: rgb(51, 51, 51); opacity: 0.2; z-index: 90; right: 1px;"></div>'+
'                </div>'+
'            </div>'+
'        </div>'+
'    </div>'
);
$("#showChatContent").html('');
$("#showChatContent").append(
'    <div class="media chat-inner-header"><a class="back_chatBox"><i class="feather icon-chevron-left"></i> Josephin Doe</a></div>'+
'    <div class="media chat-messages">'+
'        <a class="media-left photo-table" href="#!"><img class="media-object img-radius img-radius m-t-5" src="../img/avatar-3.jpg" alt="Generic placeholder image"></a>'+
'        <div class="media-body chat-menu-content">'+
'            <div class="">'+
'                <p class="chat-cont">Im just looking around. Will you tell me something about yourself?</p>'+
'                <p class="chat-time">8:20 a.m.</p>'+
'            </div>'+
'        </div>'+
'    </div>'+
'    <div class="media chat-messages">'+
'        <div class="media-body chat-menu-reply">'+
'            <div class="">'+
'                <p class="chat-cont">Im just looking around. Will you tell me something about yourself?</p>'+
'                <p class="chat-time">8:20 a.m.</p>'+
'            </div>'+
'        </div>'+
'        <div class="media-right photo-table"><a href="#!"><img class="media-object img-radius img-radius m-t-5" src="../img/avatar-4.jpg" alt="Generic placeholder image"></a></div>'+
'    </div>'+
'    <div class="chat-reply-box p-b-20">'+
'        <div class="right-icon-control">'+
'            <input type="text" class="form-control search-text" placeholder="Share Your Thoughts">'+
'            <div class="form-icon"><i class="feather icon-navigation"></i></div>'+
'        </div>'+
'    </div>'
);


/*Menu Options*/
$("#mCSB_1").html('');
$("#mCSB_1").append(
'    <div id="mCSB_1_container_wrapper" class="mCSB_container_wrapper mCS_x_hidden mCS_no_scrollbar_x scrollHtml" style="overflow-y: auto;">'+
'        <div id="mCSB_1_container" class="mCSB_container " style="position: relative; top: -10px; left: 0px; width: 100%;max-height: 100%;" dir="ltr">'+
'            <div class="pcoded-navigatio-lavel" menu-title-theme="theme5">Options Systems</div>'+
'            <ul class="pcoded-item pcoded-left-item" item-border="true" item-border-style="none" subitem-border="true">'+
'                <li class="active">'+
'                    <a href="/dashborad">'+
'                        <span class="pcoded-micon"><i class="feather icon-home"></i></span>'+
'                        <span class="pcoded-mtext">Menu Principal</span>'+
'                    </a>'+
'                </li>'+
'            </ul>'+
'        </div>'+
'     </div>'
);