package com.eclipsesource.v8.utils;

public abstract class SingleTypeAdapter
  implements TypeAdapter
{
  private int typeToAdapt;
  
  public SingleTypeAdapter(int paramInt)
  {
    this.typeToAdapt = paramInt;
  }
  
  public Object adapt(int paramInt, Object paramObject)
  {
    if (paramInt == this.typeToAdapt) {
      return adapt(paramObject);
    }
    return TypeAdapter.DEFAULT;
  }
  
  public abstract Object adapt(Object paramObject);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/eclipsesource/v8/utils/SingleTypeAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */