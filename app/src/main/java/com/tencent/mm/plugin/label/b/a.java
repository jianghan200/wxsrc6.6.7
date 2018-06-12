package com.tencent.mm.plugin.label.b;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.h;
import com.tencent.mm.protocal.c.aqf;
import com.tencent.mm.protocal.c.bp;
import com.tencent.mm.protocal.c.bq;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.ag;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public final class a
  extends l
  implements k
{
  private final b diG;
  private com.tencent.mm.ab.e diJ;
  private LinkedList<aqf> kAE = new LinkedList();
  
  public a(String paramString)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new bp();
    ((b.a)localObject).dIH = new bq();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/addcontactlabel";
    ((b.a)localObject).dIF = 635;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    if (!bi.oW(paramString))
    {
      localObject = new aqf();
      ((aqf)localObject).rSG = paramString;
      this.kAE.add(localObject);
    }
  }
  
  public a(List<String> paramList)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new bp();
    ((b.a)localObject).dIH = new bq();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/addcontactlabel";
    ((b.a)localObject).dIF = 635;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    if ((paramList != null) && (paramList.size() > 0))
    {
      int j = paramList.size();
      int i = 0;
      while (i < j)
      {
        localObject = new aqf();
        ((aqf)localObject).rSG = ((String)paramList.get(i));
        this.kAE.add(localObject);
        i += 1;
      }
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    x.d("MicroMsg.Label.NetSceneAddContactLabel", "cpan[doScene].");
    this.diJ = parame1;
    bp localbp = (bp)this.diG.dID.dIL;
    if ((this.kAE != null) && (this.kAE.size() > 0))
    {
      localbp.rbV = this.kAE;
      localbp.rbU = this.kAE.size();
      return a(parame, this.diG, this);
    }
    x.e("MicroMsg.Label.NetSceneAddContactLabel", "cpan[doScene] label list is null.");
    parame1.a(3, -1, "[doScene]empty contact list.", this);
    return 0;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.d("MicroMsg.Label.NetSceneAddContactLabel", "cpan[onGYNetEnd] netId:%d errType:%d errCode:%d errMsg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    paramq = aYL();
    if (paramq != null)
    {
      paramq = paramq.rbV;
      paramArrayOfByte = new ArrayList();
      int i = paramq.size();
      paramInt1 = 0;
      while (paramInt1 < i)
      {
        aqf localaqf = (aqf)paramq.get(paramInt1);
        ad localad = new ad();
        localad.field_labelID = localaqf.rSH;
        localad.field_labelName = localaqf.rSG;
        localad.field_labelPYFull = h.oI(localaqf.rSG);
        localad.field_labelPYShort = h.oJ(localaqf.rSG);
        localad.field_isTemporary = false;
        paramArrayOfByte.add(localad);
        paramInt1 += 1;
      }
      com.tencent.mm.plugin.label.e.aYJ().db(paramArrayOfByte);
      com.tencent.mm.plugin.label.e.aYJ().dc(paramArrayOfByte);
    }
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final bq aYL()
  {
    return (bq)this.diG.dIE.dIL;
  }
  
  public final int getType()
  {
    return 635;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/label/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */