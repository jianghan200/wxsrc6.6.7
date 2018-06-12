package com.tencent.mm.plugin.luckymoney.ui;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.mm.modelcdntran.b;
import com.tencent.mm.modelcdntran.c;
import com.tencent.mm.modelcdntran.i;
import com.tencent.mm.plugin.luckymoney.b.ae;
import com.tencent.mm.plugin.luckymoney.b.af;
import com.tencent.mm.plugin.luckymoney.b.k;
import com.tencent.mm.plugin.luckymoney.b.k.a;
import com.tencent.mm.plugin.luckymoney.b.o;
import com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper;
import com.tencent.mm.plugin.wxpay.a.d;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.s;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

@com.tencent.mm.ui.base.a(3)
public class LuckyMoneyNewYearSendUI
  extends LuckyMoneyBaseUI
{
  private Dialog eXG = null;
  private View.OnClickListener eZF = new View.OnClickListener()
  {
    public final void onClick(View paramAnonymousView)
    {
      if (paramAnonymousView.getId() == a.f.lucky_money_new_year_send_btn)
      {
        com.tencent.mm.plugin.report.service.h.mEJ.h(13079, new Object[] { Integer.valueOf(5), Integer.valueOf(1) });
        if ((LuckyMoneyNewYearSendUI.a(LuckyMoneyNewYearSendUI.this) == 1) && (LuckyMoneyNewYearSendUI.b(LuckyMoneyNewYearSendUI.this)) && (!TextUtils.isEmpty(LuckyMoneyNewYearSendUI.c(LuckyMoneyNewYearSendUI.this))) && (!TextUtils.isEmpty(LuckyMoneyNewYearSendUI.d(LuckyMoneyNewYearSendUI.this))) && (!TextUtils.isEmpty(LuckyMoneyNewYearSendUI.e(LuckyMoneyNewYearSendUI.this))) && (LuckyMoneyNewYearSendUI.f(LuckyMoneyNewYearSendUI.this) > 0))
        {
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.LuckyMoneyNewYearSendUI", "to send HB with last post image data!");
          LuckyMoneyNewYearSendUI.g(LuckyMoneyNewYearSendUI.this);
        }
      }
      do
      {
        Object localObject;
        i locali;
        do
        {
          return;
          if ((LuckyMoneyNewYearSendUI.a(LuckyMoneyNewYearSendUI.this) != 1) || (!LuckyMoneyNewYearSendUI.b(LuckyMoneyNewYearSendUI.this)) || (TextUtils.isEmpty(LuckyMoneyNewYearSendUI.c(LuckyMoneyNewYearSendUI.this)))) {
            break;
          }
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.LuckyMoneyNewYearSendUI", "to send HB with new image data!");
          LuckyMoneyNewYearSendUI.h(LuckyMoneyNewYearSendUI.this);
          if (LuckyMoneyNewYearSendUI.i(LuckyMoneyNewYearSendUI.this) == null) {
            LuckyMoneyNewYearSendUI.a(LuckyMoneyNewYearSendUI.this, new k());
          }
          paramAnonymousView = LuckyMoneyNewYearSendUI.i(LuckyMoneyNewYearSendUI.this);
          String str = LuckyMoneyNewYearSendUI.c(LuckyMoneyNewYearSendUI.this);
          localObject = new LuckyMoneyNewYearSendUI.1.1(this);
          paramAnonymousView.ixo = k.baW();
          paramAnonymousView.kQx = ((k.a)localObject);
          paramAnonymousView.kQy = str;
          localObject = paramAnonymousView.ixo;
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.LuckyMoneyNewYearImageUploader", "ljd: sendImg. imageId:%s", new Object[] { localObject });
          locali = new i();
          locali.ceW = true;
          locali.dPV = paramAnonymousView;
          locali.field_mediaId = ((String)localObject);
          locali.field_fullpath = str;
          locali.field_thumbpath = "";
          locali.field_fileType = b.MediaType_FILE;
          locali.field_talker = "";
          locali.field_priority = b.dOk;
          locali.field_needStorage = false;
          locali.field_isStreamMedia = false;
          locali.field_appType = 0;
          locali.field_bzScene = 0;
        } while (com.tencent.mm.modelcdntran.g.ND().c(locali));
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.LuckyMoneyNewYearImageUploader", "ljd: cdntra addSendTask failed. clientid:%s", new Object[] { localObject });
        return;
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.LuckyMoneyNewYearSendUI", "to send HB with not image data!");
        LuckyMoneyNewYearSendUI.c(LuckyMoneyNewYearSendUI.this, "");
        LuckyMoneyNewYearSendUI.a(LuckyMoneyNewYearSendUI.this, "");
        LuckyMoneyNewYearSendUI.b(LuckyMoneyNewYearSendUI.this, "");
        LuckyMoneyNewYearSendUI.a(LuckyMoneyNewYearSendUI.this, 0);
        LuckyMoneyNewYearSendUI.g(LuckyMoneyNewYearSendUI.this);
        return;
        if (paramAnonymousView.getId() == a.f.lucky_money_new_year_close_btn)
        {
          LuckyMoneyNewYearSendUI.this.finish();
          com.tencent.mm.plugin.report.service.h.mEJ.h(13079, new Object[] { Integer.valueOf(6), Integer.valueOf(1) });
          return;
        }
        if ((paramAnonymousView.getId() == a.f.lucky_money_new_year_camera_btn) || (paramAnonymousView.getId() == a.f.lucky_money_new_year_camera_tips))
        {
          LuckyMoneyNewYearSendUI.l(LuckyMoneyNewYearSendUI.this);
          com.tencent.mm.plugin.report.service.h.mEJ.h(13079, new Object[] { Integer.valueOf(2), Integer.valueOf(1) });
          return;
        }
        if (paramAnonymousView.getId() == a.f.lucky_money_new_year_picture_del_btn)
        {
          LuckyMoneyNewYearSendUI.a(LuckyMoneyNewYearSendUI.this, "");
          LuckyMoneyNewYearSendUI.b(LuckyMoneyNewYearSendUI.this, "");
          LuckyMoneyNewYearSendUI.a(LuckyMoneyNewYearSendUI.this, 0);
          LuckyMoneyNewYearSendUI.m(LuckyMoneyNewYearSendUI.this);
          com.tencent.mm.plugin.report.service.h.mEJ.h(13079, new Object[] { Integer.valueOf(3), Integer.valueOf(1) });
          return;
        }
        if (paramAnonymousView.getId() == a.f.lucky_money_new_year_refresh_layout)
        {
          paramAnonymousView = LuckyMoneyNewYearSendUI.n(LuckyMoneyNewYearSendUI.this);
          paramAnonymousView.kUd = false;
          paramAnonymousView.kTU.setVisibility(0);
          paramAnonymousView.kTV.setVisibility(0);
          paramAnonymousView.kTW.setVisibility(0);
          paramAnonymousView.kTX.setVisibility(4);
          paramAnonymousView.kTY.setVisibility(4);
          paramAnonymousView.kTZ.setVisibility(4);
          LuckyMoneyNewYearSendUI.o(LuckyMoneyNewYearSendUI.this);
          com.tencent.mm.plugin.report.service.h.mEJ.h(13079, new Object[] { Integer.valueOf(4), Integer.valueOf(1) });
          return;
        }
      } while (paramAnonymousView.getId() != a.f.lucky_money_new_year_picture_img);
      LuckyMoneyNewYearSendUI.p(LuckyMoneyNewYearSendUI.this);
    }
  };
  private Button iqN;
  private String kRc;
  private int kRe;
  private int kRj = 0;
  private LinkedList<com.tencent.mm.plugin.luckymoney.b.l> kRk;
  private int kTr;
  private String kTv;
  private int kTw;
  private LuckyMoneyAutoScrollView kVR;
  private TextView kVS;
  private ImageView kVW;
  private View kVX;
  private ImageView kVY;
  private boolean kWa = false;
  private String kWb = "";
  private String kWc = "";
  private int kWd;
  private k kWe;
  private View kWn;
  private View kWo;
  private ImageView kWp;
  private TextView kWq;
  private ImageView kWr;
  private LinearLayout kWs;
  private String kWt;
  private boolean kWu = true;
  private String kWv = "";
  private int kWw = 0;
  private TextView klp;
  private Bitmap mBitmap;
  private ag mHandler = new ag();
  
  private void aL()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.LuckyMoneyNewYearSendUI", "ljd:updateView");
    if ((this.kWa) && (this.kRj == 1))
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.LuckyMoneyNewYearSendUI", "ljd:show the picture!");
      this.kWo.setVisibility(8);
      this.kVX.setVisibility(0);
      this.kVW.setVisibility(8);
      if ((this.kRk == null) || (this.kRk.size() <= 0)) {
        break label403;
      }
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.LuckyMoneyNewYearSendUI", "ljd:year mess list is valid!");
      this.kWs.setVisibility(0);
      label87:
      if (this.kRj != 1) {
        break label422;
      }
      localLayoutParams = (LinearLayout.LayoutParams)this.kVW.getLayoutParams();
      localLayoutParams.topMargin = getResources().getDimensionPixelOffset(a.d.lucky_money_new_year_word_top_margin_for_picture);
      localLayoutParams.bottomMargin = getResources().getDimensionPixelOffset(a.d.lucky_money_new_year_word_bottom_margin_for_picture);
      this.kVW.setLayoutParams(localLayoutParams);
      this.kVW.invalidate();
    }
    for (;;)
    {
      if (!this.kWa) {
        break label479;
      }
      localLayoutParams = (LinearLayout.LayoutParams)this.klp.getLayoutParams();
      localLayoutParams.bottomMargin = getResources().getDimensionPixelOffset(a.d.lucky_money_new_year_wishing_bottom_margin_for_picture);
      this.klp.setLayoutParams(localLayoutParams);
      this.klp.invalidate();
      this.klp.setTextSize(1, 17.0F);
      this.kVS.setTextSize(1, 16.0F);
      this.kVR.cO(getResources().getDimensionPixelOffset(a.d.lucky_money_newyear_num_width_for_picture), getResources().getDimensionPixelOffset(a.d.lucky_money_newyear_num_height_for_picture));
      localLayoutParams = (LinearLayout.LayoutParams)this.kVR.getLayoutParams();
      localLayoutParams.topMargin = getResources().getDimensionPixelOffset(a.d.lucky_money_new_year_amount_top_margin_for_picture);
      this.kVR.setLayoutParams(localLayoutParams);
      this.kVR.invalidate();
      localLayoutParams = (LinearLayout.LayoutParams)this.kWs.getLayoutParams();
      localLayoutParams.topMargin = getResources().getDimensionPixelOffset(a.d.lucky_money_new_year_refresh_layout_top_margin_for_picture);
      this.kWs.setLayoutParams(localLayoutParams);
      this.kWs.invalidate();
      return;
      if (this.kRj == 1)
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.LuckyMoneyNewYearSendUI", "ljd:show the camera btn!");
        this.kWo.setVisibility(0);
        this.kVX.setVisibility(8);
        this.kVW.setVisibility(0);
        break;
      }
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.LuckyMoneyNewYearSendUI", "ljd:show the new year wording!");
      this.kWo.setVisibility(8);
      this.kVX.setVisibility(8);
      this.kVW.setVisibility(0);
      break;
      label403:
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.LuckyMoneyNewYearSendUI", "ljd:year mess list is not valid!");
      this.kWs.setVisibility(8);
      break label87;
      label422:
      localLayoutParams = (LinearLayout.LayoutParams)this.kVW.getLayoutParams();
      localLayoutParams.topMargin = getResources().getDimensionPixelOffset(a.d.lucky_money_new_year_word_top_margin_for_normal);
      localLayoutParams.bottomMargin = getResources().getDimensionPixelOffset(a.d.lucky_money_new_year_word_bottom_margin_for_normal);
      this.kVW.setLayoutParams(localLayoutParams);
      this.kVW.invalidate();
    }
    label479:
    LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)this.klp.getLayoutParams();
    localLayoutParams.bottomMargin = getResources().getDimensionPixelOffset(a.d.lucky_money_new_year_wishing_bottom_margin_for_normal);
    this.klp.setLayoutParams(localLayoutParams);
    this.klp.invalidate();
    this.klp.setTextSize(1, 20.0F);
    this.kVS.setTextSize(1, 18.0F);
    this.kVR.cO(getResources().getDimensionPixelOffset(a.d.lucky_money_newyear_num_width_for_normal), getResources().getDimensionPixelOffset(a.d.lucky_money_newyear_num_height_for_normal));
    localLayoutParams = (LinearLayout.LayoutParams)this.kVR.getLayoutParams();
    localLayoutParams.topMargin = getResources().getDimensionPixelOffset(a.d.lucky_money_new_year_amount_top_margin_for_normal);
    this.kVR.setLayoutParams(localLayoutParams);
    this.kVR.invalidate();
    localLayoutParams = (LinearLayout.LayoutParams)this.kWs.getLayoutParams();
    localLayoutParams.topMargin = getResources().getDimensionPixelOffset(a.d.lucky_money_new_year_refresh_layout_top_margin_for_normal);
    this.kWs.setLayoutParams(localLayoutParams);
    this.kWs.invalidate();
  }
  
  private void bbA()
  {
    if (this.eXG != null)
    {
      if (!this.eXG.isShowing()) {
        this.eXG.show();
      }
      return;
    }
    this.eXG = com.tencent.mm.wallet_core.ui.g.a(this.mController.tml, true, new LuckyMoneyNewYearSendUI.2(this));
  }
  
  private void bbB()
  {
    int i;
    if ((this.kRk != null) && (this.kRk.size() > 0))
    {
      com.tencent.mm.kernel.g.Ek();
      com.tencent.mm.kernel.g.Eg();
      i = com.tencent.mm.kernel.a.Df();
      int j = this.kRk.size();
      int k = (int)(System.currentTimeMillis() % j);
      i = (new Random(i).nextInt(j) + k) % j;
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.LuckyMoneyNewYearSendUI", "genRandomAmountIndex retRand:" + i);
    }
    for (;;)
    {
      this.kWw = i;
      if ((this.kWw >= 0) && (this.kWw < this.kRk.size()))
      {
        this.kRe = ((com.tencent.mm.plugin.luckymoney.b.l)this.kRk.get(this.kWw)).kQA;
        this.kRc = ((com.tencent.mm.plugin.luckymoney.b.l)this.kRk.get(this.kWw)).kQB;
      }
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.LuckyMoneyNewYearSendUI", "mSelectIndex:" + this.kWw + " randomAmount:" + this.kRe + " randomWishing:" + this.kRc);
      this.kVR.setFinalText(com.tencent.mm.wallet_core.ui.e.A(this.kRe / 100.0D));
      this.kVR.a(new LuckyMoneyNewYearSendUI.3(this));
      return;
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.LuckyMoneyNewYearSendUI", "genRandomAmountIndex yearMessList is empty!");
      i = -1;
    }
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ab.l paraml)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.LuckyMoneyNewYearSendUI", "onSceneEnd() errType:" + paramInt1 + " errCode:" + paramInt2 + " errMsg:" + paramString + " netsceneType:" + paraml.getType());
    if ((paraml instanceof com.tencent.mm.plugin.luckymoney.b.x))
    {
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paramString = (com.tencent.mm.plugin.luckymoney.b.x)paraml;
        this.kRe = paramString.kRe;
        this.kRc = paramString.kRc;
        this.kRj = paramString.kRj;
        this.kRk = paramString.kRk;
        if (this.kRj == 0) {
          com.tencent.mm.sdk.platformtools.x.e("MicroMsg.LuckyMoneyNewYearSendUI", "scenePicSwitch is 0, clear local picture data!");
        }
        for (;;)
        {
          bbB();
          aL();
          ux(0);
          o.a(this.kWn, null);
          return true;
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.LuckyMoneyNewYearSendUI", "cans how picture!");
        }
      }
      finish();
    }
    for (;;)
    {
      return false;
      if ((paraml instanceof ae))
      {
        if ((this.eXG != null) && (this.eXG.isShowing())) {
          this.eXG.hide();
        }
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.LuckyMoneyNewYearSendUI", "send hb success!");
          paramString = (ae)paraml;
          this.kTv = paramString.kRr;
          paraml = new PayInfo();
          paraml.bOd = paramString.kRq;
          paraml.bVY = 37;
          paraml.bVU = this.kTw;
          com.tencent.mm.pluginsdk.wallet.h.a(this, paraml, 1);
          return true;
        }
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.LuckyMoneyNewYearSendUI", "send hb failed!");
      }
      else if ((paraml instanceof af))
      {
        if ((this.eXG != null) && (this.eXG.isShowing())) {
          this.eXG.hide();
        }
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.LuckyMoneyNewYearSendUI", "send hb success!");
          paramString = (af)paraml;
          this.kTv = paramString.kRr;
          paraml = new PayInfo();
          paraml.bOd = paramString.kRq;
          paraml.bVY = 37;
          paraml.bVU = this.kTw;
          com.tencent.mm.pluginsdk.wallet.h.a(this, paraml, 1);
          return true;
        }
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.LuckyMoneyNewYearSendUI", "send hb failed!");
      }
    }
  }
  
  protected final int getLayoutId()
  {
    return a.g.lucky_money_new_year_send_ui;
  }
  
  protected final void initView()
  {
    ux(8);
    this.kWn = findViewById(a.f.lucky_money_newyear_send_ll);
    this.kVS = ((TextView)findViewById(a.f.lucky_money_amount_unit_title_tv));
    this.kVR = ((LuckyMoneyAutoScrollView)findViewById(a.f.lucky_money_new_year_amount));
    this.klp = ((TextView)findViewById(a.f.lucky_money_new_year_wishing));
    this.iqN = ((Button)findViewById(a.f.lucky_money_new_year_send_btn));
    this.iqN.setOnClickListener(this.eZF);
    ((ImageView)findViewById(a.f.lucky_money_new_year_close_btn)).setOnClickListener(this.eZF);
    this.kWo = findViewById(a.f.lucky_money_new_year_camera_layout);
    this.kWp = ((ImageView)findViewById(a.f.lucky_money_new_year_camera_btn));
    this.kWp.setOnClickListener(this.eZF);
    this.kVW = ((ImageView)findViewById(a.f.lucky_money_new_year_word));
    this.kWq = ((TextView)findViewById(a.f.lucky_money_new_year_camera_tips));
    this.kWq.setOnClickListener(this.eZF);
    this.kVX = findViewById(a.f.lucky_money_new_year_picture_layout);
    this.kVY = ((ImageView)findViewById(a.f.lucky_money_new_year_picture_img));
    this.kVY.setOnClickListener(this.eZF);
    this.kWr = ((ImageView)findViewById(a.f.lucky_money_new_year_picture_del_btn));
    this.kWr.setOnClickListener(this.eZF);
    this.kWs = ((LinearLayout)findViewById(a.f.lucky_money_new_year_refresh_layout));
    this.kWs.setOnClickListener(this.eZF);
    com.tencent.mm.kernel.g.Ek();
    this.kWv = ((String)com.tencent.mm.kernel.g.Ei().DT().get(aa.a.sSO, ""));
    com.tencent.mm.kernel.g.Ek();
    this.kWb = ((String)com.tencent.mm.kernel.g.Ei().DT().get(aa.a.sSP, ""));
    com.tencent.mm.kernel.g.Ek();
    this.kWc = ((String)com.tencent.mm.kernel.g.Ei().DT().get(aa.a.sSQ, ""));
    com.tencent.mm.kernel.g.Ek();
    this.kWd = ((Integer)com.tencent.mm.kernel.g.Ei().DT().get(aa.a.sSR, Integer.valueOf(0))).intValue();
    if ((!TextUtils.isEmpty(this.kWv)) && (!TextUtils.isEmpty(this.kWb)) && (!TextUtils.isEmpty(this.kWc)) && (this.kWd > 0))
    {
      this.kWa = true;
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.LuckyMoneyNewYearSendUI", "last post image data is valid");
    }
    while ((this.kWa) && (!TextUtils.isEmpty(this.kWv)))
    {
      Bitmap localBitmap1 = o.aE(this.kWv, false);
      if (localBitmap1 != null)
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.LuckyMoneyNewYearSendUI", "ljd:get crop new year picture is ok!");
        Bitmap localBitmap2 = this.mBitmap;
        this.mBitmap = localBitmap1;
        this.kVY.setImageBitmap(this.mBitmap);
        if ((localBitmap2 != null) && (localBitmap2.isRecycled())) {
          localBitmap2.recycle();
        }
        return;
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.LuckyMoneyNewYearSendUI", "count not fetch last post image data!");
      }
      else
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.LuckyMoneyNewYearSendUI", "ljd:get crop new year picture failed!");
        return;
      }
    }
    com.tencent.mm.sdk.platformtools.x.e("MicroMsg.LuckyMoneyNewYearSendUI", "ljd:initPictureImage() mIsShowPic:" + this.kWa + ", mImagePath:" + this.kWv);
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    int i = 0;
    label194:
    Object localObject;
    switch (paramInt1)
    {
    default: 
      return;
    case 1: 
      if (paramInt2 == -1)
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.LuckyMoneyNewYearSendUI", "do pay success!");
        com.tencent.mm.plugin.report.service.h.mEJ.h(11701, new Object[] { Integer.valueOf(15), Integer.valueOf(3), Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(2) });
        paramInt1 = i;
        if (paramIntent != null)
        {
          paramInt1 = i;
          if (paramIntent.hasExtra("key_realname_guide_helper"))
          {
            paramIntent = (RealnameGuideHelper)paramIntent.getParcelableExtra("key_realname_guide_helper");
            paramInt1 = i;
            if (paramIntent != null) {
              if (paramIntent.b(this, null, new LuckyMoneyNewYearSendUI.4(this))) {
                break label194;
              }
            }
          }
        }
        for (paramInt1 = 1;; paramInt1 = 0)
        {
          com.tencent.mm.ui.base.h.bA(this, getString(a.i.has_send));
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.LuckyMoneyNewYearSendUI", "sendLocalMsg() for hb!");
          o.C(this.kTv, this.kWt, 3);
          if (paramInt1 != 0) {
            break;
          }
          finish();
          return;
        }
      }
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.LuckyMoneyNewYearSendUI", "do pay cancel or failed!");
      return;
    case 2: 
      if (paramIntent == null)
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.LuckyMoneyNewYearSendUI", "onActivityResult() data is null for REQUEST_CODE_FROM_PIC");
        return;
      }
      if (paramInt2 == -1)
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.LuckyMoneyNewYearSendUI", "ljd:select picture is ok!");
        localObject = paramIntent.getStringExtra("CropImage_OutputPath");
        paramIntent = paramIntent.getStringArrayListExtra("CropImage_OutputPath_List");
        if ((!TextUtils.isEmpty((CharSequence)localObject)) || ((paramIntent != null) && (paramIntent.size() > 0)))
        {
          if (!TextUtils.isEmpty((CharSequence)localObject)) {
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.LuckyMoneyNewYearSendUI", "ljd:imagePath is valid!");
          }
          for (paramIntent = (Intent)localObject;; paramIntent = (String)paramIntent.get(0))
          {
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.LuckyMoneyNewYearSendUI", "REQUEST_CODE_FROM_PIC filePath %s", new Object[] { localObject });
            localObject = new Intent();
            ((Intent)localObject).putExtra("CropImageMode", 1);
            ((Intent)localObject).putExtra("CropImage_OutputPath", com.tencent.mm.compatible.util.e.dgu + "temp.avatar");
            ((Intent)localObject).putExtra("CropImage_ImgPath", paramIntent);
            ((Intent)localObject).putExtra("CropImage_Filter", false);
            ((Intent)localObject).putExtra("CropImage_from_scene", 1);
            com.tencent.mm.plugin.luckymoney.a.ezn.a(this, (Intent)localObject, 3);
            return;
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.LuckyMoneyNewYearSendUI", "ljd:imagePathList is valid!");
          }
        }
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.LuckyMoneyNewYearSendUI", "do select picture failed, imagePath and imagePathList is null!");
        return;
      }
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.LuckyMoneyNewYearSendUI", "do select picture cancel or failed!");
      return;
    }
    if (paramIntent == null)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.LuckyMoneyNewYearSendUI", "onActivityResult() data is null for REQUEST_CODE_FROM_CROP");
      return;
    }
    if (paramInt2 == -1)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.LuckyMoneyNewYearSendUI", "ljd:select picture is ok!");
      paramIntent = paramIntent.getStringExtra("CropImage_OutputPath");
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.LuckyMoneyNewYearSendUI", "new crop image path:" + paramIntent);
      if ((!TextUtils.isEmpty(paramIntent)) && (paramIntent.equals(this.kWv))) {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.LuckyMoneyNewYearSendUI", "the path is same as last image");
      }
      for (;;)
      {
        this.kWv = paramIntent;
        paramIntent = o.aE(this.kWv, false);
        if (paramIntent == null) {
          break label615;
        }
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.LuckyMoneyNewYearSendUI", "ljd:get crop new year picture is ok!");
        localObject = this.mBitmap;
        this.mBitmap = paramIntent;
        this.kVY.setImageBitmap(this.mBitmap);
        this.kWa = true;
        aL();
        if ((localObject == null) || (!((Bitmap)localObject).isRecycled())) {
          break;
        }
        ((Bitmap)localObject).recycle();
        return;
        this.kWb = "";
        this.kWc = "";
        this.kWd = 0;
      }
      label615:
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.LuckyMoneyNewYearSendUI", "ljd:get crop new year picture failed!");
      return;
    }
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.LuckyMoneyNewYearSendUI", "ljd:do crop image fail for REQUEST_CODE_FROM_CROP");
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.LuckyMoneyNewYearSendUI", "lucky send ui create");
    this.kWt = getIntent().getStringExtra("key_username");
    this.kTr = getIntent().getIntExtra("key_way", 0);
    this.kTw = getIntent().getIntExtra("pay_channel", -1);
    if (bi.oW(this.kWt))
    {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.LuckyMoneyNewYearSendUI", "name null finish");
      finish();
    }
    initView();
    l(new com.tencent.mm.plugin.luckymoney.b.x("v1.0"));
    com.tencent.mm.plugin.report.service.h.mEJ.h(13079, new Object[] { Integer.valueOf(1), Integer.valueOf(1) });
  }
  
  protected void onDestroy()
  {
    com.tencent.mm.kernel.g.Ek();
    com.tencent.mm.kernel.g.Ei().DT().a(aa.a.sSO, this.kWv);
    com.tencent.mm.kernel.g.Ek();
    com.tencent.mm.kernel.g.Ei().DT().a(aa.a.sSP, this.kWb);
    com.tencent.mm.kernel.g.Ek();
    com.tencent.mm.kernel.g.Ei().DT().a(aa.a.sSQ, this.kWc);
    com.tencent.mm.kernel.g.Ek();
    com.tencent.mm.kernel.g.Ei().DT().a(aa.a.sSR, Integer.valueOf(this.kWd));
    super.onDestroy();
    if ((this.eXG != null) && (this.eXG.isShowing())) {
      this.eXG.dismiss();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearSendUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */