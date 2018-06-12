package com.tencent.mm.protocal.c;

public final class un
  extends com.tencent.mm.bk.a
{
  public int rxV;
  public int rxW;
  public int rxX;
  public String rxY;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.rxV);
      paramVarArgs.fT(2, this.rxW);
      paramVarArgs.fT(3, this.rxX);
      if (this.rxY != null) {
        paramVarArgs.g(4, this.rxY);
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
      i = f.a.a.a.fQ(1, this.rxV) + 0 + f.a.a.a.fQ(2, this.rxW) + f.a.a.a.fQ(3, this.rxX);
      paramInt = i;
    } while (this.rxY == null);
    return i + f.a.a.b.b.a.h(4, this.rxY);
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
      un localun = (un)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localun.rxV = locala.vHC.rY();
        return 0;
      case 2: 
        localun.rxW = locala.vHC.rY();
        return 0;
      case 3: 
        localun.rxX = locala.vHC.rY();
        return 0;
      }
      localun.rxY = locala.vHC.readString();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/protocal/c/un.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */