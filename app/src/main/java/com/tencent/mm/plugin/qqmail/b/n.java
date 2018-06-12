package com.tencent.mm.plugin.qqmail.b;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bry;
import com.tencent.mm.protocal.c.brz;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.x;

public final class n
  extends l
  implements k
{
  public final boolean ccZ;
  private b diG;
  private com.tencent.mm.ab.e diJ;
  private String mcY = "";
  
  public n(boolean paramBoolean, String paramString)
  {
    this.ccZ = paramBoolean;
    this.mcY = bi.oV(paramString);
  }
  
  public final boolean KX()
  {
    return true;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new bry();
    ((b.a)localObject).dIH = new brz();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/switchpushmail";
    ((b.a)localObject).dIF = 129;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (bry)this.diG.dID.dIL;
    if (this.ccZ) {}
    for (int i = 1;; i = 2)
    {
      ((bry)localObject).rDA = i;
      ((bry)localObject).spG = this.mcY;
      this.diJ = parame1;
      return a(parame, this.diG, this);
    }
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (brz)this.diG.dIE.dIL;
      au.HU();
      c.DT().set(17, Integer.valueOf(paramq.rDA));
    }
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 24;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/qqmail/b/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */