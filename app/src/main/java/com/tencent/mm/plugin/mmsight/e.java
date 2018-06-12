package com.tencent.mm.plugin.mmsight;

import com.tencent.mm.bt.h.d;
import com.tencent.mm.model.ar;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.modelvideo.x.a;
import com.tencent.mm.plugin.mmsight.model.a.j;
import com.tencent.mm.plugin.mmsight.model.m;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;
import java.util.List;

public class e
  implements ar
{
  private m lew = new m();
  private c lex = new e.1(this);
  private c ley = new e.2(this);
  
  public final HashMap<Integer, h.d> Ci()
  {
    return null;
  }
  
  public final void bn(boolean paramBoolean)
  {
    x.a locala = o.Tf();
    m localm = this.lew;
    x.l("MicroMsg.VideoService", "addVideoMsgSendCallback %s", new Object[] { localm });
    if ((localm != null) && (locala.eou != null) && (!locala.eou.contains(localm))) {
      locala.eou.add(localm);
    }
    a.sFg.a(this.ley);
    a.sFg.b(this.lex);
  }
  
  public final void bo(boolean paramBoolean) {}
  
  public final void gi(int paramInt) {}
  
  public final void onAccountRelease()
  {
    x.a locala = o.Tf();
    m localm = this.lew;
    if ((localm != null) && (locala.eou != null)) {
      locala.eou.remove(localm);
    }
    a.sFg.c(this.ley);
    j.lin.Fm();
    a.sFg.c(this.lex);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/mmsight/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */