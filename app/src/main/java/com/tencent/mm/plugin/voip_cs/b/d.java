package com.tencent.mm.plugin.voip_cs.b;

import android.os.Looper;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.model.au;
import com.tencent.mm.plugin.brandservice.b.j;
import com.tencent.mm.plugin.voip.model.v2protocal;
import com.tencent.mm.plugin.voip.video.i;
import com.tencent.mm.plugin.voip_cs.b.c.f;
import com.tencent.mm.protocal.c.bhz;
import com.tencent.mm.protocal.c.bju;
import com.tencent.mm.protocal.c.byx;
import com.tencent.mm.protocal.c.byy;
import com.tencent.mm.protocal.c.bzc;
import com.tencent.mm.protocal.c.bze;
import com.tencent.mm.protocal.c.bzi;
import com.tencent.mm.protocal.c.bzl;
import com.tencent.mm.protocal.c.bzo;
import com.tencent.mm.protocal.c.bzq;
import com.tencent.mm.protocal.c.cah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class d
  implements com.tencent.mm.ab.e
{
  public int kpy = 0;
  public int oKh = 0;
  public int oWI = 0;
  public a oXl;
  public int oXm = 0;
  public int oXn = 0;
  public int oXo = 0;
  public byte[] oXp = null;
  public int oXq = 0;
  public int oXr = 0;
  public int oXs = 0;
  public String oXt = "";
  public int oXu = 0;
  public int oXv = 999;
  public al oXw = new al(Looper.getMainLooper(), new d.1(this), true);
  public al oXx = new al(Looper.getMainLooper(), new d.2(this), true);
  
  private static void b(int paramInt1, int paramInt2, l paraml)
  {
    x.i("MicroMsg.voipcs.VoipCSService", "Redirect response:" + paramInt1 + " errCode:" + paramInt2);
    if (paramInt2 != 0)
    {
      x.i("MicroMsg.voipcs.VoipCSService", " redirect response with error code:" + paramInt2);
      return;
    }
    paraml = (bzl)((com.tencent.mm.plugin.voip_cs.b.c.d)paraml).diG.dIE.dIL;
    x.i("MicroMsg.voipcs.VoipCSService", "roomid " + paraml.svs + " key " + paraml.rxH + "relay addr cnt " + paraml.rfi.size());
    paraml = paraml.rfi;
    byy localbyy = new byy();
    Iterator localIterator = paraml.iterator();
    while (localIterator.hasNext())
    {
      bzc localbzc = (bzc)localIterator.next();
      byx localbyx = new byx();
      b.bMv();
      localbyx.spR = com.tencent.mm.plugin.voip_cs.b.b.a.OP(localbzc.rTO);
      localbyx.sed = localbzc.sed;
      localbyy.suX.add(localbyx);
    }
    localbyy.suW = paraml.size();
    b.bMv().kqx.a(localbyy, localbyy, null, 0, 0);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    x.i("MicroMsg.voipcs.VoipCSService", "onSceneEnd :netId:%s,errType:%s,errCode:%s,errMsg:%s", new Object[] { Integer.valueOf(paraml.getType()), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    Object localObject1;
    if ((paramInt1 == 0) && (paramInt2 == 0)) {
      if (paraml.getType() == 823)
      {
        paraml = (bzi)((com.tencent.mm.plugin.voip_cs.b.c.c)paraml).diG.dIE.dIL;
        long l1 = paraml.svs;
        long l2 = paraml.rxH;
        Object localObject2 = paraml.rfi;
        localObject1 = paraml.svB;
        this.kpy = paraml.svx;
        this.oXv = paraml.svA;
        x.i("MicroMsg.voipcs.VoipCSService", "tcpStartCnt : " + this.oXv);
        b.bMv().kqx.oOs = paraml.kpF;
        this.oXq = paraml.kpz;
        b.bMv().kqx.oPj = paraml.kpK;
        b.bMv().kqx.oPk = paraml.seu.toByteArray();
        b.bMv().kqx.oOr = paraml.kpG;
        paramString = new byy();
        Iterator localIterator = ((List)localObject2).iterator();
        bzc localbzc;
        byx localbyx;
        while (localIterator.hasNext())
        {
          localbzc = (bzc)localIterator.next();
          localbyx = new byx();
          b.bMv();
          localbyx.spR = com.tencent.mm.plugin.voip_cs.b.b.a.OP(localbzc.rTO);
          localbyx.sed = localbzc.sed;
          paramString.suX.add(localbyx);
        }
        paramString.suW = ((List)localObject2).size();
        localObject2 = new byy();
        localIterator = ((List)localObject1).iterator();
        while (localIterator.hasNext())
        {
          localbzc = (bzc)localIterator.next();
          localbyx = new byx();
          b.bMv();
          localbyx.spR = com.tencent.mm.plugin.voip_cs.b.b.a.OP(localbzc.rTO);
          localbyx.sed = localbzc.sed;
          ((byy)localObject2).suX.add(localbyx);
        }
        ((byy)localObject2).suW = ((List)localObject1).size();
        b.bMv().kqx.oOl = l1;
        b.bMv().kqx.kpp = l2;
        x.i("MicroMsg.voipcs.VoipCSService", "recv invite resp csRoomId : " + l1 + ",roomKey:" + l2);
        b.bMv().kqx.oPt = paraml.svy;
        b.bMv().kqx.oPu = paraml.svz;
        paraml = new cah();
        paraml.swD = 0;
        paraml.swE = 0;
        paraml.swF = 0;
        paraml.userName = "";
        paraml.eSH = "";
        if (b.bMv().kqx.a(paramString, paramString, paramString, paraml) != 0) {
          x.i("MicroMsg.voipcs.VoipCSService", "setIp fail!");
        }
        paramString = b.bMx();
        paraml = this.oXt;
        x.d("MicroMsg.VoipCSReportHelper", "setVoipCSBaseInfo");
        paramString.oWG = l1;
        paramString.kpp = l2;
        paramString.oWH = paraml;
        if (this.oXw.ciq())
        {
          if (this.kpy > 0)
          {
            paramString = this.oXw;
            l1 = this.kpy * 1000;
            paramString.J(l1, l1);
          }
        }
        else
        {
          paramString = b.bMx();
          x.d("MicroMsg.VoipCSReportHelper", "markRecvInvite");
          if (paramString.oXf != 0) {
            paramString.oXg = ((int)(System.currentTimeMillis() / 1000L));
          }
        }
      }
    }
    do
    {
      do
      {
        do
        {
          return;
          this.oXw.J(4000L, 4000L);
          break;
          if (paraml.getType() == 818)
          {
            paramString = (bzq)((f)paraml).diG.dIE.dIL;
            x.i("MicroMsg.voipcs.VoipCSService", "sync status = " + paramString.svE + ",notifySeq = " + paramString.svC);
            a(paramString);
            return;
          }
          if (paraml.getType() == 880)
          {
            paramString = (bze)((com.tencent.mm.plugin.voip_cs.b.c.a)paraml).diG.dIE.dIL;
            if ((b.bMv().kqx.oOl == paramString.svs) && (b.bMv().kqx.kpp == paramString.rxH)) {
              x.i("MicroMsg.voipcs.VoipCSService", "hangup success!");
            }
            au.DF().b(880, this);
            b.bMx().za(com.tencent.mm.plugin.voip_cs.b.a.a.bMD().oNt.bMk());
            return;
          }
          if (paraml.getType() == 455)
          {
            localObject1 = (j)paraml;
            paraml = "";
            paramString = "";
            if ((((j)localObject1).hnV != null) && (((j)localObject1).hnV.size() > 0))
            {
              paramString = (bju)((j)localObject1).hnV.get(0);
              paraml = paramString.rqZ;
              paramString = paramString.rQz.siM;
            }
            for (;;)
            {
              this.oXl.eX(paraml, paramString);
              return;
              x.i("MicroMsg.voipcs.VoipCSService", "search Or Recommend items is null or empty !");
            }
          }
          if (paraml.getType() == 285)
          {
            b(paramInt1, paramInt2, paraml);
            return;
          }
        } while (paraml.getType() != 312);
        paramString = (bzo)((com.tencent.mm.plugin.voip_cs.b.c.e)paraml).diG.dIE.dIL;
      } while ((paramString.svs != b.bMv().kqx.oOl) || (paramString.rxH != b.bMv().kqx.kpp));
      x.i("MicroMsg.voipcs.VoipCSService", "report data success!");
      return;
      x.i("MicroMsg.voipcs.VoipCSService", "onSceneEnd  resp error!:netId:%s,errType:%s,errCode:%s,errMsg:%s", new Object[] { Integer.valueOf(paraml.getType()), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
      if ((paramInt1 != 0) && (paramInt1 != 4))
      {
        this.oXu = -1;
        this.oXl.onError(10);
        return;
      }
      if (paraml.getType() == 823)
      {
        if (paramInt2 == 406)
        {
          x.i("MicroMsg.voipcs.VoipCSService", "CS_INVITE_RESP_REPEAT_INVTIE 503..");
          return;
        }
        b.bMx().bjS = 1;
        this.oXu = 823;
        this.oXl.onError(paramInt2);
        return;
      }
    } while ((paraml.getType() == 880) || (paraml.getType() == 818) || (paraml.getType() != 455));
    this.oXl.eX("", "");
  }
  
  public final void a(bzq parambzq)
  {
    if ((parambzq.svC <= this.oXm) || (b.bMw().oXs == 3)) {}
    for (;;)
    {
      return;
      x.i("MicroMsg.voipcs.VoipCSService", "get callee sync resp,notifySeq:" + parambzq.svC + ",calleeMemberId:" + parambzq.svD + ",calleeStatus:" + parambzq.svE + ",calleeSubStatus:" + parambzq.svF + ",recv roomId:" + parambzq.svs + ",recv roomKey:" + parambzq.rxH);
      if ((b.bMv().kqx.oOl != 0L) && (b.bMv().kqx.oOl != parambzq.svs))
      {
        x.i("MicroMsg.voipcs.VoipCSService", "csRoomId:" + b.bMv().kqx.oOl + ",recv roomId:" + parambzq.svs + ",current and recv not equal!!");
        return;
      }
      this.oXm = parambzq.svC;
      this.oWI = parambzq.svD;
      this.oXn = parambzq.svE;
      this.oXo = parambzq.svF;
      b.bMx().oWI = this.oWI;
      if (this.oXn == 2)
      {
        x.i("MicroMsg.voipcs.VoipCSService", "callee accept!");
        this.oXw.SO();
        bMB();
        b.bMv().kqx.kpp = parambzq.rxH;
        x.i("MicroMsg.voipcs.VoipCSService", "csroomId:" + parambzq.svs + ",roomkey:" + parambzq.rxH);
        if (parambzq.svG != null)
        {
          parambzq = parambzq.svG.toByteArray();
          this.oXp = parambzq;
          if ((b.bMv().kqx.field_capInfo == null) || (this.oXp == null)) {
            continue;
          }
          parambzq = b.bMx();
          x.d("MicroMsg.VoipCSReportHelper", "markUserAccept");
          if (parambzq.oWV == 0L)
          {
            parambzq.oXh = ((int)(System.currentTimeMillis() / 1000L));
            parambzq.oWV = (parambzq.oXh - parambzq.oXf);
          }
          b.bMv().kqx.oOn = this.oXp;
          x.i("MicroMsg.voipcs.VoipCSService", "calleeCapDump is " + Arrays.toString(b.bMv().kqx.oOn));
          x.i("MicroMsg.voipcs.VoipCSService", "calleeCap length:" + this.oXp.length);
          if ((b.bMv().kqx.oOn != null) && (b.bMv().kqx.exchangeCabInfo(b.bMv().kqx.oOn, b.bMv().kqx.oOn.length) < 0)) {
            x.i("MicroMsg.voipcs.VoipCSService", "exchangeCabInfo fail!");
          }
          if (b.bMv().kqx.oOq != null) {
            break label758;
          }
        }
        label758:
        for (int i = 0;; i = b.bMv().kqx.oOq.length)
        {
          i = b.bMv().kqx.setConfigInfo(b.bMv().kqx.oOk, b.bMv().kqx.oOl, b.bMv().kqx.kpw, b.bMv().kqx.kpp, b.bMv().kqx.field_peerId, 1, b.bMv().kqx.oOr, b.bMv().kqx.oOs, b.bMv().kqx.oOp, i, b.bMv().kqx.oOq, this.oXv, 1, b.bMv().kqx.netType, b.bMv().kqx.oPj, b.bMv().kqx.oPk, 255, 0);
          if (i != 0) {
            x.e("MicroMsg.voipcs.VoipCSService", "setConfig fail, ret:%d", new Object[] { Integer.valueOf(i) });
          }
          i = b.bMv().kqx.connectToPeer();
          if (i != 0) {
            x.e("MicroMsg.voipcs.VoipCSService", "connectToPeer fail, ret:%d", new Object[] { Integer.valueOf(i) });
          }
          if (this.oXx.ciq()) {
            this.oXx.J(50000L, 50000L);
          }
          b.bMx().oWO = 1;
          return;
          parambzq = null;
          break;
        }
      }
      else if ((this.oXn != 0) && (this.oXn != 1) && (this.oXn == 3))
      {
        x.i("MicroMsg.voipcs.VoipCSService", "callee hangup!");
        b.bMx().bjS = 5;
        b.bMx().bMy();
        b.bMx().oWS = 2;
        if (this.oXo == 1) {
          b.bMx().oWK = 12;
        }
        while (this.oXl != null)
        {
          this.oXl.yZ(1);
          return;
          if (this.oXo == 3) {
            b.bMx().oWK = 99;
          }
        }
      }
    }
  }
  
  public final void bMB()
  {
    au.DF().a(818, this);
    f localf = new f(b.bMv().kqx.oOl, b.bMv().kqx.kpp, this.oXm);
    au.DF().a(localf, 0);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/voip_cs/b/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */