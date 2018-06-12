package com.tencent.mm.sandbox.monitor;

import com.tencent.mm.a.g;
import com.tencent.mm.c.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sandbox.b;
import com.tencent.mm.sandbox.updater.i;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ao;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.io.File;

public abstract class c
  implements b
{
  public static final String sDh = com.tencent.mm.compatible.util.e.bnE;
  public int sDi;
  public int sDj;
  public int sDk;
  public String sDl;
  private boolean sDm = false;
  
  public c(int paramInt1, String paramString, int paramInt2, boolean paramBoolean)
  {
    this.sDj = paramInt1;
    this.sDl = paramString;
    this.sDi = paramInt2;
    this.sDm = paramBoolean;
    this.sDk = com.tencent.mm.a.e.cm(beJ());
    paramString = new File(sDh);
    if (!paramString.exists()) {
      paramString.mkdirs();
    }
    x.d("MM.GetUpdatePack", "NetSceneGetUpdatePack : temp path = " + beJ() + " packOffset = " + this.sDk);
  }
  
  public static String Hw(String paramString)
  {
    return bq(paramString, false);
  }
  
  public static boolean VQ(String paramString)
  {
    return com.tencent.mm.a.e.cn(sDh + paramString + ".temp");
  }
  
  public static String VR(String paramString)
  {
    paramString = sDh + paramString + ".apk";
    if ((com.tencent.mm.a.e.cn(paramString)) && (a.cE(paramString))) {
      return paramString;
    }
    return null;
  }
  
  public static String bq(String paramString, boolean paramBoolean)
  {
    Object localObject1 = sDh + paramString + ".temp";
    String str3 = sDh + paramString + ".apk";
    if ((com.tencent.mm.a.e.cn((String)localObject1)) && (!paramBoolean) && ((a.cE((String)localObject1)) || (paramString.equalsIgnoreCase(g.cu((String)localObject1)))))
    {
      com.tencent.mm.a.e.i(sDh, paramString + ".temp", paramString + ".apk");
      return str3;
    }
    if (com.tencent.mm.a.e.cn(str3))
    {
      if (a.cE(str3))
      {
        x.i("MM.GetUpdatePack", "summertoken getReadyPack checkApkMd5 update pack ok");
        return str3;
      }
      localObject1 = null;
      try
      {
        String str2 = com.tencent.mm.c.c.p(new File(str3));
        str1 = str2;
        localObject1 = str2;
        if (bi.oW(str2))
        {
          localObject1 = str2;
          h.mEJ.a(322L, 10L, 1L, false);
          localObject1 = str2;
          h.mEJ.h(11098, new Object[] { Integer.valueOf(4010) });
          str1 = str2;
        }
      }
      catch (Exception localException)
      {
        Object localObject2;
        for (;;)
        {
          String str1;
          x.w("MM.GetUpdatePack", "summertoken getReadyPack getSecurityCode e:" + localException.getMessage());
          h.mEJ.a(322L, 9L, 1L, false);
          h.mEJ.h(11098, new Object[] { Integer.valueOf(4009), localException.getMessage() });
          localObject2 = localObject1;
        }
        paramString = i.cgX();
        x.i("MM.GetUpdatePack", "summertoken getReadyPack pkgsig[%s], downloadedSig[%s]", new Object[] { localObject2, paramString });
        if (!((String)localObject2).equals(paramString)) {
          break label389;
        }
        x.i("MM.GetUpdatePack", "summertoken getReadyPack pkgsig check update pack ok");
        return str3;
        x.i("MM.GetUpdatePack", "summertoken getReadyPack pkgsig check invalid");
        h.mEJ.a(322L, 11L, 1L, false);
        h.mEJ.h(11098, new Object[] { Integer.valueOf(4011), String.format("%s,%s", new Object[] { paramString, localObject2 }) });
        x.e("MM.GetUpdatePack", "summertoken getReadyPack: update pack MD5 not same");
        com.tencent.mm.a.e.deleteFile(str3);
      }
      x.i("MM.GetUpdatePack", "summertoken getReadyPack getSecurityCode pkgsig[%s]", new Object[] { str1 });
      if (bi.oW(str1))
      {
        if (!paramString.equalsIgnoreCase(g.cu(str3))) {
          break label452;
        }
        x.i("MM.GetUpdatePack", "summertoken getReadyPack no pkgsig getMD5 update pack ok");
        return str3;
      }
    }
    label389:
    label452:
    return null;
  }
  
  public String beJ()
  {
    return sDh + this.sDl + ".temp";
  }
  
  public String cgL()
  {
    return sDh + this.sDl + ".apk";
  }
  
  public final boolean cgM()
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (this.sDm)
    {
      bool1 = bool2;
      if (!ao.isWifi(ad.getContext())) {
        bool1 = true;
      }
    }
    return bool1;
  }
  
  public final void deleteTempFile()
  {
    try
    {
      x.d("MM.GetUpdatePack", "deleteTempFile");
      File localFile = new File(beJ());
      if (localFile.exists()) {
        localFile.delete();
      }
      return;
    }
    catch (Exception localException)
    {
      x.e("MM.GetUpdatePack", "error in deleteTempFile");
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/sandbox/monitor/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */