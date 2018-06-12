package com.tencent.mm.plugin.websearch.api;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Color;
import android.text.TextUtils;
import com.tencent.mm.a.o;
import com.tencent.mm.an.b;
import com.tencent.mm.g.a.ly;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.GeneralControlWrapper;
import com.tencent.mm.protocal.JsapiPermissionWrapper;
import com.tencent.mm.protocal.c.aqs;
import com.tencent.mm.protocal.c.avq;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ao;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.aa.a;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;
import org.json.JSONObject;

public final class p
{
  private static Map<Integer, ae> pLp = new HashMap();
  private static Map<Integer, g> pLq = new HashMap();
  
  static
  {
    pLp.put(Integer.valueOf(1), new ae("fts_browse/res", "wrd_template.zip", "browse"));
    pLp.put(Integer.valueOf(0), new ae("fts/res", "fts_template.zip", ""));
    Map localMap = pLq;
    zM(0);
    localMap.put(Integer.valueOf(0), v.bTa());
    localMap = pLq;
    zM(1);
    localMap.put(Integer.valueOf(1), v.bTa());
  }
  
  /* Error */
  public static Properties A(File paramFile)
  {
    // Byte code:
    //   0: new 68	java/util/Properties
    //   3: dup
    //   4: invokespecial 69	java/util/Properties:<init>	()V
    //   7: astore_3
    //   8: aload_0
    //   9: ifnull +30 -> 39
    //   12: aload_0
    //   13: invokevirtual 75	java/io/File:isFile	()Z
    //   16: ifeq +23 -> 39
    //   19: new 77	java/io/FileInputStream
    //   22: dup
    //   23: aload_0
    //   24: invokespecial 80	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   27: astore_1
    //   28: aload_1
    //   29: astore_0
    //   30: aload_3
    //   31: aload_1
    //   32: invokevirtual 84	java/util/Properties:load	(Ljava/io/InputStream;)V
    //   35: aload_1
    //   36: invokestatic 89	com/tencent/mm/a/e:f	(Ljava/io/InputStream;)V
    //   39: aload_3
    //   40: areturn
    //   41: astore_2
    //   42: aconst_null
    //   43: astore_1
    //   44: aload_1
    //   45: astore_0
    //   46: ldc 91
    //   48: aload_2
    //   49: ldc 51
    //   51: iconst_0
    //   52: anewarray 4	java/lang/Object
    //   55: invokestatic 97	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   58: aload_1
    //   59: invokestatic 89	com/tencent/mm/a/e:f	(Ljava/io/InputStream;)V
    //   62: aload_3
    //   63: areturn
    //   64: astore_1
    //   65: aconst_null
    //   66: astore_0
    //   67: aload_0
    //   68: invokestatic 89	com/tencent/mm/a/e:f	(Ljava/io/InputStream;)V
    //   71: aload_1
    //   72: athrow
    //   73: astore_1
    //   74: goto -7 -> 67
    //   77: astore_2
    //   78: goto -34 -> 44
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	81	0	paramFile	File
    //   27	32	1	localFileInputStream	java.io.FileInputStream
    //   64	8	1	localObject1	Object
    //   73	1	1	localObject2	Object
    //   41	8	2	localException1	Exception
    //   77	1	2	localException2	Exception
    //   7	56	3	localProperties	Properties
    // Exception table:
    //   from	to	target	type
    //   19	28	41	java/lang/Exception
    //   19	28	64	finally
    //   30	35	73	finally
    //   46	58	73	finally
    //   30	35	77	java/lang/Exception
  }
  
  public static aqs JU()
  {
    try
    {
      Object localObject = (String)com.tencent.mm.kernel.g.Ei().DT().get(67591, null);
      if (localObject != null)
      {
        aqs localaqs = new aqs();
        localObject = ((String)localObject).split(",");
        localaqs.ryV = Integer.valueOf(localObject[0]).intValue();
        localaqs.ryY = Integer.valueOf(localObject[1]).intValue();
        localaqs.rms = (Integer.valueOf(localObject[2]).intValue() / 1000000.0F);
        localaqs.rmr = (Integer.valueOf(localObject[3]).intValue() / 1000000.0F);
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WebSearch.WebSearchApiLogic", "lbs location is not null, %f, %f", new Object[] { Float.valueOf(localaqs.rms), Float.valueOf(localaqs.rmr) });
        return localaqs;
      }
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WebSearch.WebSearchApiLogic", "lbs location is null, lbsContent is null!");
      return null;
    }
    catch (Exception localException)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WebSearch.WebSearchApiLogic", "lbs location is null, reason %s", new Object[] { localException.getMessage() });
    }
    return null;
  }
  
  public static long LP(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return 0L;
    }
    long l = new BigInteger(paramString).longValue();
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WebSearch.WebSearchApiLogic", "seq %s to snsId %d ", new Object[] { paramString, Long.valueOf(l) });
    return l;
  }
  
  public static String U(Map<String, ? extends Object> paramMap)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    paramMap = paramMap.entrySet().iterator();
    while (paramMap.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)paramMap.next();
      localStringBuffer.append((String)localEntry.getKey());
      localStringBuffer.append("=");
      if (localEntry.getValue() != null) {
        localStringBuffer.append(localEntry.getValue().toString());
      }
      localStringBuffer.append("&");
    }
    return localStringBuffer.substring(0, localStringBuffer.length() - 1).toString();
  }
  
  public static long a(Map<String, Object> paramMap, String paramString, long paramLong)
  {
    paramMap = t(paramMap, paramString);
    if (bi.oW(paramMap)) {
      return paramLong;
    }
    try
    {
      long l = Long.valueOf(paramMap).longValue();
      return l;
    }
    catch (Exception paramMap) {}
    return paramLong;
  }
  
  private static String a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, boolean paramBoolean, String paramString6, String paramString7, String paramString8)
  {
    paramString1 = a(21, false, 2, paramString1, paramString2, paramString3, paramString4, paramString5, paramString6, "", paramString7);
    if (paramBoolean) {
      paramString1.put("isPreload", "1");
    }
    if (!bi.oW(paramString8)) {
      paramString1.put("redPointMsgId", paramString8);
    }
    return c(paramString1, 1);
  }
  
  public static Map<String, String> a(int paramInt1, boolean paramBoolean, int paramInt2, String paramString)
  {
    return a(paramInt1, paramBoolean, paramInt2, paramString, "", "", "", "", "", "", "");
  }
  
  public static Map<String, String> a(int paramInt1, boolean paramBoolean, int paramInt2, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8)
  {
    HashMap localHashMap = new HashMap();
    if (!TextUtils.isEmpty(paramString2)) {
      localHashMap.put("searchId", paramString2);
    }
    if (!TextUtils.isEmpty(paramString3)) {
      localHashMap.put("sessionId", paramString3);
    }
    if (!TextUtils.isEmpty(paramString6)) {
      localHashMap.put("subSessionId", paramString6);
    }
    if (!TextUtils.isEmpty(paramString4)) {
      localHashMap.put("query", paramString4);
    }
    if (!TextUtils.isEmpty(paramString5)) {
      localHashMap.put("sceneActionType", paramString5);
    }
    if (!TextUtils.isEmpty(paramString8)) {
      localHashMap.put("pRequestId", paramString8);
    }
    localHashMap.put("scene", String.valueOf(paramInt1));
    localHashMap.put("type", String.valueOf(paramInt2));
    localHashMap.put("lang", w.fD(ad.getContext()));
    localHashMap.put("platform", "android");
    if (!TextUtils.isEmpty(paramString7)) {
      localHashMap.put("poiInfo", paramString7);
    }
    if (!TextUtils.isEmpty(paramString1)) {
      localHashMap.put("extParams", paramString1);
    }
    boolean bool1;
    boolean bool7;
    boolean bool5;
    boolean bool2;
    boolean bool4;
    boolean bool3;
    boolean bool6;
    switch (paramInt1)
    {
    default: 
      paramString1 = String.valueOf(zP(0));
      localHashMap.put("version", paramString1);
      bool1 = false;
      bool7 = false;
      bool5 = false;
      bool2 = false;
      bool4 = false;
      bool3 = false;
      switch (paramInt1)
      {
      default: 
        bool6 = bool2;
        bool5 = bool3;
        bool1 = bool7;
        label396:
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WebSearch.WebSearchApiLogic", "genFTSParams scene=%d isHomePage=%b type=%d %b %b %b", new Object[] { Integer.valueOf(paramInt1), Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt2), Boolean.valueOf(bool1), Boolean.valueOf(bool6), Boolean.valueOf(bool5) });
        if (bool1) {
          localHashMap.put("isSug", "1");
        }
        if (bool6) {
          localHashMap.put("isLocalSug", "1");
        }
        if (bool5) {
          localHashMap.put("isMostSearchBiz", "1");
        }
        if (!paramBoolean) {
          localHashMap.put("isHomePage", "0");
        }
        break;
      }
      break;
    }
    for (;;)
    {
      float f2 = com.tencent.mm.bp.a.fe(ad.getContext());
      float f1 = f2;
      if (f2 != 1.0F)
      {
        f1 = f2;
        if (f2 != 0.875F)
        {
          f1 = f2;
          if (f2 != 1.125F)
          {
            f1 = f2;
            if (f2 != 1.25F)
            {
              f1 = f2;
              if (f2 != 1.375F)
              {
                f1 = f2;
                if (f2 != 1.625F)
                {
                  f1 = f2;
                  if (f2 != 1.875F)
                  {
                    f1 = f2;
                    if (f2 != 2.025F) {
                      f1 = 1.0F;
                    }
                  }
                }
              }
            }
          }
        }
      }
      localHashMap.put("fontRatio", String.valueOf(f1));
      localHashMap.put("netType", bjC());
      if (b.PY())
      {
        paramString1 = b.Qa();
        if (paramString1 != null) {
          localHashMap.put("musicSnsId", paramString1.rsp);
        }
      }
      return localHashMap;
      paramString1 = String.valueOf(zP(1));
      break;
      paramString1 = r.PX("mixGlobal");
      if (paramBoolean)
      {
        bool1 = bool7;
        bool5 = bool3;
        bool6 = bool2;
        if (paramString1.optInt("mixSugSwitch", 0) != 1) {
          break label396;
        }
      }
      for (;;)
      {
        bool1 = true;
        bool5 = bool3;
        bool6 = bool2;
        break;
        if (paramInt2 == 1)
        {
          bool1 = bool7;
          bool5 = bool3;
          bool6 = bool2;
          if (paramString1.optInt("bizSugSwitch", 0) != 1) {
            break;
          }
          continue;
        }
        if (paramInt2 == 8)
        {
          bool1 = bool7;
          bool5 = bool3;
          bool6 = bool2;
          if (paramString1.optInt("snsSugSwitch", 0) != 1) {
            break;
          }
          continue;
        }
        if (paramInt2 == 1024)
        {
          bool1 = bool7;
          bool5 = bool3;
          bool6 = bool2;
          if (paramString1.optInt("novelSugSwitch", 0) != 1) {
            break;
          }
          continue;
        }
        if (paramInt2 == 512)
        {
          bool1 = bool7;
          bool5 = bool3;
          bool6 = bool2;
          if (paramString1.optInt("musicSugSwitch", 0) != 1) {
            break;
          }
          continue;
        }
        if ((paramInt2 != 384) && (paramInt2 != 256))
        {
          bool1 = bool7;
          bool5 = bool3;
          bool6 = bool2;
          if (paramInt2 != 128) {
            break;
          }
        }
        bool1 = bool7;
        bool5 = bool3;
        bool6 = bool2;
        if (paramString1.optInt("emotionSugSwitch", 0) != 1) {
          break;
        }
        continue;
        bool2 = bool1;
        if (paramInt2 == 1)
        {
          bool2 = bool1;
          if (r.PX("bizTab").optInt("bizSugSwitch", 0) == 1) {
            bool2 = true;
          }
        }
        bool1 = bool2;
        if (paramInt2 == 2)
        {
          bool1 = bool2;
          if (r.PX("articleTab").optInt("sugSwitch", 0) == 1) {
            bool1 = true;
          }
        }
        bool3 = bool1;
        bool2 = bool5;
        if (paramInt2 == 8)
        {
          paramString1 = r.PX("snsTab");
          if (paramString1.optInt("sugSwitch", 0) == 1) {
            bool1 = true;
          }
          bool3 = bool1;
          bool2 = bool5;
          if (paramString1.optInt("localSugSwitch", 0) == 1)
          {
            bool2 = true;
            bool3 = bool1;
          }
        }
        bool1 = bool3;
        if (!paramBoolean)
        {
          bool1 = bool3;
          if (paramInt2 == 4)
          {
            bool1 = bool3;
            if (r.PX("bizTab").optInt("bizServiceSugSwitch", 0) == 1) {
              bool1 = true;
            }
          }
        }
        bool3 = bool4;
        if (paramInt2 == 1)
        {
          bool3 = bool4;
          if (r.PX("bizTab").optInt("mfsBizSwitch", 0) == 1) {
            bool3 = true;
          }
        }
        bool4 = bool1;
        if (paramInt2 == 1024)
        {
          bool4 = bool1;
          if (r.PX("novelTab").optInt("sugSwitch", 0) == 1) {
            bool4 = true;
          }
        }
        bool1 = bool4;
        if (paramInt2 == 512)
        {
          bool1 = bool4;
          if (r.PX("musicTab").optInt("sugSwitch", 0) == 1) {
            bool1 = true;
          }
        }
        bool4 = bool1;
        if (paramInt2 == 384)
        {
          bool4 = bool1;
          if (r.PX("emotionTab").optInt("sugSwitch", 0) == 1) {
            bool4 = true;
          }
        }
        bool1 = bool4;
        bool5 = bool3;
        bool6 = bool2;
        if (paramInt2 != 0) {
          break;
        }
        bool1 = bool4;
        bool5 = bool3;
        bool6 = bool2;
        if (!paramBoolean) {
          break;
        }
        bool1 = bool4;
        bool5 = bool3;
        bool6 = bool2;
        if (r.PX("mixGlobal").optInt("mixSugSwitch", 0) != 1) {
          break;
        }
        bool1 = true;
        bool5 = bool3;
        bool6 = bool2;
        break;
        bool1 = bool7;
        bool5 = bool3;
        bool6 = bool2;
        if (r.PX("bizEntry").optInt("sugSwitch") != 1) {
          break;
        }
        continue;
        bool1 = bool7;
        bool5 = bool3;
        bool6 = bool2;
        if (r.PX("bizUnionTopEntry").optInt("sugSwitch") != 1) {
          break;
        }
      }
      bool1 = bool7;
      bool5 = bool3;
      bool6 = bool2;
      if (paramInt2 != 384) {
        break label396;
      }
      bool1 = bool7;
      bool5 = bool3;
      bool6 = bool2;
      if (r.PX("emoticonMall").optInt("sugSwitch", 0) != 1) {
        break label396;
      }
      bool1 = true;
      bool5 = bool3;
      bool6 = bool2;
      break label396;
      localHashMap.put("isHomePage", "1");
    }
  }
  
  public static void a(Context paramContext, String paramString1, Intent paramIntent, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6)
  {
    if (paramContext == null)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.WebSearch.WebSearchApiLogic", "openNews intent is null, or context is null");
      return;
    }
    Intent localIntent = ag(paramIntent);
    localIntent.putExtra("ftsbizscene", 21);
    localIntent.putExtra("ftsQuery", paramString1);
    if (paramString2 != null) {
      localIntent.putExtra("title", paramString2);
    }
    localIntent.putExtra("isWebwx", paramString1);
    localIntent.putExtra("ftscaneditable", false);
    localIntent.putExtra("key_load_js_without_delay", true);
    if (TextUtils.isEmpty(paramString5)) {}
    for (paramIntent = zK(21);; paramIntent = paramString5)
    {
      if (TextUtils.isEmpty(paramString6)) {}
      for (paramString2 = zK(21);; paramString2 = paramString6)
      {
        localIntent.putExtra("rawUrl", a(paramString3, paramString4, paramIntent, paramString1, "2", false, paramString2, "", ""));
        localIntent.putExtra("sessionId", paramIntent);
        localIntent.putExtra("customize_status_bar_color", Color.parseColor("#F2F2F2"));
        localIntent.putExtra("status_bar_style", "black");
        com.tencent.mm.bg.d.b(paramContext, "webview", ".ui.tools.fts.FTSWebViewUI", localIntent);
        return;
      }
    }
  }
  
  public static void a(String paramString1, String paramString2, String paramString3, String paramString4, int paramInt)
  {
    ly locally = new ly();
    locally.bWq.bWm = paramString4;
    locally.bWq.bJK = paramString2;
    locally.bWq.bWr = paramString3;
    locally.bWq.scene = paramInt;
    locally.bWq.bWs = paramString1;
    com.tencent.mm.sdk.b.a.sFg.m(locally);
  }
  
  public static String aP(int paramInt, String paramString)
  {
    Map localMap = b(paramInt, true, 0);
    localMap.put("sessionId", paramString);
    localMap.put("inputMarginTop", "32");
    localMap.put("inputMarginLeftRight", "24");
    localMap.put("inputHeight", "48");
    localMap.put("isPreload", "1");
    return c(localMap, 0);
  }
  
  public static Intent adR()
  {
    return ag(new Intent());
  }
  
  private static Intent ag(Intent paramIntent)
  {
    if (paramIntent == null) {
      return null;
    }
    paramIntent.putExtra("hardcode_jspermission", JsapiPermissionWrapper.qWa);
    paramIntent.putExtra("hardcode_general_ctrl", GeneralControlWrapper.qVX);
    paramIntent.putExtra("neverGetA8Key", true);
    return paramIntent;
  }
  
  public static void ah(Intent paramIntent)
  {
    paramIntent.putExtra("ftsbizscene", 24);
    Map localMap = b(24, false, 384);
    String str = zK(bi.WU((String)localMap.get("scene")));
    localMap.put("sessionId", str);
    paramIntent.putExtra("sessionId", str);
    paramIntent.putExtra("rawUrl", c(localMap, 0));
    paramIntent.putExtra("ftsType", 384);
  }
  
  public static Map<String, String> b(int paramInt1, boolean paramBoolean, int paramInt2)
  {
    return a(paramInt1, paramBoolean, paramInt2, "");
  }
  
  public static String bSL()
  {
    pLp.get(Integer.valueOf(1));
    return "app.html";
  }
  
  public static String bSM()
  {
    pLp.get(Integer.valueOf(1));
    return "config.conf";
  }
  
  public static void bSN()
  {
    Iterator localIterator = pLq.values().iterator();
    while (localIterator.hasNext()) {
      localIterator.next();
    }
  }
  
  public static String bSO()
  {
    String str = r.PX("discoverRecommendEntry").optString("wording");
    if (bi.oW(str))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.WebSearch.WebSearchApiLogic", "empty query");
      return "";
    }
    return a(null, null, zK(21), str, null, true, zK(21), "", "");
  }
  
  public static void bSP()
  {
    com.tencent.mm.kernel.g.Em().H(new Runnable()
    {
      public final void run()
      {
        String str = p.bSO();
        if (!TextUtils.isEmpty(str)) {
          z.bTc().cu(str, 2);
        }
      }
    });
  }
  
  public static void bSQ()
  {
    fz(0L);
  }
  
  public static void bSR()
  {
    fA(0L);
  }
  
  public static String bSS()
  {
    return aP(-1, zK(-1));
  }
  
  public static boolean bST()
  {
    JSONObject localJSONObject = r.PX("snsContactMatch");
    if (localJSONObject != null) {
      return localJSONObject.optInt("matchSwitch") == 1;
    }
    return false;
  }
  
  public static int bSU()
  {
    JSONObject localJSONObject = r.PX("snsContactMatch");
    if (localJSONObject != null) {
      return localJSONObject.optInt("queryUtfLenLimit");
    }
    return 0;
  }
  
  public static boolean bSV()
  {
    return com.tencent.mm.sdk.platformtools.d.CLIENT_VERSION.endsWith("0F");
  }
  
  public static String bjC()
  {
    if (ao.isWifi(ad.getContext())) {
      return "wifi";
    }
    if (ao.is4G(ad.getContext())) {
      return "4g";
    }
    if (ao.is3G(ad.getContext())) {
      return "3g";
    }
    if (ao.is2G(ad.getContext())) {
      return "2g";
    }
    if (!ao.isConnected(ad.getContext())) {
      return "fail";
    }
    return "";
  }
  
  public static int c(Map<String, Object> paramMap, String paramString, int paramInt)
  {
    paramMap = t(paramMap, paramString);
    if (bi.oW(paramMap)) {
      return paramInt;
    }
    try
    {
      int i = Integer.valueOf(paramMap).intValue();
      return i;
    }
    catch (Exception paramMap) {}
    return paramInt;
  }
  
  public static String c(Map<String, String> paramMap, int paramInt)
  {
    int j = 1;
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append("file://");
    Object localObject1 = zL(paramInt).adP();
    Object localObject2 = new StringBuilder();
    z localz = z.bTc();
    if (paramInt == 1) {}
    for (int i = 2; !ad.cic(); i = 1) {
      throw new IllegalStateException("please call from main process");
    }
    boolean bool;
    switch (i)
    {
    default: 
      bool = localz.bTe();
      if (!bool) {
        break;
      }
    }
    for (i = j;; i = 0)
    {
      paramMap.put("isOpenPreload", i);
      localStringBuffer.append((String)localObject1);
      if (paramMap.size() <= 0) {
        break label439;
      }
      localObject1 = localStringBuffer.append("/");
      zL(paramInt);
      ((StringBuffer)localObject1).append("app.html?");
      localObject1 = paramMap.entrySet().iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (Map.Entry)((Iterator)localObject1).next();
        localStringBuffer.append((String)((Map.Entry)localObject2).getKey());
        localStringBuffer.append("=");
        localStringBuffer.append((String)((Map.Entry)localObject2).getValue());
        localStringBuffer.append("&");
      }
      bool = localz.bTd();
      break;
    }
    localObject1 = (String)paramMap.get("sessionId");
    if (!paramMap.containsKey("sessionId"))
    {
      localObject1 = zK(bi.WU((String)paramMap.get("scene")));
      localStringBuffer.append("sessionId");
      localStringBuffer.append("=");
      localStringBuffer.append((String)localObject1);
      localStringBuffer.append("&");
    }
    if (!paramMap.containsKey("subSessionId"))
    {
      localStringBuffer.append("subSessionId");
      localStringBuffer.append("=");
      localStringBuffer.append((String)localObject1);
      localStringBuffer.append("&");
    }
    localStringBuffer.append("wechatVersion");
    localStringBuffer.append("=");
    localStringBuffer.append(com.tencent.mm.protocal.d.qVN);
    localStringBuffer.append("&");
    return localStringBuffer.substring(0, localStringBuffer.length() - 1);
    label439:
    paramMap = localStringBuffer.append("/");
    zL(paramInt);
    paramMap.append("app.html");
    return localStringBuffer.toString();
  }
  
  public static void c(Context paramContext, String paramString, Intent paramIntent)
  {
    try
    {
      String str2 = ad.chX() + ".plugin.topstory";
      String str1 = paramString;
      if (paramString.startsWith(".")) {
        str1 = str2 + paramString;
      }
      paramIntent.setClassName(ad.getPackageName(), str1);
      Class.forName(str1, false, paramContext.getClassLoader());
      if ((paramContext instanceof Activity))
      {
        paramContext.startActivity(paramIntent);
        return;
      }
      paramIntent.addFlags(268435456);
      paramContext.startActivity(paramIntent);
      return;
    }
    catch (Exception paramContext)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.WebSearch.WebSearchApiLogic", "Class Not Found when startActivity %s", new Object[] { paramContext });
    }
  }
  
  public static void d(Context paramContext, String paramString, Intent paramIntent)
  {
    try
    {
      String str2 = ad.chX() + ".plugin.topstory";
      String str1 = paramString;
      if (paramString.startsWith(".")) {
        str1 = str2 + paramString;
      }
      paramIntent.setClassName(ad.getPackageName(), str1);
      Class.forName(str1, false, paramContext.getClassLoader());
      if ((paramContext instanceof Activity)) {
        ((Activity)paramContext).startActivityForResult(paramIntent, 10001);
      }
      return;
    }
    catch (Exception paramContext)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.WebSearch.WebSearchApiLogic", "Class Not Found when startActivity %s", new Object[] { paramContext });
    }
  }
  
  private static void e(InputStream paramInputStream, OutputStream paramOutputStream)
  {
    byte[] arrayOfByte = new byte['Ѐ'];
    for (;;)
    {
      int i = paramInputStream.read(arrayOfByte);
      if (i == -1) {
        break;
      }
      paramOutputStream.write(arrayOfByte, 0, i);
    }
  }
  
  public static void fA(long paramLong)
  {
    com.tencent.mm.kernel.g.Em().h(new p.3(), paramLong);
  }
  
  public static boolean fB(long paramLong)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WebSearch.WebSearchApiLogic", "rec updateRedDotTimestamp %d", new Object[] { Long.valueOf(paramLong) });
    com.tencent.mm.kernel.g.Ei().DT().a(aa.a.sZQ, Long.valueOf(paramLong));
    return false;
  }
  
  public static void fz(long paramLong)
  {
    com.tencent.mm.kernel.g.Em().h(new p.2(), paramLong);
  }
  
  public static boolean j(Activity paramActivity, int paramInt)
  {
    try
    {
      int i = android.support.v4.content.a.f(paramActivity, "android.permission.ACCESS_COARSE_LOCATION");
      if (i == 0)
      {
        h.mEJ.h(15104, new Object[] { Integer.valueOf(paramInt), Integer.valueOf(2) });
        return true;
      }
    }
    catch (Exception paramActivity)
    {
      com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.WebSearch.WebSearchApiLogic", paramActivity, "", new Object[0]);
      return true;
    }
    h.mEJ.h(15104, new Object[] { Integer.valueOf(paramInt), Integer.valueOf(1) });
    if (android.support.v4.app.a.a(paramActivity, "android.permission.ACCESS_COARSE_LOCATION"))
    {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.WebSearch.WebSearchApiLogic", "has shown request permission and user denied, do not show agagin");
      return true;
    }
    com.tencent.mm.sdk.platformtools.x.w("MicroMsg.WebSearch.WebSearchApiLogic", "showing request permission dialog");
    android.support.v4.app.a.a(paramActivity, new String[] { "android.permission.ACCESS_COARSE_LOCATION" }, 73);
    return false;
  }
  
  public static String t(Map<String, Object> paramMap, String paramString)
  {
    if (paramMap.containsKey(paramString))
    {
      if (paramMap.get(paramString) != null) {
        return paramMap.get(paramString).toString();
      }
      return "";
    }
    return "";
  }
  
  public static boolean u(Map<String, Object> paramMap, String paramString)
  {
    paramMap = t(paramMap, paramString);
    if (bi.oW(paramMap)) {}
    for (;;)
    {
      return false;
      try
      {
        if ("1".equals(paramMap)) {
          return true;
        }
        if (!"0".equals(paramMap))
        {
          boolean bool = Boolean.valueOf(paramMap).booleanValue();
          return bool;
        }
      }
      catch (Exception paramMap) {}
    }
    return false;
  }
  
  public static String v(Map<String, String> paramMap)
  {
    return c(paramMap, 0);
  }
  
  public static final String zK(int paramInt)
  {
    StringBuilder localStringBuilder = new StringBuilder().append(paramInt).append("_");
    com.tencent.mm.kernel.g.Eg();
    return o.getString(com.tencent.mm.kernel.a.Df()) + "_" + System.currentTimeMillis();
  }
  
  public static ae zL(int paramInt)
  {
    return (ae)pLp.get(Integer.valueOf(paramInt));
  }
  
  private static String zM(int paramInt)
  {
    ae localae = (ae)pLp.get(Integer.valueOf(paramInt));
    return localae.adP() + File.separator + "app.html";
  }
  
  public static int zN(int paramInt)
  {
    localObject1 = (ae)pLp.get(Integer.valueOf(paramInt));
    if (TextUtils.isEmpty(((ae)localObject1).pMx)) {}
    for (Object localObject4 = "config.conf";; localObject4 = ((ae)localObject1).pMx + File.separator + "config.conf")
    {
      AssetManager localAssetManager = ad.getContext().getAssets();
      Properties localProperties = new Properties();
      localObject3 = null;
      localObject1 = null;
      try
      {
        localObject4 = localAssetManager.open((String)localObject4);
        localObject1 = localObject4;
        localObject3 = localObject4;
        localProperties.load((InputStream)localObject4);
      }
      catch (Exception localException)
      {
        for (;;)
        {
          localObject3 = localObject1;
          com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.WebSearch.WebSearchApiLogic", localException, localException.getMessage(), new Object[0]);
          com.tencent.mm.a.e.f((InputStream)localObject1);
        }
      }
      finally
      {
        com.tencent.mm.a.e.f((InputStream)localObject3);
      }
      return Integer.valueOf(localProperties.getProperty("version", "1")).intValue();
    }
  }
  
  public static boolean zO(int paramInt)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WebSearch.WebSearchApiLogic", "isFTSH5TemplateAvail exportType:%d, use search default.", new Object[] { Integer.valueOf(paramInt) });
    return ((ae)pLp.get(Integer.valueOf(paramInt))).Oe() > 1;
  }
  
  public static int zP(int paramInt)
  {
    return ((ae)pLp.get(Integer.valueOf(paramInt))).Oe();
  }
  
  public static boolean zQ(int paramInt)
  {
    Object localObject2 = null;
    AssetManager localAssetManager = ad.getContext().getAssets();
    Object localObject3 = ((ae)pLp.get(Integer.valueOf(paramInt))).bTp();
    Object localObject1 = (ae)pLp.get(Integer.valueOf(paramInt));
    if (TextUtils.isEmpty(((ae)localObject1).pMx)) {}
    for (localObject1 = ((ae)localObject1).pMw; (bi.oW((String)localObject3)) || (bi.oW((String)localObject1)); localObject1 = ((ae)localObject1).pMx + File.separator + ((ae)localObject1).pMw)
    {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.WebSearch.WebSearchApiLogic", "copyTemplateFromAsset no dstPath or template path!");
      return false;
    }
    try
    {
      localObject1 = localAssetManager.open((String)localObject1);
      if (localObject1 == null)
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.WebSearch.WebSearchApiLogic", "file inputStream not found");
        return false;
      }
    }
    catch (IOException localIOException1)
    {
      InputStream localInputStream;
      for (;;)
      {
        com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.WebSearch.WebSearchApiLogic", localIOException1, "", new Object[0]);
        localInputStream = null;
      }
      localObject3 = new File((String)localObject3);
      if (((File)localObject3).exists()) {
        ((File)localObject3).delete();
      }
      ((File)localObject3).getParentFile().mkdirs();
      try
      {
        localObject3 = new FileOutputStream((File)localObject3);
        localObject2 = localObject3;
      }
      catch (FileNotFoundException localFileNotFoundException)
      {
        for (;;)
        {
          try
          {
            e(localInputStream, (OutputStream)localObject2);
            return true;
          }
          catch (IOException localIOException2)
          {
            com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.WebSearch.WebSearchApiLogic", localIOException2, "", new Object[0]);
            return false;
          }
          finally
          {
            com.tencent.mm.a.e.f(localInputStream);
            com.tencent.mm.a.e.closeOutputStream((OutputStream)localObject2);
          }
          localFileNotFoundException = localFileNotFoundException;
          com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.WebSearch.WebSearchApiLogic", localFileNotFoundException, "", new Object[0]);
        }
      }
      if (localObject2 != null) {}
      com.tencent.mm.a.e.f(localInputStream);
    }
    return false;
  }
  
  public static String zR(int paramInt)
  {
    return ((ae)pLp.get(Integer.valueOf(paramInt))).bTp();
  }
  
  public static int zS(int paramInt)
  {
    return ((ae)pLp.get(Integer.valueOf(paramInt))).bTn();
  }
  
  public static String zT(int paramInt)
  {
    return ((ae)pLp.get(Integer.valueOf(paramInt))).adP();
  }
  
  public static String zU(int paramInt)
  {
    return ((ae)pLp.get(Integer.valueOf(zX(paramInt)))).adP();
  }
  
  public static String zV(int paramInt)
  {
    return ((ae)pLp.get(Integer.valueOf(zX(paramInt)))).pMw;
  }
  
  public static int zW(int paramInt)
  {
    return ((ae)pLp.get(Integer.valueOf(zX(paramInt)))).Oe();
  }
  
  private static int zX(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return -1;
    case 1: 
      return 0;
    }
    return 1;
  }
  
  public static String zY(int paramInt)
  {
    return A(new File(((ae)pLp.get(Integer.valueOf(paramInt))).adP(), "config_data.conf")).getProperty("kv_set", "");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/websearch/api/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */