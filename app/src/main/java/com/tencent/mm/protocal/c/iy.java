package com.tencent.mm.protocal.c;

import com.tencent.mm.bk.b;

public final class iy
  extends com.tencent.mm.bk.a
{
  public int port;
  public b rkk;
  public b rkl;
  public int type;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    int i;
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.type);
      paramVarArgs.fT(2, this.port);
      if (this.rkk != null) {
        paramVarArgs.b(3, this.rkk);
      }
      if (this.rkl != null) {
        paramVarArgs.b(4, this.rkl);
      }
      i = 0;
    }
    do
    {
      return i;
      if (paramInt != 1) {
        break;
      }
      i = f.a.a.a.fQ(1, this.type) + 0 + f.a.a.a.fQ(2, this.port);
      paramInt = i;
      if (this.rkk != null) {
        paramInt = i + f.a.a.a.a(3, this.rkk);
      }
      i = paramInt;
    } while (this.rkl == null);
    return paramInt + f.a.a.a.a(4, this.rkl);
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
      iy localiy = (iy)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localiy.type = locala.vHC.rY();
        return 0;
      case 2: 
        localiy.port = locala.vHC.rY();
        return 0;
      case 3: 
        localiy.rkk = locala.cJR();
        return 0;
      }
      localiy.rkl = locala.cJR();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/protocal/c/iy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */