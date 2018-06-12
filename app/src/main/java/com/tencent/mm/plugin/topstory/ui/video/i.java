package com.tencent.mm.plugin.topstory.ui.video;

import android.support.v7.app.ActionBar;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.ui.MMActivity;
import java.util.List;

public final class i
{
  public boolean jMc;
  a oAb;
  boolean oAf;
  n oAg;
  ViewGroup oAh;
  
  public final void a(n paramn, boolean paramBoolean)
  {
    if (this.jMc)
    {
      bId();
      return;
    }
    this.jMc = true;
    this.oAf = paramBoolean;
    this.oAg = paramn;
    this.oAg.getControlBar().bIz();
    this.oAh.removeAllViews();
    if (this.oAg.getParent() != null) {
      ((ViewGroup)this.oAg.getParent()).removeView(this.oAg);
    }
    paramn = new ViewGroup.LayoutParams(-1, -1);
    this.oAh.addView(this.oAg, paramn);
    this.oAg.setX(0.0F);
    this.oAg.setY(0.0F);
    bIc();
    if ((!this.oAb.bHN()) && (this.oAg.getPosition() + 1 >= this.oAb.bHO().size())) {
      this.oAg.setShowFullScreenPlayNext(false);
    }
    for (;;)
    {
      com.tencent.mm.plugin.websearch.api.a.a.kB(6);
      paramn = this.oAb.bHU().oAm;
      if (paramn == null) {
        break;
      }
      paramn.oyW = 1L;
      return;
      this.oAg.setShowFullScreenPlayNext(true);
    }
  }
  
  public final void bIc()
  {
    if (this.oAh != null)
    {
      if (d.fS(19)) {
        this.oAh.setSystemUiVisibility(2);
      }
    }
    else
    {
      this.oAb.baA().getWindow().addFlags(1024);
      if (!this.oAf) {
        break label105;
      }
      this.oAb.baA().setRequestedOrientation(0);
    }
    for (;;)
    {
      if (this.oAb.baA().getSupportActionBar() != null) {
        this.oAb.baA().getSupportActionBar().hide();
      }
      return;
      this.oAh.setSystemUiVisibility(4098);
      break;
      label105:
      this.oAb.baA().setRequestedOrientation(8);
    }
  }
  
  public final void bId()
  {
    this.oAg.bIt();
    this.oAg.getControlBar().ajc();
    this.oAh.setSystemUiVisibility(0);
    this.oAh.removeView(this.oAg);
    this.oAb.baA().getWindow().clearFlags(1024);
    if ((this.oAb.baA().getRequestedOrientation() == 0) || (this.oAb.baA().getRequestedOrientation() == 6) || (this.oAb.baA().getRequestedOrientation() == 8))
    {
      this.oAb.baA().setRequestedOrientation(1);
      if (this.oAb.baA().getSupportActionBar() != null) {
        this.oAb.baA().getSupportActionBar().hide();
      }
    }
    this.oAb.yf(this.oAg.getPosition());
    ah.i(new i.1(this), 200L);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/topstory/ui/video/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */