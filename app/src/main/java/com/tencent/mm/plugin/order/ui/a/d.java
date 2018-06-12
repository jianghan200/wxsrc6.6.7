package com.tencent.mm.plugin.order.ui.a;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.ak.a.a;
import com.tencent.mm.ak.a.a.c;
import com.tencent.mm.ak.a.a.c.a;
import com.tencent.mm.ak.o;
import com.tencent.mm.plugin.order.a.b;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.ui.base.preference.Preference;

public final class d
  extends Preference
{
  String iAb;
  String mName;
  View.OnClickListener mOnClickListener;
  private View mView = null;
  
  public d(Context paramContext)
  {
    super(paramContext);
    setLayoutResource(a.g.mall_order_biz_pref);
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
    ImageView localImageView = (ImageView)paramView.findViewById(a.f.mall_order_biz_pref_icon);
    TextView localTextView = (TextView)paramView.findViewById(a.f.mall_order_biz_pref_name);
    localImageView.setImageBitmap(null);
    if (!bi.oW(this.iAb))
    {
      Object localObject = new c.a();
      b.bmn();
      ((c.a)localObject).dXB = b.bav();
      ((c.a)localObject).dXy = true;
      ((c.a)localObject).dXV = true;
      ((c.a)localObject).dXW = true;
      localObject = ((c.a)localObject).Pt();
      o.Pj().a(this.iAb, localImageView, (c)localObject);
    }
    localTextView.setText(this.mName);
    paramView.findViewById(a.f.mall_order_biz_pref_container).setOnClickListener(this.mOnClickListener);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/order/ui/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */