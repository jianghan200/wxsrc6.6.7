package com.tencent.mm.plugin.product.ui;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextPaint;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.mm.g.a.mi;
import com.tencent.mm.kernel.g;
import com.tencent.mm.platformtools.y;
import com.tencent.mm.platformtools.y.a;
import com.tencent.mm.plugin.product.b.m;
import com.tencent.mm.plugin.wxpay.a.e;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.s;
import java.util.LinkedList;

@com.tencent.mm.ui.base.a(3)
public class MallProductUI
  extends MallBaseUI
  implements y.a
{
  private Button eWk;
  private TextView hVS;
  protected com.tencent.mm.plugin.product.b.c lSG;
  private HtmlTextView lSm;
  private ListView lTO;
  private a lTP;
  private LinearLayout lTR;
  private LinearLayout lTS;
  private ImageView lTT;
  private TextView lTU;
  private HtmlTextView lTV;
  private RelativeLayout lTW;
  private ListView lTX;
  private k lTY = null;
  private Button lTZ;
  private TextView lTj;
  private f lTp;
  
  protected final void aL()
  {
    Object localObject = this.lSG.lQL;
    if (localObject == null)
    {
      showOptionMenu(false);
      return;
    }
    showOptionMenu(true);
    ux(0);
    this.lTR.setVisibility(0);
    this.lTS.setVisibility(8);
    if (((m)localObject).lRp != null)
    {
      this.hVS.setText(((m)localObject).lRp.name);
      this.lTj.setText(com.tencent.mm.plugin.product.b.b.l(((m)localObject).lRp.lRB, ((m)localObject).lRp.lRC, ((m)localObject).lRp.lNV));
      this.lTU.setText(com.tencent.mm.plugin.product.b.b.d(((m)localObject).lRp.lRA, ((m)localObject).lRp.lNV));
    }
    if (this.lSG.bmR() <= 0)
    {
      this.eWk.setEnabled(false);
      this.eWk.setText(a.i.mall_product_sold_out);
      label150:
      if ((((m)localObject).lRp == null) || (((m)localObject).lRp.lRK == null) || (((m)localObject).lRp.lRK.size() <= 0)) {
        break label417;
      }
      this.lTO.setVisibility(0);
      this.lTP.bG(((m)localObject).lRp.lRK);
      this.lTP.notifyDataSetChanged();
      label209:
      if ((((m)localObject).lRp == null) || (bi.oW(((m)localObject).lRp.detail))) {
        break label429;
      }
      this.lTW.setVisibility(0);
      this.lSm.setVisibility(0);
      this.lSm.setText(((m)localObject).lRp.detail);
      label259:
      if (bi.oW(((m)localObject).lRv)) {
        break label450;
      }
      this.lTV.setVisibility(0);
      this.lTV.setText(((m)localObject).lRv);
    }
    for (;;)
    {
      showOptionMenu(true);
      if (bi.oW(this.lSG.lQT)) {
        break;
      }
      localObject = y.a(new c(this.lSG.lQT));
      this.lTT.setImageBitmap((Bitmap)localObject);
      y.a(this);
      return;
      if (this.lSG.lQL.lRo <= 0)
      {
        this.eWk.setEnabled(false);
        this.eWk.setText(a.i.mall_product_sold_limit);
        break label150;
      }
      this.eWk.setEnabled(true);
      if (!bi.oW(((m)localObject).lRu))
      {
        this.eWk.setText(((m)localObject).lRu);
        break label150;
      }
      this.eWk.setText(a.i.mall_product_go_sku_list);
      break label150;
      label417:
      this.lTO.setVisibility(8);
      break label209;
      label429:
      this.lTW.setVisibility(8);
      this.lSm.setVisibility(8);
      break label259;
      label450:
      this.lTV.setVisibility(8);
    }
  }
  
  protected final int getLayoutId()
  {
    return a.g.product_ui;
  }
  
  protected final void initView()
  {
    setMMTitle(a.i.mall_product_title);
    setBackBtn(new MallProductUI.2(this));
    this.lTR = ((LinearLayout)findViewById(a.f.mall_product_normal_ll));
    this.lTS = ((LinearLayout)findViewById(a.f.mall_product_sold_out_ll));
    this.lTT = ((ImageView)findViewById(a.f.mall_product_img));
    this.hVS = ((TextView)findViewById(a.f.mall_product_desc));
    this.lTj = ((TextView)findViewById(a.f.mall_product_price));
    this.lTU = ((TextView)findViewById(a.f.mall_product_org_price));
    this.lTU.getPaint().setFlags(16);
    this.lTW = ((RelativeLayout)findViewById(a.f.mall_product_detail_rl));
    this.lSm = ((HtmlTextView)findViewById(a.f.mall_product_detail));
    this.lTV = ((HtmlTextView)findViewById(a.f.mall_product_oss_info));
    this.lTO = ((ListView)findViewById(a.f.mall_product_actions_lv));
    this.lTP = new a(this);
    this.lTO.setAdapter(this.lTP);
    this.lTO.setOnItemClickListener(new MallProductUI.3(this));
    this.lTZ = ((Button)findViewById(a.f.mall_product_seller_btn));
    this.lTZ.setOnClickListener(new MallProductUI.4(this));
    this.lTX = ((ListView)findViewById(a.f.mall_product_sold_out_lv));
    this.lTY = new k(this);
    this.lTY.lTs = new MallProductUI.5(this);
    this.lTX.setAdapter(this.lTY);
    this.eWk = ((Button)findViewById(a.f.mall_product_go_sku_list));
    this.eWk.setOnClickListener(new MallProductUI.6(this));
    addIconOptionMenu(0, a.e.mm_title_btn_menu, new MallProductUI.7(this));
    showOptionMenu(false);
    this.lTT.setFocusable(true);
    this.lTT.setFocusableInTouchMode(true);
    this.lTT.requestFocus();
  }
  
  public final void m(String paramString, Bitmap paramBitmap)
  {
    if ((paramString != null) && (paramString.equals(this.lSG.lQT))) {
      this.lTT.post(new MallProductUI.8(this, paramBitmap));
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    ux(8);
    boolean bool = getIntent().getBooleanExtra("key_go_finish", false);
    setResult(-1);
    if (bool)
    {
      finish();
      return;
    }
    initView();
    com.tencent.mm.plugin.product.a.a.bmF();
    this.lSG = com.tencent.mm.plugin.product.a.a.bmG();
    this.lTp = new f(this.mController.tml, new MallProductUI.1(this));
    paramBundle = this.lTp;
    Object localObject = getIntent();
    m localm = new m();
    g.Em().a(new f.1(paramBundle, (Intent)localObject, localm));
    paramBundle.lSE = true;
    localObject = new mi();
    ((mi)localObject).bXb.errCode = -1;
    ((mi)localObject).bJX = new f.2(paramBundle, (mi)localObject);
    com.tencent.mm.sdk.b.a.sFg.a((com.tencent.mm.sdk.b.b)localObject, Looper.getMainLooper());
  }
  
  protected void onNewIntent(Intent paramIntent)
  {
    super.onNewIntent(paramIntent);
    x.v("MicroMsg.MallProductUI", "onNewIntent");
    setIntent(paramIntent);
  }
  
  protected void onPause()
  {
    this.lTp.onStop();
    super.onPause();
  }
  
  protected void onResume()
  {
    super.onResume();
    this.lTp.onStart();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/product/ui/MallProductUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */