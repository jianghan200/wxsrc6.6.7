package com.tencent.mm.protocal.c;

public final class we
  extends com.tencent.mm.bk.a
{
  public int bSz;
  public String bWB;
  public String label;
  public double lat;
  public double lng;
  public boolean rBu = false;
  public boolean rBv = false;
  public boolean rBw = false;
  public boolean rBx = false;
  public boolean rBy = false;
  
  public final we CK(int paramInt)
  {
    this.bSz = paramInt;
    this.rBw = true;
    return this;
  }
  
  public final we Vn(String paramString)
  {
    this.label = paramString;
    this.rBx = true;
    return this;
  }
  
  public final we Vo(String paramString)
  {
    this.bWB = paramString;
    this.rBy = true;
    return this;
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rBu == true) {
        paramVarArgs.c(1, this.lng);
      }
      if (this.rBv == true) {
        paramVarArgs.c(2, this.lat);
      }
      if (this.rBw == true) {
        paramVarArgs.fT(3, this.bSz);
      }
      if (this.label != null) {
        paramVarArgs.g(4, this.label);
      }
      if (this.bWB != null) {
        paramVarArgs.g(5, this.bWB);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.rBu != true) {
        break label433;
      }
    }
    label433:
    for (int i = f.a.a.b.b.a.ec(1) + 8 + 0;; i = 0)
    {
      paramInt = i;
      if (this.rBv == true) {
        paramInt = i + (f.a.a.b.b.a.ec(2) + 8);
      }
      i = paramInt;
      if (this.rBw == true) {
        i = paramInt + f.a.a.a.fQ(3, this.bSz);
      }
      paramInt = i;
      if (this.label != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.label);
      }
      i = paramInt;
      if (this.bWB != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.bWB);
      }
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        break;
      }
      if (paramInt == 3)
      {
        f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
        we localwe = (we)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localwe.lng = locala.vHC.readDouble();
          localwe.rBu = true;
          return 0;
        case 2: 
          localwe.lat = locala.vHC.readDouble();
          localwe.rBv = true;
          return 0;
        case 3: 
          localwe.bSz = locala.vHC.rY();
          localwe.rBw = true;
          return 0;
        case 4: 
          localwe.label = locala.vHC.readString();
          localwe.rBx = true;
          return 0;
        }
        localwe.bWB = locala.vHC.readString();
        localwe.rBy = true;
        return 0;
      }
      return -1;
    }
  }
  
  public final we y(double paramDouble)
  {
    this.lng = paramDouble;
    this.rBu = true;
    return this;
  }
  
  public final we z(double paramDouble)
  {
    this.lat = paramDouble;
    this.rBv = true;
    return this;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/we.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */