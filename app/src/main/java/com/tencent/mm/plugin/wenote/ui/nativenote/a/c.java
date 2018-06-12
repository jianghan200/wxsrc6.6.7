package com.tencent.mm.plugin.wenote.ui.nativenote.a;

import android.support.v7.widget.RecyclerView.a;
import com.tencent.mm.plugin.wenote.model.a.b;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.k;
import com.tencent.mm.plugin.wenote.ui.nativenote.b.a;
import com.tencent.mm.plugin.wenote.ui.nativenote.b.f;
import com.tencent.mm.sdk.platformtools.x;

public final class c
  extends RecyclerView.a<a>
{
  private final String TAG = "MicroMsg.Note.NoteRecyclerViewAdapter";
  private k qtF;
  private f qvf;
  
  public c(k paramk)
  {
    this.qtF = paramk;
    this.qvf = new f();
  }
  
  private void a(a parama, int paramInt)
  {
    boolean bool = true;
    for (;;)
    {
      try
      {
        b localb = com.tencent.mm.plugin.wenote.model.nativenote.manager.c.bZD().Bv(paramInt);
        if ((localb != null) && (localb.getType() == parama.caZ()))
        {
          parama.a(localb, paramInt, localb.getType());
          return;
        }
        if (localb == null) {
          x.e("MicroMsg.Note.NoteRecyclerViewAdapter", "onBindViewHolder, item is null %b, position is %d", new Object[] { Boolean.valueOf(bool), Integer.valueOf(paramInt) });
        } else {
          bool = false;
        }
      }
      finally {}
    }
  }
  
  public final int getItemCount()
  {
    return com.tencent.mm.plugin.wenote.model.nativenote.manager.c.bZD().size();
  }
  
  public final int getItemViewType(int paramInt)
  {
    b localb = com.tencent.mm.plugin.wenote.model.nativenote.manager.c.bZD().Bv(paramInt);
    if (localb != null) {
      return localb.getType();
    }
    x.e("MicroMsg.Note.NoteRecyclerViewAdapter", "getItemViewType, item is null, position is %d", new Object[] { Integer.valueOf(paramInt) });
    return 0;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/wenote/ui/nativenote/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */