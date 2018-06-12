package com.tencent.mm.plugin.wenote.ui.nativenote.voiceview;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.AlphaAnimation;
import android.widget.TextView;
import com.tencent.mm.R.k;
import com.tencent.mm.compatible.util.f;
import com.tencent.mm.plugin.wenote.model.k;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.base.s;

public class NoteEditorVoiceBaseView
  extends TextView
  implements a.a
{
  public int bOS;
  private boolean bgH = false;
  private Context context;
  private int duration = -1;
  private AlphaAnimation mtq;
  private AnimationDrawable mtr;
  public String path = "";
  
  public NoteEditorVoiceBaseView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.context = paramContext;
    bqM();
  }
  
  public NoteEditorVoiceBaseView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
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
  
  public final void Sw(String paramString)
  {
    x.d("MicroMsg.NoteEditorVoiceBaseView", "on play, my path %s, my duration %d, play path %s", new Object[] { this.path, Integer.valueOf(this.duration), paramString });
    if (!bi.aG(paramString, "").equals(this.path)) {
      bqN();
    }
  }
  
  public final void bqN()
  {
    if ((this.mtq != null) && (this.mtq.isInitialized())) {
      setAnimation(null);
    }
    this.bgH = false;
    setCompoundDrawablesWithIntrinsicBounds(getResources().getDrawable(R.k.chatfrom_voice_playing), null, null, null);
    this.mtr.stop();
  }
  
  public final void cba()
  {
    bqN();
  }
  
  protected void onFinishInflate()
  {
    super.onFinishInflate();
    setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        String str2 = NoteEditorVoiceBaseView.a(NoteEditorVoiceBaseView.this);
        String str1;
        if (a.cbb().aLq())
        {
          str1 = "true";
          x.i("MicroMsg.NoteEditorVoiceBaseView", "clicked path:%s, player isPlay:%s, path:%s", new Object[] { str2, str1, a.cbb().path });
          if ((!com.tencent.mm.p.a.by(NoteEditorVoiceBaseView.b(NoteEditorVoiceBaseView.this))) && (!com.tencent.mm.p.a.bw(NoteEditorVoiceBaseView.b(NoteEditorVoiceBaseView.this)))) {
            break label81;
          }
        }
        label81:
        do
        {
          return;
          str1 = "false";
          break;
          if ((!f.zZ()) && (!bi.oW(NoteEditorVoiceBaseView.a(NoteEditorVoiceBaseView.this))))
          {
            s.gH(paramAnonymousView.getContext());
            return;
          }
        } while (k.bZe().hnt);
        if ((bi.aG(NoteEditorVoiceBaseView.a(NoteEditorVoiceBaseView.this), "").equals(a.cbb().path)) && (a.cbb().aLq()))
        {
          paramAnonymousView = NoteEditorVoiceBaseView.this;
          x.d("MicroMsg.NoteEditorVoiceBaseView", "stop play");
          paramAnonymousView.bqN();
          a.cbb().stopPlay();
          return;
        }
        NoteEditorVoiceBaseView.c(NoteEditorVoiceBaseView.this);
      }
    });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/wenote/ui/nativenote/voiceview/NoteEditorVoiceBaseView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */