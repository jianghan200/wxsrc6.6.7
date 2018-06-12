package com.tencent.mm.plugin.card.ui.view;

import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.plugin.card.a.a;
import com.tencent.mm.plugin.card.a.d;
import com.tencent.mm.plugin.card.a.e;
import com.tencent.mm.plugin.card.a.g;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.plugin.card.d.c;
import com.tencent.mm.plugin.card.model.am;
import com.tencent.mm.plugin.card.model.k;
import com.tencent.mm.protocal.c.kx;
import com.tencent.mm.protocal.c.lf;
import com.tencent.mm.protocal.c.pr;
import com.tencent.mm.protocal.c.sw;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;

public final class n
  extends h
{
  public n(g paramg, MMActivity paramMMActivity)
  {
    super(paramg, paramMMActivity);
  }
  
  private void a(Button paramButton, b paramb)
  {
    paramb = paramb.awm().dxh;
    if (!bi.oW(paramb))
    {
      int i = com.tencent.mm.plugin.card.d.l.xV(paramb);
      paramButton.setText(this.gKS.getResources().getString(a.g.card_code_hint_agree));
      paramButton.setTextColor(i);
      paramb = new GradientDrawable();
      paramb.setColor(this.gKS.getResources().getColor(a.a.card_code_default_color));
      paramb.setStroke(2, i);
      paramb.setCornerRadius(8.0F);
      paramButton.setBackground(paramb);
    }
  }
  
  public final void a(ViewGroup paramViewGroup, b paramb)
  {
    am.axy().awD();
    paramViewGroup.findViewById(a.d.code_qr_disable_layout).setVisibility(0);
    paramViewGroup.findViewById(a.d.code_qr_area).setVisibility(8);
    pr localpr = paramb.awn().rnq;
    if (localpr != null)
    {
      paramViewGroup.findViewById(a.d.code_shade_layout).setVisibility(0);
      if (!bi.oW(localpr.title))
      {
        Button localButton = (Button)paramViewGroup.findViewById(a.d.code_button);
        localButton.setText(localpr.title);
        localButton.setVisibility(0);
        a(localButton, paramb);
        localButton.setOnClickListener(new n.2(this, localpr, paramb));
        if (!bi.oW(localpr.huX)) {
          ((TextView)paramViewGroup.findViewById(a.d.code_first_title)).setText(localpr.huX);
        }
        paramViewGroup = (TextView)paramViewGroup.findViewById(a.d.code_second_title);
        if (bi.oW(localpr.huY)) {
          break label175;
        }
        paramViewGroup.setText(localpr.huY);
        paramViewGroup.setVisibility(0);
      }
    }
    return;
    label175:
    paramViewGroup.setVisibility(8);
  }
  
  public final boolean azJ()
  {
    return false;
  }
  
  public final boolean azK()
  {
    return true;
  }
  
  public final void b(ViewGroup paramViewGroup, b paramb)
  {
    x.i("MicroMsg.CardDynamicQrCodeController", "onScreenShot! ");
    View localView1 = paramViewGroup.findViewById(a.d.code_qr_disable_layout);
    if (localView1.getVisibility() == 0)
    {
      x.e("MicroMsg.CardDynamicQrCodeController", "code_qr_disable_layout is visible! do not show hint!");
      return;
    }
    localView1.setVisibility(0);
    Object localObject = paramViewGroup.findViewById(a.d.code_refresh_layout);
    if (((View)localObject).getVisibility() == 0) {
      ((View)localObject).setVisibility(8);
    }
    localObject = (ImageView)paramViewGroup.findViewById(a.d.code_qr_area);
    ((ImageView)localObject).setVisibility(8);
    View localView2 = paramViewGroup.findViewById(a.d.code_shade_layout);
    localView2.setVisibility(0);
    ((TextView)paramViewGroup.findViewById(a.d.code_first_title)).setText(this.gKS.getResources().getString(a.g.card_code_hint));
    Button localButton = (Button)paramViewGroup.findViewById(a.d.code_button);
    localButton.setVisibility(0);
    a(localButton, paramb);
    com.tencent.mm.plugin.card.b.g localg = am.axy();
    if (paramb == null) {
      x.e("MicroMsg.CardDynamicQrcodeOfflineMgr", "doScreenshotReport do nothing return !cardInfo is null!");
    }
    for (;;)
    {
      localButton.setOnClickListener(new n.3(this, localView1, localView2, (ImageView)localObject, localButton, paramViewGroup, paramb));
      return;
      localg.awD();
      k localk = am.axw().xq(paramb.awq());
      if (localk != null)
      {
        x.i("MicroMsg.CardDynamicQrcodeOfflineMgr", "doScreenshotReport currentCode cardId =%s,codeId=%s", new Object[] { localk.field_card_id, localk.field_code_id });
        if (am.axw().ca(paramb.awq(), localk.field_code_id)) {
          localg.a(paramb.awq(), localk.field_code_id, c.hIy);
        } else {
          x.e("MicroMsg.CardDynamicQrcodeOfflineMgr", "doScreenshotReport delete failue! do not report! cardId =%s,codeId=%s", new Object[] { localk.field_card_id, localk.field_code_id });
        }
      }
      else
      {
        x.e("MicroMsg.CardDynamicQrcodeOfflineMgr", "doScreenshotReport  failue! currentCode is null!");
      }
    }
  }
  
  public final void c(ViewGroup paramViewGroup, b paramb)
  {
    super.c(paramViewGroup, paramb);
    d(paramViewGroup, paramb);
  }
  
  final void d(ViewGroup paramViewGroup, b paramb)
  {
    paramb = paramb.awm().rol;
    View localView = paramViewGroup.findViewById(a.d.code_refresh_layout);
    if ((paramb != null) && (paramb.rwd))
    {
      localView.setVisibility(0);
      if (!bi.oW(paramb.rwe))
      {
        ((TextView)paramViewGroup.findViewById(a.d.code_refresh_tv)).setText(paramb.rwe);
        ((ImageView)paramViewGroup.findViewById(a.d.code_refresh_icon)).setOnClickListener(new n.1(this, paramViewGroup));
      }
      return;
    }
    localView.setVisibility(8);
  }
  
  public final void g(ViewGroup paramViewGroup)
  {
    paramViewGroup.findViewById(a.d.code_qr_disable_layout).setVisibility(8);
    paramViewGroup.findViewById(a.d.code_qr_area).setVisibility(0);
  }
  
  public final int getLayoutId()
  {
    return a.e.card_code_dynamic_qrcode;
  }
  
  public final boolean i(b paramb)
  {
    if (!paramb.awn().rnr)
    {
      x.e("MicroMsg.CardDynamicQrCodeController", "isCanGetAndShowCode false : is_commom_card false!ban card show!");
      return false;
    }
    paramb = paramb.awn().rnq;
    if ((paramb != null) && (!bi.oW(paramb.title)))
    {
      x.e("MicroMsg.CardDynamicQrCodeController", "isCanGetAndShowCode false : unavailable_qrcode_field is not null  !ban card show!");
      return false;
    }
    return true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/card/ui/view/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */