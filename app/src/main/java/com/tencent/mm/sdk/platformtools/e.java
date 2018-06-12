package com.tencent.mm.sdk.platformtools;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.net.Uri;
import android.os.Build.VERSION;
import java.util.Map;

public final class e
{
  public static int bxk;
  public static String bxl = Build.VERSION.SDK_INT;
  public static int bxm = 0;
  public static int bxq;
  public static int sFA = 0;
  public static String sFB = "market://details?id=" + ad.getPackageName();
  public static boolean sFC = false;
  public static boolean sFD = true;
  public static boolean sFE = false;
  public static boolean sFF = false;
  public static int sFz;
  
  static
  {
    bxk = 0;
    sFz = 0;
    bxq = 0;
  }
  
  public static String aj(Context paramContext, int paramInt)
  {
    return b(paramContext, paramInt, sFC);
  }
  
  public static String b(Context paramContext, int paramInt, boolean paramBoolean)
  {
    int i = paramInt >> 8 & 0xFF;
    if (i == 0) {}
    for (str1 = (paramInt >> 24 & 0xF) + "." + (paramInt >> 16 & 0xFF);; str1 = (paramInt >> 24 & 0xF) + "." + (paramInt >> 16 & 0xFF) + "." + i)
    {
      x.d("MicroMsg.SDK.ChannelUtil", "minminor " + i);
      i = 0xFFFFFFF & paramInt;
      str2 = str1;
      paramInt = i;
      if (paramContext != null) {
        paramInt = i;
      }
      try
      {
        paramContext = paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 128);
        str2 = str1;
        paramInt = i;
        if (paramContext != null)
        {
          paramInt = i;
          i = paramContext.versionCode;
          paramInt = i;
          str2 = paramContext.versionName;
          paramInt = i;
        }
      }
      catch (Exception paramContext)
      {
        String[] arrayOfString;
        do
        {
          do
          {
            do
            {
              for (;;)
              {
                x.printErrStackTrace("MicroMsg.SDK.ChannelUtil", paramContext, "", new Object[0]);
                str2 = str1;
              }
              arrayOfString = str2.split("\\.");
              paramContext = str2;
            } while (arrayOfString == null);
            paramContext = str2;
          } while (arrayOfString.length < 4);
          str1 = arrayOfString[0] + "." + arrayOfString[1];
          paramContext = str1;
        } while (arrayOfString[2].trim().equals("0"));
        return str1 + "." + arrayOfString[2];
      }
      if (!paramBoolean) {
        break;
      }
      paramContext = str2 + "_" + paramInt;
      x.d("MicroMsg.SDK.ChannelUtil", "full version: " + paramContext);
      return paramContext;
    }
  }
  
  public static boolean chv()
  {
    return bxk == 1;
  }
  
  public static boolean chw()
  {
    return bxk == 1001;
  }
  
  public static void fq(Context paramContext)
  {
    try
    {
      bxk = Integer.parseInt((String)q.Wi(bi.convertStreamToString(paramContext.getAssets().open("channel.ini"))).get("CHANNEL"));
      return;
    }
    catch (Exception paramContext)
    {
      x.e("MicroMsg.SDK.ChannelUtil", "setup channel id from channel.ini failed");
      x.printErrStackTrace("MicroMsg.SDK.ChannelUtil", paramContext, "", new Object[0]);
    }
  }
  
  public static void fr(Context paramContext)
  {
    try
    {
      paramContext = q.Wi(bi.convertStreamToString(paramContext.getAssets().open("profile.ini")));
      String str = bi.oV((String)paramContext.get("PROFILE_DEVICE_TYPE"));
      bxl = str;
      if (str.length() <= 0) {
        bxl = Build.VERSION.SDK_INT;
      }
      bxm = parseInt((String)paramContext.get("UPDATE_MODE"));
      sFA = parseInt((String)paramContext.get("BUILD_REVISION"));
      sFE = parseBoolean((String)paramContext.get("GPRS_ALERT"));
      bxq = parseInt((String)paramContext.get("AUTO_ADD_ACOUNT"));
      sFF = parseBoolean((String)paramContext.get("NOKIA_AOL"));
      x.w("MicroMsg.SDK.ChannelUtil", "profileDeviceType=" + bxl);
      x.w("MicroMsg.SDK.ChannelUtil", "updateMode=" + bxm);
      x.w("MicroMsg.SDK.ChannelUtil", "shouldShowGprsAlert=" + sFE);
      x.w("MicroMsg.SDK.ChannelUtil", "autoAddAccount=" + bxq);
      x.w("MicroMsg.SDK.ChannelUtil", "isNokiaol=" + sFF);
      paramContext = (String)paramContext.get("MARKET_URL");
      if ((paramContext != null) && (paramContext.trim().length() != 0) && (Uri.parse(paramContext) != null)) {
        sFB = paramContext;
      }
      x.w("MicroMsg.SDK.ChannelUtil", "marketURL=" + sFB);
      return;
    }
    catch (Exception paramContext)
    {
      x.e("MicroMsg.SDK.ChannelUtil", "setup profile from profile.ini failed");
      x.printErrStackTrace("MicroMsg.SDK.ChannelUtil", paramContext, "", new Object[0]);
    }
  }
  
  private static boolean parseBoolean(String paramString)
  {
    try
    {
      boolean bool = Boolean.parseBoolean(paramString);
      return bool;
    }
    catch (Exception paramString)
    {
      x.printErrStackTrace("MicroMsg.SDK.ChannelUtil", paramString, "", new Object[0]);
      x.w("MicroMsg.SDK.ChannelUtil", paramString.getMessage());
    }
    return false;
  }
  
  private static int parseInt(String paramString)
  {
    try
    {
      int i = Integer.parseInt(paramString);
      return i;
    }
    catch (Exception paramString)
    {
      x.w("MicroMsg.SDK.ChannelUtil", paramString.getMessage());
    }
    return 0;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/sdk/platformtools/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */