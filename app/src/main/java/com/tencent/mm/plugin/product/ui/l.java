package com.tencent.mm.plugin.product.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.platformtools.y;
import com.tencent.mm.plugin.product.b.n.a;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import java.util.List;

public final class l
  extends BaseAdapter
{
  List<n.a> lTC;
  private Context mContext;
  
  public l(Context paramContext)
  {
    this.mContext = paramContext;
  }
  
  private n.a uC(int paramInt)
  {
    return (n.a)this.lTC.get(paramInt);
  }
  
  public final int getCount()
  {
    if (this.lTC != null) {
      return this.lTC.size();
    }
    return 0;
  }
  
  public final long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    Object localObject = uC(paramInt);
    if ((paramView == null) || (paramView.getTag() == null))
    {
      paramViewGroup = new m();
      paramView = View.inflate(this.mContext, a.g.product_sold_out_cell, null);
      paramViewGroup.eBO = ((TextView)paramView.findViewById(a.f.mall_product_sold_out_cell_price_iv));
      paramViewGroup.gxd = ((ImageView)paramView.findViewById(a.f.mall_product_sold_out_cell_img_iv));
      paramView.setTag(paramViewGroup);
    }
    for (;;)
    {
      paramViewGroup.lTD = ((n.a)localObject);
      paramViewGroup.eBO.setText(((n.a)localObject).title);
      localObject = y.a(new c(((n.a)localObject).iconUrl));
      paramViewGroup.gxd.setImageBitmap((Bitmap)localObject);
      y.a(paramViewGroup);
      return paramView;
      paramViewGroup = (m)paramView.getTag();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/product/ui/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */