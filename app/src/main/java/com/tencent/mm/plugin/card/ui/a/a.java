package com.tencent.mm.plugin.card.ui.a;

import android.text.TextUtils;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.card.a.g;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.plugin.card.d.l;
import com.tencent.mm.plugin.card.ui.e.a;
import com.tencent.mm.protocal.c.kx;
import com.tencent.mm.protocal.c.lf;
import com.tencent.mm.protocal.c.pr;
import com.tencent.mm.protocal.c.sd;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import java.util.LinkedList;

public class a
  implements g
{
  protected MMActivity gKS;
  protected e.a hCv;
  boolean hHc = false;
  private boolean hHd = false;
  private boolean hHe = false;
  private boolean hHf = false;
  private boolean hHg = false;
  private boolean hHh = false;
  private boolean hHi = false;
  private boolean hHj = false;
  private boolean hHk = false;
  private boolean hHl = false;
  protected b htQ;
  
  public a(MMActivity paramMMActivity)
  {
    this.gKS = paramMMActivity;
  }
  
  private boolean azd()
  {
    return !TextUtils.isEmpty(this.htQ.awn().code);
  }
  
  private String getString(int paramInt)
  {
    return this.gKS.getString(paramInt);
  }
  
  public final void a(b paramb, e.a parama)
  {
    this.htQ = paramb;
    this.hCv = parama;
    azg();
  }
  
  public final boolean ayF()
  {
    return this.hHc;
  }
  
  public boolean azA()
  {
    return false;
  }
  
  public final boolean azB()
  {
    return (this.htQ.awn().rnh != null) && (!TextUtils.isEmpty(this.htQ.awn().rnh.title));
  }
  
  public boolean azC()
  {
    return (this.htQ.awn().rnk != null) && (!TextUtils.isEmpty(this.htQ.awn().rnk.title));
  }
  
  public boolean azD()
  {
    return this.htQ.awm().rnU != null;
  }
  
  public boolean azE()
  {
    return !TextUtils.isEmpty(this.htQ.awm().rnR);
  }
  
  public boolean azF()
  {
    return false;
  }
  
  public boolean azG()
  {
    return false;
  }
  
  public final void azH()
  {
    int i6 = 1;
    int i;
    String str;
    int j;
    label27:
    int k;
    label36:
    int m;
    label46:
    int n;
    label56:
    int i1;
    label66:
    int i2;
    label76:
    int i3;
    label86:
    int i4;
    label96:
    int i5;
    if (azd())
    {
      i = 1;
      str = aza();
      if (!this.hHc) {
        break label227;
      }
      j = 1;
      if (!azh()) {
        break label232;
      }
      k = 1;
      if (!this.hHe) {
        break label237;
      }
      m = 1;
      if (!this.hHf) {
        break label243;
      }
      n = 1;
      if (!this.hHg) {
        break label249;
      }
      i1 = 1;
      if (!this.hHh) {
        break label255;
      }
      i2 = 1;
      if (!this.hHi) {
        break label261;
      }
      i3 = 1;
      if (!this.hHj) {
        break label267;
      }
      i4 = 1;
      if (!this.hHk) {
        break label273;
      }
      i5 = 1;
      label106:
      if (!this.hHl) {
        break label279;
      }
    }
    for (;;)
    {
      x.i("MicroMsg.CardBaseShowLogic", "printStatus, isValidCode:%d, getUnacceptWording:%s, isAcceptedCard:%d, acceptViewVisible:%d, acceptViewEnabled:%d, isShowConsumedBtn:%d, isConsumedBtnEnabled:%d, enableOptionMenu:%d, isShareLogoVisible:%d, addShareMenu:%d, addMenu:%d, addInvalidCardMenu:%d ", new Object[] { Integer.valueOf(i), str, Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(m), Integer.valueOf(n), Integer.valueOf(i1), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6) });
      return;
      i = 0;
      break;
      label227:
      j = 0;
      break label27;
      label232:
      k = 0;
      break label36;
      label237:
      m = 0;
      break label46;
      label243:
      n = 0;
      break label56;
      label249:
      i1 = 0;
      break label66;
      label255:
      i2 = 0;
      break label76;
      label261:
      i3 = 0;
      break label86;
      label267:
      i4 = 0;
      break label96;
      label273:
      i5 = 0;
      break label106;
      label279:
      i6 = 0;
    }
  }
  
  public final String aza()
  {
    String str = "";
    if (!TextUtils.isEmpty(this.htQ.awm().roe)) {
      str = this.htQ.awm().roe;
    }
    do
    {
      return str;
      if (this.htQ.awn().rne == 0L) {
        return getString(a.g.card_no_stock);
      }
    } while (this.htQ.awn().rnf != 0);
    if (!TextUtils.isEmpty(this.htQ.awm().rnL)) {
      return this.htQ.awm().rnL;
    }
    return getString(a.g.card_accept_over_limite);
  }
  
  public final boolean azb()
  {
    return (this.htQ.awn().status == 0) || (this.htQ.awn().status == 1) || (this.htQ.awn().status == 2);
  }
  
  public final boolean azc()
  {
    return (this.hCv.hop == 3) || ((this.hCv.hop == 6) && (this.htQ.awn().rnb == 0)) || (this.hCv.hop == 4) || (this.hCv.hop == 5) || (this.hCv.hop == 15);
  }
  
  protected final boolean aze()
  {
    return (!this.htQ.isAcceptable()) && ((l.nZ(this.hCv.hop)) || (l.oa(this.hCv.hop)) || (this.hCv.hop == 23));
  }
  
  protected final boolean azf()
  {
    return (!this.htQ.awj()) && (this.hCv.hop == 6);
  }
  
  protected void azg()
  {
    x.i("MicroMsg.CardBaseShowLogic", "updateAcceptState()");
    if ((l.nZ(this.hCv.hop)) || (l.oa(this.hCv.hop))) {
      if (this.htQ.isAcceptable())
      {
        this.hHd = true;
        this.hHe = true;
        this.hHj = true;
        this.hHh = true;
        this.hHi = true;
        if (!this.htQ.awh()) {
          break label557;
        }
        this.hHd = false;
        this.hHe = false;
        x.i("MicroMsg.CardBaseShowLogic", "need direct jump!");
        label99:
        if (!this.hHc) {
          break label567;
        }
        this.hHd = false;
        this.hHe = false;
        x.i("MicroMsg.CardBaseShowLogic", "updateAcceptView to gone!");
      }
    }
    for (;;)
    {
      x.i("MicroMsg.CardBaseShowLogic", "mIsAcceptedCard:" + this.hHc);
      return;
      if (!this.htQ.isAcceptable())
      {
        this.hHd = true;
        this.hHe = false;
        if (this.htQ.awh())
        {
          this.hHk = true;
          this.hHh = true;
          this.hHg = true;
        }
        for (;;)
        {
          this.hHi = true;
          break;
          this.hHh = false;
        }
      }
      this.hHd = false;
      this.hHe = false;
      this.hHh = false;
      break;
      if (this.hCv.hop == 6)
      {
        if (this.htQ.awj())
        {
          this.hHd = true;
          this.hHe = true;
          this.hHh = false;
          break;
        }
        if (this.htQ.awi())
        {
          this.hHk = true;
          this.hHh = true;
          this.hHf = true;
          this.hHg = true;
          break;
        }
        this.hHd = false;
        this.hHe = false;
        this.hHh = false;
        this.hHf = true;
        break;
      }
      if (l.ob(this.hCv.hop))
      {
        this.hHd = false;
        this.hHe = false;
        this.hHf = true;
        if (this.htQ.awi())
        {
          this.hHk = true;
          this.hHh = true;
          this.hHg = true;
          break;
        }
        this.hHl = true;
        break;
      }
      if (this.hCv.hop != 23) {
        break;
      }
      if (this.htQ.isAcceptable())
      {
        this.hHd = true;
        this.hHe = true;
        this.hHh = false;
      }
      for (this.hHi = true;; this.hHi = true)
      {
        if ((TextUtils.isEmpty(this.hCv.hBD)) || (this.hCv.hBD.equals(q.GF())) || (this.htQ.awl())) {
          break label555;
        }
        x.i("MicroMsg.CardBaseShowLogic", " detail page");
        this.hHd = false;
        this.hHe = false;
        this.hHf = true;
        if (!this.htQ.awi()) {
          break;
        }
        this.hHk = true;
        this.hHh = true;
        this.hHg = true;
        break;
        this.hHd = true;
        this.hHe = false;
        this.hHh = false;
      }
      label555:
      break;
      label557:
      x.i("MicroMsg.CardBaseShowLogic", "not need direct jump!");
      break label99;
      label567:
      if (!this.hHd)
      {
        this.hHc = true;
        x.i("MicroMsg.CardBaseShowLogic", "set mIsAcceptedCard is true");
      }
      else
      {
        this.hHc = false;
        x.i("MicroMsg.CardBaseShowLogic", "set mIsAcceptedCard is false!");
      }
    }
  }
  
  public boolean azh()
  {
    return this.hHd;
  }
  
  public final boolean azi()
  {
    return this.hHe;
  }
  
  public final boolean azj()
  {
    return this.hHf;
  }
  
  public final boolean azk()
  {
    return this.hHg;
  }
  
  public final boolean azl()
  {
    return this.hHh;
  }
  
  public final boolean azm()
  {
    return this.hHj;
  }
  
  public final boolean azn()
  {
    return this.hHk;
  }
  
  public final boolean azo()
  {
    return this.hHl;
  }
  
  public boolean azp()
  {
    return true;
  }
  
  public boolean azq()
  {
    return false;
  }
  
  public boolean azr()
  {
    return false;
  }
  
  public boolean azs()
  {
    return ((this.hCv.hop == 6) && ((!this.htQ.awi()) || (this.htQ.awj()))) || (this.hCv.hop == 5) || ((this.hCv.hop == 23) && (this.htQ.awl()));
  }
  
  public boolean azt()
  {
    return false;
  }
  
  public boolean azu()
  {
    return true;
  }
  
  public boolean azv()
  {
    return ((azd()) && (azb()) && (azc())) || (this.hHc);
  }
  
  public boolean azw()
  {
    return false;
  }
  
  public boolean azx()
  {
    return !this.htQ.awi();
  }
  
  public boolean azy()
  {
    return (this.htQ.awm().rnY != null) && (this.htQ.awm().rnY.rvz != null) && (this.htQ.awm().rnY.rvz.size() > 0) && (!TextUtils.isEmpty((CharSequence)this.htQ.awm().rnY.rvz.get(0)));
  }
  
  public boolean azz()
  {
    return (this.htQ.awn().rnd != null) && (this.htQ.awn().rnd.size() > 0) && (((azb()) && (azc())) || (this.hHc));
  }
  
  public final void release()
  {
    this.htQ = null;
    this.hCv = null;
    this.gKS = null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/card/ui/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */