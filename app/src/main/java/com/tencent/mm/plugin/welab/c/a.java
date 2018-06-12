package com.tencent.mm.plugin.welab.c;

import android.database.Cursor;
import com.tencent.mm.bt.h;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class a
  extends i<com.tencent.mm.plugin.welab.c.a.a>
{
  private e diF;
  
  public a(e parame)
  {
    super(parame, com.tencent.mm.plugin.welab.c.a.a.dhO, "LabAppInfo", null);
    this.diF = parame;
  }
  
  private boolean d(com.tencent.mm.plugin.welab.c.a.a parama)
  {
    com.tencent.mm.plugin.welab.c.a.a locala = new com.tencent.mm.plugin.welab.c.a.a();
    locala.field_LabsAppId = parama.field_LabsAppId;
    b(locala, new String[0]);
    if (parama.field_sequence <= locala.field_sequence)
    {
      x.i("LabAppInfoStorage", "sequence old origin.seq " + locala.field_sequence + " old.seq " + parama.field_sequence);
      return false;
    }
    return super.a(parama);
  }
  
  public final List<com.tencent.mm.plugin.welab.c.a.a> bYS()
  {
    Cursor localCursor = axc();
    ArrayList localArrayList = new ArrayList();
    while (localCursor.moveToNext())
    {
      com.tencent.mm.plugin.welab.c.a.a locala = new com.tencent.mm.plugin.welab.c.a.a();
      locala.d(localCursor);
      localArrayList.add(locala);
    }
    localCursor.close();
    return localArrayList;
  }
  
  public final void c(com.tencent.mm.plugin.welab.c.a.a parama)
  {
    if (!d(parama)) {
      b(parama);
    }
  }
  
  public final void cQ(List<com.tencent.mm.plugin.welab.c.a.a> paramList)
  {
    h localh = null;
    if ((this.diF instanceof h)) {
      localh = (h)this.diF;
    }
    for (long l = localh.dO(-1L);; l = 0L)
    {
      paramList = paramList.iterator();
      while (paramList.hasNext()) {
        c((com.tencent.mm.plugin.welab.c.a.a)paramList.next());
      }
      if (localh != null) {
        localh.gp(l);
      }
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/welab/c/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */