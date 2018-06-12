package com.tencent.mm.plugin.voip_cs.b.c;

import android.content.Context;
import android.telephony.TelephonyManager;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.l;
import com.tencent.mm.compatible.b.f;
import com.tencent.mm.model.au;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.voip.model.p;
import com.tencent.mm.plugin.voip.model.v2protocal;
import com.tencent.mm.plugin.voip.video.i;
import com.tencent.mm.plugin.voip_cs.b.c;
import com.tencent.mm.protocal.c.bzm;
import com.tencent.mm.protocal.c.bzn;
import com.tencent.mm.protocal.c.bzo;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.LinkedList;

public final class e
  extends l
  implements k
{
  public com.tencent.mm.ab.b diG;
  private com.tencent.mm.ab.e diJ;
  
  public e(long paramLong1, long paramLong2)
  {
    Object localObject1 = new b.a();
    ((b.a)localObject1).dIG = new bzn();
    ((b.a)localObject1).dIH = new bzo();
    ((b.a)localObject1).uri = "/cgi-bin/micromsg-bin/csvoipreport";
    ((b.a)localObject1).dIF = 312;
    ((b.a)localObject1).dII = 0;
    ((b.a)localObject1).dIJ = 0;
    this.diG = ((b.a)localObject1).KT();
    localObject1 = (bzn)this.diG.dID.dIL;
    ((bzn)localObject1).svs = paramLong1;
    ((bzn)localObject1).rxH = paramLong2;
    Object localObject2 = ((bzn)localObject1).svI;
    Object localObject3 = com.tencent.mm.plugin.voip_cs.b.b.bMx();
    Object localObject4 = new bzm();
    ((bzm)localObject4).hcE = 1;
    ((bzm)localObject4).svH = ((c)localObject3).kqW;
    x.i("MicroMsg.VoipCSReportHelper", "getVoipCSChannelReportData, result: %s", new Object[] { ((bzm)localObject4).svH });
    ((LinkedList)localObject2).add(localObject4);
    ((bzn)localObject1).svI.add(com.tencent.mm.plugin.voip_cs.b.b.bMx().bMz());
    localObject2 = ((bzn)localObject1).svI;
    localObject3 = com.tencent.mm.plugin.voip_cs.b.b.bMx();
    localObject4 = new bzm();
    ((bzm)localObject4).hcE = 3;
    ((c)localObject3).oOC = au.HV().yP();
    ((c)localObject3).za(com.tencent.mm.plugin.voip_cs.b.a.a.bMD().oNt.bMk());
    int i = ((c)localObject3).ovW & 0xFF;
    ((c)localObject3).oPR = i;
    ((c)localObject3).oPR = i;
    ((c)localObject3).oWY = com.tencent.mm.plugin.voip_cs.b.b.bMv().kqx.field_audioDuration;
    ((c)localObject3).oWZ = com.tencent.mm.plugin.voip_cs.b.b.bMv().kqx.field_videoDuration;
    if ((((c)localObject3).oWC != 1) && (((c)localObject3).oXk != 1))
    {
      ((c)localObject3).oWQ = 1;
      ((c)localObject3).oWJ = com.tencent.mm.plugin.voip.b.a.getNetType(ad.getContext());
      v2protocal localv2protocal = com.tencent.mm.plugin.voip_cs.b.b.bMv().kqx;
      localv2protocal.setJNIAppCmd(1, localv2protocal.oPz, localv2protocal.oPz.length);
      i = (int)(v2protocal.aU(localv2protocal.oPz) / 1000L);
      if ((((c)localObject3).oXf == 0) || (i <= ((c)localObject3).oXf)) {
        break label1613;
      }
      i -= ((c)localObject3).oXf;
      label401:
      ((c)localObject3).oWX = i;
      ((bzm)localObject4).svH = (((c)localObject3).oOw + "," + ((c)localObject3).oWG + "," + ((c)localObject3).kpp + "," + ((c)localObject3).oWH + "," + ((c)localObject3).oWI + "," + ((c)localObject3).oOj + "," + ((c)localObject3).oWJ + "," + ((c)localObject3).oWK + "," + ((c)localObject3).oWL + "," + ((c)localObject3).oWM + "," + ((c)localObject3).oOC + "," + ((c)localObject3).oOB + "," + ((c)localObject3).oWN + "," + ((c)localObject3).oWO + "," + ((c)localObject3).oWP + "," + ((c)localObject3).oWQ + "," + ((c)localObject3).oWR + "," + ((c)localObject3).oWS + "," + ((c)localObject3).oWT + "," + ((c)localObject3).oWU + "," + ((c)localObject3).oWV + "," + ((c)localObject3).oWW + "," + ((c)localObject3).oWX + "," + ((c)localObject3).kqM + "," + ((c)localObject3).oWY + "," + ((c)localObject3).oWZ + "," + ((c)localObject3).channelStrategy + "," + ((c)localObject3).oPR + "," + ((c)localObject3).oOD + "," + ((c)localObject3).oXa + "," + ((c)localObject3).oXb + "," + ((c)localObject3).oXc + "," + ((c)localObject3).deviceModel + "," + ((c)localObject3).oXd + "," + ((c)localObject3).oXe);
      x.i("MicroMsg.VoipCSReportHelper", "getVoipCSClientReportData, result: %s", new Object[] { ((bzm)localObject4).svH });
      ((LinkedList)localObject2).add(localObject4);
      localObject1 = ((bzn)localObject1).svI;
      localObject2 = com.tencent.mm.plugin.voip_cs.b.b.bMx();
      localObject3 = new bzm();
      ((bzm)localObject3).hcE = 4;
      ((c)localObject2).networkType = c.getNetType(ad.getContext());
      localObject4 = ((TelephonyManager)ad.getContext().getSystemService("phone")).getSimOperator();
      if (localObject4 == null) {
        break label1653;
      }
      if ((!((String)localObject4).equals("46000")) && (!((String)localObject4).equals("46002")) && (!((String)localObject4).equals("46007"))) {
        break label1619;
      }
      i = 1;
      label998:
      ((c)localObject2).oWD = i;
      ((c)localObject2).oWu = ((int)(System.currentTimeMillis() / 1000L));
      ((c)localObject2).oWE = c.bMA();
      ((c)localObject2).oOC = au.HV().yP();
      localObject4 = p.bKK();
      if (((p)localObject4).oMU == 0) {
        break label1659;
      }
      i = ((p)localObject4).oMT / ((p)localObject4).oMU;
      label1063:
      ((c)localObject2).oWF = i;
      if (((c)localObject2).oWF == -1)
      {
        localObject4 = new byte[4];
        if (com.tencent.mm.plugin.voip_cs.b.b.bMv().kqx.setAppCmd(10, (byte[])localObject4, 4) >= 0) {
          break label1665;
        }
        ((c)localObject2).oWF = 0;
        x.d("MicroMsg.VoipCSReportHelper", "get netStatus failed");
      }
    }
    for (;;)
    {
      x.i("MicroMsg.VoipCSReportHelper", "getVoipCSThirdPartData Report dataType=%d, dataTime=%s, isClickClose=%d, clickCloseTime=%s, videoFps=%d, videoRate=%d, cameraPixelWidth=%d, cameraPixelHeight=%d, recordPixelWidth=%d, recordPixelHeight=%d, cameraState=%d, networkType=%s, mobileType=%s, mobileNetworkType=%s, networkQuality=%d", new Object[] { Integer.valueOf(((c)localObject2).bjS), Integer.valueOf(((c)localObject2).oWu), Integer.valueOf(((c)localObject2).oWv), Integer.valueOf(((c)localObject2).oWw), Integer.valueOf(((c)localObject2).videoFps), Integer.valueOf(((c)localObject2).oWx), Integer.valueOf(((c)localObject2).oWy), Integer.valueOf(((c)localObject2).oWz), Integer.valueOf(((c)localObject2).oWA), Integer.valueOf(((c)localObject2).oWB), Integer.valueOf(((c)localObject2).oWC), Integer.valueOf(((c)localObject2).networkType), Integer.valueOf(((c)localObject2).oWD), Integer.valueOf(((c)localObject2).oWE), Integer.valueOf(((c)localObject2).oWF) });
      ((bzm)localObject3).svH = (((c)localObject2).bjS + "," + ((c)localObject2).oWu + "," + ((c)localObject2).oWv + "," + ((c)localObject2).oWw + "," + ((c)localObject2).videoFps + "," + ((c)localObject2).oWx + "," + ((c)localObject2).oWy + "," + ((c)localObject2).oWz + "," + ((c)localObject2).oWA + "," + ((c)localObject2).oWB + "," + ((c)localObject2).oWC + "," + ((c)localObject2).networkType + "," + ((c)localObject2).oWD + "," + ((c)localObject2).oWE + "," + ((c)localObject2).oWF + "," + ((c)localObject2).oWG + "," + ((c)localObject2).kpp);
      x.d("MicroMsg.VoipCSReportHelper", "getVoipCSThirdPartData, result: " + ((bzm)localObject3).svH);
      ((LinkedList)localObject1).add(localObject3);
      return;
      if (((c)localObject3).oWC != 1)
      {
        ((c)localObject3).oWQ = 2;
        break;
      }
      if (((c)localObject3).oXk != 1)
      {
        ((c)localObject3).oWQ = 3;
        break;
      }
      ((c)localObject3).oWQ = 0;
      break;
      label1613:
      i = 0;
      break label401;
      label1619:
      if (((String)localObject4).equals("46001"))
      {
        i = 3;
        break label998;
      }
      if (((String)localObject4).equals("46003"))
      {
        i = 2;
        break label998;
      }
      label1653:
      i = 0;
      break label998;
      label1659:
      i = -1;
      break label1063;
      label1665:
      ((c)localObject2).oWF = bi.aH((byte[])localObject4);
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneVoipCSReport", "onGYNetEnd, errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 312;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/voip_cs/b/c/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */