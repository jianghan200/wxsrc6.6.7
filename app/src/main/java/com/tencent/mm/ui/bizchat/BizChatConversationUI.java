package com.tencent.mm.ui.bizchat;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.MessageQueue;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.q;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.R.f;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.a.b.a;
import com.tencent.mm.ac.a.d.a;
import com.tencent.mm.ac.a.j;
import com.tencent.mm.ac.a.k;
import com.tencent.mm.ac.c.a;
import com.tencent.mm.ac.f;
import com.tencent.mm.ac.z;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.model.al;
import com.tencent.mm.model.au;
import com.tencent.mm.protocal.c.hs;
import com.tencent.mm.protocal.c.qm;
import com.tencent.mm.protocal.c.xr;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ay;
import com.tencent.mm.storage.az;
import com.tencent.mm.ui.base.MMSlideDelView.f;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.base.p;
import com.tencent.mm.ui.conversation.BaseConversationUI;
import com.tencent.mm.ui.conversation.BaseConversationUI.b;
import com.tencent.mm.ui.g;
import com.tencent.mm.ui.y;
import java.util.HashMap;

public class BizChatConversationUI
  extends BaseConversationUI
{
  private View contentView;
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    com.tencent.mm.pluginsdk.e.a(this, this.contentView);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.contentView = y.gq(this).inflate(R.i.bizconversation_activity_container, null);
    setContentView(this.contentView);
    this.conversationFm = new a();
    getSupportFragmentManager().bk().a(R.h.mm_root_view, this.conversationFm).commit();
    com.tencent.mm.pluginsdk.e.a(this, this.contentView);
  }
  
  public static final class a
    extends BaseConversationUI.b
    implements com.tencent.mm.ac.n, m.b
  {
    private String dLD;
    private TextView emptyTipTv;
    private ListView hkY;
    private n.d hlb;
    private long hpD;
    private String hpJ;
    private com.tencent.mm.ui.tools.l hpi;
    private int hpr = 0;
    private int hps = 0;
    private boolean isCurrentActivity;
    private boolean isDeleteCancel = false;
    private d.a tEA = new BizChatConversationUI.a.13(this);
    private c.a tEB = new BizChatConversationUI.a.14(this);
    private LinearLayout tEv;
    private b tEw;
    private j tEx;
    private int tEy = 0;
    private b.a tEz = new BizChatConversationUI.a.11(this);
    private p tipDialog;
    
    private void csp()
    {
      String str = csr();
      this.tEy = g.bu(getContext(), str);
      if ((this.tEy == 2) && (this.tEv == null))
      {
        this.tEv = ((LinearLayout)findViewById(R.h.bottom_bar));
        Object localObject = this.tEv.getLayoutParams();
        ((ViewGroup.LayoutParams)localObject).height = com.tencent.mm.bp.a.ad(getContext(), R.f.DefaultTabbarHeight);
        this.tEv.setLayoutParams((ViewGroup.LayoutParams)localObject);
        localObject = y.gq(getContext()).inflate(R.i.enterprise_wework_view, this.tEv, false);
        float f = com.tencent.mm.bp.a.fe(getContext());
        ImageView localImageView = (ImageView)((View)localObject).findViewById(R.h.icon_iv);
        int i = localImageView.getLayoutParams().height;
        localImageView.getLayoutParams().height = ((int)(i * f));
        localImageView.getLayoutParams().width = ((int)(f * i));
        localImageView.requestLayout();
        ((TextView)((View)localObject).findViewById(R.h.title_tv)).setText(R.l.enterprise_wework_create_chat);
        this.tEv.addView((View)localObject);
        ((View)localObject).setOnClickListener(new BizChatConversationUI.a.12(this));
        g.n(getContext(), this.hpJ, 4);
        g.bv(getContext(), str);
      }
      if (this.tEv != null)
      {
        if (this.tEy == 2) {
          this.tEv.setVisibility(0);
        }
      }
      else {
        return;
      }
      this.tEv.setVisibility(8);
    }
    
    private void csq()
    {
      boolean bool = false;
      Object localObject = z.Nc().cA(this.hpJ);
      this.tEx = z.Nc().cz((String)localObject);
      String str = this.hpJ;
      if (this.tEx == null) {
        bool = true;
      }
      x.i("MicroMsg.BizChatConversationFmUI", "updateBizChatMyUserInfo: %s:%s,myBizChatUserInfo is null:%s", new Object[] { str, localObject, Boolean.valueOf(bool) });
      if ((bi.oW((String)localObject)) || (this.tEx == null) || (this.tEx.No()) || (bi.oW(this.tEx.field_addMemberUrl)))
      {
        z.Ng();
        com.tencent.mm.ac.a.h.a(this.hpJ, this);
        localObject = thisActivity();
        getString(R.l.app_tip);
        this.tipDialog = com.tencent.mm.ui.base.h.a((Context)localObject, getString(R.l.app_waiting), true, new BizChatConversationUI.a.9(this));
      }
    }
    
    private String csr()
    {
      if (bi.oW(this.dLD)) {
        this.dLD = z.MY().kA(this.hpJ).Mg();
      }
      return this.dLD;
    }
    
    private void gs(long paramLong)
    {
      Bundle localBundle = new Bundle();
      localBundle.putLong("key_biz_chat_id", paramLong);
      localBundle.putBoolean("finish_direct", false);
      localBundle.putBoolean("key_need_send_video", false);
      localBundle.putBoolean("key_is_biz_chat", true);
      this.ui.startChatting(this.hpJ, localBundle, true);
    }
    
    public final void a(int paramInt, com.tencent.mm.ab.l paraml)
    {
      if (this.tipDialog != null)
      {
        this.tipDialog.dismiss();
        this.tipDialog = null;
      }
      if (paraml.getType() == 1355)
      {
        paraml = ((com.tencent.mm.ac.a.n)paraml).Nt();
        paraml = z.Na().la(paraml.ruQ.rDx.riE);
        if (paraml == null) {
          Toast.makeText(ad.getContext(), getString(R.l.room_create_fail), 0).show();
        }
      }
      else
      {
        return;
      }
      gs(paraml.field_bizChatLocalId);
    }
    
    public final void a(int paramInt, com.tencent.mm.sdk.e.m paramm, Object paramObject) {}
    
    protected final int getLayoutId()
    {
      return R.i.enterprise_conversation;
    }
    
    public final String getUserName()
    {
      if (bi.oW(this.dLD)) {
        return this.hpJ;
      }
      return this.dLD;
    }
    
    public final void onActivityCreated(Bundle paramBundle)
    {
      super.onActivityCreated(paramBundle);
      this.hpJ = thisActivity().getIntent().getStringExtra("Contact_User");
      x.i("MicroMsg.BizChatConversationFmUI", "[registerListener]");
      z.Nb().a(this.tEz, thisActivity().getMainLooper());
      z.Na().a(this.tEA, thisActivity().getMainLooper());
      z.Nh().a(this.tEB, thisActivity().getMainLooper());
      au.HU();
      com.tencent.mm.model.c.FW().a(this);
      this.emptyTipTv = ((TextView)findViewById(R.h.empty_msg_tip_tv));
      this.emptyTipTv.setText(R.l.main_empty_conversation);
      this.hkY = ((ListView)findViewById(R.h.tmessage_lv));
      csp();
      this.tEw = new b(thisActivity(), new BizChatConversationUI.a.19(this), this.hpJ);
      this.tEw.setGetViewPositionCallback(new BizChatConversationUI.a.20(this));
      this.tEw.setPerformItemClickListener(new BizChatConversationUI.a.21(this));
      this.tEw.a(new MMSlideDelView.f()
      {
        public final void bv(Object paramAnonymousObject)
        {
          if (paramAnonymousObject == null) {
            x.e("MicroMsg.BizChatConversationFmUI", "onItemDel object null");
          }
        }
      });
      this.hkY.setAdapter(this.tEw);
      this.hlb = new BizChatConversationUI.a.15(this);
      paramBundle = new com.tencent.mm.ui.widget.b.a(thisActivity());
      this.hkY.setOnTouchListener(new BizChatConversationUI.a.16(this));
      this.hkY.setOnItemLongClickListener(new BizChatConversationUI.a.17(this, paramBundle));
      this.hkY.setOnItemClickListener(new BizChatConversationUI.a.18(this));
      setBackBtn(new BizChatConversationUI.a.3(this));
      addIconOptionMenu(1, R.l.top_item_desc_search, R.k.actionbar_icon_dark_search, new BizChatConversationUI.a.4(this));
      addIconOptionMenu(2, R.l.actionbar_title_new_group_chat, R.k.actionbar_icon_dark_add, new BizChatConversationUI.a.5(this));
      csq();
      au.Em().h(new BizChatConversationUI.a.10(this), 300L);
      paramBundle = csr();
      if (paramBundle != null)
      {
        z.Nh();
        com.tencent.mm.ac.c.a(paramBundle, null);
        x.e("MicroMsg.BizChatConversationFmUI", "update father attr from svr mainBizName:%s", new Object[] { paramBundle });
      }
      for (;;)
      {
        Looper.myQueue().addIdleHandler(new BizChatConversationUI.a.1(this));
        paramBundle = thisActivity().getIntent();
        if (com.tencent.mm.sdk.platformtools.s.a(paramBundle, "biz_chat_need_to_jump_to_chatting_ui", false))
        {
          long l = paramBundle.getLongExtra("biz_chat_chat_id", -1L);
          if (l != -1L) {
            gs(l);
          }
        }
        return;
        x.e("MicroMsg.BizChatConversationFmUI", "mainBizName is null!!!");
      }
    }
    
    public final void onActivityResult(int paramInt1, int paramInt2, final Intent paramIntent)
    {
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
      if (paramInt2 != -1) {}
      label174:
      label234:
      label242:
      for (;;)
      {
        return;
        switch (paramInt1)
        {
        default: 
          return;
        }
        paramIntent = paramIntent.getBundleExtra("result_data");
        Object localObject;
        xr localxr;
        if (paramIntent != null)
        {
          x.i("MicroMsg.BizChatConversationFmUI", "bundle != null");
          localObject = paramIntent.getString("enterprise_members");
          localxr = new xr();
          com.tencent.mm.ac.a.c localc = new com.tencent.mm.ac.a.c();
          if (this.tEx != null)
          {
            paramIntent = this.tEx.field_addMemberUrl;
            localc.field_addMemberUrl = paramIntent;
            localc.field_brandUserName = this.hpJ;
            if (!com.tencent.mm.ac.a.e.a(localc, (String)localObject, null, localxr)) {
              break label234;
            }
            if (localc.field_bizChatLocalId == -1L) {
              break label174;
            }
            gs(localc.field_bizChatLocalId);
            paramInt1 = 1;
          }
        }
        for (;;)
        {
          if (paramInt1 != 0) {
            break label242;
          }
          Toast.makeText(thisActivity(), getString(R.l.room_create_fail), 0).show();
          return;
          paramIntent = null;
          break;
          z.Ng();
          paramIntent = com.tencent.mm.ac.a.h.a(this.hpJ, localxr, this);
          localObject = thisActivity();
          getString(R.l.app_tip);
          this.tipDialog = com.tencent.mm.ui.base.h.a((Context)localObject, getString(R.l.app_waiting), true, new DialogInterface.OnCancelListener()
          {
            public final void onCancel(DialogInterface paramAnonymousDialogInterface)
            {
              z.Ng();
              com.tencent.mm.ac.a.h.f(paramIntent);
            }
          });
          paramInt1 = 1;
          continue;
          paramInt1 = 0;
          continue;
          paramInt1 = 0;
        }
      }
    }
    
    public final void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
    {
      paramView = (AdapterView.AdapterContextMenuInfo)paramContextMenuInfo;
      paramContextMenuInfo = (com.tencent.mm.ac.a.a)this.tEw.getItem(paramView.position);
      this.hpD = paramContextMenuInfo.field_bizChatId;
      if (paramContextMenuInfo.field_unReadCount <= 0)
      {
        paramContextMenu.add(paramView.position, 1, 0, R.l.main_conversation_longclick_setUnRead);
        z.Nb();
        if (!com.tencent.mm.ac.a.b.c(paramContextMenuInfo)) {
          break label114;
        }
        paramContextMenu.add(paramView.position, 3, 1, R.l.main_conversation_longclick_unplacedtop);
      }
      for (;;)
      {
        paramContextMenu.add(paramView.position, 0, 2, R.l.main_delete);
        return;
        paramContextMenu.add(paramView.position, 2, 0, R.l.main_conversation_longclick_markRead);
        break;
        label114:
        paramContextMenu.add(paramView.position, 3, 1, R.l.main_conversation_longclick_placedtop);
      }
    }
    
    public final void onDestroy()
    {
      x.i("MicroMsg.BizChatConversationFmUI", "[unRegitListener]");
      z.Nb().a(this.tEz);
      z.Na().a(this.tEA);
      z.Nh().a(this.tEB);
      if (au.HX())
      {
        au.HU();
        com.tencent.mm.model.c.FW().b(this);
      }
      this.tEw.aYc();
      b localb = this.tEw;
      if (localb.tEl != null)
      {
        localb.tEl.clear();
        localb.tEl = null;
      }
      super.onDestroy();
    }
    
    public final void onPause()
    {
      x.i("MicroMsg.BizChatConversationFmUI", "on pause");
      au.HU();
      com.tencent.mm.model.c.FW().Ys(this.hpJ);
      com.tencent.mm.ac.a.b localb = z.Nb();
      String str = this.hpJ;
      if (bi.oW(str)) {
        x.e("MicroMsg.BizConversationStorage", "brandUserName is null");
      }
      for (;;)
      {
        if (this.tEw != null) {
          this.tEw.onPause();
        }
        this.isCurrentActivity = false;
        au.getNotification().eJ("");
        super.onPause();
        return;
        str = "update BizChatConversation set newUnReadCount = 0 where newUnReadCount != 0 and brandUserName = '" + str + "'";
        x.d("MicroMsg.BizConversationStorage", "resetNewUnreadCount :%s,sql:%s", new Object[] { Boolean.valueOf(localb.diF.fV("BizChatConversation", str)), str });
      }
    }
    
    public final void onResume()
    {
      super.onResume();
      au.HU();
      ab localab = com.tencent.mm.model.c.FR().Yg(this.hpJ);
      if ((localab == null) || (!com.tencent.mm.l.a.gd(localab.field_type)))
      {
        finish();
        return;
      }
      com.tencent.mm.ac.d locald = f.kH(this.hpJ);
      if ((locald == null) || (locald.field_enterpriseFather == null) || (!com.tencent.mm.model.s.he(locald.field_enterpriseFather)))
      {
        finish();
        return;
      }
      if (localab.BD()) {
        setTitleMuteIconVisibility(0);
      }
      for (;;)
      {
        this.isCurrentActivity = true;
        this.tEw.a(null, null);
        au.getNotification().eJ(this.hpJ);
        return;
        setTitleMuteIconVisibility(8);
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/ui/bizchat/BizChatConversationUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */