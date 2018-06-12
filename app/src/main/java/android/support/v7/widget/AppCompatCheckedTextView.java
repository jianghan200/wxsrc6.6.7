package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.CheckedTextView;

public class AppCompatCheckedTextView
  extends CheckedTextView
{
  private static final int[] HN = { 16843016 };
  private h Mb;
  private l Md = l.c(this);
  
  public AppCompatCheckedTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 16843720);
  }
  
  public AppCompatCheckedTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(am.T(paramContext), paramAttributeSet, paramInt);
    this.Md.b(paramAttributeSet, paramInt);
    this.Md.eL();
    this.Mb = h.eJ();
    paramContext = ap.a(getContext(), paramAttributeSet, HN, paramInt);
    setCheckMarkDrawable(paramContext.getDrawable(0));
    paramContext.Ww.recycle();
  }
  
  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    if (this.Md != null) {
      this.Md.eL();
    }
  }
  
  public void setCheckMarkDrawable(int paramInt)
  {
    if (this.Mb != null)
    {
      setCheckMarkDrawable(this.Mb.a(getContext(), paramInt, false));
      return;
    }
    super.setCheckMarkDrawable(paramInt);
  }
  
  public void setTextAppearance(Context paramContext, int paramInt)
  {
    super.setTextAppearance(paramContext, paramInt);
    if (this.Md != null) {
      this.Md.l(paramContext, paramInt);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/AppCompatCheckedTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */