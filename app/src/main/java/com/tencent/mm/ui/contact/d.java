package com.tencent.mm.ui.contact;

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.R.e;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.model.s;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.d.j;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ay;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.applet.b;
import com.tencent.mm.ui.applet.b.b;
import com.tencent.mm.ui.base.MMSlideDelView;
import com.tencent.mm.ui.base.MMSlideDelView.c;
import com.tencent.mm.ui.base.MMSlideDelView.d;
import com.tencent.mm.ui.base.MMSlideDelView.f;
import com.tencent.mm.ui.base.MMSlideDelView.g;
import com.tencent.mm.ui.base.MaskLayout;
import java.util.List;

public final class d
  extends com.tencent.mm.ui.r<ab>
{
  protected MMActivity bGc;
  b eKg = null;
  private b.b eKh = null;
  protected List<String> gRN = null;
  protected MMSlideDelView.g hkN;
  protected MMSlideDelView.c hkO;
  protected MMSlideDelView.d hkQ = MMSlideDelView.getItemStatusCallBack();
  protected MMSlideDelView.f lCE;
  com.tencent.mm.pluginsdk.ui.d qJh;
  protected String ugF = null;
  
  public d(Context paramContext, String paramString)
  {
    super(paramContext, new ab());
    this.bGc = ((MMActivity)paramContext);
    this.ugF = paramString;
    this.eKg = new b(new d.1(this));
  }
  
  private String Z(ab paramab)
  {
    if (paramab.field_showHead == 31) {
      return "";
    }
    if (paramab.field_showHead == 43) {
      return this.bGc.getString(R.l.room_head_name);
    }
    return String.valueOf((char)paramab.field_showHead);
  }
  
  private void a(a parama, int paramInt1, int paramInt2)
  {
    ab localab = (ab)getItem(paramInt1 + 1);
    if ((localab == null) || ((localab.field_showHead != paramInt2) && (!com.tencent.mm.platformtools.ai.oW(Z(localab))))) {
      parama.uir.setBackgroundResource(0);
    }
  }
  
  protected final void WS()
  {
    WT();
  }
  
  public final void WT()
  {
    try
    {
      au.HU();
      Cursor localCursor = c.FR().c(this.ugF, "", this.gRN);
      aYc();
      setCursor(localCursor);
      notifyDataSetChanged();
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void a(MMSlideDelView.f paramf)
  {
    this.lCE = paramf;
  }
  
  public final int getCount()
  {
    return getCursor().getCount();
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (this.eKh == null) {
      this.eKh = new d.2(this);
    }
    if (this.eKg != null) {
      this.eKg.a(paramInt, this.eKh);
    }
    Object localObject1;
    int i;
    label186:
    Object localObject2;
    label253:
    label271:
    MMActivity localMMActivity;
    if (paramView == null)
    {
      paramView = View.inflate(this.bGc, R.i.chatroom_address_list_item, null);
      paramViewGroup = new a();
      paramViewGroup.kuR = ((TextView)paramView.findViewById(R.h.contactitem_catalog));
      paramViewGroup.hPe = ((MaskLayout)paramView.findViewById(R.h.contactitem_avatar));
      paramViewGroup.eMf = ((TextView)paramView.findViewById(R.h.contactitem_nick));
      paramViewGroup.uir = ((ViewGroup)paramView.findViewById(R.h.contactitem_layout));
      localObject1 = paramViewGroup.uir.getLayoutParams();
      ((ViewGroup.LayoutParams)localObject1).height = ((int)(com.tencent.mm.bp.a.ae(this.bGc, R.f.ContactListHeight) * com.tencent.mm.bp.a.fh(this.bGc)));
      paramViewGroup.uir.setLayoutParams((ViewGroup.LayoutParams)localObject1);
      paramView.setTag(paramViewGroup);
      localObject1 = (ab)getItem(paramInt - 1);
      if (localObject1 != null) {
        break label408;
      }
      i = -1;
      localObject1 = (ab)getItem(paramInt);
      if (paramInt != 0) {
        break label449;
      }
      localObject2 = Z((ab)localObject1);
      if (!com.tencent.mm.platformtools.ai.oW((String)localObject2)) {
        break label418;
      }
      x.w("MicroMsg.ChatroomContactAdapter", "get display show head return null, user[%s] pos[%d]", new Object[] { ((com.tencent.mm.g.c.ai)localObject1).field_username, Integer.valueOf(paramInt) });
      paramViewGroup.kuR.setVisibility(8);
      if (getItem(paramInt + 1) == null) {
        paramViewGroup.uir.setBackgroundResource(0);
      }
      localObject2 = paramViewGroup.eMf;
      localMMActivity = this.bGc;
      if (s.hO(((com.tencent.mm.g.c.ai)localObject1).field_username)) {
        break label622;
      }
    }
    label408:
    label418:
    label449:
    label622:
    for (paramInt = R.e.mm_list_textcolor_one;; paramInt = R.e.mm_list_textcolor_spuser)
    {
      ((TextView)localObject2).setTextColor(com.tencent.mm.bp.a.ac(localMMActivity, paramInt));
      localObject2 = (ImageView)paramViewGroup.hPe.getContentView();
      a.b.a((ImageView)localObject2, ((com.tencent.mm.g.c.ai)localObject1).field_username);
      localObject2 = (com.tencent.mm.pluginsdk.ui.a)((ImageView)localObject2).getDrawable();
      if (this.qJh != null) {
        this.qJh.a((com.tencent.mm.pluginsdk.ui.d.a)localObject2);
      }
      paramViewGroup.hPe.setMaskDrawable(null);
      try
      {
        paramViewGroup.eMf.setText(j.a(this.bGc, com.tencent.mm.model.r.gT(((com.tencent.mm.g.c.ai)localObject1).field_username), (int)paramViewGroup.eMf.getTextSize()));
        return paramView;
      }
      catch (Exception localException)
      {
        paramViewGroup.eMf.setText("");
      }
      paramViewGroup = (a)paramView.getTag();
      break;
      i = ((com.tencent.mm.g.c.ai)localObject1).field_showHead;
      break label186;
      paramViewGroup.kuR.setVisibility(0);
      paramViewGroup.kuR.setText((CharSequence)localObject2);
      paramViewGroup.kuR.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
      break label253;
      if ((paramInt > 0) && (((com.tencent.mm.g.c.ai)localObject1).field_showHead != i))
      {
        localObject2 = Z((ab)localObject1);
        paramViewGroup.uir.setBackgroundResource(R.g.comm_list_item_selector);
        if (com.tencent.mm.platformtools.ai.oW((String)localObject2))
        {
          x.w("MicroMsg.ChatroomContactAdapter", "get display show head return null, user[%s] pos[%d]", new Object[] { ((com.tencent.mm.g.c.ai)localObject1).field_username, Integer.valueOf(paramInt) });
          paramViewGroup.kuR.setVisibility(8);
        }
        for (;;)
        {
          a(paramViewGroup, paramInt, i);
          break;
          paramViewGroup.kuR.setVisibility(0);
          paramViewGroup.kuR.setText((CharSequence)localObject2);
          if (((com.tencent.mm.g.c.ai)localObject1).field_showHead == 32)
          {
            paramViewGroup.kuR.setCompoundDrawablesWithIntrinsicBounds(R.g.mm_contact_star, 0, 0, 0);
            paramViewGroup.kuR.setCompoundDrawablePadding(2);
          }
          else
          {
            paramViewGroup.kuR.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
          }
        }
      }
      paramViewGroup.kuR.setVisibility(8);
      a(paramViewGroup, paramInt, i);
      break label271;
    }
    return paramView;
  }
  
  public final void setGetViewPositionCallback(MMSlideDelView.c paramc)
  {
    this.hkO = paramc;
  }
  
  public final void setPerformItemClickListener(MMSlideDelView.g paramg)
  {
    this.hkN = paramg;
  }
  
  protected static final class a
  {
    public TextView eMf;
    public MaskLayout hPe;
    public TextView kuR;
    public ViewGroup uir;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/ui/contact/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */