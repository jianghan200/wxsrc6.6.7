package com.tencent.mm.plugin.sns;

import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.e;
import com.tencent.mm.ab.l;
import com.tencent.mm.g.a.hr;
import com.tencent.mm.g.a.hr.a;
import com.tencent.mm.g.a.ob;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.aj;
import com.tencent.mm.plugin.sns.model.q;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.protocal.c.boy;
import com.tencent.mm.protocal.c.boz;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.x;
import java.util.LinkedList;

public final class d
  extends c<hr>
  implements e
{
  private int nha;
  private boy nhb;
  private n nhc;
  private al nhd;
  
  public d()
  {
    this.sFo = hr.class.getName().hashCode();
  }
  
  private boolean a(hr paramhr)
  {
    if (!(paramhr instanceof hr))
    {
      x.f("MicroMsg.GetSnsObjectDetailListener", "mismatched event");
      return false;
    }
    this.nha = paramhr.bRa.bMQ;
    this.nhc = af.byo().xd(this.nha);
    this.nhb = aj.m(this.nhc);
    if ((this.nhb != null) && (((this.nhb.rXx == 3) && (this.nhb.smW != null) && (this.nhb.smW.size() > 0)) || ((this.nhb.rXx == 5) && (this.nhb.rWm != null) && (this.nhb.rWm.size() > 0))))
    {
      paramhr.bRb.bRc = this.nhb;
      return true;
    }
    paramhr = new q(this.nhc.field_snsId);
    ((boz)paramhr.diG.dID.dIL).snc = 1;
    g.Ek();
    g.Eh().dpP.a(210, this);
    g.Ek();
    g.Eh().dpP.a(paramhr, 0);
    this.nhd = new al(new d.1(this), false);
    this.nhd.J(10000L, 10000L);
    return true;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    x.i("MicroMsg.GetSnsObjectDetailListener", "dz:[onSceneEnd]errType:%d errCode:%d errMsg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    this.nhd.SO();
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      paramString = af.byo().fi(this.nhc.field_snsId);
      paraml = new ob();
      paraml.bYX.bRc = aj.m(paramString);
      a.sFg.m(paraml);
      return;
    }
    paramString = new ob();
    paramString.bYX.bRc = null;
    a.sFg.m(paramString);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */