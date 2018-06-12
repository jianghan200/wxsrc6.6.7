package com.tencent.mm.plugin.talkroom.model;

import com.tencent.mm.ab.d.c;
import com.tencent.mm.bt.h.d;
import com.tencent.mm.model.ar;
import com.tencent.mm.model.au;
import com.tencent.mm.model.bs;
import com.tencent.mm.network.n;
import java.util.HashMap;

public final class b
  implements ar
{
  private n mHI = new b.1(this);
  g ovX;
  private d ovY = new d();
  public c ovZ = new c();
  private e owa;
  f owb;
  
  public static b bGS()
  {
    au.HN();
    b localb2 = (b)bs.iK("plugin.talkroom");
    b localb1 = localb2;
    if (localb2 == null)
    {
      localb1 = new b();
      au.HN().a("plugin.talkroom", localb1);
    }
    return localb1;
  }
  
  public static g bGT()
  {
    if (bGS().ovX == null) {
      bGS().ovX = new g();
    }
    return bGS().ovX;
  }
  
  public static e bGU()
  {
    if (bGS().owa == null) {
      bGS().owa = new e();
    }
    return bGS().owa;
  }
  
  public static String bGV()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    au.HU();
    return com.tencent.mm.model.c.Gp() + "talkroom/";
  }
  
  public static f bGW()
  {
    if (bGS().owb == null) {
      bGS().owb = new f();
    }
    return bGS().owb;
  }
  
  public final HashMap<Integer, h.d> Ci()
  {
    return null;
  }
  
  public final void bn(boolean paramBoolean)
  {
    d.c.a(Integer.valueOf(56), this.ovY);
    au.a(this.mHI);
    com.tencent.mm.ax.g.elf = bGU();
    com.tencent.mm.ax.g.elg = bGT();
  }
  
  public final void bo(boolean paramBoolean) {}
  
  public final void gi(int paramInt) {}
  
  public final void onAccountRelease()
  {
    d.c.b(Integer.valueOf(56), this.ovY);
    au.b(this.mHI);
    com.tencent.mm.ax.g.elf = null;
    com.tencent.mm.ax.g.elg = null;
    if (this.ovX != null)
    {
      this.ovX.aZL();
      this.ovX = null;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/talkroom/model/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */