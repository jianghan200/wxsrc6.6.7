package com.tencent.mm.sdk.platformtools;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import java.util.Locale;

public final class w
{
  public static Locale sGk = ;
  
  public static boolean Wk(String paramString)
  {
    if (bi.oW(paramString)) {}
    while ((!paramString.equalsIgnoreCase("zh_TW")) && (!paramString.equalsIgnoreCase("zh_HK")) && (!paramString.equalsIgnoreCase("zh_CN")) && (!paramString.equalsIgnoreCase("en")) && (!paramString.equalsIgnoreCase("th")) && (!paramString.equals("id")) && (!paramString.equals("vi")) && (!paramString.equalsIgnoreCase("pt")) && (!paramString.equalsIgnoreCase("es")) && (!paramString.equalsIgnoreCase("ru")) && (!paramString.equalsIgnoreCase("ar")) && (!paramString.equalsIgnoreCase("ja")) && (!paramString.equalsIgnoreCase("it")) && (!paramString.equalsIgnoreCase("ko")) && (!paramString.equalsIgnoreCase("ms")) && (!paramString.equalsIgnoreCase("tr")) && (!paramString.equalsIgnoreCase("de")) && (!paramString.equalsIgnoreCase("fr")) && (!paramString.equalsIgnoreCase("my")) && (!paramString.equalsIgnoreCase("lo"))) {
      return false;
    }
    return true;
  }
  
  public static Locale Wl(String paramString)
  {
    if (paramString.equals("zh_TW")) {
      return Locale.TAIWAN;
    }
    if (paramString.equals("zh_HK")) {
      return new Locale("zh", "HK");
    }
    if (paramString.equals("en")) {
      return Locale.ENGLISH;
    }
    if (paramString.equals("zh_CN")) {
      return Locale.CHINA;
    }
    if ((paramString.equalsIgnoreCase("th")) || (paramString.equalsIgnoreCase("id")) || (paramString.equalsIgnoreCase("vi")) || (paramString.equalsIgnoreCase("pt")) || (paramString.equalsIgnoreCase("es")) || (paramString.equalsIgnoreCase("ru")) || (paramString.equalsIgnoreCase("ar")) || (paramString.equalsIgnoreCase("ja")) || (paramString.equalsIgnoreCase("it")) || (paramString.equalsIgnoreCase("ko")) || (paramString.equalsIgnoreCase("ms")) || (paramString.equalsIgnoreCase("tr")) || (paramString.equalsIgnoreCase("de")) || (paramString.equalsIgnoreCase("fr")) || (paramString.equalsIgnoreCase("my")) || (paramString.equalsIgnoreCase("lo"))) {
      return new Locale(paramString);
    }
    if (paramString.equalsIgnoreCase("in_ID")) {
      return new Locale("id");
    }
    x.e("MicroMsg.LocaleUtil", "transLanguageToLocale country = " + paramString);
    return Locale.ENGLISH;
  }
  
  private static String Wm(String paramString)
  {
    String str1 = Locale.getDefault().getLanguage().trim();
    String str2 = str1 + "_" + Locale.getDefault().getCountry().trim();
    if (str1.equals("en")) {
      paramString = str1;
    }
    do
    {
      return paramString;
      if (str2.equals("zh_TW")) {
        return "zh_TW";
      }
      if (str2.equals("zh_HK")) {
        return "zh_HK";
      }
      if (str2.equals("zh_CN")) {
        return "zh_CN";
      }
      if (str1.equals("th")) {
        return "th";
      }
      if (str1.equals("id")) {
        return "id";
      }
      if (str2.equals("in_ID")) {
        return "id";
      }
      if (str1.equals("vi")) {
        return "vi";
      }
      if (str1.equals("pt")) {
        return "pt";
      }
      if (str1.equals("es")) {
        return "es";
      }
      if (str1.equals("ru")) {
        return "ru";
      }
      if (str1.equals("ar")) {
        return "ar";
      }
      if (str1.equals("ja")) {
        return "ja";
      }
      if (str1.equals("it")) {
        return "it";
      }
      if (str1.equals("ko")) {
        return "ko";
      }
      if (str1.equals("ms")) {
        return "ms";
      }
      if (str1.equals("tr")) {
        return "tr";
      }
      if (str1.equals("de")) {
        return "de";
      }
      if (str1.equals("fr")) {
        return "fr";
      }
      if (str1.equals("my")) {
        return "my";
      }
    } while (!str1.equals("lo"));
    return "lo";
  }
  
  public static void a(Context paramContext, Locale paramLocale)
  {
    paramContext = paramContext.getResources();
    Configuration localConfiguration = paramContext.getConfiguration();
    DisplayMetrics localDisplayMetrics = paramContext.getDisplayMetrics();
    localConfiguration.locale = paramLocale;
    paramContext.updateConfiguration(localConfiguration, localDisplayMetrics);
    Resources.getSystem().updateConfiguration(localConfiguration, localDisplayMetrics);
  }
  
  public static void a(SharedPreferences paramSharedPreferences, String paramString)
  {
    if (paramSharedPreferences.edit().putString("language_key", paramString).commit())
    {
      be.setProperty("language_key", paramString);
      x.w("MicroMsg.LocaleUtil", "save application lang as:" + paramString);
      return;
    }
    x.e("MicroMsg.LocaleUtil", "saving application lang failed");
  }
  
  public static void c(Configuration paramConfiguration)
  {
    if (Build.VERSION.SDK_INT < 24) {}
    while (paramConfiguration == null) {
      return;
    }
    Locale.setDefault(paramConfiguration.locale);
    sGk = Locale.getDefault();
    x.i("MicroMsg.LocaleUtil", "current locale:%s", new Object[] { sGk });
  }
  
  public static boolean chL()
  {
    String str = chP();
    return (str.equals("zh_CN")) || (str.equals("zh_TW")) || (str.equals("zh_HK"));
  }
  
  public static boolean chM()
  {
    return chP().equals("zh_CN");
  }
  
  public static boolean chN()
  {
    return (chP().equals("zh_TW")) || (chP().equals("zh_HK"));
  }
  
  public static String chO()
  {
    return Locale.getDefault().getCountry().trim();
  }
  
  public static String chP()
  {
    String str = bi.oV(be.getProperty("language_key"));
    if ((str.length() > 0) && (!str.equals("language_default"))) {
      return str;
    }
    return Wm("en");
  }
  
  public static String d(SharedPreferences paramSharedPreferences)
  {
    paramSharedPreferences = bi.oV(paramSharedPreferences.getString("language_key", null));
    if ((paramSharedPreferences.length() > 0) && (!paramSharedPreferences.equals("language_default")))
    {
      be.setProperty("language_key", paramSharedPreferences);
      return paramSharedPreferences;
    }
    paramSharedPreferences = Wm("en");
    be.setProperty("language_key", paramSharedPreferences);
    return paramSharedPreferences;
  }
  
  public static String e(SharedPreferences paramSharedPreferences)
  {
    paramSharedPreferences = bi.oV(paramSharedPreferences.getString("language_key", null));
    if (!bi.oW(paramSharedPreferences)) {
      return paramSharedPreferences;
    }
    return "language_default";
  }
  
  public static String fD(Context paramContext)
  {
    paramContext = e(paramContext.getSharedPreferences(ad.chY(), 0));
    String str = chP();
    if (paramContext.equalsIgnoreCase("language_default")) {
      return str;
    }
    return paramContext;
  }
  
  public static String h(Context paramContext, int paramInt1, int paramInt2)
  {
    String[] arrayOfString1 = paramContext.getResources().getStringArray(paramInt1);
    String str = e(paramContext.getSharedPreferences(ad.chY(), 0));
    if (str == null) {
      return paramContext.getString(paramInt2);
    }
    String[] arrayOfString2 = v.mSn;
    int j = arrayOfString2.length;
    int i = 0;
    paramInt1 = 0;
    while (i < j)
    {
      if (arrayOfString2[i].equals(str)) {
        return arrayOfString1[paramInt1];
      }
      i += 1;
      paramInt1 += 1;
    }
    return paramContext.getString(paramInt2);
  }
  
  public static Locale initLanguage(Context paramContext)
  {
    Object localObject = d(paramContext.getSharedPreferences(ad.chY(), 0));
    if (((String)localObject).equals("language_default"))
    {
      a(paramContext, Locale.ENGLISH);
      return Locale.getDefault();
    }
    localObject = Wl((String)localObject);
    a(paramContext, (Locale)localObject);
    return (Locale)localObject;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/sdk/platformtools/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */