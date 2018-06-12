package com.tencent.mm.plugin.game.gamewebview.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.mm.R.e;
import com.tencent.mm.R.f;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.widget.a.c;
import com.tencent.mm.ui.y;

public final class e
  extends LinearLayout
{
  ImageView hBu;
  TextView iDE;
  b jKc;
  ImageView jKd;
  public i jKe;
  private a jKf;
  public c jKg = null;
  private Context mContext;
  
  public e(b paramb)
  {
    super(paramb.getContext());
    this.mContext = paramb.getContext();
    this.jKc = paramb;
    this.jKe = new g(paramb);
    setLayoutParams(new LinearLayout.LayoutParams(-1, getActionBarHeight()));
    setBackgroundResource(R.e.action_bar_color);
    paramb = y.gq(getContext()).inflate(R.i.game_webview_action_bar, this, false);
    addView(paramb);
    this.hBu = ((ImageView)paramb.findViewById(R.h.actionbar_back));
    this.hBu.setOnClickListener(new e.1(this));
    this.iDE = ((TextView)paramb.findViewById(R.h.title));
    this.jKd = ((ImageView)paramb.findViewById(R.h.actionbar_option_btn));
    this.jKd.setOnClickListener(new e.2(this));
  }
  
  private int getActionBarHeight()
  {
    DisplayMetrics localDisplayMetrics = this.mContext.getResources().getDisplayMetrics();
    if (localDisplayMetrics.widthPixels > localDisplayMetrics.heightPixels) {
      return this.mContext.getResources().getDimensionPixelSize(R.f.DefaultActionbarHeightLand);
    }
    return this.mContext.getResources().getDimensionPixelSize(R.f.DefaultActionbarHeightPort);
  }
  
  public final boolean aST()
  {
    if (this.jKf != null)
    {
      Object localObject1 = this.jKf;
      if ((((a)localObject1).jIv) && (!bi.oW(((a)localObject1).aSC())) && (!bi.oW(((a)localObject1).aSD())) && (!bi.oW(((a)localObject1).aSE()))) {}
      for (int i = 1; i != 0; i = 0)
      {
        Object localObject2 = this.jKf.aSC();
        localObject1 = this.jKf.aSD();
        String str = this.jKf.aSE();
        x.i("MicroMsg.GameWebViewActionBar", "use js api close window confirm info : %s, %s, %s", new Object[] { localObject2, localObject1, str });
        View localView = View.inflate(getContext(), R.i.mm_alert_checkbox, null);
        Object localObject3 = (CheckBox)localView.findViewById(R.h.mm_alert_dialog_cb);
        ((CheckBox)localObject3).setChecked(false);
        ((CheckBox)localObject3).setVisibility(8);
        localObject3 = (TextView)localView.findViewById(R.h.mm_alert_dialog_info);
        ((TextView)localObject3).setText((CharSequence)localObject2);
        ((TextView)localObject3).setTextColor(getResources().getColor(R.e.normal_text_color));
        localObject2 = (TextView)localView.findViewById(R.h.mm_alert_dialog_cb_txt);
        ((TextView)localObject2).setTextColor(getResources().getColor(R.e.normal_text_color));
        ((TextView)localObject2).setVisibility(8);
        this.jKg = h.a(getContext(), true, "", localView, (String)localObject1, str, new e.3(this), new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            e.b(e.this);
          }
        });
        return true;
      }
    }
    return false;
  }
  
  public final void aTe()
  {
    if (this.jKe != null) {
      this.jKe.aTe();
    }
  }
  
  public final void setCloseWindowConfirmInfo(Bundle paramBundle)
  {
    if (paramBundle == null) {}
    for (paramBundle = null;; paramBundle = new a(paramBundle))
    {
      this.jKf = paramBundle;
      return;
    }
  }
  
  public final void setTitleColor(int paramInt)
  {
    this.iDE.setTextColor(paramInt);
  }
  
  public final void setTitleText(String paramString)
  {
    this.iDE.setText(paramString);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/ui/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */