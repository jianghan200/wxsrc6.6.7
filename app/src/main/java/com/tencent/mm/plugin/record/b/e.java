package com.tencent.mm.plugin.record.b;

import android.database.Cursor;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.record.a.c;
import com.tencent.mm.plugin.record.a.d;
import com.tencent.mm.plugin.record.a.f;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.x;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public final class e
  extends i<f>
  implements d
{
  private com.tencent.mm.sdk.e.e diF;
  private Vector<c> msa = new Vector();
  
  public e(com.tencent.mm.sdk.e.e parame)
  {
    super(parame, f.dhO, "RecordCDNInfo", null);
    this.diF = parame;
  }
  
  private void b(int paramInt, f paramf)
  {
    g.Em().H(new e.3(this, paramInt, paramf));
  }
  
  public final f Kr(String paramString)
  {
    Object localObject = null;
    paramString = "SELECT * FROM RecordCDNInfo WHERE mediaId='" + paramString + "'";
    Cursor localCursor = this.diF.b(paramString, null, 2);
    paramString = (String)localObject;
    if (localCursor != null)
    {
      paramString = (String)localObject;
      if (localCursor.moveToFirst())
      {
        paramString = new f();
        paramString.d(localCursor);
      }
    }
    if (localCursor != null) {
      localCursor.close();
    }
    return paramString;
  }
  
  public final void a(c paramc)
  {
    g.Em().H(new e.1(this, paramc));
  }
  
  public final boolean a(f paramf)
  {
    if (super.a(paramf))
    {
      b(1, paramf);
      return true;
    }
    return false;
  }
  
  public final boolean a(f paramf, String... paramVarArgs)
  {
    boolean bool = false;
    if (super.a(paramf, paramVarArgs))
    {
      b(0, paramf);
      bool = true;
    }
    return bool;
  }
  
  public final void b(c paramc)
  {
    g.Em().H(new e.2(this, paramc));
  }
  
  public final boolean b(f paramf)
  {
    if (paramf != null)
    {
      x.v("MicroMsg.RecordMsgCDNStorage", "insert record cdn info %s", new Object[] { paramf });
      if (super.b(paramf))
      {
        b(2, paramf);
        return true;
      }
    }
    else
    {
      x.e("MicroMsg.RecordMsgCDNStorage", "insert null record cdn info");
      return false;
    }
    return false;
  }
  
  public final boolean b(f paramf, String... paramVarArgs)
  {
    if (super.c(paramf, paramVarArgs))
    {
      b(1, paramf);
      return true;
    }
    return false;
  }
  
  public final List<f> bqp()
  {
    LinkedList localLinkedList = new LinkedList();
    Cursor localCursor = this.diF.b("SELECT * FROM RecordCDNInfo WHERE status != 3 AND status != 4 AND status != 2 AND status != -1", null, 2);
    if (localCursor != null)
    {
      while (localCursor.moveToNext())
      {
        f localf = new f();
        localf.d(localCursor);
        localLinkedList.add(localf);
      }
      localCursor.close();
    }
    x.d("MicroMsg.RecordMsgCDNStorage", "get all finish, result count %d", new Object[] { Integer.valueOf(localLinkedList.size()) });
    return localLinkedList;
  }
  
  public final List<f> vk(int paramInt)
  {
    LinkedList localLinkedList = new LinkedList();
    Object localObject = "SELECT * FROM RecordCDNInfo WHERE recordLocalId = " + paramInt;
    localObject = this.diF.b((String)localObject, null, 2);
    if (localObject != null)
    {
      while (((Cursor)localObject).moveToNext())
      {
        f localf = new f();
        localf.d((Cursor)localObject);
        localLinkedList.add(localf);
      }
      ((Cursor)localObject).close();
    }
    x.d("MicroMsg.RecordMsgCDNStorage", "get all finish, result count %d", new Object[] { Integer.valueOf(localLinkedList.size()) });
    return localLinkedList;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/record/b/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */