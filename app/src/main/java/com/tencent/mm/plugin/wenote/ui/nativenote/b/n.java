package com.tencent.mm.plugin.wenote.ui.nativenote.b;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.wenote.model.a.b;
import com.tencent.mm.plugin.wenote.ui.nativenote.voiceview.NoteEditorVoiceBaseView;
import com.tencent.mm.plugin.wenote.ui.nativenote.voiceview.a.a;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bi;
import java.util.Iterator;
import java.util.List;

public final class n
  extends h
{
  private final ag qoF = new n.2(this);
  public LinearLayout qvT;
  public LinearLayout qvU;
  public NoteEditorVoiceBaseView qvV;
  public ImageView qvW;
  private TextView qvX;
  private TextView qvY;
  private com.tencent.mm.plugin.wenote.model.a.k qvZ;
  
  public n(View paramView, com.tencent.mm.plugin.wenote.model.nativenote.manager.k paramk)
  {
    super(paramView, paramk);
    this.qvT = ((LinearLayout)paramView.findViewById(R.h.note_voice_record_ll));
    this.qvU = ((LinearLayout)paramView.findViewById(R.h.note_voice_play_ll));
    this.qvW = ((ImageView)paramView.findViewById(R.h.note_voice_record_red_point));
    this.qvX = ((TextView)paramView.findViewById(R.h.note_voice_recording_tips));
    this.qvY = ((TextView)paramView.findViewById(R.h.note_voice_recording_tips_time));
    this.qvV = ((NoteEditorVoiceBaseView)paramView.findViewById(R.h.note_editor_voice_player));
    paramView = com.tencent.mm.plugin.wenote.ui.nativenote.voiceview.a.cbb();
    paramk = this.qvV;
    if (paramk != null)
    {
      Iterator localIterator = paramView.cWy.iterator();
      do
      {
        if (!localIterator.hasNext()) {
          break;
        }
      } while (paramk != (a.a)localIterator.next());
    }
    for (;;)
    {
      this.eRj.setVisibility(0);
      this.qvT.setVisibility(8);
      this.qvU.setVisibility(0);
      this.bOA.setVisibility(8);
      this.qvq.setVisibility(8);
      this.eRj.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          if ((n.a(n.this) != null) && (n.a(n.this).qoV.booleanValue())) {
            n.a(n.this).qoW = Boolean.valueOf(true);
          }
        }
      });
      return;
      paramView.cWy.add(paramk);
    }
  }
  
  public final void a(b paramb, int paramInt1, int paramInt2)
  {
    this.qvZ = ((com.tencent.mm.plugin.wenote.model.a.k)paramb);
    Object localObject1;
    Object localObject2;
    if (this.qvZ.qpd)
    {
      this.qvU.setVisibility(0);
      this.qvT.setVisibility(8);
      this.eRj.setPadding(0, 0, 0, 0);
      if (paramb.qoO)
      {
        this.qvV.setBackgroundResource(R.g.wenote_basecard_pressed_bg);
        localObject1 = this.qvV;
        localObject2 = this.qvZ.bVd;
        int i = this.qvZ.bOS;
        String str = this.qvZ.qps;
        ((NoteEditorVoiceBaseView)localObject1).path = bi.aG((String)localObject2, "");
        ((NoteEditorVoiceBaseView)localObject1).bOS = i;
        ((NoteEditorVoiceBaseView)localObject1).setText(str);
      }
    }
    for (;;)
    {
      super.a(paramb, paramInt1, paramInt2);
      return;
      this.qvV.setBackgroundResource(R.g.wenote_basecard_bg);
      break;
      this.eRj.setPadding(26, 7, 0, 7);
      this.qvU.setVisibility(8);
      this.qvT.setVisibility(0);
      localObject1 = this.qvW;
      if (((ImageView)localObject1).getAnimation() != null) {
        ((ImageView)localObject1).startAnimation(((ImageView)localObject1).getAnimation());
      }
      for (;;)
      {
        if (!this.qvZ.qoV.booleanValue()) {
          break label332;
        }
        this.qoF.sendEmptyMessage(4096);
        this.qvX.setText(R.l.favorite_wenote_voice_recording);
        localObject1 = " " + com.tencent.mm.bb.a.v(ad.getContext(), this.qvZ.qpr).toString();
        this.qvY.setText((CharSequence)localObject1);
        break;
        localObject2 = new AlphaAnimation(1.0F, 0.0F);
        ((Animation)localObject2).setDuration(500L);
        ((Animation)localObject2).setInterpolator(new LinearInterpolator());
        ((Animation)localObject2).setRepeatCount(-1);
        ((Animation)localObject2).setRepeatMode(2);
        ((ImageView)localObject1).startAnimation((Animation)localObject2);
      }
      label332:
      this.qvX.setText(R.l.favorite_wenote_voice_downloading);
      localObject1 = " " + com.tencent.mm.bb.a.v(ad.getContext(), (int)com.tencent.mm.bb.a.bD(this.qvZ.bOT)).toString();
      this.qvY.setText((CharSequence)localObject1);
    }
  }
  
  public final int caZ()
  {
    return 4;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/wenote/ui/nativenote/b/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */