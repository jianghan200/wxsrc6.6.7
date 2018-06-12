package com.tencent.mm.plugin.product.ui;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.AutoCompleteTextView;
import com.tencent.mm.plugin.product.a.a;
import com.tencent.mm.plugin.product.b.c;
import com.tencent.mm.plugin.product.b.d;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.protocal.c.bfm;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.s;

public class MallProductReceiptUI
  extends MallBaseUI
{
  private c lSG;
  private d lSW = null;
  private AutoCompleteTextView lSX = null;
  private h lSY = null;
  
  protected final int getLayoutId()
  {
    return a.g.product_receipt_ui;
  }
  
  public final void initView()
  {
    setMMTitle(a.i.mall_product_receipt_title);
    addTextOptionMenu(0, getString(a.i.app_finish), new MallProductReceiptUI.1(this));
    this.lSX = ((AutoCompleteTextView)findViewById(a.f.mall_product_receipt_actv));
    bfm localbfm = this.lSG.bmN();
    if ((localbfm != null) && (!bi.oW(localbfm.jQf))) {
      this.lSX.setText(localbfm.jQf);
    }
    this.lSX.setSelection(this.lSX.getText().length());
    this.lSY = new h(this);
    this.lSX.setAdapter(this.lSY);
    this.lSX.setOnItemClickListener(new MallProductReceiptUI.2(this));
    View.inflate(this.mController.tml, a.g.product_input_history_last_item, null).setOnClickListener(new MallProductReceiptUI.3(this));
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.lSW = a.bmF().bmH();
    a.bmF();
    this.lSG = a.bmG();
    initView();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/product/ui/MallProductReceiptUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */