package com.qq.taf.jce.dynamic;

public final class ListField
  extends JceField
{
  private JceField[] data;
  
  ListField(JceField[] paramArrayOfJceField, int paramInt)
  {
    super(paramInt);
    this.data = paramArrayOfJceField;
  }
  
  public final JceField get(int paramInt)
  {
    return this.data[paramInt];
  }
  
  public final JceField[] get()
  {
    return this.data;
  }
  
  public final void set(int paramInt, JceField paramJceField)
  {
    this.data[paramInt] = paramJceField;
  }
  
  public final void set(JceField[] paramArrayOfJceField)
  {
    this.data = paramArrayOfJceField;
  }
  
  public final int size()
  {
    return this.data.length;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/qq/taf/jce/dynamic/ListField.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */