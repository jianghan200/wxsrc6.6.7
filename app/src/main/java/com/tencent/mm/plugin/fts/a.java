package com.tencent.mm.plugin.fts;

import android.database.Cursor;
import android.database.CursorWrapper;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashSet;
import java.util.Iterator;

public final class a
  extends CursorWrapper
{
  private static HashSet<Cursor> joG = new HashSet();
  
  public a(Cursor paramCursor)
  {
    super(paramCursor);
    joG.add(paramCursor);
    x.v("MicroMsg.FTS.FTSCursor", "add cursor %d", new Object[] { Integer.valueOf(paramCursor.hashCode()) });
  }
  
  public static final void aPK()
  {
    Iterator localIterator = joG.iterator();
    for (;;)
    {
      Cursor localCursor;
      if (localIterator.hasNext())
      {
        localCursor = (Cursor)localIterator.next();
        if (localCursor.isClosed()) {
          continue;
        }
      }
      try
      {
        localCursor.close();
        x.e("MicroMsg.FTS.FTSCursor", "not close cursor!!! %d", new Object[] { Integer.valueOf(localCursor.hashCode()) });
        continue;
        joG.clear();
        return;
      }
      catch (Exception localException)
      {
        for (;;) {}
      }
    }
  }
  
  public final void close()
  {
    super.close();
    Cursor localCursor = getWrappedCursor();
    joG.remove(localCursor);
    x.v("MicroMsg.FTS.FTSCursor", "remove cursor %d", new Object[] { Integer.valueOf(localCursor.hashCode()) });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/fts/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */