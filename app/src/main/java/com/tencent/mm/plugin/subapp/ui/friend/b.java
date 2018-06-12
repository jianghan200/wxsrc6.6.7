package com.tencent.mm.plugin.subapp.ui.friend;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.l.a;
import com.tencent.mm.model.af;
import com.tencent.mm.model.c;
import com.tencent.mm.plugin.messenger.foundation.a.a.k;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.d.j;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.at;
import com.tencent.mm.storage.ay;
import com.tencent.mm.storage.bd.d;
import com.tencent.mm.storage.bq;
import com.tencent.mm.storage.u;
import com.tencent.mm.ui.base.MaskLayout;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.r;

public final class b
  extends r<ar>
{
  private Context context;
  private View.OnClickListener orM = new b.2(this);
  private View.OnClickListener orN = new View.OnClickListener()
  {
    public final void onClick(View paramAnonymousView)
    {
      Object localObject1;
      if ((paramAnonymousView.getTag() instanceof com.tencent.mm.pluginsdk.ui.preference.b))
      {
        x.d("MicroMsg.FMessageConversationUI", "verifyOkOnClick onClick");
        localObject1 = (com.tencent.mm.pluginsdk.ui.preference.b)paramAnonymousView.getTag();
        localObject2 = com.tencent.mm.az.d.SE().YO(((com.tencent.mm.pluginsdk.ui.preference.b)localObject1).username);
        if ((localObject2 == null) || (((at)localObject2).field_msgContent == null)) {
          x.e("MicroMsg.FMessageConversationUI", "lastRecvFmsg is null, verify fail, talker = " + ((com.tencent.mm.pluginsdk.ui.preference.b)localObject1).username);
        }
      }
      else
      {
        return;
      }
      paramAnonymousView = bd.d.YY(((at)localObject2).field_msgContent);
      x.d("MicroMsg.FMessageConversationUI", "try to addcontact, username = " + ((com.tencent.mm.pluginsdk.ui.preference.b)localObject1).username + ", opcode = MM_VERIFYUSER_VERIFYOK");
      if (paramAnonymousView.tbU == 1)
      {
        h.a(b.a(b.this), paramAnonymousView.tbV, null, b.a(b.this).getString(R.l.fmessage_goto_verify), b.a(b.this).getString(R.l.app_cancel), true, new b.3.1(this, (at)localObject2), null);
        return;
      }
      com.tencent.mm.model.au.HU();
      bq localbq = c.FS().Hh(((com.tencent.mm.pluginsdk.ui.preference.b)localObject1).username);
      Object localObject2 = new Intent();
      ((Intent)localObject2).putExtra("Contact_User", ((com.tencent.mm.pluginsdk.ui.preference.b)localObject1).username);
      ((Intent)localObject2).putExtra("Contact_Nick", ((com.tencent.mm.pluginsdk.ui.preference.b)localObject1).nickname);
      if (localbq != null) {
        ((Intent)localObject2).putExtra("Contact_RemarkName", localbq.field_conRemark);
      }
      if (!bi.oW(paramAnonymousView.chatroomName))
      {
        com.tencent.mm.model.au.HU();
        localObject1 = c.Ga().ih(paramAnonymousView.chatroomName);
        if (localObject1 != null) {
          ((Intent)localObject2).putExtra("Contact_RoomNickname", ((u)localObject1).gT(paramAnonymousView.otZ));
        }
      }
      ((Intent)localObject2).putExtra("Contact_Scene", paramAnonymousView.scene);
      ((Intent)localObject2).putExtra("Verify_ticket", paramAnonymousView.juZ);
      ((Intent)localObject2).putExtra("sayhi_with_sns_perm_send_verify", false);
      ((Intent)localObject2).putExtra("sayhi_with_sns_perm_add_remark", true);
      ((Intent)localObject2).putExtra("sayhi_with_sns_perm_set_label", true);
      ((Intent)localObject2).putExtra("sayhi_with_jump_to_profile", true);
      com.tencent.mm.bg.d.b(b.a(b.this), "profile", ".ui.SayHiWithSnsPermissionUI", (Intent)localObject2);
    }
  };
  
  public b(Context paramContext)
  {
    super(paramContext, new ar());
    this.context = paramContext;
  }
  
  protected final void WS()
  {
    aYc();
    WT();
  }
  
  public final void WT()
  {
    if (Looper.myLooper() == Looper.getMainLooper())
    {
      setCursor(com.tencent.mm.az.d.SF().axc());
      notifyDataSetChanged();
      return;
    }
    ah.A(new Runnable()
    {
      public final void run()
      {
        b.a(b.this, com.tencent.mm.az.d.SF().axc());
        b.this.notifyDataSetChanged();
      }
    });
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null)
    {
      paramView = View.inflate(this.context, R.i.fmessage_contact_item, null);
      paramViewGroup = new a();
      paramViewGroup.orU = ((MaskLayout)paramView.findViewById(R.h.fmessage_contact_item_avatar));
      paramViewGroup.lWV = ((TextView)paramView.findViewById(R.h.fmessage_contact_item_nick_tv));
      paramViewGroup.orZ = ((TextView)paramView.findViewById(R.h.fmessage_contact_item_digest_tv));
      paramViewGroup.orV = ((Button)paramView.findViewById(R.h.fmessage_contact_add_btn));
      paramViewGroup.orV.setOnClickListener(this.orM);
      paramViewGroup.orW = ((Button)paramView.findViewById(R.h.fmessage_contact_verify_ok_btn));
      paramViewGroup.orW.setOnClickListener(this.orN);
      paramViewGroup.orX = ((TextView)paramView.findViewById(R.h.fmessage_contact_item_verifying_tv));
      paramViewGroup.orY = ((TextView)paramView.findViewById(R.h.fmessage_contact_item_added_tv));
      paramView.setTag(paramViewGroup);
    }
    ar localar;
    for (;;)
    {
      localar = (ar)getItem(paramInt);
      a.b.a((ImageView)paramViewGroup.orU.getContentView(), localar.field_talker);
      paramViewGroup.lWV.setText(j.a(this.context, localar.field_displayName, paramViewGroup.lWV.getTextSize()));
      if (localar.field_fmsgSysRowId > 0L) {
        break label502;
      }
      x.w("MicroMsg.FMessageConversationUI", "getView, fconv fmsgSysRowId is invalid, try getLastFmsg");
      localObject1 = com.tencent.mm.az.d.SE().YN(localar.field_talker);
      if (localObject1 != null) {
        break;
      }
      x.e("MicroMsg.FMessageConversationUI", "getView, lastFmsg is null, talker = " + localar.field_talker);
      paramViewGroup.orV.setVisibility(8);
      paramViewGroup.orW.setVisibility(8);
      paramViewGroup.orX.setVisibility(8);
      paramViewGroup.orY.setVisibility(8);
      paramViewGroup.orZ.setVisibility(8);
      return paramView;
      paramViewGroup = (a)paramView.getTag();
    }
    Object localObject1 = com.tencent.mm.pluginsdk.ui.preference.b.a(this.context, (at)localObject1);
    x.i("MicroMsg.FMessageConversationUI", "getView, lastFmsg talker = " + localar.field_talker);
    Object localObject2;
    if (localar.field_state == 1)
    {
      com.tencent.mm.model.au.HU();
      localObject2 = c.FR().Yg(localar.field_talker);
      if ((localObject2 != null) && ((int)((a)localObject2).dhP != 0) && (!a.gd(((ai)localObject2).field_type))) {
        com.tencent.mm.az.d.SF().db(localar.field_talker, 0);
      }
    }
    if (localObject1 == null)
    {
      x.e("MicroMsg.FMessageConversationUI", "getView, fProvider is null, talker = " + localar.field_talker);
      paramViewGroup.orV.setVisibility(8);
      paramViewGroup.orW.setVisibility(8);
      paramViewGroup.orX.setVisibility(8);
      paramViewGroup.orY.setVisibility(8);
      paramViewGroup.orZ.setVisibility(8);
      return paramView;
      label502:
      localObject1 = this.context;
      long l = localar.field_fmsgSysRowId;
      if (localar.field_fmsgIsSend % 2 == 0) {}
      for (boolean bool = true;; bool = false)
      {
        localObject1 = com.tencent.mm.pluginsdk.ui.preference.b.a((Context)localObject1, l, bool, localar.field_talker, localar.field_fmsgContent, localar.field_fmsgType, localar.field_contentFromUsername, localar.field_contentNickname, localar.field_contentPhoneNumMD5, localar.field_contentFullPhoneNumMD5, localar.field_contentVerifyContent, localar.field_addScene);
        x.i("MicroMsg.FMessageConversationUI", "getView, lastFmsg sysrowid = " + localar.field_fmsgSysRowId + ", talker = " + localar.field_talker);
        break;
      }
    }
    ((com.tencent.mm.pluginsdk.ui.preference.b)localObject1).mZZ = localar.field_addScene;
    paramViewGroup.orZ.setText(j.a(this.context, ((com.tencent.mm.pluginsdk.ui.preference.b)localObject1).dzA, paramViewGroup.orZ.getTextSize()));
    switch (localar.field_state)
    {
    default: 
      paramViewGroup.orV.setVisibility(8);
      paramViewGroup.orW.setVisibility(8);
      paramViewGroup.orX.setVisibility(8);
      paramViewGroup.orY.setVisibility(8);
      paramViewGroup = paramView.findViewById(R.h.fmessage_contact_item_layout);
      if (localar.field_isNew != 0) {
        break;
      }
    }
    for (paramInt = R.g.mm_listitem;; paramInt = R.g.comm_item_highlight_selector)
    {
      paramViewGroup.setBackgroundResource(paramInt);
      return paramView;
      if (localar.field_fmsgSysRowId <= 0L)
      {
        x.w("MicroMsg.FMessageConversationUI", "getView, fmsgSysRowId invalid, try use lastRecvFmsg");
        localObject2 = com.tencent.mm.az.d.SE().YO(((com.tencent.mm.pluginsdk.ui.preference.b)localObject1).username);
        if (localObject2 == null)
        {
          paramInt = 0;
          label801:
          if ((paramInt != 0) && (paramInt != 3)) {
            break label875;
          }
          paramViewGroup.orV.setVisibility(0);
          paramViewGroup.orV.setTag(localObject1);
          paramViewGroup.orW.setVisibility(8);
        }
      }
      for (;;)
      {
        paramViewGroup.orX.setVisibility(8);
        paramViewGroup.orY.setVisibility(8);
        break;
        paramInt = ((at)localObject2).field_type;
        break label801;
        paramInt = localar.field_recvFmsgType;
        break label801;
        label875:
        paramViewGroup.orW.setVisibility(0);
        paramViewGroup.orW.setTag(localObject1);
        paramViewGroup.orV.setVisibility(8);
      }
      paramViewGroup.orX.setVisibility(0);
      paramViewGroup.orV.setVisibility(8);
      paramViewGroup.orW.setVisibility(8);
      paramViewGroup.orY.setVisibility(8);
      break;
      paramViewGroup.orY.setVisibility(0);
      paramViewGroup.orV.setVisibility(8);
      paramViewGroup.orW.setVisibility(8);
      paramViewGroup.orX.setVisibility(8);
      break;
    }
  }
  
  static final class a
  {
    public TextView lWV;
    public MaskLayout orU;
    public Button orV;
    public Button orW;
    public TextView orX;
    public TextView orY;
    public TextView orZ;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/subapp/ui/friend/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */