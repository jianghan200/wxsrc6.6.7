package com.tencent.mm.plugin.product.ui;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.mm.ab.o;
import com.tencent.mm.kernel.g;
import com.tencent.mm.platformtools.y;
import com.tencent.mm.platformtools.y.a;
import com.tencent.mm.plugin.product.b.k;
import com.tencent.mm.plugin.product.b.l;
import com.tencent.mm.plugin.product.b.m;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.protocal.c.bfm;
import com.tencent.mm.protocal.c.bnx;
import com.tencent.mm.protocal.c.cf;
import com.tencent.mm.protocal.c.um;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.ListViewInScrollView;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.s;
import com.tencent.mm.ui.widget.a.c.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MallProductSubmitUI
  extends MallBaseUI
  implements y.a
{
  private Button eWk;
  private TextView gsY;
  private com.tencent.mm.plugin.product.b.e lRa;
  private com.tencent.mm.plugin.product.b.c lSG;
  private RelativeLayout lTF;
  private TextView lTG;
  private TextView lTH;
  private MallProductItemView lTI;
  private MallProductItemView lTJ;
  private TextView lTK;
  private TextView lTL;
  private TextView lTM;
  private TextView lTN;
  private ListView lTO;
  private a lTP;
  private ImageView lTi;
  private TextView lTj;
  private f lTp;
  
  private void aL()
  {
    m localm = this.lSG.lQL;
    Object localObject1;
    label182:
    String str;
    if (this.lRa != null)
    {
      this.lTj.setText(com.tencent.mm.plugin.product.b.b.l(this.lRa.lRe, this.lRa.lRe, localm.lRp.lNV) + " x " + this.lSG.mCount);
      if (!bi.oW(this.lSG.bmJ()))
      {
        localObject1 = y.a(new c(this.lSG.bmJ()));
        this.lTi.setImageBitmap((Bitmap)localObject1);
        y.a(this);
      }
      this.gsY.setText(localm.lRp.name);
      this.lTK.setText(this.lSG.bmK());
      localObject1 = this.lSG.bmN();
      if ((localObject1 == null) || (bi.oW(((bfm)localObject1).jQf))) {
        break label585;
      }
      this.lTJ.setSummary(((bfm)localObject1).jQf);
      str = "";
      localObject1 = str;
      if (!this.lSG.bmI().bne())
      {
        localObject1 = this.lSG.lQQ;
        if (localObject1 == null) {
          break label597;
        }
        this.lTI.setEnabled(true);
        this.lTI.setClickable(true);
        this.lTI.setSummary(com.tencent.mm.plugin.product.b.b.a(this, (um)localObject1));
        localObject1 = getString(a.i.mall_product_submit_price_express, new Object[] { com.tencent.mm.plugin.product.b.b.d(((um)localObject1).rlz, ((um)localObject1).rxc) });
        this.lTH.setVisibility(8);
      }
      label276:
      str = "";
      int i = this.lSG.bmM();
      if (i > 0)
      {
        bi.oW((String)localObject1);
        str = getString(a.i.mall_product_submit_price_discount, new Object[] { com.tencent.mm.plugin.product.b.b.d(i, localm.lRp.lNV) });
      }
      Object localObject2 = this.lSG.D(this);
      if (((LinkedList)localObject2).size() <= 0) {
        break label640;
      }
      this.lTO.setVisibility(0);
      this.lTP.bG((List)localObject2);
      this.lTP.notifyDataSetChanged();
      label366:
      localObject2 = this.lSG.lQR;
      if (localObject2 != null) {
        this.lTG.setText(Html.fromHtml(String.format("%s %s<br><br>%s %s %s", new Object[] { ((cf)localObject2).hbL, ((cf)localObject2).rcz, ((cf)localObject2).eJI, ((cf)localObject2).eJJ, ((cf)localObject2).jQf })));
      }
      localObject1 = (String)localObject1 + str;
      if (bi.oW((String)localObject1)) {
        break label652;
      }
      localObject1 = getString(a.i.mall_product_submit_price_desc_more, new Object[] { localObject1 });
      this.lTL.setText((CharSequence)localObject1);
      this.lTM.setVisibility(8);
      this.lTL.setVisibility(0);
    }
    for (;;)
    {
      this.lTN.setText(com.tencent.mm.plugin.product.b.b.d(this.lSG.bmL(), localm.lRp.lNV));
      this.eWk.setEnabled(this.lSG.bmU());
      return;
      this.lTj.setText(com.tencent.mm.plugin.product.b.b.l(localm.lRp.lRB, localm.lRp.lRC, localm.lRp.lNV));
      break;
      label585:
      this.lTJ.setSummary("");
      break label182;
      label597:
      this.lTI.setEnabled(false);
      this.lTI.setClickable(false);
      this.lTI.setSummary(getString(a.i.mall_product_submit_price_express_err));
      this.lTH.setVisibility(0);
      localObject1 = str;
      break label276;
      label640:
      this.lTO.setVisibility(8);
      break label366;
      label652:
      this.lTM.setVisibility(0);
      this.lTL.setVisibility(8);
    }
  }
  
  protected final int getLayoutId()
  {
    return a.g.product_submit_ui;
  }
  
  protected final void initView()
  {
    setMMTitle(a.i.mall_product_submit_title);
    this.lTF = ((RelativeLayout)findViewById(a.f.mall_product_submit_address_rl));
    this.lTG = ((TextView)findViewById(a.f.mall_product_submit_address_summary_tv));
    this.lTH = ((TextView)findViewById(a.f.mall_product_submit_address_summary_err_tv));
    this.lTI = ((MallProductItemView)findViewById(a.f.mall_product_submit_express));
    this.lTJ = ((MallProductItemView)findViewById(a.f.mall_product_submit_invoice));
    this.lTi = ((ImageView)findViewById(a.f.mall_product_submit_img_iv));
    this.gsY = ((TextView)findViewById(a.f.mall_product_submit_title_tv));
    this.lTK = ((TextView)findViewById(a.f.mall_product_submit_list_tv));
    this.lTj = ((TextView)findViewById(a.f.mall_product_submit_price_tv));
    this.lTL = ((TextView)findViewById(a.f.mall_product_submit_price_desc_tv));
    this.lTM = ((TextView)findViewById(a.f.mall_product_submit_price_desc_left_tv));
    this.lTN = ((TextView)findViewById(a.f.mall_product_submit_total_price_tv));
    this.lTO = ((ListView)findViewById(a.f.mall_product_submit_preferential_lv));
    this.lTP = new a(this);
    this.lTO.setAdapter(this.lTP);
    this.lTO.setOnItemClickListener(new MallProductSubmitUI.2(this));
    this.eWk = ((Button)findViewById(a.f.mall_product_submit_submit));
    this.eWk.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        paramAnonymousView = MallProductSubmitUI.d(MallProductSubmitUI.this);
        if (paramAnonymousView.lSG.bmU()) {
          if (paramAnonymousView.lSG.bmL() != 0) {
            break label78;
          }
        }
        label78:
        for (int i = 1; i != 0; i = 0)
        {
          g.Ek();
          o localo = g.Eh().dpP;
          bnx localbnx = paramAnonymousView.lSG.bmW();
          paramAnonymousView.lSG.getAppId();
          localo.a(new k(localbnx), 0);
          return;
        }
        g.Ek();
        g.Eh().dpP.a(new l(paramAnonymousView.lSG.bmW(), paramAnonymousView.lSG.getAppId()), 0);
      }
    });
    this.lTF.setOnClickListener(new MallProductSubmitUI.4(this));
    this.lTI.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        MallProductSubmitUI.this.showDialog(1);
      }
    });
    this.lTJ.setOnClickListener(new MallProductSubmitUI.6(this));
    MallProductItemView localMallProductItemView = this.lTJ;
    boolean bool;
    if ((this.lSG.bmI().lSD & 0x2) > 0)
    {
      bool = true;
      x.d("MicroMsg.MallProductConfig", "hasReceipt, ret = " + bool);
      if (!bool) {
        break label406;
      }
    }
    label406:
    for (int i = 0;; i = 8)
    {
      localMallProductItemView.setVisibility(i);
      if (this.lSG.bmI().bne())
      {
        this.lTI.setEnabled(false);
        this.lTI.setClickable(false);
        this.lTI.setSummary(getString(a.i.mall_product_submit_price_express_free));
      }
      return;
      bool = false;
      break;
    }
  }
  
  public final void m(String paramString, Bitmap paramBitmap)
  {
    paramString = new StringBuilder().append(paramString).append(", bitmap = ");
    if (paramBitmap == null) {}
    for (boolean bool = true;; bool = false)
    {
      x.d("MicroMsg.MallProductSubmitUI", bool);
      if (!bi.oW(this.lSG.bmJ())) {
        break;
      }
      return;
    }
    this.lTi.post(new MallProductSubmitUI.7(this, paramBitmap));
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    this.lTp.onActivityResult(paramInt1, paramInt2, paramIntent);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.lTp = new f(this.mController.tml, new MallProductSubmitUI.1(this));
    com.tencent.mm.plugin.product.a.a.bmF();
    this.lSG = com.tencent.mm.plugin.product.a.a.bmG();
    this.lRa = this.lSG.lRa;
    initView();
    aL();
  }
  
  protected Dialog onCreateDialog(int paramInt)
  {
    switch (paramInt)
    {
    }
    do
    {
      return super.onCreateDialog(paramInt);
      localObject2 = this.lSG.lQY;
    } while (localObject2 == null);
    Object localObject1 = new ArrayList();
    Object localObject2 = ((List)localObject2).iterator();
    while (((Iterator)localObject2).hasNext()) {
      ((List)localObject1).add(com.tencent.mm.plugin.product.b.b.a(this, (um)((Iterator)localObject2).next()));
    }
    localObject2 = getString(a.i.mall_product_submit_express);
    MallProductSubmitUI.8 local8 = new MallProductSubmitUI.8(this);
    d.a locala = new d.a(this);
    ListViewInScrollView localListViewInScrollView = (ListViewInScrollView)View.inflate(this, a.g.mm_list, null);
    localListViewInScrollView.setOnItemClickListener(new d.1(local8, locala));
    locala.lSx = ((List)localObject1);
    locala.lSy = 0;
    localListViewInScrollView.setAdapter(locala);
    localObject1 = new c.a(this);
    ((c.a)localObject1).abt((String)localObject2);
    ((c.a)localObject1).dR(localListViewInScrollView);
    ((c.a)localObject1).e(null);
    localObject1 = ((c.a)localObject1).anj();
    ((com.tencent.mm.ui.widget.a.c)localObject1).show();
    return (Dialog)localObject1;
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


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/product/ui/MallProductSubmitUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */