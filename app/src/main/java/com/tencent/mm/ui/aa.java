package com.tencent.mm.ui;

import com.tencent.mm.ao.d.a;
import com.tencent.mm.g.a.os;
import com.tencent.mm.model.au;
import com.tencent.mm.plugin.ab.a;
import com.tencent.mm.s.a.a;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.bh;

public final class aa
  implements m.b
{
  MMFragmentActivity tiY;
  com.tencent.mm.sdk.b.c<os> tiy = new aa.6(this);
  com.tencent.mm.sdk.b.c tiz = new aa.5(this);
  m.b toA = new aa.2(this);
  com.tencent.mm.sdk.b.c toB = new aa.3(this);
  LauncherUI.c tov;
  c tow;
  boolean tox;
  Runnable toy = new aa.1(this);
  a.a toz = new aa.12(this);
  
  public final void DX(int paramInt)
  {
    if (this.tow != null)
    {
      this.tow.DD(paramInt);
      this.tov.cpB();
    }
  }
  
  public final void DY(int paramInt)
  {
    if (this.tow != null) {
      this.tow.setTo(paramInt);
    }
  }
  
  public final void a(int paramInt, m paramm, Object paramObject)
  {
    if ((paramObject == null) || (!(paramObject instanceof String))) {
      x.d("MicroMsg.LauncherUI.MainTabUnreadMgr", "onNotifyChange obj not String event:%d stg:%s obj:%s", new Object[] { Integer.valueOf(paramInt), paramm, paramObject });
    }
    do
    {
      do
      {
        return;
        au.HU();
      } while (paramm != com.tencent.mm.model.c.FW());
      x.d("MicroMsg.LauncherUI.MainTabUnreadMgr", "Launcherui onNotifyChange event type %d, username %s", new Object[] { Integer.valueOf(paramInt), paramObject });
    } while (!ab.gY((String)paramObject));
    cqD();
  }
  
  protected final void cqB()
  {
    com.tencent.mm.blink.b.xi().g(new aa.10(this));
  }
  
  protected final void cqC()
  {
    if (this.tox)
    {
      x.i("MicroMsg.LauncherUI.MainTabUnreadMgr", "start  setAppTagUnreadNow");
      cqF();
    }
  }
  
  protected final void cqD()
  {
    com.tencent.mm.blink.b.xi().g(new aa.9(this));
  }
  
  protected final void cqF()
  {
    com.tencent.mm.blink.b.xi().g(new aa.8(this));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/ui/aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */