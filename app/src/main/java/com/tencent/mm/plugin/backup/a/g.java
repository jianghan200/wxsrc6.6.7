package com.tencent.mm.plugin.backup.a;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.StatFs;
import android.text.TextUtils;
import com.tencent.mm.a.e;
import com.tencent.mm.a.n;
import com.tencent.mm.bk.a;
import com.tencent.mm.bk.b;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.compatible.util.h;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.model.s;
import com.tencent.mm.plugin.backup.h.m;
import com.tencent.mm.pointers.PLong;
import com.tencent.mm.protocal.c.bhy;
import com.tencent.mm.protocal.c.bhz;
import com.tencent.mm.protocal.c.bia;
import com.tencent.mm.protocal.c.ey;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.bl;
import com.tencent.mm.sdk.platformtools.j;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.apache.http.conn.util.InetAddressUtils;

public final class g
{
  private static List<String> gRN = null;
  
  public static <T extends a> T a(T paramT, byte[] paramArrayOfByte)
  {
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0)) {
      return null;
    }
    try
    {
      paramT.aG(paramArrayOfByte);
      return paramT;
    }
    catch (Exception paramT)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.BackupUtil", "ERROR: parseProBuf [%s] [%s]", new Object[] { paramT.getMessage(), bi.i(paramT) });
    }
    return null;
  }
  
  public static String a(ey paramey, int paramInt)
  {
    return a(paramey, paramInt, null);
  }
  
  public static String a(ey paramey, int paramInt, String paramString)
  {
    if ((paramey.rfA == paramInt) && (paramey.rfy != null))
    {
      paramey = com.tencent.mm.a.g.u(paramey.rfy.siK.lR);
      return paramey;
    }
    if ((paramey.rfx != null) && (paramey.rfw != null))
    {
      Iterator localIterator = paramey.rfx.iterator();
      int i = 0;
      for (;;)
      {
        if (!localIterator.hasNext()) {
          break label165;
        }
        if (((bia)localIterator.next()).siO == paramInt)
        {
          String str = ((bhz)paramey.rfw.get(i)).siM;
          if ((!bi.oW(paramString)) && (!str.endsWith(paramString)))
          {
            i = i + 1 + 1;
            continue;
          }
          paramey = str;
          if (e.cn(wu(str) + str)) {
            break;
          }
          return null;
        }
        i += 1;
      }
    }
    label165:
    return null;
  }
  
  public static String a(String paramString1, String paramString2, String... paramVarArgs)
  {
    if ((paramVarArgs == null) || (paramVarArgs.length == 0)) {
      return paramString1;
    }
    int i;
    int j;
    label40:
    String str;
    if (paramString1.equals(""))
    {
      paramString1 = new StringBuilder(paramVarArgs[0]);
      i = 1;
      int k = paramVarArgs.length;
      j = 0;
      if (j >= k) {
        break label96;
      }
      str = paramVarArgs[j];
      if (i == 0) {
        break label82;
      }
      i = 0;
    }
    for (;;)
    {
      j += 1;
      break label40;
      paramString1 = new StringBuilder(paramString1);
      i = 0;
      break;
      label82:
      paramString1.append(paramString2).append(str);
    }
    label96:
    return paramString1.toString();
  }
  
  /* Error */
  public static void a(String paramString, com.tencent.mm.plugin.backup.h.x paramx)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: aconst_null
    //   4: astore_3
    //   5: aload 4
    //   7: astore_2
    //   8: new 157	java/io/File
    //   11: dup
    //   12: aload_0
    //   13: invokespecial 158	java/io/File:<init>	(Ljava/lang/String;)V
    //   16: astore 5
    //   18: aload 4
    //   20: astore_2
    //   21: aload 5
    //   23: invokevirtual 161	java/io/File:exists	()Z
    //   26: ifne +12 -> 38
    //   29: aload 4
    //   31: astore_2
    //   32: aload 5
    //   34: invokevirtual 164	java/io/File:mkdirs	()Z
    //   37: pop
    //   38: aload 4
    //   40: astore_2
    //   41: new 125	java/lang/StringBuilder
    //   44: dup
    //   45: invokespecial 128	java/lang/StringBuilder:<init>	()V
    //   48: aload_0
    //   49: invokevirtual 136	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   52: aload_1
    //   53: getfield 169	com/tencent/mm/plugin/backup/h/x:hcI	Ljava/lang/String;
    //   56: invokevirtual 136	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   59: invokevirtual 139	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   62: astore_0
    //   63: aload 4
    //   65: astore_2
    //   66: new 157	java/io/File
    //   69: dup
    //   70: aload_0
    //   71: invokespecial 158	java/io/File:<init>	(Ljava/lang/String;)V
    //   74: astore 5
    //   76: aload 4
    //   78: astore_2
    //   79: aload 5
    //   81: invokevirtual 161	java/io/File:exists	()Z
    //   84: ifne +12 -> 96
    //   87: aload 4
    //   89: astore_2
    //   90: aload 5
    //   92: invokevirtual 172	java/io/File:createNewFile	()Z
    //   95: pop
    //   96: aload 4
    //   98: astore_2
    //   99: new 174	java/io/RandomAccessFile
    //   102: dup
    //   103: aload_0
    //   104: ldc -80
    //   106: invokespecial 179	java/io/RandomAccessFile:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   109: astore_0
    //   110: aload_0
    //   111: aload_1
    //   112: getfield 182	com/tencent/mm/plugin/backup/h/x:hcK	I
    //   115: i2l
    //   116: invokevirtual 186	java/io/RandomAccessFile:setLength	(J)V
    //   119: aload_0
    //   120: aload_1
    //   121: getfield 189	com/tencent/mm/plugin/backup/h/x:hcL	I
    //   124: i2l
    //   125: invokevirtual 192	java/io/RandomAccessFile:seek	(J)V
    //   128: aload_0
    //   129: aload_1
    //   130: getfield 195	com/tencent/mm/plugin/backup/h/x:hbs	Lcom/tencent/mm/bk/b;
    //   133: getfield 70	com/tencent/mm/bk/b:lR	[B
    //   136: invokevirtual 199	java/io/RandomAccessFile:write	([B)V
    //   139: aload_0
    //   140: invokevirtual 202	java/io/RandomAccessFile:close	()V
    //   143: return
    //   144: astore_1
    //   145: aload_3
    //   146: astore_0
    //   147: aload_0
    //   148: astore_2
    //   149: ldc 24
    //   151: aload_1
    //   152: ldc -52
    //   154: iconst_0
    //   155: anewarray 4	java/lang/Object
    //   158: invokestatic 208	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   161: aload_0
    //   162: ifnull -19 -> 143
    //   165: aload_0
    //   166: invokevirtual 202	java/io/RandomAccessFile:close	()V
    //   169: return
    //   170: astore_0
    //   171: return
    //   172: astore_0
    //   173: aload_2
    //   174: ifnull +7 -> 181
    //   177: aload_2
    //   178: invokevirtual 202	java/io/RandomAccessFile:close	()V
    //   181: aload_0
    //   182: athrow
    //   183: astore_0
    //   184: return
    //   185: astore_1
    //   186: goto -5 -> 181
    //   189: astore_1
    //   190: aload_0
    //   191: astore_2
    //   192: aload_1
    //   193: astore_0
    //   194: goto -21 -> 173
    //   197: astore_1
    //   198: goto -51 -> 147
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	201	0	paramString	String
    //   0	201	1	paramx	com.tencent.mm.plugin.backup.h.x
    //   7	185	2	localObject1	Object
    //   4	142	3	localObject2	Object
    //   1	96	4	localObject3	Object
    //   16	75	5	localFile	File
    // Exception table:
    //   from	to	target	type
    //   8	18	144	java/lang/Exception
    //   21	29	144	java/lang/Exception
    //   32	38	144	java/lang/Exception
    //   41	63	144	java/lang/Exception
    //   66	76	144	java/lang/Exception
    //   79	87	144	java/lang/Exception
    //   90	96	144	java/lang/Exception
    //   99	110	144	java/lang/Exception
    //   165	169	170	java/lang/Exception
    //   8	18	172	finally
    //   21	29	172	finally
    //   32	38	172	finally
    //   41	63	172	finally
    //   66	76	172	finally
    //   79	87	172	finally
    //   90	96	172	finally
    //   99	110	172	finally
    //   149	161	172	finally
    //   139	143	183	java/lang/Exception
    //   177	181	185	java/lang/Exception
    //   110	139	189	finally
    //   110	139	197	java/lang/Exception
  }
  
  public static boolean a(PLong paramPLong1, PLong paramPLong2, String paramString)
  {
    Object localObject = new StatFs(h.getExternalStorageDirectory().getPath());
    long l1 = ((StatFs)localObject).getBlockSize();
    paramPLong1.value = (((StatFs)localObject).getAvailableBlocks() * l1);
    localObject = h.getDataDirectory();
    StatFs localStatFs = new StatFs(((File)localObject).getPath());
    l1 = localStatFs.getBlockCount();
    long l2 = localStatFs.getAvailableBlocks();
    paramPLong2.value = (localStatFs.getBlockSize() * localStatFs.getAvailableBlocks());
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BackupUtil", "checkDataFull, SDAvailSize:%d, DataAvailSize%d, dbSize:%d", new Object[] { Long.valueOf(paramPLong1.value), Long.valueOf(paramPLong2.value), Long.valueOf(0L) });
    if (l1 <= 0L) {
      return false;
    }
    if (l1 - l2 < 0L) {
      return false;
    }
    if ((paramPLong1.value == paramPLong2.value) || (paramString.startsWith(((File)localObject).getPath()))) {
      paramPLong1.value = 0L;
    }
    return 0L <= paramPLong2.value;
  }
  
  public static int aR(String paramString, int paramInt)
  {
    int i = paramInt;
    if (!bi.oW(paramString)) {}
    try
    {
      i = Integer.valueOf(paramString).intValue();
      return i;
    }
    catch (Exception paramString)
    {
      com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.BackupUtil", paramString, "", new Object[0]);
    }
    return paramInt;
  }
  
  public static String aqZ()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    au.HU();
    return c.Gq() + "backupRecover/";
  }
  
  public static int ara()
  {
    Object localObject = new IntentFilter("android.intent.action.BATTERY_CHANGED");
    localObject = ad.getContext().registerReceiver(null, (IntentFilter)localObject);
    if (localObject == null) {}
    boolean bool;
    do
    {
      return 100;
      i = ((Intent)localObject).getIntExtra("status", -1);
      if ((i != 2) && (i != 5)) {
        break;
      }
      bool = true;
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BackupUtil", "checkBatteryLevel, battery isCharging[%b]", new Object[] { Boolean.valueOf(bool) });
    } while (bool);
    int i = ((Intent)localObject).getIntExtra("level", -1);
    int j = ((Intent)localObject).getIntExtra("scale", -1);
    if ((i >= 0) && (j > 0)) {}
    for (i = i * 100 / j;; i = 100)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BackupUtil", "checkBatteryLevel, battery level remaining[%d]", new Object[] { Integer.valueOf(i) });
      return i;
      bool = false;
      break;
    }
  }
  
  public static List<String> arb()
  {
    if (gRN != null) {
      return gRN;
    }
    gRN = new LinkedList();
    String[] arrayOfString = s.dAV;
    int j = arrayOfString.length;
    int i = 0;
    while (i < j)
    {
      String str = arrayOfString[i];
      gRN.add(str);
      i += 1;
    }
    gRN.add("weixin");
    gRN.add("weibo");
    gRN.add("qqmail");
    gRN.add("fmessage");
    gRN.add("tmessage");
    gRN.add("qmessage");
    gRN.add("qqsync");
    gRN.add("floatbottle");
    gRN.add("lbsapp");
    gRN.add("shakeapp");
    gRN.add("medianote");
    gRN.add("qqfriend");
    gRN.add("readerapp");
    gRN.add("newsapp");
    gRN.add("blogapp");
    gRN.add("facebookapp");
    gRN.add("masssendapp");
    gRN.add("meishiapp");
    gRN.add("feedsapp");
    gRN.add("voipapp");
    gRN.add("officialaccounts");
    gRN.add("helper_entry");
    gRN.add("pc_share");
    gRN.add("cardpackage");
    gRN.add("voicevoipapp");
    gRN.add("voiceinputapp");
    gRN.add("linkedinplugin");
    gRN.add("appbrandcustomerservicemsg");
    return gRN;
  }
  
  public static void b(String paramString, com.tencent.mm.plugin.backup.h.x paramx)
  {
    if ((TextUtils.isEmpty(paramString)) || (paramx == null)) {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.BackupUtil", "appendFile dir:%s req:%s ", new Object[] { paramString, paramx });
    }
    int i;
    int j;
    do
    {
      return;
      if ((TextUtils.isEmpty(paramx.hcI)) || (paramx.hbs == null) || (bi.bD(paramx.hbs.lR) <= 0))
      {
        localObject = paramx.hcI;
        b localb = paramx.hbs;
        if (paramx.hbs == null) {}
        for (paramString = "null";; paramString = Integer.valueOf(bi.bD(paramx.hbs.lR)))
        {
          com.tencent.mm.sdk.platformtools.x.e("MicroMsg.BackupUtil", "appendFile dataid:%s data:%s  %s", new Object[] { localObject, localb, paramString });
          return;
        }
      }
      i = 3;
      j = i - 1;
    } while (i <= 0);
    long l3 = ws(paramString + paramx.hcI);
    Object localObject = new File(paramString + paramx.hcI);
    long l1;
    label210:
    long l2;
    if (((File)localObject).exists())
    {
      l1 = ((File)localObject).length();
      i = e.b(paramString, paramx.hcI, paramx.hbs.lR);
      localObject = new File(paramString + paramx.hcI);
      if (!((File)localObject).exists()) {
        break label443;
      }
      l2 = ((File)localObject).length();
      label271:
      if (l1 != l2) {
        break label510;
      }
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.BackupUtil", "append failed and try again:%s", new Object[] { paramString + paramx.hcI });
      i = e.b(paramString, paramx.hcI, paramx.hbs.lR) * 10000;
    }
    label443:
    label510:
    for (;;)
    {
      l1 = ws(paramString + paramx.hcI);
      if ((i == 0) && (l1 >= paramx.hbs.lR.length))
      {
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.BackupUtil", "appendFile retry:%d append:%d  old:%d  new:%d  data:%d", new Object[] { Integer.valueOf(j), Integer.valueOf(i), Long.valueOf(l3), Long.valueOf(l1), Integer.valueOf(paramx.hbs.lR.length) });
        return;
        l1 = 0L;
        break label210;
        l2 = 0L;
        break label271;
      }
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.BackupUtil", "appendFile retry:%d append:%d  old:%d  new:%d  data:%d", new Object[] { Integer.valueOf(j), Integer.valueOf(i), Long.valueOf(l3), Long.valueOf(l1), Integer.valueOf(paramx.hbs.lR.length) });
      i = j;
      break;
    }
  }
  
  public static boolean b(ey paramey, int paramInt, String paramString)
  {
    if (paramey.rfA == paramInt)
    {
      paramey = paramey.rfy.siK.lR;
      if (paramey.length > 0) {}
    }
    do
    {
      return false;
      e.b(paramString, paramey, paramey.length);
      return true;
      paramey = a(paramey, paramInt, null);
    } while (bi.oW(paramey));
    j.q(wu(paramey) + paramey, paramString, false);
    return true;
  }
  
  public static byte[] b(ey paramey, int paramInt)
  {
    if ((paramey.rfA == paramInt) && (paramey.rfy != null)) {
      return paramey.rfy.siK.lR;
    }
    if ((paramey.rfx != null) && (paramey.rfw != null))
    {
      Iterator localIterator = paramey.rfx.iterator();
      int i = 0;
      while (localIterator.hasNext())
      {
        if (((bia)localIterator.next()).siO == paramInt)
        {
          paramey = ((bhz)paramey.rfw.get(i)).siM;
          paramey = wu(paramey) + paramey;
          paramInt = e.cm(paramey);
          if ((paramInt == 0) || (paramInt > 1048576))
          {
            com.tencent.mm.sdk.platformtools.x.e("MicroMsg.BackupUtil", "thumb not exist or  too big!");
            return null;
          }
          return e.f(paramey, 0, -1);
        }
        i += 1;
      }
    }
    return null;
  }
  
  public static String[] bQ(String paramString1, String paramString2)
  {
    return paramString1.split(paramString2);
  }
  
  public static m bU(long paramLong)
  {
    m localm = new m();
    String str2 = q.getDeviceID(ad.getContext());
    String str1 = str2;
    if (str2 == null) {
      str1 = q.zz();
    }
    localm.hbO = str1;
    localm.hbP = Build.MANUFACTURER;
    localm.hbQ = Build.MODEL;
    localm.hbR = "Android";
    localm.hbS = Build.VERSION.RELEASE;
    localm.hbT = d.qVN;
    localm.hbU = paramLong;
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BackupUtil", "getBackupStartGeneralInfo WechatVersion[%s], freespace[%d], deviceId[%s]", new Object[] { Integer.valueOf(d.qVN), Long.valueOf(paramLong), localm.hbO });
    return localm;
  }
  
  public static int c(ey paramey, int paramInt)
  {
    if (paramey.rfA == paramInt) {
      if (paramey.rfy != null) {}
    }
    for (;;)
    {
      return 0;
      return paramey.rfy.siK.lR.length;
      if ((paramey.rfx != null) && (paramey.rfw != null))
      {
        Iterator localIterator = paramey.rfx.iterator();
        int i = 0;
        while (localIterator.hasNext())
        {
          if (((bia)localIterator.next()).siO == paramInt)
          {
            paramey = ((bhz)paramey.rfw.get(i)).siM;
            return e.cm(wu(paramey) + paramey);
          }
          i += 1;
        }
      }
    }
  }
  
  public static String cQ(Context paramContext)
  {
    paramContext = (WifiManager)paramContext.getSystemService("wifi");
    if (paramContext.getWifiState() == 3)
    {
      paramContext = paramContext.getConnectionInfo();
      if (paramContext != null) {}
      for (;;)
      {
        try
        {
          paramContext = paramContext.getSSID();
          Context localContext = paramContext;
          if (paramContext.length() < 2) {
            break;
          }
          localContext = paramContext;
          if (!paramContext.startsWith("\"")) {
            break;
          }
          localContext = paramContext;
          if (!paramContext.endsWith("\"")) {
            break;
          }
          return paramContext.substring(1, paramContext.length() - 1);
        }
        catch (Exception paramContext)
        {
          com.tencent.mm.sdk.platformtools.x.e("MicroMsg.BackupUtil", "getConnectionInfo %s", new Object[] { paramContext });
          com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.BackupUtil", paramContext, "", new Object[0]);
          return "";
        }
        paramContext = "wifi";
      }
    }
    int i = 13;
    try
    {
      j = ((Integer)paramContext.getClass().getField("WIFI_AP_STATE_ENABLED").get(paramContext)).intValue();
      i = j;
      k = ((Integer)paramContext.getClass().getMethod("getWifiApState", new Class[0]).invoke(paramContext, new Object[0])).intValue();
      i = k;
      k = j;
      j = i;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        try
        {
          paramContext = ((WifiConfiguration)paramContext.getClass().getMethod("getWifiApConfiguration", new Class[0]).invoke(paramContext, new Object[0])).SSID;
          return paramContext;
        }
        catch (Exception paramContext)
        {
          int j;
          int k;
          com.tencent.mm.sdk.platformtools.x.e("MicroMsg.BackupUtil", "getWifiApConfiguration %s", new Object[] { paramContext });
          com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.BackupUtil", paramContext, "", new Object[0]);
        }
        localException = localException;
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.BackupUtil", "getWifiApState %s", new Object[] { localException });
        com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.BackupUtil", localException, "", new Object[0]);
        j = 0;
        k = i;
      }
      str = "";
    }
    if (j == k) {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BackupUtil", "getWifiName apmode");
    }
    String str;
    return str;
  }
  
  private static boolean ce(int paramInt1, int paramInt2)
  {
    try
    {
      Iterator localIterator1 = Collections.list(NetworkInterface.getNetworkInterfaces()).iterator();
      label46:
      int i;
      do
      {
        boolean bool;
        do
        {
          do
          {
            break label46;
            Iterator localIterator2;
            while (!localIterator2.hasNext())
            {
              if (!localIterator1.hasNext()) {
                break;
              }
              localIterator2 = Collections.list(((NetworkInterface)localIterator1.next()).getInetAddresses()).iterator();
            }
            localObject = (InetAddress)localIterator2.next();
          } while (((InetAddress)localObject).isLoopbackAddress());
          localObject = ((InetAddress)localObject).getHostAddress().toUpperCase();
          bool = InetAddressUtils.isIPv4Address((String)localObject);
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BackupUtil", "check ip:%s, isIPv4:%b", new Object[] { localObject, Boolean.valueOf(bool) });
        } while (!bool);
        Object localObject = ((String)localObject).split("\\.");
        i = n.w(new byte[] { (byte)(bi.getInt(localObject[0], 0) & 0xFF), (byte)(bi.getInt(localObject[1], 0) & 0xFF), (byte)(bi.getInt(localObject[2], 0) & 0xFF), (byte)(bi.getInt(localObject[3], 0) & 0xFF) });
      } while ((paramInt1 & paramInt2) != (i & paramInt1));
      return true;
    }
    catch (Exception localException) {}
    return false;
  }
  
  public static boolean d(ey paramey, int paramInt)
  {
    if ((paramey.rfA == paramInt) && (paramey.rfy != null)) {
      return true;
    }
    paramey = paramey.rfx.iterator();
    while (paramey.hasNext()) {
      if (((bia)paramey.next()).siO == paramInt) {
        return true;
      }
    }
    return false;
  }
  
  public static long ws(String paramString)
  {
    paramString = new File(paramString);
    if (!paramString.exists()) {
      return -1L;
    }
    if (!paramString.canRead()) {
      return -2L;
    }
    if (!paramString.canWrite()) {
      return -3L;
    }
    return paramString.length();
  }
  
  public static String wt(String paramString)
  {
    if ((paramString == null) || (paramString.equals(""))) {
      return "";
    }
    return aqZ() + "backupItem/" + wv(paramString);
  }
  
  public static String wu(String paramString)
  {
    if ((paramString == null) || (paramString.equals(""))) {
      return "";
    }
    return aqZ() + "backupMeida/" + wv(paramString);
  }
  
  private static String wv(String paramString)
  {
    if (paramString == null) {
      return "";
    }
    String str2 = com.tencent.mm.a.g.u(paramString.getBytes());
    paramString = "";
    String str1 = "";
    if (str2.length() > 0) {
      paramString = str2.charAt(0) + "/";
    }
    if (str2.length() >= 2) {
      str1 = str2.charAt(1) + "/";
    }
    return paramString + str1;
  }
  
  public static boolean ww(String paramString)
  {
    Object localObject = paramString.split("\\.");
    int k = n.w(new byte[] { (byte)(bi.getInt(localObject[0], 0) & 0xFF), (byte)(bi.getInt(localObject[1], 0) & 0xFF), (byte)(bi.getInt(localObject[2], 0) & 0xFF), (byte)(bi.getInt(localObject[3], 0) & 0xFF) });
    int m = n.w(new byte[] { -1, -1, -1, 0 });
    localObject = (WifiManager)ad.getContext().getSystemService("wifi");
    int i;
    if (((WifiManager)localObject).getWifiState() == 3)
    {
      i = ((WifiManager)localObject).getConnectionInfo().getIpAddress();
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BackupUtil", "oldIpStr:%s, localIp:%s", new Object[] { paramString, (i & 0xFF) + "." + (i >> 8 & 0xFF) + "." + (i >> 16 & 0xFF) + "." + (i >> 24 & 0xFF) });
      return (m & k) == (i & m);
    }
    for (;;)
    {
      try
      {
        i = ((Integer)localObject.getClass().getField("WIFI_AP_STATE_ENABLED").get(localObject)).intValue();
      }
      catch (Exception paramString)
      {
        try
        {
          j = ((Integer)localObject.getClass().getMethod("getWifiApState", new Class[0]).invoke(localObject, new Object[0])).intValue();
          if (j != i) {
            break;
          }
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BackupUtil", "matchip in apmode");
          return ce(m, k);
        }
        catch (Exception paramString)
        {
          int j;
          for (;;) {}
        }
        paramString = paramString;
        i = 13;
      }
      tmp334_331[0] = paramString;
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.BackupUtil", "getWifiApState %s", tmp334_331);
      com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.BackupUtil", paramString, "", new Object[0]);
      j = 0;
    }
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BackupUtil", "apState:%d", new Object[] { Integer.valueOf(j) });
    return false;
  }
  
  public static boolean wx(String paramString)
  {
    if (paramString == null) {}
    String str;
    do
    {
      return false;
      int i = paramString.indexOf('<');
      str = paramString;
      if (i > 0) {
        str = paramString.substring(i);
      }
    } while (bl.z(str, "msg") == null);
    return true;
  }
  
  public static long wy(String paramString)
  {
    SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
    try
    {
      long l = localSimpleDateFormat.parse(paramString).getTime();
      return l;
    }
    catch (ParseException localParseException)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.BackupUtil", "dateToTimeStamp failed. date:%s, stack:%s", new Object[] { paramString, bi.cjd() });
    }
    return 0L;
  }
  
  public static LinkedList<String> x(LinkedList<f.b> paramLinkedList)
  {
    LinkedList localLinkedList = new LinkedList();
    if (paramLinkedList != null)
    {
      paramLinkedList = paramLinkedList.iterator();
      while (paramLinkedList.hasNext()) {
        localLinkedList.add(((f.b)paramLinkedList.next()).gRI);
      }
    }
    return localLinkedList;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/backup/a/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */