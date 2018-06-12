package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.p;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.CircularImageView;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.d;

public final class m
  extends a
{
  CircularImageView nDJ;
  
  public m(Context paramContext, p paramp, ViewGroup paramViewGroup)
  {
    super(paramContext, paramp, paramViewGroup);
  }
  
  public final View bzM()
  {
    this.nDJ = ((CircularImageView)this.contentView);
    return this.contentView;
  }
  
  protected final void bzQ()
  {
    if ((this.contentView == null) || (this.nDJ == null)) {}
    p localp;
    do
    {
      return;
      localp = (p)this.nDt;
    } while (localp == null);
    d.a(localp.nAL, localp.nAX, new m.1(this));
  }
  
  protected final View bzR()
  {
    return new CircularImageView(this.context);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */