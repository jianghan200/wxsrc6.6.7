package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class kl
  extends com.tencent.mm.bk.a
{
  public String rmH;
  public LinkedList<String> rmI = new LinkedList();
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rmH != null) {
        paramVarArgs.g(1, this.rmH);
      }
      paramVarArgs.d(2, 1, this.rmI);
      return 0;
    }
    if (paramInt == 1) {
      if (this.rmH == null) {
        break label228;
      }
    }
    label228:
    for (paramInt = f.a.a.b.b.a.h(1, this.rmH) + 0;; paramInt = 0)
    {
      return paramInt + f.a.a.a.c(2, 1, this.rmI);
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.rmI.clear();
        paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
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
        kl localkl = (kl)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localkl.rmH = locala.vHC.readString();
          return 0;
        }
        localkl.rmI.add(locala.vHC.readString());
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/kl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */