package com.tencent.mm.plugin.sns.lucky.ui;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.k;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.sdk.platformtools.x;

public final class a
{
  public static Dialog e(Context paramContext, final View paramView)
  {
    View localView = LayoutInflater.from(paramContext).inflate(i.g.lucky_comment_dialog, null);
    Object localObject;
    if (w.chM()) {
      localObject = "font_1.otf";
    }
    for (;;)
    {
      TextView localTextView = (TextView)localView.findViewById(i.f.lucky_money_title_tv);
      if (!bi.oW((String)localObject)) {
        localTextView.setTypeface(Typeface.createFromAsset(paramContext.getAssets(), (String)localObject));
      }
      if (!w.chL()) {
        localTextView.setTextSize(1, 10.0F);
      }
      localObject = new Dialog(paramContext, i.k.mmalertdialog);
      ((Dialog)localObject).setContentView(localView);
      ((Dialog)localObject).setTitle(null);
      ((Dialog)localObject).setOnCancelListener(new a.1((Dialog)localObject));
      ((TextView)localView.findViewById(i.f.go_shake_lucky_btn)).setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          x.i("MicroMsg.SnsLuckyCommentAlertUI", "showTipsDialog onClick");
          if ((this.nmd != null) && (this.nmd.isShowing())) {
            this.nmd.dismiss();
          }
          paramAnonymousView = paramView;
          if (paramAnonymousView != null) {
            paramAnonymousView.performClick();
          }
        }
      });
      paramView = localView.findViewById(i.f.tips_dialog_close_btn);
      int i = BackwardSupportUtil.b.b(paramContext, 10.0F);
      bi.j(paramView, i, i, i, i);
      paramView.setOnClickListener(new a.3((Dialog)localObject));
      ((Dialog)localObject).show();
      return (Dialog)localObject;
      if (w.chN()) {
        localObject = "font_2.otf";
      } else {
        localObject = null;
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/sns/lucky/ui/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */