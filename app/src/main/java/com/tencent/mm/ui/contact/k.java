package com.tencent.mm.ui.contact;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.mm.R.f;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.aa.f;
import com.tencent.mm.aa.q;
import com.tencent.mm.g.a.fs;
import com.tencent.mm.g.a.fs.b;
import com.tencent.mm.model.c;
import com.tencent.mm.modelsimple.z;
import com.tencent.mm.platformtools.ai;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.d.j;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.al.a;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.at;
import com.tencent.mm.storage.bd.a;
import com.tencent.mm.storage.bd.d;
import com.tencent.mm.ui.base.MaskLayout;
import com.tencent.mm.ui.tools.r;
import java.util.ArrayList;
import java.util.List;

public final class k
  extends RelativeLayout
{
  public static Boolean ujy = Boolean.valueOf(true);
  private Context context = null;
  private View ern = null;
  private boolean isVisible = true;
  private final al tQS = new al(new al.a()
  {
    public final boolean vD()
    {
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.FMessageContactView", "refresh timer expired, update");
      k.cym();
      k.a(k.this);
      return false;
    }
  }, true);
  j.a ujA = new k.2(this);
  private boolean ujB = false;
  private View ujz = null;
  
  public k(Context paramContext)
  {
    super(paramContext);
    this.context = paramContext;
    com.tencent.mm.az.d.SF().c(this.ujA);
    cyk();
    init();
  }
  
  private static void cyk()
  {
    int i = com.tencent.mm.az.d.SF().clP();
    com.tencent.mm.sdk.platformtools.x.v("MicroMsg.FMessageContactView", "updateAddressTabUnread, newCount update to = %d", new Object[] { Integer.valueOf(i) });
    if (i > 0)
    {
      com.tencent.mm.model.au.HU();
      c.DT().set(143618, Integer.valueOf(i));
    }
  }
  
  public static void cyl()
  {
    com.tencent.mm.model.au.HU();
    if (c.FM())
    {
      com.tencent.mm.model.au.HU();
      if (c.DT().getInt(143618, 0) > 0) {
        z.S("fmessage", 2);
      }
    }
    com.tencent.mm.model.au.HU();
    c.DT().set(143618, Integer.valueOf(0));
  }
  
  private void init()
  {
    Object localObject2 = com.tencent.mm.az.d.SF();
    com.tencent.mm.sdk.platformtools.x.v("MicroMsg.FMessageConversationStorage", "getNewLimit, limit = %d", new Object[] { Integer.valueOf(4) });
    Object localObject1 = new ArrayList();
    localObject2 = ((as)localObject2).diF.b("select * from fmessage_conversation  where isNew = 1 ORDER BY lastModifiedTime DESC limit 4", null, 2);
    Object localObject3;
    while (((Cursor)localObject2).moveToNext())
    {
      localObject3 = new ar();
      ((ar)localObject3).d((Cursor)localObject2);
      if (!bi.oW(((ar)localObject3).field_talker)) {
        ((List)localObject1).add(localObject3);
      }
    }
    ((Cursor)localObject2).close();
    int i = ((List)localObject1).size();
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.FMessageContactView", "init new fconv size = %d (max is 4)", new Object[] { Integer.valueOf(i) });
    removeAllViews();
    if (i <= 0) {
      if (this.context == null)
      {
        com.tencent.mm.sdk.platformtools.x.w("MicroMsg.FMessageContactView", "initNoNew failed. context is null.");
        localObject1 = this.ern.findViewById(R.h.fmessage_contact_header_container_ll);
        if (localObject1 != null) {
          if (!this.isVisible) {
            break label1313;
          }
        }
      }
    }
    label461:
    label552:
    label704:
    label709:
    label939:
    label1001:
    label1313:
    for (i = 0;; i = 8)
    {
      ((View)localObject1).setVisibility(i);
      this.ujz.setOnTouchListener(new k.3(this));
      i = com.tencent.mm.az.d.SF().clP();
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.FMessageContactView", "init totalNewSize = %d", new Object[] { Integer.valueOf(i) });
      localObject1 = (TextView)this.ern.findViewById(R.h.fmessage_contact_unread_tv);
      ((TextView)localObject1).setBackgroundResource(r.hd(this.context));
      if (i > 0) {
        break label1319;
      }
      ((TextView)localObject1).setVisibility(8);
      ujy = Boolean.valueOf(false);
      return;
      this.ern = View.inflate(this.context, R.i.fmessage_contact_header, this);
      this.ujz = this.ern.findViewById(R.h.fmessage_contact_viewall);
      localObject1 = this.ujz.getLayoutParams();
      ((ViewGroup.LayoutParams)localObject1).height = ((int)(com.tencent.mm.bp.a.ae(this.context, R.f.ContactListHeight) * com.tencent.mm.bp.a.fh(this.context)));
      this.ujz.setLayoutParams((ViewGroup.LayoutParams)localObject1);
      this.ern.setOnClickListener(new k.4(this));
      localObject1 = (MaskLayout)this.ern.findViewById(R.h.fmessage_avatar_iv);
      q.Kp();
      localObject2 = f.jV("fmessage");
      ((ImageView)((MaskLayout)localObject1).getContentView()).setImageBitmap((Bitmap)localObject2);
      break;
      if (i == 1)
      {
        localObject2 = (ar)((List)localObject1).get(0);
        if (this.context == null)
        {
          com.tencent.mm.sdk.platformtools.x.w("MicroMsg.FMessageContactView", "initSingleNew failed. context is null.");
          break;
        }
        Object localObject4;
        Context localContext;
        boolean bool;
        if (com.tencent.mm.bp.a.fi(this.context))
        {
          this.ern = View.inflate(this.context, R.i.fmessage_contact_header_single_large, this);
          ((TextView)this.ern.findViewById(R.h.fmessage_header_nick_tv)).setText(j.a(this.context, ((ar)localObject2).field_displayName));
          localObject3 = (TextView)this.ern.findViewById(R.h.fmessage_header_digest_tv);
          localObject4 = com.tencent.mm.az.d.SE().YN(((ar)localObject2).field_talker);
          localContext = this.context;
          i = ((at)localObject4).field_type;
          int j = ((ar)localObject2).field_addScene;
          localObject1 = ((at)localObject4).field_msgContent;
          if (((at)localObject4).clS()) {
            break label704;
          }
          bool = true;
          com.tencent.mm.sdk.platformtools.x.d("MicroMsg.FMessageProvider", "setDigest, fmsgType = %d, fmsgScene = %d, fmsgContent = %s, isSend = %b", new Object[] { Integer.valueOf(i), Integer.valueOf(j), localObject1, Boolean.valueOf(bool) });
          if (i != 0) {
            break label939;
          }
          if (localObject1 != null) {
            break label709;
          }
          com.tencent.mm.sdk.platformtools.x.e("MicroMsg.FMessageProvider", "setDigest fail, fmsgContent is null");
          localObject1 = null;
          if (!ai.oW((String)localObject1)) {
            break label1001;
          }
          ((TextView)localObject3).setVisibility(8);
        }
        for (;;)
        {
          this.ujz = this.ern.findViewById(R.h.fmessage_contact_header_container_ll);
          this.ern.setOnClickListener(new View.OnClickListener()
          {
            public final void onClick(View paramAnonymousView)
            {
              com.tencent.mm.sdk.platformtools.x.d("MicroMsg.FMessageContactView", "initSingleNew, not goto ContactInfoUI, goto FMessageConversationUI");
              com.tencent.mm.model.au.HU();
              c.DT().set(143618, Integer.valueOf(0));
              com.tencent.mm.bg.d.b(k.d(k.this), "subapp", ".ui.friend.FMessageConversationUI", new Intent());
            }
          });
          a.b.a((ImageView)((MaskLayout)this.ern.findViewById(R.h.fmessage_avatar_iv)).getContentView(), ((ar)localObject2).field_talker);
          break;
          this.ern = View.inflate(this.context, R.i.fmessage_contact_header_single, this);
          break label461;
          bool = false;
          break label552;
          localObject1 = bd.a.YV((String)localObject1);
          switch (((bd.a)localObject1).scene)
          {
          default: 
            localObject1 = localContext.getString(R.l.chatting_from_possible_friends_content);
            break;
          case 4: 
            localObject1 = localContext.getString(R.l.chatting_from_QQ_friends_content);
            break;
          case 10: 
          case 11: 
            localObject4 = new fs();
            ((fs)localObject4).bOn.bOk = ((bd.a)localObject1).tbE;
            ((fs)localObject4).bOn.bOl = ((bd.a)localObject1).tbF;
            com.tencent.mm.sdk.b.a.sFg.m((b)localObject4);
            localObject1 = localContext.getString(R.l.chatting_from_mobile_friends_content, new Object[] { bi.aG(((fs)localObject4).bOo.bOp, "") });
            break;
          case 31: 
            localObject1 = localContext.getString(R.l.chatting_from_verify_facebook_content);
            break;
          case 32: 
            localObject1 = localContext.getString(R.l.chatting_from_sns_add_now);
            break;
          case 58: 
          case 59: 
          case 60: 
            localObject1 = localContext.getString(R.l.chatting_from_google_contact);
            break;
            if (bool) {
              break;
            }
            localObject1 = bd.d.YY((String)localObject1);
            if ((((bd.d)localObject1).content != null) && (!((bd.d)localObject1).content.trim().equals("")))
            {
              localObject1 = ((bd.d)localObject1).content;
              break;
            }
            localObject1 = localContext.getString(R.l.fmessage_from_verify_digest_tip);
            break;
            ((TextView)localObject3).setText((CharSequence)localObject1);
          }
        }
      }
      if (this.context == null)
      {
        com.tencent.mm.sdk.platformtools.x.w("MicroMsg.FMessageContactView", "initMultiNew failed. context is null.");
        break;
      }
      this.ern = View.inflate(this.context, R.i.fmessage_contact_header_multi, this);
      i = ((List)localObject1).size();
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.FMessageContactView", "initMultiNew, newList size = %d", new Object[] { Integer.valueOf(i) });
      localObject2 = (ar)((List)localObject1).get(0);
      localObject3 = (MaskLayout)this.ern.findViewById(R.h.fmessage_avatar_iv);
      a.b.a((ImageView)((MaskLayout)localObject3).getContentView(), ((ar)localObject2).field_talker);
      ((MaskLayout)localObject3).setVisibility(0);
      localObject2 = (ar)((List)localObject1).get(1);
      localObject3 = (MaskLayout)this.ern.findViewById(R.h.fmessage_avatar_iv_2);
      a.b.a((ImageView)((MaskLayout)localObject3).getContentView(), ((ar)localObject2).field_talker);
      ((MaskLayout)localObject3).setVisibility(0);
      if (i > 2)
      {
        localObject2 = (ar)((List)localObject1).get(2);
        localObject3 = (MaskLayout)this.ern.findViewById(R.h.fmessage_avatar_iv_3);
        a.b.a((ImageView)((MaskLayout)localObject3).getContentView(), ((ar)localObject2).field_talker);
        ((MaskLayout)localObject3).setVisibility(0);
      }
      if (i > 3)
      {
        localObject1 = (ar)((List)localObject1).get(3);
        localObject2 = (MaskLayout)this.ern.findViewById(R.h.fmessage_avatar_iv_4);
        a.b.a((ImageView)((MaskLayout)localObject2).getContentView(), ((ar)localObject1).field_talker);
        ((MaskLayout)localObject2).setVisibility(0);
      }
      this.ujz = this.ern.findViewById(R.h.fmessage_contact_header_container_ll);
      this.ujz.setOnClickListener(new k.6(this));
      break;
    }
    label1319:
    ((TextView)localObject1).setVisibility(0);
    ujy = Boolean.valueOf(true);
    if (i > 99)
    {
      ((TextView)localObject1).setText(getContext().getString(R.l.unread_count_overt_100));
      return;
    }
    ((TextView)localObject1).setText(String.valueOf(i));
  }
  
  public final void setFrontGround(boolean paramBoolean)
  {
    this.ujB = paramBoolean;
  }
  
  public final void setVisible(boolean paramBoolean)
  {
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.FMessageContactView", "setVisible visible = " + paramBoolean);
    View localView = this.ern.findViewById(R.h.fmessage_contact_header_container_ll);
    if (localView != null) {
      if (!paramBoolean) {
        break label54;
      }
    }
    label54:
    for (int i = 0;; i = 8)
    {
      localView.setVisibility(i);
      this.isVisible = paramBoolean;
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/ui/contact/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */