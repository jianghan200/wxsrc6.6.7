package com.tencent.mm.compatible.e;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Build.VERSION;
import android.provider.Settings.Secure;
import android.telephony.TelephonyManager;
import com.tencent.mm.a.g;
import com.tencent.mm.g.a.cf;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.w;
import java.io.File;
import java.io.FileFilter;
import java.util.Map;
import java.util.Random;
import java.util.regex.Pattern;

public final class q
{
  public static o deL = new o();
  public static c deM = new c();
  public static b deN = new b();
  public static v deO = new v();
  public static z deP = new z();
  public static s deQ = new s();
  public static u deR = new u();
  public static x deS = new x();
  public static t deT = new t();
  public static a deU = new a();
  private static int deV = -1;
  public static k deW = new k();
  public static p deX = new p();
  private static String deY = null;
  
  public static String bc(boolean paramBoolean)
  {
    StringBuilder localStringBuilder;
    String str;
    if ((paramBoolean) || (deY == null))
    {
      localStringBuilder = new StringBuilder();
      localStringBuilder.append(Settings.Secure.getString(ad.getContext().getContentResolver(), "android_id"));
      if (paramBoolean) {
        break label166;
      }
      str = (String)l.zh().get(256);
      if (str == null) {
        break label166;
      }
      localStringBuilder.append(str);
      str = (String)l.zh().get(259);
      if (str == null) {
        break label183;
      }
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.DeviceInfo", "getHardWareId from file " + str);
    }
    for (;;)
    {
      localStringBuilder.append(str);
      str = localStringBuilder.toString();
      deY = "A" + g.u(str.getBytes()).substring(0, 15);
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.DeviceInfo", "guid:%s, dev=%s", new Object[] { deY, str });
      return deY;
      label166:
      str = zD();
      l.zh().set(256, str);
      break;
      label183:
      str = Build.MANUFACTURER + Build.MODEL + n.zo();
      l.zh().set(259, str);
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.DeviceInfo", "getHardWareId " + str);
    }
  }
  
  public static String br(Context paramContext)
  {
    try
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.DeviceInfo", "lm: getManufacturer CurrentLanguage is %s", new Object[] { w.fD(paramContext) });
      if ((deR == null) || (deR.dfo == null) || (deR.dfo.size() == 0))
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.DeviceInfo", "lm: getManufacturer return is %s", new Object[] { Build.MANUFACTURER });
        return Build.MANUFACTURER;
      }
      String str = (String)deR.dfo.get(".manufacturerName." + w.fD(paramContext));
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.DeviceInfo", "lm: getManufacturer is %s", new Object[] { str });
      paramContext = str;
      if (bi.oW(str))
      {
        str = (String)deR.dfo.get(".manufacturerName.en");
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.DeviceInfo", "lm: getManufacturer is %s", new Object[] { str });
        paramContext = str;
        if (bi.oW(str))
        {
          paramContext = Build.MANUFACTURER;
          return paramContext;
        }
      }
    }
    catch (Exception paramContext)
    {
      paramContext = Build.MANUFACTURER;
    }
    return paramContext;
  }
  
  public static String bs(Context paramContext)
  {
    try
    {
      paramContext = ((TelephonyManager)paramContext.getSystemService("phone")).getSimOperatorName();
      return paramContext;
    }
    catch (Exception paramContext)
    {
      com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.DeviceInfo", paramContext, "getMobileSPType", new Object[0]);
    }
    return "";
  }
  
  public static void fd(String paramString)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.DeviceInfo", "update deviceInfo %s", new Object[] { paramString });
    if ((paramString == null) || (paramString.length() <= 0)) {}
    do
    {
      do
      {
        return;
      } while (paramString.hashCode() == deV);
      deV = paramString.hashCode();
      deL.reset();
      deM.reset();
      deN.reset();
      deW.reset();
      deO.reset();
      deP.reset();
      Object localObject = deQ;
      ((s)localObject).deZ = 0;
      ((s)localObject).dfa = 0;
      localObject = deR;
      ((u)localObject).dfn = "";
      ((u)localObject).dfo = null;
      deS.cbY = false;
      deT.reset();
      localObject = deU;
      ((a)localObject).dbw = false;
      ((a)localObject).dbx = "";
      new r();
    } while (!r.a(paramString, deL, deM, deN, deW, deO, deP, deQ, deR, deS, deT, deU));
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.DeviceInfo", "steve: mCameraInfo.mNeedEnhance = " + deM.ddk);
    paramString = new cf();
    com.tencent.mm.sdk.b.a.sFg.m(paramString);
  }
  
  public static String getAndroidId()
  {
    String str = Settings.Secure.getString(ad.getContext().getContentResolver(), "android_id");
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.DeviceInfo", "androidid:[%s]", new Object[] { str });
    return str;
  }
  
  public static String getDeviceID(Context paramContext)
  {
    if (paramContext == null) {
      return null;
    }
    try
    {
      paramContext = (TelephonyManager)paramContext.getSystemService("phone");
      if (paramContext == null) {
        return null;
      }
      paramContext = paramContext.getDeviceId();
      if (paramContext == null) {
        return null;
      }
      paramContext = paramContext.trim();
      return paramContext;
    }
    catch (SecurityException paramContext)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.DeviceInfo", "getDeviceId failed, security exception");
      return null;
    }
    catch (Exception paramContext)
    {
      for (;;)
      {
        com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.DeviceInfo", paramContext, "", new Object[0]);
      }
    }
  }
  
  public static String getSimCountryIso()
  {
    Object localObject = (TelephonyManager)ad.getContext().getSystemService("phone");
    if (localObject != null)
    {
      localObject = ((TelephonyManager)localObject).getSimCountryIso();
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.DeviceInfo", "get isoCode:[%s]", new Object[] { localObject });
      return (String)localObject;
    }
    return null;
  }
  
  public static boolean zA()
  {
    return deY != null;
  }
  
  public static String zB()
  {
    Object localObject = (WifiManager)ad.getContext().getSystemService("wifi");
    if (localObject == null) {}
    for (localObject = null; localObject != null; localObject = ((WifiManager)localObject).getConnectionInfo()) {
      return ((WifiInfo)localObject).getMacAddress();
    }
    return null;
  }
  
  public static String zC()
  {
    String str = null;
    BluetoothAdapter localBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
    if (localBluetoothAdapter != null) {
      str = localBluetoothAdapter.getAddress();
    }
    return str;
  }
  
  private static String zD()
  {
    int i = 0;
    String str1 = bi.fP(ad.getContext());
    String str2;
    if ((str1 != null) && (str1.length() > 0))
    {
      str2 = ("A" + str1 + "123456789ABCDEF").substring(0, 15);
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.DeviceInfo", "generated deviceId=" + str2);
      return str2;
    }
    Random localRandom = new Random();
    localRandom.setSeed(System.currentTimeMillis());
    str1 = "A";
    for (;;)
    {
      str2 = str1;
      if (i >= 15) {
        break;
      }
      str1 = str1 + (char)(localRandom.nextInt(25) + 65);
      i += 1;
    }
  }
  
  public static String zE()
  {
    return Build.MODEL;
  }
  
  /* Error */
  public static String[] zF()
  {
    // Byte code:
    //   0: iconst_2
    //   1: anewarray 145	java/lang/String
    //   4: astore_2
    //   5: aload_2
    //   6: iconst_0
    //   7: ldc_w 267
    //   10: aastore
    //   11: aload_2
    //   12: iconst_1
    //   13: ldc_w 415
    //   16: aastore
    //   17: new 417	java/io/BufferedReader
    //   20: dup
    //   21: new 419	java/io/FileReader
    //   24: dup
    //   25: ldc_w 421
    //   28: invokespecial 422	java/io/FileReader:<init>	(Ljava/lang/String;)V
    //   31: sipush 8192
    //   34: invokespecial 425	java/io/BufferedReader:<init>	(Ljava/io/Reader;I)V
    //   37: astore_1
    //   38: aload_1
    //   39: invokevirtual 428	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   42: invokestatic 432	com/tencent/mm/sdk/platformtools/bi:oV	(Ljava/lang/String;)Ljava/lang/String;
    //   45: ldc_w 434
    //   48: invokevirtual 438	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   51: astore_3
    //   52: iconst_2
    //   53: istore_0
    //   54: iload_0
    //   55: aload_3
    //   56: arraylength
    //   57: if_icmpge +41 -> 98
    //   60: aload_2
    //   61: iconst_0
    //   62: new 108	java/lang/StringBuilder
    //   65: dup
    //   66: invokespecial 109	java/lang/StringBuilder:<init>	()V
    //   69: aload_2
    //   70: iconst_0
    //   71: aaload
    //   72: invokevirtual 133	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   75: aload_3
    //   76: iload_0
    //   77: aaload
    //   78: invokevirtual 133	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   81: ldc_w 440
    //   84: invokevirtual 133	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   87: invokevirtual 156	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   90: aastore
    //   91: iload_0
    //   92: iconst_1
    //   93: iadd
    //   94: istore_0
    //   95: goto -41 -> 54
    //   98: aload_2
    //   99: iconst_1
    //   100: aload_1
    //   101: invokevirtual 428	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   104: invokestatic 432	com/tencent/mm/sdk/platformtools/bi:oV	(Ljava/lang/String;)Ljava/lang/String;
    //   107: ldc_w 434
    //   110: invokevirtual 438	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   113: iconst_2
    //   114: aaload
    //   115: aastore
    //   116: aload_1
    //   117: invokevirtual 443	java/io/BufferedReader:close	()V
    //   120: aload_2
    //   121: areturn
    //   122: astore_1
    //   123: aconst_null
    //   124: astore_1
    //   125: aload_1
    //   126: ifnull -6 -> 120
    //   129: aload_1
    //   130: invokevirtual 443	java/io/BufferedReader:close	()V
    //   133: aload_2
    //   134: areturn
    //   135: astore_1
    //   136: aload_2
    //   137: areturn
    //   138: astore_1
    //   139: aconst_null
    //   140: astore_2
    //   141: aload_2
    //   142: ifnull +7 -> 149
    //   145: aload_2
    //   146: invokevirtual 443	java/io/BufferedReader:close	()V
    //   149: aload_1
    //   150: athrow
    //   151: astore_1
    //   152: aload_2
    //   153: areturn
    //   154: astore_2
    //   155: goto -6 -> 149
    //   158: astore_2
    //   159: aload_1
    //   160: astore_3
    //   161: aload_2
    //   162: astore_1
    //   163: aload_3
    //   164: astore_2
    //   165: goto -24 -> 141
    //   168: astore_3
    //   169: goto -44 -> 125
    // Local variable table:
    //   start	length	slot	name	signature
    //   53	42	0	i	int
    //   37	80	1	localBufferedReader	java.io.BufferedReader
    //   122	1	1	localIOException1	java.io.IOException
    //   124	6	1	localObject1	Object
    //   135	1	1	localException1	Exception
    //   138	12	1	localObject2	Object
    //   151	9	1	localException2	Exception
    //   162	1	1	localObject3	Object
    //   4	149	2	arrayOfString	String[]
    //   154	1	2	localException3	Exception
    //   158	4	2	localObject4	Object
    //   164	1	2	localObject5	Object
    //   51	113	3	localObject6	Object
    //   168	1	3	localIOException2	java.io.IOException
    // Exception table:
    //   from	to	target	type
    //   17	38	122	java/io/IOException
    //   129	133	135	java/lang/Exception
    //   17	38	138	finally
    //   116	120	151	java/lang/Exception
    //   145	149	154	java/lang/Exception
    //   38	52	158	finally
    //   54	91	158	finally
    //   98	116	158	finally
    //   38	52	168	java/io/IOException
    //   54	91	168	java/io/IOException
    //   98	116	168	java/io/IOException
  }
  
  public static String zG()
  {
    Object localObject2 = null;
    try
    {
      BluetoothAdapter localBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
      Object localObject1 = localObject2;
      if (localBluetoothAdapter != null)
      {
        localObject1 = localObject2;
        if (localBluetoothAdapter.isEnabled()) {
          localObject1 = localBluetoothAdapter.getAddress();
        }
      }
      localObject1 = bi.oV((String)localObject1);
      return (String)localObject1;
    }
    catch (Exception localException)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.DeviceInfo", "getBlueToothAddress failed: %s", new Object[] { bi.i(localException) });
    }
    return "";
  }
  
  @SuppressLint({"NewApi"})
  public static String zH()
  {
    for (Object localObject = null;; localObject = str)
    {
      try
      {
        if (Build.VERSION.SDK_INT < 14) {
          break label21;
        }
        str = Build.getRadioVersion();
        localObject = str;
      }
      catch (IncompatibleClassChangeError localIncompatibleClassChangeError)
      {
        String str;
        com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.Crash", localIncompatibleClassChangeError, "May cause dvmFindCatchBlock crash!", new Object[0]);
        throw ((IncompatibleClassChangeError)new IncompatibleClassChangeError("May cause dvmFindCatchBlock crash!").initCause(localIncompatibleClassChangeError));
      }
      catch (Throwable localThrowable)
      {
        label21:
        for (;;) {}
      }
      return bi.oV((String)localObject);
      str = Build.RADIO;
    }
  }
  
  public static String zI()
  {
    return Build.VERSION.RELEASE;
  }
  
  public static String zJ()
  {
    try
    {
      String str = bi.oV(((TelephonyManager)ad.getContext().getSystemService("phone")).getSubscriberId());
      return str;
    }
    catch (Exception localException)
    {
      com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.DeviceInfo", localException, "getPhoneIMSI", new Object[0]);
    }
    return "";
  }
  
  public static String zK()
  {
    try
    {
      String str = bi.oV(((TelephonyManager)ad.getContext().getSystemService("phone")).getSimSerialNumber());
      return str;
    }
    catch (Exception localException)
    {
      com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.DeviceInfo", localException, "getPhoneICCID", new Object[0]);
    }
    return "";
  }
  
  @SuppressLint({"NewApi"})
  public static String zL()
  {
    String str = null;
    if (Build.VERSION.SDK_INT >= 9) {
      str = Build.SERIAL;
    }
    return bi.oV(str);
  }
  
  /* Error */
  public static Map<String, String> zM()
  {
    // Byte code:
    //   0: new 507	java/util/HashMap
    //   3: dup
    //   4: invokespecial 508	java/util/HashMap:<init>	()V
    //   7: astore_3
    //   8: new 417	java/io/BufferedReader
    //   11: dup
    //   12: new 510	java/io/InputStreamReader
    //   15: dup
    //   16: new 512	java/io/FileInputStream
    //   19: dup
    //   20: ldc_w 421
    //   23: invokespecial 513	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   26: ldc_w 515
    //   29: invokespecial 518	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;Ljava/lang/String;)V
    //   32: invokespecial 521	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   35: astore_1
    //   36: aload_1
    //   37: astore_0
    //   38: aload_1
    //   39: invokevirtual 428	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   42: astore_2
    //   43: aload_2
    //   44: ifnull +85 -> 129
    //   47: aload_1
    //   48: astore_0
    //   49: aload_2
    //   50: invokevirtual 343	java/lang/String:trim	()Ljava/lang/String;
    //   53: ldc_w 267
    //   56: invokevirtual 525	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   59: ifne -23 -> 36
    //   62: aload_1
    //   63: astore_0
    //   64: aload_2
    //   65: ldc_w 527
    //   68: invokevirtual 438	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   71: astore_2
    //   72: aload_1
    //   73: astore_0
    //   74: aload_2
    //   75: arraylength
    //   76: iconst_1
    //   77: if_icmple -41 -> 36
    //   80: aload_1
    //   81: astore_0
    //   82: aload_3
    //   83: aload_2
    //   84: iconst_0
    //   85: aaload
    //   86: invokevirtual 343	java/lang/String:trim	()Ljava/lang/String;
    //   89: invokevirtual 530	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   92: aload_2
    //   93: iconst_1
    //   94: aaload
    //   95: invokevirtual 343	java/lang/String:trim	()Ljava/lang/String;
    //   98: invokeinterface 534 3 0
    //   103: pop
    //   104: goto -68 -> 36
    //   107: astore_2
    //   108: aload_1
    //   109: astore_0
    //   110: ldc -109
    //   112: aload_2
    //   113: ldc_w 536
    //   116: iconst_0
    //   117: anewarray 4	java/lang/Object
    //   120: invokestatic 265	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   123: aload_1
    //   124: invokestatic 539	com/tencent/mm/sdk/platformtools/bi:d	(Ljava/io/Closeable;)V
    //   127: aload_3
    //   128: areturn
    //   129: aload_1
    //   130: invokestatic 539	com/tencent/mm/sdk/platformtools/bi:d	(Ljava/io/Closeable;)V
    //   133: aload_3
    //   134: areturn
    //   135: astore_1
    //   136: aconst_null
    //   137: astore_0
    //   138: aload_0
    //   139: invokestatic 539	com/tencent/mm/sdk/platformtools/bi:d	(Ljava/io/Closeable;)V
    //   142: aload_1
    //   143: athrow
    //   144: astore_1
    //   145: goto -7 -> 138
    //   148: astore_2
    //   149: aconst_null
    //   150: astore_1
    //   151: goto -43 -> 108
    // Local variable table:
    //   start	length	slot	name	signature
    //   37	102	0	localBufferedReader1	java.io.BufferedReader
    //   35	95	1	localBufferedReader2	java.io.BufferedReader
    //   135	8	1	localObject1	Object
    //   144	1	1	localObject2	Object
    //   150	1	1	localObject3	Object
    //   42	51	2	localObject4	Object
    //   107	6	2	localIOException1	java.io.IOException
    //   148	1	2	localIOException2	java.io.IOException
    //   7	127	3	localHashMap	java.util.HashMap
    // Exception table:
    //   from	to	target	type
    //   38	43	107	java/io/IOException
    //   49	62	107	java/io/IOException
    //   64	72	107	java/io/IOException
    //   74	80	107	java/io/IOException
    //   82	104	107	java/io/IOException
    //   8	36	135	finally
    //   38	43	144	finally
    //   49	62	144	finally
    //   64	72	144	finally
    //   74	80	144	finally
    //   82	104	144	finally
    //   110	123	144	finally
    //   8	36	148	java/io/IOException
  }
  
  public static int zN()
  {
    try
    {
      int i = new File("/sys/devices/system/cpu").listFiles(new a()).length;
      return i;
    }
    catch (Exception localException) {}
    return 1;
  }
  
  public static String zO()
  {
    return "android-" + Build.MODEL + "-" + Build.VERSION.SDK_INT;
  }
  
  public static String zy()
  {
    Object localObject = (String)l.zh().get(258);
    if (localObject != null) {
      return (String)localObject;
    }
    String str = getDeviceID(ad.getContext());
    localObject = str;
    if (str == null) {
      localObject = "1234567890ABCDEF";
    }
    l.zh().set(258, localObject);
    return (String)localObject;
  }
  
  public static String zz()
  {
    return bc(false);
  }
  
  final class a
    implements FileFilter
  {
    public final boolean accept(File paramFile)
    {
      return Pattern.matches("cpu[0-9]+", paramFile.getName());
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/compatible/e/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */