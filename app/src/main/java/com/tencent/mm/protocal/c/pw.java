package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class pw
  extends com.tencent.mm.bk.a
{
  public String rud;
  public LinkedList<Integer> rue = new LinkedList();
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rud != null) {
        paramVarArgs.g(1, this.rud);
      }
      paramVarArgs.d(2, 2, this.rue);
      return 0;
    }
    if (paramInt == 1) {
      if (this.rud == null) {
        break label231;
      }
    }
    label231:
    for (paramInt = f.a.a.b.b.a.h(1, this.rud) + 0;; paramInt = 0)
    {
      return paramInt + f.a.a.a.c(2, 2, this.rue);
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.rue.clear();
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
        pw localpw = (pw)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localpw.rud = locala.vHC.readString();
          return 0;
        }
        localpw.rue.add(Integer.valueOf(locala.vHC.rY()));
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/protocal/c/pw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */