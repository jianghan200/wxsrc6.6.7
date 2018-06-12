package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class cbl
  extends com.tencent.mm.bk.a
{
  public String sxl;
  public LinkedList<String> sxm = new LinkedList();
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.sxl != null) {
        paramVarArgs.g(1, this.sxl);
      }
      paramVarArgs.d(2, 1, this.sxm);
      return 0;
    }
    if (paramInt == 1) {
      if (this.sxl == null) {
        break label228;
      }
    }
    label228:
    for (paramInt = f.a.a.b.b.a.h(1, this.sxl) + 0;; paramInt = 0)
    {
      return paramInt + f.a.a.a.c(2, 1, this.sxm);
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.sxm.clear();
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
        cbl localcbl = (cbl)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localcbl.sxl = locala.vHC.readString();
          return 0;
        }
        localcbl.sxm.add(locala.vHC.readString());
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/cbl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */