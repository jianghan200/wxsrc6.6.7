package com.tencent.mm.plugin.card.ui.view;

import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.plugin.card.d.c;
import com.tencent.mm.protocal.c.kx;
import com.tencent.mm.protocal.c.lf;
import com.tencent.mm.protocal.c.pr;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class q
  extends g
{
  public String hGn = "";
  
  public final ab azN()
  {
    return new s(this, this.gKS);
  }
  
  public final ab azO()
  {
    return new p(this, this.gKS);
  }
  
  public final ab azP()
  {
    return new r(this, this.gKS);
  }
  
  public final String e(c paramc)
  {
    if (!bi.oW(this.htQ.awn().rnp)) {
      return this.htQ.awn().rnp;
    }
    if ((this.htQ.awg()) && (!bi.oW(this.hGn))) {
      return this.hGn;
    }
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
    Object localObject = this.htQ.awn().code;
    String str = paramb.awn().code;
    if ((!bi.oW((String)localObject)) && (!bi.oW(str)) && (!((String)localObject).equals(str)))
    {
      x.i("MicroMsg.CardCodeView", "isNeedUpdateViewAgain   code  is diffrent！");
      return true;
    }
    localObject = this.htQ.awm().rok;
    paramb = paramb.awm().rok;
    if (((localObject == null) && (paramb != null)) || ((localObject != null) && (paramb == null)))
    {
      x.i("MicroMsg.CardCodeView", "isNeedUpdateViewAgain pay_and_qrcode_field  is diffrent！");
      return true;
    }
    if ((localObject != null) && (paramb != null) && (((pr)localObject).title != null) && (paramb.title != null) && (!((pr)localObject).title.equals(paramb.title)))
    {
      x.i("MicroMsg.CardCodeView", "isNeedUpdateViewAgain pay_and_qrcode_field title is diffrent！");
      return true;
    }
    if ((localObject != null) && (paramb != null) && (((pr)localObject).huY != null) && (paramb.huY != null) && (!((pr)localObject).huY.equals(paramb.huY)))
    {
      x.i("MicroMsg.CardCodeView", "isNeedUpdateViewAgain pay_and_qrcode_field aux_title  is diffrent！");
      return true;
    }
    if ((this.htQ.awg()) && (!bi.oW(this.hGn)))
    {
      x.i("MicroMsg.CardCodeView", "dynamicCode updated！");
      return true;
    }
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/card/ui/view/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */