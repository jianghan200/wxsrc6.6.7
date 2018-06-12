package com.tencent.mm.plugin.collect.ui;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.ScrollView;
import android.widget.TextView;
import com.tencent.mm.ab.l;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.collect.b.m;
import com.tencent.mm.plugin.wxpay.a.e;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.h;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.wallet_core.c.v;
import com.tencent.mm.wallet_core.d.i;

public class CollectHKMainUI
  extends CollectMainUI
{
  private boolean hXJ = false;
  
  protected final void aCk()
  {
    g.Ek();
    this.hYg = ((String)g.Ei().DT().get(aa.a.sXo, ""));
    m localm = new m(q.GM());
    if (!bi.oW(this.hYg))
    {
      cDP().a(localm, false, 1);
      return;
    }
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CollectHKMainUI", "force load payurl");
    this.hXJ = true;
    cDP().a(localm, true, 1);
  }
  
  protected final String aCl()
  {
    return this.hYh;
  }
  
  protected final String aCm()
  {
    if (bi.oW(this.hYi)) {
      this.hYi = v.cDm();
    }
    return this.hYi;
  }
  
  protected final void aCn()
  {
    ImageView localImageView1 = (ImageView)this.hVW.findViewById(a.f.collect_main_save_top_logo_iv);
    ImageView localImageView2 = (ImageView)this.hVW.findViewById(a.f.collect_main_save_bottom_logo_iv);
    RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)localImageView2.getLayoutParams();
    localLayoutParams.topMargin = 0;
    localLayoutParams.bottomMargin = 0;
    localLayoutParams.addRule(13);
    localImageView2.setLayoutParams(localLayoutParams);
    if (w.chP().equals("zh_HK"))
    {
      localImageView1.setImageResource(a.h.collect_top_logo_hk_traditional);
      localImageView2.setImageResource(a.h.collect_bottom_logo_hk_traditional);
      return;
    }
    localImageView1.setImageResource(a.h.collect_top_logo_hk);
    localImageView2.setImageResource(a.h.collect_bottom_logo_hk);
  }
  
  protected final void aCo()
  {
    super.aCo();
    if (this.hYo)
    {
      findViewById(a.f.collect_main_hk_tips).setVisibility(8);
      return;
    }
    findViewById(a.f.collect_main_hk_tips).setVisibility(0);
  }
  
  public final boolean h(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    if ((paraml instanceof m))
    {
      paramString = (m)paraml;
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        if (paramString.hUm == 0)
        {
          this.hYg = paramString.hUo;
          this.hYh = paramString.hUA;
          this.hYi = paramString.hUx;
          aoV();
          if (!bi.oW(paramString.hUu))
          {
            this.hYB.setText(paramString.hUu);
            this.hYE.setOnClickListener(new CollectHKMainUI.2(this, paramString));
            this.hYE.setVisibility(0);
            if (bi.oW(paramString.hUy)) {
              break label161;
            }
            this.hYd.setText(paramString.hUy);
            this.hYd.setOnClickListener(new CollectHKMainUI.3(this, paramString));
            this.hYd.setVisibility(0);
          }
          for (;;)
          {
            return true;
            this.hYE.setVisibility(8);
            break;
            label161:
            this.hYd.setVisibility(8);
          }
        }
      }
      else {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.CollectHKMainUI", "net error: %s", new Object[] { paraml });
      }
      if (!this.hXJ) {
        return true;
      }
    }
    return false;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.hYE.setVisibility(8);
    findViewById(a.f.collect_main_hk_tips).setVisibility(0);
    findViewById(a.f.collect_menu_more_btn_layout).setVisibility(8);
    cDP().jr(1335);
    addIconOptionMenu(0, a.e.wallet_qanda_icon, new CollectHKMainUI.1(this));
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    cDP().js(1335);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/collect/ui/CollectHKMainUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */