package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.support.v7.a.a.a;
import android.support.v7.a.a.f;
import android.support.v7.a.a.h;
import android.support.v7.a.a.k;
import android.support.v7.view.b;
import android.support.v7.view.menu.f;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ActionBarContextView
  extends a
{
  private TextView Dm;
  private View JG;
  private LinearLayout JH;
  private TextView JI;
  private int JJ;
  private int JK;
  public boolean JL;
  private int JM;
  private View hZ;
  private CharSequence sn;
  private CharSequence so;
  
  public ActionBarContextView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public ActionBarContextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, a.a.actionModeStyle);
  }
  
  public ActionBarContextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    paramContext = ap.a(paramContext, paramAttributeSet, a.k.ActionMode, paramInt);
    setBackgroundDrawable(paramContext.getDrawable(a.k.ActionMode_background));
    this.JJ = paramContext.getResourceId(a.k.ActionMode_titleTextStyle, 0);
    this.JK = paramContext.getResourceId(a.k.ActionMode_subtitleTextStyle, 0);
    this.Jq = paramContext.getLayoutDimension(a.k.ActionMode_height, 0);
    this.JM = paramContext.getResourceId(a.k.ActionMode_closeItemLayout, a.h.abc_action_mode_close_item_material);
    paramContext.Ww.recycle();
  }
  
  private void ea()
  {
    int m = 8;
    int j = 1;
    if (this.JH == null)
    {
      LayoutInflater.from(getContext()).inflate(a.h.abc_action_bar_title_item, this);
      this.JH = ((LinearLayout)getChildAt(getChildCount() - 1));
      this.Dm = ((TextView)this.JH.findViewById(a.f.action_bar_title));
      this.JI = ((TextView)this.JH.findViewById(a.f.action_bar_subtitle));
      if (this.JJ != 0) {
        this.Dm.setTextAppearance(getContext(), this.JJ);
      }
      if (this.JK != 0) {
        this.JI.setTextAppearance(getContext(), this.JK);
      }
    }
    this.Dm.setText(this.sn);
    this.JI.setText(this.so);
    int i;
    label167:
    Object localObject;
    if (!TextUtils.isEmpty(this.sn))
    {
      i = 1;
      if (TextUtils.isEmpty(this.so)) {
        break label234;
      }
      localObject = this.JI;
      if (j == 0) {
        break label239;
      }
    }
    label234:
    label239:
    for (int k = 0;; k = 8)
    {
      ((TextView)localObject).setVisibility(k);
      localObject = this.JH;
      if (i == 0)
      {
        i = m;
        if (j == 0) {}
      }
      else
      {
        i = 0;
      }
      ((LinearLayout)localObject).setVisibility(i);
      if (this.JH.getParent() == null) {
        addView(this.JH);
      }
      return;
      i = 0;
      break;
      j = 0;
      break label167;
    }
  }
  
  public final void c(final b paramb)
  {
    if (this.JG == null)
    {
      this.JG = LayoutInflater.from(getContext()).inflate(this.JM, this, false);
      addView(this.JG);
    }
    for (;;)
    {
      this.JG.findViewById(a.f.action_mode_close_button).setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          paramb.finish();
        }
      });
      paramb = (f)paramb.getMenu();
      if (this.Jp != null) {
        this.Jp.ek();
      }
      this.Jp = new ActionMenuPresenter(getContext());
      this.Jp.ej();
      ViewGroup.LayoutParams localLayoutParams = new ViewGroup.LayoutParams(-2, -1);
      paramb.a(this.Jp, this.Jn);
      this.Jo = ((ActionMenuView)this.Jp.e(this));
      this.Jo.setBackgroundDrawable(null);
      addView(this.Jo, localLayoutParams);
      return;
      if (this.JG.getParent() == null) {
        addView(this.JG);
      }
    }
  }
  
  public final void eb()
  {
    if (this.JG == null) {
      ec();
    }
  }
  
  public final void ec()
  {
    removeAllViews();
    this.hZ = null;
    this.Jo = null;
  }
  
  protected ViewGroup.LayoutParams generateDefaultLayoutParams()
  {
    return new ViewGroup.MarginLayoutParams(-1, -2);
  }
  
  public ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    return new ViewGroup.MarginLayoutParams(getContext(), paramAttributeSet);
  }
  
  public CharSequence getSubtitle()
  {
    return this.so;
  }
  
  public CharSequence getTitle()
  {
    return this.sn;
  }
  
  public void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    if (this.Jp != null)
    {
      this.Jp.hideOverflowMenu();
      this.Jp.el();
    }
  }
  
  public void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    if (Build.VERSION.SDK_INT >= 14)
    {
      if (paramAccessibilityEvent.getEventType() == 32)
      {
        paramAccessibilityEvent.setSource(this);
        paramAccessibilityEvent.setClassName(getClass().getName());
        paramAccessibilityEvent.setPackageName(getContext().getPackageName());
        paramAccessibilityEvent.setContentDescription(this.sn);
      }
    }
    else {
      return;
    }
    super.onInitializeAccessibilityEvent(paramAccessibilityEvent);
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramBoolean = at.bv(this);
    int i;
    int j;
    int k;
    Object localObject;
    if (paramBoolean)
    {
      i = paramInt3 - paramInt1 - getPaddingRight();
      j = getPaddingTop();
      k = paramInt4 - paramInt2 - getPaddingTop() - getPaddingBottom();
      paramInt2 = i;
      if (this.JG != null)
      {
        paramInt2 = i;
        if (this.JG.getVisibility() != 8)
        {
          localObject = (ViewGroup.MarginLayoutParams)this.JG.getLayoutParams();
          if (!paramBoolean) {
            break label254;
          }
          paramInt2 = ((ViewGroup.MarginLayoutParams)localObject).rightMargin;
          label89:
          if (!paramBoolean) {
            break label263;
          }
          paramInt4 = ((ViewGroup.MarginLayoutParams)localObject).leftMargin;
          label100:
          paramInt2 = c(i, paramInt2, paramBoolean);
          paramInt2 = c(paramInt2 + a(this.JG, paramInt2, j, k, paramBoolean), paramInt4, paramBoolean);
        }
      }
      paramInt4 = paramInt2;
      if (this.JH != null)
      {
        paramInt4 = paramInt2;
        if (this.hZ == null)
        {
          paramInt4 = paramInt2;
          if (this.JH.getVisibility() != 8) {
            paramInt4 = paramInt2 + a(this.JH, paramInt2, j, k, paramBoolean);
          }
        }
      }
      if (this.hZ != null) {
        a(this.hZ, paramInt4, j, k, paramBoolean);
      }
      if (!paramBoolean) {
        break label273;
      }
      paramInt1 = getPaddingLeft();
      label213:
      if (this.Jo != null)
      {
        localObject = this.Jo;
        if (paramBoolean) {
          break label286;
        }
      }
    }
    label254:
    label263:
    label273:
    label286:
    for (paramBoolean = true;; paramBoolean = false)
    {
      a((View)localObject, paramInt1, j, k, paramBoolean);
      return;
      i = getPaddingLeft();
      break;
      paramInt2 = ((ViewGroup.MarginLayoutParams)localObject).leftMargin;
      break label89;
      paramInt4 = ((ViewGroup.MarginLayoutParams)localObject).rightMargin;
      break label100;
      paramInt1 = paramInt3 - paramInt1 - getPaddingRight();
      break label213;
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int k = 1073741824;
    if (View.MeasureSpec.getMode(paramInt1) != 1073741824) {
      throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
    }
    if (View.MeasureSpec.getMode(paramInt2) == 0) {
      throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
    }
    int n = View.MeasureSpec.getSize(paramInt1);
    int i;
    int m;
    int j;
    if (this.Jq > 0)
    {
      i = this.Jq;
      int i1 = getPaddingTop() + getPaddingBottom();
      paramInt1 = n - getPaddingLeft() - getPaddingRight();
      m = i - i1;
      j = View.MeasureSpec.makeMeasureSpec(m, Integer.MIN_VALUE);
      paramInt2 = paramInt1;
      Object localObject;
      if (this.JG != null)
      {
        paramInt1 = f(this.JG, paramInt1, j);
        localObject = (ViewGroup.MarginLayoutParams)this.JG.getLayoutParams();
        paramInt2 = ((ViewGroup.MarginLayoutParams)localObject).leftMargin;
        paramInt2 = paramInt1 - (((ViewGroup.MarginLayoutParams)localObject).rightMargin + paramInt2);
      }
      paramInt1 = paramInt2;
      if (this.Jo != null)
      {
        paramInt1 = paramInt2;
        if (this.Jo.getParent() == this) {
          paramInt1 = f(this.Jo, paramInt2, j);
        }
      }
      paramInt2 = paramInt1;
      if (this.JH != null)
      {
        paramInt2 = paramInt1;
        if (this.hZ == null)
        {
          if (!this.JL) {
            break label492;
          }
          paramInt2 = View.MeasureSpec.makeMeasureSpec(0, 0);
          this.JH.measure(paramInt2, j);
          int i2 = this.JH.getMeasuredWidth();
          if (i2 > paramInt1) {
            break label480;
          }
          j = 1;
          label288:
          paramInt2 = paramInt1;
          if (j != 0) {
            paramInt2 = paramInt1 - i2;
          }
          localObject = this.JH;
          if (j == 0) {
            break label486;
          }
          paramInt1 = 0;
          label313:
          ((LinearLayout)localObject).setVisibility(paramInt1);
        }
      }
      label319:
      if (this.hZ != null)
      {
        localObject = this.hZ.getLayoutParams();
        if (((ViewGroup.LayoutParams)localObject).width == -2) {
          break label506;
        }
        paramInt1 = 1073741824;
        label349:
        j = paramInt2;
        if (((ViewGroup.LayoutParams)localObject).width >= 0) {
          j = Math.min(((ViewGroup.LayoutParams)localObject).width, paramInt2);
        }
        if (((ViewGroup.LayoutParams)localObject).height == -2) {
          break label513;
        }
        paramInt2 = k;
        label384:
        if (((ViewGroup.LayoutParams)localObject).height < 0) {
          break label520;
        }
        k = Math.min(((ViewGroup.LayoutParams)localObject).height, m);
        label404:
        this.hZ.measure(View.MeasureSpec.makeMeasureSpec(j, paramInt1), View.MeasureSpec.makeMeasureSpec(k, paramInt2));
      }
      if (this.Jq > 0) {
        break label535;
      }
      j = getChildCount();
      paramInt2 = 0;
      paramInt1 = 0;
      label440:
      if (paramInt2 >= j) {
        break label527;
      }
      i = getChildAt(paramInt2).getMeasuredHeight() + i1;
      if (i <= paramInt1) {
        break label543;
      }
      paramInt1 = i;
    }
    label480:
    label486:
    label492:
    label506:
    label513:
    label520:
    label527:
    label535:
    label543:
    for (;;)
    {
      paramInt2 += 1;
      break label440;
      i = View.MeasureSpec.getSize(paramInt2);
      break;
      j = 0;
      break label288;
      paramInt1 = 8;
      break label313;
      paramInt2 = f(this.JH, paramInt1, j);
      break label319;
      paramInt1 = Integer.MIN_VALUE;
      break label349;
      paramInt2 = Integer.MIN_VALUE;
      break label384;
      k = m;
      break label404;
      setMeasuredDimension(n, paramInt1);
      return;
      setMeasuredDimension(n, i);
      return;
    }
  }
  
  public void setContentHeight(int paramInt)
  {
    this.Jq = paramInt;
  }
  
  public void setCustomView(View paramView)
  {
    if (this.hZ != null) {
      removeView(this.hZ);
    }
    this.hZ = paramView;
    if ((paramView != null) && (this.JH != null))
    {
      removeView(this.JH);
      this.JH = null;
    }
    if (paramView != null) {
      addView(paramView);
    }
    requestLayout();
  }
  
  public void setSubtitle(CharSequence paramCharSequence)
  {
    this.so = paramCharSequence;
    ea();
  }
  
  public void setTitle(CharSequence paramCharSequence)
  {
    this.sn = paramCharSequence;
    ea();
  }
  
  public void setTitleOptional(boolean paramBoolean)
  {
    if (paramBoolean != this.JL) {
      requestLayout();
    }
    this.JL = paramBoolean;
  }
  
  public boolean shouldDelayChildPressedState()
  {
    return false;
  }
  
  public final boolean showOverflowMenu()
  {
    if (this.Jp != null) {
      return this.Jp.showOverflowMenu();
    }
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/ActionBarContextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */