package com.tencent.mm.plugin.remittance.model;

import android.net.wifi.WifiInfo;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.g.a.fo;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.soter.c.c;
import com.tencent.mm.plugin.wallet_core.model.ag;
import com.tencent.mm.plugin.wallet_core.model.o;
import com.tencent.mm.protocal.c.jh;
import com.tencent.mm.protocal.c.ji;
import com.tencent.mm.protocal.c.xb;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ao;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.c.d;
import java.net.URLDecoder;

public final class i
  extends l
  implements com.tencent.mm.network.k, d
{
  private com.tencent.mm.ab.e diJ;
  public com.tencent.mm.ab.b eAN;
  public ji mxj;
  public String mxk;
  public fo mxl = null;
  
  public i(String paramString1, String paramString2, int paramInt1, String paramString3, String paramString4, int paramInt2, int paramInt3, String paramString5, String paramString6, int paramInt4, int paramInt5, String paramString7, xb paramxb, String paramString8, int paramInt6, String paramString9, String paramString10, String paramString11, String paramString12)
  {
    Object localObject2 = new b.a();
    ((b.a)localObject2).dIG = new jh();
    ((b.a)localObject2).dIH = new ji();
    ((b.a)localObject2).dIF = 1633;
    ((b.a)localObject2).uri = "/cgi-bin/mmpay-bin/busif2fplaceorder";
    ((b.a)localObject2).dII = 0;
    ((b.a)localObject2).dIJ = 0;
    Object localObject1 = com.tencent.mm.plugin.soter.c.b.bFh();
    String str = ((c)localObject1).onE;
    localObject1 = ((c)localObject1).onF;
    this.mxk = paramString9;
    this.eAN = ((b.a)localObject2).KT();
    localObject2 = (jh)this.eAN.dID.dIL;
    ((jh)localObject2).myl = paramString1;
    ((jh)localObject2).rkC = URLDecoder.decode(paramString2);
    ((jh)localObject2).scene = paramInt1;
    ((jh)localObject2).rkD = paramString3;
    ((jh)localObject2).myf = paramString4;
    ((jh)localObject2).rcI = paramInt2;
    ((jh)localObject2).bVU = paramInt3;
    ((jh)localObject2).myg = paramString5;
    ((jh)localObject2).mym = paramString6;
    ((jh)localObject2).myk = paramInt4;
    ((jh)localObject2).rcH = paramString7;
    if (paramxb != null) {
      ((jh)localObject2).rcG = paramxb;
    }
    ((jh)localObject2).rkw = paramString8;
    ((jh)localObject2).mwQ = paramInt6;
    if (paramInt5 == 1)
    {
      paramString1 = ao.getWifiInfo(ad.getContext());
      if (paramString1 == null) {
        break label396;
      }
      ((jh)localObject2).rkE = paramString1.getBSSID();
    }
    for (;;)
    {
      ((jh)localObject2).rkF = 0;
      ((jh)localObject2).onE = str;
      ((jh)localObject2).onF = ((String)localObject1);
      ((jh)localObject2).rkH = o.bOW().bPu();
      g.l(com.tencent.mm.pluginsdk.k.class);
      ((jh)localObject2).rkG = false;
      ((jh)localObject2).rkI = paramString9;
      ((jh)localObject2).myi = paramString10;
      ((jh)localObject2).nickname = paramString11;
      ((jh)localObject2).mxM = paramString12;
      x.i("MicroMsg.NetSceneBusiF2fPlaceOrder", "dycodeurl: %s", new Object[] { paramString9 });
      x.i("MicroMsg.NetSceneBusiF2fPlaceOrder", "NetSceneBusiF2fPlaceOrder, scene: %s, channel: %s, total: %s, qrcode: %s, getPayWifi: %s favor_compose_info %s dynamicCodeUrl %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt3), Integer.valueOf(paramInt2), paramString2, Integer.valueOf(paramInt5), a.a(paramxb), paramString9 });
      return;
      label396:
      x.w("MicroMsg.NetSceneBusiF2fPlaceOrder", "wifi info is null");
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.eAN, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneBusiF2fPlaceOrder", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.mxj = ((ji)((com.tencent.mm.ab.b)paramq).dIE.dIL);
    paramq = new StringBuffer();
    paramq.append(String.format("trans_id: %s,", new Object[] { this.mxj.rcE }));
    paramq.append(String.format("zero_pay_flag: %s,", new Object[] { Integer.valueOf(this.mxj.rkP) }));
    paramq.append(String.format("can_use_fingerprint: %s,", new Object[] { Integer.valueOf(this.mxj.rkV) }));
    paramq.append(String.format("payer_need_auth_flag: %s,", new Object[] { Integer.valueOf(this.mxj.rkQ) }));
    x.i("MicroMsg.NetSceneBusiF2fPlaceOrder", "ret_code: %s, ret_msg: %s trans_id: %s f2f_id: %s re_getfavor: %s payok_checksign: %s reqKey %s ret:%s", new Object[] { Integer.valueOf(this.mxj.hwV), this.mxj.hwW, this.mxj.rcE, this.mxj.rcD, Integer.valueOf(this.mxj.rkO), this.mxj.rcF, this.mxj.bQa, paramq.toString() });
    if (this.diJ != null) {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
    }
  }
  
  public final int getType()
  {
    return 1633;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/remittance/model/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */