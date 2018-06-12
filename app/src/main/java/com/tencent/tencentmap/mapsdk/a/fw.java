package com.tencent.tencentmap.mapsdk.a;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import org.apache.http.HttpHost;
import org.apache.http.client.HttpClient;
import org.apache.http.params.HttpParams;

public class fw
{
  public static String a;
  public static String b;
  public static volatile boolean c = false;
  private static final String d = fw.class.getSimpleName();
  private static String e = "cmwap";
  private static String f = "3gwap";
  private static String g = "uniwap";
  private static String h = "ctwap";
  private static String i;
  private static Context j;
  private static volatile boolean k;
  private static String l;
  private static String m;
  private static volatile int n;
  private static int o;
  private static String p = "";
  
  static
  {
    a = "nonetwork";
    i = "wifi";
    k = true;
    b = "";
    l = "";
    m = "";
    n = 0;
    o = 0;
  }
  
  public static String a()
  {
    for (;;)
    {
      try
      {
        switch (n)
        {
        case 1: 
          str = "unknown";
          return str;
        }
      }
      finally {}
      String str = "ssid_" + l + m;
      continue;
      str = "apn_" + b;
      continue;
      str = "4Gapn_" + b;
    }
  }
  
  public static void a(Context paramContext)
  {
    try
    {
      j = paramContext;
      b();
      i();
      return;
    }
    catch (Throwable paramContext) {}
  }
  
  public static void a(HttpClient paramHttpClient)
  {
    if ((c) && (!TextUtils.isEmpty(p)))
    {
      HttpHost localHttpHost = new HttpHost(p, 80);
      paramHttpClient.getParams().setParameter("http.route.default-proxy", localHttpHost);
      fx.a(d, "setProxy... sProxyAddress:" + p + ",apn:" + b);
      return;
    }
    paramHttpClient.getParams().setParameter("http.route.default-proxy", null);
  }
  
  /* Error */
  public static boolean a(Integer paramInteger)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_3
    //   2: ldc 2
    //   4: monitorenter
    //   5: iload_3
    //   6: istore_2
    //   7: aload_0
    //   8: invokevirtual 151	java/lang/Integer:intValue	()I
    //   11: iconst_1
    //   12: if_icmpeq +25 -> 37
    //   15: iload_3
    //   16: istore_2
    //   17: aload_0
    //   18: invokevirtual 151	java/lang/Integer:intValue	()I
    //   21: iconst_2
    //   22: if_icmpeq +15 -> 37
    //   25: aload_0
    //   26: invokevirtual 151	java/lang/Integer:intValue	()I
    //   29: istore_1
    //   30: iload_1
    //   31: iconst_3
    //   32: if_icmpne +10 -> 42
    //   35: iload_3
    //   36: istore_2
    //   37: ldc 2
    //   39: monitorexit
    //   40: iload_2
    //   41: ireturn
    //   42: iconst_0
    //   43: istore_2
    //   44: goto -7 -> 37
    //   47: astore_0
    //   48: ldc 2
    //   50: monitorexit
    //   51: aload_0
    //   52: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	53	0	paramInteger	Integer
    //   29	4	1	i1	int
    //   6	38	2	bool1	boolean
    //   1	35	3	bool2	boolean
    // Exception table:
    //   from	to	target	type
    //   7	15	47	finally
    //   17	30	47	finally
  }
  
  /* Error */
  public static void b()
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: getstatic 34	com/tencent/tencentmap/mapsdk/a/fw:d	Ljava/lang/String;
    //   6: ldc -103
    //   8: invokestatic 155	com/tencent/tencentmap/mapsdk/a/fx:b	(Ljava/lang/String;Ljava/lang/String;)V
    //   11: getstatic 105	com/tencent/tencentmap/mapsdk/a/fw:j	Landroid/content/Context;
    //   14: ldc -99
    //   16: invokevirtual 163	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   19: checkcast 165	android/net/ConnectivityManager
    //   22: invokevirtual 169	android/net/ConnectivityManager:getActiveNetworkInfo	()Landroid/net/NetworkInfo;
    //   25: astore_1
    //   26: aload_1
    //   27: ifnonnull +35 -> 62
    //   30: ldc 62
    //   32: putstatic 64	com/tencent/tencentmap/mapsdk/a/fw:b	Ljava/lang/String;
    //   35: iconst_0
    //   36: putstatic 70	com/tencent/tencentmap/mapsdk/a/fw:n	I
    //   39: iconst_0
    //   40: putstatic 74	com/tencent/tencentmap/mapsdk/a/fw:c	Z
    //   43: ldc 62
    //   45: putstatic 76	com/tencent/tencentmap/mapsdk/a/fw:p	Ljava/lang/String;
    //   48: iconst_0
    //   49: putstatic 60	com/tencent/tencentmap/mapsdk/a/fw:k	Z
    //   52: getstatic 54	com/tencent/tencentmap/mapsdk/a/fw:a	Ljava/lang/String;
    //   55: putstatic 64	com/tencent/tencentmap/mapsdk/a/fw:b	Ljava/lang/String;
    //   58: ldc 2
    //   60: monitorexit
    //   61: return
    //   62: aload_1
    //   63: invokevirtual 175	android/net/NetworkInfo:isAvailable	()Z
    //   66: ifeq +75 -> 141
    //   69: aload_1
    //   70: invokevirtual 178	android/net/NetworkInfo:isConnected	()Z
    //   73: ifeq +68 -> 141
    //   76: iconst_1
    //   77: putstatic 60	com/tencent/tencentmap/mapsdk/a/fw:k	Z
    //   80: aload_1
    //   81: invokevirtual 181	android/net/NetworkInfo:getType	()I
    //   84: istore_0
    //   85: iload_0
    //   86: iconst_1
    //   87: if_icmpne +73 -> 160
    //   90: iconst_1
    //   91: putstatic 70	com/tencent/tencentmap/mapsdk/a/fw:n	I
    //   94: iconst_0
    //   95: putstatic 74	com/tencent/tencentmap/mapsdk/a/fw:c	Z
    //   98: ldc 62
    //   100: putstatic 76	com/tencent/tencentmap/mapsdk/a/fw:p	Ljava/lang/String;
    //   103: getstatic 105	com/tencent/tencentmap/mapsdk/a/fw:j	Landroid/content/Context;
    //   106: ldc 56
    //   108: invokevirtual 163	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   111: checkcast 183	android/net/wifi/WifiManager
    //   114: invokevirtual 187	android/net/wifi/WifiManager:getConnectionInfo	()Landroid/net/wifi/WifiInfo;
    //   117: astore_1
    //   118: aload_1
    //   119: invokevirtual 192	android/net/wifi/WifiInfo:getSSID	()Ljava/lang/String;
    //   122: putstatic 66	com/tencent/tencentmap/mapsdk/a/fw:l	Ljava/lang/String;
    //   125: aload_1
    //   126: invokevirtual 195	android/net/wifi/WifiInfo:getBSSID	()Ljava/lang/String;
    //   129: putstatic 68	com/tencent/tencentmap/mapsdk/a/fw:m	Ljava/lang/String;
    //   132: getstatic 58	com/tencent/tencentmap/mapsdk/a/fw:i	Ljava/lang/String;
    //   135: putstatic 64	com/tencent/tencentmap/mapsdk/a/fw:b	Ljava/lang/String;
    //   138: goto -80 -> 58
    //   141: iconst_0
    //   142: putstatic 60	com/tencent/tencentmap/mapsdk/a/fw:k	Z
    //   145: getstatic 54	com/tencent/tencentmap/mapsdk/a/fw:a	Ljava/lang/String;
    //   148: putstatic 64	com/tencent/tencentmap/mapsdk/a/fw:b	Ljava/lang/String;
    //   151: goto -71 -> 80
    //   154: astore_1
    //   155: ldc 2
    //   157: monitorexit
    //   158: aload_1
    //   159: athrow
    //   160: aload_1
    //   161: invokevirtual 198	android/net/NetworkInfo:getExtraInfo	()Ljava/lang/String;
    //   164: astore_2
    //   165: aload_2
    //   166: ifnonnull +24 -> 190
    //   169: ldc 62
    //   171: putstatic 64	com/tencent/tencentmap/mapsdk/a/fw:b	Ljava/lang/String;
    //   174: iconst_0
    //   175: putstatic 70	com/tencent/tencentmap/mapsdk/a/fw:n	I
    //   178: iconst_0
    //   179: putstatic 74	com/tencent/tencentmap/mapsdk/a/fw:c	Z
    //   182: ldc 62
    //   184: putstatic 76	com/tencent/tencentmap/mapsdk/a/fw:p	Ljava/lang/String;
    //   187: goto -129 -> 58
    //   190: aload_2
    //   191: invokevirtual 203	java/lang/String:trim	()Ljava/lang/String;
    //   194: invokevirtual 206	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   197: putstatic 64	com/tencent/tencentmap/mapsdk/a/fw:b	Ljava/lang/String;
    //   200: iload_0
    //   201: ifne +27 -> 228
    //   204: aload_1
    //   205: invokevirtual 209	android/net/NetworkInfo:getSubtype	()I
    //   208: istore_0
    //   209: iload_0
    //   210: iconst_1
    //   211: if_icmpeq +13 -> 224
    //   214: iload_0
    //   215: iconst_2
    //   216: if_icmpeq +8 -> 224
    //   219: iload_0
    //   220: iconst_4
    //   221: if_icmpne +40 -> 261
    //   224: iconst_2
    //   225: putstatic 70	com/tencent/tencentmap/mapsdk/a/fw:n	I
    //   228: invokestatic 212	com/tencent/tencentmap/mapsdk/a/fw:j	()Ljava/lang/Integer;
    //   231: invokevirtual 151	java/lang/Integer:intValue	()I
    //   234: putstatic 72	com/tencent/tencentmap/mapsdk/a/fw:o	I
    //   237: getstatic 64	com/tencent/tencentmap/mapsdk/a/fw:b	Ljava/lang/String;
    //   240: getstatic 42	com/tencent/tencentmap/mapsdk/a/fw:f	Ljava/lang/String;
    //   243: invokevirtual 215	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   246: ifeq +35 -> 281
    //   249: iconst_1
    //   250: putstatic 74	com/tencent/tencentmap/mapsdk/a/fw:c	Z
    //   253: ldc -39
    //   255: putstatic 76	com/tencent/tencentmap/mapsdk/a/fw:p	Ljava/lang/String;
    //   258: goto -200 -> 58
    //   261: iload_0
    //   262: bipush 13
    //   264: if_icmpne +10 -> 274
    //   267: iconst_4
    //   268: putstatic 70	com/tencent/tencentmap/mapsdk/a/fw:n	I
    //   271: goto -43 -> 228
    //   274: iconst_3
    //   275: putstatic 70	com/tencent/tencentmap/mapsdk/a/fw:n	I
    //   278: goto -50 -> 228
    //   281: getstatic 64	com/tencent/tencentmap/mapsdk/a/fw:b	Ljava/lang/String;
    //   284: getstatic 38	com/tencent/tencentmap/mapsdk/a/fw:e	Ljava/lang/String;
    //   287: invokevirtual 215	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   290: ifeq +15 -> 305
    //   293: iconst_1
    //   294: putstatic 74	com/tencent/tencentmap/mapsdk/a/fw:c	Z
    //   297: ldc -39
    //   299: putstatic 76	com/tencent/tencentmap/mapsdk/a/fw:p	Ljava/lang/String;
    //   302: goto -244 -> 58
    //   305: getstatic 64	com/tencent/tencentmap/mapsdk/a/fw:b	Ljava/lang/String;
    //   308: getstatic 46	com/tencent/tencentmap/mapsdk/a/fw:g	Ljava/lang/String;
    //   311: invokevirtual 215	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   314: ifeq +15 -> 329
    //   317: iconst_1
    //   318: putstatic 74	com/tencent/tencentmap/mapsdk/a/fw:c	Z
    //   321: ldc -39
    //   323: putstatic 76	com/tencent/tencentmap/mapsdk/a/fw:p	Ljava/lang/String;
    //   326: goto -268 -> 58
    //   329: getstatic 64	com/tencent/tencentmap/mapsdk/a/fw:b	Ljava/lang/String;
    //   332: getstatic 50	com/tencent/tencentmap/mapsdk/a/fw:h	Ljava/lang/String;
    //   335: invokevirtual 215	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   338: ifeq +15 -> 353
    //   341: iconst_1
    //   342: putstatic 74	com/tencent/tencentmap/mapsdk/a/fw:c	Z
    //   345: ldc -37
    //   347: putstatic 76	com/tencent/tencentmap/mapsdk/a/fw:p	Ljava/lang/String;
    //   350: goto -292 -> 58
    //   353: iconst_0
    //   354: putstatic 74	com/tencent/tencentmap/mapsdk/a/fw:c	Z
    //   357: ldc 62
    //   359: putstatic 76	com/tencent/tencentmap/mapsdk/a/fw:p	Ljava/lang/String;
    //   362: goto -304 -> 58
    //   365: astore_1
    //   366: goto -308 -> 58
    // Local variable table:
    //   start	length	slot	name	signature
    //   84	181	0	i1	int
    //   25	101	1	localObject1	Object
    //   154	51	1	localObject2	Object
    //   365	1	1	localThrowable	Throwable
    //   164	27	2	str	String
    // Exception table:
    //   from	to	target	type
    //   3	26	154	finally
    //   30	58	154	finally
    //   62	80	154	finally
    //   80	85	154	finally
    //   90	138	154	finally
    //   141	151	154	finally
    //   160	165	154	finally
    //   169	187	154	finally
    //   190	200	154	finally
    //   204	209	154	finally
    //   224	228	154	finally
    //   228	258	154	finally
    //   267	271	154	finally
    //   274	278	154	finally
    //   281	302	154	finally
    //   305	326	154	finally
    //   329	350	154	finally
    //   353	362	154	finally
    //   3	26	365	java/lang/Throwable
    //   30	58	365	java/lang/Throwable
    //   62	80	365	java/lang/Throwable
    //   80	85	365	java/lang/Throwable
    //   90	138	365	java/lang/Throwable
    //   141	151	365	java/lang/Throwable
    //   160	165	365	java/lang/Throwable
    //   169	187	365	java/lang/Throwable
    //   190	200	365	java/lang/Throwable
    //   204	209	365	java/lang/Throwable
    //   224	228	365	java/lang/Throwable
    //   228	258	365	java/lang/Throwable
    //   267	271	365	java/lang/Throwable
    //   274	278	365	java/lang/Throwable
    //   281	302	365	java/lang/Throwable
    //   305	326	365	java/lang/Throwable
    //   329	350	365	java/lang/Throwable
    //   353	362	365	java/lang/Throwable
  }
  
  public static int c()
  {
    try
    {
      int i1 = n;
      return i1;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public static int d()
  {
    try
    {
      int i1 = o;
      return i1;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public static boolean e()
  {
    return k;
  }
  
  public static boolean f()
  {
    return n == 1;
  }
  
  public static boolean g()
  {
    return n == 2;
  }
  
  public static boolean h()
  {
    return n == 3;
  }
  
  private static void i()
  {
    try
    {
      fx.b(d, "showApnInfo... Apn:" + b + ",sIsNetworkOk:" + k + ",sNetType:" + n + ",sIsProxy:" + c + ",sProxyAddress:" + p);
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  private static Integer j()
  {
    int i3 = 3;
    int i2 = 2;
    int i1 = 1;
    for (;;)
    {
      Object localObject4;
      try
      {
        if (n == 1)
        {
          localObject1 = l;
          if ((localObject1 == null) || (((String)localObject1).length() <= 0))
          {
            localObject1 = Integer.valueOf(0);
            o = ((Integer)localObject1).intValue();
            i1 = o;
            return Integer.valueOf(i1);
          }
          localObject1 = ((String)localObject1).toLowerCase();
          if (!((String)localObject1).contains("cmcc")) {
            break label374;
          }
          if (!((String)localObject1).contains("chinanet")) {
            break label371;
          }
          i1 = i3;
          if (!((String)localObject1).contains("chinaunicom")) {
            break label368;
          }
          i1 = i2;
          localObject1 = Integer.valueOf(i1);
          continue;
        }
        if ((n != 2) && (n != 3)) {
          break label361;
        }
        localObject4 = j;
        Object localObject1 = b;
        localObject4 = (TelephonyManager)((Context)localObject4).getSystemService("phone");
        if ((localObject4 == null) || (((TelephonyManager)localObject4).getSimState() != 5)) {
          break label244;
        }
        localObject4 = ((TelephonyManager)localObject4).getSimOperator();
        if (((String)localObject4).length() <= 0) {
          break label244;
        }
        if ((((String)localObject4).equals("46000")) || (((String)localObject4).equals("46002")))
        {
          localObject1 = Integer.valueOf(1);
          o = ((Integer)localObject1).intValue();
          continue;
        }
        if (!((String)localObject4).equals("46001")) {
          break label225;
        }
      }
      finally {}
      Object localObject3 = Integer.valueOf(2);
      continue;
      label225:
      if (((String)localObject4).equals("46003"))
      {
        localObject3 = Integer.valueOf(3);
      }
      else
      {
        label244:
        if (localObject3 != null)
        {
          localObject3 = ((String)localObject3).toLowerCase();
          if ((((String)localObject3).contains("cmnet")) || (((String)localObject3).contains("cmwap")))
          {
            localObject3 = Integer.valueOf(1);
            continue;
          }
          if ((((String)localObject3).contains("uninet")) || (((String)localObject3).contains("uniwap")) || (((String)localObject3).contains("3gnet")) || (((String)localObject3).contains("3gwap")))
          {
            localObject3 = Integer.valueOf(2);
            continue;
          }
          if ((((String)localObject3).contains("ctnet")) || (((String)localObject3).contains("ctwap")))
          {
            localObject3 = Integer.valueOf(3);
            continue;
          }
        }
        localObject3 = Integer.valueOf(0);
        continue;
        label361:
        o = 0;
        continue;
        label368:
        continue;
        label371:
        continue;
        label374:
        i1 = 0;
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/fw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */