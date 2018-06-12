package com.tencent.mm.plugin.record.ui;

import android.content.Context;
import com.tencent.mm.plugin.record.a.c;
import com.tencent.mm.plugin.record.ui.a.b;
import java.util.List;

public final class e
  extends h
  implements c
{
  int fromScene = 0;
  
  public e(Context paramContext, h.a parama)
  {
    super(paramContext, parama);
  }
  
  public final void a(int paramInt, com.tencent.mm.plugin.record.a.f paramf)
  {
    bqH();
  }
  
  public final void a(a parama)
  {
    this.msQ = parama;
    this.msv.clear();
    this.msv.addAll(parama.msv);
    notifyDataSetChanged();
  }
  
  public final void d(b paramb)
  {
    paramb.bjS = 0;
    paramb.fromScene = this.fromScene;
    paramb.bJC = ((f)this.msQ).bJC;
    paramb.bXN = ((f)this.msQ).bXN;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/record/ui/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */