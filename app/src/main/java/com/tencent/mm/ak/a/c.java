package com.tencent.mm.ak.a;

import android.view.View;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

public final class c
{
  public WeakReference<ImageView> dWX;
  public int height = 0;
  private String url = "";
  public int width = 0;
  
  public c(ImageView paramImageView, String paramString)
  {
    this.dWX = new WeakReference(paramImageView);
    this.url = paramString;
  }
  
  public final int Pr()
  {
    View localView = null;
    if (this.dWX != null) {
      localView = (View)this.dWX.get();
    }
    if (localView == null) {
      return super.hashCode();
    }
    return localView.hashCode();
  }
  
  public final ImageView getImageView()
  {
    if (this.dWX != null)
    {
      ImageView localImageView = (ImageView)this.dWX.get();
      if (localImageView != null) {
        return localImageView;
      }
    }
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/ak/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */