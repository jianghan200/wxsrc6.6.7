package com.tencent.mm.plugin.card.ui.view;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.mm.plugin.card.a.a;
import com.tencent.mm.plugin.card.a.b;
import com.tencent.mm.plugin.card.a.d;
import com.tencent.mm.plugin.card.b.f;
import com.tencent.mm.plugin.card.d.l;
import com.tencent.mm.plugin.card.ui.a.g;
import com.tencent.mm.plugin.card.ui.n;
import com.tencent.mm.protocal.c.ax;
import com.tencent.mm.protocal.c.lf;
import com.tencent.mm.protocal.c.xk;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;

public final class b
  extends i
{
  private MMActivity gKS;
  private View hHn;
  private TextView hHo;
  private g hHp;
  private com.tencent.mm.plugin.card.base.b htQ;
  
  public final void azI()
  {
    this.hHn.setVisibility(8);
  }
  
  public final void destroy()
  {
    super.destroy();
    this.gKS = null;
    this.hHp = null;
  }
  
  public final void initView()
  {
    this.gKS = this.hHF.ayx();
    this.hHp = this.hHF.ayz();
  }
  
  public final void update()
  {
    if (this.hHn == null)
    {
      this.hHn = ((ViewStub)findViewById(a.d.card_accept_layout_stub)).inflate();
      this.hHn.findViewById(a.d.card_accept_btn).setOnClickListener(this.hHF.ayy());
    }
    this.htQ = this.hHF.ayu();
    this.hHp = this.hHF.ayz();
    boolean bool1 = this.hHp.azh();
    boolean bool2 = this.hHp.azi();
    Object localObject2;
    Object localObject1;
    int i;
    Object localObject3;
    Object localObject4;
    if (bool1)
    {
      this.hHn.setVisibility(0);
      x.i("MicroMsg.CardAcceptView", "updateAcceptView() acceptViewVisible:" + bool1 + " acceptViewEnabled:" + bool2);
      localObject2 = (Button)this.hHn.findViewById(a.d.card_accept_btn);
      localObject1 = this.hHn.findViewById(a.d.card_accept_layout);
      ((View)localObject1).setBackgroundDrawable(null);
      ((View)localObject1).setOnClickListener(null);
      i = this.gKS.getResources().getDimensionPixelSize(a.b.card_member_widget_bg_round_radius);
      if (!bool2) {
        break label1111;
      }
      if (!TextUtils.isEmpty(this.htQ.awm().rnP)) {
        ((Button)localObject2).setText(this.htQ.awm().rnP);
      }
      if (!this.htQ.avT()) {
        break label838;
      }
      ((Button)localObject2).setTextColor(l.xV(this.htQ.awm().dxh));
      localObject3 = l.e(this.gKS, l.xV(this.htQ.awm().dxh), i);
      localObject4 = l.cm(l.xV(this.htQ.awm().dxh), i);
      localObject1 = new StateListDrawable();
      ((StateListDrawable)localObject1).addState(new int[] { 16842919 }, (Drawable)localObject4);
      ((StateListDrawable)localObject1).addState(new int[0], (Drawable)localObject3);
      i = this.gKS.getResources().getColor(a.a.white);
      int j = l.xV(this.htQ.awm().dxh);
      localObject3 = new int[] { 16842919, 16842910 };
      ((Button)localObject2).setBackgroundDrawable((Drawable)localObject1);
      ((Button)localObject2).setTextColor(new ColorStateList(new int[][] { localObject3, new int[0] }, new int[] { i, j }));
      localObject1 = (LinearLayout.LayoutParams)this.hHn.getLayoutParams();
      ((LinearLayout.LayoutParams)localObject1).topMargin = this.gKS.getResources().getDimensionPixelSize(a.b.card_card_accept_layout_top_margin_for_member_acceptable);
      this.hHn.setLayoutParams((ViewGroup.LayoutParams)localObject1);
      this.hHn.findViewById(a.d.divider_line).setVisibility(8);
      localObject1 = this.hHF.ayC();
      localObject2 = (CheckBox)this.hHn.findViewById(a.d.card_follow_cbx);
      if ((((f)localObject1).awL() == null) || (!((f)localObject1).awL().hvj)) {
        break label820;
      }
      x.i("MicroMsg.CardAcceptView", "updateFollowBox() show followbox");
      ((CheckBox)localObject2).setVisibility(0);
      localObject3 = this.htQ.awm().roa;
      if ((localObject3 == null) || (TextUtils.isEmpty(((xk)localObject3).text))) {
        break label804;
      }
      ((CheckBox)localObject2).setText(((xk)localObject3).text);
      ((CheckBox)localObject2).setChecked(((f)localObject1).awL().hvk);
      ((CheckBox)localObject2).setOnClickListener(new b.1(this, (f)localObject1));
      label612:
      if ((!this.htQ.avU()) && (!this.htQ.avS()))
      {
        if ((this.htQ.awm().rob == null) || (bi.oW(this.htQ.awm().rob.text))) {
          break label1450;
        }
        if (this.hHo == null) {
          this.hHo = ((TextView)this.hHn.findViewById(a.d.card_accept_guidance_tv));
        }
        this.hHo.setText(this.htQ.awm().rob.text);
        if (!bi.oW(this.htQ.awm().rob.url))
        {
          this.hHo.setOnClickListener(this.hHF.ayy());
          this.hHo.setTextColor(l.xV(this.htQ.awm().dxh));
        }
        this.hHo.setVisibility(0);
      }
    }
    label804:
    label820:
    label838:
    label1111:
    label1299:
    label1450:
    while (this.hHo == null)
    {
      return;
      x.i("MicroMsg.CardAcceptView", "updateAcceptView(), mAcceptCardView is Gone");
      this.hHn.setVisibility(8);
      return;
      ((CheckBox)localObject2).setText(((f)localObject1).awL().title);
      break;
      x.i("MicroMsg.CardAcceptView", "updateFollowBox() not show followbox");
      ((CheckBox)localObject2).setVisibility(8);
      break label612;
      if ((this.htQ.avU()) || (this.htQ.avS()) || (this.htQ.avV()))
      {
        localObject1 = l.cm(l.xV(this.htQ.awm().dxh), i);
        localObject3 = l.cm(l.bc(this.htQ.awm().dxh, 175), i);
        localObject4 = new StateListDrawable();
        ((StateListDrawable)localObject4).addState(new int[] { 16842919 }, (Drawable)localObject3);
        ((StateListDrawable)localObject4).addState(new int[0], (Drawable)localObject1);
        ((Button)localObject2).setBackgroundDrawable((Drawable)localObject4);
        ((Button)localObject2).setTextColor(this.gKS.getResources().getColor(a.a.white_text_color_selector));
        localObject1 = (LinearLayout.LayoutParams)((Button)localObject2).getLayoutParams();
        ((LinearLayout.LayoutParams)localObject1).width = -1;
        ((Button)localObject2).setLayoutParams((ViewGroup.LayoutParams)localObject1);
        break label612;
      }
      localObject1 = l.cm(l.xV(this.htQ.awm().dxh), i);
      localObject3 = l.cm(l.bc(this.htQ.awm().dxh, 175), i);
      localObject4 = new StateListDrawable();
      ((StateListDrawable)localObject4).addState(new int[] { 16842919 }, (Drawable)localObject3);
      ((StateListDrawable)localObject4).addState(new int[0], (Drawable)localObject1);
      ((Button)localObject2).setBackgroundDrawable((Drawable)localObject4);
      ((Button)localObject2).setTextColor(this.gKS.getResources().getColor(a.a.white_text_color_selector));
      break label612;
      this.hHn.setEnabled(false);
      ((View)localObject1).setEnabled(false);
      ((Button)localObject2).setEnabled(false);
      if (this.htQ.avT()) {}
      for (localObject1 = this.htQ.awm().rnP;; localObject1 = this.hHp.aza())
      {
        ((Button)localObject2).setText((CharSequence)localObject1);
        if (!this.htQ.avT()) {
          break label1299;
        }
        ((Button)localObject2).setTextColor(l.bc(this.htQ.awm().dxh, 125));
        ((Button)localObject2).setBackgroundDrawable(l.e(this.gKS, l.bc(this.htQ.awm().dxh, 125), i));
        localObject1 = (LinearLayout.LayoutParams)this.hHn.getLayoutParams();
        ((LinearLayout.LayoutParams)localObject1).topMargin = this.gKS.getResources().getDimensionPixelSize(a.b.card_card_accept_layout_top_margin_for_member_unacceptable);
        this.hHn.setLayoutParams((ViewGroup.LayoutParams)localObject1);
        this.hHn.findViewById(a.d.divider_line).setVisibility(8);
        break;
      }
      if ((this.htQ.avU()) || (this.htQ.avS()) || (this.htQ.avV()))
      {
        ((Button)localObject2).setTextColor(this.gKS.getResources().getColor(a.a.grey_background_text_color));
        ((Button)localObject2).setBackgroundDrawable(l.A(this.gKS, this.gKS.getResources().getColor(a.a.card_accept_btn_disable_bg_color)));
        localObject1 = (LinearLayout.LayoutParams)((Button)localObject2).getLayoutParams();
        ((LinearLayout.LayoutParams)localObject1).width = -1;
        ((Button)localObject2).setLayoutParams((ViewGroup.LayoutParams)localObject1);
        break label612;
      }
      ((Button)localObject2).setTextColor(this.gKS.getResources().getColor(a.a.grey_background_text_color));
      ((Button)localObject2).setBackgroundDrawable(l.A(this.gKS, this.gKS.getResources().getColor(a.a.card_accept_btn_disable_bg_color)));
      break label612;
    }
    this.hHo.setVisibility(8);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/card/ui/view/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */