package com.tencent.mm.plugin.card.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.mm.ak.a.a.c;
import com.tencent.mm.ak.a.a.c.a;
import com.tencent.mm.ak.o;
import com.tencent.mm.plugin.card.a.b;
import com.tencent.mm.plugin.card.a.c;
import com.tencent.mm.plugin.card.a.d;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.protocal.c.kx;
import com.tencent.mm.protocal.c.lf;
import com.tencent.mm.protocal.c.pr;
import com.tencent.mm.sdk.platformtools.x;
import java.util.LinkedList;

public final class e
  extends a
{
  protected TextView eCm;
  private ImageView hJA;
  private ImageView hJB;
  private ImageView hJC;
  private ImageView hJD;
  private ImageView hJE;
  private RelativeLayout hJx;
  private TextView hJy;
  private View hJz;
  private LinearLayout hzi;
  
  public e(Context paramContext)
  {
    super(paramContext);
  }
  
  private void aAe()
  {
    Object localObject = new c.a();
    ((c.a)localObject).dXB = com.tencent.mm.compatible.util.e.bnE;
    o.Pk();
    ((c.a)localObject).dXU = null;
    ((c.a)localObject).dXA = com.tencent.mm.plugin.card.model.m.xr(this.htQ.awn().rnn);
    ((c.a)localObject).dXy = true;
    ((c.a)localObject).dXW = true;
    ((c.a)localObject).dXX = this.mContext.getResources().getDimensionPixelSize(a.b.card_member_widget_bg_big_round_radius);
    ((c.a)localObject).dXY = true;
    ((c.a)localObject).dXw = true;
    ((c.a)localObject).dXN = a.c.card_widget_member_bg;
    ((c.a)localObject).dXF = com.tencent.mm.bp.a.ad(this.mContext, a.b.card_member_widget_layout_height);
    ((c.a)localObject).dXE = com.tencent.mm.bp.a.fk(this.mContext);
    localObject = ((c.a)localObject).Pt();
    o.Pj().a(this.htQ.awn().rnn, this.hJD, (c)localObject);
    x.i("MicroMsg.CardWidgetMembership", "the member back ground url is " + this.htQ.awn().rnn);
  }
  
  public final void a(ShapeDrawable paramShapeDrawable)
  {
    if (!TextUtils.isEmpty(this.htQ.awn().rnn))
    {
      this.hJD.setBackgroundDrawable(null);
      this.hJE.setVisibility(0);
      aAe();
    }
    while (this.hJb == null) {
      return;
    }
    this.hJD.setBackgroundDrawable(paramShapeDrawable);
    this.hJE.setVisibility(8);
  }
  
  protected final void aAa()
  {
    if (this.hJd != null) {
      this.hJd.setText(this.htQ.awm().hwh);
    }
    Object localObject;
    if ((this.htQ.awm().rnG != null) && (this.htQ.awm().rnG.size() > 0))
    {
      localObject = (pr)this.htQ.awm().rnG.get(0);
      if (!TextUtils.isEmpty(((pr)localObject).title)) {
        this.eCm.setText(((pr)localObject).title);
      }
    }
    else
    {
      if (!this.htQ.awi()) {
        break label472;
      }
      dV(true);
      this.hJD.setAlpha(255);
      if (this.hJD.getBackground() != null) {
        this.hJD.getBackground().setAlpha(255);
      }
      localObject = this.htQ.awn().code;
      if (!TextUtils.isEmpty((CharSequence)localObject)) {
        break label297;
      }
      x.e("MicroMsg.CardWidgetMembership", "don't updateCodeLayout, code is empty!");
      dV(false);
    }
    for (;;)
    {
      localObject = this.hJx.getLayoutParams();
      int i = this.mContext.getResources().getDimensionPixelSize(a.b.LargerPadding);
      int j = this.mContext.getResources().getDisplayMetrics().widthPixels - i * 2;
      int k = j * 3 / 5;
      ((ViewGroup.LayoutParams)localObject).height = k;
      x.d("MicroMsg.CardWidgetMembership", "padding:%d,originWidth:%d,targetWidth:%d", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k) });
      this.hJx.setLayoutParams((ViewGroup.LayoutParams)localObject);
      return;
      this.eCm.setText("");
      break;
      label297:
      this.hJz.setOnClickListener(this.eZF);
      this.hJA.setOnClickListener(this.eZF);
      this.hJy.setOnClickListener(this.eZF);
      switch (this.htQ.awn().rnc)
      {
      default: 
        break;
      case 0: 
        if (((String)localObject).length() <= 40) {
          this.hJy.setText(com.tencent.mm.plugin.card.d.m.yd((String)localObject));
        }
        break;
      case 1: 
      case 2: 
        if (((String)localObject).length() <= 40)
        {
          if (this.htQ.awb()) {
            this.hJy.setText(com.tencent.mm.plugin.card.d.m.yd((String)localObject));
          } else {
            this.hJy.setText("");
          }
        }
        else
        {
          this.hJy.setText("");
          continue;
          this.hJy.setText("");
          continue;
          label472:
          this.hJy.setText("");
          this.hJA.setVisibility(8);
          this.hJz.setVisibility(8);
          this.hJD.setAlpha(90);
          if (this.hJD.getBackground() != null) {
            this.hJD.getBackground().setAlpha(90);
          }
        }
        break;
      }
    }
  }
  
  protected final void azZ()
  {
    this.eCm = ((TextView)azY().findViewById(a.d.card_title));
    this.hJx = ((RelativeLayout)azY().findViewById(a.d.card_membership_layout));
    this.hzi = ((LinearLayout)azY().findViewById(a.d.card_code_layout));
    this.hJy = ((TextView)azY().findViewById(a.d.code_text));
    this.hJz = azY().findViewById(a.d.card_code_click_view);
    this.hJA = ((ImageView)azY().findViewById(a.d.card_code_img));
    this.hJB = ((ImageView)this.hJb.findViewById(a.d.member_widget_bg_up));
    this.hJC = ((ImageView)this.hJb.findViewById(a.d.member_widget_bg_down));
    this.hJD = ((ImageView)this.hJb.findViewById(a.d.card_member_bg_img));
    this.hJE = ((ImageView)this.hJb.findViewById(a.d.card_member_top_shadow_img));
  }
  
  public final void dV(boolean paramBoolean)
  {
    if ((!TextUtils.isEmpty(this.htQ.awn().code)) && (paramBoolean) && (this.htQ.awn().rnc != 0) && (!this.htQ.awm().roo))
    {
      this.hJA.setVisibility(0);
      this.hJz.setVisibility(0);
      return;
    }
    this.hJA.setVisibility(8);
    this.hJz.setVisibility(8);
  }
  
  public final void dW(boolean paramBoolean)
  {
    if (!TextUtils.isEmpty(this.htQ.awn().rnn))
    {
      this.hJC.setVisibility(8);
      this.hJB.setVisibility(8);
      return;
    }
    this.hJC.setVisibility(0);
    this.hJB.setVisibility(0);
  }
  
  public final void oc(int paramInt)
  {
    if (!TextUtils.isEmpty(this.htQ.awn().rnn))
    {
      this.hJD.setBackgroundDrawable(null);
      this.hJE.setVisibility(0);
      aAe();
    }
    while (this.hJb == null) {
      return;
    }
    this.hJD.setBackgroundResource(paramInt);
    this.hJE.setVisibility(8);
  }
  
  public final void v(boolean paramBoolean1, boolean paramBoolean2) {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/card/widget/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */