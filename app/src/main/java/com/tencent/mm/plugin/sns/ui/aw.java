package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.database.Cursor;
import android.text.StaticLayout;
import android.view.Display;
import android.view.WindowManager;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.aj;
import com.tencent.mm.plugin.sns.model.am.a;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.protocal.c.arj;
import com.tencent.mm.protocal.c.atf;
import com.tencent.mm.protocal.c.bj;
import com.tencent.mm.protocal.c.bon;
import com.tencent.mm.protocal.c.bou;
import com.tencent.mm.protocal.c.boy;
import com.tencent.mm.protocal.c.bpn;
import com.tencent.mm.protocal.c.bsu;
import com.tencent.mm.protocal.c.cfn;
import com.tencent.mm.protocal.c.dc;
import com.tencent.mm.protocal.c.qc;
import com.tencent.mm.protocal.c.vu;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ab;
import com.tencent.mm.vending.d.b.a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public final class aw
  extends com.tencent.mm.vending.a.b<ay, n>
{
  private boolean DEBUG = false;
  com.tencent.mm.storage.ay dDg;
  volatile String iKw = "";
  Context mContext;
  volatile String nQU = "";
  String ocI;
  av odV;
  private int odW = (int)(System.currentTimeMillis() / 1000L);
  private com.tencent.mm.l.a odX;
  private boolean odY = false;
  volatile boolean odZ = false;
  byte[] oea = new byte[0];
  protected HashMap<String, String> oeb = new HashMap();
  public HashMap<String, Boolean> oec = new HashMap();
  private String oed = "";
  private String oee = "";
  
  public aw()
  {
    super(new n());
    cBs();
  }
  
  private void a(int paramInt, ay paramay)
  {
    Object localObject1 = paramay.nhb.smO;
    com.tencent.mm.kiss.widget.textview.a.a locala = com.tencent.mm.plugin.sns.ui.widget.b.bEX().getTextViewConfig();
    paramay.oes = new com.tencent.mm.plugin.sns.data.d();
    if (this.DEBUG) {
      x.d("MicroMsg.SnsTimeLineVendingSide", "debug:renderSnsComment position " + paramInt + " commentInfoList: " + ((List)localObject1).size() + " commentData:" + paramay.oes.nkP.size());
    }
    Iterator localIterator = ((List)localObject1).iterator();
    bon localbon;
    com.tencent.mm.kiss.widget.textview.c localc;
    Context localContext;
    Object localObject2;
    String str2;
    if (localIterator.hasNext())
    {
      localbon = (bon)localIterator.next();
      localc = com.tencent.mm.kiss.widget.textview.c.dtC;
      localContext = this.mContext;
      String str1 = paramay.nhc.field_userName;
      localObject2 = com.tencent.mm.plugin.sns.ui.widget.c.a(localbon);
      str2 = localbon.jSA;
      localObject1 = null;
      if (!bi.oW(str1))
      {
        com.tencent.mm.kernel.g.Ek();
        localObject1 = ((com.tencent.mm.plugin.messenger.foundation.a.i)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FR().Ye(str1);
      }
      if (localbon.smm == 1)
      {
        if (localObject1 == null) {
          break label591;
        }
        if (localObject1 == null)
        {
          localObject1 = str1;
          label206:
          localObject2 = (String)localObject2 + localContext.getString(i.j.sns_at);
          localObject1 = (String)localObject2 + (String)localObject1;
        }
      }
    }
    for (;;)
    {
      localObject1 = "" + (String)localObject1 + ": ";
      localObject1 = (String)localObject1 + str2;
      if (locala != null)
      {
        localObject2 = (com.tencent.mm.kiss.widget.textview.b)localc.dtD.get(Integer.valueOf(com.tencent.mm.kiss.widget.textview.c.a(locala)));
        if (localObject2 != null)
        {
          localObject1 = (LinkedList)((com.tencent.mm.kiss.widget.textview.b)localObject2).dtB.get(((CharSequence)localObject1).toString());
          if ((localObject1 == null) || (((LinkedList)localObject1).size() == 0)) {
            paramInt = 0;
          }
        }
      }
      for (;;)
      {
        if (paramInt == 0) {
          break label518;
        }
        localObject1 = com.tencent.mm.plugin.sns.ui.widget.c.a(this.mContext, localbon, this.odV, paramay.nhc.field_type, paramay.nhc.field_userName);
        paramay.oes.a(localbon, (CharSequence)localObject1);
        break;
        localObject1 = ((ab)localObject1).BL();
        break label206;
        if (bi.oW(localbon.smB)) {
          break label591;
        }
        localObject1 = af.byc().Yf(localbon.smB);
        if (localObject1 == null) {}
        for (localObject1 = localbon.smB;; localObject1 = ((com.tencent.mm.l.a)localObject1).BL())
        {
          localObject2 = (String)localObject2 + localContext.getString(i.j.sns_reply);
          localObject1 = (String)localObject2 + (String)localObject1;
          break;
        }
        paramInt = 1;
        continue;
        paramInt = 0;
      }
      label518:
      localObject1 = com.tencent.mm.plugin.sns.ui.widget.c.a(this.mContext, localbon, this.odV, paramay.nhc.field_type, paramay.nhc.field_userName);
      paramay.oes.a(localbon, (CharSequence)localObject1);
      paramInt = com.tencent.mm.plugin.sns.ui.widget.b.bEX().getViewWidth();
      if (paramInt <= 0) {
        break;
      }
      localObject1 = com.tencent.mm.kiss.widget.textview.d.a((CharSequence)localObject1, paramInt, locala).Fa();
      com.tencent.mm.kiss.widget.textview.c.dtC.a(locala, (com.tencent.mm.kiss.widget.textview.f)localObject1);
      break;
      return;
      label591:
      localObject1 = localObject2;
    }
  }
  
  private String f(bsu parambsu)
  {
    Object localObject;
    if (parambsu.sqc.ruz == 26) {
      localObject = this.mContext.getString(i.j.favorite);
    }
    String str;
    do
    {
      return (String)localObject;
      if (parambsu.sqb == null) {
        return "";
      }
      if (bi.oW(parambsu.sqb.ksA)) {
        return "";
      }
      if (this.oeb.containsKey(parambsu.sqb.ksA)) {
        return (String)this.oeb.get(parambsu.sqb.ksA);
      }
      int i = bi.getInt(parambsu.sqb.hcr, 0);
      str = com.tencent.mm.pluginsdk.model.app.g.b(this.mContext, com.tencent.mm.pluginsdk.model.app.g.cP(parambsu.sqb.ksA, i), null);
      localObject = str;
    } while (bi.oW(str));
    this.oeb.put(parambsu.sqb.ksA, str);
    return str;
  }
  
  private static boolean g(bsu parambsu)
  {
    if (bi.oW(parambsu.sqd)) {}
    while ((am.a.byN() & 0x2) <= 0) {
      return true;
    }
    return false;
  }
  
  private ay xB(int paramInt)
  {
    if (paramInt < 0) {
      return null;
    }
    x.i("MicroMsg.SnsTimeLineVendingSide", "resolveAsynchronous %s", new Object[] { Integer.valueOf(paramInt) });
    long l2 = System.currentTimeMillis();
    ay localay = new ay();
    n localn = (n)super.getItem(paramInt);
    if (localn == null)
    {
      x.printErrStackTrace("MicroMsg.SnsTimeLineVendingSide", new Throwable(), "mSnsInfo is null, index %s, count %s, why?", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(this.mCount) });
      return localay;
    }
    bsu localbsu = localn.bAJ();
    boy localboy = aj.n(localn);
    int j = av.d(localbsu);
    localay.Xe = j;
    localay.oew = localn.field_snsId;
    localay.oeA = localn.field_likeFlag;
    localay.oeB = localn.bBa();
    localay.oeC = localn.bBn();
    localay.nhc = localn;
    localay.nhg = localbsu;
    localay.nhb = localboy;
    Object localObject1 = localay.nhg.spZ;
    Object localObject2 = this.mContext;
    com.tencent.mm.plugin.sns.ui.widget.d.bEY();
    localObject2 = com.tencent.mm.plugin.sns.ui.widget.e.a((Context)localObject2, (String)localObject1, com.tencent.mm.plugin.sns.ui.widget.d.getTextSize());
    localay.oet = ((CharSequence)localObject2);
    int i = com.tencent.mm.plugin.sns.ui.widget.d.bEY().getViewWidth();
    Object localObject3;
    if (paramInt < this.odV.getCount())
    {
      localObject3 = (n)super.getItem(paramInt);
      if ((localObject3 != null) && (((n)localObject3).xb(32)))
      {
        localObject3 = ((n)localObject3).bAF();
        if ((localObject3 != null) && (((com.tencent.mm.plugin.sns.storage.b)localObject3).nze == 1)) {
          i = ((WindowManager)this.mContext.getSystemService("window")).getDefaultDisplay().getWidth() - com.tencent.mm.bp.a.fromDPToPix(this.mContext, 50) - com.tencent.mm.bp.a.fromDPToPix(this.mContext, 50) - com.tencent.mm.bp.a.fromDPToPix(this.mContext, 12) - com.tencent.mm.bp.a.fromDPToPix(this.mContext, 12);
        }
      }
    }
    for (;;)
    {
      if (this.DEBUG) {
        x.d("MicroMsg.SnsTimeLineVendingSide", "debug:renderSnsPostDesc position " + paramInt + " viewWidth: " + i + " desc:" + (String)localObject1);
      }
      localObject1 = com.tencent.mm.kiss.widget.textview.d.a((CharSequence)localObject2, i, com.tencent.mm.plugin.sns.ui.widget.d.bEY().getTextViewConfig()).Fa();
      com.tencent.mm.kiss.widget.textview.c.dtC.a(com.tencent.mm.plugin.sns.ui.widget.d.bEY().getTextViewConfig(), (com.tencent.mm.kiss.widget.textview.f)localObject1);
      if (((com.tencent.mm.kiss.widget.textview.f)localObject1).duh.getLineCount() > 6)
      {
        localObject1 = com.tencent.mm.kiss.widget.textview.d.a((CharSequence)localObject2, i, com.tencent.mm.plugin.sns.ui.widget.d.bEY().bEZ()).Fa();
        com.tencent.mm.kiss.widget.textview.c.dtC.a(com.tencent.mm.plugin.sns.ui.widget.d.bEY().bEZ(), (com.tencent.mm.kiss.widget.textview.f)localObject1);
      }
      a(paramInt, localay);
      Object localObject4;
      if (localay.nhc.xb(32))
      {
        af.byl().b(localn, null);
        f(localay.nhg);
        localObject4 = localn.field_userName;
        localObject1 = this.dDg.Yf((String)localObject4);
        if (localObject4 != null)
        {
          if (!((String)localObject4).equals(this.ocI)) {
            break label2850;
          }
          if (this.odX != null) {
            break label1271;
          }
          this.odX = ((com.tencent.mm.l.a)localObject1);
        }
      }
      label560:
      label569:
      label677:
      label861:
      label868:
      label914:
      label928:
      label997:
      label1089:
      label1090:
      label1232:
      label1271:
      label1290:
      label1311:
      label1317:
      label1328:
      label1339:
      label1418:
      label1431:
      label1441:
      label1457:
      label1593:
      label1669:
      label1782:
      label1854:
      label1929:
      label2129:
      label2180:
      label2338:
      label2347:
      label2366:
      label2404:
      label2601:
      label2844:
      label2850:
      for (;;)
      {
        Object localObject5;
        boolean bool1;
        if (localObject1 == null)
        {
          localObject2 = localObject4;
          localObject3 = localObject2;
          if (localn.xb(32))
          {
            localObject3 = localObject2;
            if (bi.oW((String)localObject2))
            {
              localObject5 = localn.bAF();
              localObject3 = localObject2;
              if (localObject5 != null)
              {
                localObject3 = localObject2;
                if (!bi.oW(((com.tencent.mm.plugin.sns.storage.b)localObject5).nickname)) {
                  localObject3 = ((com.tencent.mm.plugin.sns.storage.b)localObject5).nickname;
                }
              }
            }
          }
          localay.gtX = ((String)localObject4);
          localay.oeK = ((String)localObject3);
          localay.nLv = localn.xb(32);
          localay.nMU = localn.bBe();
          if (localObject1 != null) {
            break label1290;
          }
          bool1 = true;
          localay.oeL = bool1;
          localay.oeu = ((com.tencent.mm.l.a)localObject1);
          localay.oev = localn.bAK();
          localay.oex = localbsu.spZ;
          localay.oey = localbsu.sqe;
          localay.oez = localn.field_createTime;
          localay.oeD = az.g(this.mContext, localay.oez * 1000L);
          localay.oeN = false;
          if ((j == 11) && (!q.GF().equals(localbsu.hbL)) && (localboy.smZ != null) && (localboy.smZ.snB != 0))
          {
            localay.oeO = localboy.smZ.snB;
            localay.oeN = true;
          }
          if (!localay.nLv) {
            break label1317;
          }
          localObject1 = localn.bAH();
          if (localObject1 != null)
          {
            localay.oeQ = ((com.tencent.mm.plugin.sns.storage.a)localObject1).nyc;
            if (bi.oW(((com.tencent.mm.plugin.sns.storage.a)localObject1).nyd)) {
              break label1311;
            }
            bool1 = true;
            localay.oeR = bool1;
          }
          localObject1 = f(localbsu);
          if ((!com.tencent.mm.plugin.sns.c.a.ezo.cT((String)localObject1)) || (!g(localbsu))) {
            break label1593;
          }
          localay.oeS = true;
          if (localbsu.sqb != null) {
            break label1457;
          }
          bool1 = false;
        }
        for (;;)
        {
          localay.mAppName = ((String)localObject1);
          localay.oeU = bool1;
          if ((localbsu.nsD != null) && (!bi.oW(localbsu.nsD.pLr)))
          {
            localay.mAppName = this.mContext.getString(i.j.top_story_share_app_brand_name);
            localay.oeS = true;
          }
          boolean bool2;
          if ((localay.gtX != null) && (localay.gtX.equals(this.ocI)))
          {
            bool1 = true;
            localay.oeM = bool1;
            localay.oeY = localn.bBg();
            localay.oeZ = localn.bAW().rWj;
            localay.ofa = false;
            if ((localboy != null) && (localay.oeM))
            {
              i = localboy.rXx;
              if ((i == 3) || (i == 5)) {
                localay.ofa = true;
              }
            }
            if (localboy == null) {
              break label2404;
            }
            if (localboy.smR.size() > 0) {
              break label1669;
            }
            localay.ofb = false;
            break label1854;
            if ((localboy.smZ == null) || (!q.GF().equals(localbsu.hbL)) || (localboy.smZ.snB <= 0)) {
              break label1929;
            }
            localay.ofh = (com.tencent.mm.plugin.sns.lucky.a.m.b(localn, localboy) * 1.0D);
            localay.ofg = localboy.smZ.snB;
            localay.ofe = true;
            localObject2 = new b.a();
            localObject3 = localboy.smZ.snC.iterator();
            for (;;)
            {
              if (((Iterator)localObject3).hasNext())
              {
                localObject4 = (bou)((Iterator)localObject3).next();
                localObject1 = this.dDg.Yf(((bou)localObject4).rdS);
                if (localObject1 != null)
                {
                  localObject1 = bi.oV(((com.tencent.mm.l.a)localObject1).BL());
                  ((b.a)localObject2).u(new com.tencent.mm.vending.j.a[] { com.tencent.mm.vending.j.a.x(((bou)localObject4).rdS, localObject1) });
                  continue;
                  af.byl().a(localn, null);
                  break;
                  localObject1 = this.odX;
                  break label560;
                  localObject2 = ((com.tencent.mm.l.a)localObject1).BL();
                  break label569;
                  if ((int)((com.tencent.mm.l.a)localObject1).dhP == 0)
                  {
                    bool1 = true;
                    break label677;
                  }
                  bool1 = false;
                  break label677;
                  bool1 = false;
                  break label861;
                  if (localbsu.sqa == null)
                  {
                    localObject1 = null;
                    if (localbsu.sqa != null) {
                      break label1418;
                    }
                    localObject2 = null;
                    if (bi.oW((String)localObject2)) {
                      break label1441;
                    }
                    if ((localn.field_snsId != 0L) || (bi.oW((String)localObject1))) {
                      break label1431;
                    }
                  }
                  for (localay.oeQ = ((String)localObject1 + "·" + (String)localObject2);; localay.oeQ = ((String)localObject2))
                  {
                    localay.oeR = true;
                    break;
                    localObject1 = localbsu.sqa.eJJ;
                    break label1328;
                    localObject2 = localbsu.sqa.kFa;
                    break label1339;
                  }
                  localay.oeQ = ((String)localObject1);
                  localay.oeR = false;
                  break label868;
                  if (this.oec.containsKey(localbsu.sqb.ksA))
                  {
                    if (((Boolean)this.oec.get(localbsu.sqb.ksA)).booleanValue()) {
                      break label2844;
                    }
                    bool1 = false;
                    break label914;
                  }
                  if (com.tencent.mm.pluginsdk.model.app.g.cU(localbsu.sqb.ksA)) {
                    if (localbsu.sqb.rdh == 0)
                    {
                      bool2 = false;
                      bool1 = false;
                    }
                  }
                }
              }
            }
          }
          for (;;)
          {
            this.oec.put(localbsu.sqb.ksA, Boolean.valueOf(bool2));
            break;
            bool2 = true;
            bool1 = true;
            continue;
            bool2 = com.tencent.mm.pluginsdk.model.app.g.SS(localbsu.sqb.ksA);
            if (!bool2)
            {
              bool1 = false;
              continue;
              if ((!bi.oW(localbsu.sqd)) && (g(localbsu)))
              {
                localay.mAppName = ((String)localObject1);
                localay.oeT = true;
                localay.oeW = localbsu.qIc;
                localay.oeV = localbsu.sqd;
                break label928;
              }
              localay.oeS = false;
              localay.oeT = false;
              break label928;
              bool1 = false;
              break label997;
              if (this.ocI.equals(localboy.rdS))
              {
                localay.ofb = true;
                localObject2 = new StringBuffer();
                localObject3 = localboy.smR.iterator();
                i = 0;
                if (((Iterator)localObject3).hasNext())
                {
                  localObject1 = (bon)((Iterator)localObject3).next();
                  if (i == 0)
                  {
                    i = 1;
                    ((StringBuffer)localObject2).append("  ");
                  }
                  for (;;)
                  {
                    if (((bon)localObject1).rTW == null) {
                      break label1782;
                    }
                    ((StringBuffer)localObject2).append(((bon)localObject1).rTW);
                    break;
                    ((StringBuffer)localObject2).append(",  ");
                  }
                  localObject4 = this.dDg.Yf(((bon)localObject1).rdS);
                  if (localObject4 == null) {}
                  for (localObject1 = ((bon)localObject1).rdS;; localObject1 = ((com.tencent.mm.l.a)localObject4).BL())
                  {
                    ((StringBuffer)localObject2).append((String)localObject1);
                    break;
                  }
                }
                localay.ofc = ((StringBuffer)localObject2).toString();
                break label1090;
              }
              localObject1 = localboy.smR.iterator();
              if (!((Iterator)localObject1).hasNext()) {
                break label1090;
              }
              localObject2 = (bon)((Iterator)localObject1).next();
              if (!this.ocI.equals(((bon)localObject2).rdS)) {
                break label1089;
              }
              localay.ofb = true;
              localay.ofd = true;
              break label1090;
              localObject1 = bi.oV(((bou)localObject4).rdS);
              break label1232;
              localay.ofi = ((b.a)localObject2).cBD();
              if (localboy.smL.size() > 0)
              {
                localObject2 = new b.a();
                localObject3 = localboy.smL.iterator();
                if (((Iterator)localObject3).hasNext())
                {
                  localObject4 = (bon)((Iterator)localObject3).next();
                  localObject1 = this.dDg.Yf(((bon)localObject4).rdS);
                  if (localObject1 != null) {}
                  for (localObject1 = bi.oV(((com.tencent.mm.l.a)localObject1).BL());; localObject1 = bi.oV(((bon)localObject4).rdS))
                  {
                    ((b.a)localObject2).u(new com.tencent.mm.vending.j.a[] { com.tencent.mm.vending.j.a.x(((bon)localObject4).rdS, localObject1) });
                    break;
                  }
                }
                localay.ofj = ((b.a)localObject2).cBD();
              }
              if (localboy.smO.size() > 0)
              {
                localObject2 = new b.a();
                localObject3 = localboy.smO.iterator();
                if (((Iterator)localObject3).hasNext())
                {
                  localObject5 = (bon)((Iterator)localObject3).next();
                  long l1;
                  if (((bon)localObject5).smh != 0)
                  {
                    l1 = ((bon)localObject5).smh;
                    localObject4 = ((bon)localObject5).rdS;
                    if (!((bon)localObject5).rdS.equals(this.ocI)) {
                      break label2347;
                    }
                    if (this.odX != null) {
                      break label2338;
                    }
                    localObject1 = this.dDg.Yf(((bon)localObject5).rdS);
                    this.odX = ((com.tencent.mm.l.a)localObject1);
                    if (localObject1 == null) {
                      break label2366;
                    }
                    localObject1 = ((com.tencent.mm.l.a)localObject1).BL();
                  }
                  for (;;)
                  {
                    String str = ((bon)localObject5).jSA;
                    localObject5 = (CharSequence)localay.oes.nkP.get(((bon)localObject5).smh + "-" + ((bon)localObject5).smk + "-" + ((bon)localObject5).jSA);
                    com.tencent.mm.vending.j.f localf = new com.tencent.mm.vending.j.f();
                    localf.uRO = new Object[] { Long.valueOf(l1), localObject4, localObject1, str, localObject5 };
                    ((b.a)localObject2).u(new com.tencent.mm.vending.j.a[] { (com.tencent.mm.vending.j.f)localf });
                    break;
                    l1 = ((bon)localObject5).smk;
                    break label2129;
                    localObject1 = this.odX;
                    break label2180;
                    localObject1 = this.dDg.Yf(((bon)localObject5).rdS);
                    break label2180;
                    if (((bon)localObject5).rTW != null) {
                      localObject1 = ((bon)localObject5).rTW;
                    } else {
                      localObject1 = ((bon)localObject5).rdS;
                    }
                  }
                }
                localay.ofk = ((b.a)localObject2).cBD();
              }
              ag.a(this.mContext, localay, localbsu.nsB);
              if (localay.nLv)
              {
                localay.oeE = localn.bAH();
                localay.oeF = localn.bAF();
                localObject1 = localn.bAF();
                if (localObject1 != null)
                {
                  localObject1 = ((com.tencent.mm.plugin.sns.storage.b)localObject1).nyD;
                  localay.oeG = ((String)localObject1);
                }
              }
              else if (localay.nLv)
              {
                localObject3 = localay.oeE;
                if (localay.oeE.nye != com.tencent.mm.plugin.sns.storage.a.nxQ) {
                  break label2601;
                }
                localay.oeH = ((com.tencent.mm.plugin.sns.storage.a)localObject3).nyf;
              }
              for (;;)
              {
                localObject1 = localn.bAW();
                localay.ofn = ((atf)localObject1);
                if ((localObject1 != null) && (!q.GF().equals(localbsu.hbL)) && (com.tencent.mm.plugin.sns.lucky.a.m.a(localn, localboy))) {
                  localay.oeP = true;
                }
                x.d("MicroMsg.SnsTimeLineVendingSide", "SnsTimeLineVendingStruct resolve %s %s ms", new Object[] { Integer.valueOf(paramInt), Long.valueOf(System.currentTimeMillis() - l2) });
                return localay;
                localObject1 = "";
                break;
                if ((((com.tencent.mm.plugin.sns.storage.a)localObject3).nye == com.tencent.mm.plugin.sns.storage.a.nxR) && (!bi.oW(((com.tencent.mm.plugin.sns.storage.a)localObject3).nyf)))
                {
                  localObject2 = "";
                  localObject4 = ((com.tencent.mm.plugin.sns.storage.a)localObject3).nyh.iterator();
                  if (((Iterator)localObject4).hasNext())
                  {
                    localObject5 = (String)((Iterator)localObject4).next();
                    localObject1 = af.byc().Yf((String)localObject5);
                    if (localObject1 != null)
                    {
                      localObject1 = ((com.tencent.mm.l.a)localObject1).BL();
                      if (!bi.oW((String)localObject1)) {
                        localObject1 = (String)localObject2 + (String)localObject1;
                      }
                    }
                    for (;;)
                    {
                      localObject2 = localObject1;
                      if (((com.tencent.mm.plugin.sns.storage.a)localObject3).nyh.getLast() == localObject5) {
                        break;
                      }
                      localObject2 = (String)localObject1 + ",";
                      break;
                      localObject1 = (String)localObject2 + (String)localObject5;
                      continue;
                      localObject1 = (String)localObject2 + (String)localObject5;
                    }
                  }
                  localay.oeJ = ((String)localObject2);
                  localay.oeI = String.format(((com.tencent.mm.plugin.sns.storage.a)localObject3).nyf, new Object[] { localObject2 });
                }
              }
            }
            bool1 = true;
          }
          bool1 = true;
        }
      }
    }
  }
  
  public final void bDI()
  {
    looperCheckForVending();
    long l;
    if (this.mCount == 0)
    {
      l = 0L;
      this.odZ = true;
    }
    for (;;)
    {
      synchronized (this.oea)
      {
        this.iKw = r(l, this.iKw);
        return;
        int i = this.mCount - 1;
        int j = 0;
        ??? = (n)getItem(i);
        if ((??? != null) && (!((n)???).xb(32)) && (((n)???).field_snsId != 0L))
        {
          l = ((n)???).field_snsId;
          x.i("MicroMsg.SnsTimeLineVendingSide", "get list last not ad item %s %s", new Object[] { Long.valueOf(l), ((n)???).field_stringSeq });
          break;
        }
        j += 1;
        i -= 1;
        if ((i < 0) || (j > 500)) {
          l = 0L;
        }
      }
    }
  }
  
  protected final Cursor bEl()
  {
    if (!this.odY) {}
    label849:
    label869:
    label874:
    label952:
    label976:
    label1016:
    label1091:
    label1181:
    for (;;)
    {
      int k;
      Object localObject4;
      Object localObject5;
      Object localObject6;
      synchronized (this.oea)
      {
        this.iKw = r(0L, this.iKw);
        this.odY = true;
        k = af.byo().Ny(this.iKw);
        x.i("MicroMsg.SnsTimeLineVendingSide", "create time sql %s to %s getLimitSeq() %s", new Object[] { Integer.valueOf(this.odW), Integer.valueOf(k), this.iKw });
        if (this.odW == k) {
          break label1016;
        }
        ??? = af.byr();
        i = this.odW;
        Object localObject2 = "select *,rowid from AdSnsInfo  where createTime > " + k + " and createTime <= " + i;
        localObject2 = (String)localObject2 + " order by  createTime desc";
        x.d("MicroMsg.AdSnsInfoStorage", "getAdInTime " + (String)localObject2);
        ??? = ((com.tencent.mm.plugin.sns.storage.f)???).diF.rawQuery((String)localObject2, null);
        if ((??? == null) || (!((Cursor)???).moveToFirst())) {
          break label976;
        }
        localObject2 = new LinkedList();
        localObject4 = new com.tencent.mm.plugin.sns.storage.e();
        ((com.tencent.mm.plugin.sns.storage.e)localObject4).d((Cursor)???);
        localObject5 = ((com.tencent.mm.plugin.sns.storage.e)localObject4).bAL();
        localObject6 = new StringBuilder("ad xml ");
        Object localObject7 = ((n)localObject5).bBp();
        StringBuffer localStringBuffer = new StringBuffer();
        localStringBuffer.append(((n)localObject5).field_stringSeq);
        localStringBuffer.append(((com.tencent.mm.plugin.sns.storage.e)localObject7).field_adxml);
        localStringBuffer.append(" <createtime " + ((n)localObject5).field_createTime + ">");
        localStringBuffer.append(" <exposuretime " + ((com.tencent.mm.plugin.sns.storage.e)localObject7).field_exposureTime + ">");
        localStringBuffer.append(" <adcreatetime " + ((com.tencent.mm.plugin.sns.storage.e)localObject7).field_createAdTime + "> ");
        localStringBuffer.append(((com.tencent.mm.plugin.sns.storage.e)localObject7).bAJ().spZ);
        x.d("MicroMsg.SnsTimeLineVendingSide", localStringBuffer.toString());
        l1 = 21600L;
        localObject6 = ((n)localObject5).bAH();
        i = ((n)localObject5).field_createTime;
        if ((((com.tencent.mm.plugin.sns.storage.e)localObject4).field_localFlag & 0x80) > 0)
        {
          bool = true;
          if (localObject6 == null) {
            break label1181;
          }
          if (!bool) {
            break label849;
          }
          l1 = 60L * ((com.tencent.mm.plugin.sns.storage.a)localObject6).nxU;
          i = ((com.tencent.mm.plugin.sns.storage.e)localObject4).field_exposureTime;
          long l2 = bi.bG(i);
          if (l2 < l1) {
            break label874;
          }
          localObject6 = aj.n((n)localObject5);
          if (((n)localObject5).field_likeFlag == 0)
          {
            localObject6 = ((boy)localObject6).smO.iterator();
            if (!((Iterator)localObject6).hasNext()) {
              break label869;
            }
            localObject7 = (bon)((Iterator)localObject6).next();
            if ((localObject7 == null) || (bi.oW(((bon)localObject7).rdS)) || (!((bon)localObject7).rdS.equals(this.ocI))) {
              continue;
            }
          }
          j = 1;
          if (j != 0) {
            break label874;
          }
          af.byr().delete(((n)localObject5).field_snsId);
          x.i("MicroMsg.SnsTimeLineVendingSide", "~~addelete the item " + ((n)localObject5).field_snsId + " exposureTime: " + l1 + " field_createTime: " + ((n)localObject5).field_createTime + " checktime: " + l2 + " gettime: " + i + " isexposure " + bool + " exposureTime " + ((com.tencent.mm.plugin.sns.storage.e)localObject4).field_exposureTime + " adCreateTIme:" + ((com.tencent.mm.plugin.sns.storage.e)localObject4).field_createAdTime);
          if (!bool) {
            ((LinkedList)localObject2).add(localObject4);
          }
          if (((Cursor)???).moveToNext()) {
            continue;
          }
          if (((LinkedList)localObject2).size() <= 0) {
            break label976;
          }
          localObject4 = new LinkedList();
          localObject2 = ((LinkedList)localObject2).iterator();
          if (!((Iterator)localObject2).hasNext()) {
            break label952;
          }
          localObject5 = (com.tencent.mm.plugin.sns.storage.e)((Iterator)localObject2).next();
          localObject6 = new bj();
          ((bj)localObject6).rbJ = 13298;
          ((bj)localObject6).rbK = new com.tencent.mm.bk.b(((com.tencent.mm.plugin.sns.storage.e)localObject5).bAH().ntU.getBytes());
          ((bj)localObject6).rbL = (System.currentTimeMillis() / 1000L);
          ((LinkedList)localObject4).add(localObject6);
        }
      }
      boolean bool = false;
      continue;
      long l1 = 60L * ((com.tencent.mm.plugin.sns.storage.a)localObject6).nxT;
      int i = ((com.tencent.mm.plugin.sns.storage.e)localObject4).field_createAdTime;
      continue;
      int j = 0;
      continue;
      l1 = ((n)localObject5).field_snsId;
      x.i("MicroMsg.SnsTimeLineVendingSide", "try to update snsid " + l1);
      if (com.tencent.mm.plugin.sns.model.m.eK(l1))
      {
        localObject4 = new com.tencent.mm.plugin.sns.model.m(l1, 1, ((n)localObject5).bAH().nyt);
        com.tencent.mm.kernel.g.Ek();
        com.tencent.mm.kernel.g.Eh().dpP.a((com.tencent.mm.ab.l)localObject4, 0);
        continue;
        com.tencent.mm.kernel.g.Ek();
        com.tencent.mm.kernel.g.Eh().dpP.a(new com.tencent.mm.plugin.sns.model.l((LinkedList)localObject4), 0);
        if (??? != null)
        {
          x.d("MicroMsg.SnsTimeLineVendingSide", "test for adcount " + ((Cursor)???).getCount());
          ((Cursor)???).close();
        }
        this.odW = k;
        ??? = af.byo().ch(this.iKw, k);
        x.d("MicroMsg.SnsTimeLineVendingSide", "onCursorResetFinish");
        com.tencent.mm.modelsns.b localb = com.tencent.mm.modelsns.b.io(500);
        if (localb.Rz())
        {
          i = this.mCount;
          if (i != 0) {
            break label1091;
          }
          localb.ir(0).ir(0).ir(0);
          localb.RD();
        }
        do
        {
          return (Cursor)???;
          localObject4 = com.tencent.mm.plugin.sns.data.i.g((n)getItem(1));
          localObject5 = com.tencent.mm.plugin.sns.data.i.g((n)getItem(i - 1));
        } while ((((String)localObject4).equals(this.oed)) && (((String)localObject5).equals(this.oee)));
        this.oed = ((String)localObject4);
        this.oee = ((String)localObject5);
        localb.ir(i).nb((String)localObject4).nb((String)localObject5);
        localb.RD();
        return (Cursor)???;
      }
    }
  }
  
  public final void destroyAsynchronous()
  {
    super.destroyAsynchronous();
    com.tencent.mm.kiss.widget.textview.c.dtC.EZ();
    this.oec.clear();
  }
  
  final String r(long paramLong, String paramString)
  {
    x.d("MicroMsg.SnsTimeLineVendingSide", "updateLitmitSeq %s %s", new Object[] { Integer.valueOf(af.bye().byM()), paramString });
    Object localObject = af.byo();
    int i;
    String str;
    if (paramString.equals(""))
    {
      i = af.bye().byM() / 2;
      localObject = com.tencent.mm.plugin.sns.data.i.eG(((com.tencent.mm.plugin.sns.storage.o)localObject).e(paramLong, i, false));
      str = this.nQU;
      if (!str.equals("")) {
        break label122;
      }
      paramString = (String)localObject;
      label85:
      localObject = af.bys().Np("@__weixintimtline").bAV();
      if (((vu)localObject).rzb != 0L) {
        break label141;
      }
    }
    label122:
    label141:
    do
    {
      return paramString;
      i = af.bye().byM();
      break;
      paramString = (String)localObject;
      if (((String)localObject).compareTo(str) < 0) {
        break label85;
      }
      paramString = str;
      break label85;
      localObject = com.tencent.mm.plugin.sns.data.i.eG(((vu)localObject).rzb);
      if (paramString.equals("")) {
        return (String)localObject;
      }
    } while (((String)localObject).compareTo(paramString) <= 0);
    return (String)localObject;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/aw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */