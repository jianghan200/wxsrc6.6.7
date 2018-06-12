package com.tencent.mm.plugin.sns;

import android.util.Base64;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.u.b;
import com.tencent.mm.modelsns.d;
import com.tencent.mm.modelstat.p;
import com.tencent.mm.modelstat.p.a;
import com.tencent.mm.plugin.sns.b.c;
import com.tencent.mm.plugin.sns.b.i;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.protocal.c.bqw;
import com.tencent.mm.protocal.c.bqx;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.bd;
import com.tencent.mm.y.g.a;

public final class l
  implements i
{
  public final String C(bd parambd)
  {
    return p.C(parambd);
  }
  
  public final void Z(bd parambd)
  {
    String str = p.C(parambd);
    Object localObject;
    bqw localbqw;
    if (str != null)
    {
      localObject = Base64.decode(str, 0);
      localbqw = new bqw();
    }
    try
    {
      localbqw.aG((byte[])localObject);
      localObject = localbqw.soW;
      if (localObject == null) {
        return;
      }
    }
    catch (Exception parambd)
    {
      x.printErrStackTrace("MicroMsg.SnsStatExtUtil", parambd, "", new Object[0]);
      return;
    }
    if (parambd.field_talker.endsWith("@chatroom")) {}
    for (parambd = p.a.ekU.value;; parambd = p.a.ekT.value)
    {
      x.i("MicroMsg.SnsStatExtUtil", "report adPageExposure(13235): scene(%s), statExtStr:%s(id=%s, uxinfo=%s)", new Object[] { parambd, str, localbqw.soW.soZ, localbqw.soW.spa });
      ((c)g.l(c.class)).h(13235, new Object[] { parambd, localbqw.soW.soZ, localbqw.soW.spa });
      return;
    }
  }
  
  public final String a(String paramString, PString paramPString)
  {
    return p.a(paramString, paramPString);
  }
  
  public final void a(String paramString, u.b paramb, bd parambd)
  {
    if (parambd.aQm())
    {
      parambd = g.a.gp(parambd.field_content);
      if ((parambd != null) && (!bi.oW(parambd.bZN))) {
        paramb.p(paramString, parambd.bZN);
      }
    }
  }
  
  public final void b(String paramString, d paramd)
  {
    p.b(paramString, paramd);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */