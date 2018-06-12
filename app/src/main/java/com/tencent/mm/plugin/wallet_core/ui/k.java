package com.tencent.mm.plugin.wallet_core.ui;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.plugin.wxpay.a.c;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.j;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.bi;
import java.util.Iterator;
import java.util.List;

public final class k
{
  public static Dialog a(Context paramContext, String paramString1, String paramString2, List<String> paramList, String paramString3, int paramInt, String paramString4, String paramString5, String paramString6, String paramString7)
  {
    View localView = LayoutInflater.from(paramContext).inflate(a.g.wallet_id_card_tip, null);
    ImageView localImageView = (ImageView)localView.findViewById(a.f.close_icon);
    int i = BackwardSupportUtil.b.b(paramContext, 15.0F);
    bi.j(localImageView, i, i, i, i);
    TextView localTextView2 = (TextView)localView.findViewById(a.f.main_title);
    TextView localTextView3 = (TextView)localView.findViewById(a.f.main_tip);
    LinearLayout localLinearLayout = (LinearLayout)localView.findViewById(a.f.main_tip_wording);
    Button localButton = (Button)localView.findViewById(a.f.upload_btn);
    TextView localTextView1 = (TextView)localView.findViewById(a.f.main_protocol_wording);
    localTextView2.setText(paramString1);
    localTextView3.setText(paramString2);
    localLinearLayout.removeAllViews();
    paramString1 = paramList.iterator();
    while (paramString1.hasNext())
    {
      paramString2 = (String)paramString1.next();
      paramList = LayoutInflater.from(paramContext).inflate(a.g.wallet_id_card_wordingtip, null);
      ((TextView)paramList.findViewById(a.f.wording_tip)).setText(paramString2);
      localLinearLayout.addView(paramList);
    }
    localButton.setText(paramString3);
    if (paramInt > 0)
    {
      paramInt = paramString4.length();
      i = (paramString4 + paramString5).length();
      paramString1 = new SpannableString(paramString4 + paramString5);
      paramString1.setSpan(new ForegroundColorSpan(paramContext.getResources().getColor(a.c.wallet_offline_link_color)), paramInt, i, 33);
      localTextView1.setText(paramString1);
    }
    for (;;)
    {
      localTextView1.setOnClickListener(new k.1(paramString6, paramContext));
      paramString1 = new Dialog(paramContext, a.j.mmalertdialog);
      paramString1.setContentView(localView);
      paramString1.setTitle(null);
      paramString1.setOnCancelListener(new k.3(paramString1));
      localImageView.setOnClickListener(new k.4(paramString1));
      localButton.setOnClickListener(new k.5(paramString7, paramContext, paramString1));
      paramString1.show();
      return paramString1;
      localTextView1.setText("");
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/ui/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */