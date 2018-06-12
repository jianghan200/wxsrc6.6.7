package com.tencent.mm.plugin.card.ui.a;

import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.plugin.card.d.l;
import com.tencent.mm.plugin.card.ui.e.a;
import com.tencent.mm.protocal.c.lf;
import com.tencent.mm.ui.MMActivity;

public final class e
  extends a
{
  public e(MMActivity paramMMActivity)
  {
    super(paramMMActivity);
  }
  
  public final boolean azC()
  {
    return (this.htQ.awi()) && (super.azC()) && (!azw());
  }
  
  public final boolean azG()
  {
    return (this.htQ.avT()) && (this.htQ.awm().rnY != null) && (this.htQ.awi()) && (!this.hHc) && (!aze()) && (!azf());
  }
  
  public final boolean azh()
  {
    return (super.azh()) && (this.htQ.awi()) && (!this.hHc) && (!aze()) && (!azf());
  }
  
  public final boolean azp()
  {
    return (!this.htQ.avT()) || (l.ob(this.hCv.hop)) || (!this.htQ.awi()) || (this.hHc);
  }
  
  public final boolean azt()
  {
    return (this.htQ.avT()) && (!l.ob(this.hCv.hop)) && (this.htQ.awi()) && (!this.hHc);
  }
  
  public final boolean azu()
  {
    return this.hHc;
  }
  
  public final boolean azw()
  {
    return (this.htQ.awm() != null) && (this.htQ.awm().rom);
  }
  
  public final boolean azx()
  {
    return (super.azx()) || ((this.htQ.awi()) && (!this.hHc) && ((aze()) || (azf())));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/card/ui/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */