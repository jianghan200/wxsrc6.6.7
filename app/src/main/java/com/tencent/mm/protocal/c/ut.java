package com.tencent.mm.protocal.c;

public final class ut
  extends com.tencent.mm.bk.a
{
  public int ryb;
  public String ryc;
  public String ryd;
  public String rye;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.ryb);
      if (this.ryc != null) {
        paramVarArgs.g(2, this.ryc);
      }
      if (this.rye != null) {
        paramVarArgs.g(3, this.rye);
      }
      if (this.ryd != null) {
        paramVarArgs.g(4, this.ryd);
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
      if (this.rye != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.rye);
      }
      paramInt = i;
    } while (this.ryd == null);
    return i + f.a.a.b.b.a.h(4, this.ryd);
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
      ut localut = (ut)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localut.ryb = locala.vHC.rY();
        return 0;
      case 2: 
        localut.ryc = locala.vHC.readString();
        return 0;
      case 3: 
        localut.rye = locala.vHC.readString();
        return 0;
      }
      localut.ryd = locala.vHC.readString();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/ut.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */