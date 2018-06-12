package com.tencent.mm.plugin.sns.e;

import com.tencent.mm.g.a.qb;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.an;
import com.tencent.mm.plugin.sns.model.b;
import com.tencent.mm.plugin.sns.model.b.b;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.x;

public final class a
  implements b.b
{
  public c nll = new a.1(this);
  
  public a()
  {
    com.tencent.mm.sdk.b.a.sFg.b(this.nll);
    af.byj().a(this);
  }
  
  public final void LR(String paramString)
  {
    x.i("MicroMsg.FTS.FTSSnsImageDownloadLogic", "onThumbFinish mediaId=%s", new Object[] { paramString });
    qb localqb = new qb();
    localqb.caJ.bIH = 2;
    localqb.caJ.mediaId = paramString;
    String str = an.s(af.getAccSnsPath(), paramString);
    localqb.caJ.path = (str + i.LA(paramString));
    com.tencent.mm.sdk.b.a.sFg.m(localqb);
  }
  
  public final void aS(String paramString, boolean paramBoolean) {}
  
  public final void aT(String paramString, boolean paramBoolean) {}
  
  public final void bxb() {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/sns/e/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */