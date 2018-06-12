package com.tencent.mm.plugin.multitalk.ui;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;
import com.tencent.mm.R.e;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.g.a.jr;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.model.q;
import com.tencent.mm.model.s;
import com.tencent.mm.plugin.multitalk.ui.widget.d;
import com.tencent.mm.pluginsdk.ui.MultiSelectContactView;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.contact.MMBaseSelectContactUI;
import com.tencent.mm.ui.contact.m;
import com.tencent.mm.ui.contact.n;
import com.tencent.mm.ui.contact.o;
import com.tencent.mm.ui.s.b;
import java.util.HashSet;

@com.tencent.mm.ui.base.a(3)
public class MultiTalkSelectContactUI
  extends MMBaseSelectContactUI
{
  private String chatroomName;
  private HashSet<String> eCq;
  private HashSet<String> eCr;
  private c ltK = new c() {};
  private boolean lva;
  private d lvb;
  private boolean lvc = false;
  
  private void Wp()
  {
    if (this.eCr.size() > 0)
    {
      enableOptionMenu(1, true);
      return;
    }
    enableOptionMenu(1, false);
  }
  
  protected final void Wj()
  {
    super.Wj();
    this.lva = getIntent().getBooleanExtra("key_need_gallery", false);
    this.chatroomName = getIntent().getStringExtra("chatroomName");
    if (!s.fq(this.chatroomName)) {
      finish();
    }
    this.eCr = new HashSet();
    this.eCq = new HashSet();
  }
  
  protected final boolean Wk()
  {
    return false;
  }
  
  protected final boolean Wl()
  {
    return false;
  }
  
  protected final String Wm()
  {
    return getIntent().getStringExtra("titile");
  }
  
  protected final o Wn()
  {
    return new a(this, this.chatroomName);
  }
  
  protected final m Wo()
  {
    return new b(this, this.chatroomName);
  }
  
  public final boolean a(com.tencent.mm.ui.contact.a.a parama)
  {
    if ((parama.ujX) && (parama.guS != null)) {
      return this.eCr.contains(parama.guS.field_username);
    }
    return false;
  }
  
  public final boolean b(com.tencent.mm.ui.contact.a.a parama)
  {
    if ((parama.ujX) && (parama.guS != null)) {
      return this.eCq.contains(parama.guS.field_username);
    }
    return false;
  }
  
  protected final void bbH()
  {
    super.bbH();
    YC();
  }
  
  protected final int getForceOrientation()
  {
    return 1;
  }
  
  protected final int getLayoutId()
  {
    return R.i.multitalk_select_contact_ui;
  }
  
  public final void iV(int paramInt)
  {
    int k = 1;
    n localn = cyp();
    Object localObject = localn.FM(paramInt - getContentLV().getHeaderViewsCount());
    if (localObject == null) {}
    do
    {
      do
      {
        return;
      } while (((com.tencent.mm.ui.contact.a.a)localObject).guS == null);
      x.i("MicroMsg.multitalk.MultiTalkSelectContactUI", "ClickUser=%s", new Object[] { ((com.tencent.mm.ui.contact.a.a)localObject).guS.field_username });
      localObject = ((com.tencent.mm.ui.contact.a.a)localObject).guS.field_username;
    } while (q.GF().equals(localObject));
    cyv();
    d locald;
    int i;
    int j;
    if (this.eCr.contains(localObject)) {
      if (this.lva)
      {
        locald = this.lvb;
        if (locald.size != 0)
        {
          i = -1;
          paramInt = 0;
          if (paramInt >= locald.lvA.getChildCount()) {
            break label446;
          }
          if (!locald.lvA.getChildAt(paramInt).getTag().equals(localObject)) {
            break label301;
          }
          j = 1;
        }
      }
    }
    for (;;)
    {
      if (paramInt < 0)
      {
        i = 0;
        label163:
        if (i < locald.lvB.getChildCount()) {
          if (!locald.lvB.getChildAt(i).getTag().equals(localObject)) {}
        }
      }
      for (paramInt = k;; paramInt = k)
      {
        if (i >= 0)
        {
          if (paramInt != 0)
          {
            locald.lvB.removeViewAt(i);
            locald.size -= 1;
          }
          if (j != 0)
          {
            if (locald.size <= 5)
            {
              locald.lvA.removeViewAt(i);
              locald.size -= 1;
            }
          }
          else
          {
            label261:
            locald.tm(locald.size);
            locald.tn(locald.size);
          }
        }
        else
        {
          this.eCr.remove(localObject);
        }
        for (;;)
        {
          localn.notifyDataSetChanged();
          Wp();
          return;
          label301:
          paramInt += 1;
          break;
          i += 1;
          break label163;
          locald.lvA.removeViewAt(i);
          View localView = locald.lvB.getChildAt(0);
          locald.lvB.removeViewAt(0);
          locald.lvA.addView(localView);
          locald.size -= 1;
          break label261;
          if (this.eCq.size() + this.eCr.size() == 9)
          {
            this.lvc = true;
            Toast.makeText(this, R.l.multitalk_select_at, 0).show();
            return;
          }
          if (this.lva) {
            this.lvb.HQ((String)localObject);
          }
          this.eCr.add(localObject);
        }
        k = 0;
        i = paramInt;
      }
      label446:
      j = 0;
      paramInt = i;
    }
  }
  
  protected void initView()
  {
    super.initView();
    lF(getResources().getColor(R.e.dark_actionbar_color));
    cqh();
    this.lvb = new d(this);
    if (this.lva) {
      this.lvb.setVisible(true);
    }
    for (;;)
    {
      int i = R.l.app_ok;
      if (this.lva) {
        i = R.l.multitalk_start_talk;
      }
      a(1, getString(i), new MultiTalkSelectContactUI.1(this), s.b.tmX);
      Wp();
      this.lbw.setBackgroundResource(R.e.dark_actionbar_color);
      this.lbw.getInputText().setTextColor(-1);
      return;
      this.lvb.setVisible(false);
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    paramBundle = getIntent().getStringExtra("always_select_contact");
    if (!bi.oW(paramBundle)) {
      this.eCq.addAll(bi.F(paramBundle.split(",")));
    }
    this.eCq.add(q.GF());
    if (this.lva) {
      this.lvb.HQ(q.GF());
    }
    com.tencent.mm.sdk.b.a.sFg.b(this.ltK);
  }
  
  protected void onDestroy()
  {
    com.tencent.mm.sdk.b.a.sFg.c(this.ltK);
    super.onDestroy();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/multitalk/ui/MultiTalkSelectContactUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */