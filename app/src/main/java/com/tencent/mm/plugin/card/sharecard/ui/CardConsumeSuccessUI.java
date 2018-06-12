package com.tencent.mm.plugin.card.sharecard.ui;

import android.annotation.TargetApi;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.ak.a.a.c;
import com.tencent.mm.ak.a.a.c.a;
import com.tencent.mm.g.a.bx;
import com.tencent.mm.kernel.b;
import com.tencent.mm.plugin.card.a.a;
import com.tencent.mm.plugin.card.a.b;
import com.tencent.mm.plugin.card.a.c;
import com.tencent.mm.plugin.card.a.d;
import com.tencent.mm.plugin.card.a.e;
import com.tencent.mm.plugin.card.a.g;
import com.tencent.mm.plugin.card.d.f;
import com.tencent.mm.plugin.card.d.r;
import com.tencent.mm.plugin.card.model.am;
import com.tencent.mm.plugin.card.model.m;
import com.tencent.mm.plugin.card.sharecard.model.ShareCardInfo;
import com.tencent.mm.plugin.card.sharecard.model.j;
import com.tencent.mm.plugin.card.sharecard.model.q;
import com.tencent.mm.protocal.c.lf;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.p;
import com.tencent.mm.ui.s;
import com.tencent.mm.ui.statusbar.DrawStatusBarActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class CardConsumeSuccessUI
  extends DrawStatusBarActivity
  implements com.tencent.mm.ab.e
{
  private View FU;
  private final String TAG = "MicroMsg.CardConsumeSuccessUI";
  private View.OnClickListener eZF = new View.OnClickListener()
  {
    public final void onClick(View paramAnonymousView)
    {
      if (paramAnonymousView.getId() == a.d.accept_btn) {
        CardConsumeSuccessUI.a(CardConsumeSuccessUI.this);
      }
      while (paramAnonymousView.getId() != a.d.success_share_tv) {
        return;
      }
      paramAnonymousView = new Intent();
      paramAnonymousView.putExtra("KLabel_range_index", CardConsumeSuccessUI.this.hzB);
      paramAnonymousView.putExtra("Klabel_name_list", CardConsumeSuccessUI.b(CardConsumeSuccessUI.this));
      paramAnonymousView.putExtra("Kother_user_name_list", CardConsumeSuccessUI.c(CardConsumeSuccessUI.this));
      paramAnonymousView.putExtra("k_sns_label_ui_title", CardConsumeSuccessUI.this.getString(a.g.card_share_card_private_setting_title));
      paramAnonymousView.putExtra("k_sns_label_ui_style", 0);
      paramAnonymousView.putExtra("KLabel_is_filter_private", true);
      com.tencent.mm.bg.d.b(CardConsumeSuccessUI.this, "sns", ".ui.SnsLabelUI", paramAnonymousView, 1);
    }
  };
  private p fUo = null;
  ag giD = new ag(Looper.getMainLooper());
  private String htC = "";
  private String huQ = "";
  int hzA = 0;
  public int hzB = 0;
  private String hzC = "";
  private String hzD = "";
  public ArrayList<String> hzE = new ArrayList();
  public ArrayList<String> hzF = new ArrayList();
  private TextView hzd;
  private TextView hze;
  private TextView hzp;
  private TextView hzq;
  private TextView hzr;
  private TextView hzs;
  private ImageView hzt;
  private Button hzu;
  private CheckBox hzv;
  private j hzw;
  private String hzx = "";
  private String hzy = "";
  int hzz = 0;
  private long mStartTime = 0L;
  
  private void aL()
  {
    if (this.hzw == null)
    {
      x.e("MicroMsg.CardConsumeSuccessUI", "don't updateView() , mConsumedInfo is null");
      return;
    }
    findViewById(a.d.rootView).setVisibility(0);
    lf locallf;
    if ((!TextUtils.isEmpty(this.hzw.hyr)) && (!TextUtils.isEmpty(this.hzw.hys)))
    {
      this.hzv.setText(this.hzw.hyr);
      this.hzv.setVisibility(0);
      if ((this.hzw.hyp == null) || (this.hzw.hyp.size() <= 0)) {
        break label382;
      }
      this.hzq.setText(getString(a.g.card_consumed_success_count_tip, new Object[] { Integer.valueOf(this.hzw.hyp.size()) }));
      locallf = ((q)this.hzw.hyp.get(0)).hvZ;
      if (locallf == null) {
        break label373;
      }
      xE(locallf.dxh);
      this.hzd.setText(locallf.hwh);
      this.hze.setText(locallf.title);
      int i = getResources().getDimensionPixelSize(a.b.card_list_logo_height);
      if (TextUtils.isEmpty(locallf.huW)) {
        break label332;
      }
      Object localObject = new c.a();
      ((c.a)localObject).dXB = com.tencent.mm.compatible.util.e.bnE;
      com.tencent.mm.ak.o.Pk();
      ((c.a)localObject).dXU = null;
      ((c.a)localObject).dXA = m.xr(locallf.huW);
      ((c.a)localObject).dXy = true;
      ((c.a)localObject).dXW = true;
      ((c.a)localObject).dXw = true;
      ((c.a)localObject).dXF = i;
      ((c.a)localObject).dXE = i;
      ((c.a)localObject).dXN = a.c.my_card_package_defaultlogo;
      localObject = ((c.a)localObject).Pt();
      com.tencent.mm.ak.o.Pj().a(locallf.huW, this.hzt, (c)localObject);
    }
    for (;;)
    {
      if (!TextUtils.isEmpty(locallf.rnP)) {
        break label353;
      }
      this.hzu.setText(a.g.card_consume_accept_btn);
      return;
      this.hzv.setVisibility(8);
      x.e("MicroMsg.CardConsumeSuccessUI", "mConsumedInfo.subscribe_wording is empty or subscribe_app_username is empty!");
      break;
      label332:
      x.e("MicroMsg.CardConsumeSuccessUI", "cardTpInfo.logo_url is empty!");
      this.hzt.setImageResource(a.c.my_card_package_defaultlogo);
    }
    label353:
    x.e("MicroMsg.CardConsumeSuccessUI", "accept_wording is empty!");
    this.hzu.setText(locallf.rnP);
    return;
    label373:
    x.e("MicroMsg.CardConsumeSuccessUI", "cardTpInfo is null!");
    return;
    label382:
    this.hzu.setEnabled(false);
    x.e("MicroMsg.CardConsumeSuccessUI", "mConsumedInfo.list is null!");
  }
  
  private void axN()
  {
    this.mController.contentView.setBackgroundColor(getResources().getColor(a.a.card_bg_color));
    findViewById(a.d.rootView).setVisibility(4);
  }
  
  private String axO()
  {
    if ((!TextUtils.isEmpty(this.hzC)) && (!TextUtils.isEmpty(this.hzD))) {
      return this.hzC + "," + com.tencent.mm.plugin.card.d.l.xZ(this.hzD);
    }
    if (!TextUtils.isEmpty(this.hzC)) {
      return this.hzC;
    }
    if (!TextUtils.isEmpty(this.hzD)) {
      return com.tencent.mm.plugin.card.d.l.xZ(this.hzD);
    }
    return "";
  }
  
  private void dO(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.fUo = p.b(this, getString(a.g.loading_tips), true, 0, null);
    }
    while ((this.fUo == null) || (!this.fUo.isShowing())) {
      return;
    }
    this.fUo.dismiss();
    this.fUo = null;
  }
  
  private static void nP(int paramInt)
  {
    x.i("MicroMsg.CardConsumeSuccessUI", "pushConsumedEvent resultCode is " + paramInt);
    bx localbx = new bx();
    localbx.bJo.bjW = paramInt;
    com.tencent.mm.sdk.b.a.sFg.m(localbx);
  }
  
  private boolean xD(String paramString)
  {
    if (TextUtils.isEmpty(paramString))
    {
      x.e("MicroMsg.CardConsumeSuccessUI", "parseCardConsumedJson the consumed json is empty!");
      return false;
    }
    this.hzw = r.ye(paramString);
    if (this.hzw == null)
    {
      x.e("MicroMsg.CardConsumeSuccessUI", "parseCardConsumedJson the mConsumedInfo is null! json is " + paramString);
      return false;
    }
    return true;
  }
  
  @TargetApi(16)
  private void xE(String paramString)
  {
    int i = com.tencent.mm.plugin.card.d.l.xV(paramString);
    this.FU.setBackgroundColor(i);
    lF(i);
    com.tencent.mm.ui.statusbar.a.c(this.mController.contentView, i, true);
    if (com.tencent.mm.compatible.util.d.fR(16)) {
      this.hzu.setBackground(com.tencent.mm.plugin.card.d.l.cm(i, getResources().getDimensionPixelSize(a.b.card_accept_btn_height) / 2));
    }
    for (;;)
    {
      this.FU.invalidate();
      return;
      this.hzu.setBackgroundDrawable(com.tencent.mm.plugin.card.d.l.cm(i, getResources().getDimensionPixelSize(a.b.card_accept_btn_height) / 2));
    }
  }
  
  private void xF(String paramString)
  {
    String str = paramString;
    if (TextUtils.isEmpty(paramString)) {
      str = getString(a.g.card_accept_over_limite);
    }
    com.tencent.mm.ui.base.h.a(this, str, "", false, new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        paramAnonymousDialogInterface.dismiss();
        CardConsumeSuccessUI.axP();
        CardConsumeSuccessUI.this.finish();
      }
    });
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ab.l paraml)
  {
    x.i("MicroMsg.CardConsumeSuccessUI", "onSceneEnd, errType = " + paramInt1 + " errCode = " + paramInt2 + " scene cmd is " + paraml.getType());
    dO(false);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if ((paraml instanceof com.tencent.mm.plugin.card.sharecard.model.g))
      {
        paramString = (com.tencent.mm.plugin.card.sharecard.model.g)paraml;
        if (paramString.hwV == 0)
        {
          com.tencent.mm.ui.base.h.bA(this, getString(a.g.card_accept_success_tips));
          setResult(-1);
          this.hzu.setEnabled(false);
          com.tencent.mm.plugin.card.d.l.azS();
          x.i("MicroMsg.CardConsumeSuccessUI", "finish UI!");
          nP(-1);
          paramString = ((com.tencent.mm.plugin.card.sharecard.model.g)paraml).hwU;
          paraml = new ShareCardInfo();
          f.a(paraml, paramString);
          com.tencent.mm.plugin.card.d.l.a(paraml);
          am.axp().auM();
          finish();
        }
      }
      while (!(paraml instanceof com.tencent.mm.plugin.card.sharecard.model.d))
      {
        return;
        x.e("MicroMsg.CardConsumeSuccessUI", "shareNetscene.getRetCode() is " + paramString.hwV);
        com.tencent.mm.plugin.card.d.d.b(this, paramString.hwW);
        com.tencent.mm.ui.base.h.bA(this, getString(a.g.card_accept_fail_tips));
        return;
      }
      paramString = (com.tencent.mm.plugin.card.sharecard.model.d)paraml;
      if (paramString.hwV == 0)
      {
        if ((!TextUtils.isEmpty(paramString.hwU)) && (xD(paramString.hwU)))
        {
          x.i("MicroMsg.CardConsumeSuccessUI", "consumed return json is valid, update ui");
          this.giD.post(new Runnable()
          {
            public final void run()
            {
              CardConsumeSuccessUI.d(CardConsumeSuccessUI.this);
            }
          });
          return;
        }
        x.e("MicroMsg.CardConsumeSuccessUI", "consumed return json is empty, finish ui!");
        if (this.hzz == 1)
        {
          nP(0);
          finish();
          return;
        }
        axN();
        xF(paramString.hwW);
        if (bi.oW(paramString.hwW))
        {
          com.tencent.mm.ui.base.h.bA(this, getString(a.g.card_accept_over_limite));
          return;
        }
        com.tencent.mm.ui.base.h.bA(this, paramString.hwW);
        return;
      }
      if (this.hzz == 1)
      {
        nP(0);
        finish();
        return;
      }
      x.e("MicroMsg.CardConsumeSuccessUI", "succScene.getRetCode() is " + paramString.hwV);
      axN();
      xF(paramString.hwW);
      return;
    }
    if (((paraml instanceof com.tencent.mm.plugin.card.sharecard.model.d)) && (this.hzz == 1))
    {
      nP(0);
      finish();
      return;
    }
    com.tencent.mm.plugin.card.d.d.b(this, paramString);
  }
  
  protected final int getLayoutId()
  {
    return a.e.card_consume_success_ui;
  }
  
  protected final void initView()
  {
    setBackBtn(new CardConsumeSuccessUI.1(this));
    this.FU = this.mController.contentView;
    this.hzd = ((TextView)findViewById(a.d.card_brand_name));
    this.hze = ((TextView)findViewById(a.d.card_name));
    this.hzp = ((TextView)findViewById(a.d.card_count));
    this.hzq = ((TextView)findViewById(a.d.success_tips));
    this.hzr = ((TextView)findViewById(a.d.success_share_tv));
    this.hzs = ((TextView)findViewById(a.d.success_share_detail_tv));
    this.hzt = ((ImageView)findViewById(a.d.card_img));
    this.hzu = ((Button)findViewById(a.d.accept_btn));
    this.hzv = ((CheckBox)findViewById(a.d.attention_checkbox));
    this.hzu.setOnClickListener(this.eZF);
    this.hzv.setOnClickListener(this.eZF);
    this.hzr.setOnClickListener(this.eZF);
    if (this.hzw != null) {
      aL();
    }
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    switch (paramInt1)
    {
    }
    do
    {
      return;
    } while (paramInt2 != -1);
    this.hzB = paramIntent.getIntExtra("Ktag_range_index", 0);
    x.i("MicroMsg.CardConsumeSuccessUI", "mPrivateSelelct : %d", new Object[] { Integer.valueOf(this.hzB) });
    if (this.hzB >= 2)
    {
      this.hzC = paramIntent.getStringExtra("Klabel_name_list");
      this.hzD = paramIntent.getStringExtra("Kother_user_name_list");
      x.d("MicroMsg.CardConsumeSuccessUI", "mPrivateSelect : %d, names : %s", new Object[] { Integer.valueOf(this.hzB), this.hzC });
      if ((TextUtils.isEmpty(this.hzC)) && (TextUtils.isEmpty(this.hzD)))
      {
        x.e("MicroMsg.CardConsumeSuccessUI", "mLabelNameList and mPrivateTmpUsers by getIntent is empty");
        return;
      }
      paramIntent = Arrays.asList(this.hzC.split(","));
      this.hzF = com.tencent.mm.plugin.card.d.l.aB(paramIntent);
      this.hzE = com.tencent.mm.plugin.card.d.l.aA(paramIntent);
      if ((this.hzD != null) && (this.hzD.length() > 0))
      {
        paramIntent = Arrays.asList(this.hzD.split(","));
        this.hzE.addAll(paramIntent);
      }
      if (this.hzF != null) {
        x.i("MicroMsg.CardConsumeSuccessUI", "mPrivateIdsList size is " + this.hzF.size());
      }
      if (this.hzE != null)
      {
        x.i("MicroMsg.CardConsumeSuccessUI", "mPrivateNamesList size is " + this.hzE.size());
        paramIntent = this.hzE.iterator();
        while (paramIntent.hasNext()) {
          x.d("MicroMsg.CardConsumeSuccessUI", "username : %s", new Object[] { (String)paramIntent.next() });
        }
      }
      if (this.hzB == 2)
      {
        this.hzs.setVisibility(0);
        this.hzs.setText(getString(a.g.card_share_card_private_setting_share, new Object[] { axO() }));
        return;
      }
      if (this.hzB == 3)
      {
        this.hzs.setVisibility(0);
        this.hzs.setText(getString(a.g.card_share_card_private_setting_not_share, new Object[] { axO() }));
        return;
      }
      this.hzs.setVisibility(8);
      return;
    }
    this.hzs.setVisibility(8);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    x.i("MicroMsg.CardConsumeSuccessUI", "onCreate()");
    this.mStartTime = System.currentTimeMillis();
    setMMTitle("");
    setResult(0);
    com.tencent.mm.kernel.g.Eh().dpP.a(902, this);
    com.tencent.mm.kernel.g.Eh().dpP.a(910, this);
    paramBundle = "";
    this.hzz = getIntent().getIntExtra("key_from_scene", 0);
    Object localObject;
    if (this.hzz == 1)
    {
      x.i("MicroMsg.CardConsumeSuccessUI", "SCENE_FROM_JS");
      this.hzx = getIntent().getStringExtra("key_consumed_card_id");
      this.hzy = getIntent().getStringExtra("key_consumed_Code");
      if (TextUtils.isEmpty(this.hzx))
      {
        x.e("MicroMsg.CardConsumeSuccessUI", "the mConsumdeCardId is empty!");
        nP(0);
        finish();
        return;
      }
      x.i("MicroMsg.CardConsumeSuccessUI", "the mConsumdeCode is " + this.hzy);
      dO(true);
      localObject = new com.tencent.mm.plugin.card.sharecard.model.d("", this.hzx, this.hzy);
      com.tencent.mm.kernel.g.Eh().dpP.a((com.tencent.mm.ab.l)localObject, 0);
      axN();
    }
    for (this.hzA = 7;; this.hzA = 4)
    {
      com.tencent.mm.plugin.report.service.h.mEJ.h(11324, new Object[] { "CardConsumeSuccessUI", Integer.valueOf(0), "", "", Integer.valueOf(0), Integer.valueOf(this.hzA), "", Integer.valueOf(0), "" });
      initView();
      if (TextUtils.isEmpty(paramBundle)) {
        break;
      }
      xE(paramBundle);
      return;
      if (this.hzz != 2) {
        break label434;
      }
      x.i("MicroMsg.CardConsumeSuccessUI", "SCENE_FROM_MSG_UI");
      this.htC = getIntent().getStringExtra("key_card_id");
      if (TextUtils.isEmpty(this.htC))
      {
        x.e("MicroMsg.CardConsumeSuccessUI", "the mCardId is empty!");
        nP(0);
        finish();
        return;
      }
      x.i("MicroMsg.CardConsumeSuccessUI", "the mCardId is " + this.htC);
      dO(true);
      localObject = new com.tencent.mm.plugin.card.sharecard.model.d(this.htC, "", "");
      com.tencent.mm.kernel.g.Eh().dpP.a((com.tencent.mm.ab.l)localObject, 0);
      axN();
    }
    label434:
    x.i("MicroMsg.CardConsumeSuccessUI", "SCENE_FROM_CONSUMED_CODE");
    this.htC = getIntent().getStringExtra("KEY_CARD_ID");
    if (!xD(getIntent().getStringExtra("KEY_CARD_CONSUMED_JSON")))
    {
      x.e("MicroMsg.CardConsumeSuccessUI", "the mCardId is empty!");
      nP(0);
      finish();
      return;
    }
    if ((this.hzw != null) && (!bi.cX(this.hzw.hyp)))
    {
      paramBundle = ((q)this.hzw.hyp.get(0)).hvZ;
      if (paramBundle == null) {}
    }
    for (paramBundle = paramBundle.dxh;; paramBundle = "")
    {
      localObject = paramBundle;
      if (bi.oW(paramBundle)) {
        localObject = getIntent().getStringExtra("KEY_CARD_COLOR");
      }
      this.hzA = getIntent().getIntExtra("key_stastic_scene", 0);
      paramBundle = (Bundle)localObject;
      break;
    }
  }
  
  protected void onDestroy()
  {
    com.tencent.mm.kernel.g.Eh().dpP.b(902, this);
    com.tencent.mm.kernel.g.Eh().dpP.b(910, this);
    long l = System.currentTimeMillis() - this.mStartTime;
    if (!TextUtils.isEmpty(this.htC)) {
      com.tencent.mm.plugin.report.service.h.mEJ.h(13219, new Object[] { "CardConsumeSuccessUI", Integer.valueOf(this.hzz), this.huQ, this.htC, Long.valueOf(l) });
    }
    for (;;)
    {
      super.onDestroy();
      return;
      com.tencent.mm.plugin.report.service.h.mEJ.h(13219, new Object[] { "CardConsumeSuccessUI", Integer.valueOf(this.hzz), this.huQ, this.hzx, Long.valueOf(l) });
    }
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      x.e("MicroMsg.CardConsumeSuccessUI", "onKeyDown finishUI");
      nP(0);
      finish();
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  protected void onResume()
  {
    super.onResume();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/card/sharecard/ui/CardConsumeSuccessUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */