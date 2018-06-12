package com.tencent.mm.plugin.multitalk.ui.widget;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.mm.R.h;
import com.tencent.mm.R.l;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.multitalk.a.e;
import com.tencent.mm.plugin.multitalk.a.i;
import com.tencent.mm.plugin.multitalk.a.o;
import com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.d.j;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.s;
import com.tencent.pb.talkroom.sdk.MultiTalkGroup;
import com.tencent.pb.talkroom.sdk.MultiTalkGroupMember;
import com.tencent.pb.talkroom.sdk.d;
import java.util.ArrayList;
import java.util.List;

public final class c
  implements View.OnClickListener
{
  private TextView hoe;
  private MultiTalkMainUI lvs;
  private View lvt;
  private TextView lvu;
  private ImageView lvv;
  private LinearLayout lvw;
  private ImageButton lvx;
  private ImageButton lvy;
  
  public c(MultiTalkMainUI paramMultiTalkMainUI)
  {
    this.lvs = paramMultiTalkMainUI;
    this.lvt = paramMultiTalkMainUI.findViewById(R.h.invite_layout);
    this.lvu = ((TextView)paramMultiTalkMainUI.findViewById(R.h.invite_main_nickname_tv));
    this.lvv = ((ImageView)paramMultiTalkMainUI.findViewById(R.h.invite_main_avatar_iv));
    this.lvw = ((LinearLayout)paramMultiTalkMainUI.findViewById(R.h.small_avatar_iv_container));
    this.hoe = ((TextView)paramMultiTalkMainUI.findViewById(R.h.introduce_tv));
    this.lvx = ((ImageButton)paramMultiTalkMainUI.findViewById(R.h.invite_pickup_btn));
    this.lvy = ((ImageButton)paramMultiTalkMainUI.findViewById(R.h.invite_hangup_btn));
    this.lvx.setOnClickListener(this);
    this.lvy.setOnClickListener(this);
  }
  
  public final void bgT()
  {
    this.lvt.setVisibility(8);
  }
  
  public final void n(MultiTalkGroup paramMultiTalkGroup)
  {
    this.lvt.setVisibility(0);
    Object localObject = i.bgD();
    ArrayList localArrayList = new ArrayList();
    int i;
    if (!bi.oW((String)localObject))
    {
      i = 0;
      while (i < paramMultiTalkGroup.vgq.size())
      {
        if (!((MultiTalkGroupMember)paramMultiTalkGroup.vgq.get(i)).vgr.equals(localObject)) {
          localArrayList.add(((MultiTalkGroupMember)paramMultiTalkGroup.vgq.get(i)).vgr);
        }
        i += 1;
      }
      this.lvu.setText(j.a(this.lvs, r.gT((String)localObject)));
      a.b.a(this.lvv, (String)localObject, 0.1F, true);
    }
    if (localArrayList.size() > 0)
    {
      this.hoe.setVisibility(0);
      this.hoe.setText(R.l.multitalk_member_wording);
      this.lvw.setVisibility(0);
      this.lvw.removeAllViews();
      i = 0;
      while (i < localArrayList.size())
      {
        paramMultiTalkGroup = new ImageView(this.lvs.mController.tml);
        localObject = new LinearLayout.LayoutParams(b.lvl, b.lvl);
        if (i != 0) {
          ((LinearLayout.LayoutParams)localObject).leftMargin = b.lvj;
        }
        paramMultiTalkGroup.setLayoutParams((ViewGroup.LayoutParams)localObject);
        this.lvw.addView(paramMultiTalkGroup);
        a.b.a(paramMultiTalkGroup, (String)localArrayList.get(i), 0.1F, false);
        i += 1;
      }
    }
    this.hoe.setVisibility(8);
    this.lvw.setVisibility(8);
  }
  
  public final void onClick(View paramView)
  {
    if (paramView.getId() == R.h.invite_hangup_btn) {
      o.bgN().g(true, false, false);
    }
    while (paramView.getId() != R.h.invite_pickup_btn) {
      return;
    }
    paramView = o.bgN();
    if (paramView.bgl())
    {
      x.i("MicroMsg.MT.MultiTalkManager", "acceptCurrentMultiTalk: %s", new Object[] { i.h(paramView.ltt) });
      o.bgM().lta.B(paramView.ltt.vgm, paramView.ltt.vcc, paramView.ltt.vgo);
      return;
    }
    x.e("MicroMsg.MT.MultiTalkManager", "acceptCurrentMultiTalk: Not in MultiTalking");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/multitalk/ui/widget/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */