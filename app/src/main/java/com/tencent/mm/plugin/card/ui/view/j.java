package com.tencent.mm.plugin.card.ui.view;

import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.plugin.card.d.c;
import com.tencent.mm.protocal.c.kx;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class j
  extends g
{
  public final ab azN()
  {
    return new v(this, this.gKS);
  }
  
  public final ab azO()
  {
    return new f(this, this.gKS);
  }
  
  public final ab azP()
  {
    return new t(this, this.gKS);
  }
  
  public final String e(c paramc)
  {
    return this.htQ.awn().code;
  }
  
  public final boolean h(b paramb)
  {
    if (this.htQ == null)
    {
      x.i("MicroMsg.CardCodeView", "isNeedUpdateViewAgain mCardInfo is null！");
      return true;
    }
    if (paramb == null)
    {
      x.i("MicroMsg.CardCodeView", "isNeedUpdateViewAgain false  newCardInfo null！");
      return false;
    }
    String str = this.htQ.awn().code;
    paramb = paramb.awn().code;
    if ((!bi.oW(str)) && (!bi.oW(paramb)) && (!str.equals(paramb)))
    {
      x.i("MicroMsg.CardCodeView", "isNeedUpdateViewAgain   code  is diffrent！");
      return true;
    }
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/card/ui/view/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */