package com.tencent.mm.r;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.protocal.c.by;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.List;

public final class e
  extends i<d>
{
  public static final String[] diD = { i.a(d.dhO, "FunctionMsgItem") };
  private static final String[] diE = { "*", "rowid" };
  private com.tencent.mm.sdk.e.e diF;
  
  public e(com.tencent.mm.sdk.e.e parame)
  {
    super(parame, d.dhO, "FunctionMsgItem", null);
    this.diF = parame;
  }
  
  public final List<d> Cb()
  {
    Cursor localCursor = this.diF.a("FunctionMsgItem", diE, "status<?", new String[] { "2" }, null, null, null, 2);
    if (localCursor == null) {}
    for (;;)
    {
      return null;
      try
      {
        if (localCursor.moveToFirst())
        {
          ArrayList localArrayList = new ArrayList();
          boolean bool;
          do
          {
            d locald = new d();
            locald.d(localCursor);
            localArrayList.add(locald);
            bool = localCursor.moveToNext();
          } while (bool);
          return localArrayList;
        }
        return null;
      }
      catch (Exception localException)
      {
        x.e("MicroMsg.FunctionMsgStorage", "getAllNeedFetchFunctionMsg error: %s", new Object[] { localException.getMessage() });
        return null;
      }
      finally
      {
        if (localCursor != null) {
          localCursor.close();
        }
      }
    }
  }
  
  public final void a(String paramString, d paramd)
  {
    x.i("MicroMsg.FunctionMsgStorage", "updateByFunctionMsgId, functionMsgId: %s", new Object[] { paramString });
    d locald = fw(paramString);
    if (locald != null) {}
    try
    {
      boolean bool1;
      if (paramd.field_addMsg == null)
      {
        bool1 = true;
        if (locald.field_addMsg != null) {
          break label158;
        }
      }
      label158:
      for (boolean bool2 = true;; bool2 = false)
      {
        x.i("MicroMsg.FunctionMsgStorage", "updateByFunctionMsgId, functionMsgId: %s, newFunctionMsgItem.msgContent==null: %s,oldFunctionMsgItem.msgContent==null: %s", new Object[] { paramString, Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
        paramd = paramd.wH();
        if ((paramd.get("addMsg") == null) && (locald.field_addMsg != null)) {
          paramd.put("addMsg", locald.field_addMsg.toByteArray());
        }
        x.i("MicroMsg.FunctionMsgStorage", "updateByFunctionMsgId, ret: %s", new Object[] { Integer.valueOf(this.diF.update("FunctionMsgItem", paramd, "functionmsgid=?", new String[] { paramString })) });
        return;
        bool1 = false;
        break;
      }
      return;
    }
    catch (Exception paramString)
    {
      x.e("MicroMsg.FunctionMsgStorage", "updateByFunctionMsgId error: %s", new Object[] { paramString.getMessage() });
    }
  }
  
  public final d fw(String paramString)
  {
    if (bi.oW(paramString)) {}
    for (;;)
    {
      return null;
      x.i("MicroMsg.FunctionMsgStorage", "getByFunctionMsgId, functionMsgId: %s", new Object[] { paramString });
      paramString = this.diF.a("FunctionMsgItem", diE, "functionmsgid=?", new String[] { paramString }, null, null, null, 2);
      try
      {
        if (paramString.moveToFirst())
        {
          d locald = new d();
          locald.d(paramString);
          return locald;
        }
        return null;
      }
      catch (Exception localException)
      {
        x.e("MicroMsg.FunctionMsgStorage", "getByFunctionMsgId error: %s", new Object[] { localException.getMessage() });
        return null;
      }
      finally
      {
        if (paramString != null) {
          paramString.close();
        }
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/r/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */