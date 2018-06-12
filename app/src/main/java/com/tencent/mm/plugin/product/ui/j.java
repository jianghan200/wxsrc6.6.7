package com.tencent.mm.plugin.product.ui;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import com.tencent.mm.plugin.product.c.h;
import com.tencent.mm.plugin.product.c.m;
import com.tencent.mm.plugin.wxpay.a.e;
import com.tencent.mm.plugin.wxpay.a.g;
import java.util.LinkedList;

public final class j
  extends BaseAdapter
{
  m lTx;
  String lTy;
  private Context mContext;
  
  public j(Context paramContext)
  {
    this.mContext = paramContext;
  }
  
  private h uA(int paramInt)
  {
    return (h)this.lTx.lRW.get(paramInt);
  }
  
  public final int getCount()
  {
    if (this.lTx.lRW != null) {
      return this.lTx.lRW.size();
    }
    return 0;
  }
  
  public final long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    paramViewGroup = uA(paramInt);
    if ((paramView == null) || (paramView.getTag() == null)) {
      paramView = View.inflate(this.mContext, a.g.product_select_sku_cell, null);
    }
    for (;;)
    {
      CheckBox localCheckBox = (CheckBox)paramView;
      localCheckBox.setText(paramViewGroup.name);
      localCheckBox.setEnabled(paramViewGroup.lRP);
      localCheckBox.setChecked(paramViewGroup.id.equals(this.lTy));
      if (!paramViewGroup.lRP) {
        paramView.setBackgroundResource(a.e.product_sku_bg_disable);
      }
      for (;;)
      {
        paramView.setTag(new Pair(this.lTx.lRU, paramViewGroup.id));
        return paramView;
        if (paramViewGroup.id.equals(this.lTy)) {
          paramView.setBackgroundResource(a.e.product_sku_bg_selected);
        } else {
          paramView.setBackgroundResource(a.e.product_sku_bg_normal);
        }
      }
    }
  }
  
  public final boolean isEnabled(int paramInt)
  {
    return uA(paramInt).lRP;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/product/ui/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */