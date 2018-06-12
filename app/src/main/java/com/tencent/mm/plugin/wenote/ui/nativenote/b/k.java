package com.tencent.mm.plugin.wenote.ui.nativenote.b;

import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout.LayoutParams;
import com.tencent.mm.R.h;
import com.tencent.mm.plugin.wenote.model.a.b;
import com.tencent.mm.plugin.wenote.model.a.h;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.c;
import com.tencent.mm.pluginsdk.ui.d.j;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.x;

public final class k
  extends a
{
  private WXRTEditText qvK;
  
  public k(View paramView, com.tencent.mm.plugin.wenote.model.nativenote.manager.k paramk)
  {
    super(paramView, paramk);
    this.qvK = ((WXRTEditText)paramView.findViewById(R.h.rte_text));
    if ((paramk.qrC != 2) || (!this.qtF.qrD))
    {
      this.qvK.setKeyListener(null);
      this.qvK.setFocusable(false);
      this.qvK.setClickable(true);
    }
    this.qvK.qqL = this;
    this.qvK.setEditTextType(0);
    this.qtF.o(this.qvK);
    this.qvK.getViewTreeObserver().addOnGlobalLayoutListener(new k.1(this));
  }
  
  public final void a(b paramb, int paramInt1, int paramInt2)
  {
    this.qvK.setPosInDataList(paramInt1);
    paramb = (h)paramb;
    paramb.qoM = this.qvK;
    paramb.qoK = null;
    paramb.qoL = null;
    Object localObject = c.bZD().Bv(paramInt1 - 1);
    if ((localObject != null) && (((b)localObject).getType() == 1))
    {
      localObject = (LinearLayout.LayoutParams)this.qvK.getLayoutParams();
      ((LinearLayout.LayoutParams)localObject).topMargin = 0;
      this.qvK.setLayoutParams((ViewGroup.LayoutParams)localObject);
    }
    localObject = c.bZD().Bv(paramInt1 + 1);
    if ((localObject != null) && (((b)localObject).getType() == 1))
    {
      localObject = (LinearLayout.LayoutParams)this.qvK.getLayoutParams();
      ((LinearLayout.LayoutParams)localObject).bottomMargin = 0;
      this.qvK.setLayoutParams((ViewGroup.LayoutParams)localObject);
    }
    if ((this.qtF.qrC != 2) || (!this.qtF.qrD))
    {
      this.qvK.setRichTextEditing(paramb.content);
      j.g(this.qvK);
    }
    for (;;)
    {
      x.i("MicroMsg.Note.NoteTextItemHolder", "TextItemHolder position is " + gl());
      return;
      ah.A(new k.2(this, paramb));
    }
  }
  
  public final int caZ()
  {
    return 1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/wenote/ui/nativenote/b/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */