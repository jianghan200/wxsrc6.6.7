package android.support.design.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.StateListDrawable;
import android.support.design.a.b;
import android.support.design.a.d;
import android.support.design.a.e;
import android.support.design.a.f;
import android.support.v4.b.a.a;
import android.support.v4.widget.r;
import android.support.v7.view.menu.h;
import android.support.v7.view.menu.m.a;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;

public class NavigationMenuItemView
  extends ForegroundLinearLayout
  implements m.a
{
  private static final int[] bh = { 16842912 };
  private final int bi;
  final CheckedTextView bj;
  FrameLayout bk;
  private h bl;
  private ColorStateList bm;
  
  public NavigationMenuItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public NavigationMenuItemView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setOrientation(0);
    LayoutInflater.from(paramContext).inflate(a.f.design_navigation_menu_item, this, true);
    this.bi = paramContext.getResources().getDimensionPixelSize(a.d.design_navigation_icon_size);
    this.bj = ((CheckedTextView)findViewById(a.e.design_menu_item_text));
    this.bj.setDuplicateParentStateEnabled(true);
  }
  
  private void setActionView(View paramView)
  {
    if (this.bk == null) {
      this.bk = ((FrameLayout)((ViewStub)findViewById(a.e.design_menu_item_action_area_stub)).inflate());
    }
    this.bk.removeAllViews();
    if (paramView != null) {
      this.bk.addView(paramView);
    }
  }
  
  public final boolean M()
  {
    return false;
  }
  
  public final void a(h paramh)
  {
    this.bl = paramh;
    int i;
    StateListDrawable localStateListDrawable;
    if (paramh.isVisible())
    {
      i = 0;
      setVisibility(i);
      if (getBackground() == null)
      {
        TypedValue localTypedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(a.b.colorControlHighlight, localTypedValue, true)) {
          break label156;
        }
        localStateListDrawable = new StateListDrawable();
        localStateListDrawable.addState(bh, new ColorDrawable(localTypedValue.data));
        localStateListDrawable.addState(EMPTY_STATE_SET, new ColorDrawable(0));
      }
    }
    for (;;)
    {
      setBackgroundDrawable(localStateListDrawable);
      setCheckable(paramh.isCheckable());
      setChecked(paramh.isChecked());
      setEnabled(paramh.isEnabled());
      setTitle(paramh.getTitle());
      setIcon(paramh.getIcon());
      setActionView(paramh.getActionView());
      return;
      i = 8;
      break;
      label156:
      localStateListDrawable = null;
    }
  }
  
  public h getItemData()
  {
    return this.bl;
  }
  
  protected int[] onCreateDrawableState(int paramInt)
  {
    int[] arrayOfInt = super.onCreateDrawableState(paramInt + 1);
    if ((this.bl != null) && (this.bl.isCheckable()) && (this.bl.isChecked())) {
      mergeDrawableStates(arrayOfInt, bh);
    }
    return arrayOfInt;
  }
  
  public void setCheckable(boolean paramBoolean)
  {
    refreshDrawableState();
  }
  
  public void setChecked(boolean paramBoolean)
  {
    refreshDrawableState();
    this.bj.setChecked(paramBoolean);
  }
  
  public void setIcon(Drawable paramDrawable)
  {
    Object localObject = paramDrawable;
    if (paramDrawable != null)
    {
      localObject = paramDrawable.getConstantState();
      if (localObject != null) {
        break label54;
      }
    }
    for (;;)
    {
      localObject = a.g(paramDrawable).mutate();
      ((Drawable)localObject).setBounds(0, 0, this.bi, this.bi);
      a.a((Drawable)localObject, this.bm);
      r.a(this.bj, (Drawable)localObject);
      return;
      label54:
      paramDrawable = ((Drawable.ConstantState)localObject).newDrawable();
    }
  }
  
  void setIconTintList(ColorStateList paramColorStateList)
  {
    this.bm = paramColorStateList;
    if (this.bl != null) {
      setIcon(this.bl.getIcon());
    }
  }
  
  public void setTextColor(ColorStateList paramColorStateList)
  {
    this.bj.setTextColor(paramColorStateList);
  }
  
  public void setTitle(CharSequence paramCharSequence)
  {
    this.bj.setText(paramCharSequence);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/android/support/design/internal/NavigationMenuItemView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */