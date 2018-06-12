package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.support.v4.b.b;
import android.util.TypedValue;

final class al
{
  static final int[] EMPTY_STATE_SET = new int[0];
  static final int[] FOCUSED_STATE_SET;
  static final int[] PRESSED_STATE_SET;
  static final int[] SELECTED_STATE_SET;
  private static final ThreadLocal<TypedValue> Wn = new ThreadLocal();
  static final int[] Wo;
  static final int[] Wp;
  private static final int[] Wq = new int[1];
  static final int[] bh;
  static final int[] gc = { -16842910 };
  
  static
  {
    FOCUSED_STATE_SET = new int[] { 16842908 };
    Wo = new int[] { 16843518 };
    PRESSED_STATE_SET = new int[] { 16842919 };
    bh = new int[] { 16842912 };
    SELECTED_STATE_SET = new int[] { 16842913 };
    Wp = new int[] { -16842919, -16842908 };
  }
  
  static int a(Context paramContext, int paramInt, float paramFloat)
  {
    paramInt = m(paramContext, paramInt);
    return b.o(paramInt, Math.round(Color.alpha(paramInt) * paramFloat));
  }
  
  public static int m(Context paramContext, int paramInt)
  {
    Wq[0] = paramInt;
    paramContext = paramContext.obtainStyledAttributes(null, Wq);
    try
    {
      paramInt = paramContext.getColor(0, 0);
      return paramInt;
    }
    finally
    {
      paramContext.recycle();
    }
  }
  
  public static ColorStateList n(Context paramContext, int paramInt)
  {
    Wq[0] = paramInt;
    paramContext = paramContext.obtainStyledAttributes(null, Wq);
    try
    {
      ColorStateList localColorStateList = paramContext.getColorStateList(0);
      return localColorStateList;
    }
    finally
    {
      paramContext.recycle();
    }
  }
  
  public static int o(Context paramContext, int paramInt)
  {
    Object localObject = n(paramContext, paramInt);
    if ((localObject != null) && (((ColorStateList)localObject).isStateful())) {
      return ((ColorStateList)localObject).getColorForState(gc, ((ColorStateList)localObject).getDefaultColor());
    }
    TypedValue localTypedValue = (TypedValue)Wn.get();
    localObject = localTypedValue;
    if (localTypedValue == null)
    {
      localObject = new TypedValue();
      Wn.set(localObject);
    }
    paramContext.getTheme().resolveAttribute(16842803, (TypedValue)localObject, true);
    return a(paramContext, paramInt, ((TypedValue)localObject).getFloat());
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/al.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */