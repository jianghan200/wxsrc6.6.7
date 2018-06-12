package com.qq.taf.jce.dynamic;

import java.util.Arrays;
import java.util.Comparator;

public class StructField
  extends JceField
{
  private static final Comparator<JceField> tagComp = new StructField.1();
  private JceField[] data;
  
  StructField(JceField[] paramArrayOfJceField, int paramInt)
  {
    super(paramInt);
    this.data = paramArrayOfJceField;
  }
  
  public JceField[] get()
  {
    return this.data;
  }
  
  public JceField getFieldByTag(int paramInt)
  {
    paramInt = Arrays.binarySearch(this.data, JceField.createZero(paramInt), tagComp);
    if (paramInt >= 0) {
      return this.data[paramInt];
    }
    return null;
  }
  
  public boolean setByTag(int paramInt, JceField paramJceField)
  {
    paramInt = Arrays.binarySearch(this.data, JceField.createZero(paramInt), tagComp);
    if (paramInt >= 0)
    {
      this.data[paramInt] = paramJceField;
      return true;
    }
    int i = -paramInt - 1;
    JceField[] arrayOfJceField = new JceField[this.data.length + 1];
    paramInt = 0;
    if (paramInt >= i)
    {
      arrayOfJceField[i] = paramJceField;
      paramInt = i;
    }
    for (;;)
    {
      if (paramInt >= this.data.length)
      {
        return false;
        arrayOfJceField[paramInt] = this.data[paramInt];
        paramInt += 1;
        break;
      }
      arrayOfJceField[(paramInt + 1)] = this.data[paramInt];
      paramInt += 1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/qq/taf/jce/dynamic/StructField.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */