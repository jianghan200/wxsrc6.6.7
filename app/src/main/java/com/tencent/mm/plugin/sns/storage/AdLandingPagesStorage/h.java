package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage;

import android.content.Context;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.i;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.s;
import com.tencent.mm.plugin.sns.ui.am;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;

public final class h
{
  private int bgColor;
  private Context context;
  private int hmV;
  private int hmW;
  private ViewGroup mgl;
  private LinkedHashMap<String, i> nHh;
  private LayoutInflater nHi;
  private List<s> nIQ;
  
  public h(List<s> paramList, Context paramContext, int paramInt, ViewGroup paramViewGroup)
  {
    this.nIQ = paramList;
    this.context = paramContext;
    this.bgColor = paramInt;
    this.mgl = paramViewGroup;
  }
  
  public final void bAD()
  {
    if ((this.nIQ == null) || (this.nIQ.isEmpty())) {
      return;
    }
    if (this.nHh == null) {
      this.nHh = new LinkedHashMap();
    }
    Object localObject;
    if (this.nHi == null)
    {
      this.nHi = ((LayoutInflater)this.context.getSystemService("layout_inflater"));
      localObject = (WindowManager)this.context.getSystemService("window");
      this.hmV = ((WindowManager)localObject).getDefaultDisplay().getWidth();
      this.hmW = ((WindowManager)localObject).getDefaultDisplay().getHeight();
    }
    int i = 0;
    while (i < this.nIQ.size())
    {
      s locals = (s)this.nIQ.get(i);
      localObject = (i)this.nHh.get(locals.nAW);
      if (localObject != null) {
        ((i)localObject).a(locals);
      }
      try
      {
        label156:
        if (this.mgl != ((i)localObject).getView().getParent())
        {
          if (this.mgl.getChildCount() <= i) {
            break label243;
          }
          this.mgl.addView(((i)localObject).getView(), i);
        }
        for (;;)
        {
          i += 1;
          break;
          i locali = am.a(this.context, locals, this.mgl, this.bgColor);
          localObject = locali;
          if (locali == null) {
            break label156;
          }
          this.nHh.put(locals.nAW, locali);
          localObject = locali;
          break label156;
          label243:
          this.mgl.addView(((i)localObject).getView());
        }
      }
      catch (Exception localException)
      {
        for (;;)
        {
          x.e("CompRenderer", "component may have same id %s,%s", new Object[] { locals.nAW, bi.i(localException) });
        }
      }
    }
  }
  
  public final Collection<i> bAu()
  {
    if (this.nHh == null) {
      return Collections.EMPTY_LIST;
    }
    return this.nHh.values();
  }
  
  public final void cl(List<s> paramList)
  {
    if ((paramList != null) && (!paramList.equals(this.nIQ)))
    {
      this.nIQ = paramList;
      bAD();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */