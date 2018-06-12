package com.tencent.mm.protocal.c;

public final class bsg
  extends com.tencent.mm.bk.a
{
  public int spN;
  public String spO;
  public String spP;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    int i;
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.spN);
      if (this.spO != null) {
        paramVarArgs.g(2, this.spO);
      }
      if (this.spP != null) {
        paramVarArgs.g(3, this.spP);
      }
      i = 0;
    }
    do
    {
      return i;
      if (paramInt != 1) {
        break;
      }
      i = f.a.a.a.fQ(1, this.spN) + 0;
      paramInt = i;
      if (this.spO != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.spO);
      }
      i = paramInt;
    } while (this.spP == null);
    return paramInt + f.a.a.b.b.a.h(3, this.spP);
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
      bsg localbsg = (bsg)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localbsg.spN = locala.vHC.rY();
        return 0;
      case 2: 
        localbsg.spO = locala.vHC.readString();
        return 0;
      }
      localbsg.spP = locala.vHC.readString();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/protocal/c/bsg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */