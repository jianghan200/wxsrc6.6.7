package c.t.m.g;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.location.LocationManager;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import com.tencent.map.geolocation.internal.TencentHttpClient;
import com.tencent.map.geolocation.internal.TencentHttpClientFactory;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

public class ct
{
  private static volatile ct m;
  public final Context a;
  public final cu b;
  public final ExecutorService c;
  final PackageManager d;
  public final TelephonyManager e;
  public final WifiManager f;
  public final LocationManager g;
  public final TencentHttpClient h;
  String i;
  private final HashMap<String, cx> j;
  private CountDownLatch k;
  private final SharedPreferences l;
  private List<ek> n;
  
  private ct(Context paramContext)
  {
    this.a = paramContext;
    this.d = paramContext.getPackageManager();
    this.e = ((TelephonyManager)paramContext.getSystemService("phone"));
    this.f = ((WifiManager)paramContext.getSystemService("wifi"));
    this.g = ((LocationManager)paramContext.getSystemService("location"));
    Object localObject = new Bundle();
    ((Bundle)localObject).putString("channelId", j.c(paramContext.getPackageName()));
    this.h = TencentHttpClientFactory.getInstance().getTencentHttpClient(paramContext, (Bundle)localObject);
    this.l = paramContext.getSharedPreferences("LocationSDK", 0);
    localObject = new ct.1();
    localObject = new ThreadPoolExecutor(1, 5, 60000L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), (ThreadFactory)localObject);
    if (Build.VERSION.SDK_INT >= 9) {
      ((ThreadPoolExecutor)localObject).allowCoreThreadTimeOut(true);
    }
    this.c = ((ExecutorService)localObject);
    this.j = new HashMap();
    if (Build.VERSION.SDK_INT >= 12) {
      this.j.put("cell", new cy("cell"));
    }
    this.b = new cu();
    try
    {
      this.b.g = b(paramContext);
      a();
      return;
    }
    catch (Exception paramContext)
    {
      for (;;) {}
    }
  }
  
  public static ct a(Context paramContext)
  {
    if (m == null) {}
    try
    {
      if (m == null) {
        m = new ct(paramContext);
      }
      return m;
    }
    finally {}
  }
  
  private static String b(Context paramContext)
  {
    try
    {
      paramContext = paramContext.getPackageManager().getApplicationInfo(paramContext.getPackageName(), 128).metaData;
      if (paramContext != null)
      {
        if (paramContext.containsKey("TencentGeoLocationSDK")) {
          return paramContext.getString("TencentGeoLocationSDK");
        }
        if (paramContext.containsKey("TencentMapSDK"))
        {
          paramContext = paramContext.getString("TencentMapSDK");
          return paramContext;
        }
        return "";
      }
    }
    catch (Exception paramContext) {}
    return "";
  }
  
  private String b(String paramString)
  {
    cu localcu = this.b;
    HashMap localHashMap = new HashMap();
    localHashMap.put("version", localcu.d());
    localHashMap.put("app_name", c(localcu.h));
    localHashMap.put("app_label", c(localcu.i));
    localHashMap.put("l", paramString);
    try
    {
      paramString = new JSONObject(localHashMap);
      localcu = this.b;
      localHashMap = new HashMap();
      localHashMap.put("imei", c(localcu.a()));
      localHashMap.put("imsi", c(localcu.b()));
      localHashMap.put("n", c(j.b(localcu.d)));
      localHashMap.put("qq", c(j.b(localcu.f)));
      localHashMap.put("mac", c(localcu.c().toLowerCase(Locale.ENGLISH)));
      localHashMap.put("model", c(Build.MANUFACTURER + "_" + Build.MODEL));
      paramString = paramString.put("attribute", new JSONObject(localHashMap)).toString();
      return paramString;
    }
    catch (JSONException paramString) {}
    return null;
  }
  
  private static String c(String paramString)
  {
    String str = paramString;
    if (paramString == null) {
      str = "";
    }
    return str;
  }
  
  public final Bundle a(String paramString, byte[] paramArrayOfByte)
  {
    long l1 = System.currentTimeMillis();
    paramArrayOfByte = this.h.postSync(paramString, paramArrayOfByte);
    long l2 = System.currentTimeMillis();
    new StringBuilder("HalleyTimeCost:").append(l2 - l1).append(",reqKey:").append(paramArrayOfByte.getString("req_key"));
    byte[] arrayOfByte = j.b(paramArrayOfByte.getByteArray("data_bytes"));
    paramString = "{}";
    if (arrayOfByte != null) {
      paramString = new String(arrayOfByte, paramArrayOfByte.getString("data_charset"));
    }
    paramArrayOfByte.remove("data_charset");
    paramArrayOfByte.remove("data_bytes");
    paramArrayOfByte.putString("result", paramString);
    return paramArrayOfByte;
  }
  
  public final cx a(String paramString)
  {
    paramString = (cx)this.j.get(paramString);
    if (paramString != null) {
      return paramString;
    }
    return cw.a;
  }
  
  public final void a()
  {
    this.k = new CountDownLatch(1);
    new Thread(new ct.2(this)).start();
  }
  
  public final void a(Object paramObject)
  {
    for (;;)
    {
      Object localObject3;
      try
      {
        if (this.n == null) {
          this.n = new ArrayList();
        }
        Object localObject1 = this.n.iterator();
        if (!((Iterator)localObject1).hasNext()) {
          break label191;
        }
        localObject2 = ((ek)((Iterator)localObject1).next()).c;
        if (paramObject != localObject2) {
          continue;
        }
        i1 = 1;
        if (i1 != 0) {
          return;
        }
        localObject1 = paramObject.getClass().getDeclaredMethods();
        int i2 = localObject1.length;
        i1 = 0;
        if (i1 >= i2) {
          continue;
        }
        localObject2 = localObject1[i1];
        localObject3 = ((Method)localObject2).getName();
        if ((!((String)localObject3).startsWith("on")) || (!((String)localObject3).endsWith("Event"))) {
          break label184;
        }
        localObject3 = ((Method)localObject2).getParameterTypes();
        if (localObject3.length != 1) {
          throw new IllegalArgumentException("EventHandler methods must specify a single Object paramter.");
        }
      }
      finally {}
      Object localObject2 = new ek(localObject3[0], (Method)localObject2, paramObject);
      this.n.add(localObject2);
      label184:
      i1 += 1;
      continue;
      label191:
      int i1 = 0;
    }
  }
  
  public final void b(Object paramObject)
  {
    List localList;
    try
    {
      localList = this.n;
      if (localList == null) {
        break label119;
      }
      ArrayList localArrayList = new ArrayList();
      Iterator localIterator = localList.iterator();
      while (localIterator.hasNext())
      {
        ek localek = (ek)localIterator.next();
        Object localObject = localek.c;
        if ((localObject == null) || (localObject == paramObject)) {
          localArrayList.add(localek);
        }
      }
      paramObject = localArrayList.iterator();
    }
    finally {}
    while (((Iterator)paramObject).hasNext()) {
      localList.remove((ek)((Iterator)paramObject).next());
    }
    label119:
  }
  
  public final boolean b()
  {
    return this.e != null;
  }
  
  public final cu c()
  {
    if (-1L > 0L) {}
    try
    {
      if (!this.k.await(-1L, TimeUnit.MILLISECONDS))
      {
        return null;
        this.k.await();
      }
      return this.b;
    }
    catch (InterruptedException localInterruptedException) {}
    return null;
  }
  
  /* Error */
  public final void c(@org.eclipse.jdt.annotation.Nullable Object paramObject)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_1
    //   3: ifnonnull +6 -> 9
    //   6: aload_0
    //   7: monitorexit
    //   8: return
    //   9: aload_0
    //   10: getfield 362	c/t/m/g/ct:n	Ljava/util/List;
    //   13: astore_3
    //   14: aload_3
    //   15: ifnull -9 -> 6
    //   18: aload_3
    //   19: invokeinterface 371 1 0
    //   24: astore_3
    //   25: aload_3
    //   26: invokeinterface 377 1 0
    //   31: ifeq -25 -> 6
    //   34: aload_3
    //   35: invokeinterface 381 1 0
    //   40: checkcast 383	c/t/m/g/ek
    //   43: astore 4
    //   45: aload_1
    //   46: invokevirtual 390	java/lang/Object:getClass	()Ljava/lang/Class;
    //   49: aload 4
    //   51: getfield 444	c/t/m/g/ek:a	Ljava/lang/Class;
    //   54: invokevirtual 447	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   57: istore_2
    //   58: iload_2
    //   59: ifeq -34 -> 25
    //   62: aload 4
    //   64: getfield 450	c/t/m/g/ek:b	Ljava/lang/reflect/Method;
    //   67: aload 4
    //   69: getfield 386	c/t/m/g/ek:c	Ljava/lang/Object;
    //   72: iconst_1
    //   73: anewarray 4	java/lang/Object
    //   76: dup
    //   77: iconst_0
    //   78: aload_1
    //   79: aastore
    //   80: invokevirtual 454	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   83: pop
    //   84: goto -59 -> 25
    //   87: astore 4
    //   89: goto -64 -> 25
    //   92: astore_1
    //   93: aload_0
    //   94: monitorexit
    //   95: aload_1
    //   96: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	97	0	this	ct
    //   0	97	1	paramObject	Object
    //   57	2	2	bool	boolean
    //   13	22	3	localObject	Object
    //   43	25	4	localek	ek
    //   87	1	4	localException	Exception
    // Exception table:
    //   from	to	target	type
    //   62	84	87	java/lang/Exception
    //   9	14	92	finally
    //   18	25	92	finally
    //   25	58	92	finally
    //   62	84	92	finally
  }
  
  public final String d()
  {
    if (!cn.a().d("up_apps")) {
      return null;
    }
    int i2 = (int)(System.currentTimeMillis() / 86400000L % 5L);
    for (;;)
    {
      try
      {
        i1 = Math.abs(this.i.hashCode()) % 5;
        if (i2 == i1) {
          if (!this.l.getBoolean("flag", false))
          {
            try
            {
              Object localObject1 = this.d.getInstalledPackages(8192);
              localStringBuilder = new StringBuilder();
              localObject1 = ((List)localObject1).iterator();
              if (!((Iterator)localObject1).hasNext()) {
                continue;
              }
              localPackageInfo = (PackageInfo)((Iterator)localObject1).next();
              i1 = localPackageInfo.applicationInfo.flags;
              localObject2 = localPackageInfo.applicationInfo;
              if ((i1 & 0x1) > 0) {
                continue;
              }
              localObject2 = localPackageInfo.applicationInfo.loadLabel(this.d).toString();
              if ((((String)localObject2).length() > 30) || (((String)localObject2).startsWith("com.")) || (((String)localObject2).contains("theme"))) {
                break label334;
              }
              if (!((String)localObject2).contains("CheilPengtai")) {
                continue;
              }
            }
            catch (Exception localException1)
            {
              StringBuilder localStringBuilder;
              PackageInfo localPackageInfo;
              Object localObject2;
              this.l.edit().putBoolean("flag", true).apply();
            }
            if (i1 != 0) {
              continue;
            }
            localStringBuilder.append((String)localObject2);
            localStringBuilder.append('_');
            localStringBuilder.append(localPackageInfo.versionName);
            localStringBuilder.append('|');
            continue;
          }
          else
          {
            return null;
          }
        }
      }
      catch (Exception localException2)
      {
        i1 = 0;
        continue;
        i1 = 0;
        continue;
        this.l.edit().putBoolean("flag", true).apply();
        String str = b(localException2.toString());
        return str;
      }
      this.l.edit().putBoolean("flag", false).apply();
      continue;
      label334:
      int i1 = 1;
    }
  }
  
  final PackageInfo e()
  {
    try
    {
      PackageInfo localPackageInfo = this.d.getPackageInfo(this.a.getPackageName(), 0);
      return localPackageInfo;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException) {}
    return new PackageInfo();
  }
  
  /* Error */
  final String f()
  {
    // Byte code:
    //   0: ldc -52
    //   2: astore_3
    //   3: aload_0
    //   4: getfield 111	c/t/m/g/ct:l	Landroid/content/SharedPreferences;
    //   7: ldc_w 552
    //   10: ldc -52
    //   12: invokeinterface 555 3 0
    //   17: astore 4
    //   19: aload 4
    //   21: astore_3
    //   22: aload 4
    //   24: invokestatic 560	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   27: ifne +6 -> 33
    //   30: aload 4
    //   32: areturn
    //   33: aload 4
    //   35: astore_3
    //   36: invokestatic 566	java/net/NetworkInterface:getNetworkInterfaces	()Ljava/util/Enumeration;
    //   39: astore 5
    //   41: aload 4
    //   43: astore_3
    //   44: aload 5
    //   46: invokeinterface 571 1 0
    //   51: ifeq +166 -> 217
    //   54: aload 5
    //   56: invokeinterface 574 1 0
    //   61: checkcast 562	java/net/NetworkInterface
    //   64: astore 4
    //   66: aload 4
    //   68: ifnull -24 -> 44
    //   71: aload 4
    //   73: invokevirtual 575	java/net/NetworkInterface:getName	()Ljava/lang/String;
    //   76: ldc_w 577
    //   79: invokevirtual 580	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   82: ifeq -38 -> 44
    //   85: aload 4
    //   87: invokevirtual 584	java/net/NetworkInterface:getHardwareAddress	()[B
    //   90: astore 4
    //   92: aload 4
    //   94: ifnull -50 -> 44
    //   97: aload 4
    //   99: arraylength
    //   100: ifeq -56 -> 44
    //   103: new 262	java/lang/StringBuilder
    //   106: dup
    //   107: invokespecial 263	java/lang/StringBuilder:<init>	()V
    //   110: astore 6
    //   112: aload 4
    //   114: arraylength
    //   115: istore_2
    //   116: iconst_0
    //   117: istore_1
    //   118: iload_1
    //   119: iload_2
    //   120: if_icmpge +36 -> 156
    //   123: aload 6
    //   125: ldc_w 586
    //   128: iconst_1
    //   129: anewarray 4	java/lang/Object
    //   132: dup
    //   133: iconst_0
    //   134: aload 4
    //   136: iload_1
    //   137: baload
    //   138: invokestatic 592	java/lang/Byte:valueOf	(B)Ljava/lang/Byte;
    //   141: aastore
    //   142: invokestatic 596	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   145: invokevirtual 272	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   148: pop
    //   149: iload_1
    //   150: iconst_1
    //   151: iadd
    //   152: istore_1
    //   153: goto -35 -> 118
    //   156: aload 6
    //   158: invokevirtual 597	java/lang/StringBuilder:length	()I
    //   161: ifle +16 -> 177
    //   164: aload 6
    //   166: aload 6
    //   168: invokevirtual 597	java/lang/StringBuilder:length	()I
    //   171: iconst_1
    //   172: isub
    //   173: invokevirtual 601	java/lang/StringBuilder:deleteCharAt	(I)Ljava/lang/StringBuilder;
    //   176: pop
    //   177: aload 6
    //   179: invokevirtual 280	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   182: astore 4
    //   184: aload 4
    //   186: astore_3
    //   187: aload_0
    //   188: getfield 111	c/t/m/g/ct:l	Landroid/content/SharedPreferences;
    //   191: invokeinterface 530 1 0
    //   196: ldc_w 552
    //   199: aload 4
    //   201: invokeinterface 604 3 0
    //   206: invokeinterface 539 1 0
    //   211: aload 4
    //   213: astore_3
    //   214: goto -170 -> 44
    //   217: aload_3
    //   218: areturn
    //   219: astore 4
    //   221: aload 4
    //   223: invokevirtual 605	java/lang/Throwable:toString	()Ljava/lang/String;
    //   226: pop
    //   227: aload_3
    //   228: areturn
    //   229: astore 4
    //   231: goto -10 -> 221
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	234	0	this	ct
    //   117	36	1	i1	int
    //   115	6	2	i2	int
    //   2	226	3	localObject1	Object
    //   17	195	4	localObject2	Object
    //   219	3	4	localThrowable1	Throwable
    //   229	1	4	localThrowable2	Throwable
    //   39	16	5	localEnumeration	java.util.Enumeration
    //   110	68	6	localStringBuilder	StringBuilder
    // Exception table:
    //   from	to	target	type
    //   3	19	219	java/lang/Throwable
    //   22	30	219	java/lang/Throwable
    //   36	41	219	java/lang/Throwable
    //   187	211	219	java/lang/Throwable
    //   44	66	229	java/lang/Throwable
    //   71	92	229	java/lang/Throwable
    //   97	116	229	java/lang/Throwable
    //   123	149	229	java/lang/Throwable
    //   156	177	229	java/lang/Throwable
    //   177	184	229	java/lang/Throwable
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/c/t/m/g/ct.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */