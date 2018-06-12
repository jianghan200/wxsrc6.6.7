package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class cbb
  extends com.tencent.mm.bk.a
{
  public String sxk;
  public String sxl;
  public LinkedList<String> sxm = new LinkedList();
  public int sxn;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.sxk != null) {
        paramVarArgs.g(1, this.sxk);
      }
      if (this.sxl != null) {
        paramVarArgs.g(2, this.sxl);
      }
      paramVarArgs.d(3, 1, this.sxm);
      paramVarArgs.fT(4, this.sxn);
      return 0;
    }
    if (paramInt == 1) {
      if (this.sxk == null) {
        break label320;
      }
    }
    label320:
    for (paramInt = f.a.a.b.b.a.h(1, this.sxk) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.sxl != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.sxl);
      }
      return i + f.a.a.a.c(3, 1, this.sxm) + f.a.a.a.fQ(4, this.sxn);
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
        cbb localcbb = (cbb)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localcbb.sxk = locala.vHC.readString();
          return 0;
        case 2: 
          localcbb.sxl = locala.vHC.readString();
          return 0;
        case 3: 
          localcbb.sxm.add(locala.vHC.readString());
          return 0;
        }
        localcbb.sxn = locala.vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/cbb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */