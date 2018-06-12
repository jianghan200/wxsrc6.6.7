package com.tencent.mm.plugin.scanner.a;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.ip;
import com.tencent.mm.protocal.c.iq;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.sdk.platformtools.x;

public final class h
  extends l
  implements k
{
  private b diG;
  private com.tencent.mm.ab.e diJ;
  
  public h(String paramString1, String paramString2, int paramInt1, String paramString3, int paramInt2, int paramInt3)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new ip();
    ((b.a)localObject).dIH = new iq();
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/usrmsg/bizscanproductreport";
    ((b.a)localObject).dIF = 1064;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (ip)this.diG.dID.dIL;
    ((ip)localObject).rjL = d.qVI;
    ((ip)localObject).rjM = d.qVH;
    ((ip)localObject).rjN = d.qVK;
    ((ip)localObject).rjO = d.qVL;
    ((ip)localObject).rjP = w.chP();
    ((ip)localObject).mEk = 11294;
    ((ip)localObject).rjQ = null;
    ((ip)localObject).mFz = paramString1;
    ((ip)localObject).mFy = paramString2;
    ((ip)localObject).type = paramInt1;
    ((ip)localObject).value = paramString3;
    ((ip)localObject).count = paramInt2;
    ((ip)localObject).lKQ = paramInt3;
    x.v("MircoMsg.NetSceneScanProductReport", "statid:" + paramString2);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.d("MircoMsg.NetSceneScanProductReport", "errType = " + paramInt2 + ", errCode = " + paramInt3);
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 1064;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/scanner/a/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */