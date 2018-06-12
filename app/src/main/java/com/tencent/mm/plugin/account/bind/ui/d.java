package com.tencent.mm.plugin.account.bind.ui;

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.mm.bt.h;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.account.a.c;
import com.tencent.mm.plugin.account.a.e;
import com.tencent.mm.plugin.account.a.f;
import com.tencent.mm.plugin.account.a.g;
import com.tencent.mm.plugin.account.a.j;
import com.tencent.mm.plugin.messenger.foundation.a.i;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.ay;
import com.tencent.mm.ui.r.a;

public final class d
  extends b
{
  private int[] eIr;
  private String eIs;
  private b.a eIt;
  private b.b eIu = new d.1(this);
  
  public d(Context paramContext, r.a parama)
  {
    super(paramContext, new com.tencent.mm.plugin.account.friend.a.a());
    this.tlG = parama;
    this.context = paramContext;
    lB(true);
  }
  
  private static String a(com.tencent.mm.plugin.account.friend.a.a parama)
  {
    if (parama.eJF == 123) {
      return "#";
    }
    return String.valueOf((char)parama.eJF);
  }
  
  protected final void WS()
  {
    WT();
  }
  
  public final void WT()
  {
    aYc();
    Object localObject = (com.tencent.mm.plugin.account.friend.a.b)((com.tencent.mm.plugin.account.a.a.a)g.n(com.tencent.mm.plugin.account.a.a.a.class)).getAddrUploadStg();
    String str = this.eIs;
    StringBuilder localStringBuilder = new StringBuilder();
    if ((str != null) && (str.length() > 0))
    {
      localStringBuilder.append(" and ( ");
      localStringBuilder.append("addr_upload2.realname like '%" + str + "%' or ");
      localStringBuilder.append("addr_upload2.realnamepyinitial like '%" + str + "%' or ");
      localStringBuilder.append("addr_upload2.realnamequanpin like '%" + str + "%' or ");
      localStringBuilder.append("addr_upload2.username like '%" + str + "%' or ");
      localStringBuilder.append("addr_upload2.nickname like '%" + str + "%' or ");
      localStringBuilder.append("addr_upload2.nicknamepyinitial like '%" + str + "%' or ");
      localStringBuilder.append("addr_upload2.nicknamequanpin like '%" + str + "%' )");
    }
    localStringBuilder.append(" and (");
    localStringBuilder.append("addr_upload2.status=1");
    localStringBuilder.append(" or ");
    localStringBuilder.append("addr_upload2.status=2");
    localStringBuilder.append(")");
    str = (String)g.Ei().DT().get(6, null);
    if ((str != null) && (!str.equals(""))) {}
    for (localObject = ((com.tencent.mm.plugin.account.friend.a.b)localObject).dCZ.b("select addr_upload2.id,addr_upload2.md5,addr_upload2.peopleid,addr_upload2.uploadtime,addr_upload2.realname,addr_upload2.realnamepyinitial,addr_upload2.realnamequanpin,addr_upload2.username,addr_upload2.nickname,addr_upload2.nicknamepyinitial,addr_upload2.nicknamequanpin,addr_upload2.type,addr_upload2.moblie,addr_upload2.email,addr_upload2.status,addr_upload2.reserved1,addr_upload2.reserved2,addr_upload2.reserved3,addr_upload2.reserved4,addr_upload2.lvbuf,addr_upload2.showhead from addr_upload2  where type = 0 and moblie <> " + str + localStringBuilder.toString() + " order by showhead", null, 0);; localObject = ((com.tencent.mm.plugin.account.friend.a.b)localObject).dCZ.b("select addr_upload2.id,addr_upload2.md5,addr_upload2.peopleid,addr_upload2.uploadtime,addr_upload2.realname,addr_upload2.realnamepyinitial,addr_upload2.realnamequanpin,addr_upload2.username,addr_upload2.nickname,addr_upload2.nicknamepyinitial,addr_upload2.nicknamequanpin,addr_upload2.type,addr_upload2.moblie,addr_upload2.email,addr_upload2.status,addr_upload2.reserved1,addr_upload2.reserved2,addr_upload2.reserved3,addr_upload2.reserved4,addr_upload2.lvbuf,addr_upload2.showhead from addr_upload2  where type = 0" + localStringBuilder.toString() + " order by showhead", null, 0))
    {
      setCursor((Cursor)localObject);
      this.eIr = new int[getCount()];
      if ((this.eIt != null) && (this.eIs != null)) {
        this.eIt.ja(getCursor().getCount());
      }
      notifyDataSetChanged();
      return;
    }
  }
  
  public final void a(b.a parama)
  {
    this.eIt = parama;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    com.tencent.mm.plugin.account.friend.a.a locala = (com.tencent.mm.plugin.account.friend.a.a)getItem(paramInt);
    label156:
    label188:
    Object localObject;
    if (paramView == null)
    {
      paramView = View.inflate(this.context, a.g.friend_list_item, null);
      paramViewGroup = new a(paramView);
      paramView.setTag(paramViewGroup);
      paramViewGroup.eIy = paramInt;
      paramViewGroup.account = locala.Xh();
      paramViewGroup.status = locala.status;
      paramViewGroup.eIH.setText(locala.Xj());
      paramViewGroup.eII.setText(this.context.getString(a.j.friend_weixin) + locala.Xm());
      a.b.a(paramViewGroup.eBM, locala.getUsername());
      switch (locala.status)
      {
      default: 
        switch (locala.dHO)
        {
        default: 
          localObject = (com.tencent.mm.plugin.account.friend.a.a)getItem(paramInt - 1);
          if (localObject == null) {
            i = -1;
          }
          break;
        }
        break;
      }
    }
    for (;;)
    {
      if (paramInt == 0)
      {
        localObject = a(locala);
        if (bi.oW((String)localObject))
        {
          com.tencent.mm.sdk.platformtools.x.w("MicroMsg.MobileFriendAdapter", "get display show head return null, user[%s] pos[%d]", new Object[] { locala.getUsername(), Integer.valueOf(paramInt) });
          paramViewGroup.eIG.setVisibility(8);
          return paramView;
          paramViewGroup = (a)paramView.getTag();
          break;
          if (locala.dHO == 2)
          {
            paramViewGroup.eIA.setClickable(false);
            paramViewGroup.eIA.setBackgroundDrawable(null);
            paramViewGroup.eBR.setText(a.j.friend_invited);
            paramViewGroup.eBR.setTextColor(this.context.getResources().getColor(a.c.lightgrey));
            break label156;
          }
          paramViewGroup.eIA.setClickable(true);
          paramViewGroup.eIA.setBackgroundResource(a.e.btn_solid_green);
          paramViewGroup.eBR.setText(a.j.friend_invite);
          paramViewGroup.eBR.setTextColor(this.context.getResources().getColor(a.c.white));
          break label156;
          if ((((i)g.l(i.class)).FR().Yc(locala.getUsername())) || (q.GF().equals(locala.getUsername())))
          {
            paramViewGroup.eIA.setClickable(false);
            paramViewGroup.eIA.setBackgroundDrawable(null);
            paramViewGroup.eBR.setText(a.j.friend_added);
            paramViewGroup.eBR.setTextColor(this.context.getResources().getColor(a.c.lightgrey));
            break label156;
          }
          if (locala.dHO == 2)
          {
            paramViewGroup.eIA.setClickable(false);
            paramViewGroup.eIA.setBackgroundDrawable(null);
            paramViewGroup.eBR.setText(a.j.friend_waiting_ask);
            paramViewGroup.eBR.setTextColor(this.context.getResources().getColor(a.c.lightgrey));
            break label156;
          }
          paramViewGroup.eIA.setClickable(true);
          paramViewGroup.eIA.setBackgroundResource(a.e.btn_solid_green);
          paramViewGroup.eBR.setText(a.j.friend_add);
          paramViewGroup.eBR.setTextColor(this.context.getResources().getColor(a.c.white));
          break label156;
          paramViewGroup.eBR.setVisibility(4);
          paramViewGroup.eIJ.setVisibility(0);
          break label188;
          paramViewGroup.eBR.setVisibility(0);
          paramViewGroup.eIJ.setVisibility(4);
          break label188;
          i = ((com.tencent.mm.plugin.account.friend.a.a)localObject).eJF;
          continue;
        }
        paramViewGroup.eIG.setVisibility(0);
        paramViewGroup.eIG.setText((CharSequence)localObject);
        paramViewGroup.eIG.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        return paramView;
      }
    }
    if (locala.eJF != i) {}
    for (int i = 1;; i = 0)
    {
      localObject = a(locala);
      if ((!bi.oW((String)localObject)) && (i != 0)) {
        break;
      }
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.MobileFriendAdapter", "get display show head return null, user[%s] pos[%d]", new Object[] { locala.getUsername(), Integer.valueOf(paramInt) });
      paramViewGroup.eIG.setVisibility(8);
      return paramView;
    }
    paramViewGroup.eIG.setVisibility(0);
    paramViewGroup.eIG.setText((CharSequence)localObject);
    paramViewGroup.eIG.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
    return paramView;
  }
  
  public final void pi(String paramString)
  {
    this.eIs = bi.oU(paramString.trim());
    aYc();
    WT();
  }
  
  final class a
  {
    String account;
    ImageView eBM;
    TextView eBR;
    View eIA;
    TextView eIG;
    TextView eIH;
    TextView eII;
    ProgressBar eIJ;
    int eIy;
    int status;
    
    public a(View paramView)
    {
      this.eIG = ((TextView)paramView.findViewById(a.f.friend_item_catalog));
      this.eBM = ((ImageView)paramView.findViewById(a.f.friend_item_avatar_iv));
      this.eIH = ((TextView)paramView.findViewById(a.f.friend_item_nickname));
      this.eII = ((TextView)paramView.findViewById(a.f.friend_item_wx_nickname));
      this.eIA = paramView.findViewById(a.f.friend_item_action_view);
      this.eBR = ((TextView)paramView.findViewById(a.f.friend_item_status_tv));
      this.eIJ = ((ProgressBar)paramView.findViewById(a.f.friend_item_status_pb));
      this.eIA.setOnClickListener(new d.a.1(this, d.this));
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/account/bind/ui/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */