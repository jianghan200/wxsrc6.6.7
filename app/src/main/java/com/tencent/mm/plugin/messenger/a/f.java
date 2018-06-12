package com.tencent.mm.plugin.messenger.a;

import com.tencent.mm.aa.j;
import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.platformtools.ab;
import com.tencent.mm.plugin.d.a;
import com.tencent.mm.protocal.c.bhz;
import com.tencent.mm.protocal.c.biy;
import com.tencent.mm.protocal.c.biz;
import com.tencent.mm.protocal.c.bja;
import com.tencent.mm.protocal.c.bjp;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.g;
import java.util.Iterator;
import java.util.LinkedList;

public final class f
  extends l
  implements com.tencent.mm.network.k
{
  private final b diG;
  private com.tencent.mm.ab.e diJ;
  public final boolean lbK;
  
  public f(String paramString)
  {
    this(paramString, 0);
  }
  
  public f(String paramString, int paramInt)
  {
    this(paramString, paramInt, (byte)0);
  }
  
  private f(String paramString, int paramInt, byte paramByte)
  {
    this(paramString, 1, paramInt, false);
  }
  
  public f(String paramString, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    this.lbK = paramBoolean;
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new biz();
    ((b.a)localObject).dIH = new bja();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/searchcontact";
    ((b.a)localObject).dIF = 106;
    ((b.a)localObject).dII = 34;
    ((b.a)localObject).dIJ = 1000000034;
    this.diG = ((b.a)localObject).KT();
    x.d("MicroMsg.NetSceneSearchContact", "search username [%s]", new Object[] { paramString });
    localObject = (biz)this.diG.dID.dIL;
    ((biz)localObject).rvi = new bhz().VO(paramString);
    ((biz)localObject).sdG = paramInt1;
    ((biz)localObject).sjk = paramInt2;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    paramq = (bja)this.diG.dIE.dIL;
    if ((paramq != null) && (paramq.rHb > 0)) {
      paramArrayOfByte = paramq.rHc.iterator();
    }
    Object localObject;
    while (paramArrayOfByte.hasNext())
    {
      localObject = (biy)paramArrayOfByte.next();
      x.d("MicroMsg.NetSceneSearchContact", "search RES username [%s]", new Object[] { ((biy)localObject).rvi });
      j localj = new j();
      localj.username = ab.a(((biy)localObject).rvi);
      localj.dHR = ((biy)localObject).rqZ;
      localj.dHQ = ((biy)localObject).rra;
      localj.bWA = -1;
      x.d("MicroMsg.NetSceneSearchContact", "dkhurl search %s b[%s] s[%s]", new Object[] { localj.getUsername(), localj.Kx(), localj.Ky() });
      localj.csA = 3;
      localj.by(true);
      com.tencent.mm.aa.q.KH().a(localj);
      continue;
      if ((paramq != null) && (!bi.oW(ab.a(paramq.rvi))))
      {
        paramArrayOfByte = ab.a(paramq.rvi);
        localObject = new j();
        ((j)localObject).username = paramArrayOfByte;
        ((j)localObject).dHR = paramq.rqZ;
        ((j)localObject).dHQ = paramq.rra;
        ((j)localObject).bWA = -1;
        x.d("MicroMsg.NetSceneSearchContact", "dkhurl search %s b[%s] s[%s]", new Object[] { ((j)localObject).getUsername(), ((j)localObject).Kx(), ((j)localObject).Ky() });
        ((j)localObject).csA = 3;
        ((j)localObject).by(true);
        com.tencent.mm.aa.q.KH().a((j)localObject);
      }
    }
    if (paramq != null)
    {
      paramq = paramq.sjp.iterator();
      while (paramq.hasNext())
      {
        paramArrayOfByte = (bjp)paramq.next();
        localObject = new j();
        ((j)localObject).username = paramArrayOfByte.hbL;
        ((j)localObject).dHR = paramArrayOfByte.rqZ;
        ((j)localObject).dHQ = paramArrayOfByte.rra;
        ((j)localObject).bWA = -1;
        x.d("MicroMsg.NetSceneSearchContact", "dkhurl search %s b[%s] s[%s]", new Object[] { ((j)localObject).getUsername(), ((j)localObject).Kx(), ((j)localObject).Ky() });
        ((j)localObject).csA = 3;
        ((j)localObject).by(true);
        com.tencent.mm.aa.q.KH().a((j)localObject);
      }
    }
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final bja bcS()
  {
    bja localbja = (bja)this.diG.dIE.dIL;
    if (localbja != null)
    {
      Iterator localIterator = localbja.rHc.iterator();
      while (localIterator.hasNext())
      {
        biy localbiy = (biy)localIterator.next();
        a.ZN().Gw().fX(localbiy.rvi.siM, localbiy.rEJ);
      }
    }
    return localbja;
  }
  
  public final int getType()
  {
    return 106;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/messenger/a/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */