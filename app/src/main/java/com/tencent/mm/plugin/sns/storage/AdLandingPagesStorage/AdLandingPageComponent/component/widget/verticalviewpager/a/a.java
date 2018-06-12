package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.a;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.t;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.ad;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.i;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.b;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.b.a;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.b.b;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.s;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.c;
import com.tencent.mm.plugin.sns.ui.am;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class a
  extends RecyclerView.a<RecyclerView.t>
  implements b.b
{
  int bgColor;
  private Context context;
  private int hmV;
  private int hmW;
  private LinearLayoutManager nCQ;
  c nHg;
  LinkedHashMap<String, i> nHh;
  private LayoutInflater nHi;
  
  public a(c paramc, int paramInt, Context paramContext, LinearLayoutManager paramLinearLayoutManager)
  {
    this.nCQ = paramLinearLayoutManager;
    this.nHg = paramc;
    this.nHh = new LinkedHashMap();
    this.bgColor = paramInt;
    this.context = paramContext;
    this.nHi = ((LayoutInflater)this.context.getSystemService("layout_inflater"));
    paramc = ad.ee(this.context);
    this.hmV = paramc[0];
    this.hmW = paramc[1];
  }
  
  private int a(i parami)
  {
    if (parami != null)
    {
      View localView = parami.getView();
      int[] arrayOfInt = new int[2];
      localView.getLocationOnScreen(arrayOfInt);
      int k = arrayOfInt[1];
      int j = localView.getHeight() + k;
      x.v("ContentAdapter", "comp %s , top %d,bottom %d ", new Object[] { parami, Integer.valueOf(k), Integer.valueOf(j) });
      int i;
      if ((k >= 0) && (j <= this.hmW)) {
        i = localView.getHeight();
      }
      do
      {
        return i;
        if ((k >= 0) || (j <= 0)) {
          break;
        }
        i = j;
      } while (j <= this.hmW);
      if ((k < 0) && (j > this.hmW)) {
        return this.hmW;
      }
      if ((k < this.hmW) && (j > this.hmW)) {
        return this.hmW - k;
      }
    }
    return 0;
  }
  
  public final RecyclerView.t a(ViewGroup paramViewGroup, int paramInt)
  {
    return new a(LayoutInflater.from(paramViewGroup.getContext()).inflate(i.g.ad_landing_comp_item, paramViewGroup, false));
  }
  
  public final void a(int paramInt, b paramb)
  {
    Object localObject1 = (s)this.nHg.nIi.get(paramInt);
    i locali = (i)this.nHh.get(((s)localObject1).nAW);
    if (locali != null)
    {
      locali.bzA();
      Object localObject2 = locali.getView();
      locali.W(a(locali), ((View)localObject2).getHeight(), this.hmW);
      if ((((s)localObject1).type == 61) || (((s)localObject1).type == 62))
      {
        localObject1 = new ArrayList();
        paramb = paramb.nCP.entrySet().iterator();
        while (paramb.hasNext())
        {
          localObject2 = (Map.Entry)paramb.next();
          if (((b.a)((Map.Entry)localObject2).getValue()).nzR) {
            ((List)localObject1).add(((Map.Entry)localObject2).getKey());
          }
        }
        paramb = ((List)localObject1).iterator();
        while (paramb.hasNext())
        {
          int i = ((Integer)paramb.next()).intValue();
          if ((i != paramInt) && (wU(i)))
          {
            localObject1 = (s)this.nHg.nIi.get(i);
            localObject1 = (i)this.nHh.get(((s)localObject1).nAW);
            if ((localObject1 instanceof com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.a))
            {
              localObject1 = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.a)localObject1;
              if ((((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.a)localObject1).nzP) && (this.nHg.nIj) && (i == 0)) {
                ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.a)locali).bzy();
              } else if (((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.a)locali).nzP) {
                ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.a)localObject1).bzy();
              }
            }
          }
        }
      }
    }
  }
  
  public final void a(RecyclerView.t paramt, int paramInt)
  {
    x.i("ContentAdapter", "display page " + this.nHg.id + ", pos " + paramInt);
    locala = (a)paramt;
    a.a(locala).removeAllViews();
    locals = (s)this.nHg.nIi.get(paramInt);
    paramt = (i)this.nHh.get(locals.nAW);
    int j = this.bgColor;
    i = j;
    if (locals.nBf != null)
    {
      i = j;
      if (locals.nBf.length() > 0) {
        i = j;
      }
    }
    try
    {
      j = Color.parseColor(locals.nBf);
      i = j;
      a.a(locala).setBackgroundColor(j);
      i = j;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        x.e("ContentAdapter", "parse cellBackgroundColor error: %s", new Object[] { locals.nBf });
        continue;
        i locali = am.a(a.a(locala).getContext(), locals, a.a(locala), i);
        paramt = locali;
        if (locali != null)
        {
          this.nHh.put(locals.nAW, locali);
          paramt = locali;
        }
      }
    }
    if (paramt != null)
    {
      paramt.a((s)this.nHg.nIi.get(paramInt));
      if (paramt != null)
      {
        if ((paramt.getView().getParent() != null) && ((paramt.getView().getParent() instanceof ViewGroup))) {
          ((ViewGroup)paramt.getView().getParent()).removeView(paramt.getView());
        }
        a.a(locala).addView(paramt.getView());
      }
      return;
    }
  }
  
  public final int getItemCount()
  {
    return this.nHg.nIi.size();
  }
  
  public final int getItemViewType(int paramInt)
  {
    return paramInt;
  }
  
  public final void onDestroy()
  {
    Iterator localIterator = this.nHh.entrySet().iterator();
    while (localIterator.hasNext()) {
      ((i)((Map.Entry)localIterator.next()).getValue()).bzz();
    }
  }
  
  public final void wT(int paramInt)
  {
    if ((paramInt < 0) || (paramInt >= this.nHg.nIi.size())) {
      x.w("ContentAdapter", "endExposure index[%d], size[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(this.nHg.nIi.size()) });
    }
    Object localObject;
    do
    {
      return;
      localObject = (s)this.nHg.nIi.get(paramInt);
      localObject = (i)this.nHh.get(((s)localObject).nAW);
    } while (localObject == null);
    ((i)localObject).bzB();
  }
  
  public final boolean wU(int paramInt)
  {
    if ((paramInt < this.nCQ.fi()) || (paramInt > this.nCQ.fj()))
    {
      x.v("ContentAdapter", "index %d not visible");
      return false;
    }
    Object localObject = (s)this.nHg.nIi.get(paramInt);
    localObject = (i)this.nHh.get(((s)localObject).nAW);
    if (localObject != null)
    {
      paramInt = a((i)localObject);
      x.v("ContentAdapter", "comp %s, inScreenH %d", new Object[] { localObject, Integer.valueOf(paramInt) });
      return paramInt >= ((i)localObject).getView().getHeight() >>> 1;
    }
    return false;
  }
  
  public final class a
    extends RecyclerView.t
  {
    private LinearLayout fyt;
    
    public a(View paramView)
    {
      super();
      this.fyt = ((LinearLayout)paramView.findViewById(i.f.root));
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/widget/verticalviewpager/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */