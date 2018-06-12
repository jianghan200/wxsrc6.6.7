package com.tencent.xweb;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build;
import android.os.Build.VERSION;
import com.tencent.xweb.c.a.a;
import com.tencent.xweb.c.a.b;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.xwalk.core.XWalkEnvironment;

public final class a
{
  static boolean vzP = false;
  static String vzQ = "";
  static Map<String, String> vzR;
  static Map<String, String> vzS;
  static Map<String, String> vzT;
  
  private static void a(Map<String, String> paramMap1, Map<String, String> paramMap2, String paramString, Map<String, String> paramMap3)
  {
    vzR = paramMap1;
    vzS = paramMap2;
    vzQ = paramString;
    vzT = paramMap3;
  }
  
  public static void a(a.a[] paramArrayOfa, String paramString)
  {
    
    if (paramString == null) {
      return;
    }
    HashMap localHashMap1 = new HashMap();
    HashMap localHashMap2 = new HashMap();
    HashMap localHashMap3 = new HashMap();
    if ((paramArrayOfa == null) || (paramArrayOfa.length == 0))
    {
      b(localHashMap1, localHashMap2, paramString, localHashMap3);
      return;
    }
    XWalkEnvironment.getAvailableVersion();
    int i = Build.VERSION.SDK_INT;
    new StringBuilder().append(Build.BRAND).append(" ").append(Build.MODEL);
    i = 0;
    while (i < paramArrayOfa.length)
    {
      if ((paramArrayOfa[i] != null) && (paramArrayOfa[i].vCo.cID()) && (paramArrayOfa[i].vCr != null) && (!paramArrayOfa[i].vCr.isEmpty()) && (paramArrayOfa[i].vCq != null))
      {
        String[] arrayOfString = paramArrayOfa[i].vCr.split(",");
        int j;
        String str;
        if (paramArrayOfa[i].vCp.equals("setwebtype"))
        {
          j = 0;
          while (j < arrayOfString.length)
          {
            str = arrayOfString[j].trim();
            if ((str != null) && (!str.isEmpty()) && (!localHashMap1.containsKey(str))) {
              localHashMap1.put(str, paramArrayOfa[i].vCq);
            }
            j += 1;
          }
        }
        if (paramArrayOfa[i].vCp.equals("setjscore"))
        {
          j = 0;
          while (j < arrayOfString.length)
          {
            str = arrayOfString[j].trim();
            if ((str != null) && (!str.isEmpty()) && (!localHashMap2.containsKey(str))) {
              localHashMap2.put(str, paramArrayOfa[i].vCq);
            }
            j += 1;
          }
        }
        if (paramArrayOfa[i].vCp.equals("setfullscreenvideo"))
        {
          j = 0;
          while (j < arrayOfString.length)
          {
            str = arrayOfString[j].trim();
            if ((str != null) && (!str.isEmpty()) && (!localHashMap3.containsKey(str))) {
              localHashMap3.put(str, paramArrayOfa[i].vCq);
            }
            j += 1;
          }
        }
      }
      i += 1;
    }
    b(localHashMap1, localHashMap2, paramString, localHashMap3);
  }
  
  private static String aD(Map<String, String> paramMap)
  {
    if (paramMap == null) {
      return "";
    }
    StringBuilder localStringBuilder = new StringBuilder(128);
    paramMap = paramMap.entrySet().iterator();
    while (paramMap.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)paramMap.next();
      if (localStringBuilder.length() != 0) {
        localStringBuilder.append(";");
      }
      localStringBuilder.append((String)localEntry.getKey());
      localStringBuilder.append(":");
      localStringBuilder.append((String)localEntry.getValue());
    }
    return localStringBuilder.toString();
  }
  
  private static WebView.a adA(String paramString)
  {
    if ((paramString == null) || (paramString.isEmpty())) {
      return WebView.a.vAM;
    }
    WebView.a locala = WebView.a.vAM;
    try
    {
      paramString = WebView.a.valueOf(paramString);
      return paramString;
    }
    catch (Exception paramString) {}
    return locala;
  }
  
  private static Map<String, String> adB(String paramString)
  {
    HashMap localHashMap = new HashMap();
    if ((paramString == null) || (paramString.isEmpty())) {}
    for (;;)
    {
      return localHashMap;
      paramString = paramString.split(";");
      int j = paramString.length;
      int i = 0;
      while (i < j)
      {
        String[] arrayOfString = paramString[i];
        if ((arrayOfString != null) && (!arrayOfString.isEmpty()))
        {
          arrayOfString = arrayOfString.split(":");
          if ((arrayOfString.length == 2) && (arrayOfString[0] != null) && (arrayOfString[1] != null)) {
            localHashMap.put(arrayOfString[0], arrayOfString[1]);
          }
        }
        i += 1;
      }
    }
  }
  
  public static WebView.d adv(String paramString)
  {
    
    if ((vzR == null) || (paramString == null)) {
      return WebView.d.vAO;
    }
    return ady((String)vzR.get(paramString));
  }
  
  public static g.a adw(String paramString)
  {
    
    if ((vzS == null) || (paramString == null)) {
      return g.a.vAc;
    }
    return adz((String)vzS.get(paramString));
  }
  
  public static WebView.a adx(String paramString)
  {
    
    if ((vzT == null) || (paramString == null)) {
      return WebView.a.vAM;
    }
    return adA((String)vzT.get(paramString));
  }
  
  private static WebView.d ady(String paramString)
  {
    if ((paramString == null) || (paramString.isEmpty())) {
      return WebView.d.vAO;
    }
    WebView.d locald = WebView.d.vAO;
    try
    {
      paramString = WebView.d.valueOf(paramString);
      return paramString;
    }
    catch (Exception paramString) {}
    return locald;
  }
  
  private static g.a adz(String paramString)
  {
    if ((paramString == null) || (paramString.isEmpty())) {
      return g.a.vAc;
    }
    g.a locala = g.a.vAc;
    try
    {
      paramString = g.a.valueOf(paramString);
      return paramString;
    }
    catch (Exception paramString) {}
    return locala;
  }
  
  private static void b(Map<String, String> paramMap1, Map<String, String> paramMap2, String paramString, Map<String, String> paramMap3)
  {
    a(paramMap1, paramMap2, paramString, paramMap3);
    paramMap1 = aD(vzR);
    paramMap2 = aD(vzS);
    paramString = aD(vzT);
    XWalkEnvironment.addXWalkInitializeLog("CommandCfg", "save cmds to : webtype = " + paramMap1 + "jstype = " + paramMap2 + "configver = " + vzQ + "strFullscreenVideoCmds = " + paramString);
    paramMap3 = cIh().edit();
    paramMap3.putString("setwebtype", paramMap1);
    paramMap3.putString("setjscore", paramMap2);
    paramMap3.putString("cStrTAGConfigVer", vzQ);
    paramMap3.putString("setfullscreenvideo", paramString);
    paramMap3.commit();
  }
  
  private static SharedPreferences cIh()
  {
    return XWalkEnvironment.getApplicationContext().getSharedPreferences("XWEB.CMDCFG", 0);
  }
  
  public static String getAbstractInfo()
  {
    
    if (((vzR == null) || (vzR.size() == 0)) && ((vzS == null) || (vzS.size() == 0)) && ((vzT == null) || (vzT.size() == 0))) {
      return "";
    }
    return "configver : " + vzQ + "\n webtype : " + aD(vzR) + "\n jscore type :" + aD(vzS) + "\n fullscreenVideo :" + aD(vzT);
  }
  
  private static void init()
  {
    if (vzP) {
      return;
    }
    vzP = true;
    Object localObject = cIh();
    String str1 = ((SharedPreferences)localObject).getString("setwebtype", WebView.d.vAO.toString());
    String str2 = ((SharedPreferences)localObject).getString("setjscore", g.a.vAc.toString());
    String str3 = ((SharedPreferences)localObject).getString("cStrTAGConfigVer", "");
    localObject = ((SharedPreferences)localObject).getString("setfullscreenvideo", WebView.a.vAM.toString());
    a(adB(str1), adB(str2), str3, adB((String)localObject));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/xweb/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */