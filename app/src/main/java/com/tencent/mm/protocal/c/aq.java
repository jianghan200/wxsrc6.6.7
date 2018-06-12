package com.tencent.mm.protocal.c;

public final class aq
  extends com.tencent.mm.bk.a
{
  public String hvV;
  public String hvW;
  public String hvX;
  public String hvY;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.hvV != null) {
        paramVarArgs.g(1, this.hvV);
      }
      if (this.hvW != null) {
        paramVarArgs.g(2, this.hvW);
      }
      if (this.hvX != null) {
        paramVarArgs.g(3, this.hvX);
      }
      if (this.hvY != null) {
        paramVarArgs.g(4, this.hvY);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.hvV == null) {
        break label344;
      }
    }
    label344:
    for (int i = f.a.a.b.b.a.h(1, this.hvV) + 0;; i = 0)
    {
      paramInt = i;
      if (this.hvW != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.hvW);
      }
      i = paramInt;
      if (this.hvX != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.hvX);
      }
      paramInt = i;
      if (this.hvY != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.hvY);
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
        aq localaq = (aq)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localaq.hvV = locala.vHC.readString();
          return 0;
        case 2: 
          localaq.hvW = locala.vHC.readString();
          return 0;
        case 3: 
          localaq.hvX = locala.vHC.readString();
          return 0;
        }
        localaq.hvY = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/aq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */