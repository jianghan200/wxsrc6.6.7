package com.tencent.mm.model;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.mm.ab.j;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.ab;
import com.tencent.mm.plugin.report.f;
import com.tencent.mm.pointers.PByteArray;
import com.tencent.mm.protocal.MMProtocalJni;
import com.tencent.mm.protocal.c.ams;
import com.tencent.mm.protocal.c.amt;
import com.tencent.mm.protocal.c.ar;
import com.tencent.mm.protocal.c.asq;
import com.tencent.mm.protocal.c.ass;
import com.tencent.mm.protocal.c.avs;
import com.tencent.mm.protocal.c.avt;
import com.tencent.mm.protocal.c.bhy;
import com.tencent.mm.protocal.c.bup;
import com.tencent.mm.protocal.c.ccn;
import com.tencent.mm.protocal.c.cge;
import com.tencent.mm.protocal.c.ec;
import com.tencent.mm.protocal.c.el;
import com.tencent.mm.protocal.c.em;
import com.tencent.mm.protocal.c.eo;
import com.tencent.mm.protocal.c.fi;
import com.tencent.mm.protocal.c.iy;
import com.tencent.mm.protocal.c.iz;
import com.tencent.mm.protocal.c.sx;
import com.tencent.mm.protocal.d;
import com.tencent.mm.protocal.i.a;
import com.tencent.mm.protocal.i.b;
import com.tencent.mm.protocal.i.c;
import com.tencent.mm.protocal.i.d;
import com.tencent.mm.protocal.i.e;
import com.tencent.mm.protocal.i.f;
import com.tencent.mm.protocal.i.g;
import com.tencent.mm.protocal.k.d;
import com.tencent.mm.protocal.k.e;
import com.tencent.mm.protocal.n;
import com.tencent.mm.protocal.n.a;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.w;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import junit.framework.Assert;

public final class av
  extends j
  implements i.c
{
  private static a dBP = null;
  private final int dBM;
  private final i.f dBN;
  private final i.g dBO;
  
  public av(int paramInt)
  {
    if ((paramInt == 702) || (paramInt == 701)) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(bool);
      this.dBM = paramInt;
      if (paramInt != 702) {
        break;
      }
      this.dBN = new i.a();
      this.dBO = new i.b();
      return;
    }
    this.dBN = new i.d();
    this.dBO = new i.e();
  }
  
  public static SharedPreferences Ib()
  {
    return aw.Ib();
  }
  
  public static void a(a parama)
  {
    dBP = parama;
  }
  
  public static void a(boolean paramBoolean, iz paramiz, avs paramavs, amt paramamt)
  {
    int i;
    int j;
    label14:
    int k;
    label21:
    int m;
    label28:
    int n;
    label35:
    int i1;
    if (paramiz == null)
    {
      i = -1;
      if (paramiz != null) {
        break label186;
      }
      j = -1;
      if (paramamt != null) {
        break label195;
      }
      k = -1;
      if (paramavs != null) {
        break label204;
      }
      m = -1;
      if (paramavs != null) {
        break label213;
      }
      n = -1;
      if (paramavs != null) {
        break label222;
      }
      i1 = -1;
      label42:
      if (paramavs != null) {
        break label231;
      }
      localObject1 = "null";
      label50:
      if (paramavs != null) {
        break label240;
      }
    }
    label186:
    label195:
    label204:
    label213:
    label222:
    label231:
    label240:
    for (Object localObject2 = "null";; localObject2 = paramavs.rYJ)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MMReqRespAuth", "dkidc updateMultiIDCInfo resetnewwork:%b iplist[l:%d s:%d] hostList[%d] noop[%d %d] typing[%d] port[%s] timeout[%s]", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(m), Integer.valueOf(n), Integer.valueOf(i1), localObject1, localObject2 });
      if ((paramamt != null) && (paramamt.hbG != null) && (paramamt.hbG.size() > 0)) {
        break label249;
      }
      com.tencent.mm.sdk.platformtools.x.f("MicroMsg.MMReqRespAuth", "dkidc updateMultiIDCInfo give empty host request! stack:[%s]", new Object[] { bi.cjd() });
      return;
      i = paramiz.rkm;
      break;
      j = paramiz.rkn;
      break label14;
      k = paramamt.hbF;
      break label21;
      m = paramavs.rYK;
      break label28;
      n = paramavs.rYL;
      break label35;
      i1 = paramavs.rYM;
      break label42;
      localObject1 = paramavs.rYI;
      break label50;
    }
    label249:
    if ((paramamt == null) || (paramamt.hbG == null) || (paramamt.hbG.size() <= 0))
    {
      com.tencent.mm.sdk.platformtools.x.f("MicroMsg.MMReqRespAuth", "dkidc updateMultiIDCInfo give empty host request! stack:[%s]", new Object[] { bi.cjd() });
      return;
    }
    localObject2 = new LinkedList();
    ((List)localObject2).clear();
    if (paramiz != null)
    {
      localObject3 = paramiz.rkq.iterator();
      while (((Iterator)localObject3).hasNext())
      {
        localObject4 = (iy)((Iterator)localObject3).next();
        localObject1 = "";
        if (((iy)localObject4).rkl != null) {
          localObject1 = ((iy)localObject4).rkl.cfV();
        }
        ((List)localObject2).add(new n(((iy)localObject4).type, ((iy)localObject4).rkk.cfV(), ((iy)localObject4).port, (String)localObject1));
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.MMReqRespAuth", "dkidc updateMultiIDCInfo short type:%d port:%d ip:%s", new Object[] { Integer.valueOf(((iy)localObject4).type), Integer.valueOf(((iy)localObject4).port), ((iy)localObject4).rkk.cfV() });
      }
    }
    localObject2 = n.cV((List)localObject2);
    Object localObject1 = new LinkedList();
    if (paramiz != null)
    {
      localObject3 = paramiz.rkp.iterator();
      while (((Iterator)localObject3).hasNext())
      {
        localObject4 = (iy)((Iterator)localObject3).next();
        paramiz = "";
        if (((iy)localObject4).rkl != null) {
          paramiz = ((iy)localObject4).rkl.cfV();
        }
        ((List)localObject1).add(new n(((iy)localObject4).type, ((iy)localObject4).rkk.cfV(), ((iy)localObject4).port, paramiz));
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.MMReqRespAuth", "dkidc updateMultiIDCInfo long type:%d port:%d ip:%s", new Object[] { Integer.valueOf(((iy)localObject4).type), Integer.valueOf(((iy)localObject4).port), ((iy)localObject4).rkk.cfV() });
      }
    }
    Object localObject3 = n.cV((List)localObject1);
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.MMReqRespAuth", "dkidc updateMultiIDCInfo builtin ip long[%s] short[%s]", new Object[] { localObject3, localObject2 });
    g.Ek();
    g.Ei().dqk.set(2, localObject2);
    Object localObject4 = com.tencent.mm.sdk.platformtools.ad.getContext().getSharedPreferences("system_config_prefs", 0);
    ((SharedPreferences)localObject4).edit().putString("builtin_short_ips", (String)localObject2).commit();
    g.Ek();
    g.Ei().dqk.set(3, localObject3);
    if (paramavs != null)
    {
      g.Ek();
      g.Ei().dqk.set(6, paramavs.rYI);
      g.Ek();
      g.Ei().dqk.set(7, paramavs.rYJ);
      if (paramavs.rYM != 0)
      {
        g.Ek();
        paramiz = g.Ei().dqk;
        if (paramavs.rYM > 60)
        {
          i = 60;
          paramiz.set(35, Integer.valueOf(i));
        }
      }
      else
      {
        com.tencent.mm.network.ad.m(paramavs.rYK, paramavs.rYN);
      }
    }
    for (paramiz = n.fJ(paramavs.rYI, paramavs.rYJ);; paramiz = null)
    {
      paramavs = "";
      localObject1 = "";
      String[] arrayOfString1 = new String[paramamt.hbG.size()];
      String[] arrayOfString2 = new String[paramamt.hbG.size()];
      int[] arrayOfInt = new int[paramamt.hbG.size()];
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.MMReqRespAuth", "hostlist.Count=%d", new Object[] { Integer.valueOf(paramamt.hbF) });
      Iterator localIterator = paramamt.hbG.iterator();
      i = 0;
      paramamt = (amt)localObject1;
      for (;;)
      {
        if (!localIterator.hasNext()) {
          break label1161;
        }
        localObject1 = (ams)localIterator.next();
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.MMReqRespAuth", "dkidc host org:%s sub:%s", new Object[] { ((ams)localObject1).rPz, ((ams)localObject1).rPA });
        arrayOfString1[i] = ((ams)localObject1).rPz;
        arrayOfString2[i] = ((ams)localObject1).rPA;
        arrayOfInt[i] = ((ams)localObject1).rPB;
        j = i + 1;
        i = j;
        if (!bi.oW(((ams)localObject1).rPz))
        {
          i = j;
          if (!bi.oW(((ams)localObject1).rPA))
          {
            if (((ams)localObject1).rPz.equals("short.weixin.qq.com"))
            {
              g.Ek();
              g.Ei().dqk.set(24, ((ams)localObject1).rPA);
              paramamt = ((ams)localObject1).rPA;
              i = j;
              continue;
              i = paramavs.rYM;
              break;
            }
            if (((ams)localObject1).rPz.equals("long.weixin.qq.com"))
            {
              g.Ek();
              g.Ei().dqk.set(25, ((ams)localObject1).rPA);
              paramavs = ((ams)localObject1).rPA;
              i = j;
            }
            else
            {
              i = j;
              if (((ams)localObject1).rPz.equals("support.weixin.qq.com"))
              {
                i = j;
                if (!bi.oW(((ams)localObject1).rPA))
                {
                  ((SharedPreferences)localObject4).edit().putString("support.weixin.qq.com", ((ams)localObject1).rPA).commit();
                  i = j;
                }
              }
            }
          }
        }
      }
      label1161:
      g.Ek();
      localObject1 = g.Eh().dpP.dJs;
      if ((arrayOfString1.length > 0) && (localObject1 != null)) {
        ((com.tencent.mm.network.e)localObject1).setHostInfo(arrayOfString1, arrayOfString2, arrayOfInt);
      }
      if (!bi.oW(paramavs))
      {
        g.Ek();
        g.Ei().dqk.set(25, paramavs);
      }
      if (!bi.oW(paramamt))
      {
        g.Ek();
        g.Ei().dqk.set(24, paramamt);
      }
      if ((localObject1 == null) || (paramiz == null)) {
        break;
      }
      ((com.tencent.mm.network.e)localObject1).a(paramBoolean, (String)localObject2, (String)localObject3, paramiz.qWI, paramiz.qWJ, paramiz.qWK, paramiz.qWL, paramamt, paramavs);
      return;
    }
  }
  
  public static int b(q paramq)
  {
    Object localObject2 = (i.f)paramq.KV();
    i.g localg = (i.g)paramq.Id();
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MMReqRespAuth", "summerauth decodeAndRetriveAccInfo type:%d, hashcode:%d, ret:%d, stack[%s]", new Object[] { Integer.valueOf(((i.f)localObject2).If()), Integer.valueOf(paramq.hashCode()), Integer.valueOf(localg.djx), bi.cjd() });
    if (localg.djx != 0)
    {
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.MMReqRespAuth", "summerauth decodeAndRetriveAccInfo resp just decoded and ret result:%d", new Object[] { Integer.valueOf(localg.djx) });
      return localg.djx;
    }
    bup localbup = localg.qWn;
    int k = localbup.srM;
    Object localObject1;
    int j;
    byte[] arrayOfByte;
    int i;
    if ((k & 0x1) != 0)
    {
      localObject1 = localbup.srN;
      j = ((ec)localObject1).reH;
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MMReqRespAuth", "decodeAndRetriveAccInfo authResultFlag:%d UpdateFlag:%d ", new Object[] { Integer.valueOf(j), Integer.valueOf(((ec)localObject1).reG) });
      paramq = ((ec)localObject1).req;
      arrayOfByte = ab.a(((ec)localObject1).rer);
      int m = paramq.reV.siI;
      int n = paramq.rwf;
      if (arrayOfByte == null)
      {
        i = -1;
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.MMReqRespAuth", "summerauth svr ecdh key len:%d, nid:%d sessionKey len:%d, sessionKey：%s", new Object[] { Integer.valueOf(m), Integer.valueOf(n), Integer.valueOf(i), bi.Xf(bi.bB(arrayOfByte)) });
        localObject1 = ab.a(paramq.reV);
        localObject2 = ((i.f)localObject2).qWm;
        if (bi.bC((byte[])localObject1)) {
          break label610;
        }
        m = localObject1.length;
        Object localObject3 = bi.Xf(bi.bB((byte[])localObject1));
        if (localObject2 != null) {
          break label597;
        }
        i = -1;
        label301:
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.MMReqRespAuth", "summerauth svrPubKey len:%d value:%s prikey len:%d, values:%s", new Object[] { Integer.valueOf(m), localObject3, Integer.valueOf(i), bi.Xf(bi.bB((byte[])localObject2)) });
        localObject3 = new PByteArray();
        m = MMProtocalJni.computerKeyWithAllStr(paramq.rwf, (byte[])localObject1, (byte[])localObject2, (PByteArray)localObject3, 0);
        paramq = ((PByteArray)localObject3).value;
        if (paramq != null) {
          break label604;
        }
        i = -1;
        label381:
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MMReqRespAuth", "summerauth ComputerKeyWithAllStr ret:%d, agreedECDHKey len: %d, values:%s", new Object[] { Integer.valueOf(m), Integer.valueOf(i), bi.Xf(bi.bB(paramq)) });
        label418:
        if (paramq == null) {
          break label637;
        }
        localObject1 = paramq;
        label425:
        localg.qWo = ((byte[])localObject1);
        if ((j & 0x4) == 0) {
          break label736;
        }
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.MMReqRespAuth", "summerauth must decode session key");
        if (bi.bC(paramq)) {
          break label697;
        }
        paramq = MMProtocalJni.aesDecrypt(arrayOfByte, paramq);
        if (arrayOfByte != null) {
          break label645;
        }
        i = -1;
        label467:
        localObject1 = bi.Xf(bi.bB(arrayOfByte));
        if (paramq != null) {
          break label652;
        }
        j = -1;
        label483:
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.MMReqRespAuth", "summerauth aesDecrypt sessionKey len:%d, value:%s, session len:%d, value:%s", new Object[] { Integer.valueOf(i), localObject1, Integer.valueOf(j), bi.Xf(bi.bB(paramq)) });
        if (bi.bC(paramq)) {
          break label658;
        }
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.MMReqRespAuth", "summerauth decode session key succ session:%s", new Object[] { bi.Xf(bi.bB(paramq)) });
        localg.bl(paramq);
        localg.djx = 1;
        label565:
        if ((k & 0x2) == 0) {
          break label799;
        }
        localg.erW = localbup.srO.hbL;
      }
    }
    for (;;)
    {
      return localg.djx;
      i = arrayOfByte.length;
      break;
      label597:
      i = localObject2.length;
      break label301;
      label604:
      i = paramq.length;
      break label381;
      label610:
      f.mDy.a(148L, 24L, 1L, false);
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.MMReqRespAuth", "summerauth svr ecdh key is null!");
      paramq = null;
      break label418;
      label637:
      localObject1 = new byte[0];
      break label425;
      label645:
      i = arrayOfByte.length;
      break label467;
      label652:
      j = paramq.length;
      break label483;
      label658:
      f.mDy.a(148L, 25L, 1L, false);
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.MMReqRespAuth", "summerauth decode session key failed ret null!");
      localg.bl(new byte[0]);
      localg.djx = 2;
      break label565;
      label697:
      f.mDy.a(148L, 26L, 1L, false);
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.MMReqRespAuth", "summerauth decode session key failed as agreedECDHKey is null!");
      localg.bl(new byte[0]);
      localg.djx = 2;
      break label565;
      label736:
      f.mDy.a(148L, 27L, 1L, false);
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.MMReqRespAuth", "summerauth not need decode session key");
      localg.bl(arrayOfByte);
      localg.djx = 1;
      break label565;
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.MMReqRespAuth", "summerauth auth sect not set so ret failed");
      localg.bl(new byte[0]);
      localg.djx = 2;
      break label565;
      label799:
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.MMReqRespAuth", "summerauth acct sect not set!");
    }
  }
  
  private q hc(int paramInt)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MMReqRespAuth", "summerauth autoAuthReq authReqFlag:%d, this:%d, stack:%s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(hashCode()), bi.cjd() });
    Object localObject6 = (i.f)KV();
    Object localObject5 = (i.g)this.dBO;
    Object localObject4 = aw.Ib();
    int i = ((SharedPreferences)localObject4).getInt("key_auth_update_version", 0);
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.MMReqRespAuth", "summerauth updateVersion:%d, clientVersion:%d", new Object[] { Integer.valueOf(i), Integer.valueOf(d.qVN) });
    long l;
    fi localfi;
    if (i < d.qVN)
    {
      if (this.dBM == 702)
      {
        i = 12;
        ((k.d)localObject6).qWw = i;
        localObject1 = f.mDy;
        if (this.dBM != 702) {
          break label297;
        }
      }
      label297:
      for (l = 14L;; l = 13L)
      {
        ((f)localObject1).a(148L, l, 1L, false);
        localfi = new fi();
        localfi.rgn = paramInt;
        localfi.rez = new bhy().bq(new byte[0]);
        localfi.rey = new bhy().bq(new byte[0]);
        localObject1 = new ccn();
        localfi.rgl = ((ccn)localObject1);
        ((ccn)localObject1).rhW = "";
        ((ccn)localObject1).rhV = "";
        ((ccn)localObject1).syo = "";
        localObject1 = new cge();
        localfi.rgm = ((cge)localObject1);
        ((cge)localObject1).rKZ = "";
        ((cge)localObject1).rKY = "";
        if (g.Eg().Dx()) {
          break label330;
        }
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.MMReqRespAuth", "autoAuthReq build autoauth Req  , failed  acc not ready");
        return null;
        i = 16;
        break;
      }
    }
    if (this.dBM == 702) {}
    for (i = 2;; i = 1)
    {
      ((k.d)localObject6).qWw = i;
      break;
    }
    label330:
    g.Ek();
    Object localObject1 = bi.oV((String)g.Ei().DT().get(2, null));
    g.Ek();
    Object localObject7 = new com.tencent.mm.a.o(bi.a((Integer)g.Ei().DT().get(9, null), 0));
    if (bi.oW((String)localObject1)) {
      localObject1 = ((com.tencent.mm.a.o)localObject7).toString();
    }
    for (;;)
    {
      g.Ek();
      Object localObject2 = g.Eg().Dp();
      l = ((com.tencent.mm.a.o)localObject7).longValue();
      boolean bool;
      if (this.dBM == 701)
      {
        bool = true;
        localObject3 = ((com.tencent.mm.ab.x)localObject2).a(l, "", bool);
        if (localObject3 != null) {
          break label695;
        }
        paramInt = -1;
        label450:
        if (localObject3 != null) {
          break label702;
        }
        localObject2 = "null";
        label459:
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MMReqRespAuth", "summerauth loginbuf username:%s, qq:%s, len:%d, content:[%s]", new Object[] { localObject1, localObject7, Integer.valueOf(paramInt), localObject2 });
        localObject7 = new bhy();
        if (!bi.bC((byte[])localObject3)) {
          break label715;
        }
        localObject2 = new byte[0];
        localfi.rgk = ((bhy)localObject7).bq((byte[])localObject2);
        if (this.dBM != 702) {
          break label833;
        }
        localObject2 = (i.a)localObject6;
        localObject3 = (i.b)localObject5;
        localObject5 = new el();
        localObject6 = new eo();
        ((i.a)localObject2).qWi.reW = ((eo)localObject6);
        ((i.a)localObject2).qWi.reX = ((el)localObject5);
        localObject7 = bi.WP(((SharedPreferences)localObject4).getString("_auth_key", ""));
        localObject4 = new em();
        if (bi.bC((byte[])localObject7)) {
          break label755;
        }
        ((el)localObject5).res = new bhy().bq((byte[])localObject7);
      }
      for (;;)
      {
        try
        {
          ((em)localObject4).aG((byte[])localObject7);
          if (((em)localObject4).reU == null) {
            break label790;
          }
          ((eo)localObject6).reY = ((em)localObject4).reU;
          ((el)localObject5).reP = localfi;
          ((i.a)localObject2).username = ((String)localObject1);
          ((i.g)localObject3).erW = ((String)localObject1);
          return this;
          bool = false;
          break;
          label695:
          paramInt = localObject3.length;
          break label450;
          label702:
          localObject2 = bi.Xf(bi.bB((byte[])localObject3));
          break label459;
          label715:
          localObject2 = localObject3;
        }
        catch (IOException localIOException)
        {
          f.mDy.a(148L, 15L, 1L, false);
          com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.MMReqRespAuth", localIOException, "summerauthkey Failed parse autoauthkey buf", new Object[0]);
          continue;
        }
        label755:
        f.mDy.a(148L, 16L, 1L, false);
        ((el)localObject5).res = new bhy().bq(new byte[0]);
        continue;
        label790:
        f.mDy.a(148L, 17L, 1L, false);
        ((eo)localObject6).reY = new bhy().bq(new byte[0]);
        com.tencent.mm.sdk.platformtools.x.w("MicroMsg.MMReqRespAuth", "summerauthkey AesEncryptKey null!");
      }
      label833:
      Object localObject3 = (i.d)localObject6;
      localObject2 = new ass();
      localObject4 = new asq();
      ((i.d)localObject3).qWk.rUY = ((ass)localObject2);
      ((i.d)localObject3).qWk.rUZ = ((asq)localObject4);
      ((asq)localObject4).rUX = 2;
      ((asq)localObject4).reP = localfi;
      ((ass)localObject2).hbL = ((String)localObject1);
      g.Ek();
      localObject1 = bi.oV((String)g.Ei().DT().get(3, null));
      g.Ek();
      ((ass)localObject2).rhI = bi.oV((String)g.Ei().DT().get(19, null));
      ((ass)localObject2).rhU = ((String)localObject1);
      return this;
    }
  }
  
  public final int Ia()
  {
    if (g.Eg().Dx())
    {
      g.Ek();
      g.Eg();
      return a.Df();
    }
    com.tencent.mm.sdk.platformtools.x.e("MicroMsg.MMReqRespAuth", "dkwt acc NOT Ready , the fucking MMReqRespBase need the fucking uin ???  if u find this log , fuck dk. %s", new Object[] { bi.cjd() });
    return 0;
  }
  
  protected final k.d Ic()
  {
    return this.dBN;
  }
  
  public final k.e Id()
  {
    return this.dBO;
  }
  
  public final void a(i.f paramf, i.g paramg, int paramInt1, int paramInt2, String paramString)
  {
    if (!g.Eg().Dx()) {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.MMReqRespAuth", "summerauth onAutoAuthEnd but account not ready");
    }
    label115:
    label248:
    label279:
    label288:
    do
    {
      return;
      bup localbup = paramg.qWn;
      boolean bool;
      if ((localbup != null) && (localbup.srN != null))
      {
        int i = paramg.qWn.srN.reI;
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MMReqRespAuth", "summerauth mmtls auto:%s", new Object[] { Integer.valueOf(i) });
        g.Ek();
        g.Ei().dqk.set(47, Integer.valueOf(i));
        com.tencent.mm.network.e locale = g.Eh().dpP.dJs;
        if (locale != null)
        {
          if ((i & 0x1) != 0) {
            break label248;
          }
          bool = true;
          locale.bF(bool);
        }
      }
      for (;;)
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MMReqRespAuth", "summerauth onAutoAuthEnd errType:%d, errCode:%d, errMsg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
        if ((paramInt1 == 0) && (paramInt2 == 0)) {
          break label288;
        }
        if ((paramInt1 != 4) || (paramInt2 != 65235)) {
          break;
        }
        f.mDy.a(148L, 18L, 1L, false);
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.MMReqRespAuth", "dkidc onAutoAuthEnd RedirectIDC");
        if ((localbup == null) || (localbup.srP == null)) {
          break label279;
        }
        a(true, paramg.qWn.srP.rhK, paramg.qWn.srP.rhL, paramg.qWn.srP.rhJ);
        return;
        bool = false;
        break label115;
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MMReqRespAuth", "summerauth mmtls auto not set as ret:%s", new Object[] { Integer.valueOf(paramg.qWB) });
      }
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.MMReqRespAuth", "dkidc onAutoAuthEnd RedirectIDC but NetworkSectResp is null");
      return;
    } while (dBP == null);
    dBP.a(paramf, paramg);
  }
  
  public final q aZ(int paramInt1, int paramInt2)
  {
    return new av(paramInt1).hc(paramInt2);
  }
  
  public final int getType()
  {
    return this.dBN.If();
  }
  
  public final String getUri()
  {
    return this.dBN.getUri();
  }
  
  public static abstract interface a
  {
    public abstract void a(i.f paramf, i.g paramg);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/model/av.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */