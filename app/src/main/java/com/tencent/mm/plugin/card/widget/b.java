package com.tencent.mm.plugin.card.widget;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.mm.plugin.card.a.a;
import com.tencent.mm.plugin.card.a.b;
import com.tencent.mm.plugin.card.a.c;
import com.tencent.mm.plugin.card.a.d;
import com.tencent.mm.plugin.card.a.e;
import com.tencent.mm.plugin.card.a.g;
import com.tencent.mm.plugin.card.d.l;
import com.tencent.mm.plugin.card.d.m;
import com.tencent.mm.protocal.c.bwx;
import com.tencent.mm.protocal.c.kx;
import com.tencent.mm.protocal.c.lf;
import com.tencent.mm.protocal.c.pr;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Iterator;
import java.util.LinkedList;

public final class b
  extends a
{
  private final String TAG = "MicroMsg.CardWidgetCommon";
  protected TextView eGX;
  private boolean hHc = false;
  protected TextView hJe;
  protected TextView hJf;
  protected Button hJg;
  protected LinearLayout hJh;
  protected TextView hJi;
  protected ImageView hJj;
  protected View hJk;
  protected ImageView hJl;
  
  public b(Context paramContext)
  {
    super(paramContext);
  }
  
  private void aAb()
  {
    RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)this.hJh.getLayoutParams();
    if (this.htQ.avR())
    {
      this.hJc.setVisibility(0);
      this.hJj.setVisibility(8);
      localLayoutParams.topMargin = this.mContext.getResources().getDimensionPixelSize(a.b.card_coupon_widget_body_top_margin);
    }
    for (;;)
    {
      this.hJh.setLayoutParams(localLayoutParams);
      return;
      if ((this.htQ.avS()) && (this.hHc))
      {
        this.hJc.setVisibility(8);
        this.hJj.setVisibility(8);
        localLayoutParams.topMargin = 0;
      }
      else if (this.htQ.avS())
      {
        this.hJc.setVisibility(0);
        this.hJj.setVisibility(8);
        localLayoutParams.topMargin = this.mContext.getResources().getDimensionPixelSize(a.b.card_coupon_widget_body_top_margin);
      }
    }
  }
  
  private void aAc()
  {
    LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)this.hJg.getLayoutParams();
    if ((this.htQ.awn().rnk != null) && (!TextUtils.isEmpty(this.htQ.awn().rnk.huY))) {
      localLayoutParams.bottomMargin = this.mContext.getResources().getDimensionPixelOffset(a.b.NormalPadding);
    }
    for (;;)
    {
      this.hJg.setLayoutParams(localLayoutParams);
      return;
      if ((this.htQ.awn().rnl != null) && (!TextUtils.isEmpty(this.htQ.awn().rnl.huX))) {
        localLayoutParams.bottomMargin = this.mContext.getResources().getDimensionPixelOffset(a.b.NormalPadding);
      } else if ((this.htQ.awm().rnG != null) && (this.htQ.awm().rnG.size() > 0)) {
        localLayoutParams.bottomMargin = this.mContext.getResources().getDimensionPixelOffset(a.b.NormalPadding);
      } else {
        localLayoutParams.bottomMargin = this.mContext.getResources().getDimensionPixelOffset(a.b.LargerPadding);
      }
    }
  }
  
  protected final void aAa()
  {
    pr localpr1;
    Object localObject1;
    if ((this.htQ.awm().rnG != null) && (this.htQ.awm().rnG.size() > 0))
    {
      localpr1 = (pr)this.htQ.awm().rnG.get(0);
      if (!bi.oW(localpr1.title)) {
        this.eGX.setText(localpr1.title);
      }
      if (!bi.oW(localpr1.huX))
      {
        this.hJe.setText(localpr1.huX);
        this.hJe.setVisibility(0);
        localObject1 = (LinearLayout.LayoutParams)this.hJe.getLayoutParams();
        if (bi.oW(localpr1.huY)) {
          break label232;
        }
        this.hJf.setText(localpr1.huY);
        this.hJf.setVisibility(0);
        ((LinearLayout.LayoutParams)localObject1).bottomMargin = 0;
        label148:
        this.hJe.setLayoutParams((ViewGroup.LayoutParams)localObject1);
        this.hJe.invalidate();
      }
    }
    else
    {
      if ((this.hJg != null) && (this.hJl != null)) {
        break label261;
      }
      x.e("MicroMsg.CardWidgetCommon", "consumeBtn == null || mCardCodeImg == null");
    }
    for (;;)
    {
      aAb();
      this.hJh.setBackgroundDrawable(this.mContext.getResources().getDrawable(a.c.card_white_top_bg));
      aAc();
      this.hJb.invalidate();
      return;
      this.hJe.setVisibility(8);
      break;
      label232:
      this.hJf.setVisibility(8);
      ((LinearLayout.LayoutParams)localObject1).bottomMargin = this.mContext.getResources().getDimensionPixelSize(a.b.LargerPadding);
      break label148;
      label261:
      if (this.htQ.awn() == null)
      {
        x.e("MicroMsg.CardWidgetCommon", "mCardInfo.getDataInfo() == null");
        this.hJg.setVisibility(8);
        this.hJl.setVisibility(8);
      }
      else
      {
        if (this.htQ.awn().rnk != null)
        {
          x.i("MicroMsg.CardWidgetCommon", "operate_field.title is " + this.htQ.awn().rnk.title);
          x.d("MicroMsg.CardWidgetCommon", "operate_field.url is " + this.htQ.awn().rnk.url);
          x.i("MicroMsg.CardWidgetCommon", "operate_field.aux_title is " + this.htQ.awn().rnk.huY);
        }
        localpr1 = this.htQ.awn().rnl;
        if (localpr1 != null)
        {
          x.i("MicroMsg.CardWidgetCommon", "limit_field.title is " + localpr1.title);
          x.i("MicroMsg.CardWidgetCommon", "limit_field.show_flag is " + localpr1.roL);
          x.i("MicroMsg.CardWidgetCommon", "limit_field.aux_title is " + localpr1.huY);
        }
        Object localObject2 = this.htQ.awm().rnZ;
        localObject1 = (LinearLayout)this.hJh.findViewById(a.d.card_detail_field_layout);
        if ((localObject2 != null) && (!bi.cX(((bwx)localObject2).stl)))
        {
          ((LinearLayout)localObject1).setVisibility(0);
          ((LinearLayout)localObject1).removeAllViews();
          localObject2 = ((bwx)localObject2).stl.iterator();
        }
        while (((Iterator)localObject2).hasNext())
        {
          pr localpr2 = (pr)((Iterator)localObject2).next();
          View localView = LayoutInflater.from(this.mContext).inflate(a.e.card_detail_field_item, null);
          TextView localTextView1 = (TextView)localView.findViewById(a.d.card_detail_field_title);
          TextView localTextView2 = (TextView)localView.findViewById(a.d.card_detail_field_dec);
          localTextView1.setText(localpr2.title);
          localTextView2.setText(localpr2.huX);
          ((LinearLayout)localObject1).addView(localView);
          continue;
          ((LinearLayout)localObject1).setVisibility(8);
        }
        if ((localpr1 != null) && (!TextUtils.isEmpty(localpr1.title)) && (localpr1.roL != 0L) && (this.htQ.awi()))
        {
          this.hJg.setClickable(false);
          this.hJg.setVisibility(0);
          this.hJg.setTextColor(this.mContext.getResources().getColor(a.a.white_text_color_selector));
          this.hJg.setText(localpr1.title);
          if ((localpr1 != null) && (!TextUtils.isEmpty(localpr1.huX)))
          {
            this.hJi.setText(localpr1.huX);
            this.hJi.setVisibility(0);
          }
          for (;;)
          {
            this.hJl.setVisibility(8);
            if ((localpr1.roL & 0x2) <= 0L) {
              break label875;
            }
            this.hJg.setBackgroundDrawable(l.A(this.mContext, l.bc(this.htQ.awm().dxh, 150)));
            this.hJi.setTextColor(l.xV(this.htQ.awm().dxh));
            break;
            this.hJi.setVisibility(8);
          }
          label875:
          if ((localpr1.roL & 0x4) > 0L)
          {
            this.hJg.setBackgroundDrawable(l.A(this.mContext, this.mContext.getResources().getColor(a.a.light_grey)));
            this.hJi.setTextColor(this.mContext.getResources().getColor(a.a.normal_color));
          }
          else
          {
            this.hJg.setBackgroundDrawable(l.A(this.mContext, l.xV(this.htQ.awm().dxh)));
            this.hJi.setTextColor(this.mContext.getResources().getColor(a.a.normal_color));
          }
        }
        else if ((this.htQ.awn().rnk != null) && (!TextUtils.isEmpty(this.htQ.awn().rnk.title)) && (!TextUtils.isEmpty(this.htQ.awn().rnk.url)) && (this.htQ.awi()))
        {
          this.hJg.setClickable(true);
          this.hJg.setVisibility(0);
          this.hJg.setBackgroundDrawable(l.A(this.mContext, l.xV(this.htQ.awm().dxh)));
          this.hJg.setTextColor(this.mContext.getResources().getColorStateList(a.a.white_text_color_selector));
          this.hJg.setText(this.htQ.awn().rnk.title);
          if ((this.htQ.awn().rnk != null) && (!TextUtils.isEmpty(this.htQ.awn().rnk.huY)))
          {
            this.hJi.setTextColor(this.mContext.getResources().getColor(a.a.normal_color));
            this.hJi.setText(this.htQ.awn().rnk.huY);
            this.hJi.setVisibility(0);
          }
          for (;;)
          {
            if (TextUtils.isEmpty(this.htQ.awn().code)) {
              break label1273;
            }
            this.hJl.setVisibility(0);
            break;
            this.hJi.setVisibility(8);
          }
          label1273:
          this.hJl.setVisibility(8);
        }
        else if ((!TextUtils.isEmpty(this.htQ.awn().code)) && (this.htQ.awi()))
        {
          x.i("MicroMsg.CardWidgetCommon", "mCardInfo.getDataInfo().code is valid");
          this.hJl.setVisibility(8);
          this.hJi.setVisibility(8);
          this.hJg.setClickable(true);
          this.hJg.setVisibility(0);
          this.hJg.setBackgroundDrawable(l.A(this.mContext, l.xV(this.htQ.awm().dxh)));
          this.hJg.setTextColor(this.mContext.getResources().getColorStateList(a.a.white_text_color_selector));
          this.hJg.setText(a.g.card_state_normal);
        }
        else if (!this.htQ.awi())
        {
          x.i("MicroMsg.CardWidgetCommon", "mCardInfo.getDataInfo().status is " + this.htQ.awn().status);
          this.hJl.setVisibility(8);
          this.hJi.setVisibility(8);
          this.hJg.setClickable(true);
          this.hJg.setVisibility(0);
          this.hJg.setTextColor(this.mContext.getResources().getColor(a.a.grey_background_text_color));
          this.hJg.setBackgroundDrawable(l.A(this.mContext, this.mContext.getResources().getColor(a.a.card_accept_btn_disable_bg_color)));
          if (!TextUtils.isEmpty(this.htQ.awm().roe)) {
            this.hJg.setText(this.htQ.awm().roe);
          } else {
            m.b(this.hJg, this.htQ.awn().status);
          }
        }
        else
        {
          x.i("MicroMsg.CardWidgetCommon", "operate_field and code is empty!");
          this.hJg.setVisibility(8);
          this.hJi.setVisibility(8);
          this.hJl.setVisibility(8);
        }
      }
    }
  }
  
  public final void aAd()
  {
    RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)this.hJh.getLayoutParams();
    if (this.htQ.avS())
    {
      this.hJc.setVisibility(0);
      localLayoutParams.topMargin = this.mContext.getResources().getDimensionPixelSize(a.b.card_coupon_widget_body_top_margin);
    }
    this.hJh.setLayoutParams(localLayoutParams);
    this.hJh.invalidate();
  }
  
  protected final void azZ()
  {
    this.eGX = ((TextView)this.hJb.findViewById(a.d.card_title));
    this.hJe = ((TextView)this.hJb.findViewById(a.d.card_subtitle));
    this.hJf = ((TextView)this.hJb.findViewById(a.d.card_auxtitle));
    this.hJg = ((Button)this.hJb.findViewById(a.d.card_consume_btn));
    this.hJh = ((LinearLayout)this.hJb.findViewById(a.d.widget_body));
    this.hJj = ((ImageView)this.hJh.findViewById(a.d.app_small_logo));
    this.hJk = this.hJb.findViewById(a.d.card_bottom_dash_divider);
    this.hJl = ((ImageView)this.hJb.findViewById(a.d.card_code_img));
    this.hJi = ((TextView)this.hJb.findViewById(a.d.card_operate_field_aux_title_tv));
  }
  
  public final void dW(boolean paramBoolean)
  {
    this.hHc = paramBoolean;
    if (paramBoolean)
    {
      this.hJk.setVisibility(0);
      return;
    }
    this.hJk.setVisibility(8);
  }
  
  public final void oc(int paramInt)
  {
    this.hJh.setBackgroundResource(paramInt);
    this.hJj.setVisibility(8);
    RelativeLayout.LayoutParams localLayoutParams;
    if (paramInt == 0)
    {
      localLayoutParams = (RelativeLayout.LayoutParams)this.hJh.getLayoutParams();
      if (this.htQ.avR())
      {
        this.hJc.setVisibility(8);
        localLayoutParams.topMargin = 0;
        this.hJj.setVisibility(0);
        int i = this.mContext.getResources().getDimensionPixelSize(a.b.card_app_small_logo_height);
        m.a(this.hJj, this.htQ.awm().huW, i, a.c.my_card_package_defaultlogo, false);
        this.hJh.setLayoutParams(localLayoutParams);
        this.hJh.invalidate();
        label119:
        aAc();
        localLayoutParams = (RelativeLayout.LayoutParams)this.hJk.getLayoutParams();
        if (paramInt != 0) {
          break label214;
        }
        localLayoutParams.leftMargin = 0;
      }
    }
    for (localLayoutParams.rightMargin = 0;; localLayoutParams.rightMargin = this.mContext.getResources().getDimensionPixelSize(a.b.BiggerPadding))
    {
      this.hJk.setLayoutParams(localLayoutParams);
      this.hJk.invalidate();
      this.hJb.invalidate();
      return;
      if ((!this.htQ.avS()) || (!this.hHc)) {
        break;
      }
      this.hJc.setVisibility(8);
      localLayoutParams.topMargin = 0;
      break;
      aAb();
      break label119;
      label214:
      localLayoutParams.leftMargin = this.mContext.getResources().getDimensionPixelSize(a.b.BiggerPadding);
    }
  }
  
  public final void setOnClickListener(View.OnClickListener paramOnClickListener)
  {
    super.setOnClickListener(paramOnClickListener);
    if (this.hJg != null) {
      this.hJg.setOnClickListener(paramOnClickListener);
    }
    if (this.hJl != null) {
      this.hJl.setOnClickListener(paramOnClickListener);
    }
  }
  
  public final void v(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (this.hJg != null)
    {
      pr localpr = this.htQ.awn().rnl;
      if ((localpr != null) && (!TextUtils.isEmpty(localpr.title)) && (localpr.roL != 0L) && (this.htQ.awi()))
      {
        this.hJg.setClickable(false);
        this.hJg.setVisibility(0);
        this.hJl.setVisibility(8);
      }
    }
    else
    {
      return;
    }
    if ((this.htQ.awn().rnk != null) && (!TextUtils.isEmpty(this.htQ.awn().rnk.title)) && (!TextUtils.isEmpty(this.htQ.awn().rnk.url)) && (this.htQ.awi()))
    {
      this.hJg.setVisibility(0);
      this.hJg.setEnabled(true);
      if ((!TextUtils.isEmpty(this.htQ.awn().code)) && (this.htQ.awn().rnc != 0))
      {
        this.hJl.setVisibility(0);
        return;
      }
      this.hJl.setVisibility(8);
      return;
    }
    if ((paramBoolean1) && (!TextUtils.isEmpty(this.htQ.awn().code)) && (this.htQ.awi()))
    {
      this.hJg.setVisibility(0);
      this.hJg.setEnabled(paramBoolean2);
      this.hJl.setVisibility(8);
      return;
    }
    if ((paramBoolean1) && (!this.htQ.awi()))
    {
      this.hJg.setVisibility(0);
      this.hJg.setEnabled(false);
      this.hJl.setVisibility(8);
      return;
    }
    this.hJg.setVisibility(8);
    this.hJl.setVisibility(8);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/widget/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */