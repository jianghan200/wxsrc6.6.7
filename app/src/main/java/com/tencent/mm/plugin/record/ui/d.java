package com.tencent.mm.plugin.record.ui;

import android.content.Context;
import com.tencent.mm.plugin.fav.a.g;
import com.tencent.mm.plugin.fav.a.p;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;
import java.util.List;

public final class d
  extends h
{
  private static HashMap<String, Boolean> msx = new HashMap();
  public p msy = new d.1(this);
  
  public d(Context paramContext, h.a parama)
  {
    super(paramContext, parama);
  }
  
  public final void a(a parama)
  {
    x.i("MicroMsg.FavRecordAdapter", "updateData localId %s,status %s", new Object[] { Long.valueOf(((b)parama).msw.field_localId), Integer.valueOf(((b)parama).msw.field_itemStatus) });
    this.msQ = parama;
    this.msv.clear();
    this.msv.addAll(parama.msv);
    notifyDataSetChanged();
  }
  
  public final void d(com.tencent.mm.plugin.record.ui.a.b paramb)
  {
    x.d("MicroMsg.FavRecordAdapter", "setupRecord %s", new Object[] { Long.valueOf(((b)this.msQ).msw.field_localId) });
    paramb.fromScene = 1;
    paramb.bjS = 1;
    paramb.msw = ((b)this.msQ).msw;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/record/ui/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */