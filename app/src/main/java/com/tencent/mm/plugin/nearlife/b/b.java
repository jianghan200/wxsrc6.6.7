package com.tencent.mm.plugin.nearlife.b;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.aqr;
import com.tencent.mm.protocal.c.bhz;
import com.tencent.mm.protocal.c.qr;
import com.tencent.mm.protocal.c.qs;
import com.tencent.mm.protocal.k.e;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.LinkedList;

public final class b
  extends l
  implements k
{
  private com.tencent.mm.ab.b dIy;
  private com.tencent.mm.ab.e lCQ;
  public String lCR;
  
  public b(String paramString1, String paramString2, String paramString3, aqr paramaqr, int paramInt, LinkedList<bhz> paramLinkedList, String paramString4)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new qr();
    ((b.a)localObject).dIH = new qs();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/createpoi";
    ((b.a)localObject).dIF = 650;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.dIy = ((b.a)localObject).KT();
    paramString4 = bi.aG(paramString4, "");
    localObject = bi.aG(null, "");
    qr localqr = (qr)this.dIy.dID.dIL;
    localqr.jPe = paramString1;
    localqr.ruY = paramString2;
    localqr.rva = paramaqr;
    localqr.hbF = paramInt;
    if (paramLinkedList != null) {
      localqr.rvb = paramLinkedList;
    }
    localqr.rvc = paramString4;
    localqr.rvd = ((String)localObject);
    localqr.ruZ = paramString3;
    x.d("MicroMsg.NetSceneCreatePoi", "[req] name:%s, district:%s, Street: %s lat:%f, long:%f, count:%d, tel:%s, url:%s", new Object[] { paramString1, paramString2, paramString3, Float.valueOf(paramaqr.rms), Float.valueOf(paramaqr.rmr), Integer.valueOf(paramInt), paramString4, localObject });
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.lCQ = parame1;
    return a(parame, this.dIy, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.d("MicroMsg.NetSceneCreatePoi", "netId:%d, errType:%d, errCode:%d, errMsg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    paramq = (qs)this.dIy.dIE.dIL;
    if (this.dIy.dIE.qWB != 0)
    {
      this.lCQ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    this.lCR = paramq.rve;
    x.d("MicroMsg.NetSceneCreatePoi", "poi:" + this.lCR);
    this.lCQ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 650;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/nearlife/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */