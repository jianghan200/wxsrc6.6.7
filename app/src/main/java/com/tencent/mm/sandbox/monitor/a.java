package com.tencent.mm.sandbox.monitor;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import com.tencent.mm.a.c;
import com.tencent.mm.a.g;
import com.tencent.mm.a.o;
import com.tencent.mm.pointers.PByteArray;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sandbox.updater.AppUpdaterUI;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.aa;
import java.io.File;
import java.io.FilenameFilter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimerTask;
import java.util.regex.Pattern;

public final class a
{
  static final HashMap<String, Integer> dhS;
  
  static
  {
    HashMap localHashMap = new HashMap(16);
    dhS = localHashMap;
    localHashMap.put("exception", Integer.valueOf(10001));
    dhS.put("anr", Integer.valueOf(10002));
    dhS.put("handler", Integer.valueOf(10003));
    dhS.put("sql", Integer.valueOf(10004));
    dhS.put("permission", Integer.valueOf(10005));
    dhS.put("main_thread_watch", Integer.valueOf(10006));
  }
  
  public static int a(String paramString1, String paramString2, b.a parama)
  {
    if (bi.oW(parama.toString())) {
      return -1;
    }
    Object localObject = new File(aa.duN + "crash/");
    if (!((File)localObject).exists()) {
      ((File)localObject).mkdir();
    }
    localObject = aa.duN + "crash/" + paramString1 + "." + paramString2 + ".crashini";
    com.tencent.mm.sdk.e.a.h((String)localObject, "count", bi.c(com.tencent.mm.sdk.e.a.fU((String)localObject, "count")) + 1L);
    if (bi.c(com.tencent.mm.sdk.e.a.fU((String)localObject, "lasttime")) == 0L) {
      com.tencent.mm.sdk.e.a.h((String)localObject, "lasttime", bi.VF());
    }
    localObject = aa.duN + "crash/" + paramString1 + "." + paramString2 + ".crashlog";
    x.d("MicroMsg.CrashUpload", "crash:[%s] len:[%d]", new Object[] { localObject, Integer.valueOf(parama.toString().length()) });
    a(parama);
    a((String)localObject, parama);
    return fK(paramString1, paramString2);
  }
  
  private static void a(b.a parama)
  {
    if (!parama.sCZ) {
      return;
    }
    Object localObject = new File(com.tencent.mm.compatible.util.e.duP);
    if (!((File)localObject).exists()) {
      ((File)localObject).mkdirs();
    }
    localObject = ((File)localObject).listFiles();
    if (localObject != null)
    {
      int j = localObject.length;
      int i = 0;
      while (i < j)
      {
        localSimpleDateFormat = localObject[i];
        if (bi.bH(localSimpleDateFormat.lastModified()) > 604800000L)
        {
          x.i("MicroMsg.CrashUpload", "dealWithSdcardCrash del old file: %s", new Object[] { localSimpleDateFormat.getPath() });
          localSimpleDateFormat.delete();
        }
        i += 1;
      }
    }
    localObject = new Date();
    SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("yyyyMMdd", Locale.getDefault());
    localObject = com.tencent.mm.compatible.util.e.duP + "crash_" + localSimpleDateFormat.format((Date)localObject) + ".txt";
    x.i("MicroMsg.CrashUpload", "dealWithSdcardCrash %s", new Object[] { localObject });
    a((String)localObject, parama);
  }
  
  private static void a(String paramString, b.a parama)
  {
    int i;
    StringBuilder localStringBuilder;
    Object localObject;
    if (!new File(paramString).exists())
    {
      i = ad.getContext().getSharedPreferences("system_config_prefs", 0).getInt("default_uin", 0);
      localStringBuilder = new StringBuilder();
      if (i != 0) {
        break label325;
      }
      localObject = bi.fP(ad.getContext());
      if (bi.oW((String)localObject)) {
        break label253;
      }
      localStringBuilder.append("uin[" + (String)localObject + "] ");
    }
    for (;;)
    {
      localStringBuilder.append(x.chT());
      localStringBuilder.append(" BRAND:[" + Build.BRAND + "] ");
      localObject = com.tencent.mm.compatible.e.q.zF();
      localStringBuilder.append("c1[" + localObject[0] + "] ");
      localStringBuilder.append("c2[" + localObject[1] + "] ");
      localStringBuilder.append("\n");
      com.tencent.mm.a.e.e(paramString, localStringBuilder.toString().getBytes());
      if (com.tencent.mm.a.e.cm(paramString) > 10485760) {
        com.tencent.mm.a.e.deleteFile(paramString);
      }
      com.tencent.mm.a.e.e(paramString, (parama.toString() + "\n").getBytes());
      return;
      label253:
      localObject = Build.DEVICE + Build.FINGERPRINT + Build.MANUFACTURER + Build.MODEL;
      localStringBuilder.append("uin[" + Integer.toString(((String)localObject).hashCode()) + "] ");
      continue;
      label325:
      localStringBuilder.append("uin[" + o.getString(i) + "] ");
    }
  }
  
  public static int cgK()
  {
    Object localObject = new File(aa.duN + "crash/");
    if (!((File)localObject).exists()) {
      x.w("MicroMsg.CrashUpload", "dkcrash checkUpload dir never create ?");
    }
    String[] arrayOfString;
    do
    {
      return -1;
      if (((File)localObject).isFile())
      {
        ((File)localObject).delete();
        x.w("MicroMsg.CrashUpload", "dkcrash is the fucking file ??");
        return -1;
      }
      arrayOfString = ((File)localObject).list(new FilenameFilter()
      {
        public final boolean accept(File paramAnonymousFile, String paramAnonymousString)
        {
          return paramAnonymousString.endsWith(".crashlog");
        }
      });
    } while ((arrayOfString == null) || (arrayOfString.length == 0));
    Pattern localPattern = Pattern.compile(".");
    int j = arrayOfString.length;
    int i = 0;
    if (i < j)
    {
      localObject = localPattern.split(arrayOfString[i]);
      String str;
      if ((localObject != null) && (localObject.length > 0))
      {
        str = localObject[0];
        if (localObject.length < 2) {
          break label153;
        }
      }
      label153:
      for (localObject = localObject[1];; localObject = "")
      {
        fK(str, (String)localObject);
        i += 1;
        break;
      }
    }
    return 1;
  }
  
  private static int fK(String paramString1, String paramString2)
  {
    String str1 = aa.duN + "crash/" + paramString1 + "." + paramString2 + ".crashini";
    long l1 = bi.c(com.tencent.mm.sdk.e.a.fU(str1, "count"));
    long l2 = bi.c(com.tencent.mm.sdk.e.a.fU(str1, "lasttime"));
    long l3 = bi.VF();
    String str2 = aa.duN + "crash/" + paramString1 + "." + paramString2 + ".crashlog";
    int i = com.tencent.mm.a.e.cm(str2);
    x.d("MicroMsg.CrashUpload", "dkcrash count:" + l1 + " t:" + (l3 - l2) + " len:" + i);
    if (i < 5242880)
    {
      byte[] arrayOfByte = com.tencent.mm.a.e.f(str2, 0, -1);
      if (!bi.bC(arrayOfByte))
      {
        i = arrayOfByte.length;
        String str3 = g.u(String.format("weixin#$()%d%d", new Object[] { Integer.valueOf(d.qVN), Integer.valueOf(i) }).getBytes()).toLowerCase();
        arrayOfByte = com.tencent.mm.a.q.r(arrayOfByte);
        PByteArray localPByteArray = new PByteArray();
        c.a(localPByteArray, arrayOfByte, str3.getBytes());
        com.tencent.mm.sdk.f.e.post(new a.2(i, str3, paramString2, paramString1, localPByteArray), "CrashUpload_upload");
      }
    }
    com.tencent.mm.a.e.deleteFile(str2);
    new com.tencent.mm.sdk.e.a(str1).cX("count", 0);
    com.tencent.mm.sdk.e.a.h(str1, "lasttime", bi.VF());
    return 1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/sandbox/monitor/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */