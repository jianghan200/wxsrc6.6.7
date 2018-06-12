package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v7.a.a.a;
import android.support.v7.a.a.k;
import android.support.v7.e.a;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;

class l
{
  private static final int[] Ne = { 16842804, 16843119, 16843117, 16843120, 16843118 };
  private static final int[] Nf = { a.a.textAllCaps };
  final TextView Ng;
  private an Nh;
  private an Ni;
  private an Nj;
  private an Nk;
  
  l(TextView paramTextView)
  {
    this.Ng = paramTextView;
  }
  
  protected static an a(Context paramContext, h paramh, int paramInt)
  {
    paramContext = paramh.j(paramContext, paramInt);
    if (paramContext != null)
    {
      paramh = new an();
      paramh.Wu = true;
      paramh.Ws = paramContext;
      return paramh;
    }
    return null;
  }
  
  static l c(TextView paramTextView)
  {
    if (Build.VERSION.SDK_INT >= 17) {
      return new m(paramTextView);
    }
    return new l(paramTextView);
  }
  
  final void a(Drawable paramDrawable, an paraman)
  {
    if ((paramDrawable != null) && (paraman != null)) {
      h.a(paramDrawable, paraman, this.Ng.getDrawableState());
    }
  }
  
  void b(AttributeSet paramAttributeSet, int paramInt)
  {
    int j = 1;
    Context localContext = this.Ng.getContext();
    Object localObject = h.eJ();
    TypedArray localTypedArray = localContext.obtainStyledAttributes(paramAttributeSet, Ne, paramInt, 0);
    int i = localTypedArray.getResourceId(0, -1);
    if (localTypedArray.hasValue(1)) {
      this.Nh = a(localContext, (h)localObject, localTypedArray.getResourceId(1, 0));
    }
    if (localTypedArray.hasValue(2)) {
      this.Ni = a(localContext, (h)localObject, localTypedArray.getResourceId(2, 0));
    }
    if (localTypedArray.hasValue(3)) {
      this.Nj = a(localContext, (h)localObject, localTypedArray.getResourceId(3, 0));
    }
    if (localTypedArray.hasValue(4)) {
      this.Nk = a(localContext, (h)localObject, localTypedArray.getResourceId(4, 0));
    }
    localTypedArray.recycle();
    boolean bool;
    if (!(this.Ng.getTransformationMethod() instanceof PasswordTransformationMethod))
    {
      if (i == -1) {
        break label268;
      }
      localObject = localContext.obtainStyledAttributes(i, a.k.TextAppearance);
      if (!((TypedArray)localObject).hasValue(a.k.TextAppearance_textAllCaps)) {
        break label260;
      }
      bool = ((TypedArray)localObject).getBoolean(a.k.TextAppearance_textAllCaps, false);
      i = 1;
      ((TypedArray)localObject).recycle();
    }
    for (;;)
    {
      paramAttributeSet = localContext.obtainStyledAttributes(paramAttributeSet, Nf, paramInt, 0);
      if (paramAttributeSet.hasValue(0)) {
        bool = paramAttributeSet.getBoolean(0, false);
      }
      for (paramInt = j;; paramInt = i)
      {
        paramAttributeSet.recycle();
        if (paramInt != 0) {
          setAllCaps(bool);
        }
        return;
      }
      label260:
      i = 0;
      bool = false;
      break;
      label268:
      i = 0;
      bool = false;
    }
  }
  
  void eL()
  {
    if ((this.Nh != null) || (this.Ni != null) || (this.Nj != null) || (this.Nk != null))
    {
      Drawable[] arrayOfDrawable = this.Ng.getCompoundDrawables();
      a(arrayOfDrawable[0], this.Nh);
      a(arrayOfDrawable[1], this.Ni);
      a(arrayOfDrawable[2], this.Nj);
      a(arrayOfDrawable[3], this.Nk);
    }
  }
  
  final void l(Context paramContext, int paramInt)
  {
    paramContext = paramContext.obtainStyledAttributes(paramInt, Nf);
    if (paramContext.hasValue(0)) {
      setAllCaps(paramContext.getBoolean(0, false));
    }
    paramContext.recycle();
  }
  
  final void setAllCaps(boolean paramBoolean)
  {
    TextView localTextView = this.Ng;
    if (paramBoolean) {}
    for (a locala = new a(this.Ng.getContext());; locala = null)
    {
      localTextView.setTransformationMethod(locala);
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */