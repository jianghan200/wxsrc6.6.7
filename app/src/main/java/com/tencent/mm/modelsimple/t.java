package com.tencent.mm.modelsimple;

import android.content.Context;
import com.tencent.mm.R.l;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.ak.g;
import com.tencent.mm.g.a.od;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.model.au;
import com.tencent.mm.modelvoice.m;
import com.tencent.mm.modelvoice.p;
import com.tencent.mm.modelvoice.u;
import com.tencent.mm.network.k;
import com.tencent.mm.plugin.messenger.foundation.a.a.f;
import com.tencent.mm.pluginsdk.model.app.ao;
import com.tencent.mm.protocal.c.bhu;
import com.tencent.mm.protocal.c.bhv;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.an;
import com.tencent.mm.storage.bd;
import com.tencent.mm.y.h;

public final class t
  extends l
  implements k
{
  private static final ah egm = new ah("deleteRevokeMessageThread");
  private final long bJC;
  private final com.tencent.mm.ab.b dZf;
  private com.tencent.mm.ab.e diJ;
  private final String egn;
  
  public t(bd parambd, String paramString)
  {
    au.HU();
    Object localObject = com.tencent.mm.model.c.DT().get(290818, Integer.valueOf(0));
    if (localObject != null) {}
    for (int i = bi.getInt(localObject.toString(), 0);; i = 0)
    {
      this.bJC = parambd.field_msgId;
      this.egn = paramString;
      localObject = null;
      int k = 0;
      int m = (int)(parambd.field_createTime / 1000L);
      long l = parambd.field_msgSvrId;
      String str1 = com.tencent.mm.model.q.GF();
      String str2 = parambd.field_talker;
      int j = k;
      paramString = (String)localObject;
      if (parambd.cGF != 1) {}
      switch (parambd.getType())
      {
      default: 
        paramString = (String)localObject;
        j = k;
      case 1: 
      case 42: 
      case 48: 
      case 66: 
      case 34: 
      case 43: 
      case 62: 
      case 3: 
      case 47: 
        for (;;)
        {
          parambd = new b.a();
          parambd.dIG = new bhu();
          parambd.dIH = new bhv();
          parambd.uri = "/cgi-bin/micromsg-bin/revokemsg";
          parambd.dIF = 594;
          parambd.dII = 0;
          parambd.dIJ = 0;
          this.dZf = parambd.KT();
          parambd = (bhu)this.dZf.dID.dIL;
          parambd.rdo = paramString;
          parambd.siB = j;
          parambd.siC = 0;
          parambd.siE = l;
          parambd.lOH = m;
          parambd.jTv = str1;
          parambd.jTu = str2;
          parambd.siD = i;
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneRevokeMsg", "[oneliang][NetSceneRevokeMsg]:clientMsgId:%s,newClientMsgId:%d,svrMsgId:%d,createTime:%d,fromUserName:%s,toUserName:%s,indexOfRequest:%d", new Object[] { parambd.rdo, Integer.valueOf(parambd.siB), Integer.valueOf(parambd.siC), Integer.valueOf(parambd.lOH), parambd.jTv, parambd.jTu, Integer.valueOf(parambd.siD) });
          return;
          j = com.tencent.mm.model.o.l(com.tencent.mm.model.q.GF(), parambd.field_createTime).hashCode();
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneRevokeMsg", "[oneliang][doSendRevokeMsg] type:text,newClientMsgId:%d", new Object[] { Integer.valueOf(j) });
          paramString = (String)localObject;
          continue;
          parambd = m.TI().ow(parambd.field_imgPath);
          j = k;
          paramString = (String)localObject;
          if (parambd != null)
          {
            paramString = parambd.clientId;
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneRevokeMsg", "[oneliang][doSendRevokeMsg] type:voice,clientMsgId:%s", new Object[] { paramString });
            j = k;
            continue;
            paramString = parambd.field_imgPath;
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneRevokeMsg", "[oneliang][doSendRevokeMsg] type:video,clientMsgId:%s", new Object[] { paramString });
            j = k;
            continue;
            localObject = com.tencent.mm.ak.o.Pf().br(parambd.field_msgId);
            paramString = parambd.cGI;
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneRevokeMsg", "[oneliang][doSendRevokeMsg] type:img,talker:%s,hdId:%s,localId:%s,clientMsgId:%s", new Object[] { parambd.field_talker, Integer.valueOf(((com.tencent.mm.ak.e)localObject).dTU), Long.valueOf(((com.tencent.mm.ak.e)localObject).dTK), paramString });
            j = k;
            continue;
            paramString = String.valueOf(an.YJ(parambd.field_content).time);
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneRevokeMsg", "[oneliang][doSendRevokeMsg] type:emoji,clientMsgId:%s", new Object[] { paramString });
            j = k;
          }
        }
      }
      paramString = ao.asF().fH(parambd.field_msgId);
      if (paramString != null) {}
      for (parambd = paramString.field_clientAppDataId;; parambd = parambd.field_talker + parambd.field_msgId + "T" + parambd.field_createTime)
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneRevokeMsg", "[oneliang][doSendRevokeMsg] type:app msg/emoji/img,clientMsgId:%s", new Object[] { parambd });
        j = k;
        paramString = parambd;
        break;
      }
    }
  }
  
  public static void a(String paramString1, String paramString2, bd parambd, String paramString3)
  {
    if ((parambd.getType() == 1) || (parambd.getType() == 16777265))
    {
      parambd.setType(10002);
      parambd.setContent(String.format("<sysmsg type=\"invokeMessage\"><invokeMessage><text><![CDATA[%s]]></text><timestamp><![CDATA[%s]]></timestamp><link><text><![CDATA[%s]]></text></link><preContent><![CDATA[%s]]></preContent></invokeMessage></sysmsg>", new Object[] { paramString1, Long.valueOf(System.currentTimeMillis()), paramString2, paramString3 }));
      return;
    }
    parambd.setType(10000);
    parambd.setContent(paramString1);
  }
  
  public final bhv Rs()
  {
    return (bhv)this.dZf.dIE.dIL;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.dZf, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      au.HU();
      paramq = com.tencent.mm.model.c.FT().dW(this.bJC);
      if (paramq.field_msgId != this.bJC) {
        break label360;
      }
      paramArrayOfByte = Rs();
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneRevokeMsg", "[oneliang][doSceneEnd.revokeMsg] msgId:%s,msgSvrId:%s,responseSysWording:%s", new Object[] { Long.valueOf(paramq.field_msgId), Long.valueOf(paramq.field_msgSvrId), paramArrayOfByte.siG });
      int i = paramq.getType();
      a(this.egn, "  " + ad.getContext().getString(R.l.invoke_message_reedit_tip), paramq, paramq.field_content);
      paramq.eX(0);
      paramq.eC(paramq.cqa | 0x4);
      paramArrayOfByte = new od();
      paramArrayOfByte.bZc.bJC = this.bJC;
      a.sFg.m(paramArrayOfByte);
      au.HU();
      com.tencent.mm.model.c.FT().a(paramq.field_msgId, paramq);
      paramInt1 = 0;
      au.HU();
      paramArrayOfByte = com.tencent.mm.model.c.DT().get(290818, Integer.valueOf(0));
      if (paramArrayOfByte != null) {
        paramInt1 = bi.getInt(paramArrayOfByte.toString(), 0);
      }
      au.HU();
      com.tencent.mm.model.c.DT().set(290818, Integer.valueOf(paramInt1 + 1));
      paramq.setType(i);
      if (!paramq.aQm()) {
        break label333;
      }
      paramArrayOfByte = com.tencent.mm.modelstat.b.ehL;
      paramInt1 = h.g(paramq);
      if (paramArrayOfByte.RS()) {
        paramArrayOfByte.a(paramq, com.tencent.mm.modelstat.b.b.ehY, paramInt1);
      }
      egm.h(new t.1(this, paramq), 300000L);
    }
    for (;;)
    {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
      label333:
      paramArrayOfByte = com.tencent.mm.modelstat.b.ehL;
      if (!paramArrayOfByte.RS()) {
        break;
      }
      paramArrayOfByte.a(paramq, com.tencent.mm.modelstat.b.b.ehY, 0);
      break;
      label360:
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneRevokeMsg", "cannot find the msg:%d after revoke.", new Object[] { Long.valueOf(this.bJC) });
    }
  }
  
  public final int getType()
  {
    return 594;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/modelsimple/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */