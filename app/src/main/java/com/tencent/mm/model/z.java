package com.tencent.mm.model;

import com.tencent.mm.a.o;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.platformtools.ab;
import com.tencent.mm.plugin.report.f;
import com.tencent.mm.protocal.c.ar;
import com.tencent.mm.protocal.c.avt;
import com.tencent.mm.protocal.c.bhy;
import com.tencent.mm.protocal.c.bup;
import com.tencent.mm.protocal.c.cco;
import com.tencent.mm.protocal.c.ec;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.storage.bn;
import com.tencent.mm.storage.w;

public final class z
{
  public static void a(bup parambup, boolean paramBoolean)
  {
    int j = parambup.srM;
    int i;
    label91:
    com.tencent.mm.storage.x localx;
    Object localObject1;
    long l;
    label239:
    label251:
    label659:
    boolean bool;
    String str1;
    String str2;
    int k;
    Object localObject2;
    if (parambup.srN == null)
    {
      i = -1;
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.HandleAuthResponse", "summerauth updateProfile succ update:%d unifyFlag:%d, auth:%s, acct:%s, network:%s autoauth:%b", new Object[] { Integer.valueOf(i), Integer.valueOf(j), parambup.srN, parambup.srO, parambup.srP, Boolean.valueOf(paramBoolean) });
      i = 0;
      if (((j & 0x1) == 0) || (parambup.srN == null)) {
        break label1232;
      }
      i = parambup.srN.iwE;
      g.Ek();
      g.gJ(i);
      localx = g.Ei().DT();
      localx.set(256, Boolean.valueOf(false));
      if ((j & 0x1) != 0)
      {
        if (parambup.srN.reG <= 0) {
          break label1295;
        }
        localx.a(aa.a.sOv, Long.valueOf(parambup.srN.reG));
        localx.a(aa.a.sOx, Long.valueOf(bi.VE()));
        localx.a(aa.a.sOw, Long.valueOf(com.tencent.mm.protocal.d.qVN));
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.HandleAuthResponse", "summerauth updateProfile need update flag[%d], autoauth[%b]", new Object[] { Integer.valueOf(parambup.srN.reG), Boolean.valueOf(paramBoolean) });
        if (!paramBoolean) {
          break label1251;
        }
        localObject1 = f.mDy;
        if (parambup.srN.reG != 2) {
          break label1243;
        }
        l = 19L;
        ((f)localObject1).a(148L, l, 1L, true);
      }
      if ((j & 0x2) == 0) {
        break label1343;
      }
      localObject1 = parambup.srO;
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.HandleAuthResponse", "summerauth updateProfile acctsect BindUin:%s, Status:%d, UserName:%s, NickName:%s, BindEmail:%s, BindMobile:%s, Alias:%s, PluginFlag:%d, RegType:%d, DeviceInfoXml:%s, SafeDevice:%d, OfficialUserName:%s, OfficialUserName:%s PushMailStatus:%d, FSURL:%s", new Object[] { o.getString(((ar)localObject1).ray), Integer.valueOf(((ar)localObject1).hcd), ((ar)localObject1).hbL, ((ar)localObject1).hcS, ((ar)localObject1).raz, ((ar)localObject1).raA, ((ar)localObject1).eJM, Integer.valueOf(((ar)localObject1).raB), Integer.valueOf(((ar)localObject1).raC), ((ar)localObject1).raD, Integer.valueOf(((ar)localObject1).raE), ((ar)localObject1).raF, ((ar)localObject1).raF, Integer.valueOf(((ar)localObject1).raH), ((ar)localObject1).raI });
      if (!paramBoolean) {
        localx.set(52, Integer.valueOf(((ar)localObject1).raC));
      }
      localx.set(9, Integer.valueOf(((ar)localObject1).ray));
      localx.set(7, Integer.valueOf(((ar)localObject1).hcd));
      localx.set(2, ((ar)localObject1).hbL);
      localx.set(4, ((ar)localObject1).hcS);
      localx.set(5, ((ar)localObject1).raz);
      localx.set(6, ((ar)localObject1).raA);
      localx.set(42, ((ar)localObject1).eJM);
      localx.set(34, Integer.valueOf(((ar)localObject1).raB));
      g.Ei().DU().Zm(((ar)localObject1).raD);
      localx.set(64, Integer.valueOf(((ar)localObject1).raE));
      localx.set(21, ((ar)localObject1).raF);
      localx.set(22, ((ar)localObject1).raF);
      localx.set(17, Integer.valueOf(((ar)localObject1).raH));
      at.dBv.T("login_weixin_username", ((ar)localObject1).hbL);
      at.dBv.T("last_login_nick_name", ((ar)localObject1).hcS);
      at.dBv.c(((ar)localObject1).raA, ((ar)localObject1).ray, ((ar)localObject1).raz);
      bool = false;
      if ((j & 0x1) == 0) {
        break label1491;
      }
      localObject1 = parambup.srN;
      str1 = ((ec)localObject1).reA;
      str2 = bi.bE(ab.a(((ec)localObject1).reB));
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.HandleAuthResponse", "summerauth updateProfile AuthTicket:%s, NewVersion:%d, UpdateFlag:%d, AuthResultFlag:%d, authKey:%s a2Key:%s fsurl:%s", new Object[] { ((ec)localObject1).reE, Integer.valueOf(((ec)localObject1).reF), Integer.valueOf(((ec)localObject1).reG), Integer.valueOf(((ec)localObject1).reH), bi.Xf(str1), bi.Xf(str2), ((ec)localObject1).raI });
      k = ((ec)localObject1).reu;
      localObject2 = new o(bi.f((Integer)localx.get(9, Integer.valueOf(0))));
      if (((ec)localObject1).rev != null) {
        break label1354;
      }
      i = -1;
      label815:
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.HandleAuthResponse", "summerauth updateProfile wtBuffFlag:%d, bindQQ:%s buff len:%d", new Object[] { Integer.valueOf(k), localObject2, Integer.valueOf(i) });
      if (k == 0) {
        break label1485;
      }
      if (k != 1) {
        break label1366;
      }
      f.mDy.a(148L, 20L, 1L, false);
      byte[] arrayOfByte = ab.a(((ec)localObject1).rev);
      bool = g.Eg().Dp().a(((o)localObject2).longValue(), arrayOfByte);
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.HandleAuthResponse", "WTLoginRspBuff len %s", new Object[] { Integer.valueOf(arrayOfByte.length) });
      localObject2 = bi.bE(g.Eg().Dp().bb(((o)localObject2).longValue()));
      localx.set(-1535680990, str1);
      localx.set(46, str2);
      localx.set(72, localObject2);
      localx.set(29, ((ec)localObject1).raI);
      label980:
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.HandleAuthResponse", "wtBuffFlag %s", new Object[] { Integer.valueOf(k) });
      if (((ec)localObject1).rew != null)
      {
        localObject1 = bi.bE(ab.a(((ec)localObject1).rew.rhZ));
        if ((localObject1 != null) && (((String)localObject1).length() > 0))
        {
          localx.set(47, localObject1);
          g.Ei().dqk.set(18, localObject1);
        }
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.HandleAuthResponse", "updateProfile ksid:%s", new Object[] { bi.Xf((String)localObject1) });
      }
      label1079:
      if ((j & 0x4) == 0) {
        break label1516;
      }
      f.mDy.a(148L, 23L, 1L, false);
      parambup = parambup.srP;
      av.a(false, parambup.rhK, parambup.rhL, parambup.rhJ);
    }
    for (;;)
    {
      if (paramBoolean)
      {
        i = 4;
        parambup = q.GF();
        if (bool)
        {
          i = 1;
          parambup = q.GE();
        }
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.HandleAuthResponse", "loginType %s", new Object[] { Integer.valueOf(i) });
        com.tencent.mm.plugin.report.b.d.n(1, i, parambup);
      }
      localx.set(3, "");
      localx.set(19, "");
      localx.lm(true);
      g.Ei().dqk.setInt(46, 0);
      a.FK();
      return;
      i = parambup.srN.reG;
      break;
      label1232:
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.HandleAuthResponse", "summerauth updateProfile authsect not set and new uin is 0!");
      break label91;
      label1243:
      l = 41L;
      break label239;
      label1251:
      localObject1 = f.mDy;
      if (parambup.srN.reG == 2) {}
      for (l = 10L;; l = 11L)
      {
        ((f)localObject1).a(148L, l, 1L, true);
        break;
      }
      label1295:
      localx.a(aa.a.sOv, Long.valueOf(parambup.srN.reG));
      localx.a(aa.a.sOx, Long.valueOf(bi.VE()));
      localx.a(aa.a.sOw, Long.valueOf(0L));
      break label251;
      label1343:
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.HandleAuthResponse", "summerauth updateProfile acctsect not set!");
      break label659;
      label1354:
      i = ((ec)localObject1).rev.siI;
      break label815;
      label1366:
      if (k == 2)
      {
        f.mDy.a(148L, 21L, 1L, false);
        g.Eg().Dp().bc(((o)localObject2).longValue());
        localObject2 = bi.bE(g.Eg().Dp().bb(((o)localObject2).longValue()));
        localx.set(-1535680990, str1);
        localx.set(46, str2);
        localx.set(72, localObject2);
        localx.set(29, ((ec)localObject1).raI);
        bool = false;
        break label980;
      }
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.HandleAuthResponse", "summerauth undefined wrBuffFlag[%d]", new Object[] { Integer.valueOf(k) });
      label1485:
      bool = false;
      break label980;
      label1491:
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.HandleAuthResponse", "summerauth updateProfile authsect not set!");
      f.mDy.a(148L, 22L, 1L, false);
      break label1079;
      label1516:
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.HandleAuthResponse", "summerauth updateProfile networksect not set!");
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/model/z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */