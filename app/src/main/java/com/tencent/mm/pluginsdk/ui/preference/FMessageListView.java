package com.tencent.mm.pluginsdk.ui.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.mm.R.h;
import com.tencent.mm.R.l;
import com.tencent.mm.ab.e;
import com.tencent.mm.ab.o;
import com.tencent.mm.az.d;
import com.tencent.mm.g.a.iq;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.model.c;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ay;
import com.tencent.mm.storage.bp;
import com.tencent.mm.ui.base.p;

public class FMessageListView
  extends LinearLayout
{
  private Context context;
  private final LinearLayout.LayoutParams jZp = new LinearLayout.LayoutParams(-1, -2);
  private j.a qOA = new FMessageListView.2(this);
  private j.a qOB = new FMessageListView.3(this);
  private a qOC;
  private a qOD;
  private TextView qOE;
  private a.a qOs;
  private com.tencent.mm.pluginsdk.c.a qOz = new FMessageListView.1(this);
  
  public FMessageListView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public FMessageListView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    this.context = paramContext;
    d.SE().c(this.qOA);
    com.tencent.mm.pluginsdk.c.a.a(iq.class.getName(), this.qOz);
    d.SH().c(this.qOB);
  }
  
  public final void a(b paramb)
  {
    if (paramb == null)
    {
      x.e("MicroMsg.FMessageListView", "addItem fail, provider is null");
      return;
    }
    if (paramb.id <= 0L)
    {
      x.e("MicroMsg.FMessageListView", "addItem fail, systemRowId invalid = " + paramb.id);
      return;
    }
    int j = getChildCount();
    int i = 1;
    Object localObject1;
    while (i < j)
    {
      localObject1 = getChildAt(i);
      if (((localObject1 instanceof a)) && (((View)localObject1).getTag() != null) && (((View)localObject1).getTag().equals(Long.valueOf(paramb.id))))
      {
        x.w("MicroMsg.FMessageListView", "addItem, item repeated, sysRowId = " + paramb.id);
        return;
      }
      i += 1;
    }
    if (paramb.qOI != null)
    {
      if (this.qOE == null) {
        this.qOE = ((TextView)findViewById(R.h.contact_info_fmessage_listview_safewarning_tv));
      }
      this.qOE.setText(paramb.qOI);
      this.qOE.setVisibility(0);
    }
    x.d("MicroMsg.FMessageListView", "addItem, current child count = " + j);
    if (j == 6)
    {
      x.i("MicroMsg.FMessageListView", "addItem, most 3 FMessageItemView, remove earliest");
      removeViewAt(1);
    }
    if (j == 1)
    {
      x.d("MicroMsg.FMessageListView", "addItem, current child count is 0, add two child view");
      this.qOC = new a(this.context);
      addView(this.qOC);
      this.qOD = new a(this.context);
      this.qOD.setContentText("");
      this.qOD.setBtnVisibility(0);
      addView(this.qOD, this.jZp);
      com.tencent.mm.model.au.HU();
      localObject1 = c.FR().Yg(paramb.username);
      if ((localObject1 != null) && (com.tencent.mm.l.a.gd(((ai)localObject1).field_type))) {
        break label482;
      }
      x.d("MicroMsg.FMessageListView", "addItem, reply btn visible, talker = " + paramb.username);
      this.qOC.setVisibility(0);
      this.qOD.setVisibility(0);
    }
    Object localObject2;
    while (paramb.ceW)
    {
      localObject1 = this.context.getString(R.l.fmessage_reply, new Object[] { paramb.dzA });
      i = 0;
      localObject2 = new a(this.context);
      ((a)localObject2).setTag(Long.valueOf(paramb.id));
      ((a)localObject2).setContentText((String)localObject1);
      ((a)localObject2).setBtnVisibility(8);
      if (i != 0) {
        ((a)localObject2).setOnLongClickListener(new FMessageListView.4(this, paramb));
      }
      addView((View)localObject2, getChildCount() - 2, this.jZp);
      return;
      label482:
      x.d("MicroMsg.FMessageListView", "addItem, reply btn gone, talker = " + paramb.username);
      this.qOC.setVisibility(8);
      this.qOD.setVisibility(8);
    }
    if ((paramb.nickname != null) && (paramb.nickname.length() > 0)) {
      localObject1 = paramb.nickname;
    }
    for (;;)
    {
      localObject1 = (String)localObject1 + ": " + paramb.dzA;
      i = 1;
      break;
      localObject2 = paramb.username;
      com.tencent.mm.model.au.HU();
      ab localab = c.FR().Yg(paramb.username);
      localObject1 = localObject2;
      if (localab != null)
      {
        localObject1 = localObject2;
        if ((int)localab.dhP > 0) {
          localObject1 = localab.BL();
        }
      }
    }
  }
  
  public final void detach()
  {
    d.SE().d(this.qOA);
    com.tencent.mm.pluginsdk.c.a.b(iq.class.getName(), this.qOz);
    d.SH().d(this.qOB);
    int j = getChildCount();
    int i = 0;
    while (i < j)
    {
      Object localObject = getChildAt(i);
      if ((localObject instanceof a))
      {
        localObject = (a)localObject;
        com.tencent.mm.model.au.DF().b(30, (e)localObject);
        if ((((a)localObject).tipDialog != null) && (((a)localObject).tipDialog.isShowing())) {
          ((a)localObject).tipDialog.dismiss();
        }
      }
      i += 1;
    }
    this.qOC = null;
    this.qOD = null;
  }
  
  public void setFMessageArgs(a.a parama)
  {
    this.qOs = parama;
    a.setFMessageArgs(parama);
  }
  
  public void setReplyBtnVisible(boolean paramBoolean)
  {
    int j = 0;
    int i = getChildCount();
    x.d("MicroMsg.FMessageListView", "setReplyBtnVisible, visible = " + paramBoolean + ", current child count = " + i);
    if (i <= 2) {
      x.e("MicroMsg.FMessageListView", "setReplyBtnVisible fail, childCount invalid = " + i);
    }
    do
    {
      return;
      if (this.qOC != null)
      {
        localObject = this.qOC;
        if (!paramBoolean) {
          break;
        }
        i = 0;
        ((a)localObject).setVisibility(i);
      }
    } while (this.qOD == null);
    Object localObject = this.qOD;
    if (paramBoolean) {}
    for (i = j;; i = 8)
    {
      ((a)localObject).setVisibility(i);
      return;
      i = 8;
      break;
    }
  }
  
  static final class a
    extends View
  {
    public a(Context paramContext)
    {
      super();
      setLayoutParams(new LinearLayout.LayoutParams(-1, 1));
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/pluginsdk/ui/preference/FMessageListView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */