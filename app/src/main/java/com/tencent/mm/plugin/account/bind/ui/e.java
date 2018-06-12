package com.tencent.mm.plugin.account.bind.ui;

import com.tencent.mm.g.a.ju;
import com.tencent.mm.g.a.ju.a;
import com.tencent.mm.sdk.b.c;

public final class e
  extends c<ju>
  implements f.a
{
  private ju eIT;
  
  public e()
  {
    this.sFo = ju.class.getName().hashCode();
  }
  
  public final void Xc()
  {
    if ((this.eIT != null) && (this.eIT.bTI.bTK != null))
    {
      this.eIT.bTJ.bJm = false;
      this.eIT.bTI.bTK.run();
      this.eIT = null;
    }
  }
  
  public final boolean by(int paramInt1, int paramInt2)
  {
    if (this.eIT == null) {
      return false;
    }
    if (this.eIT.bTI.bTK == null)
    {
      this.eIT = null;
      return false;
    }
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      this.eIT.bTJ.bJm = true;
      this.eIT.bTI.bTK.run();
      this.eIT = null;
      return true;
    }
    this.eIT.bTJ.bJm = false;
    this.eIT.bTI.bTK.run();
    this.eIT = null;
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/account/bind/ui/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */