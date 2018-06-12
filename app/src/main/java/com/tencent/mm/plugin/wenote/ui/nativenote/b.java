package com.tencent.mm.plugin.wenote.ui.nativenote;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.tencent.mm.R.f;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.bp.a;
import com.tencent.mm.plugin.wenote.model.a.p;
import com.tencent.mm.plugin.wenote.model.f;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.h;
import com.tencent.mm.sdk.platformtools.bi;

public final class b
  extends com.tencent.mm.pluginsdk.ui.b.b
{
  private TextView eBO = null;
  
  public b(Context paramContext)
  {
    super(paramContext);
    if (this.view != null)
    {
      this.eBO = ((TextView)this.view.findViewById(R.h.wenote_banner_text_view));
      this.eBO.setTextSize(0, a.ad(this.eBO.getContext(), R.f.HintTextSize));
      this.view.setOnClickListener(new b.1(this));
    }
  }
  
  public final boolean anR()
  {
    Object localObject = h.bZX().bZY();
    int i;
    if ((localObject != null) && (((p)localObject).qpf) && (((p)localObject).qph > 0L) && (!bi.oW(((p)localObject).qpk))) {
      i = 1;
    }
    for (;;)
    {
      if (i != 0)
      {
        localObject = ((p)localObject).qpj;
        if (this.eBO != null) {
          this.eBO.setText((CharSequence)localObject);
        }
        setVisibility(0);
        return true;
        if ((localObject != null) && (!((p)localObject).qpf) && (f.eo(((p)localObject).qpg) != null)) {
          i = 1;
        }
      }
      else
      {
        if (localObject != null) {
          h.bZX().a(null);
        }
        setVisibility(8);
        return false;
      }
      i = 0;
    }
  }
  
  public final void destroy() {}
  
  public final int getLayoutId()
  {
    return R.i.wenote_banner_view;
  }
  
  public final int getOrder()
  {
    return 0;
  }
  
  public final void setVisibility(int paramInt)
  {
    if (this.view != null) {
      this.view.findViewById(R.h.wenote_banner_view).setVisibility(paramInt);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/wenote/ui/nativenote/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */