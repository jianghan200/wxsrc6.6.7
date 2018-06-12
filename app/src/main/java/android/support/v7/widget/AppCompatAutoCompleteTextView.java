package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.v4.view.x;
import android.support.v7.a.a.a;
import android.util.AttributeSet;
import android.widget.AutoCompleteTextView;

public class AppCompatAutoCompleteTextView
  extends AutoCompleteTextView
  implements x
{
  private static final int[] HN = { 16843126 };
  private h Mb = h.eJ();
  private f Mc;
  private l Md;
  
  public AppCompatAutoCompleteTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, a.a.autoCompleteTextViewStyle);
  }
  
  public AppCompatAutoCompleteTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(am.T(paramContext), paramAttributeSet, paramInt);
    paramContext = ap.a(getContext(), paramAttributeSet, HN, paramInt);
    if (paramContext.hasValue(0)) {
      setDropDownBackgroundDrawable(paramContext.getDrawable(0));
    }
    paramContext.Ww.recycle();
    this.Mc = new f(this, this.Mb);
    this.Mc.b(paramAttributeSet, paramInt);
    this.Md = l.c(this);
    this.Md.b(paramAttributeSet, paramInt);
    this.Md.eL();
  }
  
  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    if (this.Mc != null) {
      this.Mc.eG();
    }
    if (this.Md != null) {
      this.Md.eL();
    }
  }
  
  public ColorStateList getSupportBackgroundTintList()
  {
    if (this.Mc != null) {
      return this.Mc.getSupportBackgroundTintList();
    }
    return null;
  }
  
  public PorterDuff.Mode getSupportBackgroundTintMode()
  {
    if (this.Mc != null) {
      return this.Mc.getSupportBackgroundTintMode();
    }
    return null;
  }
  
  public void setBackgroundDrawable(Drawable paramDrawable)
  {
    super.setBackgroundDrawable(paramDrawable);
    if (this.Mc != null) {
      this.Mc.b(null);
    }
  }
  
  public void setBackgroundResource(int paramInt)
  {
    super.setBackgroundResource(paramInt);
    if (this.Mc != null) {
      this.Mc.aT(paramInt);
    }
  }
  
  public void setDropDownBackgroundResource(int paramInt)
  {
    if (this.Mb != null)
    {
      setDropDownBackgroundDrawable(this.Mb.a(getContext(), paramInt, false));
      return;
    }
    super.setDropDownBackgroundResource(paramInt);
  }
  
  public void setSupportBackgroundTintList(ColorStateList paramColorStateList)
  {
    if (this.Mc != null) {
      this.Mc.setSupportBackgroundTintList(paramColorStateList);
    }
  }
  
  public void setSupportBackgroundTintMode(PorterDuff.Mode paramMode)
  {
    if (this.Mc != null) {
      this.Mc.setSupportBackgroundTintMode(paramMode);
    }
  }
  
  public void setTextAppearance(Context paramContext, int paramInt)
  {
    super.setTextAppearance(paramContext, paramInt);
    if (this.Md != null) {
      this.Md.l(paramContext, paramInt);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/AppCompatAutoCompleteTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */