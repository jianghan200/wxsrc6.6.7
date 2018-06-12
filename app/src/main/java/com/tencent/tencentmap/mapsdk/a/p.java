package com.tencent.tencentmap.mapsdk.a;

import android.content.Context;
import android.content.res.AssetManager;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class p
{
  private static String a;
  private static String b;
  
  public static final InputStream a(Context paramContext, String paramString)
  {
    return a(paramContext, "tencentmap/mapsdk_vector/", paramString);
  }
  
  public static final InputStream a(Context paramContext, String paramString1, String paramString2)
  {
    return b(paramContext, paramString1 + paramString2);
  }
  
  public static String a()
  {
    return a;
  }
  
  public static void a(Context paramContext, String paramString1, String paramString2, String paramString3)
  {
    if (!new File(paramString1, paramString2).exists()) {
      c(paramContext, paramString1, paramString2, paramString3);
    }
  }
  
  public static void a(String paramString)
  {
    if ((paramString != null) && (paramString.trim().length() != 0))
    {
      String str = paramString;
      if (!paramString.endsWith(File.separator)) {
        str = paramString + File.separator;
      }
      a = str;
    }
  }
  
  public static final InputStream b(Context paramContext, String paramString)
  {
    if (paramContext == null) {}
    do
    {
      return null;
      paramContext = paramContext.getAssets();
    } while (paramContext == null);
    try
    {
      paramContext = paramContext.open(paramString);
      return paramContext;
    }
    catch (IOException paramContext) {}
    return null;
  }
  
  public static String b()
  {
    return b;
  }
  
  public static void b(Context paramContext, String paramString1, String paramString2, String paramString3)
  {
    File localFile = new File(paramString1, paramString2);
    if (localFile.exists()) {
      localFile.delete();
    }
    c(paramContext, paramString1, paramString2, paramString3);
  }
  
  public static void b(String paramString)
  {
    if ((paramString != null) && (paramString.trim().length() != 0))
    {
      String str = paramString;
      if (!paramString.endsWith(File.separator)) {
        str = paramString + File.separator;
      }
      b = str;
    }
  }
  
  /* Error */
  private static void c(Context paramContext, String paramString1, String paramString2, String paramString3)
  {
    // Byte code:
    //   0: new 16	java/lang/StringBuilder
    //   3: dup
    //   4: invokespecial 20	java/lang/StringBuilder:<init>	()V
    //   7: aload_0
    //   8: invokestatic 86	com/tencent/tencentmap/mapsdk/a/o:a	(Landroid/content/Context;)Lcom/tencent/tencentmap/mapsdk/a/o;
    //   11: invokevirtual 89	com/tencent/tencentmap/mapsdk/a/o:i	()Ljava/lang/String;
    //   14: invokevirtual 24	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   17: aload_3
    //   18: invokevirtual 24	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   21: invokevirtual 28	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   24: invokestatic 93	com/tencent/tencentmap/mapsdk/a/q:b	(Ljava/lang/String;)Ljava/io/InputStream;
    //   27: astore 4
    //   29: aload 4
    //   31: astore 5
    //   33: aload 4
    //   35: ifnonnull +51 -> 86
    //   38: aload 4
    //   40: astore 6
    //   42: aload 4
    //   44: astore 7
    //   46: getstatic 32	com/tencent/tencentmap/mapsdk/a/p:a	Ljava/lang/String;
    //   49: ifnull +103 -> 152
    //   52: aload 4
    //   54: astore 6
    //   56: aload 4
    //   58: astore 7
    //   60: aload_0
    //   61: new 16	java/lang/StringBuilder
    //   64: dup
    //   65: invokespecial 20	java/lang/StringBuilder:<init>	()V
    //   68: getstatic 32	com/tencent/tencentmap/mapsdk/a/p:a	Ljava/lang/String;
    //   71: invokevirtual 24	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   74: aload_3
    //   75: invokevirtual 24	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   78: invokevirtual 28	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   81: invokestatic 30	com/tencent/tencentmap/mapsdk/a/p:b	(Landroid/content/Context;Ljava/lang/String;)Ljava/io/InputStream;
    //   84: astore 5
    //   86: aload 5
    //   88: astore 4
    //   90: aload 5
    //   92: ifnonnull +18 -> 110
    //   95: aload 5
    //   97: astore 6
    //   99: aload 5
    //   101: astore 7
    //   103: aload_0
    //   104: aload_3
    //   105: invokestatic 95	com/tencent/tencentmap/mapsdk/a/p:a	(Landroid/content/Context;Ljava/lang/String;)Ljava/io/InputStream;
    //   108: astore 4
    //   110: aload 4
    //   112: astore 6
    //   114: aload 4
    //   116: astore 7
    //   118: new 97	java/io/FileOutputStream
    //   121: dup
    //   122: new 35	java/io/File
    //   125: dup
    //   126: aload_1
    //   127: aload_2
    //   128: invokespecial 38	java/io/File:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   131: invokespecial 100	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   134: astore_0
    //   135: aload 4
    //   137: aload_0
    //   138: invokestatic 103	com/tencent/tencentmap/mapsdk/a/q:a	(Ljava/io/InputStream;Ljava/io/OutputStream;)J
    //   141: pop2
    //   142: aload_0
    //   143: invokestatic 106	com/tencent/tencentmap/mapsdk/a/q:a	(Ljava/io/Closeable;)V
    //   146: aload 4
    //   148: invokestatic 106	com/tencent/tencentmap/mapsdk/a/q:a	(Ljava/io/Closeable;)V
    //   151: return
    //   152: aload 4
    //   154: astore 5
    //   156: aload 4
    //   158: astore 6
    //   160: aload 4
    //   162: astore 7
    //   164: getstatic 78	com/tencent/tencentmap/mapsdk/a/p:b	Ljava/lang/String;
    //   167: ifnull -81 -> 86
    //   170: aload 4
    //   172: astore 6
    //   174: aload 4
    //   176: astore 7
    //   178: new 16	java/lang/StringBuilder
    //   181: dup
    //   182: invokespecial 20	java/lang/StringBuilder:<init>	()V
    //   185: getstatic 78	com/tencent/tencentmap/mapsdk/a/p:b	Ljava/lang/String;
    //   188: invokevirtual 24	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   191: aload_3
    //   192: invokevirtual 24	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   195: invokevirtual 28	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   198: invokestatic 93	com/tencent/tencentmap/mapsdk/a/q:b	(Ljava/lang/String;)Ljava/io/InputStream;
    //   201: astore 5
    //   203: goto -117 -> 86
    //   206: astore_0
    //   207: aconst_null
    //   208: astore_0
    //   209: aconst_null
    //   210: astore 4
    //   212: aload_0
    //   213: invokestatic 106	com/tencent/tencentmap/mapsdk/a/q:a	(Ljava/io/Closeable;)V
    //   216: aload 4
    //   218: invokestatic 106	com/tencent/tencentmap/mapsdk/a/q:a	(Ljava/io/Closeable;)V
    //   221: return
    //   222: astore_0
    //   223: aconst_null
    //   224: astore_1
    //   225: aconst_null
    //   226: astore 4
    //   228: aload_1
    //   229: invokestatic 106	com/tencent/tencentmap/mapsdk/a/q:a	(Ljava/io/Closeable;)V
    //   232: aload 4
    //   234: invokestatic 106	com/tencent/tencentmap/mapsdk/a/q:a	(Ljava/io/Closeable;)V
    //   237: aload_0
    //   238: athrow
    //   239: astore_0
    //   240: aconst_null
    //   241: astore_1
    //   242: aload 6
    //   244: astore 4
    //   246: goto -18 -> 228
    //   249: astore_1
    //   250: aload_0
    //   251: astore_2
    //   252: aload_1
    //   253: astore_0
    //   254: aload_2
    //   255: astore_1
    //   256: goto -28 -> 228
    //   259: astore_0
    //   260: aconst_null
    //   261: astore_0
    //   262: aload 7
    //   264: astore 4
    //   266: goto -54 -> 212
    //   269: astore_1
    //   270: goto -58 -> 212
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	273	0	paramContext	Context
    //   0	273	1	paramString1	String
    //   0	273	2	paramString2	String
    //   0	273	3	paramString3	String
    //   27	238	4	localObject1	Object
    //   31	171	5	localObject2	Object
    //   40	203	6	localObject3	Object
    //   44	219	7	localObject4	Object
    // Exception table:
    //   from	to	target	type
    //   0	29	206	java/io/IOException
    //   0	29	222	finally
    //   46	52	239	finally
    //   60	86	239	finally
    //   103	110	239	finally
    //   118	135	239	finally
    //   164	170	239	finally
    //   178	203	239	finally
    //   135	142	249	finally
    //   46	52	259	java/io/IOException
    //   60	86	259	java/io/IOException
    //   103	110	259	java/io/IOException
    //   118	135	259	java/io/IOException
    //   164	170	259	java/io/IOException
    //   178	203	259	java/io/IOException
    //   135	142	269	java/io/IOException
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */