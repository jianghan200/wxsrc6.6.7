package com.tencent.mm.az;

import com.tencent.mm.aa.j;
import com.tencent.mm.aa.k;
import com.tencent.mm.aa.q;
import com.tencent.mm.g.a.fr;
import com.tencent.mm.g.a.fr.b;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.model.e;
import com.tencent.mm.protocal.c.by;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.at;
import com.tencent.mm.storage.ay;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.bd.a;

public final class b
  extends e
{
  protected final bd a(by paramby, String paramString1, String paramString2, String paramString3)
  {
    paramString2 = com.tencent.mm.platformtools.ab.a(paramby.rcl);
    if ((paramString2 == null) || (paramString2.length() <= 0))
    {
      x.e("MicroMsg.FMessageExtension", "possible friend msg : content is null");
      return null;
    }
    paramString2 = bd.a.YV(paramString2);
    if (((paramString2.tbE != null) || (paramString2.tbF != null)) && ((paramString2.scene == 10) || (paramString2.scene == 11)))
    {
      paramString3 = new fr();
      paramString3.bOi.bOk = paramString2.tbE;
      paramString3.bOi.bOl = paramString2.tbF;
      com.tencent.mm.sdk.b.a.sFg.m(paramString3);
      if (paramString3.bOj.bOm)
      {
        x.v("MicroMsg.FMessageExtension", "possible mobile friend is not in local address book");
        return null;
      }
    }
    if (paramString2.lWQ > 0L) {
      com.tencent.mm.aa.c.d(paramString2.lWQ, paramString2.tbD);
    }
    if (bi.oV(paramString2.otZ).length() > 0)
    {
      paramString3 = new j();
      paramString3.username = paramString2.otZ;
      paramString3.csA = 3;
      paramString3.by(true);
      paramString3.bWA = -1;
      paramString3.dHR = paramString2.tbG;
      paramString3.dHQ = paramString2.tbH;
      paramString3.bWA = -1;
      x.d("MicroMsg.FMessageExtension", "dkhurl user:[%s] big:[%s] sm:[%s]", new Object[] { paramString2.otZ, paramString3.Kx(), paramString3.Ky() });
      q.KH().a(paramString3);
    }
    paramString3 = new at();
    paramString3.field_createTime = c.o(paramString1, paramby.lOH);
    paramString3.field_isSend = 0;
    paramString3.field_msgContent = com.tencent.mm.platformtools.ab.a(paramby.rcl);
    paramString3.field_svrId = paramby.rcq;
    paramString3.field_talker = paramString2.otZ;
    paramString3.field_type = 0;
    paramby = d.SF().YL(paramString3.field_talker);
    if (paramby != null)
    {
      x.d("MicroMsg.FMessageExtension", "getByEncryptTalker success. encryptTalker = " + paramString3.field_talker + " , real talker = " + paramby.field_talker);
      paramString3.field_encryptTalker = paramString3.field_talker;
      paramString3.field_talker = paramby.field_talker;
    }
    com.tencent.mm.model.au.HU();
    paramby = com.tencent.mm.model.c.FR().Yg(paramString3.field_talker);
    if ((paramby != null) && (com.tencent.mm.l.a.gd(paramby.field_type)) && (paramby.dhP > 0L))
    {
      x.d("MicroMsg.FMessageExtension", "The biz contact whose talker is " + paramString3.field_talker + " has already been in user's contact list");
      return null;
    }
    d.SE().b(paramString3);
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/az/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */