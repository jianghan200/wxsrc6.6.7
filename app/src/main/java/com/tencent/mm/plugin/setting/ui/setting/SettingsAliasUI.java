package com.tencent.mm.plugin.setting.ui.setting;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.ab.o;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.q;
import com.tencent.mm.modelsimple.r;
import com.tencent.mm.plugin.setting.a.f;
import com.tencent.mm.plugin.setting.a.g;
import com.tencent.mm.plugin.setting.a.i;
import com.tencent.mm.plugin.setting.b;
import com.tencent.mm.plugin.setting.model.d;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.d.j;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.s;
import com.tencent.mm.ui.s.b;

public class SettingsAliasUI
  extends MMActivity
  implements com.tencent.mm.ab.e
{
  private String cCR;
  private ImageView eCl;
  private ProgressDialog eHw = null;
  private TextView eTm;
  private TextView eVw;
  private EditText mRR;
  private d mRS;
  private boolean mRT = false;
  private TextView mRU;
  private com.tencent.mm.ab.e mRa = null;
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ab.l paraml)
  {
    int i = 1;
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if (this.mRT) {
        com.tencent.mm.plugin.report.service.h.mEJ.k(10358, "1");
      }
      YC();
      g.Ei().DT().set(42, this.cCR);
      paramString = g.DF();
      paraml = new SettingsAliasUI.5(this);
      this.mRa = paraml;
      paramString.a(255, paraml);
      paramString = new r(1);
      g.DF().a(paramString, 0);
    }
    for (;;)
    {
      return;
      if (this.eHw != null)
      {
        this.eHw.dismiss();
        this.eHw = null;
      }
      if (b.ezo.a(this.mController.tml, paramInt1, paramInt2, paramString)) {
        paramInt1 = i;
      }
      while (paramInt1 != 0)
      {
        return;
        switch (paramInt1)
        {
        }
        do
        {
          paramInt1 = 0;
          break;
        } while ((paramInt2 != -7) && (paramInt2 != -10));
        com.tencent.mm.ui.base.h.i(this.mController.tml, a.i.reg_username_exist_tip, a.i.modify_username_failed);
        paramInt1 = i;
      }
    }
  }
  
  protected final int getLayoutId()
  {
    return a.g.settings_alias;
  }
  
  protected final void initView()
  {
    setMMTitle(a.i.modify_username);
    this.eCl = ((ImageView)findViewById(a.f.avatar_iv));
    this.eTm = ((TextView)findViewById(a.f.nickname_tv));
    this.eVw = ((TextView)findViewById(a.f.username_tv));
    this.mRU = ((TextView)findViewById(a.f.modify_username_detail_message));
    this.mRR = ((EditText)findViewById(a.f.regbyqqreg_account_et));
    String str = q.GF();
    if (!ab.XT(str))
    {
      this.mRR.setText(q.GF());
      this.eVw.setText(getString(a.i.app_account, new Object[] { str }));
    }
    this.mRR.setSelection(this.mRR.getText().length());
    this.mRR.setFocusable(true);
    this.mRR.setFocusableInTouchMode(true);
    this.mRR.addTextChangedListener(new SettingsAliasUI.1(this));
    this.eTm.setText(j.a(this, bi.oV(q.GH()), this.eTm.getTextSize()));
    a.b.a(this.eCl, str);
    setBackBtn(new SettingsAliasUI.2(this));
    a(0, getString(a.i.app_save), new SettingsAliasUI.3(this), s.b.tmX);
    enableOptionMenu(false);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.mRT = getIntent().getBooleanExtra("KFromSetAliasTips", false);
    initView();
    g.DF().a(177, this);
  }
  
  public void onDestroy()
  {
    if (this.mRS != null) {
      g.DF().c(this.mRS);
    }
    g.DF().b(177, this);
    super.onDestroy();
  }
  
  public void onPause()
  {
    super.onPause();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/setting/ui/setting/SettingsAliasUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */