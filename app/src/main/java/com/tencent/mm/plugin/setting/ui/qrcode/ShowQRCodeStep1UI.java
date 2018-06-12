package com.tencent.mm.plugin.setting.ui.qrcode;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.ab.e;
import com.tencent.mm.ab.o;
import com.tencent.mm.as.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.setting.a.e;
import com.tencent.mm.plugin.setting.a.f;
import com.tencent.mm.plugin.setting.a.g;
import com.tencent.mm.plugin.setting.a.i;
import com.tencent.mm.plugin.setting.b;
import com.tencent.mm.sdk.platformtools.c;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.s;

public class ShowQRCodeStep1UI
  extends MMActivity
  implements e
{
  private ProgressDialog eHw = null;
  private int mPD = 1;
  private ImageView mPI = null;
  byte[] mPJ = null;
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ab.l paraml)
  {
    x.i("MicroMsg.ShowQRCodeStep1UI", "onSceneEnd: errType = %d errCode = %d errMsg = %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if (this.eHw != null)
    {
      this.eHw.dismiss();
      this.eHw = null;
    }
    if (b.ezo.b(this.mController.tml, paramInt1, paramInt2, paramString)) {
      return;
    }
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      Toast.makeText(this, getString(a.i.fmt_self_qrcode_getting_err, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
      return;
    }
    this.mPJ = ((a)paraml).edg;
    this.mPI.setImageBitmap(c.bs(this.mPJ));
  }
  
  final void bts()
  {
    a locala = new a();
    g.DF().a(locala, 0);
    ActionBarActivity localActionBarActivity = this.mController.tml;
    getString(a.i.app_tip);
    this.eHw = h.a(localActionBarActivity, getString(a.i.self_qrcode_getting), true, new ShowQRCodeStep1UI.5(this, locala));
  }
  
  protected final int getLayoutId()
  {
    return a.g.show_qrcode_step1;
  }
  
  protected final void initView()
  {
    setMMTitle(a.i.send_qrcode_to_microblog);
    this.mPI = ((ImageView)findViewById(a.f.self_qrcode_iv));
    this.mPD = getIntent().getIntExtra("show_to", 1);
    TextView localTextView = (TextView)findViewById(a.f.show_qrcode_info_tv);
    if (this.mPD == 3) {
      localTextView.setText(getString(a.i.self_qrcode_show_all, new Object[] { getString(a.i.self_qrcode_show_all_sina) }));
    }
    for (;;)
    {
      bts();
      setBackBtn(new ShowQRCodeStep1UI.1(this));
      addIconOptionMenu(0, a.e.mm_title_btn_menu, new ShowQRCodeStep1UI.2(this));
      ((Button)findViewById(a.f.self_qrcode_share_btn)).setOnClickListener(new ShowQRCodeStep1UI.3(this));
      return;
      if (this.mPD == 4) {
        localTextView.setText(getString(a.i.self_qrcode_show_all, new Object[] { getString(a.i.self_qrcode_show_all_facebook) }));
      } else if (this.mPD == 2) {
        localTextView.setText(getString(a.i.self_qrcode_show_all, new Object[] { getString(a.i.self_qrcode_show_all_qzone) }));
      } else {
        localTextView.setText(getString(a.i.self_qrcode_show_all, new Object[] { getString(a.i.self_qrcode_show_all_qqwb) }));
      }
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    initView();
    g.DF().a(168, this);
  }
  
  public void onDestroy()
  {
    g.DF().b(168, this);
    super.onDestroy();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/setting/ui/qrcode/ShowQRCodeStep1UI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */