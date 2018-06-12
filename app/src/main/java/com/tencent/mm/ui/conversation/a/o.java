package com.tencent.mm.ui.conversation.a;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.modelmulti.l;
import com.tencent.mm.pluginsdk.ui.b.b;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.x;

public final class o
  extends b
{
  private TextView eCm;
  private View gYR = null;
  private ImageView gmn;
  private boolean usL = false;
  boolean usX = false;
  private c usY;
  
  public o(Context paramContext)
  {
    super(paramContext);
    if ((!this.usL) && (this.view != null))
    {
      this.gYR = this.view.findViewById(R.h.tniview);
      this.eCm = ((TextView)this.view.findViewById(R.h.tni_detail));
      this.gmn = ((ImageView)this.view.findViewById(R.h.tni_icon));
      this.usL = true;
      this.usY = new o.1(this);
      a.sFg.b(this.usY);
    }
  }
  
  public final boolean anR()
  {
    if (!this.usX)
    {
      x.i("MicroMsg.TryNewInitBanner", "summerinit update but initFailed[%b] just ret update false", new Object[] { Boolean.valueOf(this.usX) });
      this.gYR.setVisibility(8);
      return false;
    }
    if (!l.PJ())
    {
      x.i("MicroMsg.TryNewInitBanner", "summerinit update but not need init just update false");
      this.usX = false;
      this.gYR.setVisibility(8);
      return false;
    }
    this.eCm.setText(R.l.banner_new_init_retry);
    this.gmn.setVisibility(0);
    this.gYR.setOnClickListener(new o.2(this));
    this.gYR.setVisibility(0);
    if (this.gYR.getVisibility() == 0) {}
    for (boolean bool = true;; bool = false)
    {
      x.i("MicroMsg.TryNewInitBanner", "summerinit update set visible [%b]", new Object[] { Boolean.valueOf(bool) });
      return true;
    }
  }
  
  public final void destroy()
  {
    a.sFg.c(this.usY);
  }
  
  public final int getLayoutId()
  {
    return R.i.try_newinit_banner;
  }
  
  public final void setVisibility(int paramInt)
  {
    if (this.gYR != null) {
      this.gYR.setVisibility(paramInt);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/ui/conversation/a/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */