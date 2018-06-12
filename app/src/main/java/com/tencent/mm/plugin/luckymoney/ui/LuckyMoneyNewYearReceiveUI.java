package com.tencent.mm.plugin.luckymoney.ui;

import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.mm.ab.l;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.luckymoney.b.ad;
import com.tencent.mm.plugin.luckymoney.b.f;
import com.tencent.mm.plugin.luckymoney.b.k;
import com.tencent.mm.plugin.luckymoney.b.o;
import com.tencent.mm.plugin.wxpay.a.d;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.p;
import com.tencent.mm.ui.s;
import com.tencent.mm.wallet_core.ui.e;
import java.io.File;

@com.tencent.mm.ui.base.a(3)
public class LuckyMoneyNewYearReceiveUI
  extends LuckyMoneyBaseUI
{
  private TextView glY;
  private ImageView hVP;
  private String imagePath = "";
  private View kMK;
  private int kRj = 0;
  private String kUn;
  private LuckyMoneyAutoScrollView kVR;
  private TextView kVS;
  private TextView kVT;
  private LinearLayout kVU;
  private ImageView kVV;
  private ImageView kVW;
  private View kVX;
  private ImageView kVY;
  private boolean kVZ = false;
  private boolean kWa = false;
  private String kWb = "";
  private String kWc = "";
  private int kWd;
  private k kWe;
  private boolean kWf = false;
  private TextView klp;
  private com.tencent.mm.sdk.platformtools.ag mHandler = new com.tencent.mm.sdk.platformtools.ag();
  private p tipDialog = null;
  
  private void a(int paramInt1, int paramInt2, String paramString1, String paramString2, String paramString3)
  {
    b(new ad(paramInt1, paramInt2, paramString1, paramString2, o.baX(), q.GH(), getIntent().getStringExtra("key_username"), "v1.0", paramString3), false);
  }
  
  private void bbz()
  {
    g.Em().H(new LuckyMoneyNewYearReceiveUI.5(this));
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    if ((paraml instanceof com.tencent.mm.plugin.luckymoney.b.ag))
    {
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paramString = (com.tencent.mm.plugin.luckymoney.b.ag)paraml;
        this.kRj = paramString.kRj;
        if (this.kRj == 1)
        {
          x.i("MicroMsg.LuckyMoneyNewYearReceiveUI", "download image data!");
          if (TextUtils.isEmpty(this.kWc)) {
            x.e("MicroMsg.LuckyMoneyNewYearReceiveUI", "imageaeskey is empty!");
          }
          if ((TextUtils.isEmpty(this.kWb)) || (TextUtils.isEmpty(this.kWc)) || (this.kWd <= 0))
          {
            x.e("MicroMsg.LuckyMoneyNewYearReceiveUI", "ljd:doDownloadImage() the parameter is illegeal!");
            if (!paramString.bba()) {
              break label826;
            }
            this.kVZ = true;
            x.i("MicroMsg.LuckyMoneyNewYearReceiveUI", "is Sender hb!");
            a.b.n(this.hVP, q.GF());
            findViewById(a.f.lucky_money_newyear_receive_senderdesc).setVisibility(8);
            findViewById(a.f.lucky_money_new_year_word).setVisibility(0);
            if ((paramString.bba()) || (paramString.ceT != 0) || (paramString.ceS == 4) || (paramString.ceS == 5) || (paramString.ceS == 1)) {
              break label946;
            }
            if (!"0".equals(paramString.kQU)) {
              break label919;
            }
            paraml = this.kUg;
            String str1 = paramString.kQV;
            String str2 = paramString.kQW;
            String str3 = paramString.kQX;
            String str4 = paramString.kQY;
            LuckyMoneyNewYearReceiveUI.6 local6 = new LuckyMoneyNewYearReceiveUI.6(this, paramString);
            new com.tencent.mm.plugin.wallet_core.id_verify.util.a().a(this, paraml, str1, str2, str3, str4, local6, true, 1005);
            label267:
            x.i("MicroMsg.LuckyMoneyNewYearReceiveUI", "scenePicSwitch:" + this.kRj + ", imageId:" + this.kWb + ", imageLength:" + this.kWd);
            if ((this.kRj != 1) || (TextUtils.isEmpty(this.kWb)) || (TextUtils.isEmpty(this.kWc)) || (this.kWd <= 0)) {
              break label1178;
            }
            this.kWa = true;
            x.i("MicroMsg.LuckyMoneyNewYearReceiveUI", "show the picture!");
            label366:
            boolean bool = true;
            if ((paramString.ceS == 5) || (paramString.ceS == 1)) {
              bool = false;
            }
            x.i("MicroMsg.LuckyMoneyNewYearReceiveUI", "receiveScene.hbStatus is " + paramString.ceS + ", isValidStatus is " + bool);
            if ((!this.kWa) || (!bool)) {
              break label1194;
            }
            this.kVX.setVisibility(0);
            this.kVW.setVisibility(8);
            label453:
            if ((!this.kWa) || (!bool)) {
              break label1214;
            }
            paramString = (LinearLayout.LayoutParams)this.klp.getLayoutParams();
            paramString.bottomMargin = getResources().getDimensionPixelOffset(a.d.lucky_money_new_year_wishing_bottom_margin_for_picture);
            this.klp.setLayoutParams(paramString);
            this.klp.invalidate();
            this.klp.setTextSize(1, 17.0F);
            this.kVS.setTextSize(1, 16.0F);
            this.kVR.cO(getResources().getDimensionPixelOffset(a.d.lucky_money_newyear_num_width_for_picture), getResources().getDimensionPixelOffset(a.d.lucky_money_newyear_num_height_for_picture));
            paramString = (LinearLayout.LayoutParams)this.kVR.getLayoutParams();
            paramString.topMargin = getResources().getDimensionPixelOffset(a.d.lucky_money_new_year_amount_top_margin_for_picture);
            this.kVR.setLayoutParams(paramString);
            this.kVR.invalidate();
            label594:
            if (!this.kVZ) {
              break label1363;
            }
            paramString = (LinearLayout.LayoutParams)this.kVU.getLayoutParams();
            if (!this.kWa) {
              break label1346;
            }
            paramString.topMargin = getResources().getDimensionPixelOffset(a.d.lucky_money_newyear_receive_status_layout_top_margin_for_sender_has_pic);
            label633:
            this.kVU.setLayoutParams(paramString);
            this.kVU.invalidate();
            this.glY.setTextSize(1, 18.0F);
          }
        }
        for (;;)
        {
          return true;
          x.i("MicroMsg.LuckyMoneyNewYearReceiveUI", "ljd:doDownloadImage()!");
          if (this.kWe == null) {
            this.kWe = new k();
          }
          this.imagePath = (o.Ge(this.kWb) + ".temp");
          if (!new File(this.imagePath).exists())
          {
            x.i("MicroMsg.LuckyMoneyNewYearReceiveUI", "ljd:updateImageView() imagePath:" + this.imagePath + " is not exist!");
            this.kWe.a(this.kWb, this.kWc, this.kWd, this.imagePath, new LuckyMoneyNewYearReceiveUI.4(this));
            break;
          }
          x.i("MicroMsg.LuckyMoneyNewYearReceiveUI", "ljd:imagePath file is exist! update image");
          bbz();
          break;
          x.e("MicroMsg.LuckyMoneyNewYearReceiveUI", "not to download image data!");
          break;
          label826:
          x.i("MicroMsg.LuckyMoneyNewYearReceiveUI", "is receiver hb!");
          if (!TextUtils.isEmpty(getIntent().getStringExtra("key_username"))) {
            a.b.n(this.hVP, getIntent().getStringExtra("key_username"));
          }
          for (;;)
          {
            o.a(this.mController.tml, this.kVT, paramString.kRy);
            this.kVZ = false;
            break;
            if (!TextUtils.isEmpty(paramString.kPM)) {
              o.a(this.hVP, paramString.kPM, paramString.kQg);
            }
          }
          label919:
          a(paramString.msgType, paramString.bxk, paramString.kLZ, paramString.ceR, paramString.kRC);
          break label267;
          label946:
          if ((this.tipDialog != null) && (this.tipDialog.isShowing())) {
            this.tipDialog.hide();
          }
          if (paramString.ceS != 5)
          {
            this.kVR.setFinalText(e.A(paramString.kRz / 100.0D));
            paraml = this.kVR;
            paraml.kTU.setVisibility(8);
            paraml.kTV.setVisibility(8);
            paraml.kTW.setVisibility(8);
            paraml.kTX.setVisibility(0);
            paraml.kTY.setVisibility(0);
            paraml.kTZ.setVisibility(0);
            o.a(this.mController.tml, this.klp, paramString.kLf);
            this.glY.setText(paramString.kPJ);
            if ((paramString.ceS == 4) && (!TextUtils.isEmpty(paramString.kPJ))) {
              this.kVV.setVisibility(8);
            }
          }
          for (;;)
          {
            ux(0);
            o.a(this.kMK, null);
            break;
            findViewById(a.f.lucky_money_newyear_receive_desc_area).setVisibility(8);
            ((TextView)findViewById(a.f.lucky_money_newyear_receive_invalid_status)).setText(paramString.kPJ);
            ((TextView)findViewById(a.f.lucky_money_newyear_receive_invalid_status)).setVisibility(0);
          }
          label1178:
          this.kWa = false;
          x.i("MicroMsg.LuckyMoneyNewYearReceiveUI", "don't show the picture!");
          break label366;
          label1194:
          this.kVX.setVisibility(8);
          this.kVW.setVisibility(0);
          break label453;
          label1214:
          paramString = (LinearLayout.LayoutParams)this.klp.getLayoutParams();
          paramString.bottomMargin = getResources().getDimensionPixelOffset(a.d.lucky_money_new_year_wishing_bottom_margin_for_normal);
          this.klp.setLayoutParams(paramString);
          this.klp.invalidate();
          this.klp.setTextSize(1, 20.0F);
          this.kVS.setTextSize(1, 18.0F);
          this.kVR.cO(getResources().getDimensionPixelOffset(a.d.lucky_money_newyear_num_width_for_normal), getResources().getDimensionPixelOffset(a.d.lucky_money_newyear_num_height_for_normal));
          paramString = (LinearLayout.LayoutParams)this.kVR.getLayoutParams();
          paramString.topMargin = getResources().getDimensionPixelOffset(a.d.lucky_money_new_year_amount_top_margin_for_normal);
          this.kVR.setLayoutParams(paramString);
          this.kVR.invalidate();
          break label594;
          label1346:
          paramString.topMargin = getResources().getDimensionPixelOffset(a.d.lucky_money_newyear_receive_status_layout_top_margin_for_sender_no_pic);
          break label633;
          label1363:
          paramString = (LinearLayout.LayoutParams)this.kVU.getLayoutParams();
          paramString.topMargin = getResources().getDimensionPixelOffset(a.d.lucky_money_newyear_receive_status_layout_top_margin_for_receiver);
          this.kVU.setLayoutParams(paramString);
          this.kVU.invalidate();
          this.glY.setTextSize(1, 12.0F);
        }
      }
      if ((this.tipDialog != null) && (this.tipDialog.isShowing())) {
        this.tipDialog.hide();
      }
      return false;
    }
    if ((paraml instanceof ad))
    {
      if ((this.tipDialog != null) && (this.tipDialog.isShowing())) {
        this.tipDialog.hide();
      }
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paramString = (ad)paraml;
        paraml = paramString.kQP;
        this.glY.setText(paramString.kQP.kPJ);
        this.kVR.setFinalText(e.A(paramString.kQP.cfh / 100.0D));
        this.kVR.a(new LuckyMoneyNewYearReceiveUI.7(this, paramString));
        if ((paraml.ceS == 4) && (!TextUtils.isEmpty(paramString.kQP.kPJ))) {
          this.kVV.setVisibility(8);
        }
        ux(0);
        o.a(this.kMK, null);
        return true;
      }
      if (paramInt2 == 416)
      {
        if ((this.tipDialog != null) && (this.tipDialog.isShowing())) {
          this.tipDialog.hide();
        }
        this.kWf = true;
        paramString = new Bundle();
        paramString.putString("realname_verify_process_jump_activity", ".ui.LuckyMoneyNewYearReceiveUI");
        paramString.putString("realname_verify_process_jump_plugin", "luckymoney");
        return o.a(this, paramInt2, paraml, paramString, true, 1004);
      }
    }
    return false;
  }
  
  protected final int getLayoutId()
  {
    return a.g.lucky_money_newyear_receive_ui;
  }
  
  protected final void initView()
  {
    this.kMK = findViewById(a.f.lucky_money_newyear_receive_ll);
    this.kVR = ((LuckyMoneyAutoScrollView)findViewById(a.f.lucky_money_newyear_receive_amount));
    this.kVS = ((TextView)findViewById(a.f.lucky_money_amount_unit_title_tv));
    this.klp = ((TextView)findViewById(a.f.lucky_money_newyear_receive_wishing));
    this.hVP = ((ImageView)findViewById(a.f.lucky_money_newyear_receive_avatar));
    this.kVU = ((LinearLayout)findViewById(a.f.lucky_money_newyear_receive_status_layout));
    this.glY = ((TextView)findViewById(a.f.lucky_money_newyear_receive_status));
    this.kVV = ((ImageView)findViewById(a.f.lucky_money_newyear_receive_status_icon));
    this.kVT = ((TextView)findViewById(a.f.lucky_money_newyear_receive_title));
    this.kVW = ((ImageView)findViewById(a.f.lucky_money_new_year_word));
    this.kVX = findViewById(a.f.lucky_money_new_year_picture_layout);
    this.kVY = ((ImageView)findViewById(a.f.lucky_money_new_year_picture_img));
    this.kVY.setOnClickListener(new LuckyMoneyNewYearReceiveUI.1(this));
    ((ImageView)findViewById(a.f.lucky_money_newyear_receive_close_btn)).setOnClickListener(new LuckyMoneyNewYearReceiveUI.2(this));
    ux(8);
    this.tipDialog = h.a(this.mController.tml, getString(a.i.loading_tips), true, new LuckyMoneyNewYearReceiveUI.3(this));
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    paramBundle = getIntent().getStringExtra("key_native_url");
    this.kWb = getIntent().getStringExtra("key_image_id");
    this.kWc = getIntent().getStringExtra("key_image_aes_key");
    this.kWd = getIntent().getIntExtra("key_image_length", 0);
    x.i("MicroMsg.LuckyMoneyNewYearReceiveUI", "imageId:" + this.kWb + ", imageLength:" + this.kWd);
    Uri localUri = Uri.parse(bi.oV(paramBundle));
    try
    {
      this.kUn = localUri.getQueryParameter("sendid");
      initView();
      if (!bi.oW(this.kUn))
      {
        b(new com.tencent.mm.plugin.luckymoney.b.ag(bi.getInt(localUri.getQueryParameter("channelid"), 1), this.kUn, paramBundle, 1, "v1.0"), false);
        if (this.tipDialog != null) {
          this.tipDialog.show();
        }
        return;
      }
      finish();
      x.w("MicroMsg.LuckyMoneyNewYearReceiveUI", "sendid null & finish");
      return;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    if ((this.tipDialog != null) && (this.tipDialog.isShowing())) {
      this.tipDialog.dismiss();
    }
  }
  
  protected void onResume()
  {
    super.onResume();
    if (this.kWf) {
      finish();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewYearReceiveUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */