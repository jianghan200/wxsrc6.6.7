package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.view.z;
import android.support.v7.a.a.k;
import android.util.AttributeSet;
import android.view.View;

final class f
{
  private final h Mb;
  private an Me;
  private an Mf;
  private an Mg;
  private final View mView;
  
  f(View paramView, h paramh)
  {
    this.mView = paramView;
    this.Mb = paramh;
  }
  
  final void aT(int paramInt)
  {
    if (this.Mb != null) {}
    for (ColorStateList localColorStateList = this.Mb.j(this.mView.getContext(), paramInt);; localColorStateList = null)
    {
      b(localColorStateList);
      return;
    }
  }
  
  final void b(ColorStateList paramColorStateList)
  {
    if (paramColorStateList != null)
    {
      if (this.Me == null) {
        this.Me = new an();
      }
      this.Me.Ws = paramColorStateList;
      this.Me.Wu = true;
    }
    for (;;)
    {
      eG();
      return;
      this.Me = null;
    }
  }
  
  final void b(AttributeSet paramAttributeSet, int paramInt)
  {
    paramAttributeSet = this.mView.getContext().obtainStyledAttributes(paramAttributeSet, a.k.ViewBackgroundHelper, paramInt, 0);
    try
    {
      if (paramAttributeSet.hasValue(a.k.ViewBackgroundHelper_android_background))
      {
        ColorStateList localColorStateList = this.Mb.j(this.mView.getContext(), paramAttributeSet.getResourceId(a.k.ViewBackgroundHelper_android_background, -1));
        if (localColorStateList != null) {
          b(localColorStateList);
        }
      }
      if (paramAttributeSet.hasValue(a.k.ViewBackgroundHelper_backgroundTint)) {
        z.a(this.mView, paramAttributeSet.getColorStateList(a.k.ViewBackgroundHelper_backgroundTint));
      }
      if (paramAttributeSet.hasValue(a.k.ViewBackgroundHelper_backgroundTintMode)) {
        z.a(this.mView, w.aZ(paramAttributeSet.getInt(a.k.ViewBackgroundHelper_backgroundTintMode, -1)));
      }
      return;
    }
    finally
    {
      paramAttributeSet.recycle();
    }
  }
  
  final void eG()
  {
    int i = 0;
    Drawable localDrawable = this.mView.getBackground();
    if (localDrawable != null)
    {
      if (Build.VERSION.SDK_INT != 21) {
        break label148;
      }
      if (this.Mg == null) {
        this.Mg = new an();
      }
      an localan = this.Mg;
      localan.Ws = null;
      localan.Wu = false;
      localan.kJ = null;
      localan.Wt = false;
      Object localObject = z.ae(this.mView);
      if (localObject != null)
      {
        localan.Wu = true;
        localan.Ws = ((ColorStateList)localObject);
      }
      localObject = z.af(this.mView);
      if (localObject != null)
      {
        localan.Wt = true;
        localan.kJ = ((PorterDuff.Mode)localObject);
      }
      if ((localan.Wu) || (localan.Wt))
      {
        h.a(localDrawable, localan, this.mView.getDrawableState());
        i = 1;
      }
      if (i == 0) {
        break label148;
      }
    }
    label148:
    do
    {
      return;
      if (this.Mf != null)
      {
        h.a(localDrawable, this.Mf, this.mView.getDrawableState());
        return;
      }
    } while (this.Me == null);
    h.a(localDrawable, this.Me, this.mView.getDrawableState());
  }
  
  final ColorStateList getSupportBackgroundTintList()
  {
    if (this.Mf != null) {
      return this.Mf.Ws;
    }
    return null;
  }
  
  final PorterDuff.Mode getSupportBackgroundTintMode()
  {
    if (this.Mf != null) {
      return this.Mf.kJ;
    }
    return null;
  }
  
  final void setSupportBackgroundTintList(ColorStateList paramColorStateList)
  {
    if (this.Mf == null) {
      this.Mf = new an();
    }
    this.Mf.Ws = paramColorStateList;
    this.Mf.Wu = true;
    eG();
  }
  
  final void setSupportBackgroundTintMode(PorterDuff.Mode paramMode)
  {
    if (this.Mf == null) {
      this.Mf = new an();
    }
    this.Mf.kJ = paramMode;
    this.Mf.Wt = true;
    eG();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */