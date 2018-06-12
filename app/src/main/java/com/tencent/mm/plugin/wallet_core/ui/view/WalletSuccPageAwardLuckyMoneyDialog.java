package com.tencent.mm.plugin.wallet_core.ui.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.OvershootInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.a;
import d.a.a.e;
import java.io.IOException;

@a(3)
public class WalletSuccPageAwardLuckyMoneyDialog
  extends MMActivity
{
  private ViewGroup pAx;
  private ImageView pAy;
  private e pAz;
  
  protected final int getForceOrientation()
  {
    return 1;
  }
  
  protected final int getLayoutId()
  {
    return a.g.wallet_succ_page_award_lucky_money_dialog;
  }
  
  public void onCreate(final Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (getSupportActionBar() != null) {
      getSupportActionBar().hide();
    }
    if (d.fR(19)) {
      getWindow().setFlags(67108864, 67108864);
    }
    paramBundle = getIntent().getByteArrayExtra("key_layer_info");
    if (paramBundle == null)
    {
      x.e("MicroMsg.WalletSuccPageAwardLuckyMoneyDialog", "WalletSuccPageAwardLuckyMoneyDialog onCreate error! cannot get layerInfoBytes!");
      finish();
    }
    this.pAz = new e();
    try
    {
      this.pAz.aG(paramBundle);
      this.pAx = ((ViewGroup)findViewById(a.f.content_layout));
      this.pAy = ((ImageView)findViewById(a.f.close_btn));
      this.pAy.setOnClickListener(new WalletSuccPageAwardLuckyMoneyDialog.1(this));
      paramBundle = this.pAx;
      WalletSuccPageAwardLuckyMoneyDialog.2 local2 = new WalletSuccPageAwardLuckyMoneyDialog.2(this);
      ScaleAnimation localScaleAnimation1 = new ScaleAnimation(0.0F, 0.96F, 0.0F, 0.96F, 1, 0.5F, 1, 0.5F);
      localScaleAnimation1.setDuration(300L);
      localScaleAnimation1.setInterpolator(new OvershootInterpolator());
      localScaleAnimation1.setFillAfter(true);
      final ScaleAnimation localScaleAnimation2 = new ScaleAnimation(0.96F, 1.0F, 0.96F, 1.0F, 1, 0.5F, 1, 0.5F);
      localScaleAnimation2.setDuration(100L);
      localScaleAnimation2.setFillAfter(true);
      localScaleAnimation1.setAnimationListener(new Animation.AnimationListener()
      {
        public final void onAnimationEnd(Animation paramAnonymousAnimation)
        {
          paramBundle.startAnimation(localScaleAnimation2);
        }
        
        public final void onAnimationRepeat(Animation paramAnonymousAnimation) {}
        
        public final void onAnimationStart(Animation paramAnonymousAnimation) {}
      });
      localScaleAnimation2.setAnimationListener(local2);
      if (paramBundle != null) {
        paramBundle.startAnimation(localScaleAnimation1);
      }
      return;
    }
    catch (IOException paramBundle)
    {
      for (;;)
      {
        x.printErrStackTrace("MicroMsg.WalletSuccPageAwardLuckyMoneyDialog", paramBundle, "parse layer info byte error! %s", new Object[] { paramBundle.getMessage() });
        finish();
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/ui/view/WalletSuccPageAwardLuckyMoneyDialog.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */