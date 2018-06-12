package com.tencent.mm.plugin.exdevice.model;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.aee;
import com.tencent.mm.protocal.c.aef;
import com.tencent.mm.protocal.c.aeg;
import com.tencent.mm.protocal.c.aeh;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.LinkedList;

public final class z
  extends l
  implements k
{
  private com.tencent.mm.ab.e doG = null;
  private String ivJ = "";
  b ivx = null;
  
  public z(LinkedList<aef> paramLinkedList, String paramString1, String paramString2)
  {
    this.ivJ = paramString2;
    paramString2 = new b.a();
    paramString2.dIG = new aeg();
    paramString2.dIH = new aeh();
    paramString2.uri = "/cgi-bin/micromsg-bin/getharddeviceoperticket";
    paramString2.dIF = 543;
    paramString2.dII = 0;
    paramString2.dIJ = 0;
    this.ivx = paramString2.KT();
    paramString2 = (aeg)this.ivx.dID.dIL;
    if (!bi.oW(paramString1))
    {
      aee localaee = new aee();
      localaee.rgK = paramString1;
      paramString2.rIu = localaee;
    }
    paramString2.rIt = paramLinkedList;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.doG = parame1;
    return a(parame, this.ivx, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.exdevice.NetsceneGetHardDeviceOperTicket", "GetHardDeviceOperTicket onGYNetEnd netId = %s, errType = %s, errCode = %s, errMsg = %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if (this.doG != null) {
      this.doG.a(paramInt2, paramInt3, paramString, this);
    }
  }
  
  public final int getType()
  {
    return 543;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/exdevice/model/z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */