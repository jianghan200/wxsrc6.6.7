package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.TextView;

final class m
  extends l
{
  private static final int[] Nl = { 16843666, 16843667 };
  private an Nm;
  private an Nn;
  
  m(TextView paramTextView)
  {
    super(paramTextView);
  }
  
  final void b(AttributeSet paramAttributeSet, int paramInt)
  {
    super.b(paramAttributeSet, paramInt);
    Context localContext = this.Ng.getContext();
    h localh = h.eJ();
    paramAttributeSet = localContext.obtainStyledAttributes(paramAttributeSet, Nl, paramInt, 0);
    if (paramAttributeSet.hasValue(0)) {
      this.Nm = a(localContext, localh, paramAttributeSet.getResourceId(0, 0));
    }
    if (paramAttributeSet.hasValue(1)) {
      this.Nn = a(localContext, localh, paramAttributeSet.getResourceId(1, 0));
    }
    paramAttributeSet.recycle();
  }
  
  final void eL()
  {
    super.eL();
    if ((this.Nm != null) || (this.Nn != null))
    {
      Drawable[] arrayOfDrawable = this.Ng.getCompoundDrawablesRelative();
      a(arrayOfDrawable[0], this.Nm);
      a(arrayOfDrawable[2], this.Nn);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */