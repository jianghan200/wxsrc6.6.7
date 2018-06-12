package com.tencent.mm.plugin.scanner.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.R.o;
import com.tencent.mm.ab.o;
import com.tencent.mm.bg.d;
import com.tencent.mm.model.au;
import com.tencent.mm.plugin.scanner.a.a.a;
import com.tencent.mm.plugin.scanner.a.h;
import com.tencent.mm.plugin.scanner.a.i;
import com.tencent.mm.plugin.scanner.util.n.a;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.s;
import java.util.LinkedList;
import java.util.List;

public class ProductPurchaseAreaUI
  extends MMPreference
{
  protected f gua;
  private String iiv;
  private List<a.a> mIP;
  private int mIQ;
  
  private void bsF()
  {
    if (this.mIP == null) {
      return;
    }
    int i = 0;
    while (i < this.mIP.size())
    {
      Object localObject = (a.a)this.mIP.get(i);
      if (localObject != null)
      {
        a locala = new a(this);
        locala.setKey(String.valueOf(i));
        locala.setTitle(((a.a)localObject).name);
        locala.setSummary(((a.a)localObject).desc);
        locala.mGM = ((a.a)localObject).dzA;
        this.gua.a(locala);
        if (i != this.mIP.size() - 1)
        {
          localObject = new g(this.mController.tml);
          this.gua.a((Preference)localObject);
        }
      }
      i += 1;
    }
    this.gua.notifyDataSetChanged();
  }
  
  private static void j(Context paramContext, String paramString, int paramInt)
  {
    Intent localIntent = new Intent();
    Bundle localBundle = new Bundle();
    localBundle.putString("jsapi_args_appid", i.vx(paramInt));
    localIntent.putExtra("jsapiargs", localBundle);
    localIntent.putExtra("rawUrl", paramString);
    localIntent.putExtra("pay_channel", 3);
    d.b(paramContext, "webview", ".ui.tools.WebViewUI", localIntent);
  }
  
  public final int Ys()
  {
    return R.o.product_purchase_area;
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    if (this.mIP == null) {
      return false;
    }
    for (;;)
    {
      a.a locala;
      try
      {
        int i = Integer.valueOf(paramPreference.mKey).intValue();
        if ((i < 0) || (i >= this.mIP.size())) {
          break label347;
        }
        locala = (a.a)this.mIP.get(i);
        if (locala == null) {
          return false;
        }
        paramPreference = null;
        switch (locala.type)
        {
        case 1: 
          x.i("MicroMsg.ProductPurchaseAreaUI", "Default go url:" + locala.egr);
          paramf = paramPreference;
          if (!bi.oW(locala.egr))
          {
            j(this.mController.tml, locala.egr, this.mIQ);
            paramf = paramPreference;
          }
          paramf = new h(this.iiv, locala.mFy, locala.type, paramf, this.mIP.size(), locala.showType);
          au.DF().a(paramf, 0);
          return true;
        }
      }
      catch (Exception paramf)
      {
        x.e("MicroMsg.ProductPurchaseAreaUI", "onPreferenceTreeClick, [%s]", new Object[] { paramf.getMessage() });
        x.printErrStackTrace("MicroMsg.ProductPurchaseAreaUI", paramf, "", new Object[0]);
        return false;
      }
      paramf = locala.egr;
      if (!bi.oW(locala.egr))
      {
        j(this.mController.tml, locala.egr, this.mIQ);
      }
      else
      {
        x.w("MicroMsg.ProductPurchaseAreaUI", "action link empty");
        continue;
        paramPreference = locala.mFz;
        paramf = paramPreference;
        if (!bi.oW(locala.mFz))
        {
          paramf = new Intent();
          paramf.putExtra("key_product_id", locala.mFz);
          paramf.putExtra("key_product_scene", 12);
          d.b(this, "product", ".ui.MallProductUI", paramf);
          paramf = paramPreference;
          continue;
          label347:
          return false;
        }
      }
    }
  }
  
  protected final void initView()
  {
    setBackBtn(new ProductPurchaseAreaUI.1(this));
    this.gua = this.tCL;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    initView();
    paramBundle = i.bY(getIntent().getStringExtra("key_Product_xml"), getIntent().getIntExtra("key_Product_funcType", 0));
    if ((paramBundle != null) && (paramBundle.mNX != null))
    {
      this.iiv = paramBundle.field_productid;
      this.mIQ = paramBundle.field_functionType;
      String str = getIntent().getStringExtra("referkey");
      x.i("MicroMsg.ProductPurchaseAreaUI", "referkey:" + str);
      int i;
      if (!bi.oW(str)) {
        i = 0;
      }
      for (;;)
      {
        if (i < paramBundle.mNX.size())
        {
          if (str.equals(((com.tencent.mm.plugin.scanner.a.a)paramBundle.mNX.get(i)).mFr))
          {
            this.mIP = ((com.tencent.mm.plugin.scanner.a.a)paramBundle.mNX.get(i)).egs;
            setMMTitle(((com.tencent.mm.plugin.scanner.a.a)paramBundle.mNX.get(i)).title);
            bsF();
          }
        }
        else {
          return;
        }
        i += 1;
      }
    }
    x.w("MicroMsg.ProductPurchaseAreaUI", "Data product null");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/scanner/ui/ProductPurchaseAreaUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */