package com.tencent.mm.plugin.qqmail.b;

import com.tencent.mm.a.e;
import com.tencent.mm.bt.h.d;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.ar;
import com.tencent.mm.model.au;
import com.tencent.mm.model.bd;
import com.tencent.mm.model.bs;
import com.tencent.mm.model.c;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.storage.az;
import java.io.File;
import java.util.HashMap;

public final class w
  implements ar
{
  private p mdW;
  private b mdX = new b();
  private v mdu;
  
  private static w bov()
  {
    au.HN();
    w localw2 = (w)bs.iK("plugin.qqmail");
    w localw1 = localw2;
    if (localw2 == null)
    {
      localw1 = new w();
      au.HN().a("plugin.qqmail", localw1);
    }
    return localw1;
  }
  
  public static p bow()
  {
    g.Eg().Ds();
    if (bov().mdW == null) {
      bov().mdW = new p(d.qVN, d.DEVICE_TYPE);
    }
    return bov().mdW;
  }
  
  public static v box()
  {
    g.Eg().Ds();
    if (bov().mdu == null) {
      bov().mdu = new v();
    }
    return bov().mdu;
  }
  
  public static void boy()
  {
    bd.iE("qqmail");
    au.HU();
    c.FW().Yp("qqmail");
    p localp = bow();
    au.HU();
    e.k(new File(c.Gh()));
    localp.reset();
  }
  
  public final HashMap<Integer, h.d> Ci()
  {
    return null;
  }
  
  public final void bn(boolean paramBoolean)
  {
    com.tencent.mm.sdk.b.a.sFg.b(this.mdX);
    au.Em().H(new w.1(this));
  }
  
  public final void bo(boolean paramBoolean) {}
  
  public final void gi(int paramInt)
  {
    if ((paramInt & 0x1) != 0) {
      boy();
    }
  }
  
  public final void onAccountRelease()
  {
    p localp = bov().mdW;
    if (localp != null) {
      localp.reset();
    }
    com.tencent.mm.sdk.b.a.sFg.c(this.mdX);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/qqmail/b/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */