package com.tencent.mm.ui.d;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.R.e;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.au;
import com.tencent.mm.model.b.b.b;
import com.tencent.mm.model.c;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class a
  extends com.tencent.mm.pluginsdk.ui.b.b
{
  private String kxY = null;
  String mUrl = null;
  private boolean tsf = false;
  private b.b tsg = null;
  private String tsh = "";
  
  public a(Context paramContext, b.b paramb)
  {
    super(paramContext);
    this.tsg = paramb;
    refresh();
  }
  
  private void refresh()
  {
    au.HU().Gv();
    if (com.tencent.mm.model.b.b.a(this.tsg))
    {
      x.i("MicroMsg.ChattingMonitoredBanner", "hy: start show banner: %s, %s, %s, %b", new Object[] { this.tsg, this.kxY, this.mUrl, Boolean.valueOf(this.tsf) });
      Object localObject;
      ImageView localImageView;
      if (this.tsg == b.b.dDZ)
      {
        au.HU().Gv();
        this.kxY = com.tencent.mm.model.b.b.Jc();
        au.HU().Gv();
        this.mUrl = com.tencent.mm.model.b.b.Jd();
        au.HU().Gv();
        this.tsf = com.tencent.mm.model.b.b.Je();
        localObject = (TextView)getView().findViewById(R.h.chatting_monitored_banner_text);
        localImageView = (ImageView)getView().findViewById(R.h.close_icon);
        if (bi.oW(this.kxY)) {
          break label353;
        }
        ((TextView)localObject).setText(this.kxY);
        label157:
        ((TextView)localObject).setSelected(true);
        if (bi.oW(this.mUrl)) {
          break label363;
        }
        getView().findViewById(R.h.monitor_content).setBackgroundResource(R.g.tips_bar_white_selector);
        localImageView.setImageResource(R.g.monitor_close_dark);
        ((TextView)localObject).setTextColor(ad.getContext().getResources().getColor(R.e.tipsbar_text_color));
      }
      for (;;)
      {
        getView().setOnClickListener(new a.1(this));
        if (getView().getVisibility() != 0)
        {
          localObject = new StringBuilder();
          g.Eg();
          this.tsh = (com.tencent.mm.kernel.a.Df() + "_" + System.currentTimeMillis());
          Ed(0);
        }
        setVisibility(0);
        if (!this.tsf) {
          break label405;
        }
        localImageView.setVisibility(0);
        localImageView.setOnClickListener(new a.2(this));
        return;
        au.HU().Gv();
        this.kxY = com.tencent.mm.model.b.b.IZ();
        au.HU().Gv();
        this.mUrl = com.tencent.mm.model.b.b.Ja();
        au.HU().Gv();
        this.tsf = com.tencent.mm.model.b.b.Jb();
        break;
        label353:
        ((TextView)localObject).setText(R.l.app_waiting);
        break label157;
        label363:
        getView().findViewById(R.h.monitor_content).setBackgroundResource(R.e.tipsbar_black_bg_color);
        localImageView.setImageResource(R.g.monitor_close);
        ((TextView)localObject).setTextColor(ad.getContext().getResources().getColor(R.e.white));
      }
      label405:
      localImageView.setVisibility(8);
      return;
    }
    x.i("MicroMsg.ChattingMonitoredBanner", "hy: should not show banner");
    setVisibility(8);
  }
  
  final void Ed(int paramInt)
  {
    int i = 1;
    h localh = h.mEJ;
    String str = this.tsh;
    if (this.tsg == b.b.dDY) {
      i = 0;
    }
    localh.h(14439, new Object[] { str, Integer.valueOf(paramInt), Integer.valueOf(i) });
    h.mEJ.a(633L, paramInt, 1L, false);
  }
  
  public final boolean anR()
  {
    refresh();
    return super.anR();
  }
  
  public final void destroy() {}
  
  public final int getLayoutId()
  {
    return R.i.chatting_monitored_banner;
  }
  
  public final void setVisibility(int paramInt)
  {
    super.setVisibility(paramInt);
    getView().findViewById(R.h.monitor_content).setVisibility(paramInt);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/ui/d/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */