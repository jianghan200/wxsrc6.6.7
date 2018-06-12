package com.tencent.mm.plugin.record.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.animation.AlphaAnimation;
import android.widget.TextView;
import com.tencent.mm.R.k;
import com.tencent.mm.plugin.record.b.m;
import com.tencent.mm.plugin.record.b.m.a;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Iterator;
import java.util.List;

public class RecordVoiceBaseView
  extends TextView
  implements m.a
{
  public int bOS;
  private boolean bgH = false;
  private Context context;
  public int duration = -1;
  private AlphaAnimation mtq;
  private AnimationDrawable mtr;
  private m mts;
  public String path = "";
  
  public RecordVoiceBaseView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.context = paramContext;
    bqM();
  }
  
  public RecordVoiceBaseView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.context = paramContext;
    bqM();
  }
  
  private void bqM()
  {
    this.mtq = new AlphaAnimation(0.1F, 1.0F);
    this.mtq.setDuration(1000L);
    this.mtq.setRepeatCount(-1);
    this.mtq.setRepeatMode(2);
    this.mtr = new AnimationDrawable();
    Drawable localDrawable = getResources().getDrawable(R.k.chatfrom_voice_playing_f1);
    localDrawable.setBounds(0, 0, localDrawable.getIntrinsicWidth(), localDrawable.getIntrinsicHeight());
    this.mtr.addFrame(localDrawable, 300);
    localDrawable = getResources().getDrawable(R.k.chatfrom_voice_playing_f2);
    localDrawable.setBounds(0, 0, localDrawable.getIntrinsicWidth(), localDrawable.getIntrinsicHeight());
    this.mtr.addFrame(localDrawable, 300);
    localDrawable = getResources().getDrawable(R.k.chatfrom_voice_playing_f3);
    localDrawable.setBounds(0, 0, localDrawable.getIntrinsicWidth(), localDrawable.getIntrinsicHeight());
    this.mtr.addFrame(localDrawable, 300);
    this.mtr.setOneShot(false);
    this.mtr.setVisible(true, true);
  }
  
  private void bqN()
  {
    if ((this.mtq != null) && (this.mtq.isInitialized())) {
      setAnimation(null);
    }
    this.bgH = false;
    setCompoundDrawablesWithIntrinsicBounds(getResources().getDrawable(R.k.chatfrom_voice_playing), null, null, null);
    this.mtr.stop();
  }
  
  public final void Kt(String paramString)
  {
    x.d("MicroMsg.RecordVoiceBaseView", "on play, my path %s, my duration %d, play path %s", new Object[] { this.path, Integer.valueOf(this.duration), paramString });
    if (!bi.aG(paramString, "").equals(this.path)) {
      bqN();
    }
  }
  
  public final void onFinish()
  {
    stopPlay();
  }
  
  protected void onFinishInflate()
  {
    super.onFinishInflate();
    setOnClickListener(new RecordVoiceBaseView.1(this));
  }
  
  public void setVoiceHelper(m paramm)
  {
    this.mts = paramm;
    paramm = this.mts;
    Iterator localIterator = paramm.cWy.iterator();
    while (localIterator.hasNext()) {
      if (this == (m.a)localIterator.next()) {
        return;
      }
    }
    paramm.cWy.add(this);
  }
  
  public final void stopPlay()
  {
    x.d("MicroMsg.RecordVoiceBaseView", "stop play");
    bqN();
    this.mts.stopPlay();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/record/ui/RecordVoiceBaseView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */