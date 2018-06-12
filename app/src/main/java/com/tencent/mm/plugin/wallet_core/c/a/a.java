package com.tencent.mm.plugin.wallet_core.c.a;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.azk;
import com.tencent.mm.protocal.c.azl;
import com.tencent.mm.sdk.platformtools.x;

public final class a
  extends l
  implements k
{
  private b diG;
  private com.tencent.mm.ab.e diJ;
  
  public a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new azk();
    ((b.a)localObject).dIH = new azl();
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/payibgcheckjsapisign";
    ((b.a)localObject).dIF = 1767;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (azk)this.diG.dID.dIL;
    ((azk)localObject).jQb = paramString1;
    ((azk)localObject).rsx = paramString4;
    ((azk)localObject).rsw = paramString2;
    ((azk)localObject).rsy = paramString5;
    ((azk)localObject).rsz = paramString6;
    ((azk)localObject).rhq = paramString3;
    ((azk)localObject).rrC = paramString7;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneIbgCheckJsapi", "check jsapi: errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    paramArrayOfByte = (azl)((b)paramq).dIE.dIL;
    paramInt1 = paramInt3;
    paramq = paramString;
    if (paramInt3 == 0)
    {
      paramInt1 = paramInt3;
      paramq = paramString;
      if (paramInt2 == 0)
      {
        paramInt1 = paramArrayOfByte.iwS;
        paramq = paramArrayOfByte.iwT;
      }
    }
    this.diJ.a(paramInt2, paramInt1, paramq, this);
  }
  
  public final int getType()
  {
    return 1767;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/c/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */