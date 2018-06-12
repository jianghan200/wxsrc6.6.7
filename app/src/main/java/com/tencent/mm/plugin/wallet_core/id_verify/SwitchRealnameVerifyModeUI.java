package com.tencent.mm.plugin.wallet_core.id_verify;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.tencent.mm.ab.l;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.wallet_core.id_verify.model.b;
import com.tencent.mm.plugin.wallet_core.ui.q;
import com.tencent.mm.plugin.wxpay.a.e;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.wallet.f;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.s;
import com.tencent.mm.wallet_core.c;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import org.json.JSONException;
import org.json.JSONObject;

public class SwitchRealnameVerifyModeUI
  extends WalletBaseUI
  implements View.OnClickListener
{
  private int eLd = 0;
  private q kZX = new q();
  private boolean pjc = false;
  private int pka = 500;
  private long pkb = 0L;
  private View pkc;
  private View pkd;
  private View pke;
  private TextView pkf;
  private TextView pkg;
  private TextView pkh;
  private TextView pki;
  private TextView pkj;
  private TextView pkk;
  private TextView pkl;
  private String pkm;
  private String pkn;
  private String pko;
  private boolean pkp;
  private boolean pkq = false;
  
  private static JSONObject bOp()
  {
    g.Ek();
    Object localObject = g.Ei().DT().get(aa.a.sTc, "");
    if (localObject != null)
    {
      localObject = (String)localObject;
      if (!bi.oW((String)localObject)) {
        try
        {
          localObject = new JSONObject((String)localObject);
          long l1 = System.currentTimeMillis() / 1000L;
          long l2 = ((JSONObject)localObject).getLong("timestamp");
          long l3 = ((JSONObject)localObject).getLong("cache_time");
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SwitchRealnameVerifyModeUI", " dddd time=" + l1 + ";timestamp=" + l2 + ";cachetime=" + l3);
          if (l1 - l2 > l3)
          {
            com.tencent.mm.sdk.platformtools.x.e("MicroMsg.SwitchRealnameVerifyModeUI", "wording data from cache is out of date");
            return null;
          }
          return (JSONObject)localObject;
        }
        catch (JSONException localJSONException)
        {
          com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.SwitchRealnameVerifyModeUI", localJSONException, "", new Object[0]);
          com.tencent.mm.sdk.platformtools.x.e("MicroMsg.SwitchRealnameVerifyModeUI", "parse wording data form cache error");
          return null;
        }
      }
    }
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SwitchRealnameVerifyModeUI", "cache is null");
    return null;
  }
  
  private boolean js(boolean paramBoolean)
  {
    JSONObject localJSONObject = bOp();
    if ((paramBoolean) && (localJSONObject == null)) {
      localJSONObject = new JSONObject();
    }
    for (;;)
    {
      String str;
      if (localJSONObject != null)
      {
        str = bi.aG(localJSONObject.optString("cache_header_titles", getString(a.i.switch_realname_default_tip)), getString(a.i.switch_realname_default_tip));
        if (!this.pkq) {
          break label398;
        }
        ((TextView)findViewById(a.f.switch_real_name_tv)).setText(a.i.wallet_real_name_verify_title_from_pwd_desc);
        if (!localJSONObject.optBoolean("isShowBindCardVerify", false)) {
          break label415;
        }
        this.pkk.setText(localJSONObject.optString("bindCardVerifyTitle"));
        this.pkl.setText(localJSONObject.optString("bindCardVerifySubtitle"));
        this.pke.setVisibility(0);
        label115:
        if (!localJSONObject.optBoolean("isShowBindCard", false)) {
          break label427;
        }
        this.pkf.setText(localJSONObject.optString("bindcardTitle", getString(a.i.switch_realname_verify_mode_bindcard)));
        this.pkg.setText(localJSONObject.optString("bindcardSubTitle", getString(a.i.switch_realname_verify_mode_bindcard_tip)));
        this.pkc.setVisibility(0);
        label174:
        if (!localJSONObject.optBoolean("isShowBindId", false)) {
          break label439;
        }
        this.pkh.setText(localJSONObject.optString("bindIdTitle", getString(a.i.switch_realname_verify_mode_id_verify)));
        this.pki.setText(localJSONObject.optString("bindIdSubTitle", getString(a.i.switch_realname_verify_mode_id_verify_tip)));
        this.pkd.setVisibility(0);
        label235:
        this.pkn = localJSONObject.optString("bindCardVerifyAlertViewRightBtnTxt", "");
        this.pko = localJSONObject.optString("bindCardVerifyAlertViewContent", "");
        this.pkp = localJSONObject.optBoolean("isShowBindCardVerifyAlertView", false);
        str = localJSONObject.optString("extral_wording", "");
        if (bi.oW(str)) {
          break label451;
        }
        this.pkj.setText(str);
        this.pkj.setVisibility(0);
      }
      for (;;)
      {
        this.pkn = localJSONObject.optString("bindCardVerifyAlertViewRightBtnTxt", "");
        this.pko = localJSONObject.optString("bindCardVerifyAlertViewContent");
        this.pkp = localJSONObject.optBoolean("isShowBindCardVerifyAlertView", false);
        paramBoolean = localJSONObject.optBoolean("question_answer_switch", false);
        this.pkm = localJSONObject.optString("question_answer_url", "");
        if ((paramBoolean) && (!bi.oW(this.pkm))) {
          addIconOptionMenu(0, a.e.wallet_qanda_icon, new MenuItem.OnMenuItemClickListener()
          {
            public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
            {
              com.tencent.mm.wallet_core.ui.e.a(18, bi.VE(), SwitchRealnameVerifyModeUI.a(SwitchRealnameVerifyModeUI.this));
              com.tencent.mm.wallet_core.ui.e.l(SwitchRealnameVerifyModeUI.this.mController.tml, SwitchRealnameVerifyModeUI.d(SwitchRealnameVerifyModeUI.this), false);
              return true;
            }
          });
        }
        paramBoolean = true;
        return paramBoolean;
        label398:
        ((TextView)findViewById(a.f.switch_real_name_tv)).setText(str);
        break;
        label415:
        this.pke.setVisibility(8);
        break label115;
        label427:
        this.pkc.setVisibility(8);
        break label174;
        label439:
        this.pkd.setVisibility(8);
        break label235;
        label451:
        this.pkj.setVisibility(8);
      }
    }
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    if ((paraml instanceof com.tencent.mm.plugin.wallet_core.c.a))
    {
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        f.Ul(((com.tencent.mm.plugin.wallet_core.c.a)paraml).bOj());
        js(580);
        ((com.tencent.mm.plugin.wallet_core.c.a)paraml).blM();
        paramString = cDK();
        if (paramString != null)
        {
          paramString = paramString.jfZ;
          paramString.putInt("real_name_verify_mode", 1);
          com.tencent.mm.wallet_core.a.j(this, paramString);
        }
        return true;
      }
    }
    else if ((paraml instanceof b))
    {
      js(1666);
      js(true);
      this.pjc = ((b)paraml).pjc;
    }
    return false;
  }
  
  protected final int getLayoutId()
  {
    return a.g.wallet_realname_verify_mode_ui;
  }
  
  protected final void initView()
  {
    setMMTitle(a.i.wallet_real_name_verify_title);
    this.pkc = findViewById(a.f.switch_to_bindcard);
    this.pkd = findViewById(a.f.switch_to_verify_id);
    this.pke = findViewById(a.f.switch_to_verifycard);
    this.pkd.setOnClickListener(this);
    this.pkc.setOnClickListener(this);
    this.pke.setOnClickListener(this);
    this.pkf = ((TextView)findViewById(a.f.bind_card_title));
    this.pkg = ((TextView)findViewById(a.f.bind_card_sub_title));
    this.pkh = ((TextView)findViewById(a.f.bind_id_title));
    this.pki = ((TextView)findViewById(a.f.bind_id_sub_title));
    this.pkj = ((TextView)findViewById(a.f.extral_wording));
    this.pkk = ((TextView)findViewById(a.f.verify_card_title));
    this.pkl = ((TextView)findViewById(a.f.verify_card_sub_title));
    if (this.pkq) {
      ((TextView)findViewById(a.f.switch_real_name_tv)).setText(a.i.wallet_real_name_verify_title_from_pwd_desc);
    }
    js(false);
    b localb = new b();
    jr(1666);
    a(localb, true, true);
    setBackBtn(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        paramAnonymousMenuItem = SwitchRealnameVerifyModeUI.this.cDK();
        if (paramAnonymousMenuItem != null)
        {
          com.tencent.mm.wallet_core.ui.e.a(14, bi.VE(), SwitchRealnameVerifyModeUI.a(SwitchRealnameVerifyModeUI.this));
          paramAnonymousMenuItem.c(SwitchRealnameVerifyModeUI.this, 0);
          return true;
        }
        SwitchRealnameVerifyModeUI.this.finish();
        return false;
      }
    });
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt1 == 1)
    {
      if (paramInt2 == -1) {
        this.kZX.bcc();
      }
    }
    else {
      return;
    }
    this.kZX.cancel();
  }
  
  public void onClick(View paramView)
  {
    if (System.currentTimeMillis() - this.pkb <= this.pka)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.SwitchRealnameVerifyModeUI", "process pass");
      return;
    }
    this.pkb = System.currentTimeMillis();
    this.kZX.a(new SwitchRealnameVerifyModeUI.3(this, paramView), this.pjc);
  }
  
  public void onClickImp(final View paramView)
  {
    int i = paramView.getId();
    paramView = cDK();
    Bundle localBundle;
    if (paramView != null)
    {
      localBundle = paramView.jfZ;
      if (i != a.f.switch_to_bindcard) {
        break label213;
      }
      com.tencent.mm.wallet_core.ui.e.a(15, bi.VE(), this.eLd);
      if (localBundle.getInt("realname_scene") != 1) {
        break label199;
      }
      if (getIntent() == null)
      {
        paramView = "";
        if (bi.oW("")) {
          paramView = getString(a.i.wallet_unknown_err);
        }
        h.a(this, paramView, null, false, new SwitchRealnameVerifyModeUI.5(this));
      }
    }
    else
    {
      return;
    }
    jr(580);
    a(new com.tencent.mm.plugin.wallet_core.c.a(getIntent().getStringExtra("appId"), getIntent().getStringExtra("timeStamp"), getIntent().getStringExtra("nonceStr"), getIntent().getStringExtra("packageExt"), getIntent().getStringExtra("signtype"), getIntent().getStringExtra("paySignature"), getIntent().getStringExtra("url"), 8, "idCardRealnameVerify", getIntent().getIntExtra("pay_channel", 0)), true, false);
    return;
    label199:
    localBundle.putInt("real_name_verify_mode", 1);
    for (;;)
    {
      com.tencent.mm.wallet_core.a.j(this, localBundle);
      return;
      label213:
      if (i == a.f.switch_to_verify_id)
      {
        com.tencent.mm.wallet_core.ui.e.a(17, bi.VE(), this.eLd);
        localBundle.putInt("real_name_verify_mode", 2);
      }
      else if (i == a.f.switch_to_verifycard)
      {
        com.tencent.mm.wallet_core.ui.e.a(16, bi.VE(), this.eLd);
        if ((this.pkp) && (!bi.oW(this.pko)))
        {
          h.a(this, this.pko, "", this.pkn, false, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              paramAnonymousDialogInterface = paramView.jfZ;
              paramAnonymousDialogInterface.putInt("real_name_verify_mode", 3);
              paramAnonymousDialogInterface.putString("verify_card_flag", "1");
              com.tencent.mm.wallet_core.a.j(SwitchRealnameVerifyModeUI.this, paramAnonymousDialogInterface);
            }
          });
          return;
        }
        localBundle.putInt("real_name_verify_mode", 3);
        localBundle.putString("verify_card_flag", "1");
      }
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.pkq = this.sy.getBoolean("key_from_set_pwd", false);
    initView();
    cDK();
    this.eLd = this.sy.getInt("entry_scene", this.eLd);
    com.tencent.mm.wallet_core.ui.e.a(13, bi.VE(), this.eLd);
    if (this.pkq) {
      setMMTitle(a.i.wallet_real_name_verify_title_from_pwd);
    }
    this.kZX.pzb = new SwitchRealnameVerifyModeUI.1(this);
  }
  
  public void onDestroy()
  {
    super.onDestroy();
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      c localc = cDK();
      if (localc != null)
      {
        com.tencent.mm.wallet_core.ui.e.a(14, bi.VE(), this.eLd);
        localc.c(this, 0);
        return true;
      }
      finish();
    }
    return super.onKeyUp(paramInt, paramKeyEvent);
  }
  
  public void onPause()
  {
    super.onPause();
    this.kZX.onPause();
  }
  
  public void onResume()
  {
    super.onResume();
    this.kZX.onResume();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/id_verify/SwitchRealnameVerifyModeUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */