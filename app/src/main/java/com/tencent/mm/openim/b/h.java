package com.tencent.mm.openim.b;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.l.b;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.s;
import com.tencent.mm.network.q;
import com.tencent.mm.openim.a.a;
import com.tencent.mm.protocal.c.axq;
import com.tencent.mm.protocal.c.aya;
import com.tencent.mm.protocal.c.ayb;
import com.tencent.mm.protocal.c.bhy;
import com.tencent.mm.protocal.c.pm;
import com.tencent.mm.protocal.c.pn;
import com.tencent.mm.protocal.c.rk;
import com.tencent.mm.protocal.z;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ay;
import com.tencent.mm.storage.az;
import com.tencent.mm.storage.bq;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;

public final class h
  extends l
  implements com.tencent.mm.network.k
{
  private final com.tencent.mm.ab.b diG;
  private com.tencent.mm.ab.e diJ;
  
  public h()
  {
    b.a locala = new b.a();
    locala.dIG = new aya();
    locala.dIH = new ayb();
    locala.uri = "/cgi-bin/micromsg-bin/openimsync";
    locala.dIF = 810;
    this.diG = locala.KT();
    ((aya)this.diG.dID.dIL).selector = 2097152;
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetsceneOpenIMSync", "opim sync init:%d", new Object[] { Integer.valueOf(hashCode()) });
  }
  
  protected final int Cc()
  {
    return 20;
  }
  
  public final boolean KX()
  {
    return true;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    g.Ek();
    byte[] arrayOfByte = bi.WP(bi.oV((String)g.Ei().DT().get(8195, null)));
    bhy localbhy = new bhy();
    localbhy.bq(arrayOfByte);
    ((aya)this.diG.dID.dIL).saW = localbhy;
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  protected final int a(q paramq)
  {
    return l.b.dJm;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetsceneOpenIMSync", "netId :%d errType: %d, errCode: %d, errMsg:%s, hashcode:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString, Integer.valueOf(hashCode()) });
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    paramString = (aya)this.diG.dID.dIL;
    paramq = (ayb)this.diG.dIE.dIL;
    if ((paramq.saX != null) && (paramq.saX.hbG.size() > 0))
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetsceneOpenIMSync", "onGYNetEnd, cmd size:%d", new Object[] { Integer.valueOf(paramq.saX.hbG.size()) });
      paramArrayOfByte = paramq.saX.hbG.iterator();
      while (paramArrayOfByte.hasNext())
      {
        Object localObject1 = (pm)paramArrayOfByte.next();
        Object localObject2;
        if (((pm)localObject1).rtM == 400)
        {
          localObject2 = new axq();
          try
          {
            ((axq)localObject2).aG(((pm)localObject1).rtN.siK.lR);
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetsceneOpenIMSync", "processModContact %s", new Object[] { ((axq)localObject2).eup });
            localObject1 = i.a((axq)localObject2);
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetsceneOpenIMSync", "openim_processModContact user:%s nick:%s remark:%s, source:%d, sex%d, appId:%s, customDetail:%s, customDetailVisible:%d， type:%d, wordingId:%s", new Object[] { ((ai)localObject1).field_username, ((ai)localObject1).field_nickname, ((ai)localObject1).field_conRemark, Integer.valueOf(((ab)localObject1).getSource()), Integer.valueOf(((ai)localObject1).sex), ((ai)localObject1).field_openImAppid, ((ai)localObject1).cte, Integer.valueOf(((ai)localObject1).ctd), Integer.valueOf(((ai)localObject1).field_type), ((ai)localObject1).field_descWordingId });
            ((com.tencent.mm.plugin.messenger.foundation.a.i)g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FR().S((ab)localObject1);
            if (((ab)localObject1).BG()) {
              ((com.tencent.mm.plugin.messenger.foundation.a.i)g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FW().Yv(((ai)localObject1).field_username);
            }
            ((com.tencent.mm.openim.a.b)g.l(com.tencent.mm.openim.a.b.class)).aD(((axq)localObject2).hva, ((axq)localObject2).saS);
            i.b((axq)localObject2);
            g.Ek();
            localObject2 = ((com.tencent.mm.plugin.messenger.foundation.a.i)g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FS().Hh(((ai)localObject1).field_username);
            if ((localObject2 == null) || (bi.oW(((bq)localObject2).field_encryptUsername))) {
              continue;
            }
            String str = ((bq)localObject2).field_conRemark;
            ((a)g.l(a.class)).Q(((ai)localObject1).field_username, str);
            g.Ek();
            ((com.tencent.mm.plugin.messenger.foundation.a.i)g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FS().Hi(((ai)localObject1).field_username);
            ((ab)localObject1).dv(((bq)localObject2).field_conRemark);
            ((com.tencent.mm.plugin.messenger.foundation.a.i)g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FR().S((ab)localObject1);
          }
          catch (IOException localIOException1)
          {
            com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetsceneOpenIMSync", "processModContact error:%s", new Object[] { localIOException1 });
          }
        }
        else if (localIOException1.rtM == 402)
        {
          localObject2 = new rk();
          try
          {
            ((rk)localObject2).aG(localIOException1.rtN.siK.lR);
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetsceneOpenIMSync", "processDelContact user:%s", new Object[] { ((rk)localObject2).eup });
            ((com.tencent.mm.plugin.messenger.foundation.a.i)g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FW().Yp(((rk)localObject2).eup);
            s.hh(((rk)localObject2).eup);
          }
          catch (IOException localIOException2)
          {
            com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetsceneOpenIMSync", "processDelContact error:%s", new Object[] { localIOException2 });
          }
        }
      }
    }
    paramArrayOfByte = paramq.saW.siK.toByteArray();
    g.Ek();
    paramArrayOfByte = z.g(bi.WP(bi.oV((String)g.Ei().DT().get(8195, null))), paramArrayOfByte);
    if ((paramArrayOfByte != null) && (paramArrayOfByte.length > 0))
    {
      g.Ek();
      g.Ei().DT().set(8195, bi.bE(paramArrayOfByte));
    }
    paramInt1 = paramq.saY;
    if ((paramString.selector & paramInt1) == 0)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetsceneOpenIMSync", "onGYNetEnd end");
      this.diJ.a(0, 0, "", this);
      return;
    }
    a(this.dIX, this.diJ);
  }
  
  public final int getType()
  {
    return 810;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/openim/b/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */