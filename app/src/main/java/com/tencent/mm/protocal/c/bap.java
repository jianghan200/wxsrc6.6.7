package com.tencent.mm.protocal.c;

public final class bap
  extends com.tencent.mm.bk.a
{
  public String jPe;
  public int rHi;
  public String rxm;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    int i;
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.rHi);
      if (this.jPe != null) {
        paramVarArgs.g(2, this.jPe);
      }
      if (this.rxm != null) {
        paramVarArgs.g(3, this.rxm);
      }
      i = 0;
    }
    do
    {
      return i;
      if (paramInt != 1) {
        break;
      }
      i = f.a.a.a.fQ(1, this.rHi) + 0;
      paramInt = i;
      if (this.jPe != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.jPe);
      }
      i = paramInt;
    } while (this.rxm == null);
    return paramInt + f.a.a.b.b.a.h(3, this.rxm);
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
      bap localbap = (bap)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localbap.rHi = locala.vHC.rY();
        return 0;
      case 2: 
        localbap.jPe = locala.vHC.readString();
        return 0;
      }
      localbap.rxm = locala.vHC.readString();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/bap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */