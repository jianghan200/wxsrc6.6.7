package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.a;

import android.support.v4.app.Fragment;
import android.support.v4.app.m;
import android.support.v4.app.o;
import java.util.ArrayList;
import java.util.List;

public final class c
  extends o
{
  public List<Fragment> nB = new ArrayList();
  
  public c(m paramm, List<Fragment> paramList)
  {
    super(paramm);
    this.nB = paramList;
  }
  
  public final Fragment V(int paramInt)
  {
    return (Fragment)this.nB.get(paramInt);
  }
  
  public final void a(Fragment paramFragment, int paramInt)
  {
    this.nB.remove(paramFragment);
    if (paramInt >= this.nB.size())
    {
      this.nB.add(paramFragment);
      return;
    }
    this.nB.add(paramInt, paramFragment);
  }
  
  public final CharSequence cb()
  {
    return "";
  }
  
  public final int getCount()
  {
    return this.nB.size();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/widget/verticalviewpager/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */