package com.tencent.mm.plugin.nearby.a;

import com.tencent.mm.bt.h.d;
import com.tencent.mm.g.a.iv;
import com.tencent.mm.g.a.jz;
import com.tencent.mm.g.a.ka;
import com.tencent.mm.model.ar;
import com.tencent.mm.model.au;
import com.tencent.mm.pluginsdk.c.d;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.storage.ay;
import com.tencent.mm.storage.ay.a;
import java.util.HashMap;

public final class f
  implements ar
{
  private com.tencent.mm.sdk.b.c hKG = new f.5(this);
  private com.tencent.mm.sdk.b.c lBo = new f.1(this);
  private com.tencent.mm.sdk.b.c lBp = new com.tencent.mm.sdk.b.c() {};
  com.tencent.mm.pluginsdk.c.c<jz> lBq = new f.3(this);
  com.tencent.mm.pluginsdk.c.c<ka> lBr = new f.4(this);
  d lBs = new f.6(this);
  private ay.a lBt = new f.7(this);
  
  public final HashMap<Integer, h.d> Ci()
  {
    return null;
  }
  
  public final void bn(boolean paramBoolean)
  {
    au.HU();
    com.tencent.mm.model.c.FR().a(this.lBt);
    a.sFg.b(this.hKG);
    a.sFg.b(this.lBp);
    a.sFg.b(this.lBq);
    a.sFg.b(this.lBr);
    this.lBo.cht();
  }
  
  public final void bo(boolean paramBoolean) {}
  
  public final void gi(int paramInt) {}
  
  public final void onAccountRelease()
  {
    au.HU();
    com.tencent.mm.model.c.FR().b(this.lBt);
    a.sFg.c(this.lBp);
    a.sFg.c(this.hKG);
    a.sFg.c(this.lBq);
    a.sFg.c(this.lBr);
    this.lBo.dead();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/nearby/a/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */