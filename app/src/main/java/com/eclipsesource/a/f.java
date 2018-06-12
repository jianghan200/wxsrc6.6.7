package com.eclipsesource.a;

import java.io.Reader;
import java.io.StringReader;

final class f
{
  private final Reader abM;
  private final char[] abN;
  private int abO;
  private int abP;
  private int abQ;
  private StringBuilder abR;
  private int abS;
  private int fill;
  private int index;
  private int line;
  
  private f(Reader paramReader, int paramInt)
  {
    this.abM = paramReader;
    this.abN = new char[paramInt];
    this.line = 1;
    this.abS = -1;
  }
  
  f(String paramString)
  {
    this(new StringReader(paramString), Math.max(10, Math.min(1024, paramString.length())));
  }
  
  private j X(String paramString)
  {
    if (id()) {
      return Y("Unexpected end of input");
    }
    return Y("Expected " + paramString);
  }
  
  private void b(char paramChar)
  {
    if (!c(paramChar)) {
      throw X("'" + paramChar + "'");
    }
  }
  
  private boolean c(char paramChar)
  {
    if (this.abQ != paramChar) {
      return false;
    }
    ia();
    return true;
  }
  
  private String hX()
  {
    ia();
    ib();
    while (this.abQ != 34)
    {
      if (this.abQ == 92)
      {
        if (this.abQ == -1) {}
        for (int i = this.index;; i = this.index - 1)
        {
          this.abR.append(this.abN, this.abS, i - this.abS);
          this.abS = -1;
          ia();
          switch (this.abQ)
          {
          default: 
            throw X("valid escape sequence");
          }
        }
        this.abR.append((char)this.abQ);
        for (;;)
        {
          ia();
          ib();
          break;
          this.abR.append('\b');
          continue;
          this.abR.append('\f');
          continue;
          this.abR.append('\n');
          continue;
          this.abR.append('\r');
          continue;
          this.abR.append('\t');
          continue;
          localObject = new char[4];
          i = 0;
          while (i < 4)
          {
            ia();
            if (((this.abQ >= 48) && (this.abQ <= 57)) || ((this.abQ >= 97) && (this.abQ <= 102)) || ((this.abQ >= 65) && (this.abQ <= 70))) {}
            for (int j = 1; j == 0; j = 0) {
              throw X("hexadecimal digit");
            }
            localObject[i] = ((char)this.abQ);
            i += 1;
          }
          this.abR.append((char)Integer.parseInt(new String((char[])localObject), 16));
        }
      }
      if (this.abQ < 32) {
        throw X("valid string character");
      }
      ia();
    }
    Object localObject = ic();
    ia();
    return (String)localObject;
  }
  
  private boolean hY()
  {
    if ((this.abQ >= 48) && (this.abQ <= 57)) {}
    for (int i = 1; i == 0; i = 0) {
      return false;
    }
    ia();
    return true;
  }
  
  private void ib()
  {
    if (this.abR == null) {
      this.abR = new StringBuilder();
    }
    this.abS = (this.index - 1);
  }
  
  private String ic()
  {
    int i;
    String str;
    if (this.abQ == -1)
    {
      i = this.index;
      if (this.abR.length() <= 0) {
        break label78;
      }
      this.abR.append(this.abN, this.abS, i - this.abS);
      str = this.abR.toString();
      this.abR.setLength(0);
    }
    for (;;)
    {
      this.abS = -1;
      return str;
      i = this.index - 1;
      break;
      label78:
      str = new String(this.abN, this.abS, i - this.abS);
    }
  }
  
  final j Y(String paramString)
  {
    int j = this.abO + this.index;
    int k = this.abP;
    if (id()) {}
    for (int i = j;; i = j - 1) {
      return new j(paramString, i, this.line, j - k - 1);
    }
  }
  
  final h hW()
  {
    Object localObject1;
    switch (this.abQ)
    {
    default: 
      throw X("value");
    case 110: 
      ia();
      b('u');
      b('l');
      b('l');
      localObject1 = a.abw;
    case 116: 
    case 102: 
    case 34: 
    case 91: 
    case 123: 
      do
      {
        Object localObject2;
        do
        {
          do
          {
            do
            {
              return (h)localObject1;
              ia();
              b('r');
              b('u');
              b('e');
              return a.abx;
              ia();
              b('a');
              b('l');
              b('s');
              b('e');
              return a.aby;
              return new g(hX());
              ia();
              localObject2 = new b();
              hZ();
              localObject1 = localObject2;
            } while (c(']'));
            do
            {
              hZ();
              ((b)localObject2).a(hW());
              hZ();
            } while (c(','));
            localObject1 = localObject2;
          } while (c(']'));
          throw X("',' or ']'");
          ia();
          localObject2 = new e();
          hZ();
          localObject1 = localObject2;
        } while (c('}'));
        do
        {
          hZ();
          if (this.abQ != 34) {
            throw X("name");
          }
          localObject1 = hX();
          hZ();
          if (!c(':')) {
            throw X("':'");
          }
          hZ();
          ((e)localObject2).a((String)localObject1, hW());
          hZ();
        } while (c(','));
        localObject1 = localObject2;
      } while (c('}'));
      throw X("',' or '}'");
    }
    ib();
    c('-');
    int i = this.abQ;
    if (!hY()) {
      throw X("digit");
    }
    while ((i != 48) && (hY())) {}
    if (c('.'))
    {
      if (!hY()) {
        throw X("digit");
      }
      while (hY()) {}
    }
    if ((c('e')) || (c('E')))
    {
      if (!c('+')) {
        c('-');
      }
      if (!hY()) {
        throw X("digit");
      }
      while (hY()) {}
    }
    return new d(ic());
  }
  
  final void hZ()
  {
    if ((this.abQ == 32) || (this.abQ == 9) || (this.abQ == 10) || (this.abQ == 13)) {}
    for (int i = 1;; i = 0)
    {
      if (i == 0) {
        return;
      }
      ia();
      break;
    }
  }
  
  final void ia()
  {
    if (this.index == this.fill)
    {
      if (this.abS != -1)
      {
        this.abR.append(this.abN, this.abS, this.fill - this.abS);
        this.abS = 0;
      }
      this.abO += this.fill;
      this.fill = this.abM.read(this.abN, 0, this.abN.length);
      this.index = 0;
      if (this.fill == -1)
      {
        this.abQ = -1;
        return;
      }
    }
    if (this.abQ == 10)
    {
      this.line += 1;
      this.abP = (this.abO + this.index);
    }
    char[] arrayOfChar = this.abN;
    int i = this.index;
    this.index = (i + 1);
    this.abQ = arrayOfChar[i];
  }
  
  final boolean id()
  {
    return this.abQ == -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/eclipsesource/a/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */