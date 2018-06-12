package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.s;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class e
  extends a
{
  private List<i> ayR;
  private com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.e nDk;
  private h nDl;
  
  public e(Context paramContext, com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.e parame, ViewGroup paramViewGroup)
  {
    super(paramContext, parame, paramViewGroup);
    this.nDk = parame;
    this.ayR = new ArrayList();
  }
  
  public final void W(int paramInt1, int paramInt2, int paramInt3)
  {
    super.W(paramInt1, paramInt2, paramInt3);
    Iterator localIterator = this.ayR.iterator();
    while (localIterator.hasNext()) {
      ((i)localIterator.next()).W(paramInt1, paramInt2, paramInt3);
    }
  }
  
  public final void a(s params)
  {
    if ((params instanceof com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.e)) {
      this.nDk = ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.e)params);
    }
    super.a(params);
  }
  
  public final void bzA()
  {
    super.bzA();
    Iterator localIterator = this.ayR.iterator();
    while (localIterator.hasNext()) {
      ((i)localIterator.next()).bzA();
    }
  }
  
  public final void bzB()
  {
    super.bzB();
    Iterator localIterator = this.ayR.iterator();
    while (localIterator.hasNext()) {
      ((i)localIterator.next()).bzB();
    }
  }
  
  protected final void bzQ()
  {
    if (this.nDl == null)
    {
      this.nDl = new h(this.nDk.ayR, this.context, 0, (FrameLayout)this.contentView);
      this.nDl.bAD();
      return;
    }
    this.nDl.cl(this.nDk.ayR);
  }
  
  protected final View bzR()
  {
    return new FrameLayout(this.context);
  }
  
  public final void bzz()
  {
    super.bzz();
    Iterator localIterator = this.ayR.iterator();
    while (localIterator.hasNext()) {
      ((i)localIterator.next()).bzz();
    }
  }
  
  public final boolean r(JSONArray paramJSONArray)
  {
    Object localObject = new JSONObject();
    if (super.aa((JSONObject)localObject)) {
      paramJSONArray.put(localObject);
    }
    localObject = this.ayR.iterator();
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


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */