package com.tencent.mm.plugin.account.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.tencent.mm.plugin.account.a.e;
import com.tencent.mm.plugin.account.a.f;
import com.tencent.mm.plugin.account.a.g;

public final class a
  extends BaseAdapter
{
  private LayoutInflater eMa;
  private String[] ePm;
  private Drawable ePn = null;
  private View.OnTouchListener ePo = new a.1(this);
  
  public a(Context paramContext, String[] paramArrayOfString)
  {
    this.ePm = paramArrayOfString;
    this.eMa = LayoutInflater.from(paramContext);
    this.ePn = paramContext.getResources().getDrawable(a.e.signup_chose_line);
    this.ePn.setBounds(0, 0, this.ePn.getIntrinsicWidth(), this.ePn.getIntrinsicHeight());
  }
  
  private boolean jk(int paramInt)
  {
    return paramInt == this.ePm.length - 1;
  }
  
  public final int getCount()
  {
    return this.ePm.length;
  }
  
  public final Object getItem(int paramInt)
  {
    return this.ePm[paramInt];
  }
  
  public final long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    int j = 1;
    paramViewGroup = paramView;
    if (paramView == null) {
      paramViewGroup = this.eMa.inflate(a.g.alias_item, null);
    }
    paramView = (TextView)paramViewGroup.findViewById(a.f.alias_tv);
    paramViewGroup.setOnTouchListener(this.ePo);
    int i;
    if (paramInt == 0)
    {
      i = 1;
      if ((i == 0) || (!jk(paramInt))) {
        break label102;
      }
      paramView.setPadding(25, 0, 25, 10);
      paramView.setCompoundDrawablePadding(0);
      paramView.setCompoundDrawables(null, null, null, null);
    }
    for (;;)
    {
      paramView.setText(this.ePm[paramInt]);
      return paramViewGroup;
      i = 0;
      break;
      label102:
      if (paramInt == 0) {}
      for (i = j;; i = 0)
      {
        if (i == 0) {
          break label152;
        }
        paramView.setPadding(25, 0, 10, 10);
        paramView.setCompoundDrawablePadding(10);
        paramView.setCompoundDrawables(null, null, this.ePn, null);
        break;
      }
      label152:
      if (jk(paramInt))
      {
        paramView.setPadding(0, 0, 25, 10);
        paramView.setCompoundDrawablePadding(0);
        paramView.setCompoundDrawables(null, null, null, null);
      }
      else
      {
        paramView.setPadding(0, 0, 10, 10);
        paramView.setCompoundDrawablePadding(10);
        paramView.setCompoundDrawables(null, null, this.ePn, null);
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/account/ui/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */