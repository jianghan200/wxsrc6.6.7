package com.tencent.mm.plugin.k;

import com.tencent.mm.model.p;
import com.tencent.mm.modelcdntran.g;
import com.tencent.mm.protocal.c.awb;
import com.tencent.mm.protocal.i.f;
import com.tencent.mm.protocal.i.g;
import com.tencent.mm.protocal.u.b;
import com.tencent.mm.sdk.platformtools.ah;

public final class a
  extends p
  implements com.tencent.mm.plugin.auth.a.a
{
  private static a hJQ;
  
  private a()
  {
    super(g.class);
  }
  
  public static a aAf()
  {
    try
    {
      if (hJQ == null) {
        hJQ = new a();
      }
      a locala = hJQ;
      return locala;
    }
    finally {}
  }
  
  public final void a(i.f paramf, i.g paramg, boolean paramBoolean) {}
  
  public final void a(u.b paramb, String paramString1, int paramInt1, String paramString2, String paramString3, int paramInt2)
  {
    if (paramb.qWZ.iwE != 0) {
      ah.A(new a.1(paramb.qWZ.roC, paramb.qWZ.roD, paramb.qWZ.roE));
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/k/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */