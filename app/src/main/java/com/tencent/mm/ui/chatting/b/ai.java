package com.tencent.mm.ui.chatting.b;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.mm.R.a;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.model.au;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pluginsdk.ui.chat.ChatFooter;
import com.tencent.mm.pluginsdk.ui.chat.ChatFooter.b;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.chatting.b.b.m;

public class ai
  extends a
  implements u
{
  private boolean tSA;
  private boolean tSB;
  private final long tSC = 259200000L;
  private ChatFooter.b tSD = new ChatFooter.b()
  {
    public final void a(Boolean paramAnonymousBoolean1, Boolean paramAnonymousBoolean2)
    {
      if (paramAnonymousBoolean1.booleanValue())
      {
        if (paramAnonymousBoolean2.booleanValue()) {
          ai.a(ai.this, Boolean.valueOf(true), Boolean.valueOf(true));
        }
      }
      else {
        return;
      }
      ai.a(ai.this, Boolean.valueOf(false), Boolean.valueOf(true));
    }
    
    public final void b(Boolean paramAnonymousBoolean1, Boolean paramAnonymousBoolean2)
    {
      if (paramAnonymousBoolean1.booleanValue())
      {
        if (paramAnonymousBoolean2.booleanValue()) {
          ai.a(ai.this, Boolean.valueOf(true), Boolean.valueOf(false));
        }
      }
      else {
        return;
      }
      ai.a(ai.this, Boolean.valueOf(false), Boolean.valueOf(false));
    }
  };
  private View tSy;
  private ViewGroup tSz;
  
  private void c(Boolean paramBoolean1, Boolean paramBoolean2)
  {
    if (this.tSy != null)
    {
      this.tSy.clearAnimation();
      this.tSy.setVisibility(8);
      if (!paramBoolean2.booleanValue()) {
        break label66;
      }
      if (paramBoolean1.booleanValue())
      {
        au.HU();
        com.tencent.mm.model.c.DT().set(340228, Boolean.valueOf(true));
        h.mEJ.a(232L, 1L, 1L, false);
      }
    }
    label66:
    while (!paramBoolean1.booleanValue()) {
      return;
    }
    au.HU();
    com.tencent.mm.model.c.DT().set(340229, Boolean.valueOf(true));
    h.mEJ.a(232L, 2L, 1L, false);
  }
  
  private void j(Boolean paramBoolean)
  {
    this.tSz = ((ViewGroup)this.bAG.findViewById(R.h.chatting_content));
    this.tSy = View.inflate(this.bAG.tTq.getContext(), R.i.new_user_tutorial, null);
    Object localObject = (TextView)this.tSy.findViewById(R.h.new_user_guide_tips);
    if (paramBoolean.booleanValue())
    {
      ((TextView)localObject).setText(this.bAG.tTq.getContext().getString(R.l.send_picture_video_tips));
      this.tSy.setBackgroundResource(R.g.ofm_pop_down_right_bg);
    }
    for (localObject = new FrameLayout.LayoutParams(-2, -2, 85);; localObject = new FrameLayout.LayoutParams(-2, -2, 83))
    {
      if ((this.tSz != null) && (this.tSy != null))
      {
        this.tSz.addView(this.tSy, (ViewGroup.LayoutParams)localObject);
        localObject = AnimationUtils.loadAnimation(this.bAG.tTq.getContext(), R.a.shake_y);
        this.tSy.startAnimation((Animation)localObject);
        this.tSy.setOnClickListener(new ai.1(this, paramBoolean));
      }
      return;
      ((TextView)localObject).setText(this.bAG.tTq.getContext().getString(R.l.send_voice_tips));
      this.tSy.setBackgroundResource(R.g.ofm_pop_down_left_bg);
    }
  }
  
  public final void cpI()
  {
    if (q.Hn().booleanValue())
    {
      if (!this.bAG.oLT.ckW())
      {
        au.HU();
        this.tSA = bi.d((Boolean)com.tencent.mm.model.c.DT().get(340228, null));
        if ((!this.tSA) && (!((com.tencent.mm.ui.chatting.b.b.e)this.bAG.O(com.tencent.mm.ui.chatting.b.b.e.class)).cuI()) && (!((com.tencent.mm.ui.chatting.b.b.c)this.bAG.O(com.tencent.mm.ui.chatting.b.b.c.class)).cux())) {
          j(Boolean.valueOf(true));
        }
        au.HU();
        this.tSB = bi.d((Boolean)com.tencent.mm.model.c.DT().get(340229, null));
        long l1 = System.currentTimeMillis();
        au.HU();
        long l2 = bi.a((Long)com.tencent.mm.model.c.DT().get(340240, null), 0L);
        if ((this.tSA) && (!this.tSB) && (l1 - l2 >= 259200000L)) {
          j(Boolean.valueOf(false));
        }
      }
      if (((m)this.bAG.O(m.class)).cvb() != null) {
        ((m)this.bAG.O(m.class)).cvb().setTipsShowCallback(this.tSD);
      }
    }
  }
  
  public final void cpJ()
  {
    if ((!this.bAG.oLT.ckW()) && (q.Hn().booleanValue())) {
      c(Boolean.valueOf(false), Boolean.valueOf(false));
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/ui/chatting/b/ai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */