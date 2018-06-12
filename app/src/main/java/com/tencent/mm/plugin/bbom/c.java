package com.tencent.mm.plugin.bbom;

import android.content.Context;
import com.tencent.mm.R.l;
import com.tencent.mm.aa.j;
import com.tencent.mm.ab.l;
import com.tencent.mm.ac.d.b;
import com.tencent.mm.ac.z;
import com.tencent.mm.g.a.er;
import com.tencent.mm.g.a.ha;
import com.tencent.mm.g.a.it;
import com.tencent.mm.g.a.it.a;
import com.tencent.mm.g.a.jn;
import com.tencent.mm.g.a.jy;
import com.tencent.mm.g.a.rm;
import com.tencent.mm.g.a.rn;
import com.tencent.mm.g.a.rn.b;
import com.tencent.mm.g.a.rs;
import com.tencent.mm.g.c.am;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.model.am.a;
import com.tencent.mm.model.am.b;
import com.tencent.mm.model.m;
import com.tencent.mm.model.s;
import com.tencent.mm.platformtools.i;
import com.tencent.mm.plugin.messenger.foundation.a.a.h.a;
import com.tencent.mm.plugin.messenger.foundation.a.a.h.b;
import com.tencent.mm.plugin.sns.b.n;
import com.tencent.mm.pluginsdk.o.a;
import com.tencent.mm.pluginsdk.o.c;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.protocal.c.aue;
import com.tencent.mm.protocal.c.auf;
import com.tencent.mm.protocal.c.aur;
import com.tencent.mm.protocal.c.bar;
import com.tencent.mm.protocal.c.bas;
import com.tencent.mm.protocal.c.bqd;
import com.tencent.mm.protocal.c.mx;
import com.tencent.mm.protocal.c.my;
import com.tencent.mm.protocal.c.qt;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.at;
import com.tencent.mm.storage.az;
import com.tencent.mm.storage.az.b;
import com.tencent.mm.storage.ba;
import com.tencent.mm.storage.bb;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.bo;
import com.tencent.mm.storage.bp;
import com.tencent.mm.storage.bq;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import junit.framework.Assert;
import org.json.JSONObject;

public final class c
  implements com.tencent.mm.ab.e, com.tencent.mm.plugin.messenger.foundation.a.c
{
  private static void A(com.tencent.mm.storage.ab paramab)
  {
    if ((paramab != null) && (com.tencent.mm.ac.f.kL(paramab.field_username)) && (!com.tencent.mm.ac.f.eZ(paramab.field_username)))
    {
      com.tencent.mm.model.au.HU();
      localai = com.tencent.mm.model.c.FW().Yq(paramab.field_username);
      paramab = z.MY().kA(paramab.field_username);
      if (com.tencent.mm.ac.f.kO(paramab.field_username)) {
        break label63;
      }
    }
    label63:
    while (localai != null) {
      return;
    }
    com.tencent.mm.storage.ai localai = new com.tencent.mm.storage.ai(paramab.field_username);
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BigBallContactAssemblerImpl", "Enterprise belong %s, userName: %s", new Object[] { paramab.Mg(), paramab.field_username });
    localai.ef(bi.oV(paramab.Mg()));
    localai.clx();
    com.tencent.mm.model.au.HU();
    com.tencent.mm.model.c.FW().d(localai);
  }
  
  private static void a(aue paramaue, String paramString, com.tencent.mm.storage.ab paramab, boolean paramBoolean)
  {
    Object localObject = com.tencent.mm.model.q.GF();
    if ((localObject != null) && (!((String)localObject).equals(paramString)))
    {
      localObject = z.MY().kA(paramString);
      ((com.tencent.mm.ac.d)localObject).field_username = paramString;
      ((com.tencent.mm.ac.d)localObject).field_brandList = paramaue.eJR;
      paramaue = paramaue.rTl;
      if (paramaue != null)
      {
        ((com.tencent.mm.ac.d)localObject).field_brandFlag = paramaue.eJV;
        ((com.tencent.mm.ac.d)localObject).field_brandInfo = paramaue.eJX;
        ((com.tencent.mm.ac.d)localObject).field_brandIconURL = paramaue.eJY;
        ((com.tencent.mm.ac.d)localObject).field_extInfo = paramaue.eJW;
        if (paramBoolean)
        {
          ((com.tencent.mm.ac.d)localObject).field_attrSyncVersion = null;
          ((com.tencent.mm.ac.d)localObject).field_incrementUpdateTime = 0L;
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BigBallContactAssemblerImpl", "Reset biz(%s) Attribute syncVersion and incUpdateTime.", new Object[] { paramString });
        }
        if (!bi.oW(((com.tencent.mm.ac.d)localObject).field_extInfo)) {
          ((com.tencent.mm.ac.d)localObject).bG(true);
        }
      }
      if ((((com.tencent.mm.ac.d)localObject).bG(false) != null) && (((com.tencent.mm.ac.d)localObject).bG(false).Mw() == 3) && (((com.tencent.mm.ac.d)localObject).bG(false).MB() != null) && (!bi.oW(((com.tencent.mm.ac.d)localObject).Mg())))
      {
        ((com.tencent.mm.ac.d)localObject).field_enterpriseFather = ((com.tencent.mm.ac.d)localObject).Mg();
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.BigBallContactAssemblerImpl", "saveBizInfo, %s set enterpriseFather %s", new Object[] { paramString, ((com.tencent.mm.ac.d)localObject).field_enterpriseFather });
      }
      if (!z.MY().e((com.tencent.mm.ac.d)localObject)) {
        z.MY().d((com.tencent.mm.ac.d)localObject);
      }
      paramab.eR(((com.tencent.mm.ac.d)localObject).field_type);
    }
  }
  
  public static boolean a(com.tencent.mm.storage.ab paramab, aue paramaue, boolean paramBoolean)
  {
    if ((paramab == null) || (bi.oW(paramab.field_username)))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.BigBallContactAssemblerImpl", "dkinit dealModContactExtInfo failed invalid contact");
      return false;
    }
    String str1 = paramab.field_username;
    Object localObject1 = paramab.field_encryptUsername;
    Object localObject2 = com.tencent.mm.aa.c.a(str1, paramaue);
    com.tencent.mm.aa.q.KH().a((j)localObject2);
    localObject2 = paramaue.rTk;
    if ((!paramab.field_username.endsWith("@chatroom")) && (localObject2 != null))
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BigBallContactAssemblerImpl", "SnsFlag modcontact " + ((bqd)localObject2).eJS + " " + paramaue.rvi);
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BigBallContactAssemblerImpl", "SnsBg modcontact " + ((bqd)localObject2).eJT);
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BigBallContactAssemblerImpl", "SnsBgId modcontact " + ((bqd)localObject2).eJU);
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BigBallContactAssemblerImpl", "SnsBgId modcontact " + ((bqd)localObject2).sod);
      if (n.nky != null) {
        n.nky.a(paramab.field_username, (bqd)localObject2);
      }
    }
    boolean bool;
    if (com.tencent.mm.l.a.gd(paramab.field_type))
    {
      bool = com.tencent.mm.az.d.SF().db(str1, 1);
      if (bool)
      {
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.BigBallContactAssemblerImpl", "fmsgConversation updateState succ, user = " + str1);
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BigBallContactAssemblerImpl", "processModContact, update state(ADDED) FMessageConversation, ret = " + bool);
      }
    }
    else if ((com.tencent.mm.l.a.gd(paramab.field_type)) && ((paramab.getSource() == 10) || (paramab.getSource() == 13)))
    {
      localObject1 = ad.getContext();
      localObject2 = paramab.field_username;
      String str2 = paramab.field_encryptUsername;
      if (!com.tencent.mm.platformtools.x.cc((Context)localObject1)) {
        break label483;
      }
      com.tencent.mm.sdk.f.e.b(new i((Context)localObject1, com.tencent.mm.platformtools.x.ce((Context)localObject1), (String)localObject2, str2), "MMAccountManager_updateSpecifiedContact").start();
    }
    for (;;)
    {
      localObject1 = com.tencent.mm.plugin.account.b.getAddrUploadStg().pp(paramab.field_encryptUsername);
      if ((localObject1 != null) && (!bi.oW(((com.tencent.mm.plugin.account.friend.a.a)localObject1).eJG)))
      {
        ((com.tencent.mm.plugin.account.friend.a.a)localObject1).username = paramab.field_username;
        int i = com.tencent.mm.plugin.account.b.getAddrUploadStg().a(((com.tencent.mm.plugin.account.friend.a.a)localObject1).eJG, (com.tencent.mm.plugin.account.friend.a.a)localObject1);
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.BigBallContactAssemblerImpl", "account sync: update addr " + i);
      }
      a(paramaue, str1, paramab, paramBoolean);
      return true;
      bool = com.tencent.mm.az.d.SF().db((String)localObject1, 1);
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.BigBallContactAssemblerImpl", "fmsgConversation updateState succ, encryptUser = " + (String)localObject1);
      break;
      label483:
      com.tencent.mm.platformtools.x.H((Context)localObject1, null);
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.MMAccountManager", "no account added or not current account");
    }
  }
  
  private static boolean a(com.tencent.mm.storage.ab paramab, bq parambq)
  {
    boolean bool2 = false;
    if (!bi.oW(parambq.field_conDescription)) {
      paramab.dT(parambq.field_conDescription);
    }
    boolean bool1 = bool2;
    if (!s.hd(paramab.field_username))
    {
      bool1 = bool2;
      if (com.tencent.mm.l.a.gd(paramab.field_type))
      {
        bool2 = true;
        bool1 = bool2;
        if (!bi.oW(parambq.field_conDescription))
        {
          auf localauf = new auf();
          localauf.rXy = paramab.field_username;
          localauf.jOS = parambq.field_conDescription;
          com.tencent.mm.model.au.HU();
          com.tencent.mm.model.c.FQ().b(new h.a(54, localauf));
          bool1 = bool2;
        }
      }
    }
    return bool1;
  }
  
  private static void aU(String paramString, int paramInt)
  {
    bo[] arrayOfbo;
    Object localObject1;
    at[] arrayOfat;
    ba[] arrayOfba;
    if ((paramInt == 26) || (paramInt == 27) || (paramInt == 28) || (paramInt == 29))
    {
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.BigBallContactAssemblerImpl", "initAddContent, scene is shake");
      arrayOfbo = com.tencent.mm.az.d.SH().Zp(paramString);
      localObject1 = com.tencent.mm.pluginsdk.ui.preference.b.a(ad.getContext(), arrayOfbo);
      arrayOfat = null;
      arrayOfba = null;
    }
    while (localObject1 == null)
    {
      return;
      if (paramInt == 18)
      {
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.BigBallContactAssemblerImpl", "initAddContent, scene is lbs");
        arrayOfba = com.tencent.mm.az.d.SG().YR(paramString);
        localObject1 = com.tencent.mm.pluginsdk.ui.preference.b.a(ad.getContext(), arrayOfba);
        arrayOfbo = null;
        arrayOfat = null;
      }
      else
      {
        arrayOfat = com.tencent.mm.az.d.SE().YM(paramString);
        localObject1 = com.tencent.mm.pluginsdk.ui.preference.b.a(ad.getContext(), arrayOfat);
        arrayOfbo = null;
        arrayOfba = null;
      }
    }
    paramInt = 0;
    int k = localObject1.length;
    int i = 0;
    Object localObject2;
    bd localbd;
    int m;
    int j;
    if (i < k)
    {
      localObject2 = localObject1[i];
      localbd = new bd();
      localbd.setContent(((com.tencent.mm.pluginsdk.ui.preference.b)localObject2).dzA);
      m = s.hQ(((com.tencent.mm.pluginsdk.ui.preference.b)localObject2).username);
      if (arrayOfat != null)
      {
        j = paramInt + 1;
        localbd.ay(arrayOfat[paramInt].field_createTime);
        paramInt = j;
      }
    }
    label206:
    label243:
    label382:
    label537:
    for (;;)
    {
      localbd.ep(((com.tencent.mm.pluginsdk.ui.preference.b)localObject2).username);
      localbd.setType(m);
      long l;
      if (((com.tencent.mm.pluginsdk.ui.preference.b)localObject2).ceW)
      {
        localbd.setStatus(2);
        localbd.eX(1);
        com.tencent.mm.model.au.HU();
        l = com.tencent.mm.model.c.FT().T(localbd);
        if (l == -1L) {
          break label382;
        }
      }
      for (boolean bool = true;; bool = false)
      {
        Assert.assertTrue(bool);
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BigBallContactAssemblerImpl", "new msg inserted to db , local id = " + l);
        i += 1;
        break;
        if (arrayOfba != null)
        {
          j = paramInt + 1;
          localbd.ay(arrayOfba[paramInt].field_createtime * 1000L);
          paramInt = j;
          break label206;
        }
        if (arrayOfbo == null) {
          break label537;
        }
        j = paramInt + 1;
        localbd.ay(arrayOfbo[paramInt].field_createtime * 1000L);
        paramInt = j;
        break label206;
        localbd.setStatus(6);
        localbd.eX(0);
        break label243;
      }
      localObject1 = new bd();
      if (arrayOfat != null) {
        ((bd)localObject1).ay(arrayOfat[(arrayOfat.length - 1)].field_createTime + 1L);
      }
      for (;;)
      {
        ((bd)localObject1).ep(paramString);
        ((bd)localObject1).setContent(ad.getContext().getString(R.l.transfer_greet_msg_tip));
        ((bd)localObject1).setType(10000);
        ((bd)localObject1).setStatus(6);
        ((bd)localObject1).eX(0);
        com.tencent.mm.model.au.HU();
        com.tencent.mm.model.c.FT().T((bd)localObject1);
        return;
        if (arrayOfba != null) {
          ((bd)localObject1).ay(arrayOfba[(arrayOfba.length - 1)].field_createtime * 1000L + 1L);
        } else if (arrayOfbo != null) {
          ((bd)localObject1).ay(arrayOfbo[(arrayOfbo.length - 1)].field_createtime * 1000L + 1L);
        }
      }
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BigBallContactAssemblerImpl", "onsceneEnd errType:%d,errCode:%d,errMsg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if (paraml.getType() != 681) {}
    while ((paramInt1 != 0) || (paramInt2 != 0)) {
      return;
    }
    if (!com.tencent.mm.kernel.g.Eg().dpD)
    {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.BigBallContactAssemblerImpl", "initialize notify is not done.");
      return;
    }
    paraml = ((com.tencent.mm.aq.a)paraml).ebW;
    paramString = new HashSet();
    for (;;)
    {
      h.b localb;
      try
      {
        paraml = paraml.iterator();
        if (paraml.hasNext())
        {
          localb = (h.b)paraml.next();
          if (localb.getCmdId() != 2) {
            break label226;
          }
          paramString.add(com.tencent.mm.platformtools.ab.a(((aue)new aue().aG(localb.getBuffer())).rvi));
          continue;
        }
        if (!paramString.hasNext()) {
          break;
        }
      }
      catch (Exception paraml)
      {
        com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.BigBallContactAssemblerImpl", paraml, "BaseProtoBuf parseFrom error!", new Object[0]);
        paramString = paramString.iterator();
      }
      for (;;)
      {
        paraml = (String)paramString.next();
        if (!bi.oW(paraml)) {
          am.a.dBr.a(paraml, null, null);
        }
      }
      label226:
      if (localb.getCmdId() == 54) {
        paramString.add(((auf)new auf().aG(localb.getBuffer())).rXy);
      } else if (localb.getCmdId() == 60) {
        paramString.add(((aur)new aur().aG(localb.getBuffer())).rXy);
      }
    }
  }
  
  public final void a(com.tencent.mm.storage.ab paramab1, com.tencent.mm.storage.ab paramab2, aue paramaue, byte[] paramArrayOfByte, boolean paramBoolean)
  {
    String str1 = paramab1.field_username;
    Object localObject1 = paramab1.field_encryptUsername;
    if ((paramab2 != null) && (!bi.oV(paramab2.csU).equals(bi.oV(paramaue.rXt))))
    {
      com.tencent.mm.at.c.Qt();
      com.tencent.mm.at.c.mA(str1);
    }
    if (!bi.bC(paramArrayOfByte))
    {
      if (com.tencent.mm.storage.ab.Dk(paramab1.field_verifyFlag)) {
        a(paramaue, str1, paramab1, true);
      }
      if ((paramab2 == null) || (com.tencent.mm.l.a.gd(paramab2.field_type)) || (!com.tencent.mm.l.a.gd(paramab1.field_type))) {
        break label1684;
      }
    }
    label274:
    label792:
    label1143:
    label1149:
    label1414:
    label1639:
    label1684:
    for (int j = 1;; j = 0)
    {
      Object localObject2 = paramab1.field_username;
      if (paramaue.rXu == null) {}
      Object localObject3;
      for (paramArrayOfByte = "";; paramArrayOfByte = Integer.valueOf(bi.f(Integer.valueOf(paramaue.rXu.sdd.size()))))
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BigBallContactAssemblerImpl", "username:%s PhoneNumList size:%s", new Object[] { localObject2, paramArrayOfByte });
        localObject2 = new StringBuffer();
        if ((paramaue.rXu == null) || (paramaue.rXu.sdd == null)) {
          break label274;
        }
        paramArrayOfByte = paramaue.rXu.sdd.iterator();
        while (paramArrayOfByte.hasNext())
        {
          localObject3 = (bar)paramArrayOfByte.next();
          if (((bar)localObject3).sdc != null) {
            ((StringBuffer)localObject2).append(((bar)localObject3).sdc + ",");
          }
        }
        a(paramab1, paramaue, true);
        break;
      }
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BigBallContactAssemblerImpl", "username:%s, phoneList %s", new Object[] { paramab1.field_username, ((StringBuffer)localObject2).toString() });
      paramArrayOfByte = null;
      int m = 0;
      if (paramab2 != null) {
        paramArrayOfByte = paramab2.csZ;
      }
      if (paramArrayOfByte != null)
      {
        paramab2 = paramArrayOfByte;
        if (!paramArrayOfByte.equals("")) {}
      }
      else
      {
        com.tencent.mm.model.au.HU();
        localObject3 = com.tencent.mm.model.c.FS().Hh((String)localObject1);
        paramab2 = paramArrayOfByte;
        if (localObject3 != null) {
          paramab2 = ((bq)localObject3).field_conPhone;
        }
      }
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BigBallContactAssemblerImpl", "username:%s, oldPhoneList %s", new Object[] { paramab1.field_username, bi.oV(paramab2) });
      int i;
      if (!bi.oW(paramab2))
      {
        paramab2 = paramab2.split(",");
        int i2 = paramab2.length;
        int k = 0;
        i = 0;
        while (k < i2)
        {
          paramArrayOfByte = paramab2[k];
          int n = i;
          int i1 = m;
          if (!bi.oW(((StringBuffer)localObject2).toString()))
          {
            localObject3 = ((StringBuffer)localObject2).toString().split(",");
            i1 = localObject3.length;
            n = 0;
            while (n < i1) {
              if (!paramArrayOfByte.equals(localObject3[n]))
              {
                i = 1;
                n += 1;
              }
              else
              {
                i = 0;
              }
            }
            n = i;
            i1 = m;
            if (i != 0)
            {
              ((StringBuffer)localObject2).append(paramArrayOfByte);
              i1 = 1;
              n = i;
            }
          }
          k += 1;
          i = n;
          m = i1;
        }
        if (m != 0)
        {
          paramab2 = new aur();
          paramab2.rXy = paramab1.field_username;
          paramArrayOfByte = new bas();
          if (!bi.oW(((StringBuffer)localObject2).toString()))
          {
            localObject3 = ((StringBuffer)localObject2).toString().split(",");
            paramArrayOfByte.hbF = localObject3.length;
            paramArrayOfByte.sdd = new LinkedList();
            k = localObject3.length;
            i = 0;
            while (i < k)
            {
              String str2 = localObject3[i];
              bar localbar = new bar();
              localbar.sdc = str2;
              paramArrayOfByte.sdd.add(localbar);
              i += 1;
            }
            paramab2.rXu = paramArrayOfByte;
            com.tencent.mm.model.au.HU();
            com.tencent.mm.model.c.FQ().b(new h.a(60, paramab2));
          }
        }
        if ((j != 0) && (15 == paramaue.rdq) && (!bi.oW(paramab1.field_username)))
        {
          paramab2 = com.tencent.mm.plugin.account.b.getAddrUploadStg().pp(paramab1.field_username);
          if (paramab2 != null)
          {
            paramArrayOfByte = com.tencent.mm.plugin.report.service.h.mEJ;
            localObject3 = paramab1.field_username;
            if (!bi.oW(paramab2.Xh())) {
              break label1143;
            }
            i = 0;
            if (((StringBuffer)localObject2).toString().split(",").length < 5) {
              break label1149;
            }
            j = 5;
            paramArrayOfByte.h(12040, new Object[] { localObject3, Integer.valueOf(3), Integer.valueOf(i), Integer.valueOf(j) });
          }
        }
      }
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BigBallContactAssemblerImpl", "username:%s, phoneList %s", new Object[] { paramab1.field_username, ((StringBuffer)localObject2).toString() });
      paramab2 = ((StringBuffer)localObject2).toString();
      if (!bi.oW(paramab2))
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BigBallContactAssemblerImpl", paramab2);
        paramab1.dZ(paramab2);
      }
      if ((!s.fq(str1)) && (paramaue.rGM != null)) {
        m.a(str1, paramaue.rGM);
      }
      boolean bool1 = false;
      com.tencent.mm.model.au.HU();
      paramArrayOfByte = com.tencent.mm.model.c.FS().Hh(paramab1.field_username);
      if (!bi.oW(paramab1.field_conRemark)) {
        if ((paramArrayOfByte != null) && (!bi.oW(paramab1.csT)) && (!paramab1.csT.equals(paramArrayOfByte.field_conDescription))) {
          a(paramab1, paramArrayOfByte);
        }
      }
      for (bool1 = false;; bool1 = paramBoolean)
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BigBallContactAssemblerImpl", "username:%s needModContact %s encryptUser:%s", new Object[] { paramab1.field_username, Boolean.valueOf(bool1), localObject1 });
        if (bool1) {
          s.u(paramab1);
        }
        paramab2 = null;
        com.tencent.mm.model.au.HU();
        paramArrayOfByte = com.tencent.mm.model.c.FS().Hh(paramab1.field_encryptUsername);
        if (paramArrayOfByte != null) {
          paramab2 = paramArrayOfByte.field_contactLabels;
        }
        paramaue = paramab2;
        if (bi.oW(paramab2))
        {
          com.tencent.mm.model.au.HU();
          localObject1 = com.tencent.mm.model.c.FS().Hh(paramab1.field_username);
          paramaue = paramab2;
          paramArrayOfByte = (byte[])localObject1;
          if (localObject1 != null)
          {
            paramaue = ((bq)localObject1).field_contactLabels;
            paramArrayOfByte = (byte[])localObject1;
          }
        }
        if (!bi.oW(paramaue))
        {
          com.tencent.mm.plugin.label.a.a.aYK().dw(paramab1.field_username, paramaue);
          paramArrayOfByte.field_contactLabels = "";
          com.tencent.mm.model.au.HU();
          com.tencent.mm.model.c.FS().a(paramArrayOfByte);
        }
        return;
        i = 1;
        break;
        j = ((StringBuffer)localObject2).toString().split(",").length;
        break label792;
        if (paramArrayOfByte != null)
        {
          paramab2 = paramArrayOfByte;
          if (!bi.oW(paramArrayOfByte.field_encryptUsername)) {}
        }
        else
        {
          paramab2 = paramArrayOfByte;
          if (!bi.oW((String)localObject1))
          {
            com.tencent.mm.model.au.HU();
            paramab2 = com.tencent.mm.model.c.FS().Hh((String)localObject1);
          }
        }
        paramBoolean = bool1;
        if (paramab2 != null)
        {
          paramBoolean = bool1;
          if (!bi.oW(paramab2.field_encryptUsername))
          {
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BigBallContactAssemblerImpl", "mod stranger remark : " + paramab2.field_encryptUsername);
            paramab1.dv(paramab2.field_conRemark);
            paramab1.dB(com.tencent.mm.platformtools.h.oI(paramab2.field_conRemark));
            paramab1.dC(com.tencent.mm.platformtools.h.oJ(paramab2.field_conRemark));
            paramBoolean = a(paramab1, paramab2);
          }
        }
        switch (paramab1.getSource())
        {
        }
      }
      paramab2 = null;
      if ((paramaue != null) && (!bi.oW(paramaue.rXm)))
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BigBallContactAssemblerImpl", "MobileHash[%s],MobileFullHash[%s]", new Object[] { paramaue.rXm, paramaue.rXn });
        paramArrayOfByte = com.tencent.mm.plugin.account.b.getAddrUploadStg();
        paramab2 = paramaue.rXm;
        str1 = paramaue.rXn;
        paramaue = paramArrayOfByte.pq(paramab2);
        paramab2 = paramaue;
        if (paramaue == null) {
          paramab2 = paramArrayOfByte.pq(str1);
        }
        if (paramab2 != null) {
          break label1639;
        }
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BigBallContactAssemblerImpl", "dealWithRemark-> addr == null");
      }
      for (;;)
      {
        bool1 = paramBoolean;
        if (paramab2 == null) {
          break;
        }
        bool1 = paramBoolean;
        if (bi.oW(paramab2.Xj())) {
          break;
        }
        bool1 = paramBoolean;
        if (!paramab2.Xs()) {
          break;
        }
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BigBallContactAssemblerImpl", "remarkName RealName[%s], User[%s], remarkChange[%s]", new Object[] { paramab2.Xj(), paramab2.getUsername(), Boolean.valueOf(paramBoolean) });
        paramab2.username = paramab1.field_username;
        paramab2.status = 2;
        paramab2.Xr();
        boolean bool2 = paramBoolean;
        if (!paramBoolean)
        {
          paramab1.dv(paramab2.Xj());
          paramab1.dB(com.tencent.mm.platformtools.h.oI(paramab2.Xj()));
          paramab1.dC(com.tencent.mm.platformtools.h.oJ(paramab2.Xj()));
          bool2 = true;
        }
        bool1 = bool2;
        if (!com.tencent.mm.l.a.gd(paramab1.field_type)) {
          break;
        }
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BigBallContactAssemblerImpl", "updateAddrUp RealName[%s], User[%s], remarkChange[%s]", new Object[] { paramab2.Xj(), paramab2.getUsername(), Boolean.valueOf(bool2) });
        com.tencent.mm.plugin.account.b.getAddrUploadStg().a(paramab2.Xh(), paramab2);
        bool1 = bool2;
        break;
        if (bi.oW((String)localObject1)) {
          break label1414;
        }
        paramab2 = com.tencent.mm.plugin.account.b.getAddrUploadStg().pp((String)localObject1);
        break label1414;
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BigBallContactAssemblerImpl", "remarkName RealName[%s], User[%s], needSetRemark[%s]", new Object[] { bi.oV(paramab2.Xj()), bi.oV(paramab2.getUsername()), Boolean.valueOf(paramab2.Xs()) });
      }
    }
  }
  
  public final void b(com.tencent.mm.storage.ab paramab1, com.tencent.mm.storage.ab paramab2, aue paramaue, byte[] paramArrayOfByte, boolean paramBoolean)
  {
    paramArrayOfByte = paramab1.field_username;
    Object localObject2 = paramab1.field_encryptUsername;
    Object localObject1;
    Object localObject3;
    label132:
    label209:
    label240:
    Object localObject4;
    int j;
    if (s.fq(paramArrayOfByte))
    {
      if (paramaue.rGM != null)
      {
        localObject1 = paramaue.rGM.rqV;
        if (com.tencent.mm.ay.d.eli != null) {
          break label1655;
        }
        i = 0;
        if (i == 0)
        {
          localObject1 = paramaue.rGM.rqV;
          localObject3 = new rn();
          ((rn)localObject3).ccn.ccp = true;
          com.tencent.mm.sdk.b.a.sFg.m((com.tencent.mm.sdk.b.b)localObject3);
          if ((!bi.oW(paramArrayOfByte)) && (s.fq(paramArrayOfByte)) && (!bi.oW(((rn)localObject3).cco.ccr)) && (paramArrayOfByte.equals(((rn)localObject3).cco.ccr))) {
            break label1925;
          }
        }
        localObject1 = paramaue.rGM.rqV;
        if ((o.a.qyi != null) && (localObject1 != null))
        {
          localObject1 = ((LinkedList)localObject1).iterator();
          do
          {
            if (!((Iterator)localObject1).hasNext()) {
              break;
            }
            localObject3 = (my)((Iterator)localObject1).next();
          } while ((bi.oW(((my)localObject3).hbL)) || (!((my)localObject3).hbL.equals(com.tencent.mm.model.q.GF())));
        }
        i = 0;
        if ((i != 0) && (o.a.qyi != null)) {
          o.a.qyi.HB(paramArrayOfByte);
        }
      }
      if (paramaue.rGM != null) {
        break label2074;
      }
      i = 0;
      localObject1 = paramaue.rXh;
      localObject3 = paramaue.rXg;
      int k = paramaue.rXr;
      int m = paramaue.rXq;
      localObject4 = paramaue.jTB;
      int n = paramaue.rXp;
      if (paramaue.rGM != null) {
        break label2086;
      }
      j = -1;
      label286:
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BigBallContactAssemblerImpl", "processModContact chatroom:%s count:%d ChatRoomData:%s owner:%s type:%d max:%d upgrader:%s ver:%d infomask:%d ", new Object[] { paramArrayOfByte, Integer.valueOf(i), localObject1, localObject3, Integer.valueOf(k), Integer.valueOf(m), localObject4, Integer.valueOf(n), Integer.valueOf(j) });
      if ((paramaue.rGM != null) && (paramaue.rGM.hLg != 0))
      {
        localObject1 = new com.tencent.mm.i.a.a.a();
        ((com.tencent.mm.i.a.a.a)localObject1).type = paramaue.rXr;
        ((com.tencent.mm.i.a.a.a)localObject1).daw = paramaue.rXq;
        ((com.tencent.mm.i.a.a.a)localObject1).dax = paramaue.jTB;
        ((com.tencent.mm.i.a.a.a)localObject1).daz = paramaue.rXp;
        if (paramaue.rGM.rqW == 0) {
          ((com.tencent.mm.i.a.a.a)localObject1).bUd = paramaue.rXp;
        }
        if (m.F(paramArrayOfByte, paramaue.rXp))
        {
          localObject3 = new ha();
          com.tencent.mm.sdk.b.a.sFg.m((com.tencent.mm.sdk.b.b)localObject3);
          m.G(paramArrayOfByte, paramaue.rXr);
        }
        localObject3 = new jy();
        ((jy)localObject3).bUc.chatroomName = paramArrayOfByte;
        ((jy)localObject3).bUc.bUd = ((com.tencent.mm.i.a.a.a)localObject1).bUd;
        m.a(paramArrayOfByte, paramaue.rXg, paramaue.rGM, com.tencent.mm.model.q.GF(), (com.tencent.mm.i.a.a.a)localObject1, (com.tencent.mm.sdk.b.b)localObject3);
      }
    }
    if ((!com.tencent.mm.l.a.gd(paramab1.field_type)) && (!paramab1.By()) && (!com.tencent.mm.storage.ab.gY(paramab1.field_username)) && (!s.fq(paramab1.field_username)))
    {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.BigBallContactAssemblerImpl", "processModContact delChatContact now user:%s ,type:%d", new Object[] { paramab1.field_username, Integer.valueOf(paramab1.field_type) });
      com.tencent.mm.model.au.HU();
      com.tencent.mm.model.c.FW().Yp(paramab1.field_username);
    }
    if ((paramab1.field_type & 0x800) != 0) {
      if ((paramab2 == null) || ((paramab2.field_type & 0x800) != (paramab1.field_type & 0x800)))
      {
        if ((com.tencent.mm.ac.f.kL(paramab1.field_username)) && (!com.tencent.mm.ac.f.eZ(paramab1.field_username))) {
          A(paramab1);
        }
      }
      else {
        label675:
        if ((paramab2 == null) || (com.tencent.mm.l.a.gd(paramab2.field_type)) || (!com.tencent.mm.l.a.gd(paramab1.field_type))) {
          break label2530;
        }
      }
    }
    label870:
    label930:
    label1041:
    label1655:
    label1925:
    label1987:
    label2074:
    label2086:
    label2334:
    label2473:
    label2523:
    label2530:
    for (int i = 1;; i = 0)
    {
      if (com.tencent.mm.l.a.gd(paramab1.field_type))
      {
        com.tencent.mm.model.au.HU();
        localObject1 = com.tencent.mm.model.c.FS().Hh(paramArrayOfByte);
        if (localObject1 != null)
        {
          paramArrayOfByte = (byte[])localObject1;
          if (!bi.oW(((bq)localObject1).field_encryptUsername)) {}
        }
        else
        {
          paramArrayOfByte = (byte[])localObject1;
          if (!bi.oW((String)localObject2))
          {
            com.tencent.mm.model.au.HU();
            paramArrayOfByte = com.tencent.mm.model.c.FS().Hh((String)localObject2);
          }
        }
        if ((paramArrayOfByte != null) && (!bi.oW(paramArrayOfByte.field_encryptUsername)))
        {
          com.tencent.mm.model.au.HU();
          com.tencent.mm.model.c.FS().Hi(paramArrayOfByte.field_encryptUsername);
        }
      }
      if (com.tencent.mm.ac.f.kK(paramab1.field_username))
      {
        z.Nh();
        com.tencent.mm.ac.c.a(paramab1.field_username, null);
        if ((i != 0) && (com.tencent.mm.ac.f.kL(paramab1.field_username)))
        {
          if (!com.tencent.mm.ac.f.eZ(paramab1.field_username)) {
            break label2334;
          }
          z.Ng();
          com.tencent.mm.ac.a.h.a(paramab1.field_username, null);
        }
      }
      paramArrayOfByte = com.tencent.mm.ac.f.kH(paramab1.field_username);
      if (paramArrayOfByte != null)
      {
        paramArrayOfByte = paramArrayOfByte.bG(false);
        if (paramArrayOfByte != null)
        {
          j = 0;
          if (paramArrayOfByte.dKT != null) {
            j = paramArrayOfByte.dKT.optInt("WXAppType", 0);
          }
          if (j != 0)
          {
            j = 1;
            if (j != 0)
            {
              z.Nk();
              paramArrayOfByte = paramab1.field_username;
              if (!bi.oW(paramArrayOfByte))
              {
                paramArrayOfByte = z.MY().kA(paramArrayOfByte);
                paramArrayOfByte.field_attrSyncVersion = null;
                paramArrayOfByte.field_incrementUpdateTime = 0L;
                z.MY().e(paramArrayOfByte);
              }
            }
            if ((paramab1.field_type & 0x8) == 0) {
              break label2473;
            }
            if ((paramab2 == null) || ((paramab2.field_type & 0x8) != (paramab1.field_type & 0x8)))
            {
              com.tencent.mm.model.au.HU();
              com.tencent.mm.model.c.FW().d(new String[] { paramab1.field_username }, "@blacklist");
            }
            if (!paramBoolean)
            {
              if ((paramab1 != null) && (paramab1.ckW()) && (com.tencent.mm.l.a.gd(paramab1.field_type)))
              {
                long l = System.currentTimeMillis();
                com.tencent.mm.model.au.HU();
                paramArrayOfByte = com.tencent.mm.model.c.FW().Yq(paramab1.field_username);
                if ((paramArrayOfByte != null) && (paramArrayOfByte.gh(4194304)))
                {
                  com.tencent.mm.model.au.HU();
                  paramBoolean = com.tencent.mm.model.c.FW().a(paramab1.field_username, 4194304, false, paramArrayOfByte.field_attrflag);
                  com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BigBallContactAssemblerImpl", "Reset temp session attr flag.(talker %s, updateSucc %s, cost %s)", new Object[] { paramab1.field_username, Boolean.valueOf(paramBoolean), Long.valueOf(System.currentTimeMillis() - l) });
                }
              }
              if ((paramab2 != null) && ((int)paramab2.dhP > 0) && (paramab2.csR != 0) && (paramab2.csS == 0) && (paramab1.csS == 1))
              {
                com.tencent.mm.sdk.platformtools.x.d("MicroMsg.BigBallContactAssemblerImpl", "hakon removeParentRefAndUnread user = %s", new Object[] { paramab1.field_username });
                com.tencent.mm.model.au.HU();
                com.tencent.mm.model.c.FW().YG(paramab1.field_username);
                com.tencent.mm.model.au.HU();
                paramab2 = com.tencent.mm.model.c.FW().Yq("officialaccounts");
                if (paramab2 != null)
                {
                  com.tencent.mm.model.au.HU();
                  paramab2.eV(com.tencent.mm.model.c.FW().clH());
                  com.tencent.mm.sdk.platformtools.x.d("MicroMsg.BigBallContactAssemblerImpl", "unread count is %d", new Object[] { Integer.valueOf(paramab2.field_unReadCount) });
                  com.tencent.mm.model.au.HU();
                  paramArrayOfByte = com.tencent.mm.model.c.FW().YD("officialaccounts");
                  com.tencent.mm.model.au.HU();
                  paramArrayOfByte = com.tencent.mm.model.c.FT().GE(paramArrayOfByte);
                  if ((paramArrayOfByte == null) || (paramArrayOfByte.field_msgId <= 0L)) {
                    break label2523;
                  }
                  paramab2.aj(paramArrayOfByte);
                  paramab2.setContent(paramArrayOfByte.field_talker + ":" + paramArrayOfByte.field_content);
                  paramab2.ec(Integer.toString(paramArrayOfByte.getType()));
                  com.tencent.mm.model.au.HU();
                  localObject1 = com.tencent.mm.model.c.FW().vu();
                  if (localObject1 != null)
                  {
                    localObject2 = new PString();
                    localObject3 = new PString();
                    localObject4 = new PInt();
                    paramArrayOfByte.ep("officialaccounts");
                    paramArrayOfByte.setContent(paramab2.field_content);
                    ((az.b)localObject1).a(paramArrayOfByte, (PString)localObject2, (PString)localObject3, (PInt)localObject4, true);
                    paramab2.ed(((PString)localObject2).value);
                    paramab2.ee(((PString)localObject3).value);
                    paramab2.eY(((PInt)localObject4).value);
                  }
                }
              }
            }
          }
        }
      }
      for (;;)
      {
        com.tencent.mm.model.au.HU();
        com.tencent.mm.model.c.FW().a(paramab2, paramab2.field_username);
        if (i != 0)
        {
          paramab2 = new jn();
          paramab2.bTh.username = paramab1.field_username;
          paramab2.bTh.bTi = paramab1.bTi;
          com.tencent.mm.sdk.b.a.sFg.m(paramab2);
        }
        if ((i != 0) && (paramaue.rdq == 18))
        {
          paramab2 = new it();
          paramab2.bSl.bSm = paramab1.field_encryptUsername;
          paramab2.bSl.type = 2;
          com.tencent.mm.az.d.SG().YQ(paramab2.bSl.bSm);
          com.tencent.mm.sdk.b.a.sFg.m(paramab2);
        }
        if (i != 0) {
          aU(paramab1.field_username, paramaue.rdq);
        }
        com.tencent.mm.plugin.label.a.a.aYK().aYE();
        return;
        localObject3 = com.tencent.mm.ay.d.eli.SD();
        if ((bi.oW((String)localObject3)) || (!((String)localObject3).equals(paramArrayOfByte)) || (!s.fq(paramArrayOfByte)))
        {
          i = 0;
          break;
        }
        if (localObject1 != null)
        {
          localObject1 = ((LinkedList)localObject1).iterator();
          for (;;)
          {
            if (((Iterator)localObject1).hasNext())
            {
              localObject3 = (my)((Iterator)localObject1).next();
              if ((!bi.oW(((my)localObject3).hbL)) && (((my)localObject3).hbL.equals(com.tencent.mm.model.q.GF())))
              {
                i = 0;
                break;
              }
            }
          }
        }
        if (com.tencent.mm.ay.d.elh != null)
        {
          if (com.tencent.mm.ay.d.elh.az(paramArrayOfByte, com.tencent.mm.model.q.GF()))
          {
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BigBallContactAssemblerImpl", "kicked self shareing");
            localObject1 = new rs();
            ((rs)localObject1).ccD.userName = paramArrayOfByte;
            com.tencent.mm.sdk.b.a.sFg.m((com.tencent.mm.sdk.b.b)localObject1);
          }
          com.tencent.mm.ay.d.elh.a(paramArrayOfByte, null, 0.0D, 0.0D, "", "", "");
        }
        if ((com.tencent.mm.ay.d.eli != null) && (!bi.oW(com.tencent.mm.ay.d.elh.SC())))
        {
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BigBallContactAssemblerImpl", "sync remove chatroom end track %s", new Object[] { com.tencent.mm.ay.d.eli.SD() });
          localObject1 = new er();
          ((er)localObject1).bMv.username = com.tencent.mm.ay.d.eli.SD();
          com.tencent.mm.sdk.b.a.sFg.m((com.tencent.mm.sdk.b.b)localObject1);
        }
        i = 1;
        break;
        if (localObject1 != null)
        {
          localObject1 = ((LinkedList)localObject1).iterator();
          for (;;)
          {
            if (!((Iterator)localObject1).hasNext()) {
              break label1987;
            }
            localObject3 = (my)((Iterator)localObject1).next();
            if (!bi.oW(((my)localObject3).hbL)) {
              if (((my)localObject3).hbL.equals(com.tencent.mm.model.q.GF())) {
                break;
              }
            }
          }
        }
        if (com.tencent.mm.ax.g.elf != null) {
          com.tencent.mm.ax.g.elf.a(paramArrayOfByte, null, "", "", 0);
        }
        localObject1 = new rn();
        ((rn)localObject1).ccn.ccq = true;
        com.tencent.mm.sdk.b.a.sFg.m((com.tencent.mm.sdk.b.b)localObject1);
        localObject1 = new rm();
        ((rm)localObject1).ccl.ccm = true;
        com.tencent.mm.sdk.b.a.sFg.m((com.tencent.mm.sdk.b.b)localObject1);
        break label132;
        i = 1;
        break label209;
        i = paramaue.rGM.hLg;
        break label240;
        j = paramaue.rGM.rqW;
        break label286;
        if ((!paramab1.ckW()) || (!com.tencent.mm.ac.f.kJ(paramab1.field_username)) || (paramab1 == null) || (!paramab1.ckW()) || (!com.tencent.mm.ac.f.kJ(paramab1.field_username))) {
          break label675;
        }
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BigBallContactAssemblerImpl", "dealPlaceSubscribeBizToTop uct : " + paramab1.field_username);
        com.tencent.mm.model.au.HU();
        localObject1 = com.tencent.mm.model.c.FW().Yq(paramab1.field_username);
        z.MY().kA(paramab1.field_username);
        if (localObject1 != null) {
          break label675;
        }
        com.tencent.mm.model.au.HU();
        if (com.tencent.mm.model.c.FW().Yq("officialaccounts") == null)
        {
          localObject1 = new com.tencent.mm.storage.ai("officialaccounts");
          ((com.tencent.mm.storage.ai)localObject1).clx();
          com.tencent.mm.model.au.HU();
          com.tencent.mm.model.c.FW().d((com.tencent.mm.storage.ai)localObject1);
        }
        localObject1 = new com.tencent.mm.storage.ai(paramab1.field_username);
        ((com.tencent.mm.storage.ai)localObject1).ef("officialaccounts");
        com.tencent.mm.model.au.HU();
        com.tencent.mm.model.c.FW().d((com.tencent.mm.storage.ai)localObject1);
        break label675;
        if (((paramab2 != null) && ((paramab2.field_type & 0x800) == (paramab1.field_type & 0x800))) || (!com.tencent.mm.ac.f.kL(paramab1.field_username)) || (com.tencent.mm.ac.f.eZ(paramab1.field_username))) {
          break label675;
        }
        A(paramab1);
        break label675;
        if (!com.tencent.mm.ac.f.kO(paramab1.field_username)) {
          break label870;
        }
        com.tencent.mm.model.au.HU();
        if (com.tencent.mm.model.c.FW().Yq(paramab1.field_username) != null) {
          break label870;
        }
        paramArrayOfByte = z.MY().kA(paramab1.field_username);
        localObject1 = new com.tencent.mm.storage.ai(paramab1.field_username);
        if (!paramArrayOfByte.Ma())
        {
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BigBallContactAssemblerImpl", "Enterprise belong %s, userName: %s", new Object[] { paramArrayOfByte.Mg(), paramab1.field_username });
          ((com.tencent.mm.storage.ai)localObject1).ef(bi.oV(paramArrayOfByte.Mg()));
        }
        for (;;)
        {
          ((com.tencent.mm.storage.ai)localObject1).clx();
          com.tencent.mm.model.au.HU();
          com.tencent.mm.model.c.FW().d((com.tencent.mm.storage.ai)localObject1);
          break;
          ((com.tencent.mm.storage.ai)localObject1).ef(null);
        }
        j = 0;
        break label930;
        if ((paramab2 != null) && ((paramab2.field_type & 0x8) == (paramab1.field_type & 0x8))) {
          break label1041;
        }
        com.tencent.mm.model.au.HU();
        com.tencent.mm.model.c.FW().d(new String[] { paramab1.field_username }, "");
        break label1041;
        paramab2.clx();
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/bbom/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */