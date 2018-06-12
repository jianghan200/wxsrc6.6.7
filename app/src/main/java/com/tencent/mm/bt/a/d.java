package com.tencent.mm.bt.a;

import android.database.Cursor;
import android.util.SparseArray;
import java.util.HashMap;

public abstract interface d<T>
  extends Cursor
{
  public abstract boolean Dx(int paramInt);
  
  public abstract a Dy(int paramInt);
  
  public abstract void Dz(int paramInt);
  
  public abstract void a(f.a parama);
  
  public abstract boolean a(Object paramObject, a parama);
  
  public abstract boolean cm(Object paramObject);
  
  public abstract a cn(Object paramObject);
  
  public abstract SparseArray<T>[] cnS();
  
  public abstract HashMap<Object, T> cnT();
  
  public abstract boolean cnU();
  
  public abstract void lo(boolean paramBoolean);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/bt/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */