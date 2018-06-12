package com.tencent.mm.protocal.c;

public final class xj
  extends com.tencent.mm.bk.a
{
  public int fHo;
  public int index;
  public String username;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.index);
      if (this.username != null) {
        paramVarArgs.g(2, this.username);
      }
      paramVarArgs.fT(3, this.fHo);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = f.a.a.a.fQ(1, this.index) + 0;
      paramInt = i;
      if (this.username != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.username);
      }
      return paramInt + f.a.a.a.fQ(3, this.fHo);
    }
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
      xj localxj = (xj)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localxj.index = locala.vHC.rY();
        return 0;
      case 2: 
        localxj.username = locala.vHC.readString();
        return 0;
      }
      localxj.fHo = locala.vHC.rY();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/xj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */