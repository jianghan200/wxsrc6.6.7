package com.tencent.mm.plugin.card.ui;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.OvershootInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.mm.ab.l;
import com.tencent.mm.ak.a.a.c.a;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.card.a.a;
import com.tencent.mm.plugin.card.a.c;
import com.tencent.mm.plugin.card.a.d;
import com.tencent.mm.plugin.card.a.e;
import com.tencent.mm.plugin.card.a.g;
import com.tencent.mm.plugin.card.d.d;
import com.tencent.mm.plugin.card.d.m.3;
import com.tencent.mm.plugin.card.model.ag;
import com.tencent.mm.plugin.card.model.m;
import com.tencent.mm.plugin.card.model.q;
import com.tencent.mm.pluginsdk.ui.d.j;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.p;
import com.tencent.mm.ui.s;

@com.tencent.mm.ui.base.a(3)
public class CardGiftAcceptUI
  extends MMActivity
  implements View.OnClickListener, com.tencent.mm.ab.e
{
  private final String TAG = "MicroMsg.CardGiftAcceptUI";
  private String bTT;
  private String bYo;
  private int dxI;
  private String dxJ;
  private RelativeLayout hCJ;
  private RelativeLayout hCK;
  private ImageView hCL;
  private TextView hCM;
  private TextView hCN;
  private ImageView hCO;
  private Button hCP;
  private LinearLayout hCQ;
  private TextView hCR;
  private LinearLayout hCS;
  private TextView hCT;
  private ImageView hCU;
  private ImageView hCV;
  private RelativeLayout hCW;
  private ag hCX;
  private q hCY;
  private p tipDialog = null;
  
  private void ayG()
  {
    q localq = new q(this.dxI, this.dxJ, this.bTT, Boolean.valueOf(false));
    g.Eh().dpP.a(localq, 0);
    if (this.tipDialog != null) {
      this.tipDialog.show();
    }
  }
  
  private static Drawable b(Drawable paramDrawable, ColorStateList paramColorStateList)
  {
    paramDrawable = android.support.v4.b.a.a.g(paramDrawable);
    android.support.v4.b.a.a.a(paramDrawable, paramColorStateList);
    return paramDrawable;
  }
  
  private void cj(int paramInt1, int paramInt2)
  {
    GradientDrawable localGradientDrawable = new GradientDrawable();
    localGradientDrawable.setColor(paramInt2);
    localGradientDrawable.setStroke(2, paramInt1);
    localGradientDrawable.setCornerRadius(6.0F);
    this.hCP.setBackground(localGradientDrawable);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    if ((paramInt1 == 0) && (paramInt2 == 0)) {
      if ((paraml instanceof ag))
      {
        this.hCX = ((ag)paraml);
        x.i("MicroMsg.CardGiftAcceptUI", "ignore:%b", new Object[] { Boolean.valueOf(this.hCX.hxo) });
        if (!this.hCX.hxo)
        {
          if ((this.tipDialog != null) && (this.tipDialog.isShowing())) {
            this.tipDialog.dismiss();
          }
          if (this.hCX == null)
          {
            x.e("MicroMsg.CardGiftAcceptUI", "preAcceptGiftCard is null");
            paramString = this.hCK;
            paraml = new ScaleAnimation(0.0F, 0.96F, 0.0F, 0.96F, 1, 0.5F, 1, 0.5F);
            paraml.setDuration(300L);
            paraml.setInterpolator(new OvershootInterpolator());
            paraml.setFillAfter(true);
            ScaleAnimation localScaleAnimation = new ScaleAnimation(0.96F, 1.0F, 0.96F, 1.0F, 1, 0.5F, 1, 0.5F);
            localScaleAnimation.setDuration(100L);
            localScaleAnimation.setFillAfter(true);
            paraml.setAnimationListener(new m.3(paramString, localScaleAnimation));
            if (paramString != null) {
              paramString.startAnimation(paraml);
            }
            this.mController.contentView.setVisibility(0);
          }
        }
      }
    }
    do
    {
      do
      {
        return;
        this.hCN.setText(this.hCX.content);
        this.hCM.setText(j.a(this, this.hCX.bYo, this.hCM.getTextSize()));
        if (this.hCX.status == 0) {
          if (!bi.oW(this.hCX.hxn))
          {
            this.hCP.setVisibility(0);
            this.hCP.setText(this.hCX.hxn);
            this.hCP.setOnClickListener(this);
          }
        }
        for (;;)
        {
          if (!bi.oW(this.hCX.hxr))
          {
            this.hCP.setVisibility(8);
            this.hCS.setVisibility(8);
            this.hCQ.setVisibility(0);
            this.hCR.setText(this.hCX.hxr);
          }
          if (!bi.oW(this.hCX.hxs))
          {
            this.hCQ.setVisibility(8);
            this.hCS.setVisibility(0);
            this.hCT.setText(this.hCX.hxs);
          }
          if (!bi.oW(this.hCX.hxm))
          {
            paramInt1 = com.tencent.mm.bp.a.fromDPToPix(this, 15);
            paramString = new c.a();
            paramString.dXB = com.tencent.mm.compatible.util.e.bnE;
            com.tencent.mm.ak.o.Pk();
            paramString.dXU = null;
            paramString.dXA = m.xr(this.hCX.hxm);
            paramString.dXy = true;
            paramString.dXW = true;
            paramString.dXX = paramInt1;
            paramString.dXw = true;
            paramString.dXN = a.c.my_card_package_defaultlogo;
            paramString = paramString.Pt();
            com.tencent.mm.ak.o.Pj().a(this.hCX.hxm, this.hCL, paramString);
          }
          if (!bi.oW(this.hCX.hxp)) {
            com.tencent.mm.ak.o.Pj().a(this.hCX.hxp, this.hCO);
          }
          if ((!bi.oW(this.hCX.hxq)) && (this.hCP.getVisibility() == 0))
          {
            paramInt1 = bi.bc(this.hCX.hxq, getResources().getColor(a.a.card_gift_accept_button_default_border_color));
            cj(paramInt1, getResources().getColor(a.a.card_gift_accept_button_default_bg_color));
            this.hCP.setTextColor(paramInt1);
          }
          if ((!bi.oW(this.hCX.hxq)) && (this.hCR.getVisibility() == 0))
          {
            paramInt1 = bi.bc(this.hCX.hxq, getResources().getColor(a.a.card_gift_accept_button_default_border_color));
            this.hCR.setTextColor(paramInt1);
            paramInt2 = getResources().getColor(a.a.card_gift_accept_button_default_border_color);
            paramInt1 = paramInt2;
            if (!bi.oW(this.hCX.hxq)) {
              paramInt1 = bi.bc(this.hCX.hxq, paramInt2);
            }
            this.hCU.setImageDrawable(b(this.hCU.getDrawable(), ColorStateList.valueOf(paramInt1)));
          }
          if ((!bi.oW(this.hCX.hxq)) && (this.hCT.getVisibility() == 0))
          {
            paramInt1 = bi.bc(this.hCX.hxq, getResources().getColor(a.a.card_gift_accept_button_default_border_color));
            this.hCT.setTextColor(paramInt1);
            paramInt2 = getResources().getColor(a.a.card_gift_accept_button_default_border_color);
            paramInt1 = paramInt2;
            if (!bi.oW(this.hCX.hxq)) {
              paramInt1 = bi.bc(this.hCX.hxq, paramInt2);
            }
            this.hCV.setImageDrawable(b(this.hCV.getDrawable(), ColorStateList.valueOf(paramInt1)));
            paramString = (ViewGroup.MarginLayoutParams)this.hCP.getLayoutParams();
            paramString.topMargin -= com.tencent.mm.bp.a.fromDPToPix(this, 20);
            this.hCP.setLayoutParams(paramString);
          }
          if ((this.hCP.getVisibility() != 0) || (this.hCS.getVisibility() != 8)) {
            break;
          }
          paramString = (ViewGroup.MarginLayoutParams)this.hCP.getLayoutParams();
          paramString.bottomMargin += com.tencent.mm.bp.a.fromDPToPix(this, 28);
          this.hCP.setLayoutParams(paramString);
          break;
          this.hCP.setVisibility(0);
          this.hCP.setText(getResources().getString(a.g.card_gift_accepted_title));
          this.hCP.setOnClickListener(this);
          continue;
          if ((this.hCX.status != 1) && (this.hCX.status == 2))
          {
            if (!bi.oW(this.hCX.hxn))
            {
              this.hCP.setVisibility(0);
              this.hCP.setBackgroundDrawable(null);
              this.hCP.setText(this.hCX.hxn);
              this.hCP.setTextColor(getResources().getColor(a.a.black));
              this.hCP.setTextSize(1, 17.0F);
              this.hCP.setOnClickListener(null);
            }
            else
            {
              this.hCP.setVisibility(8);
              this.hCP.setOnClickListener(null);
            }
          }
          else
          {
            this.hCP.setVisibility(8);
            this.hCP.setOnClickListener(null);
          }
        }
        x.i("MicroMsg.CardGiftAcceptUI", "NetScenePreAcceptGiftCard ignore is true~so ignore it");
        ayG();
        return;
      } while (!(paraml instanceof q));
      if ((this.tipDialog != null) && (this.tipDialog.isShowing())) {
        this.tipDialog.dismiss();
      }
      x.i("MicroMsg.CardGiftAcceptUI", "accept gift card is success!");
      this.hCY = ((q)paraml);
      paramString = new Intent(this, CardGiftReceiveUI.class);
      paramString.putExtra("key_order_id", this.dxJ);
      paramString.putExtra("key_biz_uin", this.dxI);
      paramString.putExtra("key_gift_into", this.hCY.hwX);
      if (!bi.oW(this.bTT)) {}
      for (boolean bool = true;; bool = false)
      {
        paramString.putExtra("key_from_group_chat_room", bool);
        startActivity(paramString);
        finish();
        return;
      }
      if ((this.tipDialog != null) && (this.tipDialog.isShowing())) {
        this.tipDialog.dismiss();
      }
      if ((paraml instanceof ag))
      {
        x.e("MicroMsg.CardGiftAcceptUI", "NetSceneGetCardGiftInfo onSceneEnd fail, errType = %d, errCode = %d, errMsg = %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
        d.a(this, paramString, true);
        return;
      }
    } while (!(paraml instanceof q));
    x.e("MicroMsg.CardGiftAcceptUI", "NetSceneGetCardGiftInfo onSceneEnd fail, errType = %d, errCode = %d, errMsg = %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    d.a(this, paramString, true);
  }
  
  protected final int getLayoutId()
  {
    return a.e.card_gift_accept_ui_new;
  }
  
  protected final void initView()
  {
    this.hCJ = ((RelativeLayout)findViewById(a.d.card_gift_accept_root));
    this.hCK = ((RelativeLayout)findViewById(a.d.card_gift_receive_rl));
    this.hCL = ((ImageView)findViewById(a.d.card_gift_receive_sender_avatar));
    this.hCM = ((TextView)findViewById(a.d.card_gift_receive_sender_nickname));
    this.hCN = ((TextView)findViewById(a.d.card_gift_receive_content));
    this.hCO = ((ImageView)findViewById(a.d.iv_package_card));
    this.hCP = ((Button)findViewById(a.d.card_gift_recieve_open));
    this.hCR = ((TextView)findViewById(a.d.card_gift_receive_outOfCardWording));
    this.hCT = ((TextView)findViewById(a.d.card_gift_receive_seeOtherWording));
    this.hCW = ((RelativeLayout)findViewById(a.d.card_gift_recieve_close_btn));
    this.hCU = ((ImageView)findViewById(a.d.card_gift_receive_arrow));
    this.hCV = ((ImageView)findViewById(a.d.see_other_arrow));
    this.hCQ = ((LinearLayout)findViewById(a.d.out_of_card_wording_layout));
    this.hCS = ((LinearLayout)findViewById(a.d.see_other_wording_layout));
    this.hCW.setOnClickListener(this);
    this.hCJ.setOnClickListener(this);
    this.hCK.setOnClickListener(this);
    this.hCQ.setOnClickListener(this);
    this.hCS.setOnClickListener(this);
    this.mController.contentView.setVisibility(8);
    this.tipDialog = com.tencent.mm.ui.base.h.a(this.mController.tml, getString(a.g.loading_tips), true, new CardGiftAcceptUI.1(this));
    ag localag = new ag(this.dxI, this.dxJ, this.bTT);
    g.Eh().dpP.a(localag, 0);
    if (this.tipDialog != null) {
      this.tipDialog.show();
    }
  }
  
  public void onClick(View paramView)
  {
    if ((paramView.getId() == a.d.card_gift_recieve_open) || (paramView.getId() == a.d.out_of_card_wording_layout))
    {
      if (this.hCP.getVisibility() == 0)
      {
        int i = bi.bc(this.hCX.hxq, getResources().getColor(a.a.card_gift_accept_button_default_border_color));
        cj(i, i);
        this.hCP.setTextColor(getResources().getColor(a.a.white));
      }
      ayG();
      if (!bi.oW(this.bYo)) {
        com.tencent.mm.plugin.report.service.h.mEJ.h(13866, new Object[] { Integer.valueOf(2), this.dxJ, com.tencent.mm.a.o.getString(this.dxI), this.bYo });
      }
    }
    do
    {
      do
      {
        return;
        if (paramView.getId() == a.d.card_gift_recieve_close_btn)
        {
          finish();
          return;
        }
        if (paramView.getId() == a.d.card_gift_accept_root)
        {
          finish();
          return;
        }
      } while (paramView.getId() != a.d.see_other_wording_layout);
      paramView = new q(this.dxI, this.dxJ, this.bTT, Boolean.valueOf(true));
      g.Eh().dpP.a(paramView, 0);
    } while (this.tipDialog == null);
    this.tipDialog.show();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.dxJ = getIntent().getStringExtra("key_order_id");
    this.dxI = getIntent().getIntExtra("key_biz_uin", -1);
    this.bYo = getIntent().getStringExtra("key_from_user_name");
    this.bTT = getIntent().getStringExtra("key_chatroom_name");
    x.i("MicroMsg.CardGiftAcceptUI", "onCreate, orderId:%s, bizUin:%s, fromUserName:%s", new Object[] { this.dxJ, Integer.valueOf(this.dxI), this.bYo });
    if (this.dxI == -1)
    {
      x.e("MicroMsg.CardGiftAcceptUI", "bizUin is -1, fail!");
      d.a(this, "", true);
      return;
    }
    if (this.dxJ == null)
    {
      x.e("MicroMsg.CardGiftAcceptUI", "orderId is null, fail");
      d.a(this, "", true);
      return;
    }
    if (!bi.oW(this.bYo)) {
      com.tencent.mm.plugin.report.service.h.mEJ.h(13866, new Object[] { Integer.valueOf(1), this.dxJ, com.tencent.mm.a.o.getString(this.dxI), this.bYo });
    }
    initView();
    g.Eh().dpP.a(1171, this);
    g.Eh().dpP.a(1136, this);
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    g.Eh().dpP.b(1171, this);
    g.Eh().dpP.b(1136, this);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      x.e("MicroMsg.CardGiftAcceptUI", "onKeyDown finishUI");
      if ((this.tipDialog != null) && (this.tipDialog.isShowing())) {
        this.tipDialog.dismiss();
      }
      finish();
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/card/ui/CardGiftAcceptUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */