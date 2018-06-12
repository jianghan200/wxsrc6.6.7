package com.tencent.mm.plugin.report.service;

import android.os.Build;
import android.os.Build.VERSION;
import com.tencent.mars.app.AppLogic;
import com.tencent.mars.smc.SmcLogic;
import com.tencent.mars.smc.SmcLogic.BaseInfo;
import com.tencent.mars.smc.SmcLogic.ICallBack;
import com.tencent.mars.smc.SmcProtoBufUtil;
import com.tencent.mm.ab.o;
import com.tencent.mm.c.f;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.b;
import com.tencent.mm.plugin.messenger.foundation.a.a.h.a;
import com.tencent.mm.plugin.report.b.h;
import com.tencent.mm.protocal.a.a.k;
import com.tencent.mm.protocal.c.ank;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Map;

public final class i
  implements SmcLogic.ICallBack
{
  public static IKVReportNotify mEZ = null;
  
  public static void KG(String paramString)
  {
    if (bi.oW(paramString))
    {
      x.w("MicroMsg.SmcCallBack", "msg content is null");
      return;
    }
    x.i("MicroMsg.SmcCallBack", "receive msg: " + paramString);
    Map localMap = f.z(paramString, "sysmsg");
    if ((localMap == null) || (localMap.size() == 0))
    {
      x.e("MicroMsg.SmcCallBack", "plugin msg parse fail:" + paramString);
      return;
    }
    String str = (String)localMap.get(".sysmsg.$type");
    if ((bi.oW(str)) || (!str.equalsIgnoreCase("getkvidkeystg")))
    {
      x.e("MicroMsg.SmcCallBack", "plugin msg parse fail:" + paramString);
      return;
    }
    long l1 = bi.getLong((String)localMap.get(".sysmsg.getkvidkeystg.generalversion"), -1L);
    long l2 = bi.getLong((String)localMap.get(".sysmsg.getkvidkeystg.specialversion"), -1L);
    long l3 = bi.getLong((String)localMap.get(".sysmsg.getkvidkeystg.whiteorblackuinversion"), -1L);
    long l4 = bi.getLong((String)localMap.get(".sysmsg.getkvidkeystg.timeinterval"), -1L);
    long l5 = bi.getLong((String)localMap.get(".sysmsg.getkvidkeystg.kvgeneralversion"), -1L);
    long l6 = bi.getLong((String)localMap.get(".sysmsg.getkvidkeystg.kvspecialversion"), -1L);
    long l7 = bi.getLong((String)localMap.get(".sysmsg.getkvidkeystg.kvwhiteorblackuinversion"), -1L);
    if ((l1 == -1L) || (l2 == -1L) || (l3 == -1L) || (l4 == -1L) || (-1L == l5) || (-1L == l6) || (-1L == l7))
    {
      x.e("MicroMsg.SmcCallBack", "plugin msg parse fail:" + paramString);
      return;
    }
    x.i("MicroMsg.SmcCallBack", "plugin msg version:" + l1 + ", " + l2 + ", " + l3);
    SmcLogic.OnPluginMsg(l5, l6, l7, l1, l2, l4);
  }
  
  public final boolean OnSelfMonitorOpLogReady(byte[] paramArrayOfByte)
  {
    com.tencent.mm.kernel.g.Eg();
    if (!a.Dw())
    {
      x.e("MicroMsg.SmcCallBack", "onReportKVDaSelfMonitorOpLogReady account not ready");
      return false;
    }
    try
    {
      k localk = new k();
      localk.aG(paramArrayOfByte);
      paramArrayOfByte = SmcProtoBufUtil.toMMSelfMonitor(localk);
      if (paramArrayOfByte.rPZ <= 0)
      {
        x.e("KVReportJni", "error selfmonitor count");
        return true;
      }
      ((com.tencent.mm.plugin.messenger.foundation.a.i)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FQ().b(new h.a(202, paramArrayOfByte));
      return true;
    }
    catch (Exception paramArrayOfByte)
    {
      x.e("KVReportJni", paramArrayOfByte.getMessage());
    }
    return false;
  }
  
  public final String getKVCommPath()
  {
    return AppLogic.getAppFilePath() + "/kvcomm/";
  }
  
  public final SmcLogic.BaseInfo getKVCommReqBaseInfo()
  {
    SmcLogic.BaseInfo localBaseInfo = new SmcLogic.BaseInfo();
    localBaseInfo.deviceModel = (Build.MODEL + Build.CPU_ABI);
    localBaseInfo.deviceBrand = Build.BRAND;
    localBaseInfo.osName = ("android-" + Build.MANUFACTURER);
    localBaseInfo.osVersion = Build.VERSION.SDK_INT;
    localBaseInfo.languageVer = w.chP();
    return localBaseInfo;
  }
  
  public final int getSingleReportBufSizeB()
  {
    return 20480;
  }
  
  public final void onReportDataReady(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt)
  {
    try
    {
      if ((mEZ != null) && (paramArrayOfByte2 != null) && (paramArrayOfByte2.length > 0)) {
        mEZ.onReportKVDataReady(paramArrayOfByte1, paramArrayOfByte2, paramInt);
      }
      return;
    }
    catch (Exception paramArrayOfByte1)
    {
      x.e("KVReportJni", paramArrayOfByte1.getMessage());
    }
  }
  
  public final boolean onRequestGetStrategy(byte[] paramArrayOfByte, int paramInt)
  {
    try
    {
      try
      {
        if (h.isRunning())
        {
          x.i("KVReportJni", "already running");
          return false;
        }
        paramArrayOfByte = new h();
        com.tencent.mm.kernel.g.Eh().dpP.a(paramArrayOfByte, 0);
        return true;
      }
      finally {}
      return false;
    }
    catch (Exception paramArrayOfByte)
    {
      x.e("KVReportJni", "onRequestGetStrategy error: " + paramArrayOfByte.getMessage());
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/report/service/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */