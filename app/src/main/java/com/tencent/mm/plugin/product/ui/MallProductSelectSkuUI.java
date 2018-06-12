package com.tencent.mm.plugin.product.ui;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.mm.platformtools.y;
import com.tencent.mm.platformtools.y.a;
import com.tencent.mm.plugin.product.a.a;
import com.tencent.mm.plugin.product.b.b;
import com.tencent.mm.plugin.product.b.e;
import com.tencent.mm.plugin.product.b.m;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.s;

public class MallProductSelectSkuUI
  extends MallBaseUI
  implements y.a
{
  private TextView gsY;
  private m lQL;
  private e lRa;
  private com.tencent.mm.plugin.product.b.c lSG;
  private ImageView lTi;
  private TextView lTj;
  private TextView lTk;
  private Button lTl;
  private ListView lTm;
  private MallProductSelectAmountView lTn = null;
  private i lTo = null;
  private f lTp;
  
  private void aL()
  {
    if (this.lQL != null)
    {
      if ((this.lRa == null) || (this.lQL.lRp == null)) {
        break label210;
      }
      this.lTj.setText(b.l(this.lRa.lRe, this.lRa.lRf, this.lQL.lRp.lNV));
      if (this.lQL.lRp != null) {
        this.gsY.setText(this.lQL.lRp.name);
      }
    }
    if (!bi.oW(this.lSG.bmJ()))
    {
      localObject = y.a(new c(this.lSG.bmJ()));
      this.lTi.setImageBitmap((Bitmap)localObject);
      y.a(this);
    }
    this.lTk.setVisibility(8);
    Object localObject = this.lTn;
    int i = this.lSG.bmR();
    int j = this.lSG.lQL.lRo;
    if (i > j) {
      ((MallProductSelectAmountView)localObject).lTd = 3;
    }
    for (((MallProductSelectAmountView)localObject).lTc = j;; ((MallProductSelectAmountView)localObject).lTc = i)
    {
      ((MallProductSelectAmountView)localObject).bnh();
      if (((MallProductSelectAmountView)localObject).lTg != null) {
        ((MallProductSelectAmountView)localObject).lTg.ex(((MallProductSelectAmountView)localObject).lTf);
      }
      this.lTo.notifyDataSetChanged();
      return;
      label210:
      this.lTj.setText(b.l(this.lQL.lRp.lRB, this.lQL.lRp.lRC, this.lQL.lRp.lNV));
      break;
      ((MallProductSelectAmountView)localObject).lTd = 1;
    }
  }
  
  protected final int getLayoutId()
  {
    return a.g.product_select_sku_ui;
  }
  
  protected final void initView()
  {
    setMMTitle(a.i.mall_product_select_sku_title);
    this.lTi = ((ImageView)findViewById(a.f.mall_product_select_sku_img_iv));
    this.gsY = ((TextView)findViewById(a.f.mall_product_select_sku_title_tv));
    this.lTj = ((TextView)findViewById(a.f.mall_product_select_sku_price_tv));
    this.lTk = ((TextView)findViewById(a.f.mall_product_select_sku_err));
    this.lTl = ((Button)findViewById(a.f.mall_product_select_sku_pre_submit));
    this.lTm = ((ListView)findViewById(a.f.mall_product_sku_lv));
    this.lTn = ((MallProductSelectAmountView)findViewById(a.f.select_amount));
    this.lTn.setAmount(this.lSG.mCount);
    this.lTo = new i(this);
    if ((this.lQL != null) && (this.lQL.lRp != null) && (this.lQL.lRp.lRJ != null)) {
      this.lTo.lTr = this.lQL.lRp.lRJ;
    }
    for (;;)
    {
      this.lTo.lTs = new MallProductSelectSkuUI.2(this);
      this.lTm.setAdapter(this.lTo);
      this.lTn.setOnAmountChangeListener(new MallProductSelectSkuUI.3(this));
      this.lTl.setOnClickListener(new MallProductSelectSkuUI.4(this));
      this.lTi.setFocusable(true);
      this.lTi.setFocusableInTouchMode(true);
      this.lTi.requestFocus();
      return;
      x.e("MicroMsg.MallProductSelectSkuUI", "Illage mProductInfo.base_attr.sku_table");
    }
  }
  
  public final void m(String paramString, Bitmap paramBitmap)
  {
    paramString = new StringBuilder().append(paramString).append(", bitmap = ");
    if (paramBitmap == null) {}
    for (boolean bool = true;; bool = false)
    {
      x.d("MicroMsg.MallProductSelectSkuUI", bool);
      if (!bi.oW(this.lSG.bmJ())) {
        break;
      }
      return;
    }
    this.lTi.post(new MallProductSelectSkuUI.5(this, paramBitmap));
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    this.lTp.onActivityResult(paramInt1, paramInt2, paramIntent);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.lTp = new f(this.mController.tml, new MallProductSelectSkuUI.1(this));
    a.bmF();
    this.lSG = a.bmG();
    this.lQL = this.lSG.lQL;
    initView();
    aL();
  }
  
  public void onStart()
  {
    this.lTp.onStart();
    super.onStart();
  }
  
  protected void onStop()
  {
    this.lTp.onStop();
    super.onStop();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/product/ui/MallProductSelectSkuUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */