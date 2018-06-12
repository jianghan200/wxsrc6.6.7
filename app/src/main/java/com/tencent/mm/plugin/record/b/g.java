package com.tencent.mm.plugin.record.b;

import android.database.Cursor;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.x;
import java.util.LinkedList;
import java.util.List;

public final class g
  extends i<com.tencent.mm.plugin.record.a.g>
  implements com.tencent.mm.plugin.record.a.e
{
  private com.tencent.mm.sdk.e.e diF;
  
  public g(com.tencent.mm.sdk.e.e parame)
  {
    super(parame, com.tencent.mm.plugin.record.a.g.dhO, "RecordMessageInfo", null);
    this.diF = parame;
  }
  
  public final List<com.tencent.mm.plugin.record.a.g> bqq()
  {
    LinkedList localLinkedList = new LinkedList();
    Cursor localCursor = axc();
    if (localCursor != null)
    {
      localCursor.moveToFirst();
      while (!localCursor.isAfterLast())
      {
        com.tencent.mm.plugin.record.a.g localg = new com.tencent.mm.plugin.record.a.g();
        localg.d(localCursor);
        localLinkedList.add(localg);
        localCursor.moveToNext();
      }
      localCursor.close();
    }
    x.d("MicroMsg.RecordMsgStorage", "get all finish, result count %d", new Object[] { Integer.valueOf(localLinkedList.size()) });
    return localLinkedList;
  }
  
  public final void vl(int paramInt)
  {
    x.d("MicroMsg.RecordMsgStorage", "delete record msg item, local id %d, result %d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(this.diF.delete("RecordMessageInfo", "localId=?", new String[] { String.valueOf(paramInt) })) });
  }
  
  public final com.tencent.mm.plugin.record.a.g vm(int paramInt)
  {
    Object localObject2 = null;
    Object localObject1 = "SELECT * FROM RecordMessageInfo WHERE localId=" + paramInt;
    x.d("MicroMsg.RecordMsgStorage", "get by local id, sql[%s], local[%d]", new Object[] { localObject1, Integer.valueOf(paramInt) });
    Cursor localCursor = this.diF.b((String)localObject1, null, 2);
    localObject1 = localObject2;
    if (localCursor != null)
    {
      localObject1 = localObject2;
      if (localCursor.moveToFirst())
      {
        localObject1 = new com.tencent.mm.plugin.record.a.g();
        ((com.tencent.mm.plugin.record.a.g)localObject1).d(localCursor);
      }
    }
    if (localCursor != null) {
      localCursor.close();
    }
    return (com.tencent.mm.plugin.record.a.g)localObject1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/record/b/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */