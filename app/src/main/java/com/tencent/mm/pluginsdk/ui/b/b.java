package com.tencent.mm.pluginsdk.ui.b;

import android.content.Context;
import android.view.View;
import java.lang.ref.WeakReference;

public abstract class b
  implements a
{
  public WeakReference<Context> qJS = null;
  public View view = null;
  
  public b(Context paramContext)
  {
    this.qJS = new WeakReference(paramContext);
    if (getLayoutId() > 0) {
      this.view = View.inflate((Context)this.qJS.get(), getLayoutId(), null);
    }
  }
  
  public boolean anR()
  {
    return (this.view != null) && (this.view.getVisibility() == 0);
  }
  
  public abstract void destroy();
  
  public abstract int getLayoutId();
  
  public int getOrder()
  {
    return 0;
  }
  
  public View getView()
  {
    return this.view;
  }
  
  public void release() {}
  
  public void setVisibility(int paramInt)
  {
    if (getView() != null) {
      getView().setVisibility(paramInt);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/pluginsdk/ui/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */