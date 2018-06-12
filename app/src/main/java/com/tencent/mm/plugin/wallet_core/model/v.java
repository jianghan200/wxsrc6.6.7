package com.tencent.mm.plugin.wallet_core.model;

import com.tencent.mm.ab.e;
import com.tencent.mm.ab.l;
import com.tencent.mm.g.a.sz;
import com.tencent.mm.g.a.sz.a;
import com.tencent.mm.g.a.sz.b;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.wallet_core.c.b.a;
import com.tencent.mm.plugin.wallet_core.c.y;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;

public final class v
  extends c<sz>
  implements e
{
  private boolean cdT = false;
  private boolean cdU = false;
  private boolean jgq = false;
  private sz pqW;
  
  public v()
  {
    this.sFo = sz.class.getName().hashCode();
  }
  
  private void a(int paramInt, String paramString, l paraml, boolean paramBoolean)
  {
    boolean bool2 = false;
    ag localag;
    boolean bool1;
    if (this.pqW != null)
    {
      this.pqW.cdS.errCode = paramInt;
      this.pqW.cdS.Yy = paramString;
      this.pqW.cdS.cdV = o.bOW().bPs();
      paramString = this.pqW.cdS;
      localag = o.bOW();
      if (((localag.prC == null) || (!localag.prC.bPj())) && ((localag.pda == null) || (localag.pda.size() <= 0))) {
        break label872;
      }
      paramInt = 1;
      if (paramInt == 0) {
        break label877;
      }
      bool1 = false;
      label108:
      paramString.cdW = bool1;
      paramString = this.pqW.cdS;
      localag = o.bOW();
      ArrayList localArrayList1 = new ArrayList();
      ArrayList localArrayList2 = new ArrayList();
      localag.f(localArrayList1, localArrayList2);
      if (!ag.cD(localArrayList2)) {
        break label908;
      }
      bool1 = true;
      label165:
      paramString.cdX = bool1;
      this.pqW.cdS.cdY = o.bOW().bPw().bPj();
      this.pqW.cdS.cdZ = o.bOW().bPv();
      this.pqW.cdS.cea = o.bOW().aCl();
      this.pqW.cdS.ceb = o.bOW().bPt();
      this.pqW.cdS.cec = o.bOW().bPw().bPm();
      this.pqW.cdS.ced = "";
      paramString = this.pqW.cdS;
      localag = o.bOW();
      if (localag.prA == null) {
        break label920;
      }
      if (localag.prA.field_paymenu_use_new != 1) {
        break label914;
      }
      bool1 = true;
      label305:
      paramString.cer = bool1;
      if ((paraml != null) && ((paraml instanceof y)))
      {
        this.pqW.cdS.ced = ((y)paraml).ced;
        this.pqW.cdS.cee = ((y)paraml).cee;
        this.pqW.cdS.cef = ((y)paraml).cef;
        this.pqW.cdS.ceg = ((y)paraml).ceg;
        this.pqW.cdS.ceh = ((y)paraml).ceh;
        this.pqW.cdS.scene = ((y)paraml).scene;
        this.pqW.cdS.cei = ((y)paraml).cei;
        this.pqW.cdS.cej = ((y)paraml).cej;
        this.pqW.cdS.cek = ((y)paraml).cek;
        this.pqW.cdS.cel = ((y)paraml).cel;
        this.pqW.cdS.cem = ((y)paraml).cem;
        this.pqW.cdS.cen = ((y)paraml).cen;
        this.pqW.cdS.ceo = ((y)paraml).ceo;
        this.pqW.cdS.title = ((y)paraml).title;
        this.pqW.cdS.cep = ((y)paraml).cep;
        this.pqW.cdS.ceq = ((y)paraml).ceq;
      }
      paramString = this.pqW.cdS;
      if (!o.bOW().bPC()) {
        break label926;
      }
      paramInt = 1;
      label613:
      paramString.ces = paramInt;
      paramString = this.pqW.cdS;
      paraml = o.bOW();
      if (paraml.prA == null) {
        break label931;
      }
      paramInt = paraml.prA.field_is_show_lqb;
      label645:
      paramString.cet = paramInt;
      paramString = this.pqW.cdS;
      paraml = o.bOW();
      bool1 = bool2;
      if (paraml.prA != null)
      {
        bool1 = bool2;
        if (paraml.prA.field_is_open_lqb == 1) {
          bool1 = true;
        }
      }
      paramString.ceu = bool1;
      paraml = this.pqW.cdS;
      paramString = o.bOW();
      if (paramString.prA == null) {
        break label936;
      }
    }
    label872:
    label877:
    label908:
    label914:
    label920:
    label926:
    label931:
    label936:
    for (paramString = paramString.prA.field_lqb_open_url;; paramString = null)
    {
      paraml.cev = paramString;
      this.pqW.cdS.cew = paramBoolean;
      x.d("MicroMsg.WalletGetUserInfoEventListener", "mUserInfo needBind : " + this.pqW.cdS.cdW + " hasNewTips : " + this.pqW.cdS.cdX + " swipeOn : " + this.pqW.cdS.cdY);
      if (this.pqW.bJX != null) {
        this.pqW.bJX.run();
      }
      if (this.pqW.cdS.cdN != null) {
        this.pqW.cdS.cdN.run();
      }
      if (this.jgq) {
        this.pqW = null;
      }
      return;
      paramInt = 0;
      break;
      if ((localag.pcZ != null) && (localag.pcZ.size() > 0))
      {
        bool1 = false;
        break label108;
      }
      bool1 = true;
      break label108;
      bool1 = false;
      break label165;
      bool1 = false;
      break label305;
      bool1 = false;
      break label305;
      paramInt = 0;
      break label613;
      paramInt = 0;
      break label645;
    }
  }
  
  private boolean a(sz paramsz)
  {
    if (!(paramsz instanceof sz))
    {
      x.f("MicroMsg.WalletGetUserInfoEventListener", "mismatched event");
      return false;
    }
    this.jgq = false;
    this.pqW = paramsz;
    this.cdT = paramsz.cdR.cdT;
    this.cdU = paramsz.cdR.cdU;
    x.i("MicroMsg.WalletGetUserInfoEventListener", "mustNotifyAfterNetEnd: %s", new Object[] { Boolean.valueOf(this.cdU) });
    g.Ek();
    g.Eh().dpP.a(385, this);
    g.Ek();
    g.Eh().dpP.a(1518, this);
    if (o.bOW().bPr())
    {
      x.i("MicroMsg.WalletGetUserInfoEventListener", "data is invalid. doScene");
      if (q.GS())
      {
        g.Ek();
        g.Eh().dpP.a(new a(), 0);
      }
    }
    for (;;)
    {
      return true;
      g.Ek();
      Object localObject = g.Eh().dpP;
      if (zl(paramsz.cdR.scene)) {}
      for (int i = paramsz.cdR.scene;; i = 0)
      {
        ((com.tencent.mm.ab.o)localObject).a(new y(null, i), 0);
        break;
      }
      long l;
      if (paramsz.cdR.cdT)
      {
        x.i("MicroMsg.WalletGetUserInfoEventListener", "use cache");
        localObject = o.bOW();
        l = bi.VE();
        x.i("MicroMsg.WalletUserInfoManger", "checkCacheTimeout, nowSecs: %s, cacheDeadTime: %s", new Object[] { Long.valueOf(l), Long.valueOf(((ag)localObject).prI) });
        if ((((ag)localObject).prI <= 0L) || (l > ((ag)localObject).prI)) {
          i = 1;
        }
        for (;;)
        {
          if (i == 0)
          {
            if (!this.cdU) {
              this.jgq = true;
            }
            x.i("MicroMsg.WalletGetUserInfoEventListener", "cache data is ok. doCallback");
            a(0, "", null, false);
            if (q.GS())
            {
              g.Ek();
              g.Eh().dpP.a(new a(), 0);
              break;
              i = 0;
              continue;
            }
            g.Ek();
            localObject = g.Eh().dpP;
            if (zl(paramsz.cdR.scene)) {}
            for (i = paramsz.cdR.scene;; i = 0)
            {
              ((com.tencent.mm.ab.o)localObject).a(new y(null, i), 0);
              break;
            }
          }
        }
        x.i("MicroMsg.WalletGetUserInfoEventListener", "cache timeout, do NetSceneTenpayQueryBoundBankcard");
        if (q.GS())
        {
          g.Ek();
          g.Eh().dpP.a(new a(), 0);
        }
        else
        {
          g.Ek();
          localObject = g.Eh().dpP;
          if (zl(paramsz.cdR.scene)) {}
          for (i = paramsz.cdR.scene;; i = 0)
          {
            ((com.tencent.mm.ab.o)localObject).a(new y(null, i), 0);
            break;
          }
        }
      }
      else
      {
        localObject = o.bOW();
        l = bi.bG(((ag)localObject).prH);
        x.i("MicroMsg.WalletUserInfoManger", "dead time : %d, nowSec: %d, pass time " + l, new Object[] { Long.valueOf(((ag)localObject).prH), Long.valueOf(System.currentTimeMillis() / 1000L) });
        if (l > 0L) {
          i = 1;
        }
        for (;;)
        {
          if (i != 0)
          {
            x.i("MicroMsg.WalletGetUserInfoEventListener", "data is checkTimeOut, do NetSceneTenpayQueryBoundBankcard");
            if (q.GS())
            {
              g.Ek();
              g.Eh().dpP.a(new a(), 0);
              break;
              i = 0;
              continue;
            }
            g.Ek();
            localObject = g.Eh().dpP;
            if (zl(paramsz.cdR.scene)) {}
            for (i = paramsz.cdR.scene;; i = 0)
            {
              ((com.tencent.mm.ab.o)localObject).a(new y(null, i), 0);
              break;
            }
          }
        }
        this.jgq = true;
        x.i("MicroMsg.WalletGetUserInfoEventListener", "data is ok. doCallback");
        a(0, "", null, false);
      }
    }
  }
  
  private static boolean zl(int paramInt)
  {
    return (paramInt == 0) || (paramInt == 1) || (paramInt == 2) || (paramInt == 3) || (paramInt == 4) || (paramInt == 6) || (paramInt == 8) || (paramInt == 9) || (paramInt == 10) || (paramInt == 11) || (paramInt == 12) || (paramInt == 13) || (paramInt == 14) || (paramInt == 15) || (paramInt == 16) || (paramInt == 17) || (paramInt == 18) || (paramInt == 19) || (paramInt == 20) || (paramInt == 21) || (paramInt == 22) || (paramInt == 23);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    x.i("MicroMsg.WalletGetUserInfoEventListener", "onSceneEnd, errType: %s, errCode: %s, scene: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paraml });
    if (((paraml instanceof y)) || ((paraml instanceof a)))
    {
      g.Ek();
      g.Eh().dpP.b(385, this);
      g.Ek();
      g.Eh().dpP.b(1518, this);
      if ((!this.cdU) && (this.cdT) && (this.jgq)) {
        x.i("MicroMsg.WalletGetUserInfoEventListener", "onSceneEnd, useCache and event end");
      }
    }
    else
    {
      return;
    }
    this.jgq = true;
    a(paramInt2, paramString, paraml, true);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/model/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */