package com.tencent.mm.pluginsdk.ui.d;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.plugin.comm.a.b;
import com.tencent.mm.pluginsdk.ui.applet.m;
import com.tencent.mm.pluginsdk.ui.chat.c;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.base.a.a;
import java.lang.ref.WeakReference;
import java.util.LinkedList;

public class n
  extends ClickableSpan
  implements a
{
  private WeakReference<View> cB = null;
  private int doi;
  private String fmS;
  public boolean lmQ = false;
  boolean mEnable = true;
  private Context qQs = null;
  private int qQx;
  private h qQy = null;
  private m qQz = null;
  
  public n() {}
  
  public n(int paramInt, m paramm)
  {
    int j;
    int i;
    if (paramm != null)
    {
      j = paramm.linkColor;
      i = paramm.backgroundColor;
    }
    for (;;)
    {
      if ((j == 0) && (i == 0)) {
        zu(paramInt);
      }
      for (;;)
      {
        this.qQy = new h();
        this.qQz = paramm;
        return;
        ez(j, i);
      }
      i = 0;
      j = 0;
    }
  }
  
  public final void ez(int paramInt1, int paramInt2)
  {
    this.qQx = paramInt1;
    this.doi = paramInt2;
  }
  
  public final int getType()
  {
    if (this.qQz == null) {
      return Integer.MAX_VALUE;
    }
    return this.qQz.type;
  }
  
  public final void kT(boolean paramBoolean)
  {
    this.lmQ = paramBoolean;
  }
  
  public void onClick(View paramView)
  {
    Object localObject2;
    Object localObject1;
    h localh;
    m localm;
    if ((this.qQy != null) && (this.qQz != null) && (this.mEnable))
    {
      localObject2 = this.qQy;
      if (this.qQs == null) {
        break label92;
      }
      localObject1 = this.qQs;
      ((h)localObject2).mContext = ((Context)localObject1);
      localh = this.qQy;
      localm = this.qQz;
      if (System.currentTimeMillis() - localh.pkb > localh.pka) {
        break label100;
      }
      x.e("MicroMsg.MMSpanClickListener", "process pass");
    }
    for (;;)
    {
      this.qQy.mContext = null;
      return;
      label92:
      localObject1 = paramView.getContext();
      break;
      label100:
      localh.pkb = System.currentTimeMillis();
      if (localm == null)
      {
        x.e("MicroMsg.MMSpanClickListener", "onClick error, hrefInfo is null!");
      }
      else
      {
        x.d("MicroMsg.MMSpanClickListener", "MMSpanClickListener.onClick, hrefInfo type = %d", new Object[] { Integer.valueOf(localm.type) });
        if (localh.mContext != null) {
          break label163;
        }
        x.e("MicroMsg.MMSpanClickListener", "onClick error, context is null!");
      }
    }
    label163:
    if ((j.qPZ != null) && (j.qPZ.size() > 0))
    {
      int i = j.qPZ.size();
      localObject1 = (g)j.qPZ.getLast();
      x.d("MicroMsg.MMSpanClickListener", "spanCallbackList.size:%d, get the last callback", new Object[] { Integer.valueOf(i) });
    }
    for (;;)
    {
      com.tencent.mm.storage.bd localbd;
      if ((paramView != null) && ((paramView.getTag() instanceof c)))
      {
        localbd = ((c)paramView.getTag()).bXQ;
        if (localbd != null)
        {
          localObject2 = localbd.field_talker;
          paramView = (View)localObject2;
          if (!((String)localObject2).endsWith("@chatroom")) {}
        }
      }
      for (paramView = com.tencent.mm.model.bd.iB(localbd.field_content);; paramView = null)
      {
        localm.username = paramView;
        if (!TextUtils.isEmpty(localh.fmS)) {
          localm.fmS = localh.fmS;
        }
        b.a.qPF.a(localh.mContext, localm, (g)localObject1);
        localm.fmS = null;
        break;
      }
      localObject1 = null;
    }
  }
  
  public final void setContext(Context paramContext)
  {
    this.qQs = paramContext;
    this.qQy.mContext = paramContext;
  }
  
  public final void setSessionId(String paramString)
  {
    this.fmS = paramString;
    if (this.qQy != null) {
      this.qQy.fmS = this.fmS;
    }
  }
  
  public void updateDrawState(TextPaint paramTextPaint)
  {
    super.updateDrawState(paramTextPaint);
    paramTextPaint.setColor(this.qQx);
    paramTextPaint.setUnderlineText(false);
    paramTextPaint.linkColor = this.qQx;
    if (this.lmQ)
    {
      paramTextPaint.bgColor = this.doi;
      return;
    }
    paramTextPaint.bgColor = 0;
  }
  
  public void zu(int paramInt)
  {
    Context localContext = ad.getContext();
    switch (paramInt)
    {
    default: 
      return;
    case 1: 
      ez(localContext.getResources().getColor(a.b.chat_url_color), -5908174);
      return;
    case 2: 
      ez(localContext.getResources().getColor(a.b.link_color), localContext.getResources().getColor(a.b.sns_link_bg_color));
      return;
    }
    ez(localContext.getResources().getColor(a.b.sns_lucky_item_gold), localContext.getResources().getColor(a.b.sns_link_bg_color));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/pluginsdk/ui/d/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */