package com.tencent.mm.pluginsdk;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import com.tencent.mm.R.l;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.g.a.bu;
import com.tencent.mm.g.a.hn;
import com.tencent.mm.g.a.hn.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.am.a;
import com.tencent.mm.model.am.b;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.model.u;
import com.tencent.mm.model.u.b;
import com.tencent.mm.model.y;
import com.tencent.mm.modelsimple.aa;
import com.tencent.mm.plugin.account.ui.LoginUI;
import com.tencent.mm.plugin.account.ui.MobileInputUI;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.pluginsdk.wallet.i;
import com.tencent.mm.protocal.GeneralControlWrapper;
import com.tencent.mm.protocal.JsapiPermissionWrapper;
import com.tencent.mm.protocal.c.cp;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.e;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ay;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.base.b;
import com.tencent.mm.ui.base.p;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public final class d
{
  public static String qya = "";
  private static final Map<String, Long> qyb;
  
  static
  {
    HashMap localHashMap = new HashMap();
    qyb = localHashMap;
    localHashMap.put("weixin://", Long.valueOf(0L));
    qyb.put("weixin://dl/stickers", Long.valueOf(1L));
    qyb.put("weixin://dl/games", Long.valueOf(2L));
    qyb.put("weixin://dl/moments", Long.valueOf(4L));
    qyb.put("weixin://dl/add", Long.valueOf(8L));
    qyb.put("weixin://dl/shopping", Long.valueOf(16L));
    qyb.put("weixin://dl/groupchat", Long.valueOf(32L));
    qyb.put("weixin://dl/scan", Long.valueOf(64L));
    qyb.put("weixin://dl/profile", Long.valueOf(128L));
    qyb.put("weixin://dl/settings", Long.valueOf(256L));
    qyb.put("weixin://dl/general", Long.valueOf(512L));
    qyb.put("weixin://dl/help", Long.valueOf(1024L));
    qyb.put("weixin://dl/notifications", Long.valueOf(2048L));
    qyb.put("weixin://dl/terms", Long.valueOf(4096L));
    qyb.put("weixin://dl/chat", Long.valueOf(8192L));
    qyb.put("weixin://dl/features", Long.valueOf(16384L));
    qyb.put("weixin://dl/clear", Long.valueOf(32768L));
    qyb.put("weixin://dl/feedback", Long.valueOf(65536L));
    qyb.put("weixin://dl/faq", Long.valueOf(131072L));
    qyb.put("weixin://dl/recommendation", Long.valueOf(262144L));
    qyb.put("weixin://dl/groups", Long.valueOf(524288L));
    qyb.put("weixin://dl/tags", Long.valueOf(1048576L));
    qyb.put("weixin://dl/officialaccounts", Long.valueOf(2097152L));
    qyb.put("weixin://dl/posts", Long.valueOf(4194304L));
    qyb.put("weixin://dl/favorites", Long.valueOf(8388608L));
    qyb.put("weixin://dl/privacy", Long.valueOf(16777216L));
    qyb.put("weixin://dl/security", Long.valueOf(33554432L));
    qyb.put("weixin://dl/wallet", Long.valueOf(67108864L));
    qyb.put("weixin://dl/businessPay", Long.valueOf(134217728L));
    qyb.put("weixin://dl/businessPay/", Long.valueOf(134217728L));
    qyb.put("weixin://dl/wechatout", Long.valueOf(268435456L));
    qyb.put("weixin://dl/protection", Long.valueOf(1073741824L));
    qyb.put("weixin://dl/card", Long.valueOf(2147483648L));
    qyb.put("weixin://dl/about", Long.valueOf(1125899906842624L));
    qyb.put("weixin://dl/blacklist", Long.valueOf(4294967296L));
    qyb.put("weixin://dl/textsize", Long.valueOf(8589934592L));
    qyb.put("weixin://dl/sight", Long.valueOf(17179869184L));
    qyb.put("weixin://dl/languages", Long.valueOf(34359738368L));
    qyb.put("weixin://dl/chathistory", Long.valueOf(68719476736L));
    qyb.put("weixin://dl/bindqq", Long.valueOf(137438953472L));
    qyb.put("weixin://dl/bindmobile", Long.valueOf(274877906944L));
    qyb.put("weixin://dl/bindemail", Long.valueOf(549755813888L));
    qyb.put("weixin://dl/securityassistant", Long.valueOf(1099511627776L));
    qyb.put("weixin://dl/broadcastmessage", Long.valueOf(2199023255552L));
    qyb.put("weixin://dl/setname", Long.valueOf(4398046511104L));
    qyb.put("weixin://dl/myQRcode", Long.valueOf(8796093022208L));
    qyb.put("weixin://dl/myaddress", Long.valueOf(17592186044416L));
    qyb.put("weixin://dl/hidemoments", Long.valueOf(35184372088832L));
    qyb.put("weixin://dl/blockmoments", Long.valueOf(70368744177664L));
    qyb.put("weixin://dl/stickersetting", Long.valueOf(140737488355328L));
    qyb.put("weixin://dl/log", Long.valueOf(281474976710656L));
    qyb.put("weixin://dl/wechatoutcoupon", Long.valueOf(562949953421312L));
    qyb.put("weixin://dl/wechatoutshare", Long.valueOf(18014398509481984L));
    qyb.put("weixin://dl/personalemoticon", Long.valueOf(4503599627370496L));
    qyb.put("weixin://dl/designeremoji", Long.valueOf(9007199254740992L));
    qyb.put("weixin://dl/sightdraft", Long.valueOf(576460752303423488L));
    qyb.put("weixin://dl/jumpWxa/", Long.valueOf(576460752303423489L));
    qyb.put("weixin://dl/offlinepay/", Long.valueOf(576460752303423490L));
  }
  
  private static void S(Context paramContext, int paramInt)
  {
    String str;
    if ((!e.sFF) && (w.chP().equals("zh_CN"))) {
      str = paramContext.getString(R.l.wechat_faq_url);
    }
    for (;;)
    {
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.DeepLinkHelper", "using faq webpage");
      Intent localIntent = new Intent();
      localIntent.putExtra("rawUrl", str);
      localIntent.putExtra("show_feedback", false);
      localIntent.putExtra("geta8key_session_id", paramInt);
      com.tencent.mm.bg.d.b(paramContext, "webview", ".ui.tools.WebViewUI", localIntent);
      return;
      if (w.chP().equals("zh_HK")) {
        str = paramContext.getString(R.l.wechat_faq_url_cht);
      } else if (w.chP().equals("zh_TW")) {
        str = paramContext.getString(R.l.wechat_faq_url_cht_tw);
      } else {
        str = paramContext.getString(R.l.wechat_faq_url_en);
      }
    }
  }
  
  public static boolean SA(String paramString)
  {
    paramString = SE(paramString);
    return (qyb.containsKey(paramString)) || (SB(paramString));
  }
  
  public static boolean SB(String paramString)
  {
    return (!bi.oW(paramString)) && (paramString.startsWith("weixin://dl/business"));
  }
  
  private static boolean SC(String paramString)
  {
    if (((paramString.equals("weixin://dl/wechatout")) || (paramString.equals("weixin://dl/wechatoutcoupon")) || (paramString.equals("weixin://dl/wechatoutshare"))) && (!Boolean.valueOf(com.tencent.mm.plugin.ipcall.d.aWV()).booleanValue()))
    {
      paramString = new Intent();
      paramString.setFlags(268435456);
      paramString.setClassName(ad.getContext(), "com.tencent.mm.plugin.webview.ui.tools.WebViewUI");
      paramString.putExtra("rawUrl", "https://support.weixin.qq.com/deeplink/noaccess#wechat_redirect");
      ad.getContext().startActivity(paramString);
      return true;
    }
    return false;
  }
  
  public static boolean SD(String paramString)
  {
    return a(null, paramString, 0, null, (int)System.currentTimeMillis(), new byte[0], null);
  }
  
  private static String SE(String paramString)
  {
    String str = null;
    if (!bi.oW(paramString))
    {
      paramString = Uri.parse(paramString);
      str = paramString.getScheme() + "://" + paramString.getHost() + paramString.getPath();
    }
    return str;
  }
  
  public static void a(Context paramContext, String paramString, int paramInt, Bundle paramBundle, a parama)
  {
    a(paramContext, paramString, paramInt, paramBundle, parama, null, null);
  }
  
  public static void a(Context paramContext, String paramString1, int paramInt, Bundle paramBundle, a parama, String paramString2, String paramString3)
  {
    LinkedList localLinkedList = new LinkedList();
    cp localcp = new cp();
    if ((!bi.oW(paramString2)) && (!bi.oW(paramString3)))
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.DeepLinkHelper", "package name = %s, package signature = %s", new Object[] { paramString2, paramString3 });
      localcp.rcN = paramString2;
      localcp.signature = paramString3;
      localLinkedList.add(localcp);
    }
    if (SC(paramString1)) {
      return;
    }
    paramString2 = new aa(paramString1, paramInt, localLinkedList);
    paramContext = new d.2(paramBundle, paramContext, paramInt, paramString1, parama);
    au.DF().a(1200, paramContext);
    au.DF().a(paramString2, 0);
  }
  
  public static void a(Context paramContext, String paramString, int paramInt, a parama)
  {
    a(paramContext, paramString, paramInt, null, parama, null, null);
  }
  
  public static void a(Context paramContext, String paramString1, int paramInt, a parama, String paramString2, String paramString3)
  {
    a(paramContext, paramString1, paramInt, null, parama, paramString2, paramString3);
  }
  
  public static void a(Context paramContext, String paramString1, String paramString2, int paramInt, String paramString3, a parama)
  {
    if (bi.oW(paramString1)) {
      paramString1 = paramString3;
    }
    while (SC(paramString1)) {
      return;
    }
    paramString3 = new com.tencent.mm.modelsimple.h(paramString1, paramString2, paramInt, (int)System.currentTimeMillis(), new byte[0]);
    paramContext = new d.1(paramContext, paramInt, paramString2, paramString1, parama);
    au.DF().a(233, paramContext);
    au.DF().a(paramString3, 0);
  }
  
  public static boolean a(Context paramContext, int paramInt, byte[] paramArrayOfByte, String paramString)
  {
    return a(paramContext, paramString, 0, null, paramInt, paramArrayOfByte, null);
  }
  
  private static boolean a(Context paramContext, String paramString1, int paramInt1, Bundle paramBundle, int paramInt2, byte[] paramArrayOfByte, String paramString2)
  {
    Object localObject = SE(paramString1);
    if (bi.oW((String)localObject)) {
      return false;
    }
    long l;
    String str1;
    if (qyb.containsKey(localObject))
    {
      l = ((Long)qyb.get(localObject)).longValue();
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.DeepLinkHelper", "gotoUri, deepLinkMap contains uri, result = %d", new Object[] { Long.valueOf(l) });
      str1 = null;
      localObject = new Intent();
      ((Intent)localObject).setFlags(268435456);
      if (l == 0L)
      {
        paramBundle = "com.tencent.mm.ui.LauncherUI";
        paramString2 = (String)localObject;
        if (bi.oW(paramBundle)) {
          break label3157;
        }
        paramString2.setClassName(ad.getContext(), paramBundle);
        if (paramContext == null) {
          break label3116;
        }
      }
    }
    for (;;)
    {
      String str2;
      int i;
      try
      {
        paramContext.startActivity(paramString2);
        return true;
        if (l == 1L)
        {
          paramBundle = "com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2UI";
          com.tencent.mm.plugin.report.service.h.mEJ.h(12065, new Object[] { Integer.valueOf(7) });
          paramString2 = (String)localObject;
          break;
        }
        if (l == 2L)
        {
          ((Intent)localObject).putExtra("from_deeplink", true);
          ((Intent)localObject).putExtra("game_report_from_scene", 6);
          paramBundle = "com.tencent.mm.plugin.game.ui.GameCenterUI";
          paramString2 = (String)localObject;
          break;
        }
        if (l == 4L)
        {
          if ((com.tencent.mm.model.q.GQ() & 0x8000) == 0)
          {
            paramInt1 = 1;
            paramBundle = str1;
            paramString2 = (String)localObject;
            if (paramInt1 == 0) {
              break;
            }
            paramBundle = "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI";
            ((Intent)localObject).putExtra("sns_timeline_NeedFirstLoadint", true);
            paramString2 = (String)localObject;
            break;
          }
          paramInt1 = 0;
          continue;
        }
        if (l == 8L)
        {
          paramBundle = "com.tencent.mm.plugin.subapp.ui.pluginapp.AddMoreFriendsUI";
          paramString2 = (String)localObject;
          break;
        }
        if (l == 16L)
        {
          paramString1 = new hn();
          com.tencent.mm.sdk.b.a.sFg.m(paramString1);
          paramString1 = paramString1.bQT.url;
          paramBundle = str1;
          paramString2 = (String)localObject;
          if (bi.oW(paramString1)) {
            break;
          }
          ((Intent)localObject).putExtra("rawUrl", paramString1);
          ((Intent)localObject).putExtra("useJs", true);
          ((Intent)localObject).putExtra("vertical_scroll", true);
          ((Intent)localObject).putExtra("geta8key_session_id", paramInt2);
          ((Intent)localObject).putExtra("geta8key_cookie", paramArrayOfByte);
          paramBundle = "com.tencent.mm.plugin.webview.ui.tools.WebViewUI";
          paramString2 = (String)localObject;
          break;
        }
        if (l == 32L)
        {
          ((Intent)localObject).putExtra("titile", ad.getContext().getString(R.l.address_title_launch_chatting));
          ((Intent)localObject).putExtra("list_type", 0);
          ((Intent)localObject).putExtra("list_attr", com.tencent.mm.ui.contact.s.s(new int[] { com.tencent.mm.ui.contact.s.ukG, 256, 512 }));
          paramBundle = "com.tencent.mm.ui.contact.SelectContactUI";
          paramString2 = (String)localObject;
          break;
        }
        if (l == 64L)
        {
          paramBundle = "com.tencent.mm.plugin.scanner.ui.BaseScanUI";
          ((Intent)localObject).putExtra("animation_pop_in", true);
          paramString2 = (String)localObject;
          break;
        }
        if (l == 128L)
        {
          paramBundle = "com.tencent.mm.plugin.setting.ui.setting.SettingsPersonalInfoUI";
          paramString2 = (String)localObject;
          break;
        }
        if (l == 256L)
        {
          paramBundle = "com.tencent.mm.plugin.setting.ui.setting.SettingsUI";
          paramString2 = (String)localObject;
          break;
        }
        if (l == 512L)
        {
          paramBundle = "com.tencent.mm.plugin.setting.ui.setting.SettingsAboutSystemUI";
          paramString2 = (String)localObject;
          break;
        }
        if (l == 1024L)
        {
          S(ad.getContext(), paramInt2);
          paramBundle = str1;
          paramString2 = (String)localObject;
          break;
        }
        if (l == 2048L)
        {
          paramBundle = "com.tencent.mm.plugin.setting.ui.setting.SettingsNotificationUI";
          paramString2 = (String)localObject;
          break;
        }
        if (l == 4096L)
        {
          ((Intent)localObject).putExtra("title", ad.getContext().getResources().getString(R.l.privacy_tip));
          ((Intent)localObject).putExtra("rawUrl", ad.getContext().getResources().getString(R.l.url_agreement));
          ((Intent)localObject).putExtra("showShare", false);
          ((Intent)localObject).putExtra("geta8key_session_id", paramInt2);
          ((Intent)localObject).putExtra("geta8key_cookie", paramArrayOfByte);
          paramBundle = "com.tencent.mm.plugin.webview.ui.tools.WebViewUI";
          paramString2 = (String)localObject;
          break;
        }
        if (l == 8192L)
        {
          paramBundle = "com.tencent.mm.plugin.setting.ui.setting.SettingsChattingUI";
          paramString2 = (String)localObject;
          break;
        }
        if (l == 16384L)
        {
          paramBundle = "com.tencent.mm.plugin.setting.ui.setting.SettingsPluginsUI";
          paramString2 = (String)localObject;
          break;
        }
        if (l == 32768L)
        {
          paramBundle = "com.tencent.mm.plugin.clean.ui.CleanUI";
          paramString2 = (String)localObject;
          break;
        }
        if (l == 65536L) {
          try
          {
            paramInt1 = paramString1.indexOf("?");
            if (paramInt1 <= 0) {
              break label4253;
            }
            paramString1 = paramString1.substring(paramInt1 + 1);
            g.Eg();
            paramInt1 = com.tencent.mm.kernel.a.Df();
            paramBundle = URLEncoder.encode(com.tencent.mm.protocal.d.DEVICE_NAME, "utf-8");
            paramString2 = URLEncoder.encode(bi.ciX(), "utf-8");
            str2 = URLEncoder.encode(com.tencent.mm.compatible.e.q.zy(), "utf-8");
            String str3 = URLEncoder.encode(com.tencent.mm.protocal.d.qVH, "utf-8");
            String str4 = URLEncoder.encode(com.tencent.mm.protocal.d.qVI, "utf-8");
            String str5 = URLEncoder.encode(com.tencent.mm.protocal.d.qVJ, "utf-8");
            String str6 = URLEncoder.encode(au.DA(), "utf-8");
            String str7 = URLEncoder.encode(bi.fT(ad.getContext()), "utf-8");
            paramBundle = new StringBuilder("&uin=").append(paramInt1).append("&deviceName=").append(paramBundle).append("&timeZone=").append(paramString2).append("&imei=").append(str2).append("&deviceBrand=").append(str3).append("&deviceModel=").append(str4).append("&ostype=").append(str5).append("&clientSeqID=").append(str6).append("&signature=").append(str7).append("&scene=");
            if (bi.oW(paramString1))
            {
              paramInt1 = 0;
              paramBundle = paramInt1;
              paramString1 = "https://support.weixin.qq.com/cgi-bin/mmsupport-bin/readtemplate?t=feedback/index" + "&version=" + com.tencent.mm.protocal.d.qVN + "&lang=" + w.fD(ad.getContext()) + "&" + bi.oV(paramString1) + paramBundle;
              ((Intent)localObject).putExtra("showShare", false);
              ((Intent)localObject).putExtra("rawUrl", paramString1);
              ((Intent)localObject).putExtra("neverGetA8Key", true);
              ((Intent)localObject).putExtra("geta8key_session_id", paramInt2);
              ((Intent)localObject).putExtra("geta8key_cookie", paramArrayOfByte);
              ((Intent)localObject).putExtra("hardcode_jspermission", JsapiPermissionWrapper.qWa);
              ((Intent)localObject).putExtra("hardcode_general_ctrl", GeneralControlWrapper.qVX);
              paramBundle = "com.tencent.mm.plugin.webview.ui.tools.WebViewUI";
              paramString2 = (String)localObject;
              break;
            }
            paramInt1 = 1;
            continue;
          }
          catch (UnsupportedEncodingException paramString1)
          {
            com.tencent.mm.sdk.platformtools.x.e("MicroMsg.DeepLinkHelper", "[oneliang]UnsupportedEncodingException:%s", new Object[] { paramString1.getMessage() });
            paramBundle = str1;
            paramString2 = (String)localObject;
          }
        }
        if (l == 131072L)
        {
          g.Eg();
          paramInt1 = com.tencent.mm.kernel.a.Df();
          au.HU();
          i = bi.f((Integer)c.DT().get(12304, null));
          paramString1 = ad.getContext().getString(R.l.settings_system_notice_url, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(i) });
          ((Intent)localObject).putExtra("showShare", false);
          ((Intent)localObject).putExtra("rawUrl", paramString1);
          ((Intent)localObject).putExtra("geta8key_session_id", paramInt2);
          ((Intent)localObject).putExtra("geta8key_cookie", paramArrayOfByte);
          paramBundle = "com.tencent.mm.plugin.webview.ui.tools.WebViewUI";
          paramString2 = (String)localObject;
          break;
        }
        if (l == 262144L)
        {
          paramBundle = "com.tencent.mm.plugin.subapp.ui.friend.FMessageConversationUI";
          paramString2 = (String)localObject;
          break;
        }
        if (l == 524288L)
        {
          paramBundle = "com.tencent.mm.ui.contact.ChatroomContactUI";
          paramString2 = (String)localObject;
          break;
        }
        if (l == 1048576L)
        {
          paramBundle = "com.tencent.mm.plugin.label.ui.ContactLabelManagerUI";
          paramString2 = (String)localObject;
          break;
        }
        if (l == 2097152L)
        {
          paramBundle = "com.tencent.mm.plugin.brandservice.ui.BrandServiceIndexUI";
          paramString2 = (String)localObject;
          break;
        }
        if (l == 268435456L)
        {
          ((Intent)localObject).putExtra("IPCallAddressUI_KFrom", 1);
          com.tencent.mm.bg.d.b(ad.getContext(), "ipcall", ".ui.IPCallAddressUI", (Intent)localObject);
          return true;
        }
        if (l == 4194304L)
        {
          au.HU();
          ((Intent)localObject).putExtra("sns_userName", (String)c.DT().get(2, null));
          ((Intent)localObject).addFlags(67108864);
          au.HU();
          paramInt1 = bi.a((Integer)c.DT().get(68389, null), 0);
          au.HU();
          c.DT().set(68389, Integer.valueOf(paramInt1 + 1));
          paramBundle = "com.tencent.mm.plugin.sns.ui.SnsUserUI";
          paramString2 = (String)localObject;
          break;
        }
        if (l == 8388608L)
        {
          paramBundle = "com.tencent.mm.plugin.fav.ui.FavoriteIndexUI";
          paramString2 = (String)localObject;
          break;
        }
        if (l == 16777216L)
        {
          paramBundle = "com.tencent.mm.plugin.setting.ui.setting.SettingsPrivacyUI";
          paramString2 = (String)localObject;
          break;
        }
        if (l == 33554432L)
        {
          paramBundle = "com.tencent.mm.plugin.setting.ui.setting.SettingsAccountInfoUI";
          paramString2 = (String)localObject;
          break;
        }
        if (l == 67108864L)
        {
          paramBundle = "com.tencent.mm.plugin.mall.ui.MallIndexUI";
          paramString2 = (String)localObject;
          break;
        }
        if (l == 134217728L)
        {
          if ((paramContext != null) && (!bi.oW(paramString1)) && (paramString1.startsWith("weixin://dl/businessPay")))
          {
            paramBundle = Uri.parse(paramString1);
            if (paramBundle == null) {
              continue;
            }
            paramString1 = paramBundle.getQueryParameter("reqkey");
            paramArrayOfByte = paramBundle.getQueryParameter("appid");
            if (!bi.oW(paramString1))
            {
              paramBundle = new PayInfo();
              paramBundle.bOd = paramString1;
              paramBundle.appId = paramArrayOfByte;
              paramBundle.bVY = 36;
              paramBundle.jNf = false;
              paramString2 = new Intent();
              paramString2.putExtra("key_pay_info", paramBundle);
              if (com.tencent.mm.model.q.GS())
              {
                com.tencent.mm.bg.d.b(paramContext, "wallet_payu", ".pay.ui.WalletPayUPayUI", paramString2, 1);
                paramBundle = str1;
                break;
              }
              com.tencent.mm.bg.d.b(paramContext, "wallet", ".pay.ui.WalletPayUI", paramString2, 1);
              paramBundle = str1;
              break;
            }
            com.tencent.mm.sdk.platformtools.x.w("MicroMsg.DeepLinkHelper", "reqkey null");
          }
          paramString2 = null;
          paramBundle = str1;
          break;
          com.tencent.mm.sdk.platformtools.x.w("MicroMsg.DeepLinkHelper", "payUri null");
          continue;
        }
        if (l == 1073741824L)
        {
          paramBundle = "com.tencent.mm.plugin.safedevice.ui.MySafeDeviceListUI";
          paramString2 = (String)localObject;
          break;
        }
        if (l == 2147483648L)
        {
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.DeepLinkHelper", "enter to cardhome");
          paramBundle = "com.tencent.mm.plugin.card.ui.CardHomePageUI";
          paramString2 = (String)localObject;
          break;
        }
        if (l == 4294967296L)
        {
          ((Intent)localObject).putExtra("filter_type", y.jdMethod_if(ad.getContext().getString(R.l.group_blacklist)).getType());
          ((Intent)localObject).putExtra("titile", ad.getContext().getString(R.l.settings_private_blacklist));
          ((Intent)localObject).putExtra("list_attr", 32768);
          paramBundle = "com.tencent.mm.ui.contact.SelectSpecialContactUI";
          paramString2 = (String)localObject;
          break;
        }
        if (l == 8589934592L)
        {
          paramBundle = "com.tencent.mm.plugin.setting.ui.setting.SettingsFontUI";
          paramString2 = (String)localObject;
          break;
        }
        if (l == 17179869184L)
        {
          paramBundle = "com.tencent.mm.plugin.setting.ui.setting.SettingsAboutSystemUI";
          paramString2 = (String)localObject;
          break;
        }
        if (l == 34359738368L)
        {
          paramBundle = "com.tencent.mm.plugin.setting.ui.setting.SettingsLanguageUI";
          paramString2 = (String)localObject;
          break;
        }
        if (l == 68719476736L)
        {
          paramBundle = "com.tencent.mm.plugin.backup.backupmoveui.BackupUI";
          paramString2 = (String)localObject;
          break;
        }
        if (l == 137438953472L)
        {
          ((Intent)localObject).setClassName(ad.getContext(), "com.tencent.mm.ui.bindqq.BindQQUI");
          MMWizardActivity.D(paramContext, (Intent)localObject);
          return true;
        }
        if (l == 274877906944L)
        {
          ((Intent)localObject).setClassName(ad.getContext(), "com.tencent.mm.ui.bindmobile.BindMContactIntroUI");
          MMWizardActivity.D(paramContext, (Intent)localObject);
          return true;
        }
        if (l == 549755813888L)
        {
          paramBundle = "com.tencent.mm.plugin.setting.ui.setting.SettingsModifyEmailAddrUI";
          paramString2 = (String)localObject;
          break;
        }
        if (l == 1099511627776L)
        {
          com.tencent.mm.bg.d.b(ad.getContext(), "profile", ".ui.ContactInfoUI", ((Intent)localObject).putExtra("Contact_User", "qqsync"));
          return true;
        }
        if (l == 2199023255552L)
        {
          paramBundle = "com.tencent.mm.plugin.masssend.ui.MassSendHistoryUI";
          paramString2 = (String)localObject;
          break;
        }
        if (l == 4398046511104L)
        {
          paramBundle = "com.tencent.mm.plugin.setting.ui.setting.SettingsModifyNameUI";
          paramString2 = (String)localObject;
          break;
        }
        if (l == 8796093022208L)
        {
          paramBundle = "com.tencent.mm.plugin.setting.ui.setting.SelfQRCodeUI";
          paramString2 = (String)localObject;
          break;
        }
        if (l == 17592186044416L)
        {
          ((Intent)localObject).putExtra("launch_from_webview", false);
          com.tencent.mm.bg.d.c(ad.getContext(), "address", ".ui.WalletSelectAddrUI", (Intent)localObject);
          return true;
        }
        if (l == 35184372088832L)
        {
          ((Intent)localObject).putExtra("k_sns_tag_id", 4L);
          ((Intent)localObject).putExtra("k_sns_from_settings_about_sns", 1);
          com.tencent.mm.bg.d.b(ad.getContext(), "sns", ".ui.SnsBlackDetailUI", (Intent)localObject);
          return true;
        }
        if (l == 70368744177664L)
        {
          ((Intent)localObject).putExtra("k_sns_tag_id", 5L);
          ((Intent)localObject).putExtra("k_sns_from_settings_about_sns", 2);
          ((Intent)localObject).putExtra("k_tag_detail_sns_block_scene", 8);
          com.tencent.mm.bg.d.b(ad.getContext(), "sns", ".ui.SnsTagDetailUI", (Intent)localObject);
          paramBundle = str1;
          paramString2 = (String)localObject;
          break;
        }
        if (l == 140737488355328L)
        {
          paramBundle = "com.tencent.mm.plugin.emoji.ui.EmojiMineUI";
          paramString2 = (String)localObject;
          break;
        }
        if (l == 281474976710656L)
        {
          paramContext = new bu();
          paramContext.bJj.bJl = "//uplog";
          paramContext.bJj.context = ad.getContext();
          com.tencent.mm.sdk.b.a.sFg.m(paramContext);
          return true;
        }
        if (l == 562949953421312L)
        {
          ((Intent)localObject).putExtra("IPCallAddressUI_KFrom", 1);
          com.tencent.mm.bg.d.b(ad.getContext(), "ipcall", ".ui.IPCallAddressUI", (Intent)localObject);
          com.tencent.mm.bg.d.b(ad.getContext(), "ipcall", ".ui.IPCallShareCouponUI", (Intent)localObject);
          return true;
        }
        if (l == 18014398509481984L)
        {
          ((Intent)localObject).putExtra("IPCallAddressUI_KFrom", 1);
          com.tencent.mm.bg.d.b(ad.getContext(), "ipcall", ".ui.IPCallAddressUI", (Intent)localObject);
          com.tencent.mm.bg.d.b(ad.getContext(), "ipcall", ".ui.IPCallShareCouponUI", (Intent)localObject);
          com.tencent.mm.bg.d.b(ad.getContext(), "ipcall", ".ui.IPCallShareCouponCardUI", (Intent)localObject);
          paramBundle = str1;
          paramString2 = (String)localObject;
          break;
        }
        if (l == 576460752303423488L)
        {
          ((Intent)localObject).putExtra("IPCallAddressUI_KFrom", 1);
          ((Intent)localObject).setClassName(ad.getContext(), "com.tencent.mm.plugin.sight.draft.ui.SightDraftUI");
          ad.getContext().startActivity((Intent)localObject);
          paramBundle = str1;
          paramString2 = (String)localObject;
          break;
        }
        if (l == 1125899906842624L)
        {
          paramBundle = "com.tencent.mm.plugin.setting.ui.setting.SettingsAboutMicroMsgUI";
          paramString2 = (String)localObject;
          break;
        }
        if (l == 4503599627370496L)
        {
          ((Intent)localObject).putExtra("emoji_tab", 1);
          paramBundle = "com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2UI";
          com.tencent.mm.plugin.report.service.h.mEJ.h(12065, new Object[] { Integer.valueOf(7) });
          paramString2 = (String)localObject;
          break;
        }
        if (l == 9007199254740992L)
        {
          paramBundle = "com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2SingleProductUI";
          paramString2 = (String)localObject;
          break;
        }
        if (l == 576460752303423489L)
        {
          paramArrayOfByte = Uri.parse(paramString1);
          paramString1 = paramArrayOfByte.getQueryParameter("appid");
          paramBundle = paramArrayOfByte.getQueryParameter("userName");
          paramArrayOfByte = paramArrayOfByte.getQueryParameter("path");
          paramInt2 = 0;
          localObject = u.Hx().v("key_data_center_session_id", false);
          if (localObject != null) {
            paramInt2 = ((Integer)((u.b)localObject).get("key_launch_miniprogram_type", Integer.valueOf(0))).intValue();
          }
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.DeepLinkHelper", "appid = %s, userName = %s, path = %s, translateLinkScene = %d, type = %d", new Object[] { paramString1, paramBundle, paramArrayOfByte, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
          u.Hx().ib("key_data_center_session_id");
          localObject = new AppBrandStatObject();
          ((AppBrandStatObject)localObject).bGG = URLEncoder.encode(paramString2);
          if (paramInt1 == 2)
          {
            ((AppBrandStatObject)localObject).scene = 1065;
            ((com.tencent.mm.plugin.appbrand.n.d)g.l(com.tencent.mm.plugin.appbrand.n.d.class)).a(paramContext, paramBundle, null, paramInt2, 0, paramArrayOfByte, (AppBrandStatObject)localObject);
            return true;
          }
          if (paramInt1 == 1)
          {
            ((AppBrandStatObject)localObject).scene = 1069;
            ((AppBrandStatObject)localObject).bGG = paramString1;
            ((com.tencent.mm.plugin.appbrand.n.d)g.l(com.tencent.mm.plugin.appbrand.n.d.class)).a(paramContext, paramBundle, null, paramInt2, 0, paramArrayOfByte, (AppBrandStatObject)localObject, paramString1);
            continue;
          }
          if (paramInt1 == 6)
          {
            ((AppBrandStatObject)localObject).scene = 1007;
            ((com.tencent.mm.plugin.appbrand.n.d)g.l(com.tencent.mm.plugin.appbrand.n.d.class)).a(paramContext, paramBundle, null, paramInt2, 0, paramArrayOfByte, (AppBrandStatObject)localObject);
            continue;
          }
          if (paramInt1 == 7)
          {
            ((AppBrandStatObject)localObject).scene = 1008;
            ((com.tencent.mm.plugin.appbrand.n.d)g.l(com.tencent.mm.plugin.appbrand.n.d.class)).a(paramContext, paramBundle, null, paramInt2, 0, paramArrayOfByte, (AppBrandStatObject)localObject);
            continue;
          }
          ((AppBrandStatObject)localObject).scene = 1000;
          ((com.tencent.mm.plugin.appbrand.n.d)g.l(com.tencent.mm.plugin.appbrand.n.d.class)).a(paramContext, paramBundle, null, 0, 0, paramArrayOfByte, (AppBrandStatObject)localObject);
          continue;
        }
        paramBundle = str1;
        paramString2 = (String)localObject;
        if (l != 576460752303423490L) {
          break;
        }
        paramString1 = Uri.parse(paramString1).getQueryParameter("appid");
        paramBundle = new Intent();
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.WalletManager", "start offline from sdk: %s", new Object[] { paramString1 });
        paramBundle.putExtra("key_from_scene", 8);
        paramBundle.putExtra("key_appid", paramString1);
        com.tencent.mm.bg.d.b(paramContext, "offline", ".ui.WalletOfflineEntranceUI", paramBundle, 0);
        paramBundle = str1;
        paramString2 = (String)localObject;
        break;
        label3116:
        ad.getContext().startActivity(paramString2);
        b.E(ad.getContext(), paramString2);
        continue;
      }
      catch (Exception paramContext)
      {
        com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.DeepLinkHelper", paramContext, "", new Object[] { "" });
        continue;
      }
      label3157:
      return false;
      if (((String)localObject).startsWith("weixin://dl/businessTempSession/"))
      {
        paramString2 = new Intent();
        paramString2.setFlags(268435456);
        localObject = Uri.parse(paramString1);
        if (localObject == null)
        {
          com.tencent.mm.sdk.platformtools.x.e("MicroMsg.DeepLinkHelper", "tempsession uri is null");
          return false;
        }
        str1 = ((Uri)localObject).getQueryParameter("sessionFrom");
        str2 = ((Uri)localObject).getQueryParameter("showtype");
        paramArrayOfByte = ((Uri)localObject).getQueryParameter("username");
        paramBundle = paramArrayOfByte;
        if (bi.oW(paramArrayOfByte)) {
          paramBundle = ((Uri)localObject).getQueryParameter("userName");
        }
        if (bi.oW(paramBundle))
        {
          com.tencent.mm.sdk.platformtools.x.e("MicroMsg.DeepLinkHelper", "tempsession user is null");
          return false;
        }
        i = bi.getInt(bi.oV(((Uri)localObject).getQueryParameter("scene")), 0);
        paramInt2 = paramInt1;
        if (i != 0)
        {
          paramInt2 = paramInt1;
          if (paramInt1 == 4)
          {
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.DeepLinkHelper", "Jsapi assign scene to " + i);
            paramInt2 = i;
          }
        }
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.DeepLinkHelper", "tempsession jump, %s, %s, %s, %s, %s.", new Object[] { paramBundle, str1, Integer.valueOf(paramInt2), paramString1, str2 });
        paramString2.setClassName(ad.getContext(), "com.tencent.mm.ui.chatting.ChattingUI");
        paramString2.putExtra("Chat_User", paramBundle);
        paramString2.putExtra("finish_direct", true);
        paramString2.putExtra("key_is_temp_session", true);
        paramString2.putExtra("key_temp_session_from", str1);
        paramString2.putExtra("key_temp_session_scene", paramInt2);
        paramString2.putExtra("key_temp_session_show_type", bi.getInt(str2, 0));
        au.HU();
        paramString1 = c.FR().Yg(paramBundle);
        if ((paramString1 == null) || ((int)paramString1.dhP <= 0)) {
          am.a.dBr.a(paramBundle, "", new d.3(paramString2, paramContext));
        }
        for (;;)
        {
          return true;
          paramContext.startActivity(paramString2);
        }
      }
      if ((((String)localObject).startsWith("weixin://dl/businessGame/detail/")) || (((String)localObject).startsWith("weixin://dl/businessGame/detail")))
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.DeepLinkHelper", "gotoUri, uri startsWith GAME_DETAIL");
        paramArrayOfByte = Uri.parse(paramString1);
        paramString1 = null;
        paramBundle = new Intent();
        if (paramArrayOfByte != null)
        {
          paramArrayOfByte = paramArrayOfByte.getQueryParameter("appid");
          paramString1 = "com.tencent.mm.plugin.game.ui.GameDetailUI";
          paramBundle.putExtra("game_app_id", paramArrayOfByte);
          paramBundle.putExtra("game_report_from_scene", 6);
        }
        if (!bi.oW(paramString1))
        {
          paramBundle.setClassName(ad.getContext(), paramString1);
          if (paramContext != null) {}
          try
          {
            paramContext.startActivity(paramBundle);
          }
          catch (Exception paramContext)
          {
            com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.DeepLinkHelper", paramContext, "", new Object[] { "" });
          }
          ad.getContext().startActivity(paramBundle);
          b.E(ad.getContext(), paramBundle);
          break label4259;
        }
        return false;
      }
      if ((((String)localObject).startsWith("weixin://dl/businessGame/library/")) || (((String)localObject).startsWith("weixin://dl/businessGame/library")))
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.DeepLinkHelper", "gotoUri, uri startsWith GAME_LIBRARY");
        paramString1 = new Intent();
        if (!bi.oW("com.tencent.mm.plugin.game.ui.GameLibraryUI"))
        {
          paramString1.putExtra("game_report_from_scene", 6);
          paramString1.setClassName(ad.getContext(), "com.tencent.mm.plugin.game.ui.GameLibraryUI");
          if (paramContext != null) {}
          try
          {
            paramContext.startActivity(paramString1);
          }
          catch (Exception paramContext)
          {
            com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.DeepLinkHelper", paramContext, "", new Object[] { "" });
          }
          ad.getContext().startActivity(paramString1);
          b.E(ad.getContext(), paramString1);
          break label4261;
        }
        return false;
      }
      if ((((String)localObject).startsWith("weixin://dl/businessWebview/link/")) || (((String)localObject).startsWith("weixin://dl/businessWebview/link")))
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.DeepLinkHelper", "gotoUri, uri startsWith H5_LINK");
        paramString2 = Uri.parse(paramString1);
        localObject = new Intent();
        paramString1 = null;
        int j;
        if (paramString2 != null)
        {
          paramString1 = paramString2.getQueryParameter("url");
          i = bi.getInt(paramString2.getQueryParameter("type"), 0);
          str1 = bi.oV(paramString2.getQueryParameter("appid"));
          j = bi.getInt(bi.oV(paramString2.getQueryParameter("outer")), 0);
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.DeepLinkHelper", "gotoUri, rawUrl = %s, appId:%s, translateLinkScene: %s, outer:%d", new Object[] { paramString1, str1, Integer.valueOf(paramInt1), Integer.valueOf(j) });
          paramString2 = "com.tencent.mm.plugin.webview.ui.tools.WebViewUI";
          ((Intent)localObject).putExtra("rawUrl", paramString1);
          ((Intent)localObject).putExtra("geta8key_session_id", paramInt2);
          ((Intent)localObject).putExtra("geta8key_cookie", paramArrayOfByte);
          if (paramInt1 != 1) {
            break label4156;
          }
          if (j == 1)
          {
            ((Intent)localObject).putExtra("geta8key_open_webview_appid", str1);
            ((Intent)localObject).putExtra("geta8key_scene", 53);
          }
          ((Intent)localObject).putExtra("show_openapp_dialog", false);
          ((Intent)localObject).putExtra("pay_channel", 40);
          i.Cx(39);
        }
        for (;;)
        {
          if (i == 5)
          {
            ((Intent)localObject).putExtra("webview_invoke_launch_app_when_back", true);
            ((Intent)localObject).putExtra("webview_invoke_launch_app_ext_info_when_back", String.format("%s://opentypewebview?wx_internal_resptype=%d&ret=%d", new Object[] { str1, Integer.valueOf(i), Integer.valueOf(-2) }));
            ((Intent)localObject).putExtra("KAppId", str1);
          }
          ((Intent)localObject).putExtra("transaction_for_openapi_openwebview", qya);
          paramString1 = paramString2;
          if (paramBundle != null)
          {
            ((Intent)localObject).putExtras(paramBundle);
            paramString1 = paramString2;
          }
          if (!bi.oW(paramString1))
          {
            ((Intent)localObject).setClassName(ad.getContext(), paramString1);
            if (paramContext != null) {}
            try
            {
              paramContext.startActivity((Intent)localObject);
              for (;;)
              {
                return true;
                label4156:
                if (paramInt1 != 2) {
                  break;
                }
                if (j == 1)
                {
                  ((Intent)localObject).putExtra("geta8key_open_webview_appid", str1);
                  ((Intent)localObject).putExtra("geta8key_scene", 52);
                }
                ((Intent)localObject).putExtra("pay_channel", 39);
                i.Cx(39);
                break;
                ad.getContext().startActivity((Intent)localObject);
                b.E(ad.getContext(), (Intent)localObject);
              }
            }
            catch (Exception paramContext)
            {
              for (;;)
              {
                com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.DeepLinkHelper", paramContext, "", new Object[] { "" });
              }
            }
          }
        }
        return false;
      }
      return false;
      label4253:
      paramString1 = "";
    }
    label4259:
    return true;
    label4261:
    return true;
  }
  
  public static boolean a(Context paramContext, String paramString1, int paramInt, Bundle paramBundle, String paramString2)
  {
    return a(paramContext, paramString1, paramInt, paramBundle, (int)System.currentTimeMillis(), new byte[0], paramString2);
  }
  
  public static boolean al(String paramString, long paramLong)
  {
    if (!bi.oW(paramString))
    {
      paramString = SE(paramString);
      if (!qyb.containsKey(paramString)) {
        break label66;
      }
    }
    label66:
    for (long l = ((Long)qyb.get(paramString)).longValue();; l = -1L) {
      return (l != -1L) && ((l == 0L) || ((l & paramLong) == l));
    }
  }
  
  public static void bd(Context paramContext, String paramString)
  {
    if (bi.oW(paramString))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.DeepLinkHelper", "cpan gotoLoginUI url is null. finish");
      return;
    }
    Object localObject;
    if (paramString.startsWith("weixin://dl/login/phone_view"))
    {
      localObject = Uri.parse(paramString);
      paramString = ((Uri)localObject).getQueryParameter("cc");
      localObject = ((Uri)localObject).getQueryParameter("num");
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.DeepLinkHelper", "cpan gotoLoginUI cc:%s num:%s", new Object[] { paramString, localObject });
      Intent localIntent = new Intent(paramContext, MobileInputUI.class);
      localIntent.putExtra("couttry_code", paramString);
      localIntent.putExtra("input_mobile_number", (String)localObject);
      localIntent.putExtra("from_deep_link", true);
      localIntent.putExtra("mobile_input_purpose", 1);
      localIntent.addFlags(268435456);
      paramContext.startActivity(localIntent);
      return;
    }
    if (paramString.startsWith("weixin://dl/login/common_view"))
    {
      paramString = Uri.parse(paramString).getQueryParameter("username");
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.DeepLinkHelper", "cpan gotoLoginUI  username:%s", new Object[] { paramString });
      localObject = new Intent(paramContext, LoginUI.class);
      ((Intent)localObject).putExtra("login_username", paramString);
      ((Intent)localObject).putExtra("from_deep_link", true);
      ((Intent)localObject).addFlags(268435456);
      paramContext.startActivity((Intent)localObject);
      return;
    }
    com.tencent.mm.sdk.platformtools.x.e("MicroMsg.DeepLinkHelper", "cpan gotoLoginUI url not Correct:%s", new Object[] { paramString });
  }
  
  public static void eJ(Context paramContext)
  {
    S(paramContext, (int)System.currentTimeMillis());
  }
  
  public static boolean k(Uri paramUri)
  {
    if (paramUri == null) {
      return false;
    }
    if (!bi.oW(paramUri.getQueryParameter("ticket"))) {
      return true;
    }
    return l(paramUri);
  }
  
  public static boolean l(Uri paramUri)
  {
    if (paramUri == null) {}
    while ((!paramUri.toString().startsWith("weixin://dl/business/tempsession/")) && (!paramUri.toString().startsWith("weixin://dl/businessTempSession/"))) {
      return false;
    }
    return true;
  }
  
  public static void x(Context paramContext, String paramString1, String paramString2)
  {
    if (SC(paramString2)) {
      return;
    }
    p localp = com.tencent.mm.ui.base.h.a(paramContext, "", true, null);
    int j = 6;
    int i = j;
    if (!bi.oW(paramString1))
    {
      if (!com.tencent.mm.model.s.fq(paramString1)) {
        break label59;
      }
      i = 7;
    }
    for (;;)
    {
      a(paramContext, paramString2, i, new d.4(localp, paramContext));
      return;
      label59:
      i = j;
      if (com.tencent.mm.model.s.hf(paramString1)) {
        i = 9;
      }
    }
  }
  
  public static abstract interface a
  {
    public abstract void a(int paramInt1, int paramInt2, String paramString, l paraml, boolean paramBoolean);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/pluginsdk/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */