package com.tencent.mm.plugin.voip.b;

import android.app.Notification;
import android.app.Notification.Builder;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Environment;
import android.widget.Toast;
import com.tencent.mm.g.a.au;
import com.tencent.mm.g.a.au.a;
import com.tencent.mm.g.a.ax;
import com.tencent.mm.g.a.ax.a;
import com.tencent.mm.g.a.bg;
import com.tencent.mm.g.a.bg.a;
import com.tencent.mm.g.a.su;
import com.tencent.mm.g.a.su.b;
import com.tencent.mm.k.e;
import com.tencent.mm.k.g;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public final class d
{
  public static Context oSX = null;
  private static final String oSY;
  private static final Uri oSZ = Uri.parse("content://com.lbe.security.miui.permmgr/active");
  
  static
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("VERSION.RELEASE:[" + Build.VERSION.RELEASE);
    localStringBuilder.append("] VERSION.CODENAME:[" + Build.VERSION.CODENAME);
    localStringBuilder.append("] VERSION.INCREMENTAL:[" + Build.VERSION.INCREMENTAL);
    localStringBuilder.append("] BOARD:[" + Build.BOARD);
    localStringBuilder.append("] DEVICE:[" + Build.DEVICE);
    localStringBuilder.append("] DISPLAY:[" + Build.DISPLAY);
    localStringBuilder.append("] FINGERPRINT:[" + Build.FINGERPRINT);
    localStringBuilder.append("] HOST:[" + Build.HOST);
    localStringBuilder.append("] MANUFACTURER:[" + Build.MANUFACTURER);
    localStringBuilder.append("] MODEL:[" + Build.MODEL);
    localStringBuilder.append("] PRODUCT:[" + Build.PRODUCT);
    localStringBuilder.append("] TAGS:[" + Build.TAGS);
    localStringBuilder.append("] TYPE:[" + Build.TYPE);
    localStringBuilder.append("] USER:[" + Build.USER + "]");
    oSY = localStringBuilder.toString();
  }
  
  public static void O(Context paramContext, int paramInt)
  {
    Toast.makeText(paramContext, paramInt, 0).show();
  }
  
  public static Notification a(Notification.Builder paramBuilder)
  {
    if (com.tencent.mm.compatible.util.d.fS(16)) {
      return paramBuilder.getNotification();
    }
    return paramBuilder.build();
  }
  
  public static boolean bLP()
  {
    return true;
  }
  
  public static int bLQ()
  {
    return Build.VERSION.SDK_INT;
  }
  
  private static boolean bLR()
  {
    boolean bool2 = false;
    for (;;)
    {
      try
      {
        Object localObject2 = new Properties();
        FileInputStream localFileInputStream = new FileInputStream(new File(Environment.getRootDirectory(), "build.prop"));
        boolean bool3;
        bool1 = bool2;
      }
      catch (IOException localIOException1)
      {
        try
        {
          ((Properties)localObject2).load(localFileInputStream);
          localObject2 = ((Properties)localObject2).getProperty("ro.miui.ui.version.name", null);
          bool1 = bool2;
          if (localObject2 != null)
          {
            bool3 = ((String)localObject2).equals("V6");
            bool1 = bool2;
            if (bool3) {
              bool1 = true;
            }
          }
          x.d("VoipUtil", "isMIUIv6 " + bool1);
          return bool1;
        }
        catch (IOException localIOException3)
        {
          boolean bool1;
          Object localObject1;
          for (;;) {}
        }
        localIOException1 = localIOException1;
        localObject1 = null;
      }
      if (localObject1 != null) {
        try
        {
          ((FileInputStream)localObject1).close();
          bool1 = bool2;
        }
        catch (IOException localIOException2)
        {
          bool1 = bool2;
        }
      }
    }
  }
  
  public static boolean bLS()
  {
    ax localax = new ax();
    a.sFg.m(localax);
    return localax.bIs.bwu;
  }
  
  public static boolean bLT()
  {
    su localsu = new su();
    localsu.cdE.bOh = 2;
    a.sFg.m(localsu);
    return localsu.cdF.cdG;
  }
  
  public static boolean bLU()
  {
    bg localbg = new bg();
    a.sFg.m(localbg);
    return localbg.bIM.bwu;
  }
  
  public static boolean bLV()
  {
    au localau = new au();
    a.sFg.m(localau);
    return localau.bIm.bIn;
  }
  
  public static boolean em(Context paramContext)
  {
    boolean bool = false;
    if (bLR() == true) {
      bool = ep(paramContext);
    }
    x.d("VoipUtil", "isLbePermissionEnable ret:" + bool);
    return bool;
  }
  
  public static boolean en(Context paramContext)
  {
    boolean bool = false;
    if (bLR() == true) {
      bool = eo(paramContext);
    }
    x.d("VoipUtil", "setLbePermissionEnable ret:" + bool);
    return bool;
  }
  
  /* Error */
  private static boolean eo(Context paramContext)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 306	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   4: astore_0
    //   5: aload_0
    //   6: getstatic 118	com/tencent/mm/plugin/voip/b/d:oSZ	Landroid/net/Uri;
    //   9: iconst_1
    //   10: anewarray 193	java/lang/String
    //   13: dup
    //   14: iconst_0
    //   15: ldc_w 308
    //   18: aastore
    //   19: ldc_w 310
    //   22: aconst_null
    //   23: aconst_null
    //   24: invokevirtual 316	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   27: astore 6
    //   29: aload 6
    //   31: ifnull +349 -> 380
    //   34: aload 6
    //   36: astore 5
    //   38: aload 6
    //   40: invokeinterface 321 1 0
    //   45: ifle +335 -> 380
    //   48: aload 6
    //   50: astore 5
    //   52: aload 6
    //   54: invokeinterface 324 1 0
    //   59: ifeq +321 -> 380
    //   62: aload 6
    //   64: astore 5
    //   66: aload 6
    //   68: iconst_0
    //   69: invokeinterface 328 2 0
    //   74: istore_2
    //   75: aload_0
    //   76: astore 4
    //   78: iload_2
    //   79: istore_1
    //   80: aload 6
    //   82: ifnull +15 -> 97
    //   85: aload 6
    //   87: invokeinterface 329 1 0
    //   92: iload_2
    //   93: istore_1
    //   94: aload_0
    //   95: astore 4
    //   97: ldc -57
    //   99: ldc_w 331
    //   102: iconst_3
    //   103: anewarray 4	java/lang/Object
    //   106: dup
    //   107: iconst_0
    //   108: iload_1
    //   109: invokestatic 337	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   112: aastore
    //   113: dup
    //   114: iconst_1
    //   115: ldc_w 339
    //   118: aastore
    //   119: dup
    //   120: iconst_2
    //   121: ldc_w 340
    //   124: invokestatic 337	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   127: aastore
    //   128: invokestatic 343	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   131: iconst_m1
    //   132: istore_2
    //   133: iload_1
    //   134: iconst_m1
    //   135: if_icmpeq +235 -> 370
    //   138: aload 4
    //   140: ifnull +230 -> 370
    //   143: iload_1
    //   144: ldc_w 340
    //   147: ior
    //   148: istore_3
    //   149: new 345	android/content/ContentValues
    //   152: dup
    //   153: invokespecial 346	android/content/ContentValues:<init>	()V
    //   156: astore_0
    //   157: aload_0
    //   158: ldc_w 308
    //   161: iload_3
    //   162: invokestatic 337	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   165: invokevirtual 350	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   168: aload 4
    //   170: getstatic 118	com/tencent/mm/plugin/voip/b/d:oSZ	Landroid/net/Uri;
    //   173: aload_0
    //   174: ldc_w 310
    //   177: aconst_null
    //   178: invokevirtual 354	android/content/ContentResolver:update	(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    //   181: istore_1
    //   182: ldc -57
    //   184: ldc_w 356
    //   187: iconst_5
    //   188: anewarray 4	java/lang/Object
    //   191: dup
    //   192: iconst_0
    //   193: iload_3
    //   194: invokestatic 337	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   197: aastore
    //   198: dup
    //   199: iconst_1
    //   200: ldc_w 339
    //   203: aastore
    //   204: dup
    //   205: iconst_2
    //   206: ldc_w 340
    //   209: invokestatic 337	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   212: aastore
    //   213: dup
    //   214: iconst_3
    //   215: ldc_w 358
    //   218: aastore
    //   219: dup
    //   220: iconst_4
    //   221: iload_1
    //   222: invokestatic 337	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   225: aastore
    //   226: invokestatic 343	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   229: iload_1
    //   230: ifle +105 -> 335
    //   233: iconst_1
    //   234: ireturn
    //   235: astore 7
    //   237: aconst_null
    //   238: astore_0
    //   239: aconst_null
    //   240: astore 4
    //   242: aload_0
    //   243: astore 5
    //   245: ldc -57
    //   247: ldc_w 360
    //   250: iconst_2
    //   251: anewarray 4	java/lang/Object
    //   254: dup
    //   255: iconst_0
    //   256: aload 7
    //   258: aastore
    //   259: dup
    //   260: iconst_1
    //   261: ldc_w 340
    //   264: invokestatic 337	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   267: aastore
    //   268: invokestatic 363	com/tencent/mm/sdk/platformtools/x:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   271: aload_0
    //   272: ifnull +103 -> 375
    //   275: aload_0
    //   276: invokeinterface 329 1 0
    //   281: iconst_m1
    //   282: istore_1
    //   283: goto -186 -> 97
    //   286: astore_0
    //   287: aconst_null
    //   288: astore 5
    //   290: aload 5
    //   292: ifnull +10 -> 302
    //   295: aload 5
    //   297: invokeinterface 329 1 0
    //   302: aload_0
    //   303: athrow
    //   304: astore_0
    //   305: iload_2
    //   306: istore_1
    //   307: ldc -57
    //   309: ldc_w 365
    //   312: iconst_2
    //   313: anewarray 4	java/lang/Object
    //   316: dup
    //   317: iconst_0
    //   318: aload_0
    //   319: aastore
    //   320: dup
    //   321: iconst_1
    //   322: ldc_w 340
    //   325: invokestatic 337	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   328: aastore
    //   329: invokestatic 363	com/tencent/mm/sdk/platformtools/x:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   332: goto -103 -> 229
    //   335: iconst_0
    //   336: ireturn
    //   337: astore_0
    //   338: goto -31 -> 307
    //   341: astore_0
    //   342: goto -52 -> 290
    //   345: astore 7
    //   347: aconst_null
    //   348: astore 5
    //   350: aload_0
    //   351: astore 4
    //   353: aload 5
    //   355: astore_0
    //   356: goto -114 -> 242
    //   359: astore 7
    //   361: aload_0
    //   362: astore 4
    //   364: aload 6
    //   366: astore_0
    //   367: goto -125 -> 242
    //   370: iconst_m1
    //   371: istore_1
    //   372: goto -143 -> 229
    //   375: iconst_m1
    //   376: istore_1
    //   377: goto -280 -> 97
    //   380: iconst_m1
    //   381: istore_2
    //   382: goto -307 -> 75
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	385	0	paramContext	Context
    //   79	298	1	i	int
    //   74	308	2	j	int
    //   148	46	3	k	int
    //   76	287	4	localContext	Context
    //   36	318	5	localObject	Object
    //   27	338	6	localCursor	android.database.Cursor
    //   235	22	7	localThrowable1	Throwable
    //   345	1	7	localThrowable2	Throwable
    //   359	1	7	localThrowable3	Throwable
    // Exception table:
    //   from	to	target	type
    //   0	5	235	java/lang/Throwable
    //   0	5	286	finally
    //   5	29	286	finally
    //   149	182	304	java/lang/Throwable
    //   182	229	337	java/lang/Throwable
    //   38	48	341	finally
    //   52	62	341	finally
    //   66	75	341	finally
    //   245	271	341	finally
    //   5	29	345	java/lang/Throwable
    //   38	48	359	java/lang/Throwable
    //   52	62	359	java/lang/Throwable
    //   66	75	359	java/lang/Throwable
  }
  
  /* Error */
  private static boolean ep(Context paramContext)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 306	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   4: getstatic 118	com/tencent/mm/plugin/voip/b/d:oSZ	Landroid/net/Uri;
    //   7: iconst_4
    //   8: anewarray 193	java/lang/String
    //   11: dup
    //   12: iconst_0
    //   13: ldc_w 367
    //   16: aastore
    //   17: dup
    //   18: iconst_1
    //   19: ldc_w 308
    //   22: aastore
    //   23: dup
    //   24: iconst_2
    //   25: ldc_w 369
    //   28: aastore
    //   29: dup
    //   30: iconst_3
    //   31: ldc_w 371
    //   34: aastore
    //   35: ldc_w 310
    //   38: aconst_null
    //   39: aconst_null
    //   40: invokevirtual 316	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   43: astore 6
    //   45: aload 6
    //   47: ifnull +141 -> 188
    //   50: aload 6
    //   52: astore_0
    //   53: aload 6
    //   55: invokeinterface 321 1 0
    //   60: ifle +128 -> 188
    //   63: aload 6
    //   65: astore_0
    //   66: aload 6
    //   68: invokeinterface 324 1 0
    //   73: ifeq +115 -> 188
    //   76: aload 6
    //   78: astore_0
    //   79: aload 6
    //   81: iconst_0
    //   82: invokeinterface 328 2 0
    //   87: istore_1
    //   88: aload 6
    //   90: astore_0
    //   91: aload 6
    //   93: iconst_1
    //   94: invokeinterface 328 2 0
    //   99: istore_2
    //   100: aload 6
    //   102: astore_0
    //   103: aload 6
    //   105: iconst_2
    //   106: invokeinterface 328 2 0
    //   111: istore_3
    //   112: aload 6
    //   114: astore_0
    //   115: aload 6
    //   117: iconst_3
    //   118: invokeinterface 328 2 0
    //   123: istore 4
    //   125: iload_1
    //   126: ldc_w 340
    //   129: iand
    //   130: ldc_w 340
    //   133: if_icmpne +20 -> 153
    //   136: iload_3
    //   137: ldc_w 340
    //   140: iand
    //   141: ifne +12 -> 153
    //   144: iload 4
    //   146: ldc_w 340
    //   149: iand
    //   150: ifeq +14 -> 164
    //   153: iload_2
    //   154: ldc_w 340
    //   157: iand
    //   158: ldc_w 340
    //   161: if_icmpne +21 -> 182
    //   164: iconst_1
    //   165: istore 5
    //   167: aload 6
    //   169: ifnull +10 -> 179
    //   172: aload 6
    //   174: invokeinterface 329 1 0
    //   179: iload 5
    //   181: ireturn
    //   182: iconst_0
    //   183: istore 5
    //   185: goto -18 -> 167
    //   188: aload 6
    //   190: ifnull +10 -> 200
    //   193: aload 6
    //   195: invokeinterface 329 1 0
    //   200: iconst_0
    //   201: ireturn
    //   202: astore 7
    //   204: aconst_null
    //   205: astore 6
    //   207: aload 6
    //   209: astore_0
    //   210: ldc_w 373
    //   213: ldc_w 375
    //   216: iconst_2
    //   217: anewarray 4	java/lang/Object
    //   220: dup
    //   221: iconst_0
    //   222: aload 7
    //   224: aastore
    //   225: dup
    //   226: iconst_1
    //   227: ldc_w 340
    //   230: invokestatic 337	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   233: aastore
    //   234: invokestatic 363	com/tencent/mm/sdk/platformtools/x:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   237: aload 6
    //   239: ifnull -39 -> 200
    //   242: aload 6
    //   244: invokeinterface 329 1 0
    //   249: goto -49 -> 200
    //   252: astore 6
    //   254: aconst_null
    //   255: astore_0
    //   256: aload_0
    //   257: ifnull +9 -> 266
    //   260: aload_0
    //   261: invokeinterface 329 1 0
    //   266: aload 6
    //   268: athrow
    //   269: astore 6
    //   271: goto -15 -> 256
    //   274: astore 7
    //   276: goto -69 -> 207
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	279	0	paramContext	Context
    //   87	43	1	i	int
    //   99	59	2	j	int
    //   111	30	3	k	int
    //   123	27	4	m	int
    //   165	19	5	bool	boolean
    //   43	200	6	localCursor	android.database.Cursor
    //   252	15	6	localObject1	Object
    //   269	1	6	localObject2	Object
    //   202	21	7	localThrowable1	Throwable
    //   274	1	7	localThrowable2	Throwable
    // Exception table:
    //   from	to	target	type
    //   0	45	202	java/lang/Throwable
    //   0	45	252	finally
    //   53	63	269	finally
    //   66	76	269	finally
    //   79	88	269	finally
    //   91	100	269	finally
    //   103	112	269	finally
    //   115	125	269	finally
    //   210	237	269	finally
    //   53	63	274	java/lang/Throwable
    //   66	76	274	java/lang/Throwable
    //   79	88	274	java/lang/Throwable
    //   91	100	274	java/lang/Throwable
    //   103	112	274	java/lang/Throwable
    //   115	125	274	java/lang/Throwable
  }
  
  public static int oH(String paramString)
  {
    try
    {
      int i = bi.getInt(g.AT().getValue(paramString), 0);
      return i;
    }
    catch (Exception localException)
    {
      x.e("VoipUtil", "getIntValFromDynamicConfig parseInt failed, val: " + paramString);
    }
    return 0;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/voip/b/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */