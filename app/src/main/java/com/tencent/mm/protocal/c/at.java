package com.tencent.mm.protocal.c;

public final class at
  extends com.tencent.mm.bk.a
{
  public String jQb;
  public String raM;
  public String raN;
  public String raO;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.jQb != null) {
        paramVarArgs.g(1, this.jQb);
      }
      if (this.raM != null) {
        paramVarArgs.g(2, this.raM);
      }
      if (this.raN != null) {
        paramVarArgs.g(3, this.raN);
      }
      if (this.raO != null) {
        paramVarArgs.g(4, this.raO);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.jQb == null) {
        break label344;
      }
    }
    label344:
    for (int i = f.a.a.b.b.a.h(1, this.jQb) + 0;; i = 0)
    {
      paramInt = i;
      if (this.raM != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.raM);
      }
      i = paramInt;
      if (this.raN != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.raN);
      }
      paramInt = i;
      if (this.raO != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.raO);
      }
      return paramInt;
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
        at localat = (at)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localat.jQb = locala.vHC.readString();
          return 0;
        case 2: 
          localat.raM = locala.vHC.readString();
          return 0;
        case 3: 
          localat.raN = locala.vHC.readString();
          return 0;
        }
        localat.raO = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/protocal/c/at.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */