package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.view.z;
import android.support.v7.a.a.b;
import android.support.v7.a.a.k;
import android.support.v7.widget.ActionMenuView.a;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.ListPopupWindow;
import android.support.v7.widget.ListPopupWindow.b;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.PopupWindow;
import android.widget.Toast;

public class ActionMenuItemView
  extends AppCompatTextView
  implements m.a, ActionMenuView.a, View.OnClickListener, View.OnLongClickListener
{
  private boolean HA;
  private int HB;
  private int HC;
  private int HD;
  private f.b Hw;
  private ListPopupWindow.b Hx;
  private b Hy;
  private boolean Hz;
  private h bl;
  private Drawable hh;
  private CharSequence sn;
  
  public ActionMenuItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public ActionMenuItemView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    Resources localResources = paramContext.getResources();
    this.Hz = localResources.getBoolean(a.b.abc_config_allowActionMenuItemTextWithIcon);
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, a.k.ActionMenuItemView, paramInt, 0);
    this.HB = paramContext.getDimensionPixelSize(a.k.ActionMenuItemView_android_minWidth, 0);
    paramContext.recycle();
    this.HD = ((int)(localResources.getDisplayMetrics().density * 32.0F + 0.5F));
    setOnClickListener(this);
    setOnLongClickListener(this);
    this.HC = -1;
  }
  
  private void dy()
  {
    int m = 0;
    int i;
    int j;
    if (!TextUtils.isEmpty(this.sn))
    {
      i = 1;
      if (this.hh != null)
      {
        if ((this.bl.IF & 0x4) != 4) {
          break label87;
        }
        j = 1;
        label37:
        k = m;
        if (j == 0) {
          break label63;
        }
        if (!this.Hz)
        {
          k = m;
          if (!this.HA) {
            break label63;
          }
        }
      }
      int k = 1;
      label63:
      if ((i & k) == 0) {
        break label92;
      }
    }
    label87:
    label92:
    for (CharSequence localCharSequence = this.sn;; localCharSequence = null)
    {
      setText(localCharSequence);
      return;
      i = 0;
      break;
      j = 0;
      break label37;
    }
  }
  
  public final boolean M()
  {
    return true;
  }
  
  public final void a(h paramh)
  {
    this.bl = paramh;
    setIcon(paramh.getIcon());
    setTitle(paramh.a(this));
    setId(paramh.getItemId());
    if (paramh.isVisible()) {}
    for (int i = 0;; i = 8)
    {
      setVisibility(i);
      setEnabled(paramh.isEnabled());
      if ((paramh.hasSubMenu()) && (this.Hx == null)) {
        this.Hx = new a();
      }
      return;
    }
  }
  
  public final boolean dA()
  {
    return hasText();
  }
  
  public final boolean dz()
  {
    return (hasText()) && (this.bl.getIcon() == null);
  }
  
  public h getItemData()
  {
    return this.bl;
  }
  
  public final boolean hasText()
  {
    return !TextUtils.isEmpty(getText());
  }
  
  public void onClick(View paramView)
  {
    if (this.Hw != null) {
      this.Hw.f(this.bl);
    }
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    if (Build.VERSION.SDK_INT >= 8) {
      super.onConfigurationChanged(paramConfiguration);
    }
    this.Hz = getContext().getResources().getBoolean(a.b.abc_config_allowActionMenuItemTextWithIcon);
    dy();
  }
  
  public boolean onLongClick(View paramView)
  {
    if (hasText()) {
      return false;
    }
    int[] arrayOfInt = new int[2];
    Rect localRect = new Rect();
    getLocationOnScreen(arrayOfInt);
    getWindowVisibleDisplayFrame(localRect);
    Context localContext = getContext();
    int i = getWidth();
    int k = getHeight();
    int m = arrayOfInt[1];
    int n = k / 2;
    int j = arrayOfInt[0];
    j = i / 2 + j;
    i = j;
    if (z.I(paramView) == 0) {
      i = localContext.getResources().getDisplayMetrics().widthPixels - j;
    }
    paramView = Toast.makeText(localContext, this.bl.getTitle(), 0);
    if (m + n < localRect.height()) {
      paramView.setGravity(8388661, i, arrayOfInt[1] + k - localRect.top);
    }
    for (;;)
    {
      paramView.show();
      return true;
      paramView.setGravity(81, 0, k);
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    boolean bool = hasText();
    if ((bool) && (this.HC >= 0)) {
      super.setPadding(this.HC, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }
    super.onMeasure(paramInt1, paramInt2);
    int i = View.MeasureSpec.getMode(paramInt1);
    paramInt1 = View.MeasureSpec.getSize(paramInt1);
    int j = getMeasuredWidth();
    if (i == Integer.MIN_VALUE) {}
    for (paramInt1 = Math.min(paramInt1, this.HB);; paramInt1 = this.HB)
    {
      if ((i != 1073741824) && (this.HB > 0) && (j < paramInt1)) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(paramInt1, 1073741824), paramInt2);
      }
      if ((!bool) && (this.hh != null)) {
        super.setPadding((getMeasuredWidth() - this.hh.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
      }
      return;
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if ((this.bl.hasSubMenu()) && (this.Hx != null) && (this.Hx.onTouch(this, paramMotionEvent))) {
      return true;
    }
    return super.onTouchEvent(paramMotionEvent);
  }
  
  public void setCheckable(boolean paramBoolean) {}
  
  public void setChecked(boolean paramBoolean) {}
  
  public void setExpandedFormat(boolean paramBoolean)
  {
    if (this.HA != paramBoolean)
    {
      this.HA = paramBoolean;
      if (this.bl != null) {
        this.bl.bq.dM();
      }
    }
  }
  
  public void setIcon(Drawable paramDrawable)
  {
    this.hh = paramDrawable;
    if (paramDrawable != null)
    {
      int m = paramDrawable.getIntrinsicWidth();
      int k = paramDrawable.getIntrinsicHeight();
      int j = k;
      int i = m;
      float f;
      if (m > this.HD)
      {
        f = this.HD / m;
        i = this.HD;
        j = (int)(k * f);
      }
      m = j;
      k = i;
      if (j > this.HD)
      {
        f = this.HD / j;
        m = this.HD;
        k = (int)(i * f);
      }
      paramDrawable.setBounds(0, 0, k, m);
    }
    setCompoundDrawables(paramDrawable, null, null, null);
    dy();
  }
  
  public void setItemInvoker(f.b paramb)
  {
    this.Hw = paramb;
  }
  
  public void setPadding(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.HC = paramInt1;
    super.setPadding(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public void setPopupCallback(b paramb)
  {
    this.Hy = paramb;
  }
  
  public void setTitle(CharSequence paramCharSequence)
  {
    this.sn = paramCharSequence;
    setContentDescription(this.sn);
    dy();
  }
  
  private final class a
    extends ListPopupWindow.b
  {
    public a()
    {
      super();
    }
    
    public final ListPopupWindow dB()
    {
      if (ActionMenuItemView.a(ActionMenuItemView.this) != null) {
        return ActionMenuItemView.a(ActionMenuItemView.this).dB();
      }
      return null;
    }
    
    protected final boolean dC()
    {
      boolean bool2 = false;
      boolean bool1 = bool2;
      if (ActionMenuItemView.b(ActionMenuItemView.this) != null)
      {
        bool1 = bool2;
        if (ActionMenuItemView.b(ActionMenuItemView.this).f(ActionMenuItemView.c(ActionMenuItemView.this)))
        {
          ListPopupWindow localListPopupWindow = dB();
          bool1 = bool2;
          if (localListPopupWindow != null)
          {
            bool1 = bool2;
            if (localListPopupWindow.PK.isShowing()) {
              bool1 = true;
            }
          }
        }
      }
      return bool1;
    }
  }
  
  public static abstract class b
  {
    public abstract ListPopupWindow dB();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/view/menu/ActionMenuItemView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */