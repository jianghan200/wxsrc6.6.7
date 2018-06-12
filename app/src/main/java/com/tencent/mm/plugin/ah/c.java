package com.tencent.mm.plugin.ah;

import android.util.SparseArray;

public enum c
{
  public final SparseArray<b> nbQ = new SparseArray();
  
  private c() {}
  
  public final boolean a(b paramb)
  {
    this.nbQ.put(paramb.getType(), paramb);
    return true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/ah/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */