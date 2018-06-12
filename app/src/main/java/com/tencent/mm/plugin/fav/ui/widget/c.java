package com.tencent.mm.plugin.fav.ui.widget;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.tencent.mm.plugin.fav.a.ae;
import com.tencent.mm.plugin.fav.a.b;
import com.tencent.mm.plugin.fav.ui.m.e;
import com.tencent.mm.plugin.fav.ui.m.f;
import com.tencent.mm.plugin.report.service.h;
import java.util.Iterator;
import java.util.List;

public final class c
  extends LinearLayout
{
  private View jfo;
  public View jfp;
  public View jfq;
  private a jfr;
  private boolean jfs = false;
  private boolean jft = false;
  private int jfu;
  
  public c(Context paramContext)
  {
    super(paramContext);
    setOrientation(1);
    paramContext = new LinearLayout.LayoutParams(-1, -2);
    this.jfo = View.inflate(getContext(), m.f.fav_oldversion_bar, null);
    View localView = View.inflate(getContext(), m.f.fav_full_bar, null);
    localView.findViewById(m.e.oldversion_container).setOnClickListener(new c.1(this));
    this.jfp = localView;
    localView = View.inflate(getContext(), m.f.fav_netwarn_bar, null);
    localView.findViewById(m.e.fav_warn_retry_btn).setOnClickListener(new c.2(this));
    this.jfq = localView;
    addView(this.jfo, new LinearLayout.LayoutParams(paramContext));
    addView(this.jfp, new LinearLayout.LayoutParams(paramContext));
    addView(this.jfq, new LinearLayout.LayoutParams(paramContext));
  }
  
  private void pR(int paramInt)
  {
    this.jfu = paramInt;
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.FavHeaderView", "showStatusBar status:" + paramInt);
    if (paramInt == 0)
    {
      this.jfq.setVisibility(8);
      this.jfp.setVisibility(8);
    }
    do
    {
      return;
      if (paramInt == 1)
      {
        if (!this.jfs) {
          h.mEJ.h(14109, new Object[] { Integer.valueOf(1) });
        }
        this.jfs = true;
        this.jfq.setVisibility(8);
        this.jfp.setVisibility(0);
        this.jfp.findViewById(m.e.oldversion_title_full).setVisibility(0);
        this.jfp.findViewById(m.e.oldversion_title_support).setVisibility(8);
        return;
      }
      if (paramInt == 2)
      {
        this.jfq.setVisibility(0);
        this.jfp.setVisibility(8);
        return;
      }
    } while (paramInt != 3);
    if (!this.jft) {
      h.mEJ.h(14109, new Object[] { Integer.valueOf(0) });
    }
    this.jft = true;
    this.jfq.setVisibility(8);
    this.jfp.setVisibility(0);
    this.jfp.findViewById(m.e.oldversion_title_full).setVisibility(8);
    this.jfp.findViewById(m.e.oldversion_title_support).setVisibility(0);
  }
  
  public final void aMS()
  {
    List localList = ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().aLF();
    long l;
    int i;
    if (localList != null)
    {
      Iterator localIterator = localList.iterator();
      l = 0L;
      for (i = 0; localIterator.hasNext(); i = 1) {
        l = b.a((com.tencent.mm.plugin.fav.a.g)localIterator.next()) + l;
      }
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.FavHeaderView", "triggerStatusBar uploadFailedItemList size:%d,totalSize:%d", new Object[] { Integer.valueOf(localList.size()), Long.valueOf(l) });
    }
    for (;;)
    {
      if (i != 0)
      {
        if (l > b.aKR())
        {
          pR(1);
          return;
        }
        pR(2);
        return;
      }
      if (b.aKU())
      {
        pR(3);
        return;
      }
      pR(0);
      return;
      l = 0L;
      i = 0;
    }
  }
  
  public final void eX(boolean paramBoolean)
  {
    View localView = this.jfo;
    if (paramBoolean) {}
    for (int i = 0;; i = 8)
    {
      localView.setVisibility(i);
      return;
    }
  }
  
  public final void setCleanFavSpace(a parama)
  {
    this.jfr = parama;
  }
  
  public static abstract interface a
  {
    public abstract void aMx();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/fav/ui/widget/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */