package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.support.v4.view.ai;
import android.support.v4.view.am;
import android.support.v4.view.o;
import android.support.v4.view.z;
import android.support.v7.a.a.g;
import android.support.v7.a.a.k;
import android.support.v7.view.menu.f;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;

abstract class a
  extends ViewGroup
{
  protected final a Jm = new a();
  protected final Context Jn;
  protected ActionMenuView Jo;
  protected ActionMenuPresenter Jp;
  protected int Jq;
  protected ai Jr;
  private boolean Js;
  private boolean Jt;
  
  a(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    paramAttributeSet = new TypedValue();
    if ((paramContext.getTheme().resolveAttribute(android.support.v7.a.a.a.actionBarPopupTheme, paramAttributeSet, true)) && (paramAttributeSet.resourceId != 0))
    {
      this.Jn = new ContextThemeWrapper(paramContext, paramAttributeSet.resourceId);
      return;
    }
    this.Jn = paramContext;
  }
  
  protected static int a(View paramView, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    int i = paramView.getMeasuredWidth();
    int j = paramView.getMeasuredHeight();
    paramInt2 = (paramInt3 - j) / 2 + paramInt2;
    if (paramBoolean) {
      paramView.layout(paramInt1 - i, paramInt2, paramInt1, j + paramInt2);
    }
    for (;;)
    {
      paramInt1 = i;
      if (paramBoolean) {
        paramInt1 = -i;
      }
      return paramInt1;
      paramView.layout(paramInt1, paramInt2, paramInt1 + i, j + paramInt2);
    }
  }
  
  protected static int c(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    if (paramBoolean) {
      return paramInt1 - paramInt2;
    }
    return paramInt1 + paramInt2;
  }
  
  protected static int f(View paramView, int paramInt1, int paramInt2)
  {
    paramView.measure(View.MeasureSpec.makeMeasureSpec(paramInt1, Integer.MIN_VALUE), paramInt2);
    return Math.max(0, paramInt1 - paramView.getMeasuredWidth() + 0);
  }
  
  public ai c(int paramInt, long paramLong)
  {
    if (this.Jr != null) {
      this.Jr.cancel();
    }
    if (paramInt == 0)
    {
      if (getVisibility() != 0) {
        z.d(this, 0.0F);
      }
      localai = z.U(this).t(1.0F);
      localai.h(paramLong);
      localai.a(this.Jm.a(localai, paramInt));
      return localai;
    }
    ai localai = z.U(this).t(0.0F);
    localai.h(paramLong);
    localai.a(this.Jm.a(localai, paramInt));
    return localai;
  }
  
  public int getAnimatedVisibility()
  {
    if (this.Jr != null) {
      return this.Jm.Jv;
    }
    return getVisibility();
  }
  
  public int getContentHeight()
  {
    return this.Jq;
  }
  
  protected void onConfigurationChanged(Configuration paramConfiguration)
  {
    if (Build.VERSION.SDK_INT >= 8) {
      super.onConfigurationChanged(paramConfiguration);
    }
    paramConfiguration = getContext().obtainStyledAttributes(null, a.k.ActionBar, android.support.v7.a.a.a.actionBarStyle, 0);
    setContentHeight(paramConfiguration.getLayoutDimension(a.k.ActionBar_height, 0));
    paramConfiguration.recycle();
    if (this.Jp != null)
    {
      paramConfiguration = this.Jp;
      if (!paramConfiguration.Kw) {
        paramConfiguration.Kv = paramConfiguration.mContext.getResources().getInteger(a.g.abc_max_action_buttons);
      }
      if (paramConfiguration.bq != null) {
        paramConfiguration.bq.p(true);
      }
    }
  }
  
  public boolean onHoverEvent(MotionEvent paramMotionEvent)
  {
    int i = o.d(paramMotionEvent);
    if (i == 9) {
      this.Jt = false;
    }
    if (!this.Jt)
    {
      boolean bool = super.onHoverEvent(paramMotionEvent);
      if ((i == 9) && (!bool)) {
        this.Jt = true;
      }
    }
    if ((i == 10) || (i == 3)) {
      this.Jt = false;
    }
    return true;
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i = o.d(paramMotionEvent);
    if (i == 0) {
      this.Js = false;
    }
    if (!this.Js)
    {
      boolean bool = super.onTouchEvent(paramMotionEvent);
      if ((i == 0) && (!bool)) {
        this.Js = true;
      }
    }
    if ((i == 1) || (i == 3)) {
      this.Js = false;
    }
    return true;
  }
  
  public void setContentHeight(int paramInt)
  {
    this.Jq = paramInt;
    requestLayout();
  }
  
  public void setVisibility(int paramInt)
  {
    if (paramInt != getVisibility())
    {
      if (this.Jr != null) {
        this.Jr.cancel();
      }
      super.setVisibility(paramInt);
    }
  }
  
  public boolean showOverflowMenu()
  {
    if (this.Jp != null) {
      return this.Jp.showOverflowMenu();
    }
    return false;
  }
  
  protected final class a
    implements am
  {
    private boolean Ju = false;
    int Jv;
    
    protected a() {}
    
    public final a a(ai paramai, int paramInt)
    {
      a.this.Jr = paramai;
      this.Jv = paramInt;
      return this;
    }
    
    public final void ar(View paramView)
    {
      this.Ju = true;
    }
    
    public final void p(View paramView)
    {
      a.a(a.this);
      this.Ju = false;
    }
    
    public final void q(View paramView)
    {
      if (this.Ju) {
        return;
      }
      a.this.Jr = null;
      a.a(a.this, this.Jv);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */