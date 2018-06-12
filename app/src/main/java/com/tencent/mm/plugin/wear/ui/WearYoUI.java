package com.tencent.mm.plugin.wear.ui;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.animation.AccelerateInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.R.a;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.ab.o;
import com.tencent.mm.model.au;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.wear.model.d.b;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.x;
import java.lang.reflect.Array;
import java.util.concurrent.atomic.AtomicInteger;

public class WearYoUI
  extends Activity
{
  private ImageView eCl;
  private TextView eTm;
  private Vibrator hni;
  private c oQk = new WearYoUI.5(this);
  private ImageView pKk;
  private ImageView pKl;
  private ImageView pKm;
  private ObjectAnimator[][] pKn = (ObjectAnimator[][])Array.newInstance(ObjectAnimator.class, new int[] { 3, 3 });
  private c pKo = new WearYoUI.2(this);
  private boolean pKp;
  private AtomicInteger pKq = new AtomicInteger();
  private Runnable pKr = new WearYoUI.3(this);
  private BroadcastReceiver pKs = new WearYoUI.4(this);
  private String username;
  
  private void a(int paramInt, ImageView paramImageView, long paramLong)
  {
    this.pKn[paramInt][0] = ObjectAnimator.ofFloat(paramImageView, "scaleX", new float[] { 1.0F, 2.5F });
    this.pKn[paramInt][0].setRepeatCount(-1);
    this.pKn[paramInt][0].setStartDelay(paramLong);
    this.pKn[paramInt][0].setDuration(3900L);
    this.pKn[paramInt][0].start();
    this.pKn[paramInt][1] = ObjectAnimator.ofFloat(paramImageView, "scaleY", new float[] { 1.0F, 2.5F });
    this.pKn[paramInt][1].setRepeatCount(-1);
    this.pKn[paramInt][1].setStartDelay(paramLong);
    this.pKn[paramInt][1].setDuration(3900L);
    this.pKn[paramInt][1].start();
    this.pKn[paramInt][2] = ObjectAnimator.ofFloat(paramImageView, "alpha", new float[] { 1.0F, 0.0F });
    this.pKn[paramInt][2].setRepeatCount(-1);
    this.pKn[paramInt][2].setInterpolator(new AccelerateInterpolator());
    this.pKn[paramInt][2].setStartDelay(paramLong);
    this.pKn[paramInt][2].setDuration(3900L);
    this.pKn[paramInt][2].start();
  }
  
  public void onClickCheck(View paramView)
  {
    x.i("MicroMsg.Wear.WearYoUI", "onClickCheck %s", new Object[] { this.username });
    paramView = new b(this.username);
    au.DF().a(paramView, 0);
    finish();
  }
  
  public void onClickNoCheck(View paramView)
  {
    x.i("MicroMsg.Wear.WearYoUI", "onClickNoCheck %s", new Object[] { this.username });
    finish();
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    getWindow().addFlags(4718592);
    setContentView(R.i.wear_yo_ui);
    this.hni = ((Vibrator)getSystemService("vibrator"));
    this.username = getIntent().getStringExtra("key_talker");
    this.eCl = ((ImageView)findViewById(R.h.avatar_iv));
    this.eTm = ((TextView)findViewById(R.h.nickname_tv));
    this.pKk = ((ImageView)findViewById(R.h.avatar_wave_1_iv));
    this.pKl = ((ImageView)findViewById(R.h.avatar_wave_2_iv));
    this.pKm = ((ImageView)findViewById(R.h.avatar_wave_3_iv));
    a.b.n(this.eCl, this.username);
    this.eTm.setText(r.gT(this.username));
    this.eCl.setOnClickListener(new WearYoUI.1(this));
    com.tencent.mm.sdk.b.a.sFg.b(this.pKo);
    com.tencent.mm.sdk.b.a.sFg.b(this.oQk);
    a(0, this.pKk, 0L);
    a(1, this.pKl, 1300L);
    a(2, this.pKm, 2600L);
    this.hni.vibrate(200L);
    registerReceiver(this.pKs, new IntentFilter("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
    overridePendingTransition(R.a.dialog_enter, R.a.dialog_exit);
  }
  
  protected void onDestroy()
  {
    int i = 0;
    while (i < this.pKn.length)
    {
      int j = 0;
      while (j < this.pKn[i].length)
      {
        this.pKn[i][j].cancel();
        j += 1;
      }
      i += 1;
    }
    unregisterReceiver(this.pKs);
    com.tencent.mm.sdk.b.a.sFg.c(this.oQk);
    com.tencent.mm.sdk.b.a.sFg.c(this.pKo);
    com.tencent.mm.plugin.wear.model.a.bSl().pIT.bSB();
    super.onDestroy();
  }
  
  private final class a
    implements Animator.AnimatorListener
  {
    private int fHo = 1;
    
    public a(int paramInt)
    {
      this.fHo = paramInt;
    }
    
    public final void onAnimationCancel(Animator paramAnimator)
    {
      WearYoUI.g(WearYoUI.this);
    }
    
    public final void onAnimationEnd(Animator paramAnimator)
    {
      if (this.fHo == 2)
      {
        x.v("MicroMsg.Wear.WearYoUI", "onAnimationEnd count: %d", new Object[] { Integer.valueOf(WearYoUI.e(WearYoUI.this).get()) });
        if (WearYoUI.e(WearYoUI.this).get() > 0)
        {
          WearYoUI.e(WearYoUI.this).decrementAndGet();
          ah.i(WearYoUI.f(WearYoUI.this), 1000L);
        }
      }
      while (this.fHo != 1)
      {
        return;
        WearYoUI.d(WearYoUI.this).animate().setListener(null);
        WearYoUI.g(WearYoUI.this);
        return;
      }
      WearYoUI.d(WearYoUI.this).animate().scaleX(1.0F);
      WearYoUI.d(WearYoUI.this).animate().scaleY(1.0F);
      WearYoUI.d(WearYoUI.this).animate().setDuration(100L);
      WearYoUI.d(WearYoUI.this).animate().start();
      WearYoUI.d(WearYoUI.this).animate().setListener(new a(WearYoUI.this, 2));
    }
    
    public final void onAnimationRepeat(Animator paramAnimator) {}
    
    public final void onAnimationStart(Animator paramAnimator) {}
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/wear/ui/WearYoUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */