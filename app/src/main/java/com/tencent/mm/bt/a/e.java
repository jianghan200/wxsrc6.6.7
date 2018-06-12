package com.tencent.mm.bt.a;

import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.DataSetObserver;
import android.util.SparseArray;
import com.tencent.wcdb.AbstractCursor;
import java.util.HashMap;

public final class e
  extends AbstractCursor
  implements d
{
  private DataSetObserver mObserver = new e.1(this);
  private d teq;
  public d[] ter;
  
  public e(d[] paramArrayOfd)
  {
    this.ter = paramArrayOfd;
    this.teq = paramArrayOfd[0];
    while (i < this.ter.length)
    {
      if (this.ter[i] != null) {
        this.ter[i].registerDataSetObserver(this.mObserver);
      }
      i += 1;
    }
  }
  
  public final boolean Dx(int paramInt)
  {
    int j = this.ter.length;
    boolean bool1 = true;
    int i = 0;
    while (i < j)
    {
      boolean bool2 = bool1;
      if (this.ter[i] != null)
      {
        bool2 = bool1;
        if (!this.ter[i].Dx(paramInt)) {
          bool2 = false;
        }
      }
      i += 1;
      bool1 = bool2;
    }
    return bool1;
  }
  
  public final a Dy(int paramInt)
  {
    int k = this.ter.length;
    int j = 0;
    int i = paramInt;
    paramInt = j;
    while (paramInt < k)
    {
      j = this.ter[paramInt].getCount();
      if (i < j) {
        return this.ter[paramInt].Dy(i);
      }
      i -= j;
      paramInt += 1;
    }
    return null;
  }
  
  public final void Dz(int paramInt)
  {
    int j = this.ter.length;
    int i = 0;
    while (i < j)
    {
      if (this.ter[i] != null) {
        this.ter[i].Dz(paramInt);
      }
      i += 1;
    }
  }
  
  public final void a(f.a parama)
  {
    int j = this.ter.length;
    int i = 0;
    while (i < j)
    {
      if (this.ter[i] != null) {
        this.ter[i].a(parama);
      }
      i += 1;
    }
  }
  
  public final boolean a(Object paramObject, a parama)
  {
    int j = this.ter.length;
    int i = 0;
    boolean bool2;
    for (boolean bool1 = false; i < j; bool1 = bool2)
    {
      bool2 = bool1;
      if (this.ter[i] != null)
      {
        bool2 = bool1;
        if (this.ter[i].a(paramObject, parama)) {
          bool2 = true;
        }
      }
      i += 1;
    }
    return bool1;
  }
  
  public final void close()
  {
    int j = this.ter.length;
    int i = 0;
    while (i < j)
    {
      if (this.ter[i] != null) {
        this.ter[i].close();
      }
      i += 1;
    }
    super.close();
  }
  
  public final boolean cm(Object paramObject)
  {
    int j = this.ter.length;
    int i = 0;
    boolean bool2;
    for (boolean bool1 = false; i < j; bool1 = bool2)
    {
      bool2 = bool1;
      if (this.ter[i] != null)
      {
        bool2 = bool1;
        if (this.ter[i].cm(paramObject)) {
          bool2 = true;
        }
      }
      i += 1;
    }
    return bool1;
  }
  
  public final a cn(Object paramObject)
  {
    return this.teq.cn(paramObject);
  }
  
  public final SparseArray<Object>[] cnS()
  {
    int j = this.ter.length;
    SparseArray[] arrayOfSparseArray = new SparseArray[j];
    int i = 0;
    if (i < j)
    {
      Object localObject = this.ter[i].cnS();
      if (localObject != null) {}
      for (localObject = localObject[0];; localObject = null)
      {
        arrayOfSparseArray[i] = localObject;
        i += 1;
        break;
      }
    }
    return arrayOfSparseArray;
  }
  
  public final HashMap cnT()
  {
    return null;
  }
  
  public final boolean cnU()
  {
    int j = this.ter.length;
    boolean bool1 = true;
    int i = 0;
    while (i < j)
    {
      boolean bool2 = bool1;
      if (this.ter[i] != null)
      {
        bool2 = bool1;
        if (!this.ter[i].cnU()) {
          bool2 = false;
        }
      }
      i += 1;
      bool1 = bool2;
    }
    return bool1;
  }
  
  public final void copyStringToBuffer(int paramInt, CharArrayBuffer paramCharArrayBuffer) {}
  
  public final void deactivate()
  {
    int j = this.ter.length;
    int i = 0;
    while (i < j)
    {
      if (this.ter[i] != null) {
        this.ter[i].deactivate();
      }
      i += 1;
    }
    super.deactivate();
  }
  
  public final byte[] getBlob(int paramInt)
  {
    return this.teq.getBlob(paramInt);
  }
  
  public final String[] getColumnNames()
  {
    if (this.teq != null) {
      return this.teq.getColumnNames();
    }
    return new String[0];
  }
  
  public final int getCount()
  {
    int m = this.ter.length;
    int i = 0;
    int k;
    for (int j = 0; i < m; j = k)
    {
      k = j;
      if (this.ter[i] != null) {
        k = j + this.ter[i].getCount();
      }
      i += 1;
    }
    return j;
  }
  
  public final double getDouble(int paramInt)
  {
    return this.teq.getDouble(paramInt);
  }
  
  public final float getFloat(int paramInt)
  {
    return this.teq.getFloat(paramInt);
  }
  
  public final int getInt(int paramInt)
  {
    return this.teq.getInt(paramInt);
  }
  
  public final long getLong(int paramInt)
  {
    return this.teq.getLong(paramInt);
  }
  
  public final short getShort(int paramInt)
  {
    return this.teq.getShort(paramInt);
  }
  
  public final String getString(int paramInt)
  {
    return this.teq.getString(paramInt);
  }
  
  public final boolean isNull(int paramInt)
  {
    return this.teq.isNull(paramInt);
  }
  
  public final void lo(boolean paramBoolean)
  {
    int j = this.ter.length;
    int i = 0;
    while (i < j)
    {
      if (this.ter[i] != null) {
        this.ter[i].lo(paramBoolean);
      }
      i += 1;
    }
  }
  
  public final boolean onMove(int paramInt1, int paramInt2)
  {
    this.teq = null;
    int k = this.ter.length;
    paramInt1 = 0;
    int j;
    for (int i = 0;; i = j)
    {
      if (paramInt1 < k)
      {
        j = i;
        if (this.ter[paramInt1] == null) {
          break label96;
        }
        if (paramInt2 < this.ter[paramInt1].getCount() + i) {
          this.teq = this.ter[paramInt1];
        }
      }
      else
      {
        if (this.teq == null) {
          break;
        }
        return this.teq.moveToPosition(paramInt2 - i);
      }
      j = i + this.ter[paramInt1].getCount();
      label96:
      paramInt1 += 1;
    }
    return false;
  }
  
  public final void registerContentObserver(ContentObserver paramContentObserver)
  {
    int j = this.ter.length;
    int i = 0;
    while (i < j)
    {
      if (this.ter[i] != null) {
        this.ter[i].registerContentObserver(paramContentObserver);
      }
      i += 1;
    }
  }
  
  public final void registerDataSetObserver(DataSetObserver paramDataSetObserver)
  {
    int j = this.ter.length;
    int i = 0;
    while (i < j)
    {
      if (this.ter[i] != null) {
        this.ter[i].registerDataSetObserver(paramDataSetObserver);
      }
      i += 1;
    }
  }
  
  public final boolean requery()
  {
    int j = this.ter.length;
    int i = 0;
    while (i < j)
    {
      if ((this.ter[i] != null) && (!this.ter[i].requery())) {
        return false;
      }
      i += 1;
    }
    return true;
  }
  
  public final void unregisterContentObserver(ContentObserver paramContentObserver)
  {
    int j = this.ter.length;
    int i = 0;
    while (i < j)
    {
      if (this.ter[i] != null) {
        this.ter[i].unregisterContentObserver(paramContentObserver);
      }
      i += 1;
    }
  }
  
  public final void unregisterDataSetObserver(DataSetObserver paramDataSetObserver)
  {
    int j = this.ter.length;
    int i = 0;
    while (i < j)
    {
      if (this.ter[i] != null) {
        this.ter[i].unregisterDataSetObserver(paramDataSetObserver);
      }
      i += 1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/bt/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */