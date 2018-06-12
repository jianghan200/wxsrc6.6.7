package com.tencent.mm.plugin.account.friend.a;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.d.a;
import com.tencent.mm.protocal.c.arf;
import com.tencent.mm.protocal.c.arg;
import com.tencent.mm.protocal.c.arh;
import com.tencent.mm.protocal.c.bhz;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class ag
  extends l
  implements k
{
  private final b diG;
  private com.tencent.mm.ab.e diJ = null;
  
  public ag(String paramString, List<String[]> paramList)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new arg();
    ((b.a)localObject).dIH = new arh();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/listmfriend";
    ((b.a)localObject).dIF = 431;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (arg)this.diG.dID.dIL;
    ((arg)localObject).rwj = paramString;
    ((arg)localObject).rTB = 0;
    if (paramList == null) {}
    for (;;)
    {
      ((arg)localObject).rTz = i;
      ((arg)localObject).rTC = new LinkedList();
      ((arg)localObject).rTA = new LinkedList();
      if (paramList == null) {
        break;
      }
      paramString = paramList.iterator();
      while (paramString.hasNext())
      {
        paramList = (String[])paramString.next();
        if (!bi.oW(paramList[2])) {
          ((arg)localObject).rTA.add(new bhz().VO(paramList[2]));
        }
      }
      i = paramList.size();
    }
  }
  
  public final LinkedList<arf> XR()
  {
    Object localObject = ((arh)this.diG.dIE.dIL).rTD;
    if (localObject != null)
    {
      localObject = ((LinkedList)localObject).iterator();
      while (((Iterator)localObject).hasNext())
      {
        arf localarf = (arf)((Iterator)localObject).next();
        a.ZN().Gw().fX(localarf.hbL, localarf.rEJ);
      }
    }
    return ((arh)this.diG.dIE.dIL).rTD;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    paramq = (arh)this.diG.dIE.dIL;
    com.tencent.mm.kernel.g.Em().a(new ag.1(this, paramq));
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 431;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/account/friend/a/ag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */