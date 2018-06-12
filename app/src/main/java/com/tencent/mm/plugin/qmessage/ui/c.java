package com.tencent.mm.plugin.qmessage.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.g.c.am;
import com.tencent.mm.model.au;
import com.tencent.mm.model.s;
import com.tencent.mm.pluginsdk.f.h;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.d.j;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.ai;
import com.tencent.mm.storage.az;
import com.tencent.mm.storage.az.b;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMSlideDelView;
import com.tencent.mm.ui.base.MMSlideDelView.c;
import com.tencent.mm.ui.base.MMSlideDelView.d;
import com.tencent.mm.ui.base.MMSlideDelView.f;
import com.tencent.mm.ui.base.MMSlideDelView.g;
import com.tencent.mm.ui.r.a;

final class c
  extends com.tencent.mm.ui.r<ai>
  implements m.b
{
  private final MMActivity bGc;
  protected MMSlideDelView.g hkN;
  protected MMSlideDelView.c hkO;
  protected MMSlideDelView.f hkP;
  protected MMSlideDelView.d hkQ = MMSlideDelView.getItemStatusCallBack();
  
  public c(Context paramContext, r.a parama)
  {
    super(paramContext, new ai());
    this.tlG = parama;
    this.bGc = ((MMActivity)paramContext);
  }
  
  private static int wW(String paramString)
  {
    int j = 1;
    int i = j;
    if (paramString != null)
    {
      i = j;
      if (paramString.length() <= 0) {}
    }
    try
    {
      i = Integer.valueOf(paramString).intValue();
      return i;
    }
    catch (NumberFormatException paramString) {}
    return 1;
  }
  
  protected final void WS()
  {
    WT();
  }
  
  public final void WT()
  {
    au.HU();
    setCursor(com.tencent.mm.model.c.FW().Yy(s.dAQ));
    if (this.tlG != null) {
      this.tlG.Xb();
    }
    super.notifyDataSetChanged();
  }
  
  public final void a(MMSlideDelView.f paramf)
  {
    this.hkP = paramf;
  }
  
  public final int getItemViewType(int paramInt)
  {
    return 0;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    ai localai = (ai)getItem(paramInt);
    View localView;
    Object localObject;
    if (paramView == null)
    {
      paramViewGroup = new a();
      localView = View.inflate(this.bGc, R.i.tmessage_item, null);
      paramViewGroup.eCl = ((ImageView)localView.findViewById(R.h.avatar_iv));
      paramViewGroup.eTm = ((TextView)localView.findViewById(R.h.nickname_tv));
      paramViewGroup.hkS = ((TextView)localView.findViewById(R.h.update_time_tv));
      paramViewGroup.hkT = ((TextView)localView.findViewById(R.h.last_msg_tv));
      paramViewGroup.hkU = ((ImageView)localView.findViewById(R.h.state_iv));
      paramViewGroup.hkV = ((TextView)localView.findViewById(R.h.tipcnt_tv));
      localView.setTag(paramViewGroup);
      paramViewGroup.eTm.setText(com.tencent.mm.model.r.gT(localai.field_username));
      localObject = paramViewGroup.hkS;
      if (localai.field_status != 1) {
        break label455;
      }
      paramView = this.bGc.getString(R.l.main_sending);
      label172:
      ((TextView)localObject).setText(paramView);
      a.b.a(paramViewGroup.eCl, localai.field_username);
      au.HU();
      localObject = com.tencent.mm.model.c.FW().vu();
      if (bi.oW(localai.field_digest)) {
        break label512;
      }
      if (bi.oW(localai.field_digestUser)) {
        break label502;
      }
      if ((localai.field_isSend != 0) || (!s.fq(localai.field_username))) {
        break label490;
      }
      paramView = com.tencent.mm.model.r.getDisplayName(localai.field_digestUser, localai.field_username);
    }
    for (;;)
    {
      label455:
      label490:
      label502:
      try
      {
        paramView = String.format(localai.field_digest, new Object[] { paramView });
        paramViewGroup.hkT.setText(j.a(this.bGc, paramView, paramViewGroup.hkT.getTextSize()));
        switch (localai.field_status)
        {
        case 3: 
        case 4: 
        default: 
          paramInt = -1;
          if (paramInt == -1) {
            break label574;
          }
          paramViewGroup.hkU.setBackgroundResource(paramInt);
          paramViewGroup.hkU.setVisibility(0);
          paramInt = localView.getPaddingBottom();
          int i = localView.getPaddingTop();
          int j = localView.getPaddingRight();
          int k = localView.getPaddingLeft();
          if (localai.field_unReadCount <= 100) {
            break label586;
          }
          paramViewGroup.hkV.setText("...");
          paramViewGroup.hkV.setVisibility(0);
          localView.setBackgroundResource(R.g.mm_listitem);
          localView.setPadding(k, i, j, paramInt);
          return localView;
        }
      }
      catch (Exception paramView) {}
      paramViewGroup = (a)paramView.getTag();
      localView = paramView;
      break;
      if (localai.field_conversationTime == Long.MAX_VALUE)
      {
        paramView = "";
        break label172;
      }
      paramView = h.c(this.bGc, localai.field_conversationTime, true);
      break label172;
      paramView = com.tencent.mm.model.r.gT(localai.field_digestUser);
      continue;
      paramView = localai.field_digest;
      continue;
      label512:
      paramView = ((az.b)localObject).a(localai.field_isSend, localai.field_username, localai.field_content, wW(localai.field_msgType), this.bGc);
      continue;
      paramInt = -1;
      continue;
      paramInt = R.k.msg_state_sending;
      continue;
      paramInt = -1;
      continue;
      paramInt = R.k.msg_state_failed;
      continue;
      label574:
      paramViewGroup.hkU.setVisibility(8);
      continue;
      label586:
      if (localai.field_unReadCount > 0)
      {
        paramViewGroup.hkV.setText(localai.field_unReadCount);
        paramViewGroup.hkV.setVisibility(0);
      }
      else
      {
        paramViewGroup.hkV.setVisibility(4);
      }
    }
  }
  
  public final int getViewTypeCount()
  {
    return 1;
  }
  
  public final void onPause()
  {
    if (this.hkQ != null) {
      this.hkQ.aYl();
    }
  }
  
  public final void setGetViewPositionCallback(MMSlideDelView.c paramc)
  {
    this.hkO = paramc;
  }
  
  public final void setPerformItemClickListener(MMSlideDelView.g paramg)
  {
    this.hkN = paramg;
  }
  
  public static final class a
  {
    public ImageView eCl;
    public TextView eTm;
    public TextView hkS;
    public TextView hkT;
    public ImageView hkU;
    public TextView hkV;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/qmessage/ui/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */