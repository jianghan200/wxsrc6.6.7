package com.tencent.map.lib.gl.model;

import java.util.ArrayList;

public class f
{
  private ArrayList<e> a = new ArrayList();
  
  public e a(int paramInt)
  {
    return (e)this.a.get(paramInt);
  }
  
  public void a(e parame)
  {
    this.a.add(parame);
  }
  
  public float[] a()
  {
    float[] arrayOfFloat = new float[this.a.size() * 3];
    int i = 0;
    while (i < this.a.size())
    {
      int j = i * 3;
      arrayOfFloat[(j + 0)] = ((e)this.a.get(i)).a;
      arrayOfFloat[(j + 1)] = ((e)this.a.get(i)).b;
      arrayOfFloat[(j + 2)] = ((e)this.a.get(i)).c;
      i += 1;
    }
    return arrayOfFloat;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/map/lib/gl/model/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */