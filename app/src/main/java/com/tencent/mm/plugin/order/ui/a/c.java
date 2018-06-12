package com.tencent.mm.plugin.order.ui.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.bp.a;
import com.tencent.mm.plugin.wxpay.a.d;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.ui.base.preference.Preference;

public final class c
  extends Preference
{
  Bitmap dHf = null;
  private TextView lLw;
  private ImageView lQj;
  String lQk = "";
  View.OnClickListener mOnClickListener;
  private View mView = null;
  
  public c(Context paramContext)
  {
    super(paramContext);
    setLayoutResource(a.g.mall_order_barcode_pref);
  }
  
  public final View getView(View paramView, ViewGroup paramViewGroup)
  {
    if (this.mView == null) {
      this.mView = onCreateView(paramViewGroup);
    }
    onBindView(this.mView);
    return this.mView;
  }
  
  protected final void onBindView(View paramView)
  {
    super.onBindView(paramView);
    this.lLw = ((TextView)paramView.findViewById(a.f.mall_order_barcode_num));
    this.lQj = ((ImageView)paramView.findViewById(a.f.mall_order_barcode_iv));
    this.lLw.setText(this.lQk);
    this.lQj.setImageBitmap(this.dHf);
    this.lQj.setOnClickListener(this.mOnClickListener);
    if ((this.lQk != null) && (this.lQk.length() > 48)) {
      this.lLw.setTextSize(0, a.ad(this.mContext, a.d.HintTextSize));
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/order/ui/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */