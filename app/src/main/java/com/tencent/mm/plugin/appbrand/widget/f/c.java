package com.tencent.mm.plugin.appbrand.widget.f;

import android.view.View;
import android.widget.FrameLayout;
import java.util.concurrent.TimeUnit;

public abstract interface c
{
  public static final long gOS = TimeUnit.SECONDS.toMillis(4L);
  
  public abstract void a(FrameLayout paramFrameLayout);
  
  public abstract View getView();
  
  public abstract void wp(String paramString);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/f/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */