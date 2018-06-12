package com.tencent.mm.plugin.appbrand.q;

import android.text.TextUtils;
import com.tencent.mm.compatible.util.e;
import com.tencent.mm.plugin.websearch.api.p;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.d;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public final class n
{
  /* Error */
  public static Properties A(File paramFile)
  {
    // Byte code:
    //   0: new 10	java/util/Properties
    //   3: dup
    //   4: invokespecial 14	java/util/Properties:<init>	()V
    //   7: astore_3
    //   8: aload_0
    //   9: ifnull +30 -> 39
    //   12: aload_0
    //   13: invokevirtual 20	java/io/File:isFile	()Z
    //   16: ifeq +23 -> 39
    //   19: new 22	java/io/FileInputStream
    //   22: dup
    //   23: aload_0
    //   24: invokespecial 25	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   27: astore_1
    //   28: aload_1
    //   29: astore_0
    //   30: aload_3
    //   31: aload_1
    //   32: invokevirtual 29	java/util/Properties:load	(Ljava/io/InputStream;)V
    //   35: aload_1
    //   36: invokestatic 34	com/tencent/mm/a/e:f	(Ljava/io/InputStream;)V
    //   39: aload_3
    //   40: areturn
    //   41: astore_2
    //   42: aconst_null
    //   43: astore_1
    //   44: aload_1
    //   45: astore_0
    //   46: ldc 36
    //   48: aload_2
    //   49: ldc 38
    //   51: iconst_0
    //   52: anewarray 4	java/lang/Object
    //   55: invokestatic 44	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   58: aload_1
    //   59: invokestatic 34	com/tencent/mm/a/e:f	(Ljava/io/InputStream;)V
    //   62: aload_3
    //   63: areturn
    //   64: astore_1
    //   65: aconst_null
    //   66: astore_0
    //   67: aload_0
    //   68: invokestatic 34	com/tencent/mm/a/e:f	(Ljava/io/InputStream;)V
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
  
  public static Map<String, String> a(int paramInt1, boolean paramBoolean, int paramInt2, String paramString)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("scene", String.valueOf(paramInt1));
    localHashMap.put("type", String.valueOf(paramInt2));
    localHashMap.put("lang", w.fD(ad.getContext()));
    localHashMap.put("platform", "android");
    localHashMap.put("version", String.valueOf(adQ()));
    String str;
    if (paramBoolean)
    {
      str = "1";
      localHashMap.put("isHomePage", str);
      if (!TextUtils.isEmpty(paramString)) {
        localHashMap.put("extParams", paramString);
      }
      paramString = com.tencent.mm.model.c.c.Jx().fJ("100192");
      if ((!paramString.isValid()) || (!"1".equals(paramString.ckq().get("openSearchSuggestion")))) {
        break label224;
      }
    }
    label224:
    for (boolean bool = true;; bool = false)
    {
      x.i("MicroMsg.WxaFTSExportLogic", "genFTSParams scene = %d, isHomePage = %b, type = %d, isSug = %b", new Object[] { Integer.valueOf(paramInt1), Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt2), Boolean.valueOf(bool) });
      if (bool) {
        localHashMap.put("isSug", "1");
      }
      return localHashMap;
      str = "0";
      break;
    }
  }
  
  public static String adP()
  {
    File localFile = new File(e.duO.replace("/data/user/0", "/data/data"), "wxa_fts/res");
    if (!localFile.exists()) {
      localFile.mkdirs();
    }
    return localFile.getAbsolutePath();
  }
  
  public static int adQ()
  {
    return Integer.valueOf(A(new File(adP(), "config.conf")).getProperty("version", "0")).intValue();
  }
  
  public static final boolean aot()
  {
    com.tencent.mm.storage.c localc = com.tencent.mm.model.c.c.Jx().fJ("100223");
    if (localc.isValid()) {
      return bi.getInt((String)localc.ckq().get("switchWeAppTemplate"), 0) == 1;
    }
    return false;
  }
  
  public static Map<String, String> b(int paramInt1, boolean paramBoolean, int paramInt2)
  {
    return a(paramInt1, paramBoolean, paramInt2, "");
  }
  
  public static String v(Map<String, String> paramMap)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append("file://");
    localStringBuffer.append(adP());
    localStringBuffer.append("/app.html?");
    Iterator localIterator = paramMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      localStringBuffer.append("&");
      localStringBuffer.append((String)localEntry.getKey());
      localStringBuffer.append("=");
      localStringBuffer.append((String)localEntry.getValue());
    }
    if (!paramMap.containsKey("sessionId"))
    {
      localStringBuffer.append("&");
      localStringBuffer.append("sessionId");
      localStringBuffer.append("=");
      localStringBuffer.append(p.zK(bi.WU((String)paramMap.get("scene"))));
    }
    return localStringBuffer.toString();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/q/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */