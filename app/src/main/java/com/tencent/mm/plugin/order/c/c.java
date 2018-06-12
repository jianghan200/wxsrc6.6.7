package com.tencent.mm.plugin.order.c;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.tencent.mm.bg.d;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.ui.e;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class c
{
  private static HashMap<String, String> Jy(String paramString)
  {
    if (paramString == null) {}
    do
    {
      do
      {
        do
        {
          return null;
          i = paramString.indexOf("action");
        } while (i <= 0);
        paramString = paramString.substring(i, paramString.length());
      } while (TextUtils.isEmpty(paramString));
      paramString = paramString.split("&");
    } while (paramString == null);
    HashMap localHashMap = new HashMap();
    int i = 0;
    while (i < paramString.length)
    {
      String[] arrayOfString = paramString[i].split("=");
      if ((arrayOfString != null) && (arrayOfString.length == 2)) {
        localHashMap.put(arrayOfString[0], arrayOfString[1]);
      }
      i += 1;
    }
    return localHashMap;
  }
  
  public static void a(Boolean paramBoolean, String paramString1, String paramString2, String paramString3, String paramString4)
  {
    if (paramBoolean.booleanValue())
    {
      h.mEJ.h(11030, new Object[] { paramString1, "", paramString3, paramString4 });
      return;
    }
    h.mEJ.h(11030, new Object[] { paramString1, paramString2, paramString3, paramString4 });
  }
  
  public static void aC(Context paramContext, String paramString)
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("rawUrl", paramString);
    localIntent.putExtra("showShare", false);
    localIntent.putExtra("pay_channel", 1);
    d.b(paramContext, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", localIntent);
  }
  
  public static boolean aD(Context paramContext, String paramString)
  {
    x.v("MicroMsg.MallUtil", "jumpToUrl:" + paramString);
    Intent localIntent = new Intent();
    HashMap localHashMap = Jy(paramString);
    if ((localHashMap != null) && (!localHashMap.isEmpty()))
    {
      paramString = (String)localHashMap.get("action");
      if ((TextUtils.isEmpty(paramString)) || (!xW(paramString)))
      {
        x.e("MicroMsg.MallUtil", "jumpToUrl illegal action:" + paramString);
        return false;
      }
      switch (Integer.valueOf(paramString).intValue())
      {
      }
    }
    for (;;)
    {
      return true;
      localIntent.putExtra("rawUrl", (String)localHashMap.get("3rdurl"));
      localIntent.putExtra("showShare", false);
      localIntent.putExtra("pay_channel", 1);
      d.b(paramContext, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", localIntent);
      continue;
      e.ab(paramContext, (String)localHashMap.get("username"));
      continue;
      localIntent.putExtra("key_func_id", (String)localHashMap.get("functionid"));
      localIntent.putExtra("key_scene", 1);
      d.b(paramContext, "mall", ".ui.MallIndexUI", localIntent);
      continue;
      localIntent.putExtra("key_product_id", (String)localHashMap.get("productid"));
      localIntent.putExtra("key_product_scene", 5);
      d.b(paramContext, "product", ".ui.MallProductUI", localIntent);
      continue;
      if (TextUtils.isEmpty(paramString)) {
        break;
      }
      aC(paramContext, paramString);
    }
    x.e("MicroMsg.MallUtil", "jumpToUrl illegal url:" + paramString);
    return false;
  }
  
  public static void aE(Context paramContext, String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return;
    }
    Intent localIntent = new Intent();
    localIntent.putExtra("key_product_id", paramString);
    localIntent.putExtra("key_product_scene", 5);
    d.b(paramContext, "product", ".ui.MallProductUI", localIntent);
  }
  
  public static boolean xW(String paramString)
  {
    return Pattern.compile("[0-9]*").matcher(paramString).matches();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/order/c/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */