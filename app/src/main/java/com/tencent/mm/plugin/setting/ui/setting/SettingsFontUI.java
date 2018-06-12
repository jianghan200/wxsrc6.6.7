package com.tencent.mm.plugin.setting.ui.setting;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.KeyEvent;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.g.a.gd;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.setting.a.d;
import com.tencent.mm.plugin.setting.a.f;
import com.tencent.mm.plugin.setting.a.g;
import com.tencent.mm.plugin.setting.a.i;
import com.tencent.mm.plugin.setting.ui.widget.FontSelectorView;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.e.i;
import com.tencent.mm.ui.s;

public class SettingsFontUI
  extends MMActivity
{
  private int mSd = 0;
  private int mSe = 2;
  private int mSf = com.tencent.mm.bp.a.fromDPToPix(ad.getContext(), a.d.chatting_normal_item_width);
  final float mSg = SetTextSizeUI.ec(this.mController.tml);
  
  private void ap(float paramFloat)
  {
    float f = this.mController.tml.getSharedPreferences(ad.chY(), 0).getFloat("current_text_size_scale_key", 1.0F);
    x.i("MicroMsg.SettingsFontUI", "fontSizeAfter=" + f);
    if (paramFloat != f)
    {
      Object localObject = new Intent();
      ((Intent)localObject).putExtra("Intro_Need_Clear_Top ", true);
      com.tencent.mm.plugin.setting.b.ezn.q((Intent)localObject, this.mController.tml);
      localObject = new gd();
      ((gd)localObject).bPn.bPo = paramFloat;
      ((gd)localObject).bPn.bPp = f;
      com.tencent.mm.sdk.b.a.sFg.m((com.tencent.mm.sdk.b.b)localObject);
      localObject = new Intent();
      ((Intent)localObject).setComponent(new ComponentName(e.i.thA, "com.tencent.mm.booter.MMReceivers$ToolsProcessReceiver"));
      ((Intent)localObject).putExtra("tools_process_action_code_key", "com.tencent.mm.intent.ACTION_KILL_TOOLS_PROCESS");
      ad.getContext().sendBroadcast((Intent)localObject);
    }
  }
  
  protected final int getLayoutId()
  {
    return a.g.settings_font_ui;
  }
  
  protected final void initView()
  {
    setMMTitle(a.i.settings_text_size);
    x.i("MicroMsg.SettingsFontUI", "fontSizeBefore=" + this.mSg);
    Object localObject = (ImageView)findViewById(a.f.chatting_avatar_iv_to);
    TextView localTextView1 = (TextView)findViewById(a.f.settings_font_msg_to);
    TextView localTextView2 = (TextView)findViewById(a.f.settings_font_illustrate_one);
    TextView localTextView3 = (TextView)findViewById(a.f.settings_font_illustrate_two);
    a.b.a((ImageView)localObject, q.GF());
    localObject = (FontSelectorView)findViewById(a.f.font_selector_view);
    float f2 = SetTextSizeUI.ec(this.mController.tml);
    float f1;
    if (f2 >= 0.875F)
    {
      f1 = f2;
      if (f2 <= 2.025F) {}
    }
    else
    {
      f1 = 1.0F;
    }
    int i;
    if (f1 == 0.875F) {
      i = 0;
    }
    for (;;)
    {
      ((FontSelectorView)localObject).setSliderIndex(i);
      ((FontSelectorView)localObject).setOnChangeListener(new SettingsFontUI.1(this, localTextView1, localTextView2, localTextView3));
      setBackBtn(new SettingsFontUI.2(this));
      return;
      if (f1 == 1.125F) {
        i = 2;
      } else if (f1 == 1.25F) {
        i = 3;
      } else if (f1 == 1.375F) {
        i = 4;
      } else if (f1 == 1.625F) {
        i = 5;
      } else if (f1 == 1.875F) {
        i = 6;
      } else if (f1 == 2.025F) {
        i = 7;
      } else {
        i = 1;
      }
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    initView();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramInt == 4) && (paramKeyEvent.getAction() == 0))
    {
      h.mEJ.h(11609, new Object[] { Integer.valueOf(this.mSd), Integer.valueOf(this.mSe), Integer.valueOf(0) });
      x.i("MicroMsg.SettingsFontUI", "choose font size kvReport logID:%d , changeFontSize: %d, curFontSize:%d", new Object[] { Integer.valueOf(11609), Integer.valueOf(this.mSd), Integer.valueOf(this.mSe) });
      finish();
      ap(this.mSg);
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/setting/ui/setting/SettingsFontUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */