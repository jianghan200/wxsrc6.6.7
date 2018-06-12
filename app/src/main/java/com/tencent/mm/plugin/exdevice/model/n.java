package com.tencent.mm.plugin.exdevice.model;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.amw;
import com.tencent.mm.protocal.c.btw;
import com.tencent.mm.protocal.c.btx;
import com.tencent.mm.sdk.platformtools.x;

public final class n
  extends l
  implements k
{
  public String byN = null;
  b diG = null;
  private com.tencent.mm.ab.e diJ = null;
  public int ivD = 0;
  
  public n(amw paramamw, String paramString1, String paramString2, int paramInt)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new btw();
    ((b.a)localObject).dIH = new btx();
    ((b.a)localObject).uri = "/cgi-bin/mmoc-bin/hardware/transfermsgtodevice";
    ((b.a)localObject).dIF = 1717;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (btw)this.diG.dID.dIL;
    ((btw)localObject).reT = paramString1;
    ((btw)localObject).ruf = paramString2;
    ((btw)localObject).srn = paramamw;
    ((btw)localObject).sro = paramInt;
    this.byN = paramString2;
    this.ivD = paramInt;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.exdevice.NetSceneGetAppMsgInfo", "onGYNetEnd netId = " + paramInt1 + " errType = " + paramInt2 + " errCode = " + paramInt3 + paramString);
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 1717;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/exdevice/model/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */