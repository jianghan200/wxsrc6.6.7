package android.support.v7.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.support.v4.widget.m;
import android.support.v7.a.a.k;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.widget.PopupWindow;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

public class AppCompatPopupWindow
  extends PopupWindow
{
  private static final boolean ME;
  private boolean MF;
  
  static
  {
    if (Build.VERSION.SDK_INT < 21) {}
    for (boolean bool = true;; bool = false)
    {
      ME = bool;
      return;
    }
  }
  
  public AppCompatPopupWindow(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    paramContext = ap.a(paramContext, paramAttributeSet, a.k.PopupWindow, paramInt);
    boolean bool;
    if (paramContext.hasValue(a.k.PopupWindow_overlapAnchor))
    {
      bool = paramContext.getBoolean(a.k.PopupWindow_overlapAnchor, false);
      if (!ME) {
        break label124;
      }
      this.MF = bool;
    }
    for (;;)
    {
      setBackgroundDrawable(paramContext.getDrawable(a.k.PopupWindow_android_popupBackground));
      paramContext.Ww.recycle();
      if (Build.VERSION.SDK_INT < 14) {}
      label124:
      try
      {
        paramContext = PopupWindow.class.getDeclaredField("mAnchor");
        paramContext.setAccessible(true);
        paramAttributeSet = PopupWindow.class.getDeclaredField("mOnScrollChangedListener");
        paramAttributeSet.setAccessible(true);
        paramAttributeSet.set(this, new ViewTreeObserver.OnScrollChangedListener()
        {
          public final void onScrollChanged()
          {
            try
            {
              WeakReference localWeakReference = (WeakReference)this.MG.get(jdField_this);
              if (localWeakReference != null)
              {
                if (localWeakReference.get() == null) {
                  return;
                }
                this.MI.onScrollChanged();
                return;
              }
            }
            catch (IllegalAccessException localIllegalAccessException) {}
          }
        });
        return;
      }
      catch (Exception paramContext) {}
      m.a(this, bool);
    }
  }
  
  public void showAsDropDown(View paramView, int paramInt1, int paramInt2)
  {
    int i = paramInt2;
    if (ME)
    {
      i = paramInt2;
      if (this.MF) {
        i = paramInt2 - paramView.getHeight();
      }
    }
    super.showAsDropDown(paramView, paramInt1, i);
  }
  
  @TargetApi(19)
  public void showAsDropDown(View paramView, int paramInt1, int paramInt2, int paramInt3)
  {
    int i = paramInt2;
    if (ME)
    {
      i = paramInt2;
      if (this.MF) {
        i = paramInt2 - paramView.getHeight();
      }
    }
    super.showAsDropDown(paramView, paramInt1, i, paramInt3);
  }
  
  public void update(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if ((ME) && (this.MF)) {
      paramInt2 -= paramView.getHeight();
    }
    for (;;)
    {
      super.update(paramView, paramInt1, paramInt2, paramInt3, paramInt4);
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/AppCompatPopupWindow.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */