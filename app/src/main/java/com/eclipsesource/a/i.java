package com.eclipsesource.a;

import java.io.Writer;

class i
{
  private static final char[] abT = { 92, 34 };
  private static final char[] abU = { 92, 92 };
  private static final char[] abV = { 92, 110 };
  private static final char[] abW = { 92, 114 };
  private static final char[] abX = { 92, 116 };
  private static final char[] abY = { 92, 117, 50, 48, 50, 56 };
  private static final char[] abZ = { 92, 117, 50, 48, 50, 57 };
  private static final char[] aca = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102 };
  protected final Writer acb;
  
  i(Writer paramWriter)
  {
    this.acb = paramWriter;
  }
  
  private void ac(String paramString)
  {
    int m = paramString.length();
    int i = 0;
    int j = 0;
    if (i < m)
    {
      int k = paramString.charAt(i);
      char[] arrayOfChar;
      if (k > 92) {
        if ((k < 8232) || (k > 8233)) {
          arrayOfChar = null;
        }
      }
      for (;;)
      {
        k = j;
        if (arrayOfChar != null)
        {
          this.acb.write(paramString, j, i - j);
          this.acb.write(arrayOfChar);
          k = i + 1;
        }
        i += 1;
        j = k;
        break;
        if (k == 8232)
        {
          arrayOfChar = abY;
        }
        else
        {
          arrayOfChar = abZ;
          continue;
          if (k == 92)
          {
            arrayOfChar = abU;
          }
          else if (k > 34)
          {
            arrayOfChar = null;
          }
          else if (k == 34)
          {
            arrayOfChar = abT;
          }
          else if (k > 31)
          {
            arrayOfChar = null;
          }
          else if (k == 10)
          {
            arrayOfChar = abV;
          }
          else if (k == 13)
          {
            arrayOfChar = abW;
          }
          else if (k == 9)
          {
            arrayOfChar = abX;
          }
          else
          {
            arrayOfChar = new char[6];
            arrayOfChar[0] = '\\';
            arrayOfChar[1] = 'u';
            arrayOfChar[2] = '0';
            arrayOfChar[3] = '0';
            arrayOfChar[4] = aca[(k >> 4 & 0xF)];
            arrayOfChar[5] = aca[(k & 0xF)];
          }
        }
      }
    }
    this.acb.write(paramString, j, m - j);
  }
  
  protected final void Z(String paramString)
  {
    this.acb.write(paramString);
  }
  
  protected final void aa(String paramString)
  {
    this.acb.write(paramString);
  }
  
  protected final void ab(String paramString)
  {
    this.acb.write(34);
    ac(paramString);
    this.acb.write(34);
  }
  
  protected void jdMethod_if()
  {
    this.acb.write(91);
  }
  
  protected void ig()
  {
    this.acb.write(93);
  }
  
  protected void ih()
  {
    this.acb.write(44);
  }
  
  protected void ii()
  {
    this.acb.write(123);
  }
  
  protected void ij()
  {
    this.acb.write(125);
  }
  
  protected void ik()
  {
    this.acb.write(58);
  }
  
  protected void il()
  {
    this.acb.write(44);
  }
  
  protected final void writeString(String paramString)
  {
    this.acb.write(34);
    ac(paramString);
    this.acb.write(34);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/eclipsesource/a/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */