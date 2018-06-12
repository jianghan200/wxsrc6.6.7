package com.tencent.mm.plugin.wenote.b;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory.Options;
import android.text.Spanned;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.fav.a.an;
import com.tencent.mm.plugin.wenote.model.a.h;
import com.tencent.mm.plugin.wenote.model.a.j;
import com.tencent.mm.plugin.wenote.model.a.k;
import com.tencent.mm.plugin.wenote.model.a.n;
import com.tencent.mm.plugin.wenote.model.a.q;
import com.tencent.mm.plugin.wenote.model.nativenote.a.a;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.sdk.platformtools.z;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class c
{
  public static HashMap<String, String> qtB = new HashMap();
  public static HashMap<String, q> qtC = new HashMap();
  public static c qtD = null;
  private static com.tencent.mm.a.f<String, Integer> qtE = new com.tencent.mm.a.f(30);
  
  public static Bitmap Sq(String paramString)
  {
    paramString = com.tencent.mm.plugin.fav.ui.c.at(paramString, false);
    if (paramString != null) {
      return paramString;
    }
    if (bi.oW(null)) {
      return null;
    }
    return com.tencent.mm.plugin.fav.ui.c.at(null, false);
  }
  
  public static int Sr(String paramString)
  {
    if (bi.oW(paramString)) {
      return 0;
    }
    return St(b.Sp(paramString));
  }
  
  public static int Ss(String paramString)
  {
    if (bi.oW(paramString)) {
      return 0;
    }
    if (qtE.bb(paramString)) {
      return ((Integer)qtE.get(paramString)).intValue();
    }
    int i = St(paramString);
    qtE.put(paramString, Integer.valueOf(i));
    return i;
  }
  
  private static int St(String paramString)
  {
    if (bi.oW(paramString)) {
      return 0;
    }
    int j = 0;
    int i = 0;
    if (j < paramString.length())
    {
      if (paramString.charAt(j) <= '') {}
      for (int k = 1;; k = 2)
      {
        j += 1;
        i = k + i;
        break;
      }
    }
    return i;
  }
  
  public static String Su(String paramString)
  {
    paramString = Pattern.compile("wx-b>", 2).matcher(paramString).replaceAll("wa-b>");
    paramString = Pattern.compile("</wx-li>", 2).matcher(paramString).replaceAll("<br/>");
    paramString = Pattern.compile("</wn-todo>", 2).matcher(paramString).replaceAll("<br/>");
    paramString = Pattern.compile("<[/]?w(x|n)-[^>]*>", 2).matcher(paramString).replaceAll("");
    return Pattern.compile("wa-b>", 2).matcher(paramString).replaceAll("wx-b>");
  }
  
  /* Error */
  public static String Sv(String paramString)
  {
    // Byte code:
    //   0: new 131	java/io/FileInputStream
    //   3: dup
    //   4: new 133	java/io/File
    //   7: dup
    //   8: aload_0
    //   9: invokespecial 136	java/io/File:<init>	(Ljava/lang/String;)V
    //   12: invokespecial 139	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   15: astore_1
    //   16: aload_1
    //   17: astore_0
    //   18: aload_1
    //   19: invokevirtual 142	java/io/FileInputStream:available	()I
    //   22: newarray <illegal type>
    //   24: astore_2
    //   25: aload_1
    //   26: astore_0
    //   27: aload_1
    //   28: aload_2
    //   29: invokevirtual 146	java/io/FileInputStream:read	([B)I
    //   32: pop
    //   33: aload_1
    //   34: astore_0
    //   35: new 85	java/lang/String
    //   38: dup
    //   39: aload_2
    //   40: ldc -108
    //   42: invokespecial 151	java/lang/String:<init>	([BLjava/lang/String;)V
    //   45: astore_2
    //   46: aload_1
    //   47: invokevirtual 154	java/io/FileInputStream:close	()V
    //   50: aload_2
    //   51: areturn
    //   52: astore_0
    //   53: ldc -100
    //   55: aload_0
    //   56: ldc 122
    //   58: iconst_0
    //   59: anewarray 4	java/lang/Object
    //   62: invokestatic 162	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   65: aload_2
    //   66: areturn
    //   67: astore_2
    //   68: aconst_null
    //   69: astore_1
    //   70: aload_1
    //   71: astore_0
    //   72: ldc -100
    //   74: ldc -92
    //   76: iconst_1
    //   77: anewarray 4	java/lang/Object
    //   80: dup
    //   81: iconst_0
    //   82: aload_2
    //   83: invokevirtual 168	java/io/FileNotFoundException:toString	()Ljava/lang/String;
    //   86: aastore
    //   87: invokestatic 172	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   90: aload_1
    //   91: ifnull +7 -> 98
    //   94: aload_1
    //   95: invokevirtual 154	java/io/FileInputStream:close	()V
    //   98: ldc 122
    //   100: areturn
    //   101: astore_0
    //   102: ldc -100
    //   104: aload_0
    //   105: ldc 122
    //   107: iconst_0
    //   108: anewarray 4	java/lang/Object
    //   111: invokestatic 162	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   114: goto -16 -> 98
    //   117: astore_2
    //   118: aconst_null
    //   119: astore_1
    //   120: aload_1
    //   121: astore_0
    //   122: ldc -100
    //   124: ldc -82
    //   126: iconst_1
    //   127: anewarray 4	java/lang/Object
    //   130: dup
    //   131: iconst_0
    //   132: aload_2
    //   133: invokevirtual 175	java/io/IOException:toString	()Ljava/lang/String;
    //   136: aastore
    //   137: invokestatic 172	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   140: aload_1
    //   141: ifnull -43 -> 98
    //   144: aload_1
    //   145: invokevirtual 154	java/io/FileInputStream:close	()V
    //   148: goto -50 -> 98
    //   151: astore_0
    //   152: ldc -100
    //   154: aload_0
    //   155: ldc 122
    //   157: iconst_0
    //   158: anewarray 4	java/lang/Object
    //   161: invokestatic 162	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   164: goto -66 -> 98
    //   167: astore_2
    //   168: aconst_null
    //   169: astore_1
    //   170: aload_1
    //   171: astore_0
    //   172: ldc -100
    //   174: ldc -79
    //   176: iconst_1
    //   177: anewarray 4	java/lang/Object
    //   180: dup
    //   181: iconst_0
    //   182: aload_2
    //   183: invokevirtual 178	java/lang/Exception:toString	()Ljava/lang/String;
    //   186: aastore
    //   187: invokestatic 172	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   190: aload_1
    //   191: ifnull -93 -> 98
    //   194: aload_1
    //   195: invokevirtual 154	java/io/FileInputStream:close	()V
    //   198: goto -100 -> 98
    //   201: astore_0
    //   202: ldc -100
    //   204: aload_0
    //   205: ldc 122
    //   207: iconst_0
    //   208: anewarray 4	java/lang/Object
    //   211: invokestatic 162	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   214: goto -116 -> 98
    //   217: astore_1
    //   218: aconst_null
    //   219: astore_0
    //   220: aload_0
    //   221: ifnull +7 -> 228
    //   224: aload_0
    //   225: invokevirtual 154	java/io/FileInputStream:close	()V
    //   228: aload_1
    //   229: athrow
    //   230: astore_0
    //   231: ldc -100
    //   233: aload_0
    //   234: ldc 122
    //   236: iconst_0
    //   237: anewarray 4	java/lang/Object
    //   240: invokestatic 162	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   243: goto -15 -> 228
    //   246: astore_1
    //   247: goto -27 -> 220
    //   250: astore_2
    //   251: goto -81 -> 170
    //   254: astore_2
    //   255: goto -135 -> 120
    //   258: astore_2
    //   259: goto -189 -> 70
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	262	0	paramString	String
    //   15	180	1	localFileInputStream	java.io.FileInputStream
    //   217	12	1	localObject1	Object
    //   246	1	1	localObject2	Object
    //   24	42	2	localObject3	Object
    //   67	16	2	localFileNotFoundException1	java.io.FileNotFoundException
    //   117	16	2	localIOException1	java.io.IOException
    //   167	16	2	localException1	Exception
    //   250	1	2	localException2	Exception
    //   254	1	2	localIOException2	java.io.IOException
    //   258	1	2	localFileNotFoundException2	java.io.FileNotFoundException
    // Exception table:
    //   from	to	target	type
    //   46	50	52	java/io/IOException
    //   0	16	67	java/io/FileNotFoundException
    //   94	98	101	java/io/IOException
    //   0	16	117	java/io/IOException
    //   144	148	151	java/io/IOException
    //   0	16	167	java/lang/Exception
    //   194	198	201	java/io/IOException
    //   0	16	217	finally
    //   224	228	230	java/io/IOException
    //   18	25	246	finally
    //   27	33	246	finally
    //   35	46	246	finally
    //   72	90	246	finally
    //   122	140	246	finally
    //   172	190	246	finally
    //   18	25	250	java/lang/Exception
    //   27	33	250	java/lang/Exception
    //   35	46	250	java/lang/Exception
    //   18	25	254	java/io/IOException
    //   27	33	254	java/io/IOException
    //   35	46	254	java/io/IOException
    //   18	25	258	java/io/FileNotFoundException
    //   27	33	258	java/io/FileNotFoundException
    //   35	46	258	java/io/FileNotFoundException
  }
  
  public static String a(Context paramContext, com.tencent.mm.plugin.wenote.model.a.b paramb)
  {
    if (paramb == null) {
      return "";
    }
    int i = paramb.getType();
    if (i == 1) {
      return ((h)paramb).content;
    }
    if (i == 3) {
      return paramContext.getString(R.l.wenote_placeholder_location);
    }
    if (i == 2) {
      return paramContext.getString(R.l.wenote_placeholder_image);
    }
    if (i == 6) {
      return paramContext.getString(R.l.wenote_placeholder_video);
    }
    if (i == 4) {
      return paramContext.getString(R.l.wenote_placeholder_voice);
    }
    if (i == 5) {
      return paramContext.getString(R.l.wenote_placeholder_file);
    }
    return "";
  }
  
  public static com.tencent.mm.plugin.wenote.model.a.b c(com.tencent.mm.plugin.wenote.model.a.b paramb)
  {
    if (paramb == null) {
      return null;
    }
    Object localObject1;
    switch (paramb.getType())
    {
    case 0: 
    default: 
      localObject1 = null;
    }
    while (localObject1 == null)
    {
      return null;
      localObject1 = new h();
      ((h)localObject1).content = ((h)paramb).content;
      continue;
      localObject1 = new com.tencent.mm.plugin.wenote.model.a.f();
      Object localObject2 = (com.tencent.mm.plugin.wenote.model.a.f)localObject1;
      Object localObject3 = (com.tencent.mm.plugin.wenote.model.a.f)paramb;
      ((com.tencent.mm.plugin.wenote.model.a.f)localObject2).lat = ((com.tencent.mm.plugin.wenote.model.a.f)localObject3).lat;
      ((com.tencent.mm.plugin.wenote.model.a.f)localObject2).lng = ((com.tencent.mm.plugin.wenote.model.a.f)localObject3).lng;
      ((com.tencent.mm.plugin.wenote.model.a.f)localObject2).qpq = ((com.tencent.mm.plugin.wenote.model.a.f)localObject3).qpq;
      ((com.tencent.mm.plugin.wenote.model.a.f)localObject2).dRH = ((com.tencent.mm.plugin.wenote.model.a.f)localObject3).dRH;
      ((com.tencent.mm.plugin.wenote.model.a.f)localObject2).kFa = ((com.tencent.mm.plugin.wenote.model.a.f)localObject3).kFa;
      continue;
      localObject1 = new com.tencent.mm.plugin.wenote.model.a.e();
      ((com.tencent.mm.plugin.wenote.model.a.e)localObject1).qpe = ((com.tencent.mm.plugin.wenote.model.a.e)paramb).qpe;
      continue;
      localObject1 = new j();
      localObject2 = (j)localObject1;
      localObject3 = (j)paramb;
      ((j)localObject2).bOX = ((j)localObject3).bOX;
      ((j)localObject2).duration = ((j)localObject3).duration;
      ((j)localObject2).qoT = ((j)localObject3).qoT;
      continue;
      localObject1 = new k();
      localObject2 = (k)localObject1;
      localObject3 = (k)paramb;
      ((k)localObject2).qpt = ((k)localObject3).qpt;
      ((k)localObject2).length = ((k)localObject3).length;
      ((k)localObject2).qps = ((k)localObject3).qps;
      ((k)localObject2).fTs = ((k)localObject3).fTs;
      ((k)localObject2).bOT = ((k)localObject3).bOT;
      ((k)localObject2).bOS = ((k)localObject3).bOS;
      ((k)localObject2).qoT = ((k)localObject3).qoT;
      continue;
      localObject1 = new com.tencent.mm.plugin.wenote.model.a.c();
      localObject2 = (com.tencent.mm.plugin.wenote.model.a.c)localObject1;
      localObject3 = (com.tencent.mm.plugin.wenote.model.a.c)paramb;
      ((com.tencent.mm.plugin.wenote.model.a.c)localObject2).title = ((com.tencent.mm.plugin.wenote.model.a.c)localObject3).title;
      ((com.tencent.mm.plugin.wenote.model.a.c)localObject2).content = ((com.tencent.mm.plugin.wenote.model.a.c)localObject3).content;
      ((com.tencent.mm.plugin.wenote.model.a.c)localObject2).fTs = ((com.tencent.mm.plugin.wenote.model.a.c)localObject3).fTs;
      ((com.tencent.mm.plugin.wenote.model.a.c)localObject2).qoT = ((com.tencent.mm.plugin.wenote.model.a.c)localObject3).qoT;
      continue;
      localObject1 = new com.tencent.mm.plugin.wenote.model.a.g();
    }
    ((n)localObject1).type = ((n)paramb).type;
    ((n)localObject1).qpd = ((n)paramb).qpd;
    ((n)localObject1).bVd = ((n)paramb).bVd;
    return (com.tencent.mm.plugin.wenote.model.a.b)localObject1;
  }
  
  public static int d(String paramString, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    if (bi.oW(paramString)) {
      return 0;
    }
    paramString = a.Sk(paramString);
    if (paramString == null) {
      return 0;
    }
    if (paramBoolean) {
      paramInt2 = paramString.length();
    }
    if ((paramInt1 < 0) || (paramInt1 > paramString.length()) || (paramInt2 < 0) || (paramInt2 > paramString.length()) || (paramInt1 > paramInt2)) {
      return 0;
    }
    paramString = (Spanned)paramString.subSequence(paramInt1, paramInt2);
    if (paramString == null) {
      return 0;
    }
    return St(paramString.toString());
  }
  
  public static String d(com.tencent.mm.plugin.wenote.model.a.b paramb)
  {
    if (paramb == null) {
      return "";
    }
    if (paramb.getType() == 2) {
      return ((com.tencent.mm.plugin.wenote.model.a.e)paramb).qpe;
    }
    return ((n)paramb).bVd;
  }
  
  public static String e(com.tencent.mm.plugin.wenote.model.a.b paramb)
  {
    if (paramb == null) {
      return "";
    }
    if (paramb.getType() == 2) {
      return ((com.tencent.mm.plugin.wenote.model.a.e)paramb).bVd;
    }
    if (paramb.getType() == 6) {
      return ((j)paramb).bOX;
    }
    return "";
  }
  
  public static String fw(String paramString1, String paramString2)
  {
    int j = 1280;
    if (bi.oW(paramString2))
    {
      paramString2 = com.tencent.mm.a.g.u(new StringBuilder().append(paramString1).append(System.currentTimeMillis()).toString().getBytes()) + "_HD";
      paramString2 = an.aLU() + "/" + paramString2;
    }
    for (;;)
    {
      Object localObject = paramString2;
      if (!com.tencent.mm.a.e.cn(paramString2))
      {
        localObject = com.tencent.mm.sdk.platformtools.c.VZ(paramString1);
        if ((localObject == null) || (((BitmapFactory.Options)localObject).outWidth <= 0) || (((BitmapFactory.Options)localObject).outHeight <= 0))
        {
          x.e("MicroMsg.WNNoteUtil", "GetImageOptions Error");
          localObject = null;
        }
      }
      else
      {
        return (String)localObject;
      }
      int k = ((BitmapFactory.Options)localObject).outHeight;
      int m = ((BitmapFactory.Options)localObject).outWidth;
      int i = m;
      if (m > 1280) {
        i = 1280;
      }
      if (k > 1280) {}
      for (;;)
      {
        if (((BitmapFactory.Options)localObject).outHeight < ((BitmapFactory.Options)localObject).outWidth) {}
        for (;;)
        {
          if (z.Wn(paramString1) > 0)
          {
            i = ((BitmapFactory.Options)localObject).outHeight;
            j = ((BitmapFactory.Options)localObject).outWidth;
          }
          for (;;)
          {
            com.tencent.mm.sdk.platformtools.c.c(paramString1, i, j, Bitmap.CompressFormat.JPEG, 95, paramString2);
            return paramString2;
          }
          k = i;
          i = j;
          j = k;
        }
        j = k;
      }
    }
  }
  
  public static String fx(String paramString1, String paramString2)
  {
    int m = 800;
    if (bi.oW(paramString2))
    {
      paramString2 = com.tencent.mm.a.g.u(new StringBuilder().append(paramString1).append(System.currentTimeMillis()).toString().getBytes()) + "_TH";
      paramString2 = an.aLU() + "/" + paramString2;
    }
    for (;;)
    {
      Object localObject = paramString2;
      if (!com.tencent.mm.a.e.cn(paramString2))
      {
        localObject = com.tencent.mm.sdk.platformtools.c.VZ(paramString1);
        if ((localObject == null) || (((BitmapFactory.Options)localObject).outWidth <= 0) || (((BitmapFactory.Options)localObject).outHeight <= 0))
        {
          x.e("MicroMsg.WNNoteUtil", "GetImageOptions Error,use orignal file");
          localObject = null;
        }
      }
      else
      {
        return (String)localObject;
      }
      int j = ((BitmapFactory.Options)localObject).outHeight;
      int k = ((BitmapFactory.Options)localObject).outWidth;
      while (k * j > 2764800)
      {
        k >>= 1;
        j >>= 1;
      }
      int i = k;
      if (k > 800) {
        i = 800;
      }
      if (j > 800) {
        j = m;
      }
      for (;;)
      {
        if (((BitmapFactory.Options)localObject).outHeight < ((BitmapFactory.Options)localObject).outWidth) {}
        for (;;)
        {
          com.tencent.mm.sdk.platformtools.c.c(paramString1, i, j, Bitmap.CompressFormat.JPEG, 95, paramString2);
          return paramString2;
          k = i;
          i = j;
          j = k;
        }
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/wenote/b/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */