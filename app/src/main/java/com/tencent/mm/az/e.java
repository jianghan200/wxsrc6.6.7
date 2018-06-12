package com.tencent.mm.az;

import com.tencent.mm.aa.j;
import com.tencent.mm.aa.k;
import com.tencent.mm.ab.d.a;
import com.tencent.mm.ab.d.b;
import com.tencent.mm.g.a.it;
import com.tencent.mm.g.a.mg;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.model.am.a;
import com.tencent.mm.model.am.b;
import com.tencent.mm.model.s;
import com.tencent.mm.protocal.c.by;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.at;
import com.tencent.mm.storage.ay;
import com.tencent.mm.storage.bd.d;

public final class e
  implements com.tencent.mm.ab.d
{
  public final d.b b(d.a parama)
  {
    int i = 0;
    Object localObject2 = parama.dIN;
    String str = com.tencent.mm.platformtools.ab.a(((by)localObject2).rcj);
    if ((!"fmessage".equals(str)) && (((by)localObject2).jQd != 37)) {
      return null;
    }
    Object localObject1 = com.tencent.mm.platformtools.ab.a(((by)localObject2).rcl);
    parama = bd.d.YY((String)localObject1);
    Object localObject3 = com.tencent.mm.model.q.GF();
    if ((parama.otZ != null) && (parama.otZ.equals(localObject3)))
    {
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.VerifyMessageExtension", "onPreAddMessage, verify scene:%d, content:%s", new Object[] { Integer.valueOf(parama.scene), localObject1 });
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.VerifyMessageExtension", "fromUserName is self, simply drop this msg");
      return null;
    }
    localObject3 = new j();
    ((j)localObject3).username = parama.otZ;
    ((j)localObject3).csA = 3;
    ((j)localObject3).by(true);
    ((j)localObject3).bWA = -1;
    ((j)localObject3).dHR = parama.tbG;
    ((j)localObject3).dHQ = parama.tbH;
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.VerifyMessageExtension", "dkhurl user:[%s] big:[%s] sm:[%s]", new Object[] { parama.otZ, ((j)localObject3).Kx(), ((j)localObject3).Ky() });
    com.tencent.mm.aa.q.KH().a((j)localObject3);
    if (!bi.oW(parama.otZ))
    {
      if (parama.scene == 18)
      {
        d.a((by)localObject2, parama);
        com.tencent.mm.model.au.HU();
        com.tencent.mm.model.c.DT().set(73729, Integer.valueOf(1));
        com.tencent.mm.model.au.HU();
        localObject1 = com.tencent.mm.model.c.FR().Yg(parama.tbT);
        if ((localObject1 == null) || ((int)((com.tencent.mm.l.a)localObject1).dhP <= 0))
        {
          am.a.dBr.a(parama.tbT, null, new e.1(this, parama));
          return null;
        }
        localObject2 = ((ai)localObject1).field_username;
        if ((localObject2 != null) && (!s.hd((String)localObject2)))
        {
          ((com.tencent.mm.storage.ab)localObject1).setUsername(parama.tbT);
          ((com.tencent.mm.storage.ab)localObject1).dD(null);
          com.tencent.mm.model.au.HU();
          com.tencent.mm.model.c.FR().a((String)localObject2, (com.tencent.mm.storage.ab)localObject1);
        }
        localObject1 = new it();
        ((it)localObject1).bSl.bSm = parama.tbT;
        ((it)localObject1).bSl.type = 1;
        com.tencent.mm.sdk.b.a.sFg.m((b)localObject1);
        return null;
      }
      if (com.tencent.mm.model.bd.hd(parama.scene))
      {
        d.b((by)localObject2, parama);
        com.tencent.mm.model.au.HU();
        com.tencent.mm.model.c.DT().set(73730, Integer.valueOf(1));
        return null;
      }
      if (parama.scene == 48)
      {
        localObject3 = new mg();
        ((mg)localObject3).bWU.bWW = ((String)localObject1);
        ((mg)localObject3).bWU.talker = parama.otZ;
        com.tencent.mm.sdk.b.a.sFg.m((b)localObject3);
      }
    }
    localObject1 = new at();
    ((at)localObject1).field_createTime = c.o(str, ((by)localObject2).lOH);
    if (((by)localObject2).hcd == 4) {
      i = 2;
    }
    ((at)localObject1).field_isSend = (i + 0);
    ((at)localObject1).field_msgContent = com.tencent.mm.platformtools.ab.a(((by)localObject2).rcl);
    ((at)localObject1).field_svrId = ((by)localObject2).rcq;
    ((at)localObject1).field_talker = parama.otZ;
    com.tencent.mm.model.au.HU();
    localObject2 = com.tencent.mm.model.c.FR().Yg(parama.chatroomName);
    if ((localObject2 != null) && ((int)((com.tencent.mm.l.a)localObject2).dhP != -1)) {
      ((at)localObject1).field_chatroomName = parama.chatroomName;
    }
    switch (parama.bOh)
    {
    case 3: 
    case 4: 
    default: 
      ((at)localObject1).field_type = 1;
    }
    while (!bi.oW(parama.tbT))
    {
      ((at)localObject1).field_encryptTalker = parama.tbT;
      if (d.SF().Gx(parama.tbT) != null)
      {
        parama = d.SE();
        localObject2 = ((at)localObject1).field_encryptTalker;
        str = ((at)localObject1).field_talker;
        localObject2 = "update fmessage_msginfo set talker = '" + bi.oU(str) + "'  where talker = '" + bi.oU((String)localObject2) + "'";
        parama.diF.fV("fmessage_msginfo", (String)localObject2);
        d.SF().m(0L, ((at)localObject1).field_encryptTalker);
      }
      d.SE().b((at)localObject1);
      return null;
      ((at)localObject1).field_type = 1;
      continue;
      ((at)localObject1).field_type = 2;
      continue;
      ((at)localObject1).field_type = 3;
    }
    com.tencent.mm.sdk.platformtools.x.e("MicroMsg.VerifyMessageExtension", "it should not go in here");
    parama = d.SF().YL(((at)localObject1).field_talker);
    if (parama != null)
    {
      ((at)localObject1).field_encryptTalker = parama.field_talker;
      ((at)localObject1).field_talker = parama.field_talker;
    }
    d.SE().b((at)localObject1);
    return null;
  }
  
  public final void h(com.tencent.mm.storage.bd parambd) {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/az/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */