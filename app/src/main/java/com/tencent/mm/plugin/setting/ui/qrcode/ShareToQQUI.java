package com.tencent.mm.plugin.setting.ui.qrcode;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.ab.o;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.setting.a.f;
import com.tencent.mm.plugin.setting.a.g;
import com.tencent.mm.plugin.setting.a.i;
import com.tencent.mm.plugin.setting.b;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.f.a.c;
import com.tencent.mm.ui.s;
import com.tencent.mm.ui.widget.MMEditText.c;

public class ShareToQQUI
  extends MMActivity
  implements com.tencent.mm.ab.e
{
  private ProgressDialog eHw = null;
  private TextView mPC;
  private int mPD;
  private boolean mPE = false;
  private EditText meN;
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ab.l paraml)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ShareToQQUI", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (paraml.getType() != 26) {}
    do
    {
      return;
      if (this.eHw != null)
      {
        this.eHw.dismiss();
        this.eHw = null;
      }
      if ((paramInt1 == 4) && (paramInt2 == -68))
      {
        paraml = paramString;
        if (bi.oW(paramString)) {
          paraml = "error";
        }
        h.a(this, paraml, getString(a.i.app_tip), new ShareToQQUI.3(this), null);
        return;
      }
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        YC();
        paramString = getString(a.i.share_ok);
        new ShareToQQUI.4(this);
        h.bA(this, paramString);
        return;
      }
      this.mPE = false;
    } while (b.ezo.a(this.mController.tml, paramInt1, paramInt2, paramString));
    Toast.makeText(this, getString(a.i.share_err, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
  }
  
  protected final int getLayoutId()
  {
    return a.g.edit_sharetoqq;
  }
  
  protected final void initView()
  {
    setMMTitle(a.i.send_qrcode_to_microblog);
    this.meN = ((EditText)findViewById(a.f.content));
    this.mPC = ((TextView)findViewById(a.f.wordcount));
    this.meN.addTextChangedListener(new MMEditText.c(this.meN, this.mPC, 280));
    this.mPD = getIntent().getIntExtra("show_to", 2);
    if (this.mPD == 4) {
      this.meN.setText(a.i.self_qrcode_show_facebook_et_content);
    }
    for (;;)
    {
      setBackBtn(new ShareToQQUI.1(this));
      addTextOptionMenu(0, getString(a.i.app_share), new ShareToQQUI.2(this));
      return;
      this.meN.setText(a.i.self_qrcode_show_qq_et_content);
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    com.tencent.mm.kernel.g.DF().a(26, this);
    initView();
    if (q.Hg())
    {
      paramBundle = new c("290293790992170");
      paramBundle.aaT(bi.oV((String)com.tencent.mm.kernel.g.Ei().DT().get(65830, null)));
      new com.tencent.mm.plugin.account.model.g(paramBundle, new ShareToQQUI.5(this)).Yl();
    }
  }
  
  public void onDestroy()
  {
    com.tencent.mm.kernel.g.DF().b(26, this);
    super.onDestroy();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/setting/ui/qrcode/ShareToQQUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */