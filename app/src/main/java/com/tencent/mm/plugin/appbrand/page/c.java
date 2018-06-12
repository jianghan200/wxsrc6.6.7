package com.tencent.mm.plugin.appbrand.page;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.webkit.WebChromeClient.CustomViewCallback;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.plugin.webview.ui.tools.widget.m;
import com.tencent.mm.ui.MMActivity;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public final class c
{
  private int OT;
  private View gmj;
  WebChromeClient.CustomViewCallback gmk;
  private int gml = 0;
  private Set<x> gmm = Collections.newSetFromMap(new ConcurrentHashMap());
  private Context mContext;
  
  c(Context paramContext)
  {
    this.mContext = paramContext;
  }
  
  private void alF()
  {
    Iterator localIterator = this.gmm.iterator();
    while (localIterator.hasNext()) {
      localIterator.next();
    }
  }
  
  final void a(x paramx)
  {
    this.gmm.add(paramx);
  }
  
  final boolean alE()
  {
    if (this.gmj == null) {
      return false;
    }
    if (this.gmk != null) {
      this.gmk.onCustomViewHidden();
    }
    Object localObject = (MMActivity)this.mContext;
    ViewGroup localViewGroup = (ViewGroup)((MMActivity)localObject).getWindow().getDecorView();
    localViewGroup.setSystemUiVisibility(this.gml);
    localViewGroup.removeView(this.gmj);
    ((MMActivity)localObject).getWindow().clearFlags(1024);
    ((MMActivity)localObject).setRequestedOrientation(this.OT);
    this.gmj = null;
    this.gmk = null;
    localObject = this.gmm.iterator();
    while (((Iterator)localObject).hasNext()) {
      ((x)((Iterator)localObject).next()).ajd();
    }
    m.Bk(2);
    return true;
  }
  
  final void r(View paramView, int paramInt)
  {
    alE();
    this.gmj = paramView;
    MMActivity localMMActivity = (MMActivity)this.mContext;
    ViewGroup.LayoutParams localLayoutParams = new ViewGroup.LayoutParams(-1, -1);
    ViewGroup localViewGroup = (ViewGroup)localMMActivity.getWindow().getDecorView();
    this.gml = localViewGroup.getSystemUiVisibility();
    localViewGroup.addView(paramView, localLayoutParams);
    paramView.setX(0.0F);
    paramView.setY(0.0F);
    if (d.fS(19))
    {
      localViewGroup.setSystemUiVisibility(2);
      localMMActivity.getWindow().addFlags(1024);
      this.OT = localMMActivity.getRequestedOrientation();
      switch (paramInt)
      {
      default: 
        localMMActivity.setRequestedOrientation(9);
      }
    }
    for (;;)
    {
      alF();
      m.Bk(1);
      return;
      localViewGroup.setSystemUiVisibility(4102);
      break;
      localMMActivity.setRequestedOrientation(0);
      continue;
      localMMActivity.setRequestedOrientation(8);
      continue;
      localMMActivity.setRequestedOrientation(1);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/page/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */