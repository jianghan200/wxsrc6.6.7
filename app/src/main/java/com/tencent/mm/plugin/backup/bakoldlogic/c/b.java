package com.tencent.mm.plugin.backup.bakoldlogic.c;

import com.tencent.mm.bk.a;
import com.tencent.mm.plugin.backup.h.ab;
import com.tencent.mm.plugin.backup.h.ac;
import com.tencent.mm.sdk.platformtools.x;

public final class b
  extends com.tencent.mm.plugin.backup.f.b
{
  private ab haq = new ab();
  private ac har = new ac();
  
  public b(int paramInt)
  {
    this.haq.hbr = paramInt;
  }
  
  public final a asj()
  {
    return this.har;
  }
  
  public final a ask()
  {
    return this.haq;
  }
  
  public final int getType()
  {
    return 3;
  }
  
  public final void mI(int paramInt)
  {
    if (this.har.hcd == 0)
    {
      g(0, 0, "ok");
      return;
    }
    x.e("MicroMsg.BakSceneCommand", " type:%d  errCode:%d", new Object[] { Integer.valueOf(this.haq.hbr), Integer.valueOf(this.har.hcd) });
    g(4, this.har.hcd, "fail");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/backup/bakoldlogic/c/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */