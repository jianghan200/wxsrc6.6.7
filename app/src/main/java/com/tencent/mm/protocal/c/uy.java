package com.tencent.mm.protocal.c;

public final class uy
  extends com.tencent.mm.bk.a
{
  public int ryb;
  public String ryc;
  public String ryd;
  public String ryp;
  public String ryq;
  public int ryr;
  public int rys;
  public String ryt;
  public String ryu;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.ryb);
      if (this.ryc != null) {
        paramVarArgs.g(2, this.ryc);
      }
      if (this.ryp != null) {
        paramVarArgs.g(3, this.ryp);
      }
      if (this.ryq != null) {
        paramVarArgs.g(4, this.ryq);
      }
      paramVarArgs.fT(5, this.ryr);
      paramVarArgs.fT(6, this.rys);
      if (this.ryt != null) {
        paramVarArgs.g(7, this.ryt);
      }
      if (this.ryd != null) {
        paramVarArgs.g(8, this.ryd);
      }
      if (this.ryu != null) {
        paramVarArgs.g(9, this.ryu);
      }
      paramInt = 0;
    }
    int i;
    do
    {
      return paramInt;
      if (paramInt != 1) {
        break;
      }
      i = f.a.a.a.fQ(1, this.ryb) + 0;
      paramInt = i;
      if (this.ryc != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.ryc);
      }
      i = paramInt;
      if (this.ryp != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.ryp);
      }
      paramInt = i;
      if (this.ryq != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.ryq);
      }
      i = paramInt + f.a.a.a.fQ(5, this.ryr) + f.a.a.a.fQ(6, this.rys);
      paramInt = i;
      if (this.ryt != null) {
        paramInt = i + f.a.a.b.b.a.h(7, this.ryt);
      }
      i = paramInt;
      if (this.ryd != null) {
        i = paramInt + f.a.a.b.b.a.h(8, this.ryd);
      }
      paramInt = i;
    } while (this.ryu == null);
    return i + f.a.a.b.b.a.h(9, this.ryu);
    if (paramInt == 2)
    {
      paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cJS();
        }
      }
      return 0;
    }
    if (paramInt == 3)
    {
      f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
      uy localuy = (uy)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localuy.ryb = locala.vHC.rY();
        return 0;
      case 2: 
        localuy.ryc = locala.vHC.readString();
        return 0;
      case 3: 
        localuy.ryp = locala.vHC.readString();
        return 0;
      case 4: 
        localuy.ryq = locala.vHC.readString();
        return 0;
      case 5: 
        localuy.ryr = locala.vHC.rY();
        return 0;
      case 6: 
        localuy.rys = locala.vHC.rY();
        return 0;
      case 7: 
        localuy.ryt = locala.vHC.readString();
        return 0;
      case 8: 
        localuy.ryd = locala.vHC.readString();
        return 0;
      }
      localuy.ryu = locala.vHC.readString();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/uy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */