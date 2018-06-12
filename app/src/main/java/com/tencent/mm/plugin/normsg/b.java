package com.tencent.mm.plugin.normsg;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Debug;
import android.provider.Settings.Secure;
import android.provider.Settings.System;
import android.view.View;
import com.tencent.c.e.a.d.a;
import com.tencent.mm.bt.h;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.compatible.e.y;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.zip.CRC32;

 enum b
  implements com.tencent.mm.plugin.normsg.a.a
{
  private static final ah lFC = new ah("NormsgWorker");
  
  private b() {}
  
  private static String IP(String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    int j = paramString.length();
    int i = 0;
    if (i < j)
    {
      char c = paramString.charAt(i);
      switch (c)
      {
      default: 
        if (c > '~') {
          localStringBuilder.append("&#").append(c).append(';');
        }
        break;
      }
      for (;;)
      {
        i += 1;
        break;
        localStringBuilder.append("&quot;");
        continue;
        localStringBuilder.append("&amp;");
        continue;
        localStringBuilder.append("&apos;");
        continue;
        localStringBuilder.append("&lt;");
        continue;
        localStringBuilder.append("&gt;");
        continue;
        localStringBuilder.append("&#").append(c).append(';');
        continue;
        localStringBuilder.append(c);
      }
    }
    return localStringBuilder.toString();
  }
  
  private static String bjC()
  {
    try
    {
      Object localObject = ((ConnectivityManager)ad.getContext().getSystemService("connectivity")).getActiveNetworkInfo();
      if (((NetworkInfo)localObject).getType() == 1) {
        return "wifi";
      }
      localObject = ((NetworkInfo)localObject).getSubtype();
      return (String)localObject;
    }
    catch (Exception localException)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NormsgSourceImpl", "getNetTypeStr: %s", new Object[] { bi.i(localException) });
    }
    return "";
  }
  
  private static String db(int paramInt1, int paramInt2)
  {
    Object localObject3 = "";
    Object localObject1 = ad.getContext().getPackageManager();
    try
    {
      localObject1 = ((PackageManager)localObject1).getPackageInfo(ad.getPackageName(), 0);
      if (localObject1 != null) {
        localObject1 = ((PackageInfo)localObject1).applicationInfo.sourceDir;
      }
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      for (;;)
      {
        try
        {
          localObject1 = com.tencent.mm.c.c.p(new File((String)localObject1));
          localObject3 = localObject1;
          if (bi.oW((String)localObject1))
          {
            com.tencent.mm.plugin.report.f.mDy.a(322L, 13L, 1L, true);
            com.tencent.mm.plugin.report.f.mDy.h(11098, new Object[] { Integer.valueOf(4013), String.format("%s|%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }) });
            localObject3 = localObject1;
          }
          return (String)localObject3;
        }
        catch (Exception localException)
        {
          Object localObject2;
          com.tencent.mm.sdk.platformtools.x.w("MicroMsg.NormsgSourceImpl", "summertoken getSecurityCode e: " + localException.getMessage());
          com.tencent.mm.plugin.report.f.mDy.a(322L, 12L, 1L, true);
          com.tencent.mm.plugin.report.f.mDy.h(11098, new Object[] { Integer.valueOf(4012), String.format("%s|%s|%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), localException.getMessage() }) });
        }
        localNameNotFoundException = localNameNotFoundException;
        localObject2 = null;
        com.tencent.mm.sdk.platformtools.x.w("MicroMsg.NormsgSourceImpl", "app not installed, packageName = " + ad.getPackageName());
      }
    }
    return "0";
  }
  
  private static int getVersionCode()
  {
    int i = 0;
    Object localObject1 = ad.getContext().getPackageManager();
    try
    {
      localObject1 = ((PackageManager)localObject1).getPackageInfo(ad.getPackageName(), 0);
      if (localObject1 != null) {
        i = ((PackageInfo)localObject1).versionCode;
      }
      return i;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      for (;;)
      {
        Object localObject2 = null;
        com.tencent.mm.sdk.platformtools.x.w("MicroMsg.NormsgSourceImpl", "app not installed, packageName = " + ad.getPackageName());
      }
    }
  }
  
  public final String IO(String paramString)
  {
    int j = paramString.length();
    StringBuilder localStringBuilder = new StringBuilder(j);
    int i = 0;
    while (i < j)
    {
      localStringBuilder.append((char)(paramString.charAt(i) ^ 0xFFFFFFA7 ^ (byte)(i + 1 ^ j ^ 0xFFFFFFFF)));
      i += 1;
    }
    return localStringBuilder.toString();
  }
  
  public final void S(int paramInt1, int paramInt2, int paramInt3)
  {
    Object localObject = ad.getContext();
    if ((paramInt2 <= 0) || (paramInt2 > 4)) {
      throw new IllegalArgumentException("action invalid: " + paramInt2);
    }
    localObject = new d.a((Context)localObject, paramInt1, paramInt2, (byte)0);
    long l = paramInt3 * 1000;
    if (l < com.tencent.c.e.a.a.f.vjV) {
      ((d.a)localObject).vjA = com.tencent.c.e.a.a.f.vjV;
    }
    for (;;)
    {
      ((d.a)localObject).vjA = l;
      localObject = new com.tencent.c.e.a.d((d.a)localObject, (byte)0);
      com.tencent.c.e.a.e.cFl().a((com.tencent.c.e.a.d)localObject);
      return;
      if (l > com.tencent.c.e.a.a.f.vjS * 12L) {
        ((d.a)localObject).vjA = (com.tencent.c.e.a.a.f.vjS * 12L);
      }
    }
  }
  
  public final String a(Object[][] paramArrayOfObject)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("<st>");
    int j = paramArrayOfObject.length;
    int i = 0;
    while (i < j)
    {
      Object[] arrayOfObject = paramArrayOfObject[i];
      String str = IP(IO((String)arrayOfObject[0]));
      localStringBuilder.append('<').append(str).append('>').append(IP(String.valueOf(arrayOfObject[1]))).append('<').append('/').append(str).append('>');
      i += 1;
    }
    localStringBuilder.append("</st>");
    paramArrayOfObject = new CRC32();
    paramArrayOfObject.update(localStringBuilder.toString().getBytes());
    localStringBuilder.append("<ccdcc>").append(paramArrayOfObject.getValue()).append("</ccdcc>");
    localStringBuilder.append("<ccdts>").append(TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis())).append("</ccdts>");
    return localStringBuilder.toString();
  }
  
  public final void a(View paramView, Class<? extends com.tencent.mm.sdk.b.b> paramClass)
  {
    com.tencent.mm.plugin.normsg.b.c.a(paramView, paramClass);
  }
  
  public final boolean bI(Object paramObject)
  {
    return Normsg.c.bI(paramObject);
  }
  
  public final String bjD()
  {
    Object localObject = ad.getContext().getPackageManager().getInstalledPackages(0);
    StringBuilder localStringBuilder = new StringBuilder(8192);
    localObject = ((List)localObject).iterator();
    while (((Iterator)localObject).hasNext()) {
      localStringBuilder.append(((PackageInfo)((Iterator)localObject).next()).packageName).append('\n');
    }
    return localStringBuilder.toString();
  }
  
  public final byte[] bjE()
  {
    return Normsg.b.h(false, false, false);
  }
  
  public final boolean bjz()
  {
    return Normsg.b.bjz();
  }
  
  public final boolean c(Object paramObject, Class paramClass)
  {
    return Normsg.c.b(paramObject, paramClass);
  }
  
  public final boolean cKL()
  {
    try
    {
      boolean bool = Normsg.b.bjB();
      return bool;
    }
    catch (Throwable localThrowable)
    {
      com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.NormsgSourceImpl", localThrowable, "unexpected error.", new Object[0]);
    }
    return false;
  }
  
  public final String gV(boolean paramBoolean)
  {
    return Normsg.b.aI(",", paramBoolean);
  }
  
  public final String ub(int paramInt)
  {
    if (com.tencent.mm.kernel.g.Eg().Dx()) {}
    for (Object localObject1 = (String)com.tencent.mm.kernel.g.Ei().DT().get(79, "");; localObject1 = "")
    {
      com.tencent.mm.kernel.g.Em().h(new b.1(this), 5000L);
      String str1;
      if (com.tencent.mm.kernel.g.Eg().Dx()) {
        if (com.tencent.mm.kernel.g.Ei().dqq.tdM.tdm) {
          str1 = "1";
        }
      }
      for (;;)
      {
        Context localContext = ad.getContext().getApplicationContext();
        Object localObject2 = ((WifiManager)localContext.getSystemService("wifi")).getConnectionInfo();
        String str3 = ((WifiInfo)localObject2).getSSID();
        String str4 = ((WifiInfo)localObject2).getBSSID();
        localObject2 = ad.getContext();
        label129:
        int i;
        label131:
        label137:
        int j;
        label145:
        int k;
        label154:
        int m;
        label175:
        int n;
        label184:
        int i1;
        label193:
        label214:
        int i2;
        String str2;
        StringBuilder localStringBuilder1;
        Object localObject3;
        if (localObject2 == null)
        {
          com.tencent.mm.sdk.platformtools.x.w("MicroMsg.NormsgSourceImpl", "Failed checking mock location: application context not initialized.");
          i = 0;
          if (i == 0) {
            break label1071;
          }
          i = 1;
          if (!Normsg.b.bjz()) {
            break label1076;
          }
          j = 1;
          if (!Debug.isDebuggerConnected()) {
            break label1081;
          }
          k = 1;
          if ((!com.tencent.mm.plugin.normsg.b.f.lHa) && (!com.tencent.mm.plugin.normsg.b.f.lHb) && (!com.tencent.mm.plugin.normsg.b.f.lHc)) {
            break label1087;
          }
          m = 1;
          if (!com.tencent.mm.plugin.normsg.b.e.lGW) {
            break label1093;
          }
          n = 1;
          if (!com.tencent.mm.plugin.normsg.b.g.lHd) {
            break label1099;
          }
          i1 = 1;
          localObject2 = Normsg.b.bjA();
          if (localObject2 == null) {
            break label1105;
          }
          localObject2 = com.tencent.mm.plugin.normsg.b.d.q((byte[])localObject2, 0, localObject2.length);
          i2 = getVersionCode();
          str2 = db(i2, paramInt);
          Map localMap = q.zM();
          localStringBuilder1 = new StringBuilder();
          StringBuilder localStringBuilder2 = localStringBuilder1.append("<softtype><lctmoc>").append(i).append("</lctmoc><level>").append(j).append("</level>").append((String)localObject1).append("<k1>");
          localObject3 = (String)localMap.get("model name");
          localObject1 = localObject3;
          if (localObject3 == null) {
            localObject1 = q.zF()[0];
          }
          localStringBuilder2 = localStringBuilder2.append((String)localObject1).append("</k1><k2>").append(q.zH()).append("</k2><k3>").append(q.zI()).append("</k3><k4>").append(q.zy()).append("</k4><k5>").append(q.zJ()).append("</k5><k6>").append(q.zK()).append("</k6><k7>").append(q.getAndroidId()).append("</k7><k8>").append(q.zL()).append("</k8><k9>").append(q.zE()).append("</k9><k10>").append(q.zN()).append("</k10><k11>").append(bi.oV((String)localMap.get("hardware"))).append("</k11><k12>").append(bi.oV((String)localMap.get("revision"))).append("</k12><k13>").append(bi.oV((String)localMap.get("serial"))).append("</k13><k14>").append(q.zB()).append("</k14><k15>").append(q.zG()).append("</k15><k16>");
          localObject3 = (String)localMap.get("features");
          localObject1 = localObject3;
          if (localObject3 == null) {
            localObject1 = (String)localMap.get("flags");
          }
          localObject2 = localStringBuilder2.append(bi.oV((String)localObject1)).append("</k16><k18>").append((String)localObject2).append("</k18><k21>").append(bi.oV(str3)).append("</k21><k22>").append(bi.oV(q.bs(localContext))).append("</k22><k24>").append(bi.oV(str4)).append("</k24><k26>").append(k).append("</k26><k30>");
          localObject1 = ((ConnectivityManager)ad.getContext().getSystemService("connectivity")).getActiveNetworkInfo();
          if (localObject1 == null) {
            break label1112;
          }
        }
        label1071:
        label1076:
        label1081:
        label1087:
        label1093:
        label1099:
        label1105:
        label1112:
        for (localObject1 = ((NetworkInfo)localObject1).getExtraInfo();; localObject1 = null)
        {
          localObject3 = ((StringBuilder)localObject2).append(bi.oV((String)localObject1)).append("</k30><k33>").append(ad.getPackageName()).append("</k33><k34>").append(bi.oV(y.get("ro.build.fingerprint"))).append("</k34><k35>").append(bi.oV(Build.BOARD)).append("</k35><k36>").append(bi.oV(Build.BOOTLOADER)).append("</k36><k37>").append(bi.oV(Build.BRAND)).append("</k37><k38>").append(bi.oV(Build.DEVICE)).append("</k38><k39>").append(bi.oV(Build.HARDWARE)).append("</k39><k40>").append(bi.oV(Build.PRODUCT)).append("</k40><k41>").append(m).append("</k41><k42>").append(bi.oV(y.get("ro.product.manufacturer"))).append("</k42><k43>").append(Settings.System.getString(ad.getContext().getContentResolver(), "89884a87498ef44f")).append("</k43><k44>0</k44><k45>");
          localObject2 = bi.oV(bi.fR(ad.getContext()));
          localObject1 = localObject2;
          if (((String)localObject2).length() > 0) {
            localObject1 = com.tencent.mm.a.g.u(((String)localObject2).getBytes());
          }
          ((StringBuilder)localObject3).append((String)localObject1).append("</k45><k46>").append(str1).append("</k46><k47>").append(bjC()).append("</k47><k48>").append(q.zy()).append("</k48><k49>").append(com.tencent.mm.compatible.util.e.duM).append("</k49><k52>").append(n).append("</k52><k53>").append(i1).append("</k53><k57>").append(i2).append("</k57><k58>").append(bi.oV(str2)).append("</k58><k59>").append(paramInt).append("</k59><k61>").append(q.zA()).append("</k61></softtype>");
          return localStringBuilder1.toString();
          str1 = "0";
          break;
          if (Settings.Secure.getInt(((Context)localObject2).getContentResolver(), "mock_location", 0) == 0) {
            break label129;
          }
          i = 1;
          break label131;
          i = 0;
          break label137;
          j = 0;
          break label145;
          k = 0;
          break label154;
          m = 0;
          break label175;
          n = 0;
          break label184;
          i1 = 0;
          break label193;
          localObject2 = "";
          break label214;
        }
        str1 = "";
      }
    }
  }
  
  public final void uc(int paramInt)
  {
    com.tencent.mm.plugin.normsg.b.a.bjF().uc(paramInt);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/normsg/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */