package android.support.v7.widget;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v4.content.a;
import android.support.v7.a.a.k;
import android.util.AttributeSet;
import android.widget.ImageView;

public final class i
{
  private final ImageView MD;
  private final h Mb;
  
  public i(ImageView paramImageView, h paramh)
  {
    this.MD = paramImageView;
    this.Mb = paramh;
  }
  
  public final void b(AttributeSet paramAttributeSet, int paramInt)
  {
    paramAttributeSet = ap.a(this.MD.getContext(), paramAttributeSet, a.k.AppCompatImageView, paramInt);
    try
    {
      Drawable localDrawable = paramAttributeSet.bP(a.k.AppCompatImageView_android_src);
      if (localDrawable != null) {
        this.MD.setImageDrawable(localDrawable);
      }
      paramInt = paramAttributeSet.getResourceId(a.k.AppCompatImageView_srcCompat, -1);
      if (paramInt != -1)
      {
        localDrawable = this.Mb.a(this.MD.getContext(), paramInt, false);
        if (localDrawable != null) {
          this.MD.setImageDrawable(localDrawable);
        }
      }
      localDrawable = this.MD.getDrawable();
      if (localDrawable != null) {
        w.m(localDrawable);
      }
      return;
    }
    finally
    {
      paramAttributeSet.Ww.recycle();
    }
  }
  
  public final void setImageResource(int paramInt)
  {
    if (paramInt != 0)
    {
      if (this.Mb != null) {}
      for (Drawable localDrawable = this.Mb.a(this.MD.getContext(), paramInt, false);; localDrawable = a.f(this.MD.getContext(), paramInt))
      {
        if (localDrawable != null) {
          w.m(localDrawable);
        }
        this.MD.setImageDrawable(localDrawable);
        return;
      }
    }
    this.MD.setImageDrawable(null);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */