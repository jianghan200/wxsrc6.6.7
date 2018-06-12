package com.tencent.mm.protocal.c;

public final class ke
  extends com.tencent.mm.bk.a
{
  public String bXu;
  public String rlP;
  public String rlQ;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rlP != null) {
        paramVarArgs.g(1, this.rlP);
      }
      if (this.rlQ != null) {
        paramVarArgs.g(2, this.rlQ);
      }
      if (this.bXu != null) {
        paramVarArgs.g(3, this.bXu);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.rlP == null) {
        break label289;
      }
    }
    label289:
    for (int i = f.a.a.b.b.a.h(1, this.rlP) + 0;; i = 0)
    {
      paramInt = i;
      if (this.rlQ != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.rlQ);
      }
      i = paramInt;
      if (this.bXu != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.bXu);
      }
      return i;
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
        ke localke = (ke)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localke.rlP = locala.vHC.readString();
          return 0;
        case 2: 
          localke.rlQ = locala.vHC.readString();
          return 0;
        }
        localke.bXu = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/ke.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */