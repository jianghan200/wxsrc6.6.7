package com.tencent.mm.plugin.fav.a;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.l.b;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.fo;
import com.tencent.mm.protocal.c.fp;
import com.tencent.mm.protocal.c.re;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public final class ag
  extends l
  implements k
{
  private final com.tencent.mm.ab.b diG;
  private com.tencent.mm.ab.e diJ = null;
  private LinkedList<Integer> iWK;
  private int iWL = 0;
  
  public ag(LinkedList<Integer> paramLinkedList)
  {
    b.a locala = new b.a();
    locala.dIG = new fo();
    locala.dIH = new fp();
    locala.uri = "/cgi-bin/micromsg-bin/batchdelfavitem";
    locala.dIF = 403;
    locala.dII = 194;
    locala.dIJ = 1000000194;
    this.diG = locala.KT();
    this.iWK = paramLinkedList;
  }
  
  private boolean aLK()
  {
    if ((this.iWK != null) && (this.iWL < this.iWK.size())) {}
    for (boolean bool = true;; bool = false)
    {
      x.i("MicroMsg.NetSceneBatchDelFavItem", "check need continue, indexOK %B", new Object[] { Boolean.valueOf(bool) });
      return bool;
    }
  }
  
  protected final int Cc()
  {
    return 10;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    if ((this.iWK == null) || (this.iWK.isEmpty()) || (this.iWL >= this.iWK.size()))
    {
      x.e("MicroMsg.NetSceneBatchDelFavItem", "klem doScene idList null, begIndex %d", new Object[] { Integer.valueOf(this.iWL) });
      return -1;
    }
    this.diJ = parame1;
    x.i("MicroMsg.NetSceneBatchDelFavItem", "ashutest::do netscene size %d, begIndex %d, total %s", new Object[] { Integer.valueOf(this.iWK.size()), Integer.valueOf(this.iWL), this.iWK });
    parame1 = (fo)this.diG.dID.dIL;
    parame1.rgy.clear();
    int j = this.iWL;
    int i = 0;
    if (j < this.iWK.size())
    {
      int k = ((Integer)this.iWK.get(j)).intValue();
      if (k <= 0) {
        break label253;
      }
      parame1.rgy.add(Integer.valueOf(k));
      i += 1;
    }
    label253:
    for (;;)
    {
      if (i < 20)
      {
        j += 1;
        break;
      }
      this.iWL = (j + 1);
      parame1.hbF = parame1.rgy.size();
      x.i("MicroMsg.NetSceneBatchDelFavItem", "ashutest::do netscene checkd size %d, %s", new Object[] { Integer.valueOf(parame1.hbF), parame1.rgy });
      return a(parame, this.diG, this);
    }
  }
  
  protected final int a(q paramq)
  {
    return l.b.dJm;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneBatchDelFavItem", "netId %d errType %d errCode %d begIndex %d idListSize %d errMsg %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(this.iWL), Integer.valueOf(this.iWK.size()), paramString });
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      if (aLK())
      {
        a(this.dIX, this.diJ);
        return;
      }
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    paramq = ((fp)((com.tencent.mm.ab.b)paramq).dIE.dIL).hbG;
    if ((paramq == null) || (paramq.size() == 0))
    {
      x.e("MicroMsg.NetSceneBatchDelFavItem", "klem onGYNet resp list null");
      if (aLK())
      {
        a(this.dIX, this.diJ);
        return;
      }
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    paramArrayOfByte = new ArrayList();
    x.i("MicroMsg.NetSceneBatchDelFavItem", "klem onGYNet respList size:%d", new Object[] { Integer.valueOf(paramq.size()) });
    paramInt1 = 0;
    if (paramInt1 < paramq.size())
    {
      re localre = (re)paramq.get(paramInt1);
      if (localre.rfn < 0) {
        x.w("MicroMsg.NetSceneBatchDelFavItem", "klem onGYNet favId:%d, delete failed", new Object[] { Integer.valueOf(localre.rbY) });
      }
      for (;;)
      {
        paramInt1 += 1;
        break;
        paramArrayOfByte.add(Integer.valueOf(localre.rbY));
        x.i("MicroMsg.NetSceneBatchDelFavItem", "klem onGYNet favId:%d deleted", new Object[] { Integer.valueOf(localre.rbY) });
      }
    }
    b.ba(paramArrayOfByte);
    if (aLK())
    {
      a(this.dIX, this.diJ);
      return;
    }
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 403;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/fav/a/ag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */