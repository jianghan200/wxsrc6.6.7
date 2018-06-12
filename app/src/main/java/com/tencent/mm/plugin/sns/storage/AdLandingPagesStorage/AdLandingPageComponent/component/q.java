package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.r;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.h;
import java.util.Collection;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

public final class q
  extends a
{
  private h nDl;
  LinearLayout nEE;
  
  public q(Context paramContext, r paramr, ViewGroup paramViewGroup)
  {
    super(paramContext, paramr, paramViewGroup);
  }
  
  public final void W(int paramInt1, int paramInt2, int paramInt3)
  {
    super.W(paramInt1, paramInt2, paramInt3);
    Iterator localIterator = this.nDl.bAu().iterator();
    while (localIterator.hasNext()) {
      ((i)localIterator.next()).W(paramInt1, paramInt2, paramInt3);
    }
  }
  
  public final void bzA()
  {
    super.bzA();
    Iterator localIterator = this.nDl.bAu().iterator();
    while (localIterator.hasNext()) {
      ((i)localIterator.next()).bzA();
    }
  }
  
  public final void bzB()
  {
    super.bzB();
    Iterator localIterator = this.nDl.bAu().iterator();
    while (localIterator.hasNext()) {
      ((i)localIterator.next()).bzB();
    }
  }
  
  public final View bzM()
  {
    View localView = this.contentView;
    this.nEE = ((LinearLayout)localView.findViewById(i.f.sns_ad_native_landing_pages_item_page_linear_layout));
    return localView;
  }
  
  protected final void bzQ()
  {
    if (((r)this.nDt).nAV == 0) {
      this.nEE.setOrientation(1);
    }
    while (this.nDl == null)
    {
      this.nDl = new h(((r)this.nDt).nAU, this.context, ((r)this.nDt).bgColor, this.nEE);
      this.nDl.bAD();
      return;
      if (((r)this.nDt).nAV == 1) {
        this.nEE.setOrientation(0);
      }
    }
    this.nDl.cl(((r)this.nDt).nAU);
  }
  
  public final void bzz()
  {
    super.bzz();
    Iterator localIterator = this.nDl.bAu().iterator();
    while (localIterator.hasNext()) {
      ((i)localIterator.next()).bzz();
    }
  }
  
  protected final int getLayout()
  {
    return i.g.sns_ad_native_landing_pages_item_linear_layout;
  }
  
  public final boolean r(JSONArray paramJSONArray)
  {
    Object localObject = new JSONObject();
    if (super.aa((JSONObject)localObject)) {
      paramJSONArray.put(localObject);
    }
    localObject = this.nDl.bAu().iterator();
    while (((Iterator)localObject).hasNext())
    {
      i locali = (i)((Iterator)localObject).next();
      JSONObject localJSONObject = new JSONObject();
      if ((locali != null) && (locali.aa(localJSONObject))) {
        paramJSONArray.put(localJSONObject);
      }
    }
    return true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */