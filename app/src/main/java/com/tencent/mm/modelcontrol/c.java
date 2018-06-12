package com.tencent.mm.modelcontrol;

import android.content.Context;
import android.text.format.DateFormat;
import com.tencent.mm.bt.h.d;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.ar;
import com.tencent.mm.model.bd.b;
import com.tencent.mm.model.p;
import com.tencent.mm.plugin.zero.b.a;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ao;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

public class c
  implements ar
{
  public static c NM()
  {
    try
    {
      c localc = (c)p.v(c.class);
      return localc;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public static boolean NN()
  {
    Object localObject = ((a)g.l(a.class)).AT().getValue("C2CImgNotAutoDownloadTimeRange");
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BusyTimeControlLogic", "C2CImgNotAutoDownloadTimeRange value: " + (String)localObject);
    if (b.lz((String)localObject))
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreAutoDownload", "it is busy time now , do not auto download C2C image.");
      return false;
    }
    int i = bi.getInt(((a)g.l(a.class)).AT().getValue("ChatImgAutoDownload"), 1);
    if (i == 3)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreAutoDownload", "settings is not auto download C2C image. ChatImgAutoDownload : " + i);
      return false;
    }
    localObject = ad.getContext();
    if ((i == 2) && (ao.isWifi((Context)localObject)))
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreAutoDownload", "it is wifi now, auto download C2C image.");
      return true;
    }
    if ((i == 1) && (ao.isWifi((Context)localObject)))
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreAutoDownload", "it is wifi now, auto download C2C image.");
      return true;
    }
    long l2 = bi.getInt(((a)g.l(a.class)).AT().getValue("ChatImgAutoDownloadMax"), 0);
    long l1 = bi.a((Long)g.Ei().DT().get(aa.a.sPH, null), 0L);
    long l3 = bi.WV((String)DateFormat.format("M", System.currentTimeMillis()));
    long l4 = bi.a((Long)g.Ei().DT().get(aa.a.sPI, null), 0L);
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.SubCoreAutoDownload", "currentmonth " + l3 + " month " + l4 + " maxcount " + l2 + " current " + l1 + " downloadMode: " + i);
    if (l3 != l4)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreAutoDownload", "update month %d ", new Object[] { Long.valueOf(l3) });
      g.Ei().DT().a(aa.a.sPH, Long.valueOf(0L));
      g.Ei().DT().a(aa.a.sPI, Long.valueOf(l3));
      l1 = 0L;
    }
    for (;;)
    {
      if ((l1 > l2) && (l2 > 0L))
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreAutoDownload", "this month had auto download " + l1 + " C2C image, can not auto download.");
        return false;
      }
      if ((i == 1) && ((ao.isWifi((Context)localObject)) || (ao.is3G((Context)localObject)) || (ao.is4G((Context)localObject))))
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreAutoDownload", "it is wifi or 3,4G now, auto download C2C image.");
        return true;
      }
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreAutoDownload", "default can not auto download C2C image.");
      return false;
    }
  }
  
  public static boolean NO()
  {
    String str = ((a)g.l(a.class)).AT().getValue("SnsImgPreLoadingAroundTimeLimit");
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BusyTimeControlLogic", "SnsImgPreLoadingAroundTimeLimit value: " + str);
    if (b.lz(str))
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreAutoDownload", "it is busy time now, can not auto download SNS image.");
      return false;
    }
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreAutoDownload", "it is not busy time, can auto download SNS image.");
    return true;
  }
  
  public static boolean a(PInt paramPInt1, PInt paramPInt2)
  {
    paramPInt1.value = 0;
    int i = bi.getInt(((a)g.l(a.class)).AT().getValue("SIGHTAutoLoadNetwork"), 1);
    paramPInt2.value = i;
    if (i == 3)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreAutoDownload", "user settings can not auto download SNS short video[AD]");
      return false;
    }
    boolean bool = ao.isWifi(ad.getContext());
    if ((i == 2) && (!bool))
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreAutoDownload", "it is not wifi now, and status_only_wifi, not auto download SNS short video[AD].");
      return false;
    }
    if (ao.is2G(ad.getContext()))
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreAutoDownload", "it is 2G now, can not auto download SNS short video[AD].");
      return false;
    }
    paramPInt2 = ((a)g.l(a.class)).AT().getValue("SnsAdSightNotAutoDownloadTimeRange");
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BusyTimeControlLogic", "isSnsAdSightNotAutoDownload value: " + paramPInt2);
    if (b.lz(paramPInt2))
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreAutoDownload", "it is busy time now, can not auto(but need check again) download SNS short video[AD]");
      if (i == 2) {}
      for (i = 2;; i = 1)
      {
        paramPInt1.value = i;
        return false;
      }
    }
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreAutoDownload", "skip all not auto download case, then auto download[AD].");
    return true;
  }
  
  public static boolean a(PInt paramPInt1, PInt paramPInt2, PInt paramPInt3)
  {
    paramPInt1.value = 0;
    int i = bi.getInt(((a)g.l(a.class)).AT().getValue("SIGHTAutoLoadNetwork"), 1);
    paramPInt2.value = i;
    if (i == 3)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreAutoDownload", "user settings can not auto download SNS short video");
      return false;
    }
    boolean bool = ao.isWifi(ad.getContext());
    if ((i == 2) && (!bool))
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreAutoDownload", "it is not wifi now, and status_only_wifi, not auto download SNS short video.");
      return false;
    }
    if (ao.is2G(ad.getContext()))
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreAutoDownload", "it is 2G now, can not auto download SNS short video.");
      return false;
    }
    paramPInt2 = ((a)g.l(a.class)).AT().getValue("SnsSightNoAutoDownload");
    if (!bi.oW(paramPInt2)) {
      try
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreAutoDownload", "dynamicConfigValSeq " + paramPInt2);
        long l1 = bi.getLong(new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()), 0L) - ((int)b.NL() - 8) * 60L / 1000L;
        String[] arrayOfString = paramPInt2.split(",");
        long l2 = bi.getLong(arrayOfString[0], 0L);
        if ((l1 <= bi.getLong(arrayOfString[1], 0L)) && (l1 >= l2))
        {
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreAutoDownload", "config settings can not auto download SNS short video");
          paramPInt3.value = 1;
          return false;
        }
      }
      catch (Exception paramPInt3)
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.SubCoreAutoDownload", "paser error %s msg: %s", new Object[] { paramPInt2, paramPInt3.getMessage() });
      }
    }
    paramPInt2 = ((a)g.l(a.class)).AT().getValue("SnsSightNotAutoDownloadTimeRange");
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BusyTimeControlLogic", "SnsSightNotAutoDownloadTimeRange value: " + paramPInt2);
    if (b.lz(paramPInt2))
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreAutoDownload", "it is busy time now, can not auto download(but need check again) SNS short video");
      if (i == 2) {}
      for (i = 2;; i = 1)
      {
        paramPInt1.value = i;
        return false;
      }
    }
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreAutoDownload", "skip all not auto download case, then auto download.");
    return true;
  }
  
  public static boolean o(com.tencent.mm.storage.bd parambd)
  {
    if (parambd == null)
    {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.SubCoreAutoDownload", "this message is null, can not auto download.");
      return false;
    }
    if (!parambd.ckA())
    {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.SubCoreAutoDownload", "this message is not image, please tell cash.");
      return false;
    }
    if (!p(parambd))
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreAutoDownload", "this message need control, can not auto download C2C image.");
      return false;
    }
    return NN();
  }
  
  public static boolean p(com.tencent.mm.storage.bd parambd)
  {
    if (parambd == null)
    {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.SubCoreAutoDownload", "this message is null.");
      return false;
    }
    parambd = com.tencent.mm.model.bd.iF(parambd.cqb);
    if (parambd == null)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreAutoDownload", "this message had no msg source.");
      return true;
    }
    parambd = parambd.dCy;
    if (bi.oW(parambd))
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreAutoDownload", "this message had no not auto download time range config.");
      return true;
    }
    if (b.lz(parambd))
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreAutoDownload", "this message need control, can not auto download. timeRange : " + parambd);
      return false;
    }
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreAutoDownload", "this message need control, but it is not the time. timeRange: " + parambd);
    return true;
  }
  
  public final HashMap<Integer, h.d> Ci()
  {
    return null;
  }
  
  public final void bn(boolean paramBoolean) {}
  
  public final void bo(boolean paramBoolean) {}
  
  public final void gi(int paramInt) {}
  
  public final void onAccountRelease() {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/modelcontrol/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */