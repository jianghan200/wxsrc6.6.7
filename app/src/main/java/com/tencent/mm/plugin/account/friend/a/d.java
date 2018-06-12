package com.tencent.mm.plugin.account.friend.a;

import com.tencent.mm.aa.j;
import com.tencent.mm.aa.k;
import com.tencent.mm.aa.q;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.e;
import com.tencent.mm.openim.a.b;
import com.tencent.mm.platformtools.ab;
import com.tencent.mm.protocal.c.by;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.bd.a;

public final class d
  extends e
{
  protected final bd a(by paramby, String paramString1, String paramString2, String paramString3)
  {
    Object localObject = ab.a(paramby.rcl);
    if ((localObject == null) || (((String)localObject).length() <= 0))
    {
      x.e("MicroMsg.CardMsgExtension", "possible friend msg : content is null");
      return null;
    }
    localObject = bd.a.YV((String)localObject);
    if (paramby.jQd == 66) {
      ((b)g.l(b.class)).oC(((bd.a)localObject).tbK);
    }
    if (bi.oV(((bd.a)localObject).otZ).length() > 0)
    {
      j localj = new j();
      localj.username = ((bd.a)localObject).otZ;
      localj.csA = 3;
      localj.by(true);
      localj.dHR = ((bd.a)localObject).tbG;
      localj.dHQ = ((bd.a)localObject).tbH;
      localj.bWA = -1;
      x.d("MicroMsg.CardMsgExtension", "dkhurl user:[%s] big:[%s] sm:[%s]", new Object[] { ((bd.a)localObject).otZ, localj.Kx(), localj.Ky() });
      q.KH().a(localj);
    }
    return super.a(paramby, paramString1, paramString2, paramString3);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/account/friend/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */