package com.tencent.mm.plugin.brandservice.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import com.tencent.mm.ar.k;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelvoiceaddr.ui.b;
import com.tencent.mm.plugin.brandservice.b.d;
import com.tencent.mm.plugin.brandservice.b.e;
import com.tencent.mm.plugin.brandservice.ui.base.BrandServiceSortView;
import com.tencent.mm.plugin.brandservice.ui.base.BrandServiceSortView.a;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.s;

@com.tencent.mm.ui.base.a(3)
public class BrandServiceLocalSearchUI
  extends MMActivity
  implements com.tencent.mm.modelvoiceaddr.ui.b.a, BrandServiceSortView.a
{
  private b hpe;
  private BrandServiceSortView hpf;
  
  public final void Uq()
  {
    YC();
  }
  
  public final void Ur() {}
  
  public final void WW()
  {
    finish();
  }
  
  public final void WX() {}
  
  public final void WY() {}
  
  public final void WZ() {}
  
  public final void a(boolean paramBoolean, String[] paramArrayOfString, long paramLong, int paramInt) {}
  
  public final boolean auW()
  {
    YC();
    return false;
  }
  
  protected final int getLayoutId()
  {
    return b.e.brand_service_local_search;
  }
  
  protected final void initView()
  {
    this.hpf = ((BrandServiceSortView)findViewById(b.d.sort_and_search_view));
    this.hpf.setMode(1);
    this.hpf.setReturnResult(getIntent().getBooleanExtra("is_return_result", false));
    this.hpf.cso();
    this.hpf.lP(false);
    this.hpf.setShowFooterView(false);
    this.hpf.setITransferToChildOnTouchListener(this);
    this.hpe = new b();
    this.hpe.mv(true);
    this.hpe.a(this);
    this.hpe.erG = false;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    lF(android.support.v4.content.a.g(this.mController.tml, com.tencent.mm.plugin.brandservice.b.a.normal_actionbar_color));
    initView();
    paramBundle = new k(18);
    g.DF().a(paramBundle, 0);
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    this.hpe.a(this, paramMenu);
    return true;
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    this.hpf.release();
  }
  
  protected void onPause()
  {
    super.onPause();
    this.hpe.cancel();
    this.hpe.clearFocus();
  }
  
  public boolean onPrepareOptionsMenu(Menu paramMenu)
  {
    this.hpe.a(this, paramMenu);
    return true;
  }
  
  public final boolean pj(String paramString)
  {
    YC();
    return true;
  }
  
  public final void pk(String paramString)
  {
    x.i("MicroMsg.BrandServiceLocalSearchUI", "search biz, key word : %s", new Object[] { paramString });
    this.hpf.aac(paramString);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/brandservice/ui/BrandServiceLocalSearchUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */