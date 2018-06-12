package com.tencent.mm.plugin.setting.model;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bud;
import com.tencent.mm.protocal.c.cc;
import com.tencent.mm.protocal.c.cd;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public final class b
  extends l
  implements k
{
  private com.tencent.mm.ab.e diJ;
  private List<String> iKk;
  
  public b(List<String> paramList)
  {
    this.iKk = paramList;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    parame1 = new b.a();
    cc localcc = new cc();
    ArrayList localArrayList = new ArrayList();
    if (this.iKk != null)
    {
      int i = 0;
      while (i < this.iKk.size())
      {
        bud localbud = new bud();
        localbud.hbL = ((String)this.iKk.get(i));
        localArrayList.add(localbud);
        i += 1;
      }
    }
    localcc.rcx.addAll(localArrayList);
    parame1.dIG = localcc;
    parame1.dIH = new cd();
    parame1.uri = "/cgi-bin/micromsg-bin/addtrustedfriends";
    parame1.dIF = 583;
    parame1.dII = 0;
    parame1.dII = 0;
    return a(parame, parame1.KT(), this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    this.dIZ = paramInt1;
    if ((paramInt2 != 0) || (paramInt3 != 0)) {
      x.e("MicroMsg.NetSceneGetTrustedFriends", "errType:%d, errCode:%d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    }
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 583;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/setting/model/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */