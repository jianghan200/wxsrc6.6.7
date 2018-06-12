package com.tencent.mm.plugin.card.b;

import android.text.TextUtils;
import com.tencent.mm.model.s;
import com.tencent.mm.plugin.card.a.g;
import com.tencent.mm.plugin.card.d.l;
import com.tencent.mm.protocal.c.la;
import com.tencent.mm.protocal.c.lf;
import com.tencent.mm.protocal.c.xk;
import com.tencent.mm.ui.MMActivity;
import java.util.ArrayList;
import java.util.List;

public final class f
{
  public MMActivity gKS;
  public int hop = 3;
  public com.tencent.mm.plugin.card.base.b htQ;
  public List<com.tencent.mm.plugin.card.model.b> htU = new ArrayList();
  public com.tencent.mm.plugin.card.model.b htV;
  public ArrayList<la> htW;
  
  public f(MMActivity paramMMActivity)
  {
    this.gKS = paramMMActivity;
  }
  
  public final com.tencent.mm.plugin.card.model.b awL()
  {
    com.tencent.mm.plugin.card.model.b localb = new com.tencent.mm.plugin.card.model.b();
    localb.hvh = 1;
    boolean bool;
    if ((l.nZ(this.hop)) || (l.oa(this.hop)) || (this.hop == 23))
    {
      if ((!this.htQ.isAcceptable()) || (this.htQ.awm().roa == null) || (TextUtils.isEmpty(this.htQ.awm().roa.text)) || (TextUtils.isEmpty(this.htQ.awm().rnD))) {
        break label310;
      }
      bool = true;
      localb.hvj = bool;
      if ((!localb.hvj) && (!TextUtils.isEmpty(this.htQ.awm().rnT))) {
        break label376;
      }
      if (!s.he(this.htQ.awm().rnD)) {
        break label315;
      }
      localb.title = getString(a.g.card_menu_find_app_service);
      localb.hvj = false;
    }
    for (;;)
    {
      if (!TextUtils.isEmpty(this.htQ.awm().rnV)) {
        localb.huX = this.htQ.awm().rnV;
      }
      localb.hyz = "";
      localb.url = "card://jump_service";
      this.htV = localb;
      return this.htV;
      if ((this.hop == 6) && (this.htQ.awj()) && (this.htQ.awm().roa != null) && (!TextUtils.isEmpty(this.htQ.awm().roa.text)) && (!TextUtils.isEmpty(this.htQ.awm().rnD)))
      {
        bool = true;
        break;
      }
      label310:
      bool = false;
      break;
      label315:
      localb.title = getString(a.g.card_menu_attention_app_service);
      if ((this.htQ.awm().roa != null) && (this.htQ.awm().roa.rDo == 1))
      {
        localb.hvk = true;
      }
      else
      {
        localb.hvk = false;
        continue;
        label376:
        localb.title = this.htQ.awm().rnT;
      }
    }
  }
  
  public final String getString(int paramInt)
  {
    return this.gKS.getString(paramInt);
  }
  
  public final String getTitle()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    if (!TextUtils.isEmpty(this.htQ.awm().hwg)) {
      localStringBuilder.append(this.htQ.awm().hwg);
    }
    for (;;)
    {
      return localStringBuilder.toString();
      if (this.htQ.avT()) {
        localStringBuilder.append(getString(a.g.card_membership));
      } else if (this.htQ.avU()) {
        localStringBuilder.append(getString(a.g.card_coupon));
      } else if (this.htQ.avV()) {
        localStringBuilder.append(getString(a.g.card_boarding_pass));
      } else if (this.htQ.avW()) {
        localStringBuilder.append(getString(a.g.card_enterprise_cash));
      } else if (this.htQ.avX()) {
        localStringBuilder.append(getString(a.g.card_invoice));
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/card/b/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */