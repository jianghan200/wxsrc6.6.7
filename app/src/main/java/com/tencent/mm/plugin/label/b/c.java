package com.tencent.mm.plugin.label.b;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.model.au;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.h;
import com.tencent.mm.protocal.c.aci;
import com.tencent.mm.protocal.c.acj;
import com.tencent.mm.protocal.c.aqf;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.ag;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public final class c
  extends l
  implements k
{
  private final b diG;
  private com.tencent.mm.ab.e diJ;
  
  public c()
  {
    b.a locala = new b.a();
    locala.dIG = new aci();
    locala.dIH = new acj();
    locala.uri = "/cgi-bin/micromsg-bin/getcontactlabellist";
    locala.dIF = 639;
    locala.dII = 0;
    locala.dIJ = 0;
    this.diG = locala.KT();
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    int i = 0;
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.Label.NetSceneGetContactLabelList", "cpan[onGYNetEnd] netId:%d errType:%d errCode:%d errMsg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      au.HU();
      com.tencent.mm.model.c.DT().set(209408, Long.valueOf(System.currentTimeMillis()));
      paramq = (acj)this.diG.dIE.dIL;
      if ((paramq != null) && (paramq.rbV != null))
      {
        paramq = paramq.rbV;
        paramArrayOfByte = new ArrayList();
        int j = paramq.size();
        paramInt1 = i;
        while (paramInt1 < j)
        {
          aqf localaqf = (aqf)paramq.get(paramInt1);
          ad localad = new ad();
          localad.field_labelID = localaqf.rSH;
          localad.field_labelName = localaqf.rSG;
          localad.field_labelPYFull = h.oI(localaqf.rSG);
          localad.field_labelPYShort = h.oJ(localaqf.rSG);
          paramArrayOfByte.add(localad);
          paramInt1 += 1;
        }
        com.tencent.mm.plugin.label.e.aYJ().dc(paramArrayOfByte);
        com.tencent.mm.plugin.label.e.aYJ().dd(com.tencent.mm.plugin.label.e.aYJ().de(paramArrayOfByte));
      }
    }
    for (;;)
    {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.Label.NetSceneGetContactLabelList", "cpan[onGYNetEnd] getcontactlabellist fail.");
    }
  }
  
  public final int getType()
  {
    return 639;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/label/b/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */