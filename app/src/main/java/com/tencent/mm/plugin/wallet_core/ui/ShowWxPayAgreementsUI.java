package com.tencent.mm.plugin.wallet_core.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.wxpay.a.a;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.ui.s;
import com.tencent.mm.ui.widget.MMWebView;
import com.tencent.xweb.n;

@a(3)
public class ShowWxPayAgreementsUI
  extends MMActivity
{
  private String content;
  private MMWebView psF;
  private TextView psG;
  private TextView psH;
  private int type;
  
  public void finish()
  {
    x.i("MicroMsg.ShowWxPayAgreementsUI", "onRefreshed");
    super.finish();
    overridePendingTransition(a.a.anim_not_change, a.a.push_down_out);
  }
  
  protected final int getLayoutId()
  {
    return a.g.show_wxpayagreements_ui;
  }
  
  protected final void initView()
  {
    boolean bool = false;
    h.mEJ.h(15236, new Object[] { Integer.valueOf(1) });
    getSupportActionBar().hide();
    overridePendingTransition(a.a.push_up_in, a.a.anim_not_change);
    this.type = getIntent().getIntExtra("agreement_type", 0);
    Object localObject = this.mController.contentView;
    int i = a.f.agreement_webview;
    MMWebView.he(this);
    localObject = (MMWebView)((View)localObject).findViewById(i);
    ((MMWebView)localObject).dfF = true;
    if (((MMWebView)localObject).getX5WebViewExtension() != null) {
      bool = true;
    }
    MMWebView.e((MMWebView)localObject, bool);
    this.psF = ((MMWebView)localObject);
    this.psF.getSettings().setJavaScriptEnabled(true);
    this.psG = ((TextView)findViewById(a.f.agreement_disagree_btn));
    this.psH = ((TextView)findViewById(a.f.agreement_agree_btn));
    this.content = getIntent().getStringExtra("agreement_content");
    this.psH.setOnClickListener(new ShowWxPayAgreementsUI.1(this));
    this.psG.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        h.mEJ.h(15236, new Object[] { Integer.valueOf(3) });
        ShowWxPayAgreementsUI.this.finish();
      }
    });
    this.psF.setWebViewClient(new e(this));
    this.psF.loadData(this.content, "text/html; charset=UTF-8", null);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    initView();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4) {
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  protected void onPause()
  {
    super.onPause();
  }
  
  protected void onResume()
  {
    super.onResume();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/ui/ShowWxPayAgreementsUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */