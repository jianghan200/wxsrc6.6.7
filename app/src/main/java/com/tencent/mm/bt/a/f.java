package com.tencent.mm.bt.a;

import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.DataSetObserver;
import android.util.SparseArray;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.wcdb.AbstractCursor;
import com.tencent.wcdb.Cursor;
import com.tencent.wcdb.DatabaseUtils;
import com.tencent.wcdb.database.SQLiteCursorDriver;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.database.SQLiteDatabase.CursorFactory;
import com.tencent.wcdb.database.SQLiteProgram;
import com.tencent.wcdb.support.CancellationSignal;
import com.tencent.wcdb.support.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public final class f
  extends AbstractCursor
  implements d
{
  public static final SQLiteDatabase.CursorFactory FACTORY = new SQLiteDatabase.CursorFactory()
  {
    public final Cursor newCursor(SQLiteDatabase paramAnonymousSQLiteDatabase, SQLiteCursorDriver paramAnonymousSQLiteCursorDriver, String paramAnonymousString, SQLiteProgram paramAnonymousSQLiteProgram)
    {
      return new f(paramAnonymousSQLiteCursorDriver, paramAnonymousString, (h)paramAnonymousSQLiteProgram);
    }
    
    public final SQLiteProgram newQuery(SQLiteDatabase paramAnonymousSQLiteDatabase, String paramAnonymousString, Object[] paramAnonymousArrayOfObject, CancellationSignal paramAnonymousCancellationSignal)
    {
      return new h(paramAnonymousSQLiteDatabase, paramAnonymousString, paramAnonymousCancellationSignal);
    }
  };
  private Map<String, Integer> mColumnNameMap;
  private final String[] mColumns;
  private int mCount = -1;
  private final SQLiteCursorDriver mDriver;
  private final String mEditTable;
  private final Throwable mStackTrace;
  private int pageSize = 3000;
  private final h tet;
  public a teu;
  private boolean tev;
  private b<a> tew;
  c tex;
  private boolean tey;
  
  public f(SQLiteCursorDriver paramSQLiteCursorDriver, String paramString, h paramh)
  {
    if (paramh == null) {
      throw new IllegalArgumentException("query object cannot be null");
    }
    this.mStackTrace = null;
    this.mDriver = paramSQLiteCursorDriver;
    this.mEditTable = paramString;
    this.mColumnNameMap = null;
    this.tet = paramh;
    this.mColumns = paramh.getColumnNames();
    this.mRowIdColumnIndex = DatabaseUtils.findRowIdColumnIndex(this.mColumns);
  }
  
  private int DB(int paramInt)
  {
    if (this.tev)
    {
      if (this.tew == null) {
        this.tew = new b()
        {
          public final ArrayList<a> ae(ArrayList<Object> paramAnonymousArrayList)
          {
            f localf = f.this;
            if (localf.teu != null) {
              return localf.teu.ae(paramAnonymousArrayList);
            }
            return null;
          }
          
          public final a coc()
          {
            f localf = f.this;
            if (localf.teu != null) {
              return localf.teu.coc();
            }
            return null;
          }
        };
      }
      this.tew.mStartPos = paramInt;
      return this.tet.a(this.tew, paramInt, this.pageSize);
    }
    cod();
    return this.tet.a(this.tex, paramInt, this.pageSize);
  }
  
  private void cod()
  {
    if (this.tex == null) {
      this.tex = new c(this.mColumns, (byte)0);
    }
  }
  
  public final boolean Dx(int paramInt)
  {
    if (!this.tev) {}
    b localb;
    do
    {
      do
      {
        return false;
        localb = this.tew;
      } while (paramInt > 50);
      if (localb.teg < 10) {
        return true;
      }
    } while (paramInt / localb.teg >= 0.1D);
    return true;
  }
  
  public final a Dy(int paramInt)
  {
    Object localObject1 = null;
    int i = 0;
    b localb;
    if (this.tew != null)
    {
      localb = this.tew;
      if (!localb.DA(paramInt)) {
        break label223;
      }
      Object localObject2 = localb.tef.get(paramInt);
      a locala = (a)localb.teh.get(localObject2);
      localObject1 = locala;
      if (locala == null)
      {
        x.i("MicroMsg.CursorDataWindow", "get data null %s", new Object[] { localObject2 });
        if (localb.tei.size() != 0)
        {
          localObject1 = localb.ae(localb.tei);
          if (localObject1 != null) {
            if (i < ((ArrayList)localObject1).size())
            {
              locala = (a)((ArrayList)localObject1).get(i);
              if (locala != null) {
                localb.b(locala.getKey(), locala);
              }
              for (;;)
              {
                i += 1;
                break;
                x.e("MicroMsg.CursorDataWindow", "newcursor obj is null");
              }
            }
          }
          localb.tei.clear();
        }
        locala = (a)localb.teh.get(localObject2);
        localObject1 = locala;
        if (locala == null)
        {
          x.e("MicroMsg.CursorDataWindow", "newcursor error obj : " + localObject2 + "pos:" + paramInt);
          localObject1 = locala;
        }
      }
    }
    return (a)localObject1;
    label223:
    x.e("MicroMsg.CursorDataWindow", "newcursor cursor getItem error: pos " + paramInt + " loaded num :" + localb.tef.size());
    return null;
  }
  
  public final void Dz(int paramInt)
  {
    if ((paramInt <= 15000) && (paramInt >= 2000)) {
      this.pageSize = paramInt;
    }
  }
  
  public final void a(a parama)
  {
    this.teu = parama;
  }
  
  public final boolean a(Object paramObject, a parama)
  {
    if ((this.tev) && (this.tew != null))
    {
      if ((!this.tey) && ((paramObject instanceof Object[])) && (this.tew.cm(paramObject)))
      {
        this.mCount -= ((Object[])paramObject).length;
        this.pageSize -= ((Object[])paramObject).length;
      }
      localb = this.tew;
      if (parama != null)
      {
        x.v("MicroMsg.CursorDataWindow", "newcursor cursor update Memory key : " + paramObject + "values : " + parama);
        localb.b(paramObject, parama);
      }
    }
    while (this.tev)
    {
      b localb;
      return false;
      if ((paramObject instanceof Object[]))
      {
        paramObject = (Object[])paramObject;
        int j = paramObject.length;
        int i = 0;
        while (i < j)
        {
          parama = paramObject[i];
          localb.teh.remove(parama);
          i += 1;
        }
        localb.t((Object[])paramObject);
        return false;
      }
      if (localb.tei == null) {
        localb.tei = new ArrayList();
      }
      if (!localb.tei.contains(paramObject))
      {
        localb.tei.add(paramObject);
        x.i("MicroMsg.CursorDataWindow", "newcursor cursor clearData : " + paramObject);
      }
      localb.teh.remove(paramObject);
      return false;
    }
    paramObject = this.tex;
    ((c)paramObject).mPos = 0;
    ((c)paramObject).tek.clear();
    return false;
  }
  
  protected final void checkPosition()
  {
    super.checkPosition();
  }
  
  public final void close()
  {
    super.close();
    try
    {
      this.tet.close();
      this.mDriver.cursorClosed();
      return;
    }
    finally {}
  }
  
  public final boolean cm(Object paramObject)
  {
    if (!this.tev) {}
    while (this.tew == null) {
      return false;
    }
    return this.tew.cm(paramObject);
  }
  
  public final a cn(Object paramObject)
  {
    if (!this.tev) {
      Log.e("WCDB.SQLiteNewCursor", "newcursor getItemByKey error " + paramObject);
    }
    b localb;
    do
    {
      return null;
      if (this.tew == null)
      {
        Log.e("WCDB.SQLiteNewCursor", "newcursor error getItemByKey window is null");
        return null;
      }
      localb = this.tew;
    } while (localb.teh == null);
    return (a)localb.teh.get(paramObject);
  }
  
  public final SparseArray<Object>[] cnS()
  {
    if (!this.tev) {
      return null;
    }
    return new SparseArray[] { this.tew.tef };
  }
  
  public final HashMap cnT()
  {
    return this.tew.teh;
  }
  
  public final boolean cnU()
  {
    return this.tey;
  }
  
  public final void copyStringToBuffer(int paramInt, CharArrayBuffer paramCharArrayBuffer) {}
  
  public final void deactivate()
  {
    super.deactivate();
    this.mDriver.cursorDeactivated();
  }
  
  protected final void finalize()
  {
    try
    {
      if (this.tew != null) {
        close();
      }
      return;
    }
    finally
    {
      super.finalize();
    }
  }
  
  public final byte[] getBlob(int paramInt)
  {
    if (!this.tev) {
      return this.tex.getBlob(paramInt);
    }
    return null;
  }
  
  public final int getColumnIndex(String paramString)
  {
    if (this.mColumnNameMap == null)
    {
      localObject = this.mColumns;
      int j = localObject.length;
      HashMap localHashMap = new HashMap(j, 1.0F);
      i = 0;
      while (i < j)
      {
        localHashMap.put(localObject[i], Integer.valueOf(i));
        i += 1;
      }
      this.mColumnNameMap = localHashMap;
    }
    int i = paramString.lastIndexOf('.');
    Object localObject = paramString;
    if (i != -1)
    {
      localObject = new Exception();
      Log.e("WCDB.SQLiteNewCursor", "requesting column name with table name -- " + paramString, new Object[] { localObject });
      localObject = paramString.substring(i + 1);
    }
    paramString = (Integer)this.mColumnNameMap.get(localObject);
    if (paramString != null) {
      return paramString.intValue();
    }
    return -1;
  }
  
  public final String[] getColumnNames()
  {
    return this.mColumns;
  }
  
  public final int getCount()
  {
    if (this.mCount == -1)
    {
      this.mCount = DB(0);
      if (this.tew != null) {
        if ((this.mCount == -1) || (this.mCount != this.tew.tef.size())) {
          break label79;
        }
      }
    }
    label79:
    for (boolean bool = true;; bool = false)
    {
      this.tey = bool;
      if ((!this.tev) || (!this.tey)) {
        break label95;
      }
      if (this.tew != null) {
        break;
      }
      return 0;
    }
    return this.tew.tef.size();
    label95:
    return this.mCount;
  }
  
  public final double getDouble(int paramInt)
  {
    if (!this.tev) {
      return this.tex.getDouble(paramInt);
    }
    return 0.0D;
  }
  
  public final float getFloat(int paramInt)
  {
    if (!this.tev) {
      return this.tex.getFloat(paramInt);
    }
    return 0.0F;
  }
  
  public final int getInt(int paramInt)
  {
    if (!this.tev) {
      return this.tex.getInt(paramInt);
    }
    return 0;
  }
  
  public final long getLong(int paramInt)
  {
    if (!this.tev) {
      return this.tex.getLong(paramInt);
    }
    return 0L;
  }
  
  public final short getShort(int paramInt)
  {
    if (!this.tev) {
      return this.tex.getShort(paramInt);
    }
    return 0;
  }
  
  public final String getString(int paramInt)
  {
    if (!this.tev) {
      return this.tex.getString(paramInt);
    }
    return null;
  }
  
  public final boolean isNull(int paramInt)
  {
    if (!this.tev) {
      return this.tex.isNull(paramInt);
    }
    return false;
  }
  
  public final void lo(boolean paramBoolean)
  {
    this.tev = paramBoolean;
  }
  
  public final boolean onMove(int paramInt1, int paramInt2)
  {
    if (this.tev)
    {
      if ((this.tew == null) || (!this.tew.DA(paramInt2))) {
        DB(paramInt2 / this.pageSize * this.pageSize);
      }
      return true;
    }
    if (this.tex == null) {
      cod();
    }
    c localc = this.tex;
    paramInt1 = paramInt2 / localc.tem;
    if (localc.tek.indexOfKey(paramInt1) >= 0)
    {
      int i = localc.tem;
      int j = localc.columnCount;
      if (((Object[])localc.tek.get(paramInt1))[(paramInt2 % i * j)] == null) {}
    }
    for (paramInt1 = 1;; paramInt1 = 0)
    {
      if (paramInt1 == 0) {
        DB(paramInt2 / this.pageSize * this.pageSize);
      }
      this.tex.moveToPosition(paramInt2);
      return true;
    }
  }
  
  public final void registerContentObserver(ContentObserver paramContentObserver) {}
  
  public final void registerDataSetObserver(DataSetObserver paramDataSetObserver) {}
  
  public final boolean requery()
  {
    if (isClosed()) {
      return false;
    }
    try
    {
      if (!this.tet.getDatabase().isOpen()) {
        return false;
      }
    }
    finally {}
    if (this.tew != null) {
      this.tew.acV();
    }
    this.mPos = -1;
    this.mCount = -1;
    this.mDriver.cursorRequeried(this);
    try
    {
      boolean bool = super.requery();
      return bool;
    }
    catch (IllegalStateException localIllegalStateException)
    {
      Log.w("WCDB.SQLiteNewCursor", "requery() failed " + localIllegalStateException.getMessage(), new Object[] { localIllegalStateException });
    }
    return false;
  }
  
  public final void unregisterContentObserver(ContentObserver paramContentObserver) {}
  
  public final void unregisterDataSetObserver(DataSetObserver paramDataSetObserver) {}
  
  public static abstract interface a
  {
    public abstract ArrayList<a> ae(ArrayList<Object> paramArrayList);
    
    public abstract a coc();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/bt/a/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */