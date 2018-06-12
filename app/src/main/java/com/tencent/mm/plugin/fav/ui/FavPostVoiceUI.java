package com.tencent.mm.plugin.fav.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.animation.AlphaAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.compatible.b.b.a;
import com.tencent.mm.e.b.j;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.c.vx;
import com.tencent.mm.protocal.c.wl;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.al.a;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMBaseActivity;
import com.tencent.mm.ui.y;
import java.util.LinkedList;

public class FavPostVoiceUI
  extends MMBaseActivity
{
  private static final int[] erx = { m.d.amp1, m.d.amp2, m.d.amp3, m.d.amp4, m.d.amp5, m.d.amp6, m.d.amp7 };
  private static final int[] hnd = { 0, 15, 30, 45, 60, 75, 90, 100 };
  private long duration;
  private final al erD = new al(new al.a()
  {
    public final boolean vD()
    {
      int j = 0;
      j localj = FavPostVoiceUI.a(FavPostVoiceUI.this);
      int i;
      if (localj.status == 1)
      {
        i = localj.bFv.getMaxAmplitude();
        if (i > j.bFx) {
          j.bFx = i;
        }
        i = i * 100 / j.bFx;
      }
      for (;;)
      {
        if (j < FavPostVoiceUI.Cn().length)
        {
          if ((i >= FavPostVoiceUI.aMr()[j]) && (i < FavPostVoiceUI.aMr()[(j + 1)])) {
            FavPostVoiceUI.b(FavPostVoiceUI.this).setBackgroundResource(FavPostVoiceUI.Cn()[j]);
          }
        }
        else
        {
          return true;
          i = 0;
          continue;
        }
        j += 1;
      }
    }
  }, true);
  private int hmW;
  private final ag hnB = new FavPostVoiceUI.6(this);
  private long hng = -1L;
  private Toast hnh;
  private ImageView hnl;
  private boolean hnt;
  private boolean hnu;
  private final al hnz = new al(new FavPostVoiceUI.7(this), true);
  private Button iZd;
  private long iZe;
  private View iZf;
  private View iZg;
  private View iZh;
  private View iZi;
  private TextView iZj;
  private View iZk;
  private j iZl;
  boolean iZm = false;
  private String path;
  
  private j aMm()
  {
    Object localObject = b.a.daM;
    localObject = new j();
    ((j)localObject).bFw = new FavPostVoiceUI.4(this);
    return (j)localObject;
  }
  
  private void aMn()
  {
    long l = 0L;
    if (!this.hnt) {
      return;
    }
    this.iZd.setKeepScreenOn(true);
    this.iZd.setBackgroundResource(m.d.record_shape_normal);
    this.iZd.setText(m.i.favorite_press_talk_to_fav);
    this.iZl.we();
    int i;
    label73:
    String str;
    if (this.iZe == 0L)
    {
      this.duration = l;
      if (this.duration >= 800L) {
        break label150;
      }
      i = 1;
      this.erD.SO();
      this.hnz.SO();
      if (i != 0) {
        break label281;
      }
      str = this.path;
      i = (int)this.duration;
      if (!bi.oW(str)) {
        break label155;
      }
      x.e("MicroMsg.FavPostLogic", "postVoice path null");
      label118:
      setResult(-1);
      finish();
      overridePendingTransition(0, 0);
    }
    for (;;)
    {
      this.hnt = false;
      return;
      l = bi.bI(this.iZe);
      break;
      label150:
      i = 0;
      break label73;
      label155:
      com.tencent.mm.plugin.fav.a.g localg = new com.tencent.mm.plugin.fav.a.g();
      localg.field_type = 3;
      localg.field_sourceType = 6;
      g.E(localg);
      vx localvx = new vx();
      localvx.UP(str);
      localvx.CE(i);
      localvx.kY(true);
      localvx.CF(localg.field_type);
      localvx.UL("amr");
      localg.field_favProto.rBI.add(localvx);
      b.B(localg);
      h.mEJ.h(10648, new Object[] { Integer.valueOf(1), Integer.valueOf(0) });
      break label118;
      label281:
      aMp();
      this.iZd.setEnabled(false);
      this.iZd.setBackgroundResource(m.d.record_shape_disable);
      this.iZg.setVisibility(0);
      this.iZf.setVisibility(8);
      this.hnB.sendEmptyMessageDelayed(0, 500L);
    }
  }
  
  private void aMp()
  {
    com.tencent.mm.vfs.b localb = new com.tencent.mm.vfs.b(this.path);
    if (localb.exists()) {
      localb.delete();
    }
  }
  
  private void aMq()
  {
    if (this.iZm) {
      return;
    }
    this.iZm = true;
    TranslateAnimation localTranslateAnimation = new TranslateAnimation(1, 0.0F, 1, 0.0F, 1, 0.0F, 1, 1.0F);
    localTranslateAnimation.setDuration(300L);
    AlphaAnimation localAlphaAnimation = new AlphaAnimation(1.0F, 0.0F);
    localAlphaAnimation.setDuration(300L);
    localTranslateAnimation.setAnimationListener(new FavPostVoiceUI.8(this));
    findViewById(m.e.voice_rcd_hint).setVisibility(8);
    findViewById(m.e.fav_post_voice_footer).setVisibility(8);
    this.iZk.setVisibility(8);
    this.iZk.startAnimation(localAlphaAnimation);
    findViewById(m.e.voice_rcd_hint).startAnimation(localAlphaAnimation);
    findViewById(m.e.fav_post_voice_footer).startAnimation(localTranslateAnimation);
  }
  
  public final void aMo()
  {
    this.iZf.setVisibility(0);
    this.iZg.setVisibility(8);
    this.iZi.setVisibility(8);
    this.iZh.setVisibility(0);
    this.iZj.setText(m.i.fav_press_talk_start_record);
    this.iZd.setBackgroundResource(m.d.record_shape_press);
    this.iZd.setText(m.i.favorite_press_talk_to_fav);
    this.hnl.setVisibility(4);
    this.hnt = false;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(y.gq(this).inflate(m.f.fav_post_voice, null));
    this.hnl = ((ImageView)findViewById(m.e.voice_rcd_hint_anim));
    this.iZh = findViewById(m.e.voice_rcd_hint_anim_area);
    this.iZi = findViewById(m.e.voice_rcd_hint_cancel_area);
    this.iZf = findViewById(m.e.voice_rcd_hint_rcding);
    this.iZg = findViewById(m.e.voice_rcd_hint_tooshort);
    this.iZj = ((TextView)findViewById(m.e.voice_rcd_hint_word));
    this.iZk = findViewById(m.e.voice_rcd_hint_bg);
    findViewById(m.e.voice_rcd_hint).setVisibility(8);
    this.iZk.setVisibility(8);
    findViewById(m.e.voice_rcd_hint).setOnTouchListener(new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        FavPostVoiceUI.c(FavPostVoiceUI.this);
        return false;
      }
    });
    findViewById(m.e.fav_post_voice_footer).setVisibility(8);
    this.iZl = aMm();
    this.iZd = ((Button)findViewById(m.e.fav_post_voice_btn));
    this.iZd.setOnTouchListener(new FavPostVoiceUI.5(this));
    aMo();
    paramBundle = com.tencent.mm.plugin.fav.a.b.aKX();
    Object localObject = new com.tencent.mm.vfs.b(paramBundle);
    if (!((com.tencent.mm.vfs.b)localObject).exists()) {
      ((com.tencent.mm.vfs.b)localObject).mkdirs();
    }
    do
    {
      localObject = paramBundle + "/" + System.currentTimeMillis();
    } while (new com.tencent.mm.vfs.b((String)localObject).exists());
    this.path = ((String)localObject);
    this.iZj.post(new FavPostVoiceUI.3(this));
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (4 == paramInt)
    {
      aMq();
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  protected void onPause()
  {
    super.onPause();
    aMn();
  }
  
  protected void onResume()
  {
    super.onResume();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/fav/ui/FavPostVoiceUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */