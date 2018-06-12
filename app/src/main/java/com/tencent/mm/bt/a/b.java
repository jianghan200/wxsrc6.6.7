package com.tencent.mm.bt.a;

import android.database.sqlite.SQLiteClosable;
import android.util.SparseArray;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.HashMap;

public abstract class b<T extends a>
  extends SQLiteClosable
{
  int mStartPos = 0;
  SparseArray<Object> tef = new SparseArray();
  int teg;
  HashMap<Object, T> teh = new HashMap();
  ArrayList<Object> tei;
  T tej;
  
  public final boolean DA(int paramInt)
  {
    return this.tef.indexOfKey(paramInt) >= 0;
  }
  
  public final void acV()
  {
    x.i("MicroMsg.CursorDataWindow", "clearData");
    this.tef.clear();
    this.teh.clear();
  }
  
  public abstract ArrayList<T> ae(ArrayList<Object> paramArrayList);
  
  final void b(Object paramObject, T paramT)
  {
    this.teh.put(paramObject, paramT);
  }
  
  public final boolean cm(Object paramObject)
  {
    if ((paramObject instanceof Object[]))
    {
      Object[] arrayOfObject = (Object[])paramObject;
      if (arrayOfObject.length == 1) {
        return (this.teh != null) && (this.teh.containsKey(arrayOfObject[0]));
      }
    }
    return (this.teh != null) && (this.teh.containsKey(paramObject));
  }
  
  public abstract T coc();
  
  public final void eJ(int paramInt1, int paramInt2)
  {
    if (paramInt2 != 0)
    {
      x.e("MicroMsg.CursorDataWindow", "newcursor rowEnd with error %d rowNum : %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt1) });
      this.tef.remove(paramInt1);
    }
    while (this.tej == null) {
      return;
    }
    Object localObject = this.tej.getKey();
    b(localObject, this.tej);
    this.tef.put(paramInt1, localObject);
  }
  
  protected void onAllReferencesReleased()
  {
    acV();
  }
  
  final void t(Object[] paramArrayOfObject)
  {
    SparseArray localSparseArray = new SparseArray();
    int i = 0;
    int j = 0;
    if (i < this.tef.size())
    {
      int i2 = this.tef.keyAt(i);
      Object localObject = this.tef.valueAt(i);
      int i1 = 1;
      int i3 = paramArrayOfObject.length;
      int n = 0;
      label54:
      int k = j;
      int m = i1;
      if (n < i3)
      {
        if (paramArrayOfObject[n].equals(localObject))
        {
          k = j + 1;
          m = 0;
        }
      }
      else
      {
        if (m == 0) {
          break label124;
        }
        localSparseArray.put(i2 - k, localObject);
      }
      for (;;)
      {
        i += 1;
        j = k;
        break;
        n += 1;
        break label54;
        label124:
        x.i("MicroMsg.CursorDataWindow", "newcursor delete index : " + i + " obj : " + localObject);
      }
    }
    if (this.tef.size() != localSparseArray.size()) {
      x.i("MicroMsg.CursorDataWindow", "newcursor oldposition size :" + this.tef.size() + " newposistion Size : " + localSparseArray.size());
    }
    this.tef = localSparseArray;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/bt/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */