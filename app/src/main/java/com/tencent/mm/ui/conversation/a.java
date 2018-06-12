package com.tencent.mm.ui.conversation;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.tencent.mm.aa.f.c;
import com.tencent.mm.g.a.ad;
import com.tencent.mm.g.a.ae;
import com.tencent.mm.model.aq;
import com.tencent.mm.model.au;
import com.tencent.mm.model.b.b.b;
import com.tencent.mm.model.q;
import com.tencent.mm.network.n;
import com.tencent.mm.platformtools.ai;
import com.tencent.mm.pluginsdk.ui.b.b;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.conversation.a.e;
import com.tencent.mm.ui.conversation.a.e.a;
import com.tencent.mm.ui.conversation.a.i;
import com.tencent.mm.ui.conversation.a.o;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class a
  implements f.c, aq, m.b
{
  Context context;
  n mHI;
  List<b> una = new LinkedList();
  List<b> unb = new LinkedList();
  List<b> unc = new LinkedList();
  List<b> und = new LinkedList();
  List<b> une = new LinkedList();
  com.tencent.mm.sdk.b.c unf;
  com.tencent.mm.sdk.b.c ung;
  ListView unh;
  View uni;
  
  private void dW(List<b> paramList)
  {
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      b localb = (b)paramList.next();
      this.unh.addHeaderView(localb.getView());
    }
  }
  
  private static void dY(List<b> paramList)
  {
    paramList = paramList.iterator();
    while (paramList.hasNext()) {
      ((b)paramList.next()).setVisibility(8);
    }
  }
  
  static void dZ(List<b> paramList)
  {
    paramList = paramList.iterator();
    while (paramList.hasNext()) {
      ((b)paramList.next()).release();
    }
  }
  
  static void ea(List<b> paramList)
  {
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext()) {
      ((b)localIterator.next()).destroy();
    }
    paramList.clear();
  }
  
  public final void HK()
  {
    cyF();
  }
  
  public final void a(int paramInt, m paramm, Object paramObject)
  {
    if (au.HX())
    {
      au.HU();
      if (paramm == com.tencent.mm.model.c.DT())
      {
        paramInt = ai.bc(paramObject);
        if (8193 == paramInt) {
          cyF();
        }
        if (42 == paramInt) {
          cyF();
        }
      }
    }
  }
  
  public final void a(Context paramContext, ListView paramListView, View paramView)
  {
    this.context = paramContext;
    this.unh = paramListView;
    this.uni = paramView;
    this.ung = new a.1(this);
    com.tencent.mm.sdk.b.a.sFg.b(this.ung);
    paramView = new ad();
    paramView.bHk.activity = ((Activity)paramContext);
    com.tencent.mm.sdk.b.a.sFg.m(paramView);
    paramView = new ae();
    paramView.bHl.bHn = ((b)e.a(this.context, e.a.usa, null));
    com.tencent.mm.sdk.b.a.sFg.m(paramView);
    paramView = (b)e.a(this.context, e.a.urU, null);
    ae localae = new ae();
    localae.bHl.bHn = paramView;
    localae.bHl.bHm = false;
    localae.bHl.level = 1;
    com.tencent.mm.sdk.b.a.sFg.m(localae);
    paramView = (o)e.a(this.context, e.a.urZ, null);
    localae = new ae();
    localae.bHl.bHn = paramView;
    localae.bHl.bHm = false;
    localae.bHl.level = 2;
    com.tencent.mm.sdk.b.a.sFg.m(localae);
    paramView = (com.tencent.mm.ui.conversation.a.a)e.a(this.context, e.a.urW, null);
    localae = new ae();
    localae.bHl.bHn = paramView;
    localae.bHl.bHm = false;
    localae.bHl.level = 3;
    com.tencent.mm.sdk.b.a.sFg.m(localae);
    paramView = (com.tencent.mm.ui.d.a)e.a(this.context, e.a.usb, new Object[] { b.b.dDY });
    localae = new ae();
    localae.bHl.bHn = paramView;
    localae.bHl.bHm = true;
    com.tencent.mm.sdk.b.a.sFg.m(localae);
    com.tencent.mm.sdk.b.a.sFg.c(this.ung);
    paramView = new LinkedList();
    paramView.addAll(this.una);
    paramView.addAll(this.unb);
    paramView.addAll(this.unc);
    paramView.addAll(this.und);
    Collections.sort(paramView, new a.2(this));
    dW(paramView);
    new LinkedList();
    paramView = (b)e.a(paramContext, e.a.urV, null);
    if ((paramView != null) && (paramView.getView() != null)) {
      paramListView.addFooterView(paramView.getView());
    }
    this.une.add(paramView);
    paramListView.addFooterView(new i(paramContext).getView(), null, true);
    this.une.add(paramView);
    this.mHI = new a.3(this);
    au.a(this.mHI);
    this.unf = new a.4(this);
    com.tencent.mm.sdk.b.a.sFg.b(this.unf);
    au.HU();
    com.tencent.mm.model.c.a(this);
    cyF();
  }
  
  public final void cyF()
  {
    int j = 1;
    if ((this.context == null) || (!au.HX())) {
      return;
    }
    x.i("MicroMsg.BannerHelper", "updateBanner, :%d", new Object[] { Integer.valueOf(hashCode()) });
    boolean bool1 = j(this.una, true);
    boolean bool2 = j(this.unb, true);
    boolean bool3 = j(this.unc, true);
    boolean bool4 = j(this.und, true);
    int i = j;
    if (!bool1)
    {
      i = j;
      if (!bool2)
      {
        i = j;
        if (!bool3)
        {
          if (!bool4) {
            break label206;
          }
          i = j;
        }
      }
    }
    label109:
    if (bool2)
    {
      dY(this.unc);
      dY(this.und);
    }
    for (;;)
    {
      if ((i != 0) && (this.unh.getVisibility() != 0))
      {
        this.unh.setVisibility(0);
        this.uni.setVisibility(8);
      }
      Iterator localIterator = this.une.iterator();
      while (localIterator.hasNext())
      {
        b localb = (b)localIterator.next();
        if (localb != null) {
          localb.anR();
        }
      }
      break;
      label206:
      i = 0;
      break label109;
      if (bool3) {
        dY(this.und);
      }
    }
  }
  
  final void dX(List<b> paramList)
  {
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      b localb = (b)paramList.next();
      if (localb.getView() != null) {
        this.unh.removeHeaderView(localb.getView());
      }
    }
  }
  
  final boolean j(List<b> paramList, boolean paramBoolean)
  {
    paramList = paramList.iterator();
    boolean bool = false;
    if (paramList.hasNext())
    {
      b localb = (b)paramList.next();
      View localView = ((ViewGroup)localb.getView()).getChildAt(0);
      if (localb.anR())
      {
        if ((localView != null) && (localView.getVisibility() == 0)) {}
        for (bool = true;; bool = false)
        {
          x.i("MicroMsg.BannerHelper", "refreshAndReturnIsVisible[true] :%s, checkAll:%b, isVisible:%b, hc:%d", new Object[] { localb, Boolean.valueOf(paramBoolean), Boolean.valueOf(bool), Integer.valueOf(hashCode()) });
          if (paramBoolean) {
            break;
          }
          return true;
        }
      }
      if ((localView != null) && (localView.getVisibility() == 0)) {
        x.i("MicroMsg.BannerHelper", "refreshAndReturnIsVisible[false] but visible :%s, checkAll:%b, hc:%d", new Object[] { localb, Boolean.valueOf(paramBoolean), Integer.valueOf(hashCode()) });
      }
    }
    for (;;)
    {
      break;
      return bool;
      bool = true;
    }
  }
  
  public final void jX(String paramString)
  {
    if ((au.HX()) && (!au.Dr()) && (ai.oV(paramString).length() > 0) && (paramString.equals(q.GF()))) {
      cyF();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/ui/conversation/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */