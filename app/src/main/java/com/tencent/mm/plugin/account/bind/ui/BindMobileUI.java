package com.tencent.mm.plugin.account.bind.ui;

import android.content.ContentResolver;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.al.b;
import com.tencent.mm.al.b.a;
import com.tencent.mm.modelsimple.BindWordingContent;
import com.tencent.mm.plugin.account.a.e;
import com.tencent.mm.plugin.account.a.f;
import com.tencent.mm.plugin.account.a.g;
import com.tencent.mm.plugin.account.a.j;
import com.tencent.mm.plugin.account.a.a;
import com.tencent.mm.plugin.account.friend.ui.i;
import com.tencent.mm.plugin.account.friend.ui.i.a;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMWizardActivity;

public class BindMobileUI
  extends MMWizardActivity
{
  private String bTi;
  private String countryCode = null;
  private String dYy = null;
  private i eFY;
  private BindWordingContent eGQ;
  private int eGR;
  private TextView eGX;
  private Button eGY;
  private TextView eGZ;
  private EditText eGp;
  private LinearLayout eGq;
  private TextView eGs;
  private TextView eGt;
  private CheckBox eGu;
  private String eGw = null;
  private TextView eHa;
  private CheckBox eHb;
  private LinearLayout eHc;
  private ImageView eHd;
  private boolean eHe;
  
  protected final int getLayoutId()
  {
    return a.g.bind_mcontact_input_phonenum;
  }
  
  protected final void initView()
  {
    this.eGp = ((EditText)findViewById(a.f.bind_mcontact_mobile));
    this.eGq = ((LinearLayout)findViewById(a.f.country_code_ll));
    this.eGs = ((TextView)findViewById(a.f.country_name));
    this.eGt = ((TextView)findViewById(a.f.country_code));
    this.eGX = ((TextView)findViewById(a.f.bind_mcontact_title_tv));
    this.eGY = ((Button)findViewById(a.f.bind_m_contact_bind_mobile));
    this.eGZ = ((TextView)findViewById(a.f.bind_mcontact_skip_bind));
    this.eGX.setText(getString(a.j.bind_mcontact_security_bander_hint));
    this.eHa = ((TextView)findViewById(a.f.bind_m_contact_bind_mobile_hint));
    this.eHc = ((LinearLayout)findViewById(a.f.bind_mcontact_sync_contact_cb_ll));
    this.eHb = ((CheckBox)findViewById(a.f.bind_mcontact_agree_cb_recom_friend));
    this.eGu = ((CheckBox)findViewById(a.f.bind_mcontact_agree_cb));
    this.eHd = ((ImageView)findViewById(a.f.bind_mcontact_icon));
    if (this.eGQ != null)
    {
      if ((this.eGQ.title != null) && (this.eGQ.title.length() > 0)) {
        this.eGX.setText(this.eGQ.title);
      }
      if ((this.eGQ.content != null) && (this.eGQ.content.length() > 0)) {
        this.eHa.setText(this.eGQ.content);
      }
    }
    switch (this.eGQ.brl.intValue())
    {
    default: 
      switch (this.eGR)
      {
      default: 
        label328:
        if ((bi.oW(this.dYy)) && (bi.oW(this.countryCode))) {}
        break;
      }
      break;
    }
    for (;;)
    {
      if ((this.dYy != null) && (!this.dYy.equals(""))) {
        this.eGs.setText(this.dYy);
      }
      if ((this.countryCode != null) && (!this.countryCode.equals(""))) {
        this.eGt.setText("+" + this.countryCode);
      }
      if ((this.eGw != null) && (!this.eGw.equals(""))) {
        this.eGp.setText(this.eGw);
      }
      this.eGY.setOnClickListener(new BindMobileUI.2(this));
      this.eGZ.setOnClickListener(new BindMobileUI.3(this));
      if (this.eHe)
      {
        setMMTitle(a.j.bind_mcontact_bind_for_chatroom_title);
        this.eHd.setVisibility(8);
        this.eGX.setText(a.j.bind_mcontact_for_chatroom_title);
        this.eHc.setVisibility(8);
        this.eHb.setVisibility(8);
        this.eHb.setChecked(false);
        this.eGu.setVisibility(0);
        this.eGu.setChecked(false);
        this.eHa.setVisibility(8);
        this.eHa.setText(getString(a.j.bind_mcontact_bind_mobile_warnning_hint));
        this.eGZ.setVisibility(8);
        this.eGY.setText(a.j.bind_mcontact_bind_for_chatroom_title);
        setBackBtn(new BindMobileUI.4(this));
      }
      this.eGq.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          paramAnonymousView = new Intent();
          paramAnonymousView.putExtra("country_name", BindMobileUI.f(BindMobileUI.this));
          paramAnonymousView.putExtra("couttry_code", BindMobileUI.g(BindMobileUI.this));
          a.ezn.b(paramAnonymousView, BindMobileUI.this);
        }
      });
      this.eGq.setOnClickListener(new BindMobileUI.6(this));
      return;
      this.eHd.setImageResource(a.e.bind_mcontact_protect);
      break;
      this.eHd.setImageResource(a.e.bind_mcontact_warning);
      break;
      this.eHd.setImageResource(a.e.bind_mcontact_reco_friends);
      break;
      this.eHc.setVisibility(0);
      this.eHb.setVisibility(0);
      this.eHa.setVisibility(8);
      break label328;
      this.eHc.setVisibility(8);
      this.eHb.setVisibility(8);
      this.eHa.setVisibility(0);
      break label328;
      Object localObject = ((TelephonyManager)getSystemService("phone")).getSimCountryIso();
      x.d("MicroMsg.BindMContactUI", "tm.getSimCountryIso()" + (String)localObject);
      if (bi.oW((String)localObject))
      {
        x.e("MicroMsg.BindMContactUI", "getDefaultCountryInfo error");
      }
      else
      {
        localObject = b.j(this, (String)localObject, getString(a.j.country_code));
        if (localObject == null)
        {
          x.e("MicroMsg.BindMContactUI", "getDefaultCountryInfo error");
        }
        else
        {
          this.dYy = ((b.a)localObject).dYy;
          this.countryCode = ((b.a)localObject).dYx;
        }
      }
    }
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    switch (paramInt2)
    {
    }
    do
    {
      return;
      this.dYy = bi.aG(paramIntent.getStringExtra("country_name"), "");
      this.countryCode = bi.aG(paramIntent.getStringExtra("couttry_code"), "");
      if (!this.dYy.equals("")) {
        this.eGs.setText(this.dYy);
      }
    } while (this.countryCode.equals(""));
    this.eGt.setText("+" + this.countryCode);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setMMTitle(a.j.bind_mcontact_security_title);
    this.dYy = bi.aG(getIntent().getStringExtra("country_name"), "");
    this.countryCode = bi.aG(getIntent().getStringExtra("couttry_code"), "");
    this.eGw = bi.aG(getIntent().getStringExtra("bindmcontact_shortmobile"), "");
    this.eGQ = ((BindWordingContent)getIntent().getParcelableExtra("kstyle_bind_wording"));
    this.eGR = getIntent().getIntExtra("kstyle_bind_recommend_show", 0);
    this.eHe = getIntent().getBooleanExtra("is_bind_for_chatroom_upgrade", false);
    initView();
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    if (this.eFY != null)
    {
      getContentResolver().unregisterContentObserver(this.eFY);
      this.eFY.recycle();
    }
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      DT(1);
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    int i;
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length <= 0)) {
      if (paramArrayOfInt == null)
      {
        i = -1;
        x.w("MicroMsg.BindMContactUI", "summerper onRequestPermissionsResult, grantResults length is:%d requestCode:%d, permissions:%s, stack:%s", new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt), paramArrayOfString, bi.cjd() });
      }
    }
    do
    {
      return;
      i = paramArrayOfInt.length;
      break;
      x.i("MicroMsg.BindMContactUI", "summerper onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
      switch (paramInt)
      {
      default: 
        return;
      }
    } while ((paramArrayOfInt[0] != 0) || (this.eFY == null));
    this.eFY.Yh();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/account/bind/ui/BindMobileUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */