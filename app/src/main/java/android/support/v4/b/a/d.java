package android.support.v4.b.a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;

class d
  extends Drawable
  implements Drawable.Callback, c, l
{
  static final PorterDuff.Mode jK = PorterDuff.Mode.SRC_IN;
  private boolean jO;
  Drawable mDrawable;
  private int ru;
  private PorterDuff.Mode rv;
  private boolean rw;
  a rx;
  
  d(Drawable paramDrawable)
  {
    this.rx = bE();
    j(paramDrawable);
  }
  
  d(a parama, Resources paramResources)
  {
    this.rx = parama;
    if ((this.rx != null) && (this.rx.ry != null)) {
      j(a(this.rx.ry, paramResources));
    }
  }
  
  private boolean d(int[] paramArrayOfInt)
  {
    if (!bF()) {}
    PorterDuff.Mode localMode;
    int i;
    do
    {
      return false;
      ColorStateList localColorStateList = this.rx.kI;
      localMode = this.rx.kJ;
      if ((localColorStateList == null) || (localMode == null)) {
        break;
      }
      i = localColorStateList.getColorForState(paramArrayOfInt, localColorStateList.getDefaultColor());
    } while ((this.rw) && (i == this.ru) && (localMode == this.rv));
    setColorFilter(i, localMode);
    this.ru = i;
    this.rv = localMode;
    this.rw = true;
    return true;
    this.rw = false;
    clearColorFilter();
    return false;
  }
  
  protected Drawable a(Drawable.ConstantState paramConstantState, Resources paramResources)
  {
    return paramConstantState.newDrawable();
  }
  
  public final Drawable bD()
  {
    return this.mDrawable;
  }
  
  a bE()
  {
    return new b(this.rx);
  }
  
  protected boolean bF()
  {
    return true;
  }
  
  public void draw(Canvas paramCanvas)
  {
    this.mDrawable.draw(paramCanvas);
  }
  
  public int getChangingConfigurations()
  {
    int j = super.getChangingConfigurations();
    if (this.rx != null) {}
    for (int i = this.rx.getChangingConfigurations();; i = 0) {
      return i | j | this.mDrawable.getChangingConfigurations();
    }
  }
  
  public Drawable.ConstantState getConstantState()
  {
    if (this.rx != null)
    {
      if (this.rx.ry != null) {}
      for (int i = 1; i != 0; i = 0)
      {
        this.rx.jA = getChangingConfigurations();
        return this.rx;
      }
    }
    return null;
  }
  
  public Drawable getCurrent()
  {
    return this.mDrawable.getCurrent();
  }
  
  public int getIntrinsicHeight()
  {
    return this.mDrawable.getIntrinsicHeight();
  }
  
  public int getIntrinsicWidth()
  {
    return this.mDrawable.getIntrinsicWidth();
  }
  
  public int getMinimumHeight()
  {
    return this.mDrawable.getMinimumHeight();
  }
  
  public int getMinimumWidth()
  {
    return this.mDrawable.getMinimumWidth();
  }
  
  public int getOpacity()
  {
    return this.mDrawable.getOpacity();
  }
  
  public boolean getPadding(Rect paramRect)
  {
    return this.mDrawable.getPadding(paramRect);
  }
  
  public int[] getState()
  {
    return this.mDrawable.getState();
  }
  
  public Region getTransparentRegion()
  {
    return this.mDrawable.getTransparentRegion();
  }
  
  public void invalidateDrawable(Drawable paramDrawable)
  {
    invalidateSelf();
  }
  
  public boolean isStateful()
  {
    if ((bF()) && (this.rx != null)) {}
    for (ColorStateList localColorStateList = this.rx.kI; ((localColorStateList != null) && (localColorStateList.isStateful())) || (this.mDrawable.isStateful()); localColorStateList = null) {
      return true;
    }
    return false;
  }
  
  public final void j(Drawable paramDrawable)
  {
    if (this.mDrawable != null) {
      this.mDrawable.setCallback(null);
    }
    this.mDrawable = paramDrawable;
    if (paramDrawable != null)
    {
      paramDrawable.setCallback(this);
      paramDrawable.setVisible(isVisible(), true);
      paramDrawable.setState(getState());
      paramDrawable.setLevel(getLevel());
      paramDrawable.setBounds(getBounds());
      if (this.rx != null) {
        this.rx.ry = paramDrawable.getConstantState();
      }
    }
    invalidateSelf();
  }
  
  public Drawable mutate()
  {
    a locala;
    if ((!this.jO) && (super.mutate() == this))
    {
      this.rx = bE();
      if (this.mDrawable != null) {
        this.mDrawable.mutate();
      }
      if (this.rx != null)
      {
        locala = this.rx;
        if (this.mDrawable == null) {
          break label77;
        }
      }
    }
    label77:
    for (Drawable.ConstantState localConstantState = this.mDrawable.getConstantState();; localConstantState = null)
    {
      locala.ry = localConstantState;
      this.jO = true;
      return this;
    }
  }
  
  protected void onBoundsChange(Rect paramRect)
  {
    if (this.mDrawable != null) {
      this.mDrawable.setBounds(paramRect);
    }
  }
  
  protected boolean onLevelChange(int paramInt)
  {
    return this.mDrawable.setLevel(paramInt);
  }
  
  public void scheduleDrawable(Drawable paramDrawable, Runnable paramRunnable, long paramLong)
  {
    scheduleSelf(paramRunnable, paramLong);
  }
  
  public void setAlpha(int paramInt)
  {
    this.mDrawable.setAlpha(paramInt);
  }
  
  public void setChangingConfigurations(int paramInt)
  {
    this.mDrawable.setChangingConfigurations(paramInt);
  }
  
  public void setColorFilter(ColorFilter paramColorFilter)
  {
    this.mDrawable.setColorFilter(paramColorFilter);
  }
  
  public void setDither(boolean paramBoolean)
  {
    this.mDrawable.setDither(paramBoolean);
  }
  
  public void setFilterBitmap(boolean paramBoolean)
  {
    this.mDrawable.setFilterBitmap(paramBoolean);
  }
  
  public boolean setState(int[] paramArrayOfInt)
  {
    boolean bool = this.mDrawable.setState(paramArrayOfInt);
    return (d(paramArrayOfInt)) || (bool);
  }
  
  public void setTint(int paramInt)
  {
    setTintList(ColorStateList.valueOf(paramInt));
  }
  
  public void setTintList(ColorStateList paramColorStateList)
  {
    this.rx.kI = paramColorStateList;
    d(getState());
  }
  
  public void setTintMode(PorterDuff.Mode paramMode)
  {
    this.rx.kJ = paramMode;
    d(getState());
  }
  
  public boolean setVisible(boolean paramBoolean1, boolean paramBoolean2)
  {
    return (super.setVisible(paramBoolean1, paramBoolean2)) || (this.mDrawable.setVisible(paramBoolean1, paramBoolean2));
  }
  
  public void unscheduleDrawable(Drawable paramDrawable, Runnable paramRunnable)
  {
    unscheduleSelf(paramRunnable);
  }
  
  protected static abstract class a
    extends Drawable.ConstantState
  {
    int jA;
    ColorStateList kI = null;
    PorterDuff.Mode kJ = d.jK;
    Drawable.ConstantState ry;
    
    a(a parama)
    {
      if (parama != null)
      {
        this.jA = parama.jA;
        this.ry = parama.ry;
        this.kI = parama.kI;
        this.kJ = parama.kJ;
      }
    }
    
    public int getChangingConfigurations()
    {
      int j = this.jA;
      if (this.ry != null) {}
      for (int i = this.ry.getChangingConfigurations();; i = 0) {
        return i | j;
      }
    }
    
    public Drawable newDrawable()
    {
      return newDrawable(null);
    }
    
    public abstract Drawable newDrawable(Resources paramResources);
  }
  
  private static final class b
    extends d.a
  {
    b(d.a parama)
    {
      super();
    }
    
    public final Drawable newDrawable(Resources paramResources)
    {
      return new d(this, paramResources);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/b/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */