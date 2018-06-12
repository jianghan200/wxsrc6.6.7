package com.tencent.mm.plugin.remittance.model;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.jd;
import com.tencent.mm.protocal.c.je;
import com.tencent.mm.sdk.platformtools.x;

public final class g
  extends l
  implements k
{
  private com.tencent.mm.ab.e diJ;
  private b eAN;
  jd mxa;
  public je mxb;
  public c mxc;
  public d mxd;
  public boolean mxe = false;
  public String mxf = "";
  public boolean mxg = false;
  public int mxh = 0;
  
  public g(int paramInt1, int paramInt2, int paramInt3, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, int paramInt4, c paramc, d paramd)
  {
    this.mxf = (System.currentTimeMillis() + paramInt1);
    b.a locala = new b.a();
    this.mxh = paramInt1;
    locala.dIG = new jd();
    locala.dIH = new je();
    locala.dIF = 2677;
    locala.uri = "/cgi-bin/mmpay-bin/busif2fgetfavor";
    locala.dII = 0;
    locala.dIJ = 0;
    this.eAN = locala.KT();
    this.mxa = ((jd)this.eAN.dID.dIL);
    this.mxa.amount = paramInt1;
    this.mxa.bVU = paramInt2;
    this.mxa.mwQ = paramInt3;
    this.mxa.rky = paramString1;
    this.mxa.myi = paramString2;
    this.mxa.mwR = paramString3;
    this.mxa.myl = paramString4;
    this.mxa.rcH = paramString5;
    this.mxa.mwS = paramString6;
    this.mxa.rkz = paramInt4;
    this.mxc = paramc;
    this.mxd = paramd;
    paramString1 = new StringBuffer();
    paramString1.append(String.format("request.amount %s", new Object[] { Integer.valueOf(this.mxa.amount) }));
    paramString1.append(String.format("request.channel %s", new Object[] { Integer.valueOf(this.mxa.bVU) }));
    paramString1.append(String.format("request.scan_scene %s", new Object[] { Integer.valueOf(this.mxa.mwQ) }));
    paramString1.append(String.format("request.receiver_desc %s", new Object[] { this.mxa.rky }));
    paramString1.append(String.format("request.mch_name %s", new Object[] { this.mxa.myi }));
    paramString1.append(String.format("request.favor_req_sign %s", new Object[] { this.mxa.mwR }));
    paramString1.append(String.format("request.receiver_openid %s", new Object[] { this.mxa.myl }));
    paramString1.append(String.format("request.receiver_username %s", new Object[] { this.mxa.rcH }));
    paramString1.append(String.format("request.favor_req_extend %s", new Object[] { this.mxa.mwS }));
    paramString1.append(String.format("request.fail_click_cell %s", new Object[] { Integer.valueOf(this.mxa.rkz) }));
    x.i("MicroMsg.NetSceneBusiF2fGetFavor", "NetSceneBusiF2fGetFavor req %s", new Object[] { paramString1.toString() });
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.eAN, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneBusiF2fGetFavor", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.mxb = ((je)((b)paramq).dIE.dIL);
    x.i("MicroMsg.NetSceneBusiF2fGetFavor", "ret_code: %s, ret_msg: %s favor_comm_resp : %s", new Object[] { Integer.valueOf(this.mxb.hwV), this.mxb.hwW, a.a(this.mxb.mwU) });
    if (this.diJ != null) {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
    }
  }
  
  public final int getType()
  {
    return 2677;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/remittance/model/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */