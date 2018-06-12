package com.tencent.mm.plugin.emoji.ui.v2;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Message;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.widget.ImageView.ScaleType;
import android.widget.TextView;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.a.e;
import com.tencent.mm.ak.a.a;
import com.tencent.mm.ak.o;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.plugin.emoji.e.f;
import com.tencent.mm.plugin.emoji.model.EmojiLogic;
import com.tencent.mm.plugin.emoji.ui.widget.MMCopiableTextView;
import com.tencent.mm.protocal.c.adj;
import com.tencent.mm.protocal.c.tr;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.ui.MMActivity;

public class EmojiStoreV2RewardThanksUI
  extends MMActivity
{
  private String iil;
  private adj imA;
  private EmojiStoreV2RewardBannerView iqf;
  private View iqg;
  private MMCopiableTextView iqh;
  private TextView iqi;
  private TextView iqj;
  private AnimationDrawable iqk;
  private ag mHandler = new EmojiStoreV2RewardThanksUI.1(this);
  
  protected final int getForceOrientation()
  {
    return 1;
  }
  
  protected final int getLayoutId()
  {
    return R.i.emoji_store_v2_reward_thanks_ui;
  }
  
  protected final void initView()
  {
    setMMTitle(R.l.emoji_store_reward_thanks);
    setBackBtn(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        EmojiStoreV2RewardThanksUI.this.finish();
        return false;
      }
    });
    this.iqf = ((EmojiStoreV2RewardBannerView)findViewById(R.h.thanks_pic));
    this.iqf.setScale(1.0F);
    this.iqg = findViewById(R.h.magic_word_container);
    this.iqh = ((MMCopiableTextView)findViewById(R.h.magic_word_tip));
    this.iqi = ((TextView)findViewById(R.h.magic_expire));
    this.iqj = ((TextView)findViewById(R.h.magic_word_info));
    this.iqk = ((AnimationDrawable)getResources().getDrawable(R.g.emoji_doge_loading));
  }
  
  public void onCreate(final Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.iil = getIntent().getStringExtra("extra_id");
    initView();
    this.imA = com.tencent.mm.plugin.emoji.model.i.aEA().igC.ZF(this.iil);
    final String str;
    if (this.imA != null) {
      if ((this.imA.rHP != null) && (!bi.oW(this.imA.rHP.rxr)))
      {
        paramBundle = this.imA.rHP.rxs;
        au.HU();
        str = EmojiLogic.K(c.Gg(), this.iil, paramBundle);
        if (e.cn(str))
        {
          this.iqf.setImageFilePath(str);
          this.iqf.setScaleType(ImageView.ScaleType.FIT_XY);
          if ((this.iqk != null) && (this.iqk.isRunning())) {
            this.iqk.stop();
          }
        }
      }
    }
    while ((this.imA != null) && (this.imA.rHP != null))
    {
      this.iqg.setVisibility(0);
      bi.oW(this.imA.rHP.rxu);
      this.iqh.setVisibility(0);
      this.iqh.setText(R.l.emoji_store_reward_thanks_msg);
      this.iqi.setVisibility(8);
      this.iqj.setVisibility(8);
      return;
      o.Pj().a(paramBundle, this.iqf, f.h(this.iil, paramBundle, new Object[0]), new com.tencent.mm.ak.a.c.i()
      {
        public final void a(String paramAnonymousString, Bitmap paramAnonymousBitmap, Object... paramAnonymousVarArgs)
        {
          if ((!bi.oW(paramAnonymousString)) && (paramAnonymousString.equalsIgnoreCase(paramBundle)))
          {
            paramAnonymousString = new Message();
            paramAnonymousString.what = 1001;
            paramAnonymousString.obj = str;
            EmojiStoreV2RewardThanksUI.c(EmojiStoreV2RewardThanksUI.this).sendMessage(paramAnonymousString);
          }
        }
      });
      this.iqf.setBackgroundDrawable(getResources().getDrawable(R.g.emotion_reward_banner_bg_color));
      this.iqf.setImageDrawable(this.iqk);
      this.iqf.setScaleType(ImageView.ScaleType.CENTER);
      this.iqk.start();
      continue;
      this.iqf.setBackgroundDrawable(getResources().getDrawable(R.g.emotion_reward_banner_bg_color));
      this.iqf.setImageDrawable(this.iqk);
      this.iqf.setScaleType(ImageView.ScaleType.CENTER);
      this.iqk.start();
      continue;
      this.iqf.setBackgroundDrawable(getResources().getDrawable(R.g.emotion_reward_banner_bg_color));
      this.iqf.setImageDrawable(this.iqk);
      this.iqf.setScaleType(ImageView.ScaleType.CENTER);
      this.iqk.start();
    }
    this.iqg.setVisibility(8);
  }
  
  protected void onDestroy()
  {
    if ((this.iqk != null) && (this.iqk.isRunning())) {
      this.iqk.stop();
    }
    super.onDestroy();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2RewardThanksUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */