package com.tencent.mm.plugin.collect.reward.ui;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.ab.l;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.kernel.e;
import com.tencent.mm.model.q;
import com.tencent.mm.modelcdntran.c;
import com.tencent.mm.modelcdntran.d;
import com.tencent.mm.modelcdntran.i;
import com.tencent.mm.plugin.collect.reward.a.h;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.pluginsdk.ui.d.j;
import com.tencent.mm.protocal.c.lx;
import com.tencent.mm.protocal.c.mm;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.s;
import com.tencent.mm.ui.widget.MMEditText;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

@com.tencent.mm.ui.base.a(1)
public class QrRewardMainUI
  extends QrRewardBaseUI
{
  private String cea;
  private String desc;
  private String fkq;
  private final int hVJ = com.tencent.mm.bp.a.fromDPToPix(this.mController.tml, 200);
  private Button hVK;
  private ViewGroup hVL;
  private ViewGroup hVM;
  private RelativeLayout hVN;
  private CdnImageView hVO;
  private ImageView hVP;
  private ImageView hVQ;
  private MMEditText hVR;
  private TextView hVS;
  private TextView hVT;
  private TextView hVU;
  private TextView hVV;
  private ScrollView hVW;
  private String hVX;
  private String hVY;
  private String hVZ;
  private int hWa;
  private int hWb;
  private boolean hWc;
  private boolean hWd;
  private boolean mIsOpen = false;
  private String username;
  
  private void aBV()
  {
    if (com.tencent.mm.plugin.collect.reward.b.a.aBR().aBS())
    {
      CdnImageView localCdnImageView = this.hVO;
      com.tencent.mm.plugin.collect.reward.b.a locala = com.tencent.mm.plugin.collect.reward.b.a.aBR();
      localCdnImageView.ag(com.tencent.mm.plugin.collect.reward.b.a.hVf + locala.aBT(), this.hVJ, this.hVJ);
      this.hVN.setVisibility(0);
      return;
    }
    this.hVN.setVisibility(4);
  }
  
  private void aBW()
  {
    int j = Math.round(this.hVJ * (this.hWb * 1.0F / this.hWa));
    int i = j;
    if (j <= 0) {
      i = 248;
    }
    ViewGroup.LayoutParams localLayoutParams = this.hVQ.getLayoutParams();
    localLayoutParams.width = i;
    localLayoutParams.height = i;
    this.hVQ.setLayoutParams(localLayoutParams);
    localLayoutParams = this.hVP.getLayoutParams();
    localLayoutParams.width = i;
    localLayoutParams.height = i;
    this.hVP.setLayoutParams(localLayoutParams);
    localLayoutParams = this.hVR.getLayoutParams();
    localLayoutParams.width = (i - 30);
    localLayoutParams.height = (i - 30);
    this.hVR.setLayoutParams(localLayoutParams);
    this.hVR.setTextSize(0, i * 2 / 3);
    this.hVM.requestLayout();
    if (!bi.oW(this.desc)) {
      this.hVS.setText(j.a(this, getString(a.i.qr_reward_wrap_text, new Object[] { this.desc }), this.hVS.getTextSize()));
    }
    for (;;)
    {
      eb(bi.oW(this.hVX));
      return;
      this.hVS.setText("");
    }
  }
  
  private void aBX()
  {
    if (!bi.oW(this.hVY))
    {
      this.hVU.setClickable(true);
      this.hVU.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.d.m(this));
      com.tencent.mm.plugin.wallet_core.ui.m localm = new com.tencent.mm.plugin.wallet_core.ui.m(new QrRewardMainUI.7(this));
      SpannableString localSpannableString = new SpannableString(this.hVY);
      localSpannableString.setSpan(localm, 0, localSpannableString.length(), 18);
      this.hVU.setText(localSpannableString);
      this.hVU.setVisibility(0);
      return;
    }
    this.hVU.setVisibility(8);
  }
  
  private void aBY()
  {
    if (!bi.oW(this.hVX))
    {
      this.hVR.setText(j.a(this.mController.tml, this.hVX, this.hVR.getTextSize()));
      this.hVR.setSelection(this.hVX.length());
    }
  }
  
  private void aBZ()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.QrRewardMainUI", "do set photo word");
    h localh = new h(this.hVX);
    localh.o(this);
    a(localh, true, false);
  }
  
  private void eb(boolean paramBoolean)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.QrRewardMainUI", "switch mode: %s", new Object[] { Boolean.valueOf(paramBoolean) });
    if (paramBoolean)
    {
      this.hVP.setVisibility(0);
      this.hVR.setVisibility(4);
      a.b.a(this.hVP, this.username, 0.03F, true);
      return;
    }
    this.hVP.setVisibility(4);
    this.hVR.setVisibility(0);
  }
  
  private void g(String paramString1, String paramString2, boolean paramBoolean)
  {
    if ((this.fkq != null) && (this.fkq.equals(paramString1))) {}
    for (boolean bool1 = true;; bool1 = false)
    {
      boolean bool2 = com.tencent.mm.plugin.collect.reward.b.a.aBR().aBS();
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.QrRewardMainUI", "do download photo: %s, same url: %s, pic exist: %s", new Object[] { Boolean.valueOf(paramBoolean), Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
      if ((paramBoolean) || (!bool1) || (!bool2))
      {
        com.tencent.mm.plugin.collect.reward.b.a locala = com.tencent.mm.plugin.collect.reward.b.a.aBR();
        com.tencent.mm.plugin.collect.reward.b.a.a local6 = new com.tencent.mm.plugin.collect.reward.b.a.a()
        {
          public final void K(String paramAnonymousString, int paramAnonymousInt1, int paramAnonymousInt2)
          {
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.QrRewardMainUI", "callback ret: %s, %s, %s", new Object[] { paramAnonymousString, Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2) });
            if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0)) {
              ah.A(new QrRewardMainUI.6.1(this));
            }
          }
        };
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.QrRewardCdnDownloadHelper", "downloadImage. imageId:%s", new Object[] { paramString1 });
        Object localObject = new File(com.tencent.mm.plugin.collect.reward.b.a.hVf);
        if (!((File)localObject).exists()) {
          ((File)localObject).mkdirs();
        }
        localObject = new i();
        ((i)localObject).ceW = false;
        ((i)localObject).dPV = locala;
        ((i)localObject).field_fullpath = (com.tencent.mm.plugin.collect.reward.b.a.hVf + locala.aBT());
        ((i)localObject).field_mediaId = bi.oV(d.a("QrRewardImg", bi.VF(), q.Hl().field_username, ""));
        ((i)localObject).field_fileId = paramString1;
        ((i)localObject).field_aesKey = paramString2;
        ((i)localObject).field_fileType = com.tencent.mm.modelcdntran.b.MediaType_FILE;
        ((i)localObject).field_priority = com.tencent.mm.modelcdntran.b.dOk;
        ((i)localObject).field_needStorage = false;
        ((i)localObject).field_isStreamMedia = false;
        ((i)localObject).field_appType = 0;
        ((i)localObject).field_bzScene = 0;
        if (locala.diQ == null) {
          locala.diQ = new HashMap();
        }
        locala.diQ.put(((i)localObject).field_mediaId, local6);
        if (!com.tencent.mm.modelcdntran.g.ND().b((i)localObject, -1)) {
          com.tencent.mm.sdk.platformtools.x.e("MicroMsg.QrRewardCdnDownloadHelper", "ljd: cdntra addSendTask failed. imageId:%s", new Object[] { paramString1 });
        }
      }
      return;
    }
  }
  
  protected final boolean Wt()
  {
    return false;
  }
  
  public final boolean d(int paramInt1, int paramInt2, final String paramString, l paraml)
  {
    if ((paraml instanceof com.tencent.mm.plugin.collect.reward.a.b))
    {
      paramString = (com.tencent.mm.plugin.collect.reward.a.b)paraml;
      paramString.a(new com.tencent.mm.plugin.collect.reward.a.a.a()
      {
        public final void i(l paramAnonymousl)
        {
          QrRewardMainUI.a(QrRewardMainUI.this, paramString.hUX.hqp);
          QrRewardMainUI.a(QrRewardMainUI.this, paramString.hUX.rqf);
          QrRewardMainUI.b(QrRewardMainUI.this, paramString.hUX.rqb);
          QrRewardMainUI.b(QrRewardMainUI.this, paramString.hUX.desc);
          QrRewardMainUI.c(QrRewardMainUI.this, paramString.hUX.plj);
          paramAnonymousl = QrRewardMainUI.this;
          boolean bool;
          if (!paramString.hUX.rpZ)
          {
            bool = true;
            QrRewardMainUI.b(paramAnonymousl, bool);
            QrRewardMainUI.d(QrRewardMainUI.this, paramString.hUX.hwH);
            QrRewardMainUI.e(QrRewardMainUI.this, paramString.hUX.rqd);
            QrRewardMainUI.d(QrRewardMainUI.this);
            QrRewardMainUI.e(QrRewardMainUI.this);
            if (QrRewardMainUI.f(QrRewardMainUI.this)) {
              break label232;
            }
            QrRewardMainUI.g(QrRewardMainUI.this);
          }
          for (;;)
          {
            QrRewardMainUI.f(QrRewardMainUI.this, paramString.hUX.mwO);
            QrRewardMainUI.aCa();
            com.tencent.mm.sdk.platformtools.x.d("MicroMsg.QrRewardMainUI", "url: %s", new Object[] { QrRewardMainUI.j(QrRewardMainUI.this) });
            return;
            bool = false;
            break;
            label232:
            QrRewardMainUI.a(QrRewardMainUI.this, paramString.hUX.mwO, paramString.hUX.rqa);
            QrRewardMainUI.h(QrRewardMainUI.this);
            QrRewardMainUI.i(QrRewardMainUI.this);
          }
        }
      }).b(new QrRewardMainUI.15(this, paramString)).c(new QrRewardMainUI.14(this, paramString));
    }
    while (!(paraml instanceof h)) {
      return true;
    }
    paramString = (h)paraml;
    paramString.a(new QrRewardMainUI.3(this, paramString)).b(new com.tencent.mm.plugin.collect.reward.a.a.a()
    {
      public final void i(l paramAnonymousl)
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.QrRewardMainUI", "set word error: %s, %s", new Object[] { Integer.valueOf(paramString.hVe.hUm), paramString.hVe.hUn });
        QrRewardMainUI.a(QrRewardMainUI.this, (String)com.tencent.mm.kernel.g.Ei().DT().get(aa.a.sYP, ""));
        QrRewardMainUI.c(QrRewardMainUI.this, QrRewardMainUI.k(QrRewardMainUI.this));
        QrRewardMainUI.l(QrRewardMainUI.this).setText("");
        QrRewardMainUI.i(QrRewardMainUI.this);
        if (!bi.oW(paramString.hVe.hUn)) {
          Toast.makeText(QrRewardMainUI.this, paramString.hVe.hUn, 0).show();
        }
      }
    }).c(new QrRewardMainUI.17(this));
    this.hVR.clearFocus();
    this.hVR.setCursorVisible(false);
    return true;
  }
  
  protected final int getLayoutId()
  {
    return a.g.qr_reward_main_ui;
  }
  
  protected final void initView()
  {
    this.hVK = ((Button)findViewById(a.f.qrmu_open_reward_btn));
    this.hVL = ((ViewGroup)findViewById(a.f.qrmu_no_code_layout));
    this.hVM = ((ViewGroup)findViewById(a.f.qrmu_main_layout));
    this.hVO = ((CdnImageView)findViewById(a.f.qrmu_code_iv));
    this.hVS = ((TextView)findViewById(a.f.qrmu_desc_tv));
    this.hVP = ((ImageView)findViewById(a.f.qrmu_code_avatar_iv));
    this.hVQ = ((ImageView)findViewById(a.f.qrmu_code_avatar_border_iv));
    this.hVN = ((RelativeLayout)findViewById(a.f.qrmu_code_layout));
    this.hVR = ((MMEditText)findViewById(a.f.qrmu_code_word_et));
    this.hVT = ((TextView)findViewById(a.f.qrmu_save_code_tv));
    this.hVV = ((TextView)findViewById(a.f.qrmu_set_code_tv));
    this.hVU = ((TextView)findViewById(a.f.qrmu_bottom_tv));
    a.b.a(this.hVP, this.username, 0.03F, true);
    try
    {
      this.hVR.setText(j.a(this.mController.tml, this.hVX, this.hVR.getTextSize()));
      this.hVR.setSelection(this.hVX.length());
      this.hVR.addTextChangedListener(new QrRewardMainUI.1(this));
      this.hVR.setOnEditorActionListener(new QrRewardMainUI.10(this));
      this.hVQ.setOnClickListener(new QrRewardMainUI.11(this));
      this.hVT.setClickable(true);
      this.hVT.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.d.m(this));
      com.tencent.mm.plugin.wallet_core.ui.m localm = new com.tencent.mm.plugin.wallet_core.ui.m(new QrRewardMainUI.12(this));
      SpannableString localSpannableString = new SpannableString(getString(a.i.qr_reward_save_code_btn_text));
      localSpannableString.setSpan(localm, 0, localSpannableString.length(), 18);
      this.hVT.setText(localSpannableString);
      this.hVV.setClickable(true);
      this.hVV.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.d.m(this));
      localm = new com.tencent.mm.plugin.wallet_core.ui.m(new QrRewardMainUI.13(this));
      localSpannableString = new SpannableString(getString(a.i.qr_reward_set_money_title));
      localSpannableString.setSpan(localm, 0, localSpannableString.length(), 18);
      this.hVV.setText(localSpannableString);
      aBV();
      aBW();
      aBY();
      aBX();
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.QrRewardMainUI", localException, "", new Object[0]);
      }
    }
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (paramInt1 == 1)
    {
      if (paramInt2 == -1)
      {
        this.desc = paramIntent.getStringExtra("key_desc");
        this.hWa = paramIntent.getIntExtra("key_photo_width", 900);
        this.hWb = paramIntent.getIntExtra("key_icon_width", 343);
        boolean bool = paramIntent.getBooleanExtra("key_return_from_first", true);
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.QrRewardMainUI", "return from first: %s", new Object[] { Boolean.valueOf(bool) });
        if (bool)
        {
          this.hVM.setVisibility(0);
          this.hVL.setVisibility(8);
        }
        this.hWd = true;
        aBW();
        String str = paramIntent.getStringExtra("key_photo_url");
        g(str, paramIntent.getStringExtra("key_photo_aeskey"), true);
        this.fkq = str;
      }
      return;
    }
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    paramBundle = getWindow().getAttributes();
    if (paramBundle.screenBrightness < 0.85F)
    {
      paramBundle.screenBrightness = 0.85F;
      getWindow().setAttributes(paramBundle);
    }
    jr(1323);
    jr(1649);
    this.hWa = ((Integer)com.tencent.mm.kernel.g.Ei().DT().get(aa.a.sYN, Integer.valueOf(900))).intValue();
    this.hWb = ((Integer)com.tencent.mm.kernel.g.Ei().DT().get(aa.a.sYO, Integer.valueOf(343))).intValue();
    this.desc = ((String)com.tencent.mm.kernel.g.Ei().DT().get(aa.a.sYQ, ""));
    this.hVX = ((String)com.tencent.mm.kernel.g.Ei().DT().get(aa.a.sYP, ""));
    this.hVY = ((String)com.tencent.mm.kernel.g.Ei().DT().get(aa.a.sYU, ""));
    this.hVZ = ((String)com.tencent.mm.kernel.g.Ei().DT().get(aa.a.sYV, ""));
    this.fkq = ((String)com.tencent.mm.kernel.g.Ei().DT().get(aa.a.sYW, ""));
    if (!bi.oW((String)com.tencent.mm.kernel.g.Ei().DT().get(aa.a.sYT, ""))) {
      this.hWd = true;
    }
    this.username = q.GF();
    setMMTitle(a.i.qr_reward_main_title);
    initView();
    if ((com.tencent.mm.plugin.collect.reward.b.a.aBR().aBS()) && (this.hWd)) {}
    for (boolean bool = true;; bool = false)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.QrRewardMainUI", "do get code: %s", new Object[] { Boolean.valueOf(bool) });
      paramBundle = new com.tencent.mm.plugin.collect.reward.a.b(bool);
      paramBundle.o(this);
      if (!bool) {
        break;
      }
      a(paramBundle, false, false);
      return;
    }
    a(paramBundle, true, false);
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    js(1323);
    js(1649);
    com.tencent.mm.plugin.collect.reward.b.a locala = com.tencent.mm.plugin.collect.reward.b.a.aBR();
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.QrRewardCdnDownloadHelper", "do clear callback");
    if (locala.diQ != null)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.QrRewardCdnDownloadHelper", "callback size: %s", new Object[] { Integer.valueOf(locala.diQ.size()) });
      locala.diQ.clear();
    }
  }
  
  public final void onKeyboardStateChanged()
  {
    super.onKeyboardStateChanged();
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.QrRewardMainUI", "key board changed: %s", new Object[] { Integer.valueOf(this.mController.tmG) });
    if (this.mController.tmG == 2)
    {
      this.hVX = this.hVR.getText().toString();
      aBZ();
      if (bi.oW(this.hVX)) {
        eb(true);
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/collect/reward/ui/QrRewardMainUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */