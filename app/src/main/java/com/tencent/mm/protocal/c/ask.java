package com.tencent.mm.protocal.c;

public final class ask
  extends com.tencent.mm.bk.a
{
  public int otY;
  public long rUF;
  public long rUG;
  public String rjK;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.otY);
      if (this.rjK != null) {
        paramVarArgs.g(2, this.rjK);
      }
      paramVarArgs.T(3, this.rUG);
      paramVarArgs.T(4, this.rUF);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = f.a.a.a.fQ(1, this.otY) + 0;
      paramInt = i;
      if (this.rjK != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.rjK);
      }
      return paramInt + f.a.a.a.S(3, this.rUG) + f.a.a.a.S(4, this.rUF);
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
      ask localask = (ask)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localask.otY = locala.vHC.rY();
        return 0;
      case 2: 
        localask.rjK = locala.vHC.readString();
        return 0;
      case 3: 
        localask.rUG = locala.vHC.rZ();
        return 0;
      }
      localask.rUF = locala.vHC.rZ();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/ask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */