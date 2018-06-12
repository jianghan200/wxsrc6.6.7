package com.tencent.mm.bt.a;

import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.CursorIndexOutOfBoundsException;
import android.database.DataSetObserver;
import android.util.SparseArray;
import com.tencent.wcdb.AbstractCursor;

public final class c
  extends AbstractCursor
{
  final int columnCount;
  private final String[] columnNames;
  SparseArray<Object[]> tek;
  public int tem = 3000;
  int ten;
  
  private c(String[] paramArrayOfString)
  {
    this.columnNames = paramArrayOfString;
    this.columnCount = paramArrayOfString.length;
    this.tek = new SparseArray();
  }
  
  public c(String[] paramArrayOfString, byte paramByte)
  {
    this(paramArrayOfString);
  }
  
  private Object get(int paramInt)
  {
    if ((paramInt < 0) || (paramInt >= this.columnCount)) {
      throw new CursorIndexOutOfBoundsException("Requested column: " + paramInt + ", # of columns: " + this.columnCount);
    }
    if (this.mPos < 0) {
      throw new CursorIndexOutOfBoundsException("Before first row.");
    }
    if (this.mPos >= this.ten) {
      throw new CursorIndexOutOfBoundsException("After last row.");
    }
    int i = this.mPos / this.tem;
    int j = this.mPos;
    int k = this.tem;
    int m = this.columnCount;
    return ((Object[])this.tek.get(i))[(j % k * m + paramInt)];
  }
  
  public final void copyStringToBuffer(int paramInt, CharArrayBuffer paramCharArrayBuffer) {}
  
  public final byte[] getBlob(int paramInt)
  {
    Object localObject = get(paramInt);
    if (localObject == null) {
      return null;
    }
    return (byte[])localObject;
  }
  
  public final String[] getColumnNames()
  {
    return this.columnNames;
  }
  
  public final int getCount()
  {
    return this.ten;
  }
  
  public final double getDouble(int paramInt)
  {
    Object localObject = get(paramInt);
    if (localObject == null) {
      return 0.0D;
    }
    if ((localObject instanceof Number)) {
      return ((Number)localObject).doubleValue();
    }
    return Double.parseDouble(localObject.toString());
  }
  
  public final float getFloat(int paramInt)
  {
    Object localObject = get(paramInt);
    if (localObject == null) {
      return 0.0F;
    }
    if ((localObject instanceof Number)) {
      return ((Number)localObject).floatValue();
    }
    return Float.parseFloat(localObject.toString());
  }
  
  public final int getInt(int paramInt)
  {
    Object localObject = get(paramInt);
    if (localObject == null) {
      return 0;
    }
    if ((localObject instanceof Number)) {
      return ((Number)localObject).intValue();
    }
    return Integer.parseInt(localObject.toString());
  }
  
  public final long getLong(int paramInt)
  {
    Object localObject = get(paramInt);
    if (localObject == null) {
      return 0L;
    }
    if ((localObject instanceof Number)) {
      return ((Number)localObject).longValue();
    }
    return Long.parseLong(localObject.toString());
  }
  
  public final short getShort(int paramInt)
  {
    Object localObject = get(paramInt);
    if (localObject == null) {
      return 0;
    }
    if ((localObject instanceof Number)) {
      return ((Number)localObject).shortValue();
    }
    return Short.parseShort(localObject.toString());
  }
  
  public final String getString(int paramInt)
  {
    Object localObject = get(paramInt);
    if (localObject == null) {
      return null;
    }
    return localObject.toString();
  }
  
  public final boolean isNull(int paramInt)
  {
    return get(paramInt) == null;
  }
  
  public final void registerContentObserver(ContentObserver paramContentObserver) {}
  
  public final void registerDataSetObserver(DataSetObserver paramDataSetObserver) {}
  
  public final void unregisterContentObserver(ContentObserver paramContentObserver) {}
  
  public final void unregisterDataSetObserver(DataSetObserver paramDataSetObserver) {}
  
  public final class a
  {
    final int endIndex;
    int index;
    Object[] teo;
    
    a(int paramInt1, int paramInt2, Object[] paramArrayOfObject)
    {
      this.index = paramInt1;
      this.endIndex = paramInt2;
      this.teo = paramArrayOfObject;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/bt/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */