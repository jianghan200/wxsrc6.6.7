package com.tencent.mm.plugin.appbrand.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.widget.ImageView;
import com.tencent.mm.plugin.appbrand.jsapi.base.e;

@SuppressLint({"AppCompatCustomView"})
public class b
  extends ImageView
  implements e
{
  private boolean gEe;
  
  public b(Context paramContext)
  {
    super(paramContext);
  }
  
  public final boolean ail()
  {
    return this.gEe;
  }
  
  public void setInterceptEvent(boolean paramBoolean)
  {
    this.gEe = paramBoolean;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */