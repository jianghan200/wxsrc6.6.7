package com.tencent.mm.plugin.voip_cs.b;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.NetworkInfo.State;
import android.os.Build;
import android.os.Build.VERSION;
import com.tencent.mm.compatible.e.m;
import com.tencent.mm.protocal.c.bzm;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class c
{
  public static int oWr = 0;
  public static int oWs = 1;
  public static int oWt = 2;
  public int bjS = 0;
  public int channelStrategy = 1;
  public String deviceModel = "";
  public long kpp = 0L;
  public long kqM = 0L;
  public String kqV = "";
  public String kqW = "";
  public int networkType = 0;
  public int oOB = 0;
  public int oOC = 0;
  public int oOD = 0;
  public int oOj = 0;
  public int oOw = 0;
  public int oPR = 0;
  public int oWA = 0;
  public int oWB = 0;
  public int oWC = 0;
  public int oWD = 0;
  public int oWE;
  public int oWF = 0;
  public long oWG = 0L;
  public String oWH = "";
  public int oWI;
  public int oWJ = 0;
  public int oWK = 0;
  public int oWL = 0;
  public int oWM = 0;
  public int oWN = 0;
  public int oWO = 1;
  public int oWP = 0;
  public int oWQ = 0;
  public int oWR = 0;
  public int oWS = 0;
  public long oWT = 0L;
  public int oWU;
  public long oWV = 0L;
  public long oWW = 0L;
  public long oWX = 0L;
  public int oWY;
  public int oWZ;
  public int oWu = 0;
  public int oWv = 0;
  public int oWw = 0;
  public int oWx = 0;
  public int oWy = 0;
  public int oWz = 0;
  public int oXa = -1;
  public int oXb = 0;
  public String oXc = "";
  public String oXd = "";
  public String oXe = "";
  public int oXf = 0;
  public int oXg = 0;
  public int oXh = 0;
  public int oXi = 0;
  public int oXj = 0;
  public int oXk = 0;
  public int ovW = m.zj();
  public int videoFps = 0;
  
  public c()
  {
    if (this.oXc.contains(",")) {
      this.oXc = this.oXc.replace(',', ' ');
    }
    this.deviceModel = Build.MODEL;
    if (this.deviceModel.contains(",")) {
      this.deviceModel = this.deviceModel.replace(',', ' ');
    }
    this.oXd = Build.VERSION.SDK;
    if (this.oXd.contains(",")) {
      this.oXd = this.oXd.replace(',', ' ');
    }
    this.oXe = Build.VERSION.RELEASE;
    if (this.oXe.contains(",")) {
      this.oXe = this.oXe.replace(',', ' ');
    }
  }
  
  public static int bMA()
  {
    try
    {
      Object localObject = (ConnectivityManager)ad.getContext().getSystemService("connectivity");
      if (localObject != null)
      {
        localObject = ((ConnectivityManager)localObject).getNetworkInfo(0);
        if (localObject == null) {
          return oWr;
        }
        if (((NetworkInfo)localObject).getState() == NetworkInfo.State.CONNECTED) {
          return oWs;
        }
        int i = oWt;
        return i;
      }
    }
    catch (Exception localException)
    {
      x.e("MicroMsg.VoipCSReportHelper", "isMobileNetworkAvailable fail!");
    }
    return oWr;
  }
  
  public static int getNetType(Context paramContext)
  {
    try
    {
      paramContext = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
      if (paramContext == null) {
        return 0;
      }
      if (paramContext.getType() == 1) {
        return 1;
      }
      if (paramContext.getType() != 0) {
        return 0;
      }
      if (paramContext.getSubtype() == 1) {
        return 2;
      }
      if (paramContext.getSubtype() == 2) {
        return 2;
      }
      if (paramContext.getSubtype() == 13) {
        return 4;
      }
      if ((paramContext.getSubtype() < 3) || (paramContext.getSubtype() >= 13))
      {
        int i = paramContext.getSubtype();
        if (i <= 13) {}
      }
      else
      {
        return 3;
      }
      return 2;
    }
    catch (NullPointerException paramContext)
    {
      x.printErrStackTrace("MicroMsg.VoipCSReportHelper", paramContext, "", new Object[0]);
    }
    return 0;
  }
  
  public final void bMy()
  {
    x.d("MicroMsg.VoipCSReportHelper", "markEndTalk");
    if ((this.oXj == 0) && (this.oXi != 0))
    {
      this.oXj = ((int)(System.currentTimeMillis() / 1000L));
      this.kqM = (this.oXj - this.oXi);
    }
  }
  
  public final bzm bMz()
  {
    bzm localbzm = new bzm();
    localbzm.hcE = 2;
    localbzm.svH = this.kqV;
    x.i("MicroMsg.VoipCSReportHelper", "getVoipCSEngineReportData, result: %s", new Object[] { localbzm.svH });
    String[] arrayOfString = this.kqV.split(",");
    if ((arrayOfString != null) && (arrayOfString.length > 0)) {}
    try
    {
      this.videoFps = bi.getInt(arrayOfString[8], 0);
      this.oWx = bi.getInt(arrayOfString[10], 0);
      return localbzm;
    }
    catch (Exception localException)
    {
      x.e("MicroMsg.VoipCSReportHelper", "get videoFps and rate fail!!");
    }
    return localbzm;
  }
  
  public final void za(int paramInt)
  {
    this.oOB = Math.abs(paramInt);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/voip_cs/b/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */