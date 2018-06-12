package com.tencent.mm.plugin.account.friend.a;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.l.b;
import com.tencent.mm.network.k;
import com.tencent.mm.pluginsdk.a;
import com.tencent.mm.protocal.c.arr;
import com.tencent.mm.protocal.c.atu;
import com.tencent.mm.protocal.c.bwc;
import com.tencent.mm.protocal.c.bwd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class al
  extends com.tencent.mm.ab.l
  implements k
{
  private int bOh;
  private com.tencent.mm.ab.e diJ;
  public final List<String> eLj;
  public final List<String> eLk;
  private final String eLl = (String)com.tencent.mm.kernel.g.Ei().DT().get(6, null);
  private int eLm = 0;
  private int eLn = 0;
  
  public al(List<String> paramList1, List<String> paramList2)
  {
    this.eLj = paramList1;
    this.eLk = paramList2;
    this.bOh = 1;
  }
  
  private static List<String> af(List<arr> paramList)
  {
    ArrayList localArrayList = new ArrayList();
    if ((paramList == null) || (paramList.size() == 0))
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneUploadMContact", "the req emai list is empty");
      return localArrayList;
    }
    paramList = paramList.iterator();
    while (paramList.hasNext()) {
      localArrayList.add(((arr)paramList.next()).v);
    }
    return localArrayList;
  }
  
  private static List<String> ag(List<atu> paramList)
  {
    ArrayList localArrayList = new ArrayList();
    if ((paramList == null) || (paramList.size() == 0))
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneUploadMContact", "the req mobile list is empty");
      return localArrayList;
    }
    paramList = paramList.iterator();
    while (paramList.hasNext()) {
      localArrayList.add(com.tencent.mm.a.g.u(a.pK(((atu)paramList.next()).v).getBytes()));
    }
    return localArrayList;
  }
  
  protected final int Cc()
  {
    return 10;
  }
  
  public final boolean KX()
  {
    return true;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    int m = 0;
    this.diJ = parame1;
    if (((this.eLj == null) || (this.eLj.size() == 0)) && ((this.eLk == null) || (this.eLk.size() == 0)))
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneUploadMContact", "listMobile or listEmile is null or zero");
      return -1;
    }
    parame1 = new b.a();
    parame1.dIG = new bwc();
    parame1.dIH = new bwd();
    parame1.uri = "/cgi-bin/micromsg-bin/uploadmcontact";
    parame1.dIF = 133;
    parame1.dII = 0;
    parame1.dIJ = 0;
    parame1 = parame1.KT();
    bwc localbwc = (bwc)parame1.dID.dIL;
    localbwc.rhu = this.eLl;
    localbwc.hbL = com.tencent.mm.model.q.GF();
    localbwc.rfe = this.bOh;
    int i = 200;
    Object localObject1 = new LinkedList();
    LinkedList localLinkedList = new LinkedList();
    do
    {
      int k;
      do
      {
        if (i <= 0) {
          break label428;
        }
        int j = i;
        Object localObject2;
        if (this.eLj != null)
        {
          j = i;
          if (this.eLm < this.eLj.size())
          {
            if (this.eLj.get(this.eLm) != null)
            {
              localObject2 = new atu();
              ((atu)localObject2).v = ((String)this.eLj.get(this.eLm));
              ((LinkedList)localObject1).add(localObject2);
            }
            this.eLm += 1;
            j = i - 1;
          }
        }
        k = j;
        if (this.eLk != null)
        {
          k = j;
          if (this.eLn < this.eLk.size())
          {
            if (this.eLk.get(this.eLn) != null)
            {
              localObject2 = new arr();
              ((arr)localObject2).v = ((String)this.eLk.get(this.eLn));
              localLinkedList.add(localObject2);
            }
            this.eLn += 1;
            k = j - 1;
          }
        }
        if (this.eLk == null) {
          break;
        }
        i = k;
      } while (this.eLn < this.eLk.size());
      if (this.eLj == null) {
        break;
      }
      i = k;
    } while (this.eLm < this.eLj.size());
    label428:
    localbwc.rTA = ((LinkedList)localObject1);
    localbwc.sss = ((LinkedList)localObject1).size();
    localbwc.ssu = localLinkedList;
    localbwc.sst = localLinkedList.size();
    localObject1 = new StringBuilder("doscene in:[");
    if (this.eLk == null)
    {
      i = 0;
      localObject1 = ((StringBuilder)localObject1).append(i).append(",");
      if (this.eLj != null) {
        break label601;
      }
    }
    label601:
    for (i = m;; i = this.eLj.size())
    {
      com.tencent.mm.sdk.platformtools.x.v("MicroMsg.NetSceneUploadMContact", i + "] index:[" + this.eLn + "," + this.eLm + "] req:[" + localbwc.ssu.size() + "," + localbwc.rTA.size() + "]");
      return a(parame, parame1, this);
      i = this.eLk.size();
      break;
    }
  }
  
  protected final int a(com.tencent.mm.network.q paramq)
  {
    paramq = (bwc)((b)paramq).dID.dIL;
    int i = paramq.ssu.size() + paramq.rTA.size();
    if ((i == 0) || (i > 200))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneUploadMContact", "security checked failed : exceed max send count");
      return l.b.dJn;
    }
    if ((paramq.rhu == null) || (paramq.rhu.length() <= 0))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneUploadMContact", "security checked failed : moblie null");
      return l.b.dJn;
    }
    if ((paramq.hbL == null) || (paramq.hbL.length() <= 0))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneUploadMContact", "security checked failed : username null");
      return l.b.dJn;
    }
    return l.b.dJm;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneUploadMContact", "onSceneEnd: errType = " + paramInt2 + " errCode = " + paramInt3 + " errMsg = " + paramString);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneUploadMContact", "onGYNetEnd  errType:" + paramInt2 + " errCode:" + paramInt3);
      this.diJ.a(paramInt2, paramInt3, paramString, this);
    }
    do
    {
      return;
      paramq = (bwc)((b)paramq).dID.dIL;
      l.ad(af(paramq.ssu));
      l.ad(ag(paramq.rTA));
      if (((this.eLk == null) || (this.eLn >= this.eLk.size())) && ((this.eLj == null) || (this.eLm >= this.eLj.size())))
      {
        this.diJ.a(paramInt2, paramInt3, paramString, this);
        return;
      }
    } while (a(this.dIX, this.diJ) >= 0);
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 133;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/account/friend/a/al.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */