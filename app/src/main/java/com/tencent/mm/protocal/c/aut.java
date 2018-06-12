package com.tencent.mm.protocal.c;

public final class aut
  extends com.tencent.mm.bk.a
{
  public int rXK;
  public String rXy;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rXy != null) {
        paramVarArgs.g(1, this.rXy);
      }
      paramVarArgs.fT(2, this.rXK);
      return 0;
    }
    if (paramInt == 1) {
      if (this.rXy == null) {
        break label212;
      }
    }
    label212:
    for (paramInt = f.a.a.b.b.a.h(1, this.rXy) + 0;; paramInt = 0)
    {
      return paramInt + f.a.a.a.fQ(2, this.rXK);
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
        aut localaut = (aut)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localaut.rXy = locala.vHC.readString();
          return 0;
        }
        localaut.rXK = locala.vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/protocal/c/aut.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */