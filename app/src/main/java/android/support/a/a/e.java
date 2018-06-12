package android.support.a.a;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.support.v4.b.a.a;
import android.support.v4.b.a.l;
import android.util.AttributeSet;

@TargetApi(21)
abstract class e
  extends Drawable
  implements l
{
  Drawable jJ;
  
  static TypedArray a(Resources paramResources, Resources.Theme paramTheme, AttributeSet paramAttributeSet, int[] paramArrayOfInt)
  {
    if (paramTheme == null) {
      return paramResources.obtainAttributes(paramAttributeSet, paramArrayOfInt);
    }
    return paramTheme.obtainStyledAttributes(paramAttributeSet, paramArrayOfInt, 0, 0);
  }
  
  public void applyTheme(Resources.Theme paramTheme)
  {
    if (this.jJ != null) {
      a.a(this.jJ, paramTheme);
    }
  }
  
  public void clearColorFilter()
  {
    if (this.jJ != null)
    {
      this.jJ.clearColorFilter();
      return;
    }
    super.clearColorFilter();
  }
  
  public ColorFilter getColorFilter()
  {
    if (this.jJ != null) {
      return a.f(this.jJ);
    }
    return null;
  }
  
  public Drawable getCurrent()
  {
    if (this.jJ != null) {
      return this.jJ.getCurrent();
    }
    return super.getCurrent();
  }
  
  public int getLayoutDirection()
  {
    if (this.jJ != null) {
      a.i(this.jJ);
    }
    return 0;
  }
  
  public int getMinimumHeight()
  {
    if (this.jJ != null) {
      return this.jJ.getMinimumHeight();
    }
    return super.getMinimumHeight();
  }
  
  public int getMinimumWidth()
  {
    if (this.jJ != null) {
      return this.jJ.getMinimumWidth();
    }
    return super.getMinimumWidth();
  }
  
  public boolean getPadding(Rect paramRect)
  {
    if (this.jJ != null) {
      return this.jJ.getPadding(paramRect);
    }
    return super.getPadding(paramRect);
  }
  
  public int[] getState()
  {
    if (this.jJ != null) {
      return this.jJ.getState();
    }
    return super.getState();
  }
  
  public Region getTransparentRegion()
  {
    if (this.jJ != null) {
      return this.jJ.getTransparentRegion();
    }
    return super.getTransparentRegion();
  }
  
  public boolean isAutoMirrored()
  {
    if (this.jJ != null) {
      a.c(this.jJ);
    }
    return false;
  }
  
  public void jumpToCurrentState()
  {
    if (this.jJ != null) {
      a.b(this.jJ);
    }
  }
  
  protected void onBoundsChange(Rect paramRect)
  {
    if (this.jJ != null)
    {
      this.jJ.setBounds(paramRect);
      return;
    }
    super.onBoundsChange(paramRect);
  }
  
  protected boolean onLevelChange(int paramInt)
  {
    if (this.jJ != null) {
      return this.jJ.setLevel(paramInt);
    }
    return super.onLevelChange(paramInt);
  }
  
  public void setAutoMirrored(boolean paramBoolean)
  {
    if (this.jJ != null) {
      a.a(this.jJ, paramBoolean);
    }
  }
  
  public void setChangingConfigurations(int paramInt)
  {
    if (this.jJ != null)
    {
      this.jJ.setChangingConfigurations(paramInt);
      return;
    }
    super.setChangingConfigurations(paramInt);
  }
  
  public void setColorFilter(int paramInt, PorterDuff.Mode paramMode)
  {
    if (this.jJ != null)
    {
      this.jJ.setColorFilter(paramInt, paramMode);
      return;
    }
    super.setColorFilter(paramInt, paramMode);
  }
  
  public void setFilterBitmap(boolean paramBoolean)
  {
    if (this.jJ != null) {
      this.jJ.setFilterBitmap(paramBoolean);
    }
  }
  
  public void setHotspot(float paramFloat1, float paramFloat2)
  {
    if (this.jJ != null) {
      a.a(this.jJ, paramFloat1, paramFloat2);
    }
  }
  
  public void setHotspotBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (this.jJ != null) {
      a.a(this.jJ, paramInt1, paramInt2, paramInt3, paramInt4);
    }
  }
  
  public boolean setState(int[] paramArrayOfInt)
  {
    if (this.jJ != null) {
      return this.jJ.setState(paramArrayOfInt);
    }
    return super.setState(paramArrayOfInt);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/a/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */