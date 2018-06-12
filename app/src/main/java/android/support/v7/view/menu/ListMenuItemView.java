package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.a.a.f;
import android.support.v7.a.a.h;
import android.support.v7.a.a.k;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup.LayoutParams;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RadioButton;
import android.widget.TextView;

public class ListMenuItemView
  extends LinearLayout
  implements m.a
{
  private LayoutInflater Bc;
  private TextView Dm;
  private RadioButton HP;
  private CheckBox HQ;
  private TextView HR;
  private Drawable HS;
  private Context HT;
  private boolean HU;
  private int HV;
  private boolean HW;
  private h bl;
  private int bt;
  private ImageView ii;
  private Context mContext;
  
  public ListMenuItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public ListMenuItemView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    this.mContext = paramContext;
    paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, a.k.MenuView, paramInt, 0);
    this.HS = paramAttributeSet.getDrawable(a.k.MenuView_android_itemBackground);
    this.bt = paramAttributeSet.getResourceId(a.k.MenuView_android_itemTextAppearance, -1);
    this.HU = paramAttributeSet.getBoolean(a.k.MenuView_preserveIconSpacing, false);
    this.HT = paramContext;
    paramAttributeSet.recycle();
  }
  
  private void dD()
  {
    this.HP = ((RadioButton)getInflater().inflate(a.h.abc_list_menu_item_radio, this, false));
    addView(this.HP);
  }
  
  private void dE()
  {
    this.HQ = ((CheckBox)getInflater().inflate(a.h.abc_list_menu_item_checkbox, this, false));
    addView(this.HQ);
  }
  
  private LayoutInflater getInflater()
  {
    if (this.Bc == null) {
      this.Bc = LayoutInflater.from(this.mContext);
    }
    return this.Bc;
  }
  
  private void setShortcut$25d965e(boolean paramBoolean)
  {
    if ((paramBoolean) && (this.bl.dT())) {}
    char c;
    for (int i = 0;; i = 8)
    {
      if (i == 0)
      {
        TextView localTextView = this.HR;
        c = this.bl.dS();
        if (c != 0) {
          break;
        }
        localObject = "";
        localTextView.setText((CharSequence)localObject);
      }
      if (this.HR.getVisibility() != i) {
        this.HR.setVisibility(i);
      }
      return;
    }
    Object localObject = new StringBuilder(h.IL);
    switch (c)
    {
    default: 
      ((StringBuilder)localObject).append(c);
    }
    for (;;)
    {
      localObject = ((StringBuilder)localObject).toString();
      break;
      ((StringBuilder)localObject).append(h.IM);
      continue;
      ((StringBuilder)localObject).append(h.IN);
      continue;
      ((StringBuilder)localObject).append(h.IO);
    }
  }
  
  public final boolean M()
  {
    return false;
  }
  
  public final void a(h paramh)
  {
    int j = 0;
    this.bl = paramh;
    this.HV = 0;
    if (paramh.isVisible())
    {
      i = 0;
      setVisibility(i);
      setTitle(paramh.a(this));
      setCheckable(paramh.isCheckable());
      boolean bool = paramh.dT();
      paramh.dS();
      if ((!bool) || (!this.bl.dT())) {
        break label148;
      }
    }
    char c;
    label148:
    for (int i = j;; i = 8)
    {
      if (i == 0)
      {
        TextView localTextView = this.HR;
        c = this.bl.dS();
        if (c != 0) {
          break label154;
        }
        localObject = "";
        localTextView.setText((CharSequence)localObject);
      }
      if (this.HR.getVisibility() != i) {
        this.HR.setVisibility(i);
      }
      setIcon(paramh.getIcon());
      setEnabled(paramh.isEnabled());
      return;
      i = 8;
      break;
    }
    label154:
    Object localObject = new StringBuilder(h.IL);
    switch (c)
    {
    default: 
      ((StringBuilder)localObject).append(c);
    }
    for (;;)
    {
      localObject = ((StringBuilder)localObject).toString();
      break;
      ((StringBuilder)localObject).append(h.IM);
      continue;
      ((StringBuilder)localObject).append(h.IN);
      continue;
      ((StringBuilder)localObject).append(h.IO);
    }
  }
  
  public h getItemData()
  {
    return this.bl;
  }
  
  protected void onFinishInflate()
  {
    super.onFinishInflate();
    setBackgroundDrawable(this.HS);
    this.Dm = ((TextView)findViewById(a.f.title));
    if (this.bt != -1) {
      this.Dm.setTextAppearance(this.HT, this.bt);
    }
    this.HR = ((TextView)findViewById(a.f.shortcut));
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    if ((this.ii != null) && (this.HU))
    {
      ViewGroup.LayoutParams localLayoutParams = getLayoutParams();
      LinearLayout.LayoutParams localLayoutParams1 = (LinearLayout.LayoutParams)this.ii.getLayoutParams();
      if ((localLayoutParams.height > 0) && (localLayoutParams1.width <= 0)) {
        localLayoutParams1.width = localLayoutParams.height;
      }
    }
    super.onMeasure(paramInt1, paramInt2);
  }
  
  public void setCheckable(boolean paramBoolean)
  {
    if ((!paramBoolean) && (this.HP == null) && (this.HQ == null)) {}
    label51:
    label133:
    label139:
    do
    {
      return;
      Object localObject2;
      Object localObject1;
      if (this.bl.dU())
      {
        if (this.HP == null) {
          dD();
        }
        localObject2 = this.HP;
        localObject1 = this.HQ;
        if (!paramBoolean) {
          break label139;
        }
        ((CompoundButton)localObject2).setChecked(this.bl.isChecked());
        if (!paramBoolean) {
          break label133;
        }
      }
      for (int i = 0;; i = 8)
      {
        if (((CompoundButton)localObject2).getVisibility() != i) {
          ((CompoundButton)localObject2).setVisibility(i);
        }
        if ((localObject1 == null) || (((CompoundButton)localObject1).getVisibility() == 8)) {
          break;
        }
        ((CompoundButton)localObject1).setVisibility(8);
        return;
        if (this.HQ == null) {
          dE();
        }
        localObject2 = this.HQ;
        localObject1 = this.HP;
        break label51;
      }
      if (this.HQ != null) {
        this.HQ.setVisibility(8);
      }
    } while (this.HP == null);
    this.HP.setVisibility(8);
  }
  
  public void setChecked(boolean paramBoolean)
  {
    if (this.bl.dU()) {
      if (this.HP == null) {
        dD();
      }
    }
    for (Object localObject = this.HP;; localObject = this.HQ)
    {
      ((CompoundButton)localObject).setChecked(paramBoolean);
      return;
      if (this.HQ == null) {
        dE();
      }
    }
  }
  
  public void setForceShowIcon(boolean paramBoolean)
  {
    this.HW = paramBoolean;
    this.HU = paramBoolean;
  }
  
  public void setIcon(Drawable paramDrawable)
  {
    int i;
    if ((this.bl.bq.It) || (this.HW))
    {
      i = 1;
      if ((i != 0) || (this.HU)) {
        break label39;
      }
    }
    label39:
    while ((this.ii == null) && (paramDrawable == null) && (!this.HU))
    {
      return;
      i = 0;
      break;
    }
    if (this.ii == null)
    {
      this.ii = ((ImageView)getInflater().inflate(a.h.abc_list_menu_item_icon, this, false));
      addView(this.ii, 0);
    }
    if ((paramDrawable != null) || (this.HU))
    {
      ImageView localImageView = this.ii;
      if (i != 0) {}
      for (;;)
      {
        localImageView.setImageDrawable(paramDrawable);
        if (this.ii.getVisibility() == 0) {
          break;
        }
        this.ii.setVisibility(0);
        return;
        paramDrawable = null;
      }
    }
    this.ii.setVisibility(8);
  }
  
  public void setTitle(CharSequence paramCharSequence)
  {
    if (paramCharSequence != null)
    {
      this.Dm.setText(paramCharSequence);
      if (this.Dm.getVisibility() != 0) {
        this.Dm.setVisibility(0);
      }
    }
    while (this.Dm.getVisibility() == 8) {
      return;
    }
    this.Dm.setVisibility(8);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/view/menu/ListMenuItemView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */