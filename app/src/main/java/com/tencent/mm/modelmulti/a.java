package com.tencent.mm.modelmulti;

import com.tencent.mm.aa.k;
import com.tencent.mm.ac.d;
import com.tencent.mm.ac.d.b;
import com.tencent.mm.ac.z;
import com.tencent.mm.g.a.mc;
import com.tencent.mm.g.a.oe;
import com.tencent.mm.g.a.rk;
import com.tencent.mm.g.a.sd;
import com.tencent.mm.g.c.am;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.model.af;
import com.tencent.mm.model.am.a;
import com.tencent.mm.model.am.b;
import com.tencent.mm.model.au;
import com.tencent.mm.plugin.account.friend.a.p;
import com.tencent.mm.pluginsdk.model.app.l;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.protocal.c.anx;
import com.tencent.mm.protocal.c.arc;
import com.tencent.mm.protocal.c.atw;
import com.tencent.mm.protocal.c.atz;
import com.tencent.mm.protocal.c.aue;
import com.tencent.mm.protocal.c.auo;
import com.tencent.mm.protocal.c.aux;
import com.tencent.mm.protocal.c.avu;
import com.tencent.mm.protocal.c.ayz;
import com.tencent.mm.protocal.c.bcu;
import com.tencent.mm.protocal.c.bhy;
import com.tencent.mm.protocal.c.bqd;
import com.tencent.mm.protocal.c.bse;
import com.tencent.mm.protocal.c.bxb;
import com.tencent.mm.protocal.c.by;
import com.tencent.mm.protocal.c.bz;
import com.tencent.mm.protocal.c.pm;
import com.tencent.mm.protocal.c.qt;
import com.tencent.mm.protocal.c.xt;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.bl;
import com.tencent.mm.storage.RegionCodeDecoder;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.storage.az;
import com.tencent.mm.storage.az.b;
import com.tencent.mm.storage.u;
import com.tencent.mm.y.g.a;
import java.util.Map;
import junit.framework.Assert;

public final class a
  implements com.tencent.mm.plugin.messenger.foundation.a.q
{
  public static boolean a(com.tencent.mm.storage.ab paramab)
  {
    if ((paramab == null) || (bi.oW(paramab.field_username)))
    {
      if (paramab == null) {}
      for (paramab = "-1";; paramab = paramab.field_username)
      {
        com.tencent.mm.sdk.platformtools.x.w("MicroMsg.BigBallOfMudSyncExtension", "dealModContactExtInfo username:%s ", new Object[] { paramab });
        return false;
      }
    }
    au.HU();
    Object localObject = com.tencent.mm.model.c.FR().Yk(paramab.field_username);
    if (bi.bC((byte[])localObject))
    {
      paramab = paramab.field_username;
      if (localObject == null) {}
      for (int i = -1;; i = localObject.length)
      {
        com.tencent.mm.sdk.platformtools.x.w("MicroMsg.BigBallOfMudSyncExtension", "dealModContactExtInfo username:%s  buf:%d", new Object[] { paramab, Integer.valueOf(i) });
        return false;
      }
    }
    try
    {
      localObject = (aue)new aue().aG((byte[])localObject);
      au.HU();
      com.tencent.mm.model.c.FR().Yl(paramab.field_username);
      if (localObject == null)
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.BigBallOfMudSyncExtension", "dkinit dealModContactExtInfo failed parse buf failed.");
        return false;
      }
    }
    catch (Exception localException)
    {
      aue localaue;
      for (;;)
      {
        com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.BigBallOfMudSyncExtension", localException, "", new Object[0]);
        localaue = null;
      }
      return com.tencent.mm.plugin.bbom.c.a(paramab, localaue, false);
    }
  }
  
  public final void a(bz parambz, com.tencent.mm.plugin.messenger.foundation.a.s params)
  {
    String str = com.tencent.mm.platformtools.ab.a(parambz.rcs);
    long l = parambz.rcq;
    int i = parambz.lOH;
    int m = parambz.rcv;
    int n = parambz.rcr;
    int j = parambz.jQd;
    int k = parambz.rct;
    Object localObject2 = com.tencent.mm.platformtools.ab.a(parambz.rcu);
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BigBallOfMudSyncExtension", "summerbadcr processAddMsgDigestList chatRoomId[%s], newMsgId[%d], createTime[%d], isActed[%d], msgseq[%d], msgType[%d], unDeliverCount[%d], content[%s]", new Object[] { str, Long.valueOf(l), Integer.valueOf(i), Integer.valueOf(m), Integer.valueOf(n), Integer.valueOf(j), Integer.valueOf(k), bi.Xf((String)localObject2) });
    if (bi.oW(str)) {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.BigBallOfMudSyncExtension", "summerbadcr processAddMsgDigestList chatRoomId is null and ret");
    }
    if (k == 0)
    {
      com.tencent.mm.plugin.report.f.mDy.a(403L, 24L, 1L, false);
      if (bi.aG(com.tencent.mm.model.bd.iB((String)localObject2), "").equals(com.tencent.mm.model.q.GF()))
      {
        au.HU();
        localObject1 = com.tencent.mm.model.c.FT().I(str, l);
        if ((((cm)localObject1).field_msgId > 0L) && (((cm)localObject1).field_isSend == 1))
        {
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BigBallOfMudSyncExtension", "summerbadcr processAddMsgDigestList self send msg[%d] createtime[%d, %d] svrid[%d, %d] seq[%d, %d]", new Object[] { Long.valueOf(((cm)localObject1).field_msgId), Long.valueOf(((cm)localObject1).field_createTime), Integer.valueOf(i), Long.valueOf(((cm)localObject1).field_msgSvrId), Long.valueOf(l), Long.valueOf(((cm)localObject1).field_msgSeq), Integer.valueOf(n) });
          if (((cm)localObject1).field_msgSeq == 0L)
          {
            com.tencent.mm.plugin.report.f.mDy.a(403L, 25L, 1L, false);
            ((com.tencent.mm.storage.bd)localObject1).aA(n);
            au.HU();
            com.tencent.mm.model.c.FT().a(((cm)localObject1).field_msgId, (com.tencent.mm.storage.bd)localObject1);
          }
          return;
        }
      }
    }
    au.HU();
    Object localObject1 = com.tencent.mm.model.c.FW().Yq(str);
    label488:
    com.tencent.mm.storage.bd localbd;
    Object localObject3;
    label586:
    label593:
    Object localObject4;
    if (localObject1 == null)
    {
      com.tencent.mm.plugin.report.f.mDy.a(403L, 22L, 1L, false);
      localObject1 = new com.tencent.mm.storage.ai(str);
      ((com.tencent.mm.storage.ai)localObject1).as(i * 1000L);
      ((com.tencent.mm.storage.ai)localObject1).au(n);
      ((com.tencent.mm.storage.ai)localObject1).eV(k);
      ((com.tencent.mm.storage.ai)localObject1).fc(k);
      au.HU();
      l = com.tencent.mm.model.c.Gx().Gv(str);
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BigBallOfMudSyncExtension", "summerbadcr processAddMsgDigestList new conv lastDeleteSeq(FirstUnDeliverSeq)[%d], msgSeq[%d]", new Object[] { Long.valueOf(l), Integer.valueOf(n) });
      if (l > 0L)
      {
        ((com.tencent.mm.storage.ai)localObject1).av(l);
        i = 1;
        if (m > 0) {
          ((com.tencent.mm.storage.ai)localObject1).fa(((am)localObject1).field_atCount + m);
        }
        localbd = new com.tencent.mm.storage.bd();
        localbd.eX(0);
        localbd.ep(str);
        localbd.setType(j);
        localbd.setContent((String)localObject2);
        if (j != 49) {
          break label1595;
        }
        localObject3 = g.a.gp(com.tencent.mm.pluginsdk.model.app.j.fB(str, (String)localObject2));
        localbd.setType(l.d((g.a)localObject3));
        if (!localbd.cky()) {
          break label1592;
        }
        localObject2 = ((g.a)localObject3).content;
        localbd.setContent((String)localObject2);
        ((com.tencent.mm.storage.ai)localObject1).eX(0);
        ((com.tencent.mm.storage.ai)localObject1).setContent(localbd.field_content);
        ((com.tencent.mm.storage.ai)localObject1).ec(Integer.toString(localbd.getType()));
        au.HU();
        localObject2 = com.tencent.mm.model.c.FW().vu();
        if (localObject2 == null) {
          break label1931;
        }
        localObject3 = new PString();
        localObject4 = new PString();
        PInt localPInt = new PInt();
        ((az.b)localObject2).a(localbd, (PString)localObject3, (PString)localObject4, localPInt, false);
        ((com.tencent.mm.storage.ai)localObject1).ed(((PString)localObject3).value);
        ((com.tencent.mm.storage.ai)localObject1).ee(((PString)localObject4).value);
        ((com.tencent.mm.storage.ai)localObject1).eY(localPInt.value);
        if (localbd.getType() == 49)
        {
          localObject2 = (String)bl.z(((am)localObject1).field_content, "msg").get(".msg.appmsg.title");
          localObject3 = bi.oV(((am)localObject1).field_digest);
          if (!bi.oW((String)localObject2)) {
            break label1905;
          }
          localObject2 = "";
          label770:
          ((com.tencent.mm.storage.ai)localObject1).ed(((String)localObject3).concat((String)localObject2));
        }
        label782:
        if (i == 0) {
          break label1944;
        }
        au.HU();
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BigBallOfMudSyncExtension", "summerbadcr, processAddMsgDigestList insert username[%s], ret[%d], firstSeq[%d], lastSeq[%d], undeliver[%d]", new Object[] { str, Long.valueOf(com.tencent.mm.model.c.FW().d((com.tencent.mm.storage.ai)localObject1)), Long.valueOf(((am)localObject1).field_firstUnDeliverSeq), Long.valueOf(((am)localObject1).field_lastSeq), Integer.valueOf(((am)localObject1).field_UnDeliverCount) });
      }
    }
    for (;;)
    {
      au.HU();
      localObject1 = com.tencent.mm.model.c.Ga().ii(str);
      au.HU();
      localObject2 = com.tencent.mm.model.c.FR().Yg(str);
      if ((localObject2 == null) || ((int)((com.tencent.mm.l.a)localObject2).dhP <= 0))
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BigBallOfMudSyncExtension", "summerbadcr processAddMsgDigestList chatRoomId[%s], contact is null need get", new Object[] { str });
        am.a.dBr.a(str, null, new a.1(this, (u)localObject1, str));
      }
      if ((!com.tencent.mm.sdk.a.b.foreground) || (j == 10002) || (k <= 0)) {
        break;
      }
      localObject1 = new by();
      ((by)localObject1).rcj = parambz.rcs;
      ((by)localObject1).rck = com.tencent.mm.platformtools.ab.oT(com.tencent.mm.model.q.GF());
      ((by)localObject1).lOH = parambz.lOH;
      ((by)localObject1).rcl = parambz.rcu;
      ((by)localObject1).jQd = parambz.jQd;
      ((by)localObject1).rcq = parambz.rcq;
      ((by)localObject1).rcr = parambz.rcr;
      if (params == null) {
        break;
      }
      params.a(localbd, (by)localObject1);
      return;
      ((com.tencent.mm.storage.ai)localObject1).av(n);
      i = 1;
      break label488;
      int i1 = (int)((am)localObject1).field_lastSeq;
      com.tencent.mm.plugin.report.f.mDy.a(403L, 23L, 1L, false);
      if (k < ((am)localObject1).field_UnDeliverCount) {
        com.tencent.mm.plugin.report.f.mDy.a(403L, 26L, ((am)localObject1).field_UnDeliverCount, false);
      }
      if (n > i1)
      {
        ((com.tencent.mm.storage.ai)localObject1).au(n);
        ((com.tencent.mm.storage.ai)localObject1).fc(k);
        ((com.tencent.mm.storage.ai)localObject1).as(com.tencent.mm.model.bd.o(str, i));
        if (k > ((am)localObject1).field_unReadCount) {
          ((com.tencent.mm.storage.ai)localObject1).eV(k);
        }
        l = ((am)localObject1).field_firstUnDeliverSeq;
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BigBallOfMudSyncExtension", "summerbadcr processAddMsgDigestList  msgSeq[%d], firstSeq[%d], lastseq[%d]", new Object[] { Integer.valueOf(n), Long.valueOf(l), Integer.valueOf(i1) });
        if (l > 0L)
        {
          au.HU();
          localObject3 = com.tencent.mm.model.c.FT().J(str, i1);
          if (((cm)localObject3).field_msgId > 0L)
          {
            ((com.tencent.mm.storage.ai)localObject1).av(((cm)localObject3).field_msgSeq);
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BigBallOfMudSyncExtension", "summerbadcr processAddMsgDigestList unDeliverCount:%d reset firstSeq:%d to last exist: %d", new Object[] { Integer.valueOf(k), Long.valueOf(l), Long.valueOf(((am)localObject1).field_firstUnDeliverSeq) });
            com.tencent.mm.plugin.report.f.mDy.a(403L, 28L, 1L, false);
            i = 0;
            break label488;
          }
          com.tencent.mm.plugin.report.f.mDy.a(403L, 29L, 1L, false);
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BigBallOfMudSyncExtension", "summerbadcr processAddMsgDigestList unDeliverCount:%d lastSeq:%d not existed", new Object[] { Integer.valueOf(k), Integer.valueOf(i1) });
          i = 0;
          break label488;
        }
        l = ((com.tencent.mm.plugin.messenger.foundation.a.i)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).Gx().Gv(str);
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BigBallOfMudSyncExtension", "summerbadcr processAddMsgDigestList lastDeleteSeq[%s]", new Object[] { Long.valueOf(l) });
        if (l > 0L)
        {
          com.tencent.mm.plugin.report.f.mDy.a(403L, 30L, 1L, false);
          ((com.tencent.mm.storage.ai)localObject1).av(l);
          i = 0;
          break label488;
        }
        au.HU();
        l = com.tencent.mm.model.c.FT().Ha(str);
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BigBallOfMudSyncExtension", "summerbadcr processAddMsgDigestList lastMsgSeq[%s]", new Object[] { Long.valueOf(l) });
        if (l > 0L)
        {
          ((com.tencent.mm.storage.ai)localObject1).av(l);
          com.tencent.mm.plugin.report.f.mDy.a(403L, 31L, 1L, false);
          i = 0;
          break label488;
        }
        com.tencent.mm.plugin.report.f.mDy.a(403L, 32L, 1L, false);
        i = 0;
        break label488;
      }
      if ((n == i1) && (k == 0) && (((am)localObject1).field_unReadCount > 0))
      {
        com.tencent.mm.plugin.report.f.mDy.a(403L, 33L, 1L, false);
        ((com.tencent.mm.storage.ai)localObject1).eV(0);
      }
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BigBallOfMudSyncExtension", "summerbadcr processAddMsgDigestList msgSeq <= lastSeq, do nothing [%d, %d]", new Object[] { Integer.valueOf(n), Integer.valueOf(i1) });
      return;
      label1592:
      break label586;
      label1595:
      if (j != 10002) {
        break label593;
      }
      au.getSysCmdMsgExtension();
      if ((localbd.getType() != 10002) || (bi.oW((String)localObject2))) {
        break label593;
      }
      if (bi.oW((String)localObject2))
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.SysCmdMsgExtension", "null msg content");
        break label593;
      }
      if (((String)localObject2).startsWith("~SEMI_XML~"))
      {
        localObject3 = com.tencent.mm.sdk.platformtools.ay.WA((String)localObject2);
        if (localObject3 == null)
        {
          com.tencent.mm.sdk.platformtools.x.e("MicroMsg.SysCmdMsgExtension", "SemiXml values is null, msgContent %s", new Object[] { localObject2 });
          break label593;
        }
        localObject4 = "brand_service";
        localObject2 = localObject3;
      }
      for (localObject3 = localObject4;; localObject3 = localObject4)
      {
        if ((localObject3 == null) || (!((String)localObject3).equals("revokemsg"))) {
          break label1903;
        }
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SysCmdMsgExtension", "mm hit MM_DATA_SYSCMD_NEWXML_SUBTYPE_REVOKE");
        ((Map)localObject2).get(".sysmsg.revokemsg.session");
        localObject3 = (String)((Map)localObject2).get(".sysmsg.revokemsg.newmsgid");
        localObject2 = (String)((Map)localObject2).get(".sysmsg.revokemsg.replacemsg");
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SysCmdMsgExtension", "ashutest::[oneliang][xml parse] ,msgId:%s,replaceMsg:%s ", new Object[] { localObject3, localObject2 });
        localbd.setContent((String)localObject2);
        localbd.setType(10000);
        break;
        m = ((String)localObject2).indexOf("<sysmsg");
        if (m == -1)
        {
          com.tencent.mm.sdk.platformtools.x.e("MicroMsg.SysCmdMsgExtension", "msgContent not start with <sysmsg");
          break;
        }
        localObject3 = bl.z(((String)localObject2).substring(m), "sysmsg");
        if (localObject3 == null)
        {
          com.tencent.mm.sdk.platformtools.x.e("MicroMsg.SysCmdMsgExtension", "XmlParser values is null, msgContent %s", new Object[] { localObject2 });
          break;
        }
        localObject4 = (String)((Map)localObject3).get(".sysmsg.$type");
        localObject2 = localObject3;
      }
      label1903:
      break label593;
      label1905:
      localObject2 = " " + bi.oV((String)localObject2);
      break label770;
      label1931:
      ((com.tencent.mm.storage.ai)localObject1).ed(((am)localObject1).field_content);
      break label782;
      label1944:
      ((com.tencent.mm.storage.ai)localObject1).eZ(((am)localObject1).field_attrflag & 0xFFEFFFFF);
      au.HU();
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BigBallOfMudSyncExtension", "summerbadcr, processAddMsgDigestList update username[%s], ret[%d], firstSeq[%d], lastSeq[%d], undeliver[%d]", new Object[] { str, Long.valueOf(com.tencent.mm.model.c.FW().a((com.tencent.mm.storage.ai)localObject1, str, true)), Long.valueOf(((am)localObject1).field_firstUnDeliverSeq), Long.valueOf(((am)localObject1).field_lastSeq), Integer.valueOf(((am)localObject1).field_UnDeliverCount) });
    }
  }
  
  public final void a(pm parampm, byte[] paramArrayOfByte, boolean paramBoolean, com.tencent.mm.plugin.messenger.foundation.a.s params)
  {
    switch (parampm.rtM)
    {
    default: 
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.BigBallOfMudSyncExtension", "doCmd: no processing method, cmd id=" + parampm.rtM);
    case 22: 
    case 13: 
    case 15: 
    case 23: 
    case 25: 
    case 24: 
    case 33: 
    case 35: 
    case 44: 
    case 999999: 
    case 53: 
      label272:
      label950:
      label955:
      label1304:
      label1309:
      label1575:
      label1763:
      label1831:
      label1836:
      label1841:
      label1936:
      label1980:
      label2027:
      label2219:
      label2240:
      label2248:
      do
      {
        for (;;)
        {
          return;
          parampm = (anx)new anx().aG(paramArrayOfByte);
          paramArrayOfByte = new p();
          paramArrayOfByte.username = parampm.hbL;
          paramArrayOfByte.eKy = parampm.rQA;
          paramArrayOfByte.dLB = ((int)bi.VE());
          com.tencent.mm.plugin.account.b.getInviteFriendOpenStg().a(paramArrayOfByte);
          return;
          parampm = (auo)new auo().aG(paramArrayOfByte);
          if (1 == parampm.rXI)
          {
            au.HU();
            paramArrayOfByte = com.tencent.mm.model.c.FZ();
            params = com.tencent.mm.platformtools.ab.a(parampm.rvi);
            if (parampm.rXs == 1)
            {
              paramBoolean = true;
              if (parampm.rXJ != 1) {
                break label272;
              }
            }
            for (boolean bool = true;; bool = false)
            {
              paramArrayOfByte.e(params, paramBoolean, bool);
              return;
              paramBoolean = false;
              break;
            }
          }
          com.tencent.mm.sdk.platformtools.x.e("MicroMsg.BigBallOfMudSyncExtension", "unknown micro blog type:" + parampm.rXI);
          return;
          parampm = (atz)new atz().aG(paramArrayOfByte);
          if (parampm != null)
          {
            com.tencent.mm.sdk.platformtools.x.d("MicroMsg.BigBallOfMudSyncExtension", "processModChatRoomMember username:" + parampm.rvi + " nickname:" + parampm.rQz);
            params = com.tencent.mm.platformtools.ab.a(parampm.rvi);
            au.HU();
            paramArrayOfByte = com.tencent.mm.model.c.FR().Yg(params);
            paramArrayOfByte.setUsername(params);
            paramArrayOfByte.dx(com.tencent.mm.platformtools.ab.a(parampm.rQz));
            paramArrayOfByte.dy(com.tencent.mm.platformtools.ab.a(parampm.ruT));
            paramArrayOfByte.dz(com.tencent.mm.platformtools.ab.a(parampm.ruU));
            paramArrayOfByte.eJ(parampm.eJH);
            paramArrayOfByte.dv(com.tencent.mm.platformtools.ab.a(parampm.rWH));
            paramArrayOfByte.dB(com.tencent.mm.platformtools.ab.a(parampm.rWJ));
            paramArrayOfByte.dC(com.tencent.mm.platformtools.ab.a(parampm.rWI));
            paramArrayOfByte.eM(parampm.rup);
            params = new com.tencent.mm.aa.j();
            params.bWA = -1;
            params.username = paramArrayOfByte.field_username;
            params.dHQ = parampm.rra;
            params.dHR = parampm.rqZ;
            com.tencent.mm.sdk.platformtools.x.d("MicroMsg.BigBallOfMudSyncExtension", "dkhurl chatmember %s b[%s] s[%s]", new Object[] { params.getUsername(), params.Kx(), params.Ky() });
            params.by(true);
            if ((parampm.rWZ == 3) || (parampm.rWZ == 4))
            {
              paramArrayOfByte.eI(parampm.rWZ);
              params.csA = parampm.rWZ;
            }
            for (;;)
            {
              com.tencent.mm.aa.q.KH().a(params);
              au.HU();
              com.tencent.mm.model.c.FR().S(paramArrayOfByte);
              params = z.MY().kA(paramArrayOfByte.field_username);
              params.field_username = paramArrayOfByte.field_username;
              params.field_brandList = parampm.eJR;
              parampm = parampm.rTl;
              if (parampm != null)
              {
                params.field_brandFlag = parampm.eJV;
                params.field_brandInfo = parampm.eJX;
                params.field_brandIconURL = parampm.eJY;
                params.field_extInfo = parampm.eJW;
              }
              if (z.MY().e(params)) {
                break;
              }
              z.MY().d(params);
              return;
              if (parampm.rWZ == 2)
              {
                paramArrayOfByte.eI(3);
                params.csA = 3;
                paramArrayOfByte.eI(3);
                if (!com.tencent.mm.model.q.GF().equals(paramArrayOfByte.field_username))
                {
                  com.tencent.mm.aa.q.Kp();
                  com.tencent.mm.aa.f.B(paramArrayOfByte.field_username, false);
                  com.tencent.mm.aa.q.Kp();
                  com.tencent.mm.aa.f.B(paramArrayOfByte.field_username, true);
                  com.tencent.mm.aa.q.KJ().jO(paramArrayOfByte.field_username);
                }
              }
            }
            parampm = (xt)new xt().aG(paramArrayOfByte);
            switch (parampm.rDz)
            {
            case 4: 
            case 2: 
            case 3: 
            default: 
              com.tencent.mm.sdk.platformtools.x.e("MicroMsg.BigBallOfMudSyncExtension", "unknown function switch id:" + parampm.rDz);
              return;
            }
            au.HU();
            com.tencent.mm.model.c.DT().set(17, Integer.valueOf(parampm.rDA));
            return;
            parampm = (bse)new bse().aG(paramArrayOfByte);
            if (parampm != null)
            {
              paramBoolean = true;
              Assert.assertTrue(paramBoolean);
              if (bi.oV(parampm.hbL).length() <= 0) {
                break label950;
              }
            }
            for (paramBoolean = true;; paramBoolean = false)
            {
              Assert.assertTrue(paramBoolean);
              if (com.tencent.mm.storage.ab.XO(parampm.hbL)) {
                break label955;
              }
              com.tencent.mm.sdk.platformtools.x.w("MicroMsg.BigBallOfMudSyncExtension", "processModTContact: tcontact should ends with @t.qq.com");
              return;
              paramBoolean = false;
              break;
            }
            au.HU();
            paramArrayOfByte = com.tencent.mm.model.c.FR().Yg(parampm.hbL);
            if ((paramArrayOfByte == null) || ((int)paramArrayOfByte.dhP == 0))
            {
              paramArrayOfByte = new com.tencent.mm.storage.ab(parampm.hbL);
              paramArrayOfByte.dv(parampm.rqY);
              paramArrayOfByte.eM(1);
              paramArrayOfByte.Bh();
              au.HU();
              if (com.tencent.mm.model.c.FR().U(paramArrayOfByte) == -1)
              {
                com.tencent.mm.sdk.platformtools.x.e("MicroMsg.BigBallOfMudSyncExtension", "processModTContact: insert contact failed");
                return;
              }
              paramArrayOfByte = paramArrayOfByte.field_username;
              if (paramArrayOfByte == null) {
                com.tencent.mm.sdk.platformtools.x.w("MicroMsg.AvatarLogic", "setMBTAvatarImgFlag failed : invalid username");
              }
            }
            for (;;)
            {
              paramArrayOfByte = new rk();
              paramArrayOfByte.ccg.opType = 1;
              paramArrayOfByte.ccg.bWJ = parampm.hbL;
              paramArrayOfByte.ccg.bWK = parampm.seX;
              paramArrayOfByte.ccg.bWL = parampm.ruw;
              com.tencent.mm.sdk.b.a.sFg.m(paramArrayOfByte);
              return;
              if (!paramArrayOfByte.endsWith("@t.qq.com"))
              {
                com.tencent.mm.sdk.platformtools.x.w("MicroMsg.AvatarLogic", "setMBTAvatarImgFlag failed : invalid username");
              }
              else
              {
                params = new com.tencent.mm.aa.j();
                params.username = paramArrayOfByte;
                params.csA = 3;
                params.bWA = 3;
                com.tencent.mm.aa.q.KH().a(params);
                continue;
                if (!bi.oV(parampm.rqY).equals(bi.oV(paramArrayOfByte.field_username)))
                {
                  paramArrayOfByte.dv(parampm.rqY);
                  au.HU();
                  if (com.tencent.mm.model.c.FR().a(paramArrayOfByte.field_username, paramArrayOfByte) == -1) {
                    com.tencent.mm.sdk.platformtools.x.e("MicroMsg.BigBallOfMudSyncExtension", "processModTContact: update contact failed");
                  }
                }
              }
            }
            parampm = (bcu)new bcu().aG(paramArrayOfByte);
            if (parampm != null)
            {
              paramBoolean = true;
              Assert.assertTrue(paramBoolean);
              if (bi.oV(parampm.hbL).length() <= 0) {
                break label1304;
              }
            }
            for (paramBoolean = true;; paramBoolean = false)
            {
              Assert.assertTrue(paramBoolean);
              if (com.tencent.mm.storage.ab.XQ(parampm.hbL)) {
                break label1309;
              }
              com.tencent.mm.sdk.platformtools.x.w("MicroMsg.BigBallOfMudSyncExtension", "processModQContact: qcontact should ends with @t.qq.com");
              return;
              paramBoolean = false;
              break;
            }
            au.HU();
            paramArrayOfByte = com.tencent.mm.model.c.FR().Yg(parampm.hbL);
            if ((paramArrayOfByte == null) || ((int)paramArrayOfByte.dhP == 0))
            {
              paramArrayOfByte = new com.tencent.mm.storage.ab(parampm.hbL);
              paramArrayOfByte.Bh();
              paramArrayOfByte.dx(parampm.rqY);
              paramArrayOfByte.dv(parampm.rqY);
              paramArrayOfByte.eM(4);
              au.HU();
              if (com.tencent.mm.model.c.FR().U(paramArrayOfByte) == -1)
              {
                com.tencent.mm.sdk.platformtools.x.e("MicroMsg.BigBallOfMudSyncExtension", "processModQContact: insert contact failed");
                return;
              }
              com.tencent.mm.aa.c.jL(paramArrayOfByte.field_username);
            }
            for (;;)
            {
              paramArrayOfByte = new mc();
              paramArrayOfByte.bWF.opType = 1;
              paramArrayOfByte.bWF.bWJ = parampm.hbL;
              paramArrayOfByte.bWF.bWK = parampm.seX;
              paramArrayOfByte.bWF.bWL = parampm.ruw;
              com.tencent.mm.sdk.b.a.sFg.m(paramArrayOfByte);
              return;
              if (!bi.oV(parampm.rqY).equals(bi.oV(paramArrayOfByte.field_username)))
              {
                paramArrayOfByte.dx(parampm.rqY);
                paramArrayOfByte.dv(parampm.rqY);
                au.HU();
                if (com.tencent.mm.model.c.FR().a(paramArrayOfByte.field_username, paramArrayOfByte) == -1) {
                  com.tencent.mm.sdk.platformtools.x.e("MicroMsg.BigBallOfMudSyncExtension", "processModQContact: update contact failed");
                }
              }
            }
            parampm = (atw)new atw().aG(paramArrayOfByte);
            if (parampm != null)
            {
              paramBoolean = true;
              Assert.assertTrue(paramBoolean);
              if (bi.oV(parampm.hbL).length() <= 0) {
                break label1831;
              }
              paramBoolean = true;
              Assert.assertTrue(paramBoolean);
              paramArrayOfByte = new com.tencent.mm.storage.ab();
              paramArrayOfByte.setUsername(parampm.hbL);
              paramArrayOfByte.setType(parampm.hcE);
              paramArrayOfByte.eJ(parampm.eJH);
              paramArrayOfByte.dS(RegionCodeDecoder.aq(parampm.eJQ, parampm.eJI, parampm.eJJ));
              paramArrayOfByte.dM(parampm.eJK);
              params = new com.tencent.mm.aa.j();
              params.bWA = -1;
              params.username = parampm.hbL;
              params.dHQ = parampm.rra;
              params.dHR = parampm.rqZ;
              com.tencent.mm.sdk.platformtools.x.d("MicroMsg.BigBallOfMudSyncExtension", "dkhurl bottle %s b[%s] s[%s]", new Object[] { params.getUsername(), params.Kx(), params.Ky() });
              com.tencent.mm.sdk.platformtools.x.d("MicroMsg.BigBallOfMudSyncExtension", "bottlecontact imgflag:" + parampm.rWZ + " hd:" + parampm.rXa);
              if (parampm.rXa == 0) {
                break label1836;
              }
              paramBoolean = true;
              params.by(paramBoolean);
              if ((parampm.rWZ != 3) && (parampm.rWZ != 4)) {
                break label1841;
              }
              paramArrayOfByte.eI(parampm.rWZ);
              params.csA = parampm.rWZ;
            }
            for (;;)
            {
              com.tencent.mm.aa.q.KH().a(params);
              au.HU();
              com.tencent.mm.model.c.FR().R(paramArrayOfByte);
              return;
              paramBoolean = false;
              break;
              paramBoolean = false;
              break label1575;
              paramBoolean = false;
              break label1763;
              if (parampm.rWZ == 2)
              {
                paramArrayOfByte.eI(3);
                params.csA = 3;
                com.tencent.mm.aa.q.Kp();
                com.tencent.mm.aa.f.B(parampm.hbL, false);
                com.tencent.mm.aa.q.Kp();
                com.tencent.mm.aa.f.B(parampm.hbL, true);
                com.tencent.mm.aa.q.KJ().jO(parampm.hbL);
              }
              else
              {
                paramArrayOfByte.eI(3);
                params.csA = 3;
              }
            }
            params = (aux)new aux().aG(paramArrayOfByte);
            int j;
            int i;
            if (params != null)
            {
              paramBoolean = true;
              Assert.assertTrue(paramBoolean);
              parampm = com.tencent.mm.model.q.GF();
              j = params.rjI;
              if (j != 2) {
                break label2219;
              }
              parampm = com.tencent.mm.storage.ab.XV(parampm);
              au.HU();
              paramArrayOfByte = (String)com.tencent.mm.model.c.DT().get(12553, null);
              paramBoolean = false;
              if ((paramArrayOfByte == null) || (!paramArrayOfByte.equals(params.rXS)))
              {
                com.tencent.mm.aa.q.Kp();
                com.tencent.mm.aa.f.B(parampm, true);
                au.HU();
                paramArrayOfByte = com.tencent.mm.model.c.DT();
                if (j != 2) {
                  break label2240;
                }
                i = 12553;
                paramArrayOfByte.set(i, params.rXS);
                paramBoolean = true;
              }
              com.tencent.mm.sdk.platformtools.x.d("MicroMsg.BigBallOfMudSyncExtension", "ModUserImg beRemove:%b imgtype:%d md5:%s big:%s sm:%s", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf(j), params.rXS, params.rqZ, params.rra });
              paramArrayOfByte = new com.tencent.mm.aa.j();
              paramArrayOfByte.username = parampm;
              paramArrayOfByte.dHR = params.rqZ;
              paramArrayOfByte.dHQ = params.rra;
              if (!bi.oW(paramArrayOfByte.Ky()))
              {
                if (j != 1) {
                  break label2248;
                }
                au.HU();
                com.tencent.mm.model.c.DT().set(59, Boolean.valueOf(true));
              }
            }
            for (;;)
            {
              paramArrayOfByte.by(false);
              paramArrayOfByte.bWA = 56;
              if (!bi.oW(params.rXS)) {
                paramArrayOfByte.by(true);
              }
              com.tencent.mm.aa.q.KH().a(paramArrayOfByte);
              if (!paramBoolean) {
                break;
              }
              new com.tencent.mm.aa.g().a(parampm, new a.2(this));
              return;
              paramBoolean = false;
              break label1936;
              au.HU();
              paramArrayOfByte = (String)com.tencent.mm.model.c.DT().get(12297, null);
              break label1980;
              i = 12297;
              break label2027;
              au.HU();
              com.tencent.mm.model.c.DT().set(60, Boolean.valueOf(true));
            }
            params = (bxb)new bxb().aG(paramArrayOfByte);
            com.tencent.mm.sdk.platformtools.x.d("MicroMsg.BigBallOfMudSyncExtension", "snsExtFlag " + params.rTk.eJS);
            au.HU();
            String str = (String)com.tencent.mm.model.c.DT().get(2, null);
            if ((str != null) && (str.length() > 0))
            {
              if (com.tencent.mm.plugin.sns.b.n.nky != null) {
                com.tencent.mm.plugin.sns.b.n.nky.a(str, params.rTk);
              }
              paramArrayOfByte = com.tencent.mm.ac.f.kH(com.tencent.mm.model.q.GF());
              parampm = paramArrayOfByte;
              if (paramArrayOfByte == null) {
                parampm = new d();
              }
              parampm.field_username = str;
              parampm.field_brandList = params.eJR;
              if ((parampm.LZ()) && (parampm.bG(false) != null) && (parampm.bG(false).MB() != null) && (!bi.oW(parampm.Mg())))
              {
                parampm.field_enterpriseFather = parampm.Mg();
                com.tencent.mm.sdk.platformtools.x.d("MicroMsg.BigBallOfMudSyncExtension", "processModUserInfoExt, %s set enterpriseFather %s", new Object[] { str, parampm.field_enterpriseFather });
              }
              if (!z.MY().e(parampm)) {
                z.MY().d(parampm);
              }
              i = params.str;
              j = params.sts;
              int k = params.stt;
              com.tencent.mm.sdk.platformtools.x.d("MicroMsg.BigBallOfMudSyncExtension", "roomSize :" + i + " rommquota: " + j + " invite: " + k);
              au.HU();
              com.tencent.mm.model.c.DT().set(135175, Integer.valueOf(i));
              au.HU();
              com.tencent.mm.model.c.DT().set(135176, Integer.valueOf(j));
              au.HU();
              com.tencent.mm.model.c.DT().set(135177, Integer.valueOf(k));
              au.HU();
              com.tencent.mm.model.c.DT().set(144385, Integer.valueOf(params.stx));
              au.HU();
              com.tencent.mm.model.c.DT().a(aa.a.sTs, Integer.valueOf(params.rEA));
              au.HU();
              com.tencent.mm.model.c.DT().set(339975, Integer.valueOf(params.stF));
              com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BigBallOfMudSyncExtension", "hy: sync do cmd pay wallet type: %d %d", new Object[] { Integer.valueOf(params.stF), Integer.valueOf(params.rEA) });
              au.HU();
              com.tencent.mm.model.c.DT().a(aa.a.sRy, bi.aG(params.csY, ""));
              com.tencent.mm.sdk.platformtools.x.d("MicroMsg.BigBallOfMudSyncExtension", "weidianinfo:%s", new Object[] { params.csY });
              au.HU();
              com.tencent.mm.model.c.DT().set(147457, Long.valueOf(params.stG));
              au.HU();
              com.tencent.mm.model.c.DT().a(aa.a.sVy, params.stH);
              parampm = new com.tencent.mm.aa.j();
              parampm.bWA = -1;
              parampm.username = str;
              parampm.dHR = params.rqZ;
              parampm.dHQ = params.rra;
              parampm.by(true);
              parampm.csA = 3;
              com.tencent.mm.sdk.platformtools.x.d("MicroMsg.BigBallOfMudSyncExtension", "dkavatar user:[%s] big:[%s] sm:[%s]", new Object[] { parampm.getUsername(), parampm.Kx(), parampm.Ky() });
              com.tencent.mm.aa.q.KH().a(parampm);
              parampm = params.rXk;
              paramArrayOfByte = params.rXl;
              au.HU();
              com.tencent.mm.model.c.DT().set(274433, paramArrayOfByte);
              au.HU();
              com.tencent.mm.model.c.DT().set(274434, parampm);
              if (params.rcy != null)
              {
                au.HU();
                com.tencent.mm.model.c.DT().set(286721, params.rcy.rhn);
                au.HU();
                com.tencent.mm.model.c.DT().set(286722, params.rcy.rho);
                au.HU();
                com.tencent.mm.model.c.DT().set(286723, params.rcy.rhp);
              }
              if ((params.stD != null) && (params.stD.sbL != null) && (params.stD.sbL.siI > 0))
              {
                com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BigBallOfMudSyncExtension", "tomgest PatternLockInfo %d", new Object[] { Integer.valueOf(params.stD.sbL.siI) });
                parampm = new sd();
                parampm.ccW.ccX = params.stD;
                com.tencent.mm.sdk.b.a.sFg.m(parampm);
                return;
                try
                {
                  i = com.tencent.mm.a.n.r(paramArrayOfByte, 0);
                  com.tencent.mm.sdk.platformtools.x.d("MicroMsg.BigBallOfMudSyncExtension", "local test synccmd, sleep %d", new Object[] { Integer.valueOf(i) });
                  if (i > 0)
                  {
                    Thread.sleep(i);
                    return;
                  }
                }
                catch (InterruptedException parampm)
                {
                  com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.BigBallOfMudSyncExtension", parampm, "", new Object[0]);
                  return;
                }
              }
            }
          }
        }
        parampm = (avu)new avu().aG(paramArrayOfByte);
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.BigBallOfMudSyncExtension", "rollback, msgtype is %d, msgid is %d", new Object[] { Integer.valueOf(parampm.jQd), Long.valueOf(parampm.rcq) });
      } while (!com.tencent.mm.model.s.hv(parampm.jTv));
      paramArrayOfByte = new oe();
      paramArrayOfByte.bZd.bJC = parampm.rcq;
      com.tencent.mm.sdk.b.a.sFg.m(paramArrayOfByte);
      return;
    }
    a((bz)new bz().aG(paramArrayOfByte), params);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/modelmulti/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */